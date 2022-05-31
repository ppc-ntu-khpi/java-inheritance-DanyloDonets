package test;
import domain.Reptile;
/**
 * Клас, який тестує програму за заданими параметрами
 * @author Danylo Donets
 * @version 1.0
 * @see TestAnimal#testanimal
 */
import domain.Snake;

public class TestAnimal {
	/**
	 * Параметри для тесту програми
	 * @param args – параметри запуску програми
	 */
    public static void main(String[] args) {
        Snake snake = new Snake("Mihail");
        System.out.println(snake);
        snake.crawl();
        snake.hunt();
        snake.eat();
        snake.curlUp();
        snake.speak();
    }
}
