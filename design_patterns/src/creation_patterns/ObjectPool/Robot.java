package creation_patterns.ObjectPool;

import java.util.List;

public class Robot {
    private int ID;
    private List<String> features;
    private Components components;

    public Robot(int ID, List<String> features, Components components) {
        this.ID = ID;
        this.features = features;
        this.components = components;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }
}
