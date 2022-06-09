package domain;
/**
 * Клас, який описує тварину
 * @author Danylo Donets
 * @version 1.0
 * @see Animal#animal
 */
public class Animal {
	/**
	 * @param name – ім'я
	 * @param weith – вага
	 * @param type – тип\вид
	 */
    protected String name;

    protected int weith;

    protected String type;
    /**
     * Конструктор для присвоєння характеристик
     */
    public void animal(){ 
        name = "Vasya";
        weith = 100;
        type = "wild";
    }
    /**
     *Об'єкт класу {@linkplain animal}. Описує як тварина їсть
     */
    public void eat() {
        System.out.println("Animal is eating...");
    }
    /**
     *Об'єкт класу {@linkplain animal}. Описує чи можна тварину приручити
     */
    public boolean tame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     *Об'єкт класу {@linkplain animal}. Описує як тварина розмовляє
     */
    public void speak() {
        System.out.println("Animal is spiking...");
    }
    /**
     *Об'єкт класу {@linkplain animal}. Отримує характеристики тварини
     * @return рядок з характеристиками 
     */
    @Override
    public String toString() {
        return "Animal:" + "\nname=" + name + ", \nweith=" + weith + ", \ntype=" + type;
    }

    
}
