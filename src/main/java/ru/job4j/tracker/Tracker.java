package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                result[count++] = items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return items[index];
            }
        }
        return null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        boolean result = index != -1;
        if (result) {
            items[index] = item;
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int length = size - index - 1;
            System.arraycopy(items, index + 1, items, index, length);
            items[size - 1] = null;
            size--;
        }
    }
}
