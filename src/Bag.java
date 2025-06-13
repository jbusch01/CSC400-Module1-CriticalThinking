import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private Map<T, Integer> items;
    
    public Bag() {
        items = new HashMap<>();
    }

    // Adds an item to the bag
    public void add(T item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
    }

    // Removes one occurrence off the item, if it exists
    public void remove(T item) {
        if (items.containsKey(item)) {
            int count = items.get(item);
            if (count > 1) {
                items.put(item, count - 1);
            } else {
                items.remove(item);
            }
        }
    }

    // Checks if the item exists in the bag
    public boolean contains(T item) {
        return items.containsKey(item);
    }

    public int count(T item) {
        return items.getOrDefault(item, 0);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<T, Integer> entry : items.entrySet())  {
            result.append(entry.getKey()).append(" x").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}