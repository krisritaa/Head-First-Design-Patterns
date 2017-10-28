package headfirst.designpatterns.composite.test.menuiterator;

import headfirst.designpatterns.composite.menuiterator.MenuComponent;

import java.util.Iterator;

public abstract class MyMenuComponent {
    public void add(MyMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MyMenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MyMenuComponent> createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }

}
