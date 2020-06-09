package VongLapTrongJava;

public class HtSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 3;
        boolean status = false;
        System.out.println("cac so nguyen to nho hon 100 la: ");
        System.out.println(2);
        for (num = 3; num < 100; num++) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    status= true;
                    break;
                }else {
                    status = false;
                }
            } if (status !=true){
            System.out.println(num);

            }
        }
    }
}

