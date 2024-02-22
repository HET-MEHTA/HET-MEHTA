
 class reversep2 {

   
    public static void main(String args[]) {
       int ld;
       int rev=0;
       int no=7231;
       while(no>0)
       {
           ld = no%10;
           rev=rev*10+ld;
           no=no/10;  
       }
       System.out.println("REVERSE NO IS:" +rev);
       
       
    }
}
