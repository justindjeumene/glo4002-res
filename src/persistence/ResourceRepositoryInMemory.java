package persistence;

import entity.Resource;
import entity.ResourceRepository;

import java.util.LinkedList;
import java.util.Queue;

public class ResourceRepositoryInMemory implements ResourceRepository {
    private Queue<Resource> inventory = new LinkedList<>();

    @Override
    public void add(Resource resource) {
        inventory.add(resource);
    }

    @Override
    public Resource removeStale() {
        return inventory.remove();
    }

    public int getTotalElementInventory(){
        return inventory.size();
    }

    public void printAllData() {
       for(Resource resource : inventory){
           resource.printAllResources();
       }
    }
}
