package Decorator_Pattern;

public class ListDecorator implements places {
    protected places decoratedList;

    public ListDecorator(places decoratedList) {
        this.decoratedList = decoratedList;
    }

    public void Name() {
        decoratedList.Name();
    }
}