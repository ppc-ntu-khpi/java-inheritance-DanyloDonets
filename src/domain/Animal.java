package domain;
/**
 * ����, ���� ����� �������
 * @author Danylo Donets
 * @version 1.0
 * @see Animal#animal
 */
public class Animal {
	/**
	 * @param name � ��'�
	 * @param weith � ����
	 * @param type � ���\���
	 */
    protected String name;

    protected int weith;

    protected String type;
    /**
     * ����������� ��� ��������� �������������
     */
    public void animal(){ 
        name = "Vasya";
        weith = 100;
        type = "wild";
    }
    /**
     *��'��� ����� {@linkplain animal}. ����� �� ������� ����
     */
    public void eat() {
        System.out.println("Animal is eating...");
    }
    /**
     *��'��� ����� {@linkplain animal}. ����� �� ����� ������� ���������
     */
    public boolean tame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     *��'��� ����� {@linkplain animal}. ����� �� ������� ���������
     */
    public void speak() {
        System.out.println("Animal is spiking...");
    }
    /**
     *��'��� ����� {@linkplain animal}. ������ �������������� �������
     * @return ����� � ���������������� 
     */
    @Override
    public String toString() {
        return "Animal:" + "\nname=" + name + ", \nweith=" + weith + ", \ntype=" + type;
    }

    
}
