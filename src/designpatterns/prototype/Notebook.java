package designpatterns.prototype;

public class Notebook {
    String name;
    int pages;
    String size;

    public Notebook() {};

    public Notebook clone() {
        var notebook = new Notebook();
        var baseNotebook = NotebookRegistry.get("base");
        notebook.name = baseNotebook.name;
        notebook.size = baseNotebook.size;
        notebook.pages = baseNotebook.pages;
        return notebook;
    }
}
