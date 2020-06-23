package me.lazarotti;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

@ApplicationScoped
public class SomeClass { 
 
    public void doSomething(Boolean boo) {
        System.out.println("printing Boo " + boo);
    }

    public void doSomethingInt(Integer sInt) {
        System.out.println("printing sInt + 2 = " + (sInt + 2));
    }

    public void doSomethingFloat(Float sFloat) {
        System.out.println("printing sFloat + 1.23 " + (sFloat + 1.23));
    }
 
}
 