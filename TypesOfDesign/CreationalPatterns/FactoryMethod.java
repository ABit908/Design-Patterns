package TypesOfDesign.CreationalPatterns;
import java.util.*;
class FactoryMethod{
    public interface Burger{
        void prepare();
    }
    public class PaneerBurger implements Burger{
        @Override
        public void prepare()
        {
            System.out.println("Paneer Burger is preparing....");
        }
    }
    public class VeggieBurger implements Burger{
        @Override
        public void prepare()
        {
            System.out.println("Veggie Burger is preparing....");
        }
    }
    public abstract class Restaurant{
        public Burger orderBurger(){
            Burger burger=createBurger();
            burger.prepare();
            return burger;
        }
        public abstract Burger createBurger();
    }
   public class PaneerBurgerResturant extends Restaurant{
        @Override
        public Burger createBurger()
        {
            return new PaneerBurger();
        }
   }
   public class VeggieBurgerResturant extends Restaurant{
    @Override
    public Burger createBurger()
    {
        return new VeggieBurger();
    }
}
public static void main(String[] args)
    {
        FactoryMethod factory=new FactoryMethod();
        Restaurant paneerRestro=factory.new PaneerBurgerResturant();
        Burger paneerBurger=paneerRestro.orderBurger();
        
        
        Restaurant veggieRestro=factory.new VeggieBurgerResturant();
        Burger veggieBurger=veggieRestro.orderBurger();
    }
}