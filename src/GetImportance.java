import java.util.LinkedList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/11/18.
 */
public class GetImportance {


        public int getImportance(List<Employee> employees, int id) {
            if(employees.size()==0) return 0;
            LinkedList<Employee> queue = new LinkedList<>();
       for(Employee e : employees){
                if(e.id == id){
                    queue.offer(e);
                }
            }
            int importance = 0;
            while(queue.size()>0){
                Employee emp = queue.poll();
                importance+= emp.importance;
                if(emp.subordinates.size()>0){
                    for(int ids : emp.subordinates){
                        for(Employee e : employees){
                            if(e.id == ids){
                                queue.offer(e);
                            }
                        }
                    }
                }
            }
            return importance;
        }

        public class Employee{
            // It's the unique id of each node;
            // unique id of this employee
            public int id;
            // the importance value of this employee
            public int importance;
            // the id of direct subordinates
            public List<Integer> subordinates;
        }

}
