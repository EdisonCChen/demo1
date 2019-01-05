package com;
import java.io.IOException;
import java.net.InetAddress;

public class ping {

    public static void main(String[] args) throws IOException, InterruptedException {
        InetAddress address = InetAddress.getByName("192.168.10.110");
//        System.out.println("正在Ping "+args[0]+" ["+address.getHostAddress()+"] 具有32字节的数据");
        int flag=0;
        for (int i = 0; i < 40; i++) {
            boolean b=address.isReachable(1000);
            System.out.println("来自  "+address.getHostAddress()+" 的回复:  "+(b ?"成功":"失败"));
            if(b)
                flag++;
            Thread.sleep(200);
        }
        System.out.println();
        System.out.println(address.getHostAddress()+" 的  Ping 统计信息：");
        System.out.println("    数据包：已发送 = 40， 已接收 = "+flag+" ,丢失 = "+(40-flag)+"("+(40-flag)/4*100+"% 丢失)");
    }

}