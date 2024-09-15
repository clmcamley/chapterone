public class Onedotthirteen {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;
        double xnum = ((e * d) - (b * f));
        double ynum = ((a * f) - (e * c));
        double denom = ((a * d) - (b * c));
        double x = xnum / denom;
        double y = ynum / denom;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
