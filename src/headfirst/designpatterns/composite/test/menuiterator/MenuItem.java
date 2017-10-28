package headfirst.designpatterns.composite.test.menuiterator;

import java.util.Iterator;

public class MenuItem extends MyMenuComponent {
    String name;
    String decription;
    boolean vege;
    double price;

    public MenuItem(String name, String decription, boolean vege, double price) {
        this.name = name;
        this.decription = decription;
        this.vege = vege;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name+decription+vege+price);
    }

    @Override
    public Iterator<MyMenuComponent> createIterator() {
        return null;
    }
}
