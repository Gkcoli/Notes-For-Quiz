import java.util.Scanner;

class Shop{
    String gunNumber;
    String packName;
    String discount;
    String gunName;

    final double VANDAL_REAVER = 7500;
    final double PHANTOM_REAVER = 7900;
    final double PHANTOM_CHAMPIONSHIP = 8000;
    final double VANDAL_RGX = 8500;

    final double VANDALONE_MISCELLANOUS = 550;
    final double PHANTOMONE_MISCELLANOUS = 670;
    final double PHANTOMTWO_MISCELLANOUS = 770;
    final double VANDALTWO_MISCELLANOUS = 950;

     Shop(String gunNumber, String packName, String discount, String gunName){
        this.gunNumber = gunNumber;
        this.packName = packName;
        this.discount = discount;
        this.gunName = gunName;
        getgunName();

    }
    void getgunName(){
        switch(gunName){
            case "reaver vandal":
            getdiscount(VANDAL_REAVER, VANDALONE_MISCELLANOUS);
            break;
            case "phantom reaver":
            getdiscount(PHANTOM_REAVER, PHANTOMONE_MISCELLANOUS);
            break;
            case "phantom championship":
            getdiscount(PHANTOM_CHAMPIONSHIP, PHANTOMTWO_MISCELLANOUS);
            break;
            case "rgx vandal":
            getdiscount(VANDAL_RGX, VANDALTWO_MISCELLANOUS);
            break;


        }
    }
    void getdiscount(double totalpack, double miscellaneous) {
        switch(discount){
            case "nightmarket":
            computeTotal(totalpack + miscellaneous,  0.4);
            break;
            case "midnightmarket":
            computeTotal(totalpack + miscellaneous, 0.8);
            break;
            case "morningmarket":
            computeTotal((totalpack * 0.10) + miscellaneous, 0);
            break;
            case "afternoonmarket":
            computeTotal(totalpack + miscellaneous, 0);
            break;
        }
    }
     void computeTotal(double totalpack, double miscellaneous) {
        double computeTotal = totalpack - (totalpack * miscellaneous);
        System.out.printf("\nTOTALPACK (OVERALL): RIOT PTS %.2f", computeTotal);
    }
}


public class Basta {
    public static void main(String[] args)  {
        String gunNumber;
        String packName;
        String discount;
        String gunName;

        Scanner input = new Scanner(System.in);
        System.out.println("Gun Number: ");
        gunNumber = input.nextLine();
        System.out.println("Pack Name: ");
        packName = input.nextLine();
        System.out.println("Discount: ");
        discount = input.nextLine().toLowerCase();
        System.out.println("Gun Name: ");
        gunName = input.nextLine().toLowerCase();
        input.close();

        Shop newShop = new Shop(gunNumber, packName, discount, gunName);

        
    }
}
