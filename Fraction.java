class Fraction{
    
    private int num; //numerator 
    private int den; //denominator
    
    public Fraction() {
        this.num = 1;
        this.den = 1;
    }
    
        public Fraction(int num, int den) {
        this.num = num;
        if (den == 0) {
            System.out.println("error den is 0");
            den = 1;
        } else {
            this.den = den;
        }
    }
    
    public Fraction (String f){
        int slashIndex = f.indexOf("/");
        
        String n = f.substring (0, slashIndex);
        String d = f.substring (slashIndex+1);
        
        this.num = Integer.parseInt (n);
        int tempD = Integer.parseInt (d); //add error check
        
        if (tempD == 0){
            System.out.println ("error den is 0");
            den = 1;
        }else{
            this.den = tempD;
        }
        
    }
    
    
    public Fraction (Fraction f){
    
       this.num = f.num;
       this.den = f.den;
    
    }
    
    
    public int getNum(){
       return this.num;
    }
    
    public int getDen(){
       return this.den;
    }
    
    public String toString(){
        return this.num + "/" + this.den;
    }
    
    public void setNum(){
        this.num = num;
    }
                         
    public void setDen(){
        if(this.den != 0)
         this.den = den;
         else{
         System.out.println("error den is 0");
         den = 1;
        }
    }
    
    public double toDecimal() {
        double floated = this.num;
        return floated/this.den;
    }
    
    public void reduce() { 
        int GCD = GCD(this.num, this.den);
        this.num = this.num / GCD;
        this.den = this.den / GCD; 
    }
    
    
    public int GCD(int a, int b) {         
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            return 1;
        }

        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
        
    public static Fraction add (Fraction a, Fraction b) {
        int Num = a.num * b.den + b.num * a.den;
        int Den = a.den * b.den;
        Fraction ans = new Fraction(Num,Den);
        ans.reduce();

        return ans;
    }

    public static Fraction subtract (Fraction a, Fraction b) {      
        int Num = a.num * b.den + b.num * a.den;
        int Den = a.den * b.den;
        
        Fraction ans = new Fraction(Num,Den);
        ans.reduce();

        return ans;
    }

    
    public static Fraction multiply(Fraction a, Fraction b) {
        int Num = a.num * b.den + b.num * a.den;
        int Den = a.den * b.den;
        Fraction ans = new Fraction(Num,Den);
        ans.reduce();
        return ans;
    }
    
    public static Fraction divide(Fraction a, Fraction b) {
        if (b.num == 0) {
            System.out.println("error den is 0");
            return new Fraction();
        } else {
            Fraction reciprocal = b.getReciprocal();
            Fraction ans = Fraction.multiply(a, reciprocal);
            ans.reduce();
            return ans;
        }
    }


    private Fraction getReciprocal() {
        Fraction reciprocal = new Fraction(this.den, this.num);
        return reciprocal;
    }
        
}
       

    
    
    