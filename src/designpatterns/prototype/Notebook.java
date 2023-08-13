package designpatterns.prototype;

public class Notebook implements IPrototype<Notebook> {
    String name;
    int pages;
    String size;

    public Notebook() {};

    public  Notebook(Notebook n) {
        this.name = n.name;
        this.size = n.size;
        this.pages = n.pages;
    }

    public Notebook clone() {
        var notebook = new Notebook(this);
        notebook.pages = 200;
        return notebook;
    }
}
