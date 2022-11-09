import java.util.Scanner;

	public class HargaMakanan{
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String namaMakanan;
			int hargaMakanan, pengiriman, pengirimanExpress, pengirimanReguler, total;
			
			System.out.print("Masukkan Nama Makanan :");
			namaMakanan = sc.nextLine();
			
			System.out.print("Masukkan Harga Makanan :");
			hargaMakanan = sc.nextInt();
			
			System.out.print("Apakah anda ingin pengiriman express (0 = tidak, 1 = iya)?");
			pengiriman = sc.nextInt();
			
			System.out.println(" " + namaMakanan + "\t\t" +hargaMakanan);
			
			
			if(pengiriman == 0){
				if (hargaMakanan < 100000){
					pengirimanReguler = 20000;
					System.out.println("Biaya Pengiriman :" +pengirimanReguler);
					System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
					
				} else if (hargaMakanan == 100000 || hargaMakanan >= 100000){
					pengirimanReguler = 30000;
					System.out.println("Biaya Pengiriman :" +pengirimanReguler);
					System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
					
				} else {
					pengirimanReguler = 0;
						System.out.println("Biaya Pengiriman :" +pengirimanReguler);
						System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
				}
				
				
		} else if (pengiriman == 1){
				if (hargaMakanan < 100000){
					pengirimanExpress = 45000;
					System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
					System.out.println("Total :" + (hargaMakanan + pengirimanExpress));
				
				}else if (hargaMakanan == 100000 || hargaMakanan > 100000){
					pengirimanExpress = 55000;
					System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
					System.out.println("Total :" + (hargaMakanan + pengirimanExpress));
				}
				
			} else {
				System.out.println("Data Yang Anda Masukkan Tidak Valid");
				
			}
				
		}
	}