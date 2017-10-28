package headfirst.designpatterns.composite.test.menuiterator;

import java.util.Iterator;

public class Waitress {
    headfirst.designpatterns.composite.test.menuiterator.MyMenuComponent
            allMenu;

    public Waitress(headfirst.designpatterns.composite.test.menuiterator.MyMenuComponent allMenu) {
        this.allMenu = allMenu;
    }
    void printVegetableMenu(){
        Iterator<headfirst.designpatterns.composite.test.menuiterator.MyMenuComponent> iterator = allMenu.createIterator();
        while (iterator.hasNext()){
            headfirst.designpatterns.composite.test.menuiterator.MyMenuComponent component = iterator.next();
            try {
                component.print();
            }catch (UnsupportedOperationException e){
                System.out.println("menu throw exception");
            }
        }
    }
}
