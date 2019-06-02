package com.company;


import java.io.IOException;

public class szyfrowanie {
    int zmiana=3;
    public String szyfrowanie(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'+zmiana;
                t1=t1%26;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'+zmiana;
                t1=t1%26;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }
    public String deszyfrowanie(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'-zmiana;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'-zmiana;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }
}