import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.LinkedList;

public class FleetTests {
  // constructor is tested inherently in other tests
  @Test
  public void testAddingInvalidType(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,4,1.00f);
    assertEquals(false, fleet.addCar(testCar));
  }
  @Test
  public void testAddingInvalidType2(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,0,1.00f);
    assertEquals(false, fleet.addCar(testCar));
  }
  @Test
  public void testAddingGasCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,1,1.00f);
    assertEquals(true, fleet.addCar(testCar));
  }
  @Test
  public void testAddingEVCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,2,1.00f);
    assertEquals(true, fleet.addCar(testCar));
  }
  @Test
  public void testAddingHybridCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,3,1.00f);
    assertEquals(true, fleet.addCar(testCar));
  }
  @Test
  public void testRequestingGasCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,1,1.00f);
    fleet.addCar(testCar);
    Queue<Integer> carsToReceive = new Queue<Integer>();
    carsToReceive.enqueue(1);
    LinkedList<Car> returnedCar = fleet.processRequests(carsToReceive);
    assertEquals(true, returnedCar.poll().getPowerSource()==1);
  }
  @Test
  public void testRequestingEVCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,2,1.00f);
    fleet.addCar(testCar);
    Queue<Integer> carsToReceive = new Queue<Integer>();
    carsToReceive.enqueue(2);
    LinkedList<Car> returnedCar = fleet.processRequests(carsToReceive);
    assertEquals(true, returnedCar.poll().getPowerSource()==2);
  }
  @Test
  public void testRequestingHybridCar(){
    CarFleet fleet = new CarFleet();
    Car testCar = new Car(1,3,1.00f);
    fleet.addCar(testCar);
    Queue<Integer> carsToReceive = new Queue<Integer>();
    carsToReceive.enqueue(3);
    LinkedList<Car> returnedCar = fleet.processRequests(carsToReceive);
    assertEquals(true, returnedCar.poll().getPowerSource()==3);
  }
  @Test
  public void testRequestingFromEmptyFleet(){
    CarFleet fleet = new CarFleet();
    Queue<Integer> carsToReceive = new Queue<Integer>();
    carsToReceive.enqueue(1);
    carsToReceive.enqueue(2);
    carsToReceive.enqueue(3);
    LinkedList<Car> returnedCars = fleet.processRequests(carsToReceive);
    assertEquals(true, returnedCars.size()==3);
    assertEquals(true, returnedCars.poll().getId()==0);
    assertEquals(true, returnedCars.poll().getId()==0);
    assertEquals(true, returnedCars.poll().getId()==0);
  }
  @Test
  public void testRequestingMultipleTypes(){
    CarFleet fleet = new CarFleet();
    fleet.addCar(new Car(4,1,1.00f));
    fleet.addCar(new Car(5,2,1.00f));
    fleet.addCar(new Car(6,3,1.00f));
    
    Queue<Integer> carsToReceive = new Queue<Integer>();
    carsToReceive.enqueue(3);
    carsToReceive.enqueue(2);
    carsToReceive.enqueue(1);

    LinkedList<Car> returnedCars = fleet.processRequests(carsToReceive);
    LinkedList<Car> expectedCars = new LinkedList<Car>();
    expectedCars.add(new Car(6,3,1.00f));
    expectedCars.add(new Car(5,2,1.00f));
    expectedCars.add(new Car(4,1,1.00f));
    assertEquals(true, returnedCars.size()==3);
    assertEquals(true, returnedCars.poll().getPowerSource() == expectedCars.poll().getPowerSource());
    assertEquals(true, returnedCars.poll().getPowerSource() == expectedCars.poll().getPowerSource());
    assertEquals(true, returnedCars.poll().getPowerSource() == expectedCars.poll().getPowerSource());
  } 
}
