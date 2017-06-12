package cn.spiderpig.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class FooTest {
    
    @Test
    public void footest() throws IOException{
        
        URL url = new URL("http://www.baidu.com");
        
        InputStream is = url.openStream();
        
        InputStreamReader isr = new InputStreamReader(is,"utf-8");
        
        BufferedReader br = new BufferedReader(isr);
        
        String data = br.readLine();
        
        while(data!=null){
            System.out.println(data);
            data=br.readLine();
        }
        br.close();
        isr.close();
        is.close();
        
    } 

}
