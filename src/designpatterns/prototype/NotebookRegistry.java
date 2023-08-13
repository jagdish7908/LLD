package designpatterns.prototype;

import java.util.HashMap;

public class NotebookRegistry {
   private HashMap<String, Notebook> notebookMap = new HashMap<String, Notebook>();
   public void register(String key, Notebook n) {
       notebookMap.put(key, n);
   }

   public Notebook get(String key) {
       return notebookMap.get(key);
   }
}
