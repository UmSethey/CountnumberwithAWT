import java.awt.*;
import java.awt.event.*;

public class CountnumberWithAWT {

    public static void main(String[] args) {
        Frame frame = new Frame("Counter");
        frame.setLayout(new FlowLayout());

        TextField textField = new TextField(10);
        Button addButton = new Button("Add");
        Button removeButton = new Button("Remove");
        Button resetButton = new Button("Reset");
        Label countLabel = new Label("Count: 0");

        frame.add(textField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(resetButton);
        frame.add(countLabel);

        final int[] count = {0};

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    int value = Integer.parseInt(input);
                    count[1] += value;
                    countLabel.setText("Count: " + count[0]);
                    textField.setText("");
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Similar logic for decrementing count
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0] = 0;
                countLabel.setText("Count: 0");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
