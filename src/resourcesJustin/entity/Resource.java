package resourcesJustin.entity;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    private final List<ResourceType> resourceTypeList = new ArrayList<>();

    public void addResourceType(ResourceType resourceType) {
        resourceTypeList.add(resourceType);
    }

    public void printAllResources() {
        for (ResourceType resourceType : resourceTypeList) {
            System.out.println("----------------------------------------");
            System.out.println("Type : " + resourceType.getResourceName() + "," + " Value: " + resourceType.getResourceQty());
        }
    }
}
