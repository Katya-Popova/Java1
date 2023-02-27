import java.util.ArrayList;
import java.util.List;

public class Notebook {
     private int art;
     private int ram; 
     private int railwayVolume;
     private String operatingSystem;
     private String model;
     private String color; 

     public Notebook (int art, int ram, int railwayVolume,String operatingSystem,String model, String color){
          this.art=art;
          this.ram=ram;
          this.railwayVolume=railwayVolume;
          this.operatingSystem=operatingSystem;
          this.model=model;
          this.color=color;
     }

     public static List<String> propertiesForFilter(){
          List<String> list=new ArrayList<>();
          list.add("art");
          list.add("ram");
          list.add("railwayVolume");
          list.add("operatingSystem");
          list.add("model");
          list.add("color");

          return list;
     }

     @Override
     public String toString() 
     {
         return "Ноутбук: (" + art + "): " +
                 "Опретивная память:" + ram +
                 ", Система: " + operatingSystem + '\'' +
                 ", Объем ЖД: " + railwayVolume +
                 ", Модель: " + model +", Цвет: "+ color;
     }

     public int getArt() {
          return art;
     }

     public void setArt(int art) {
          this.art = art;
     }

     public int getRam() {
          return ram;
     }

     public void setRam(int ram) {
          this.ram = ram;
     }

     public int getRailwayVolume() {
          return railwayVolume;
     }

     public void setRailwayVolume(int railwayVolume) {
          this.railwayVolume = railwayVolume;
     }

     public String getOperatingSystem() {
          return operatingSystem;
     }

     public void setOperatingSystem(String operatingSystem) {
          this.operatingSystem = operatingSystem;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }


     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     


}
