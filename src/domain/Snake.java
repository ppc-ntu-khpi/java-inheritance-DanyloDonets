package domain;

public class Snake extends Reptile {

    private String kind;

    public Snake(String name, int weith, String type, String kind) {
        this.name = name;
        this.weith = weith;
        this.type = type;
        this.kind = kind;
    }
    
    public Snake(){
        this("Anatoliy",20,"wild","Anaconda");
    }
    public Snake(String name){
        this(name,20,"wild","Anaconda");
    }

    @Override
    public void hunt() {
        System.out.println("Snake is hunting...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind: "+this.kind+"\n\nThis is Snake!"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
    System.out.println("Ssssssssssssssssss");
    }

    @Override
    public boolean tame() {
        System.out.println("Snake can tame");
        return true;
    }

    @Override
    public void eat() {
        System.out.println("Snake is eating...");
    }

    public void crawl() {
        System.out.println("Snake is crawling...");
    }

    public void curlUp() {
        System.out.println("Snake is in curl!");
    }
}
