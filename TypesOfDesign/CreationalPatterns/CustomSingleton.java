package TypesOfDesign.CreationalPatterns;
import java.util.*;
public class CustomSingleton{
        public static class Singleton{
                private static volatile Singleton instance;
                private String data;
                private Singleton(String data)
                {
                    this.data=data;
                }
                public static Singleton getInstance(String data)
                {
                    if(instance==null)
                    {
                        synchronized(Singleton.class)
                        {
                            if(instance==null)
                            {
                                instance= new Singleton(data);
                            }
                        }
                    }
                    return instance;
                }

                public String getData()
                {
                    return data;
                }

        }

    public static void main(String[] args)
    {
        Singleton singleton1 = ¬Singleton.getInstance("First Instance Data");
        System.out.println("Data from singleton1: " + singleton1.getData());

        // Get the singleton instance again with different data
        CustomSingleton.Singleton singleton2 = CustomSingleton.Singleton.getInstance("Second Instance Data");
        System.out.println("Data from singleton2: " + singleton2.getData());

        // Check if both singleton1 and singleton2 refer to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both singleton1 and singleton2 refer to the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}