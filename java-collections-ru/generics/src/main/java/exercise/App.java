package exercise;

import javax.swing.*;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> resultingList = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            boolean needToAdd = false;
            for (Map.Entry<String, String> findWhereElement : where.entrySet()) {
                if (findWhereElement.getValue().equals(books.get(i).get(findWhereElement.getKey()))) {
                    needToAdd = true;
                } else {
                    needToAdd = false;
                    break;
                }
            }
            if (needToAdd) {
                resultingList.add(books.get(i));
            }
        }
        return resultingList;
    }
}
//END
