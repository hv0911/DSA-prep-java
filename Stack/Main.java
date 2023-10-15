package Stack;

import Stack.Basics.DynamicStack;
import Stack.Basics.Stack;

import javax.management.DynamicMBean;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack st = new DynamicStack<String>(5);

        System.out.println(st.push("Harsh"));
        st.push("Verma");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");
        st.push("Last Elemnent");

        st.display();
        st.pop();
        st.display();

    }
}
