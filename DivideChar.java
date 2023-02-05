public class DivideChar {
    int i = 0;
    String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

    public char getCharInIndex(String s,int i)
    {
        for(i=0;i<s.length();i++)
        {
        if(Character.isDigit(s.charAt(i)))
        {
            System.out.println(s.charAt(i));
        }
        else if(Character.isLetter(s.charAt(i)))
        {
            System.out.println(s.charAt(i));
        }
        else if(specialCharactersString.contains(Character.toString(s)))
        {
            System.out.println(s.charAt(i));
        }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "@2023 Bharath";
        int i=0;
        char ch = getCharInIndex(s,i);
        System.out.println(ch);
    }
    
}
