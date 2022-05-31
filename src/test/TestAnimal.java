package test;

import domain.Snake;

public class TestAnimal {

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
