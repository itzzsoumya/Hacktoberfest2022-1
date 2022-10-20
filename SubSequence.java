public class StringBufferSubSequence {  
    public static void main(String[] args) {  
        StringBuffer sb = new StringBuffer("hacktoberfest 2022");  
        System.out.println("string: "+sb);  
        CharSequence sm = sb.subSequence(3, 11);  
        System.out.println(sm);  
    }  
}  
