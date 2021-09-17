package resourcesJustin.entity;

public interface ResourceRepository {
    void add(Resource resource);

    Resource removeStale();
}
