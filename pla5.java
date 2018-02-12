import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();int c=0,c1,c2,c3,c4,c5,c6,c7;
    char ch[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        if(ch[i]=='I')
        {c1=1;}
        else
        {c1=0;}
        if(ch[i]=='V')
        {c2=5;}
        else{c2=0;}
        
         if(ch[i]=='C')
        {c3=100;}
        else{c3=0;}
        
         if(ch[i]=='X')
        {c4=10;}
        else{c4=0;}
        
         if(ch[i]=='D')
        {c5=500;}
        else{c5=0;}
        
         if(ch[i]=='L')
        {c6=50;}
        else{c6=0;}
        
         if(ch[i]=='M')
        {c7=1000;}
        else{c7=0;}
        c=c+c1+c2+c3+c4+c5+c6+c7;
    }
        System.out.println(c);
    }
}


