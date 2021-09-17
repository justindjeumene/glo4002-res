package resourcesJustin.entity;

public interface ResourceType {
    int getDaysLeft();

    String getResourceName();

    int getResourceQty();

    void consumeResource();
}
