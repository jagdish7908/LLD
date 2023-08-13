package designpatterns.prototype;

import java.util.HashMap;

public class NotebookRegistry {
   private static HashMap<String, Notebook> notebookMap = new HashMap<String, Notebook>();
   public static void register(String key, Notebook n) {
       notebookMap.put(key, n);
   }

   public static Notebook get(String key) {
       return notebookMap.get(key);
   }
}
