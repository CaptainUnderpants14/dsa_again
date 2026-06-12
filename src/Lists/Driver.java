package Lists;

public class Driver {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.addElement(5);
        newList.addElement(7);
        newList.addElement(10);
        newList.addElement(15);
        newList.addElement(34);
        newList.addElement(0);
        newList.addElement(55);
        newList.delByValue(0);
        newList.printValues();

    }
}

