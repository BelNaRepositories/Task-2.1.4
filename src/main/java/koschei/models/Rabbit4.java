package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 dock;

    @Override
    public String toString() {
        return ", в зайце утка " + "" + dock.toString();
    }

    @Autowired
    public void setOcean(Duck5 dock) {
        this.dock = dock;
    }
}

