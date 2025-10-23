import java.util.Arrays;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class KnapSack {
    static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items,(a,b)->Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
        double TotalValue = 0 ; 
        int currentWeight = 0 ; 
        for(Item item : items){
            if(currentWeight+item.weight<=capacity){
                currentWeight+=item.weight;
                TotalValue+=item.value;
            }else{
                int rem = capacity- currentWeight ; 
                TotalValue+=item.value*(double)rem/item.weight; 
                break; 
            }
        }return TotalValue ; 
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50 ; 
        System.out.println(getMaxValue(items, capacity));

    }
}
