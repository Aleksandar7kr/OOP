import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String filename="C:\\Users\\Alex\\Desktop\\Save26.ser";
        SwingUtilities.invokeLater(() -> {
            JFrame form=new Form(filename);
            form.setVisible(true);
        });

    }
}