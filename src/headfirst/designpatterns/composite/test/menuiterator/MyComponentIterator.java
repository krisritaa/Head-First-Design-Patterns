package headfirst.designpatterns.composite.test.menuiterator;


import java.util.Iterator;
import java.util.Stack;

public class MyComponentIterator implements Iterator<MyMenuComponent> {
    Stack<Iterator<MyMenuComponent>> stack=new Stack<>();

    public MyComponentIterator(Iterator<MyMenuComponent> iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator<MyMenuComponent> iterator = stack.peek();
            if(iterator.hasNext()){
                return true;
            }else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MyMenuComponent next() {
      if(hasNext()){
          Iterator<MyMenuComponent> iterator = stack.peek();
          MyMenuComponent component = iterator.next();
          if(component instanceof Menu){
              stack.push(component.createIterator());
          }
          return component;
      }
      return null;
    }
}
