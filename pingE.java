import java.util.*;
import java.io.*;
import java.net.*;

public class pingE{

    public static void main (String[] args) throws UnknownHostException, IOException{
        String ipAddress = "192.168.1.1";
        //InetAddress inet = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
        /*String[] tokens = ipAddress.split("\\.");
        byte[] byteArray = new byte[tokens.length];
        for(int i =0; i<tokens.length; i++){
		byteArray[i] = Byte.valueOf(tokens[i]);
        }
        InetAddress inet = InetAddress.getByAddress(byteArray);*/
	InetAddress inet = InetAddress.getByName("www.google.com");
        System.out.println("Sending Ping request to "+ inet + " with hostname " + inet.getHostName());

        System.out.println(inet.isReachable(5000)? "Host is reachable" : "Host is not reachable");
    }
}
