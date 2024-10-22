public class Estremo {
   public static void main (String [] args){
   //bea
   System.out.println("Il valore minore per il tipo Byte e':" + minByte());
   System.out.println("Il valore minore per il tipo Double e':" + minDouble());
   System.out.println("Il valore minore per il tipo Int e':" + minInteger());
   System.out.println("Il valore minore per il tipo Short e':" + minShort());
   System.out.println("Il valore minore per il tipo Long e':" + minLong());
   System.out.println("Il valore minore per il tipo Float e':" + minFloat());
   System.out.println("Il valore massimo per il tipo Byte e':" + maxByte());
   System.out.println("Il valore massimo per il tipo Double e':" + maxDouble());
   System.out.println("Il valore massimo per il tipo Int e':" + maxInteger());
   System.out.println("Il valore massimo per il tipo Short e':" + maxShort());
   System.out.println("Il valore massimo per il tipo Long e':" + maxLong());
   System.out.println("Il valore massimo per il tipo Float e':" + maxFloat());
   }
   public static byte minByte(){
   byte minValue = Byte.MIN_VALUE;
   return minValue;
}
   public static double minDouble(){
   double minValue = Double.MIN_VALUE;
   return minValue;
}
   public static int minInteger(){
      int minValue = Integer.MIN_VALUE;
      return minValue;
     }
   public static short minShort(){
      short minValue = Short.MIN_VALUE;
      return minValue;
     }
     public static long minLong(){
      long minValue = Long.MIN_VALUE;
      return minValue;
     }
      public static float minFloat(){
      float minValue = Float.MIN_VALUE;
      return minValue;
     }
     
      public static byte maxByte(){
      byte maxValue = Byte.MAX_VALUE;
      return maxValue;
      }
      
      public static double maxDouble(){
      double maxValue = Double.MAX_VALUE;
      return maxValue;
   }
      public static int maxInteger(){
         int maxValue = Integer.MAX_VALUE;
         return maxValue;
        }
      public static short maxShort(){
         short maxValue = Short.MAX_VALUE;
         return maxValue;
        }
        public static long maxLong(){
         long maxValue = Long.MAX_VALUE;
         return maxValue;
        }
        public static float maxFloat(){
         float maxValue = Float.MAX_VALUE;
         return maxValue;
        }
   }
