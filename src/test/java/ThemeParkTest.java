import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private ThemePark themePark;
    private ArrayList<IReviewed> attractions;
    private Visitor visitor;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 5);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        attractions = new ArrayList<>();
        themePark = new ThemePark(attractions);
        attractions.add(candyflossStall);
        attractions.add(iceCreamStall);
        attractions.add(tobaccoStall);
        attractions.add(dodgems);
        attractions.add(park);
        attractions.add(playground);
        attractions.add(rollerCoaster);
        visitor = new Visitor(14, 122, 100);
    }

    @Test
    public void themeParkHasAttractions(){
        assertEquals(7, attractions.size());
    }
    @Test
    public void gainList(){
        assertEquals(attractions, themePark.getAttractionsAndStalls());
    }
    @Test
    public void canVisitAndIncreaseCount(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
    }
    @Test
    public void canVisitAndIncreaseAttractions(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }


}
