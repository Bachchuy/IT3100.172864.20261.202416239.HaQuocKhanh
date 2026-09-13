import javax.swing.JOptionPane;

public class Caculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
    }
}
