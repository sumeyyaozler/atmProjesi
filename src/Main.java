import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance =1500;
        int select ;
        while (right >0 ){
            System.out.print(" enter your username :");
            userName = input.nextLine();
            System.out.print("enter your password : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba.Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.print("1-Para yatırma \n" +
                            "2-Para çekme \n" +
                            "3-Bakiye Sorgulama \n" +
                            "4-çıkış yap\n");
                    System.out.print(" lütfen yapmak istediğiniz işlemi seçiniz : ");

                    select = input.nextInt();

                    switch (select) {
                        case 1:

                            System.out.print("bakiye miktarı :" );
                            int price = input.nextInt();

                            balance += price;
                            System.out.print("bakiye miktarı :" +balance );

                            break;
                        case 2:
                            System.out.print("bakiye miktarı :");
                            int withdrawMoney = input.nextInt();
                            if (withdrawMoney> balance) {
                                System.out.print("yetersiz bakiye");




                            } else {

                                balance -= withdrawMoney;
                                System.out.print("bakiye miktarı :" + balance);
                            }
                            break;


                        case 3:

                            System.out.print("bakiye miktarı :" + balance);
                            break;

                        case 4:

                            System.out.print("çıkış yaptınız");

                        default:
                            System.out.println("hatalı giriş yaptınız");
                            break;
                    }
                }
                while(select !=4);
                System.out.println("see you again..");
            }else{
                right--;
                System.out.println("hatalı kullanıcı adı veya şifresi.tekrar deneyiniz.");
                if(right ==0){
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile iletişime geçmenizi rica ederim.");
                }else {
                    System.out.println("kalan hakkınız :" + right);
                }

            }
        }
    }
}
