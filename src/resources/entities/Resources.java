package resources.entities;

import java.util.HashMap;
import java.util.Map;

public class Resources {

    private final Map<Resources, Integer> freshResourcesList = new HashMap<>();
    private final Map<Resources, Integer> expiredResourcesList = new HashMap<>();
    private final Map<Resources, Integer> consumedResourcesList = new HashMap<>();

    public void addFreshResources(int quantityResources, Resources resources) {
        if (freshResourcesList.get(resources) == null) {
            freshResourcesList.put(resources, quantityResources);
        } else {
            int gain = freshResourcesList.get(resources) + quantityResources;
            freshResourcesList.put(resources, gain);
        }
    }

    public void removeFreshResourcesToExpiredResources(int quantityResources, Resources resources) {
        int expired = freshResourcesList.get(resources) - quantityResources;
        freshResourcesList.put(resources, expired);

        if (expiredResourcesList.get(resources) == null) {
            expiredResourcesList.put(resources, quantityResources);
        } else {
            int gain = expiredResourcesList.get(resources) + quantityResources;
            expiredResourcesList.put(resources, gain);
        }

    }

    public void removeFreshResourcesToConsumedResources(int quantityResources, Resources resources) {
        int consumed = freshResourcesList.get(resources) - quantityResources;
        freshResourcesList.put(resources, consumed);

        if (consumedResourcesList.get(resources) == null) {
            consumedResourcesList.put(resources, quantityResources);
        } else {
            int gain = consumedResourcesList.get(resources) + quantityResources;
            consumedResourcesList.put(resources, gain);
        }
    }

    public Map<Resources, Integer> getExpiredResourcesList() {
        return expiredResourcesList;
    }

    public Map<Resources, Integer> getFreshResourcesList() {
        return freshResourcesList;
    }

    public Map<Resources, Integer> getConsumedResourcesList() {
        return consumedResourcesList;
    }

}
