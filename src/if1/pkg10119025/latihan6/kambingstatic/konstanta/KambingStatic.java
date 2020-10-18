
package if1.pkg10119025.latihan6.kambingstatic.konstanta;



public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
      
      public static void main(String[] args) {
          Mamalia.jumlahKambing = 485000;
          System.out.println(NAMA_KAMBING + "MEMILIKI KAMBING SEBANYAK " 
                  + Mamalia.jumlahKambing);
      }
}


