package oopörnek;

import java.util.Scanner;

public class Main {
	
	public static void ortalama(int[]arr) {
		int sayac=0;
		Scanner oku= new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			System.out.println("Notlarý giriniz.");
			arr[i]=oku.nextInt();
			sayac+=arr[i];
			
		}
		System.out.println("ortalamanýz: "+sayac/arr.length);
	}

	public static void main(String[] args) {


		
	
		int [] ok=new int[5];
		ortalama(ok);
		


			/*
			public static void mean(int [] arr) {
				int total=0;
				for(int i=0; i<arr.length;i++) {
					total+=arr[i];
				}
				System.out.println("ortalama"+total/arr.length);
			}
			public static void main(String[] args) {
				
				
				Scanner sacanner= new Scanner(System.in);  //(ctrl+shift+o)kütüphaneyi ekler.kullanýcýdan alýnan verilere göre bir array oluþacak
				
				
				
				int[] array= new int[5];
				
				System.out.println("array deðerlerini gir.");
				
				for(int i=0; i<array.length;i++) {
					array[i]=scanner.nextInt();
					
				}


				
				
				
				
				*/
				/*int [] arr1= {11,22,33,44,55,66,77,88,99};
				for(int i=0; i<9; i++) {
					System.out.println("eleman: "+arr1[i]);
					
					
					//dizi elemanlarýný ekranda gösterir.
				}*/
				
				
				
				
			/*String s1=new String("FEYZA");
			String s2=new String("FEYZA");
			if( s1.equals(s2)) {
				System.out.println("eþittir,");
			}else {
				System.out.println("eþit deðil....");
			}
				
				*/
				
				/*Car car1 =new Car("altýn sarýsý","mini copper",1.8,7);
				
				car1.goster();
				Car car2=new Car();
				car2.goster();
				
				Car car2=car1;
				car2.goster();
				
				
				/*car1.setcolor("mavi");
				car1.setDoors(1);
				
				System.out.println("Arabanýn rengi  "+car1.getcolor());
			

				System.out.println("Arabanýn kapý sayýsý  "+car1.getDoors());
				car1.start();
				car1.stop();
				*/
			
			}

		}

		
		
		
		
		
		
		
		
		
