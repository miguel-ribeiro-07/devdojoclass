package learnjava.devdojo.introducao;

public class C07 {
    public static void main(String[] args) {
        //ternary operators
        float salary = 500F;
        float ps5Cost = 4000F;
        String canBuyPs5 = (12 * salary) >= ps5Cost ? "i can but it in one year" : "i can´t buy this ps5 =(";

        System.out.println(canBuyPs5);

        // TAXES in Netherlands
        double salaryPerMonth = 5000.0F;
        double tax;
        double amountToBePaid;
        if(salaryPerMonth <= 34712.00D){
            tax = 9.7D;
        }else if(salaryPerMonth <= 68507.00D){
            tax = 37.35D;
        }else tax = 49.5D;

        if(salaryPerMonth <= 34712.00D){
            tax = 9.7D;
        }else if(salaryPerMonth >= 34713.00D && salaryPerMonth <= 68507.00D){
            tax = 37.35D;
        }else tax = 49.5D;

        amountToBePaid = salaryPerMonth * (tax / 100);
        System.out.print(amountToBePaid + (" tax: "+ tax));
    }
}
