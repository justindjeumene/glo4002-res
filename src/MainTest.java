import entity.*;
import persistence.ResourceRepositoryInMemory;

public class MainTest {
    public static void main(String[] args) {
        ResourceType burger = new Burger(100, "qytBurger");
        ResourceType water = new Water(10, "qtyWater");
        ResourceType salad = new Salad(10, "qtySalad");

        Resource resource = new Resource();

        resource.addResourceType(burger);
        resource.addResourceType(water);
        resource.addResourceType(salad);

        ResourceRepositoryInMemory database = new ResourceRepositoryInMemory();
        database.add(resource);

        burger.consumeResource();
        salad.consumeResource();
        water.consumeResource();

        database.removeStale();
        database.add(resource);

        ResourceType secondBurger = new Burger(9, "qytBurger");
        ResourceType secondWater = new Water(3, "qtyWater");
        ResourceType secondSalad = new Salad(5, "qtySalad");

        resource.addResourceType(secondBurger);
        resource.addResourceType(secondWater);
        resource.addResourceType(secondSalad);

        database.add(resource);

        burger.consumeResource();
        salad.consumeResource();
        water.consumeResource();

        database.removeStale();

        System.out.println(burger.getDaysLeft());
        System.out.println(water.getDaysLeft());
        System.out.println(salad.getDaysLeft());

        System.out.println("The total element in the database is "+ database.getTotalElementInventory());
        database.printAllData();

    }
}
