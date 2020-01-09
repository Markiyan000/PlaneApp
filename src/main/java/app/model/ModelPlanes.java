package app.model;

import app.model.entities.Plane;

import java.util.ArrayList;
import java.util.List;

public class ModelPlanes {
    private static List<Plane> planes = new ArrayList<>();

    public static List<Plane> getPlanes(){
        return planes;
    }
}
