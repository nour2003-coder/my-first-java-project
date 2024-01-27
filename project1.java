import javax.swing.JOptionPane;

public class project1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        if (name == null) {
            JOptionPane.showMessageDialog(null, "ok bye");

        } else {
            while (name.isEmpty()) {
                name = JOptionPane.showInputDialog("enter your name");

            }
            int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
            JOptionPane.showMessageDialog(null, "your name is " + name + " and  you are " + age + " years old ");

        }

    }

}
