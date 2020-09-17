package com.company.laba6;
import java.awt.*;
import javax.swing.*;
public class Game_Guessing extends JFrame {
    int attemps = 3;
    int number = (int) (Math.random() * 21);

    JTextField input = new JTextField(20);
    JButton button = new JButton("Проверить число");

    void process()
    {
        try {
            int tmp = Integer.parseInt(input.getText());

            if (tmp > number)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Искомое число меньше.\nОставшиеся попытки: %d", attemps--),
                        "Информация о игре",
                        JOptionPane.INFORMATION_MESSAGE);

            else if (tmp < number)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Искомое число больше.\nОставшиеся попытки: %d", attemps--),
                        "Информация о игре",
                        JOptionPane.INFORMATION_MESSAGE);

            else {
                JOptionPane.showMessageDialog(
                        null,
                        String.format("Поздравляю, вы выиграли!", attemps--),
                        "Информация о игре",
                        JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }

            if (attemps < 0) { System.exit(0); }
        } catch (Exception ignored) { }//Обработка исключений
    }

    public Game_Guessing() {
        super("Игра-Угадайка");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(300, 100);
        setLayout(new FlowLayout());

        add(input);
        add(button);

        button.addActionListener(t -> {
            process();
        });
    }

    public static void main(String[] args) {
        new Game_Guessing().setVisible(true);
    }
}
