package headfirst.designpatterns.composite.test.menuiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MyMenuComponent{
    ArrayList<MyMenuComponent> components=new ArrayList<>();

    @Override
    public void add(MyMenuComponent menuComponent) {
        components.add(menuComponent);
    }

    String name;
    String description;

    public Menu(String name,String description) {
      this.name=name;
      this.description=description;
    }

    @Override
    public Iterator<MyMenuComponent> createIterator() {
        return new MyComponentIterator(components.iterator());
    }
}
