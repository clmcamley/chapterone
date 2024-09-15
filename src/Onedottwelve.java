public class Onedottwelve {
    public static void main(String[] args) {
        double distanceinmi = 24.0;
        double timeinhr = 1207 / 720.0;
        double speedinmph = distanceinmi / timeinhr;
        double speedinkph = speedinmph * 1.6;
        System.out.println("The runner's average speed is " + speedinkph + " kph.");
    }
}
