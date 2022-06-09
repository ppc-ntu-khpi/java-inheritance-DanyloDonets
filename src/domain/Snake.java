package domain;
/**
 * Клас, який описує змію
 * @author Danylo Donets
 * @version 1.0
 * @see Snake#snake
 */
public class Snake extends Reptile {
	/**
     *@param kind – порода
     */
    private String kind;
    /**
     * Конструктор для отримання характеристик
     */
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
    /**
     *Об'єкт класу {@linkplain snake}. Описує як змія полює
     */
    @Override
    public void hunt() {
        System.out.println("Snake is hunting...");
    }
    /**
     *Об'єкт класу {@linkplain snake}. Отримує характеристики змії
     * @return рядок з характеристиками 
     */
    @Override
    public String toString() {
        return super.toString()+"\nkind: "+this.kind+"\n\nThis is Snake!"; //To change body of generated methods, choose Tools | Templates.
    }
    /**
     *Об'єкт класу {@linkplain snake}. Описує як змія розмовляє
     */
    @Override
    public void speak() {
    System.out.println("Ssssssssssssssssss");
    }
    /**
     *Об'єкт класу {@linkplain snake}. Описує чи можна приручити змію
     * @return можна приручити
     */
    @Override
    public boolean tame() {
        System.out.println("Snake can tame");
        return true;
    }
    /**
     *Об'єкт класу {@linkplain snake}. Описує як змія їсть
     */
    @Override
    public void eat() {
        System.out.println("Snake is eating...");
    }
    /**
     *Об'єкт класу {@linkplain snake}. Описує як змія повзає
     */
    public void crawl() {
        System.out.println("Snake is crawling...");
    }
    /**
     *Об'єкт класу {@linkplain snake}. Описує як змія зкручується
     */
    public void curlUp() {
        System.out.println("Snake is in curl!");
    }
}
