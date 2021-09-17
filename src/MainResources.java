import resources.entities.*;
import resources.infrastructure.persistence.ResourcesRepositoryInMemory;

import java.util.Map;


public class MainResources {
    public static void main(String[] args) {
        Burger burger = new Burger();
        Salad salad = new Salad();
        Water water = new Water();

        Resources resource = new Resources();

        resource.addFreshResources(0, burger);
        resource.addFreshResources(0, salad);
        resource.addFreshResources(0, water);

        resource.addFreshResources(100, burger);
        resource.addFreshResources(200, salad);
        resource.addFreshResources(10000, water);

        resource.addFreshResources(50, burger);
        resource.addFreshResources(50, salad);
        resource.addFreshResources(5500, water);

        resource.removeFreshResourcesToExpiredResources(50, burger);
        resource.removeFreshResourcesToExpiredResources(110, salad);
        resource.removeFreshResourcesToExpiredResources(500, water);

        resource.removeFreshResourcesToExpiredResources(50, burger);

        resource.removeFreshResourcesToConsumedResources(20, burger);
        resource.removeFreshResourcesToConsumedResources(120, salad);
        resource.removeFreshResourcesToConsumedResources(5000, water);

        resource.removeFreshResourcesToConsumedResources(29, burger);

        ResourcesRepositoryInMemory database = new ResourcesRepositoryInMemory();
        database.add(resource);

        burger.expiringResource();
        salad.expiringResource();
        water.expiringResource();

        database.removeStale();
        database.add(resource);

        System.out.println("----fresh----");
        for (Map.Entry<Resources, Integer> entry : resource.getFreshResourcesList().entrySet()) {
            System.out.println("qty"+ entry.getKey().getClass().getName() + " : " + entry.getValue().toString());
        }
        System.out.println("----expired----");
        for (Map.Entry<Resources, Integer> entry : resource.getExpiredResourcesList().entrySet()) {
            System.out.println("qty"+ entry.getKey().getClass().getName() + " : " + entry.getValue().toString());
        }
        System.out.println("----consumed----");
        for (Map.Entry<Resources, Integer> entry : resource.getConsumedResourcesList().entrySet()) {
            System.out.println("qty"+ entry.getKey().getClass().getName() + " : " + entry.getValue().toString());
        }

    }
}
