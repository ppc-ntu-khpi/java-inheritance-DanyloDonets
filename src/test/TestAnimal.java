package test;
import domain.Reptile;
/**
 * ����, ���� ����� �������� �� �������� �����������
 * @author Danylo Donets
 * @version 1.0
 * @see TestAnimal#testanimal
 */
import domain.Snake;

public class TestAnimal {
	/**
	 * ��������� ��� ����� ��������
	 * @param args � ��������� ������� ��������
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
