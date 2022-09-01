import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeoTree {

    private HashMap<Integer, Person> tree = new HashMap<>();
    private static Integer  countId = 0;
    public HashMap<Integer, Person> getTree() {
        return tree;
    }

    /**
     * Добавления В список семью и увелечения счетчика ид
     * @param hum
     */
    public void appned( Person hum) {
        tree.put(countId, hum);
        countId++;
    }

    //    private ArrayList<Node> tree = new ArrayList<>();
//
//    public ArrayList<Node> getTree() {
//        return tree;
//    }
//
//    public void append(Person parent, Person children) {
//        tree.add(new Node(parent, Relationship.parent, children));
//        tree.add(new Node(children, Relationship.children, parent));
//        tree.add(new Node(children, Relationship.children, parent));
//    }

}
