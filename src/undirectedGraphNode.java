import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 10/17/18.
 */
public class UndirectedGraphNode {

     int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }

}
