package designpatterns.prototype;

public class Notebook {
    String name;
    int pages;
    String size;

    public Notebook() {};

    public Notebook clone() {
        var notebook = new Notebook();
        notebook.name = this.name;
        notebook.size = this.size;
        notebook.pages = this.pages;
        return notebook;
    }
}
