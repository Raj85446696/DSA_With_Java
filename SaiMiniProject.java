import java.util.*;

public class SaiMiniProject {
    static class Transaction {
        String type;
        int amount;
        boolean active; 

        Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
            this.active = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int balance = initialBalance;
        int committedBalance = initialBalance;

        List<Transaction> transactions = new ArrayList<>();
        List<Integer> commits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "read":
                    System.out.println(balance);
                    break;

                case "credit":
                    int creditAmt = Integer.parseInt(parts[1]);
                    balance += creditAmt;
                    transactions.add(new Transaction("credit", creditAmt));
                    break;

                case "debit":
                    int debitAmt = Integer.parseInt(parts[1]);
                    balance -= debitAmt;
                    transactions.add(new Transaction("debit", debitAmt));
                    break;

                case "abort":
                    int abortIdx = Integer.parseInt(parts[1]) - 1;
                    if (abortIdx >= 0 && abortIdx < transactions.size()) {
                        Transaction t = transactions.get(abortIdx);
                        if (t.active) {
                            // undo effect
                            if (t.type.equals("credit")) balance -= t.amount;
                            else balance += t.amount;
                            t.active = false;
                        }
                    }
                    break;

                case "rollback":
                    int rollbackIdx = Integer.parseInt(parts[1]) - 1;
                    if (rollbackIdx >= 0 && rollbackIdx < commits.size()) {
                        balance = commits.get(rollbackIdx);
                        transactions.clear(); // discard all uncommitted transactions
                    }
                    break;

                case "commit":
                    committedBalance = balance;
                    commits.add(committedBalance);
                    transactions.clear(); // all transactions finalized
                    break;
            }
        }

        sc.close();
    }
}
