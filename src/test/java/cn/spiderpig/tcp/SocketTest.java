package cn.spiderpig.tcp;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.junit.Test;

public class SocketTest {
    
    @Test
    public void socket() throws UnknownHostException{
        
        InetAddress inetAddress = InetAddress.getLocalHost();
        
        System.out.println(inetAddress.getHostName());
        
        System.out.println(inetAddress.getHostAddress());
        
        // System.out.println(Arrays.toString(inetAddress.getAddress()));
        
        System.out.println(InetAddress.getByName("User").getHostAddress());
        
    }
    
}
