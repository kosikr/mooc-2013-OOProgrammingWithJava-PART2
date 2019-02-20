
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class RingingCentre {

    private Map<Bird, List<String>> observationPlaces = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {
        if (!observationPlaces.keySet().contains(bird)) {
            observationPlaces.put(bird, new ArrayList<String>());
        }
        List<String> singlePlace = observationPlaces.get(bird);
        singlePlace.add(place);

    }

    public void observations(Bird bird) {
        if (observationPlaces.get(bird) == null) {
            System.out.println(bird + " observations: " + 0);
            return;
        }
        System.out.println(bird.toString() + " observations: " + observationPlaces.get(bird).size());
        arrayToString(observationPlaces.get(bird));
    }

    public void arrayToString(List<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

}
