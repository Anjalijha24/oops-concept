package inheritanceEmployee;

public class InheritanceExample {
    public static void main(String[] args) {
        Students st = new Students();
        Students.Age age = st.new Age();
        Students.Contact_Info contact_info = st.new Contact_Info();
    }
}

package inheritanceEmployee;
import java.util.*;

public class Students {
    Scanner sc = new Scanner(System.in);

    Students() {
        System.out.println("Enter the name of the students");
        String name=sc.nextLine();
    }

    class Age extends Students {
        Age() {
            System.out.println("Enter the age of students");
            int age=sc.nextInt();
        }
    }

    class Contact_Info extends Students {
        Contact_Info() {
            System.out.println("Enter the contact no of students");
            double contactno=sc.nextDouble();
        }
    }
}
