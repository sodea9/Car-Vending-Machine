public class Car {
  private int id;
  private int powerSource; // 1=gas, 2=electric, 3=hybrid
  private float pricePerDay;

  Car(int id, int powerSource, float pricePerDay){
    this.id = id;
    this.powerSource = powerSource;
    this.pricePerDay = pricePerDay;
  }
  Car(){
    this.id = 0;
    this.powerSource = 0;
    this.pricePerDay = 0.00f;
  }

  public int getId(){
    return this.id;
  }
  public void setId(int newId){
    this.id = newId;
  }

  public int getPowerSource(){
    return this.powerSource;
  }
  public void setPowerSource(int newPS){
    this.powerSource = newPS;
  }

  public float getPricePerDay(){
    return this.pricePerDay;
  }
  public void setPricePerDay(float newPPD){
    this.pricePerDay = newPPD;
  }
}
