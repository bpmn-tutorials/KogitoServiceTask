package me.lazarotti;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

@ApplicationScoped
public class SomeClass { 
 
    public void doSomething(Boolean boo) {
        System.out.println("printing Boo "+ boo);
    }
 
}
 