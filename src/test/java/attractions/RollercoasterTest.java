package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 133, 100);
        visitor2 = new Visitor(18, 133, 100);
        visitor3 = new Visitor(11, 156, 100);
        visitor4 = new Visitor(18, 201, 100);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void deniesUnderAgeAndTooSmall() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void deniesOlderAndTooSmall() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void deniesUnderAgeAndTall() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void allowsOlder() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void hasStartingPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
    }
    @Test
    public void hasIncreasedPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor4),0.01);
    }
}