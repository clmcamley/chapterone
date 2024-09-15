public class Onedoteleven {
    public static void main(String[] args) {
        double population = 312032486.0;
        double yrinsec = 365.0 * 24 * 60 * 60;
        double birthinyr = yrinsec / 7;
        double deathinyr = yrinsec / 13;
        double immigrantinyr = yrinsec / 45;
        double popchange = birthinyr - deathinyr + immigrantinyr;
        double popyrone = population + popchange;
        double popyrtwo = popyrone + popchange;
        double popyrthree = popyrtwo + popchange;
        double popyrfour = popyrthree + popchange;
        double popyrfive = popyrfour + popchange;
        System.out.println("The starting population is " + population);
        System.out.println("The projected population after one year is " + popyrone);
        System.out.println("The projected population after two years is " + popyrtwo);
        System.out.println("The projected population after three years is " + popyrthree);
        System.out.println("The projected population after four years is " + popyrfour);
        System.out.println("The projected population after five years is " + popyrfive);
    }
}
