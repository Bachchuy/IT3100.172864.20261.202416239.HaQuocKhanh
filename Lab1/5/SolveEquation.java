import javax.swing.JOptionPane;

public class SolveEquation {
    public static void main(String[] args) {
        String strOption = JOptionPane.showInputDialog(
                "Choose an equation type (1: First-degree, 2: System, 3: Second-degree):");

        int option = Integer.parseInt(strOption);

        switch (option) {
            case 1:
                double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

                if (a == 0) {
                    if (b == 0) {
                        System.out.println("The equation has infinitely many solutions.");
                    } else {
                        System.out.println("The equation has no solution.");
                    }
                } else {
                    System.out.println("The solution is x = " + (-b / a));
                }
                break;
            case 2:
                double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
                double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
                double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
                double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
                double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
                double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

                double determinant = a11 * a22 - a21 * a12;
                double determinantX = b1 * a22 - b2 * a12;
                double determinantY = a11 * b2 - a21 * b1;

                if (determinant != 0) {
                    double x1System = determinantX / determinant;
                    double x2System = determinantY / determinant;
                    System.out.println("The system has one solution:");
                    System.out.println("x1 = " + x1System);
                    System.out.println("x2 = " + x2System);
                } else if (determinantX == 0 && determinantY == 0) {
                    System.out.println("The system has infinitely many solutions.");
                } else {
                    System.out.println("The system has no solution.");
                }
                break;
            case 3:
                double aQuadratic = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
                double bQuadratic = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
                double cQuadratic = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

                if (aQuadratic == 0) {
                    if (bQuadratic == 0) {
                        if (cQuadratic == 0) {
                            System.out.println("The equation has infinitely many solutions.");
                        } else {
                            System.out.println("The equation has no solution.");
                        }
                    } else {
                        System.out.println("The solution is x = " + (-cQuadratic / bQuadratic));
                    }
                } else {
                    double discriminant = bQuadratic * bQuadratic - 4 * aQuadratic * cQuadratic;

                    if (discriminant < 0) {
                        System.out.println("The equation has no real solution.");
                    } else if (discriminant == 0) {
                        System.out.println("The equation has a double root: x = "
                                + (-bQuadratic / (2 * aQuadratic)));
                    } else {
                        double x1Quadratic = (-bQuadratic + Math.sqrt(discriminant)) / (2 * aQuadratic);
                        double x2Quadratic = (-bQuadratic - Math.sqrt(discriminant)) / (2 * aQuadratic);
                        System.out.println("The equation has two real roots:");
                        System.out.println("x1 = " + x1Quadratic);
                        System.out.println("x2 = " + x2Quadratic);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}