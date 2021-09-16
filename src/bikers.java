/*Five Bikers Compete in a race such that they drive at
        a constant speed which may or may not be the same as
        the other. To qualify the race, the speed of a racer must
        be more than the average speed of all 5 racers. Write a
        Java program to take as input the speed of each racer
        and print back the speed of qualifying racers.

 */
public class bikers {
    public static void main(String[] args) {
        float r1 = 100, r2 = 150, r3 = 80, r4 = 90, r5 = 100, avg;
        avg = (r1+r2+r3+r4+r5)/5;
        System.out.println("average is" + avg);
        if (r1 > avg)
            System.out.println("Racer 1 qualified");
        if (r2 > avg)
            System.out.println("Racer 2 qualified");
        if (r3 > avg)
            System.out.println("Racer 3 qualified");
        if (r4 > avg)
            System.out.println("Racer 4 qualified");
        if (r5 > avg)
            System.out.println("Racer 5 qualified");
    }
}
