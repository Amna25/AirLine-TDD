package person;

public enum Plane {
    JETS(300, 56000),
    PISTONAIRCRAF(600, 70000),
    AIRBUS(3, 50000);

    private final int planeCapacity;
    private final int totalWeight;

   Plane(int planeCapacity,int totalWeight){
       this.planeCapacity = planeCapacity;
       this.totalWeight = totalWeight;
   }

   public int getPlaneCapacity(){
       return planeCapacity;
   }

   public int getTotalWeight(){
       return totalWeight;
   }


}
