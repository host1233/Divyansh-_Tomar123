class character{
    public static void main (String[]args){
        char original_value='A';
        int unicode_value=(int)original_value;

        int nextint=unicode_value;
        char next_char=(char)nextint;


           System.out.println("original char value:"+original_value);
        System.out.println("converted to int :"+unicode_value);
           System.out.println("next int  value:"+nextint);
        System.out.println("next char value :"+ next_char);
    }}
        