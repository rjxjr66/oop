package test;

import java.util.HashMap;

public class ComponentBase {
    HashMap<String, ComponentBase> components = new HashMap<String, ComponentBase>();

    public void addComponent(String key, ComponentBase value) {
        components.put(key, value);
    }

    public ComponentBase getComponent(String key) throws Exception {
        if (!components.containsKey(key)) {
            throw new Exception("키가 없음");
        }

        return components.get(key);
    }
}