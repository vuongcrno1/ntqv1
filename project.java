package stupid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class x {
    public static void main(String[] arg)   {        
			int CC=hohoho(arg);System.exit(CC);}
	
	
    public static int hohoho(String u[]) {
        try{
			if(u.length != 2) return -1;
			String b,d= new String(Files.readAllBytes(Paths.get(u[1]))); 
            b= new String(Files.readAllBytes(Paths.get(u[0])));
            int k = b.length();
			
            if(k<4) retur -2;
			
			int r=0; 
			float e=0;
            for(int a=0; a<k-3 ; a++) {       
			for(int q=0; q<d.length()-4; q+=1) {
				
				int v = 0;
					for(int c=0;c<4;c++){
						
							if(b.charAt(a+c) == d.charAt(q+c)) v ++;
            }       
			if (v == 4) {
                    System.out.println("DEBUG:".concat(String.valueOf(a) + "," + String.valueOf(q)));
					r++; e+=1;
					}
             else ++r; 
			 }
			 
			 }
            System.out.println(String.valueOf(Math.round(e)).concat("/") + String.valueOf(r));   
			return 1;
			} 
			catch(IOExceptionex){System.out.println("DEBUG:Error");
			
			return -3;
							}
						}
					}
