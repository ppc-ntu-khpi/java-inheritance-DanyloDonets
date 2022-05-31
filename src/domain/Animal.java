package domain;

public class Animal {

    protected String name;

    protected int weith;

    protected String type;

    public void animal(){ 
        name = "Vasya";
        weith = 100;
        type = "wild";
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public boolean tame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void speak() {
        System.out.println("Animal is spiking...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nname=" + name + ", \nweith=" + weith + ", \ntype=" + type;
    }

    
}
