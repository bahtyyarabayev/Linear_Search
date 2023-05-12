/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doğrusal_arama;

/**
 *
 * @author Bahtyyar
 */
public class Doğrusal_Arama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int [] dizi={5,1,12,34,56,23,-5,2};
       int sayiİndex=dogrusalArama(dizi,-5);
       if (sayiİndex !=-1)
           
       {
         System.out.println("Aranan Sayının indeksi:"+sayiİndex);
       }
       else {
           System.out.println("Aranan sayınız bulunamadı");
       }
       
    }
    private static int dogrusalArama(int[]dizi,int arananSayi )
    {
        for(int i=0;i<dizi.length;i++)
        {
            if(dizi[i]==arananSayi)
            {
                return i;
            }
        }
        return-1;
    }
        
    
    
}
