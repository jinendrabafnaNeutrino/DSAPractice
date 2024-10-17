package Sorting;

class Dp
{
   public void Dp()
   {
       System.out.println("Construtor Overidden");
   }
}

class cp extends Dp
{
    public void cp()
   {
       super.Dp();
       System.out.println("Hello Jay");
       
   }
}

class pp extends cp
{
   public void learn()
   {
       super.cp();
       System.out.println("Competitive Programming");
   }

}

class Main1 
{
   public static void main (String [] args)
{
   pp obj = new pp();
   obj.learn();
}


}