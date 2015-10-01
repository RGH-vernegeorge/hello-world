package helloworld.controller;

/**
 * Created by Verne.George on 10/1/2015.
 */
public class Greet {
    private String greet;

    public Greet(String greet) {
        this.greet = greet;
    }

    public String getGreet() {

        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }
}
