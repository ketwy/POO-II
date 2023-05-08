import java.util.*;

public class Menu extends MenuComponent
{

   ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    
   public Menu(){
       
   }
    
   public void add(MenuComponent menuComponent){
       menuComponents.add(menuComponent);
   }
    
   /*
   public void remove(MenuComponent menuComponent){
       menuComponents.remove(menuComponent);
   }
   */
    
   public MenuComponent getChild(int i){
        return menuComponents.get(i);
   }
          
   public String toString(){
       String res = "\n"+getName()+",  "+getDescription()+(isVegetarian()?"(V)":"")+"---------------------";
       for(MenuComponent m:menuComponents){
           res += m.toString();
       }
       return res;
   }
    
   public void print(){
       System.out.print("\n"+getName()+ (isVegetarian() ? " (V)": "") );
       System.out.print(",  "+getDescription());
       System.out.print("---------------------");
       System.out.print("o valor de todo o menu � "+getPrice());
       for(MenuComponent m:menuComponents){
           m.print();
       }
   }
   
   public boolean isVegetarian(){
       boolean veg = true;
       for(MenuComponent m:menuComponents){
           veg = veg && m.isVegetarian();
       }
       return veg;
   }
   
   public double getPrice(){
       double conta = 0;
        for(MenuComponent m:menuComponents){
           conta+=m.getPrice();
       }
        return conta;
    }
      
}
