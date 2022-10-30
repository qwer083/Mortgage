public class Mortgage {
    public static void main(String []args) {
        final long a = 35000000L;
        final double b = 0.15;
        long c = (long) (a*b);
        String s = "стоимость квартиры";
        String h = "процент первоначального взноса по ипотеке";
        String j = "сумма первоначального взноса";
        System.out.println("стоимость квартиры: " + a);
        System.out.println("процент первоначального взноса по ипотеке: " + b);
        System.out.println("сумма первоначального взноса: " + c);
    }
}
