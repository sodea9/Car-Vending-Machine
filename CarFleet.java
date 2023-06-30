import java.util.LinkedList;

public class CarFleet {
  private Queue<Car> gasQueue;
  private Queue<Car> evQueue;
  private Queue<Car> hybridQueue;

  CarFleet(){
    gasQueue = new Queue<Car>();
    evQueue = new Queue<Car>();
    hybridQueue = new Queue<Car>();
  }

  public boolean addCar(Car newCar){
    switch(newCar.getPowerSource()){
      case 1:
        gasQueue.enqueue(newCar);
        return true;
      case 2:
        evQueue.enqueue(newCar);
        return true;
      case 3:
        hybridQueue.enqueue(newCar);
        return true;
      default:
        return false;
    }
  }

  public LinkedList<Car> processRequests(Queue<Integer> carsRequested){
    LinkedList<Car> carsToReturn = new LinkedList<Car>();
    while (!carsRequested.isEmpty()){
      System.out.println(carsRequested.peek());
      switch(carsRequested.dequeue()){
        case 1:
          if (gasQueue.isEmpty()){
            carsToReturn.add(new Car());
          }else{
          carsToReturn.add(gasQueue.dequeue());
          }
          break;
        case 2:
          if (evQueue.isEmpty()){
            carsToReturn.add(new Car());
          }else{
          carsToReturn.add(evQueue.dequeue());
          }
          break;
        case 3:
          if (hybridQueue.isEmpty()){
            carsToReturn.add(new Car());
          }else{
            carsToReturn.add(hybridQueue.dequeue());
          }
          break;
        default:
          carsToReturn.add(new Car());
      }
    }
    return carsToReturn;
  }
}
