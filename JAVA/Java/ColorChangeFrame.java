import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame {

    public ColorChangeFrame() {
        setTitle("Color Change Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLayout(new FlowLayout());

        // Define the colors
        String[] colors = {"Magenta", "Green", "Cyan"};

        // Create buttons and add ActionListener
        for (String color : colors) {
            JButton button = new JButton(color);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    changeBackgroundColor(color);
                }
            });
            add(button);
        }
    }

    private void changeBackgroundColor(String color) {
        getContentPane().setBackground(getColorFromString(color.toLowerCase()));
        repaint();
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
            ColorChangeFrame frame = new ColorChangeFrame();
            frame.setVisible(true);
        });
    }
}