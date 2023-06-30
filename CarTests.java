import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTests {
  @Test
  public void testConstructor1(){
    Car car = new Car();
    assertEquals(true, car.getId()==0);
    assertEquals(true, car.getPowerSource()==0);
    assertEquals(true, car.getPricePerDay()==0.00f);
  }
  @Test
  public void testConstructor2(){
    Car car2 = new Car(1, 2, 1.00f);
    assertEquals(true, car2.getId()==1);
    assertEquals(true, car2.getPowerSource()==2);
    assertEquals(true, car2.getPricePerDay()==1.00f);
  }
  @Test
  public void testGetID(){
    Car car = new Car(1, 2, 1.00f);
    assertEquals(true, car.getId()==1);
  }
  @Test
  public void testSetID(){
    Car car = new Car();
    car.setId(5);
    assertEquals(true, car.getId()==5);
  }
  @Test
  public void testGetPowerSource(){
    Car car = new Car(1, 2, 1.00f);
    assertEquals(true, car.getPowerSource()==2);
  }
  @Test
  public void testSetPowerSource(){
    Car car = new Car();
    car.setPowerSource(3);
    assertEquals(true, car.getPowerSource()==3);
  }
  @Test
  public void testGetPricePerDay(){
    Car car = new Car(1, 2, 1.00f);
    assertEquals(true, car.getPricePerDay()==1.00f);
  }
  @Test
  public void testSetPricePerDay(){
    Car car = new Car();
    car.setPricePerDay(2.00f);
    assertEquals(true, car.getPricePerDay()==2.00f);
  }
}
