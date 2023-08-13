package designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.name = "Classmate";
        notebook.size = "A4";
        notebook.pages = 180;

        Notebook notebookCopy = new Notebook(notebook);

        System.out.println("notebook = " + notebook);
        System.out.println("notebook.name = " + notebook.name);
        System.out.println("notebook.size = " + notebook.size);
        System.out.println("notebook.pages = " + notebook.pages);

        System.out.println("notebook_copy = " + notebookCopy);
        System.out.println("notebook_copy.name = " + notebookCopy.name);
        System.out.println("notebook_copy.size = " + notebookCopy.size);
        System.out.println("notebook_copy.pages = " + notebookCopy.pages);
    }
}
