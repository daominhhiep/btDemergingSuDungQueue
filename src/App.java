import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    private static ArrayList createNewList(Queue<Employee> maleQueue, Queue<Employee> femaleQueue) {
        ArrayList newListPerson = new ArrayList();
        for (Employee p : femaleQueue) {
            newListPerson.add(p);
        }
        for (Employee p : maleQueue) {
            newListPerson.add(p);
        }
        return newListPerson;
    }

    private static void processOldList(Queue<Employee> maleQueue, Queue<Employee> femaleQueue, ArrayList listPerson) {
        for (int i = 0; i < listPerson.size(); i++) {
            Employee holder = (Employee) listPerson.get(i);
            if (holder.getGender().equals("male")) {
                maleQueue.add(holder);
            } else femaleQueue.add(holder);
        }
    }

    private static void showList(ArrayList listPerson) {
        System.out.println("===LIST===");
        System.out.printf("%-20s%-7s%-5S\n", "Name", "Gender", "DOB");
        for (int i = 0; i < listPerson.size(); i++) {
            Employee holder = (Employee) listPerson.get(i);
            holder.display();
        }
    }

    private static ArrayList inputData() {
        Employee p1 = new Employee("An", "male", "1991");
        Employee p2 = new Employee("Bao", "female", "1992");
        Employee p3 = new Employee("Trung", "male", "1993");
        Employee p4 = new Employee("Minh", "female", "1994");
        Employee p5 = new Employee("Lien", "male", "1995");
        ArrayList listPerson = new ArrayList();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        return listPerson;
    }
    public static void main(String[] args) {
        Queue<Employee> maleQueue = new LinkedList<>();
        Queue<Employee> femaleQueue = new LinkedList<>();
        ArrayList listPerson = inputData();
        showList(listPerson);
        processOldList(maleQueue, femaleQueue, listPerson);
        ArrayList newListPerson = createNewList(maleQueue, femaleQueue);
        showList(newListPerson);
    }
}