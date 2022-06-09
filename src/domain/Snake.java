package domain;
/**
 * ����, ���� ����� ���
 * @author Danylo Donets
 * @version 1.0
 * @see Snake#snake
 */
public class Snake extends Reptile {
	/**
     *@param kind � ������
     */
    private String kind;
    /**
     * ����������� ��� ��������� �������������
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
     *��'��� ����� {@linkplain snake}. ����� �� ��� �����
     */
    @Override
    public void hunt() {
        System.out.println("Snake is hunting...");
    }
    /**
     *��'��� ����� {@linkplain snake}. ������ �������������� �쳿
     * @return ����� � ���������������� 
     */
    @Override
    public String toString() {
        return super.toString()+"\nkind: "+this.kind+"\n\nThis is Snake!"; //To change body of generated methods, choose Tools | Templates.
    }
    /**
     *��'��� ����� {@linkplain snake}. ����� �� ��� ���������
     */
    @Override
    public void speak() {
    System.out.println("Ssssssssssssssssss");
    }
    /**
     *��'��� ����� {@linkplain snake}. ����� �� ����� ��������� ���
     * @return ����� ���������
     */
    @Override
    public boolean tame() {
        System.out.println("Snake can tame");
        return true;
    }
    /**
     *��'��� ����� {@linkplain snake}. ����� �� ��� ����
     */
    @Override
    public void eat() {
        System.out.println("Snake is eating...");
    }
    /**
     *��'��� ����� {@linkplain snake}. ����� �� ��� �����
     */
    public void crawl() {
        System.out.println("Snake is crawling...");
    }
    /**
     *��'��� ����� {@linkplain snake}. ����� �� ��� ����������
     */
    public void curlUp() {
        System.out.println("Snake is in curl!");
    }
}
