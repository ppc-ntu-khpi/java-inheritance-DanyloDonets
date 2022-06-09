package domain;
/**
 * Клас, який описує рептилію
 * @author Danylo Donets
 * @version 1.0
 * @see Reptile#reptile
 */
public class Reptile extends Animal {
	/**
     *Об'єкт класу {@linkplain reptile}. Описує як тварина полює
     */
    public void hunt() {
        System.out.println("Animal is hunting");
    }
}
