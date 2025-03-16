import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonFrame extends JFrame {

    public ColorButtonFrame() {
        setTitle("Color Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Define the colors
        String[] colors = {"Red", "Green", "Blue"};

        // Create buttons and add ActionListener
        for (String color : colors) {
            JButton button = new JButton(color);
            button.setBackground(getColorFromString(color.toLowerCase()));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    changeColor(color);
                }
            });
            add(button);
        }
    }

    private void changeColor(String color) {
        JOptionPane.showMessageDialog(this, "You selected " + color + "!");
    }

    private Color getColorFromString(String colorName) {
        try {
            return (Color) Color.class.getField(colorName).get(null);
        } catch (Exception e) {
            // Handle the exception, e.g., color not found
            e.printStackTrace();
            return Color.BLACK;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorButtonFrame frame = new ColorButtonFrame();
            frame.setVisible(true);
        });
    }
}