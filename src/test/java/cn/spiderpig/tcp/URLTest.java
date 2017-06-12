package cn.spiderpig.tcp;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class URLTest {
    
    @Test
    public void url() throws MalformedURLException{
        
        URL baidu = new URL("http://www.baidu.com:80");
        
        URL url = new URL(baidu,"/index.html?username=ScvQ");
        
        System.out.println(url.getProtocol());
        
        System.out.println(url.getHost());
        
        System.out.println(url.getPath());
        
        System.out.println(url.getPort());
        
        System.out.println(url.getFile());
        
        System.out.println(url.getRef());
        
        System.out.println(url.getQuery());
        
    }

}
