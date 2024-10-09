import java.util.Scanner;

public class kasir{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pilih1 = 0, pilih2 = 0, jumlah = 0, total = 0, grandtotal = 0;

            do { 
                System.out.println("===Warung Oke===");
                System.out.println("\n 1.Sandal \n 2.Sepatu \n 3.Exit");

                System.out.print("Pilih : ");
                pilih1 = sc.nextInt();

                switch (pilih1){
                        case 1:
                                do { 
                                        System.out.println("==SANDAL==");
                                        System.out.println("\n 1.Swallow [15.000] \n 2.Flipper [50.000] \n 3.Crocs [100.000] \n 4.Selesai");
                                        System.out.print("Pilih : ");
                                        
                                        pilih2 = sc.nextInt();
                                        switch (pilih2){
                                                case 1:
                                                        System.out.println("Sandal Swallow");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 15000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;

                                                case 2:
                                                        System.out.println("Sandal Flipper");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 50000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;
                                                
                                                case 3:
                                                        System.out.println("Sandal Crocs");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 100000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;

                                                case 4:
                                                        System.out.println("Kembali.....");
                                                        break;
                                                
                                                default:
                                                        System.out.println("Pilihan salah");
                                        }
                                } while (pilih2 != 4);
                                break;
                        case 2:
                                do { 
                                        System.out.println("==SANDAL==");
                                        System.out.println("\n 1.Adidas NORMAL [125.000] \n 2.Nike [200.000] \n 3.Adidas LIMITED EDITION [400.000] \n 4.Selesai");
                                        System.out.print("Pilih : ");
                                        
                                        pilih2 = sc.nextInt();
                                        switch (pilih2){
                                                case 1:
                                                        System.out.println("Adidas NORMAL");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 125000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;

                                                case 2:
                                                        System.out.println("Nike");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 200000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;
                                                
                                                case 3:
                                                        System.out.println("Adidas LIMITED EDITION");
                                                        System.out.print("Jumlah : ");
                                                        jumlah = sc.nextInt();
                                                        total = 400000 * jumlah;
                                                        System.out.println(total);
                                                        grandtotal = grandtotal + total;
                                                        break;

                                                case 4:
                                                        System.out.println("Kembali.....");
                                                        break;
                                                
                                                default:
                                                        System.out.println("Pilihan salah");
                                        }
                                } while (pilih2 != 4);
                                break;
                        case 3:
                                System.out.println("Total belanja anda adalah : " + grandtotal);
                                System.out.println("Terimakasih");
                                break;
                        default:
                                System.out.println("Pilihan Salah");

                }

            } while (pilih1 != 3);
        }
}