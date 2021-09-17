package resources.infrastructure.persistence;


import resources.entities.Resources;
import resources.entities.ResourcesRepository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ResourcesRepositoryInMemory implements ResourcesRepository {

    private final Map<Integer, Resources> freshResourcesList = new HashMap<Integer, Resources>();
    private final Queue<Resources> inventory = new LinkedList<>();

    private Resources Burger;

    public void add(Resources resource) {
        inventory.add(resource);
    }

    public Resources removeStale() {
        return inventory.remove();
    }

    public int getTotalElementInventory() {
        return inventory.size();
    }

    @Override
    public void save(int quantity, Resources resources) {
        freshResourcesList.put(quantity,resources);
    }
}

