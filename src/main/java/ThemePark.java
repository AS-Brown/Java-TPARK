import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
private ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark(ArrayList<IReviewed> attractionsAndStalls) {
        this.attractionsAndStalls = attractionsAndStalls;
    }

    public ArrayList<IReviewed> getAttractionsAndStalls() {
        return attractionsAndStalls;
    }


    public void visit(Visitor visitor, Attraction attraction) {
        attraction.addVisitCount();
        visitor.addToArray(attraction);
    }
}
