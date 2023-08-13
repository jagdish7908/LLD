package designpatterns.prototype;

public class Notebook {
    String name;
    int pages;
    String size;

    public Notebook() {};

    public Notebook(Notebook n) {
        this.name = n.name;
        this.size = n.size;
        this.pages = n.pages;
    }
}
