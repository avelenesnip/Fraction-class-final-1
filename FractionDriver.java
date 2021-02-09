class FractionDriver{
    
    public static void main (String[] args){
        
        Fraction myFraction = new Fraction();
        Fraction yourFraction = new Fraction(1,8);
        
        Fraction f1 = new Fraction (myFraction);
        Fraction f2 = new Fraction (yourFraction);
        
        
        System.out.println (f2);
        
        
        System.out.println(f1.multiply (f1,f2));
        
        

    }
    
}