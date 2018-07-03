package com.example.demo;

import javax.imageio.ImageIO;
import java.io.*;
import java.net.Socket;
import java.util.Random;

public class refreshP {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        byte[] buffer = null;
        try {
//							SocketUtils.SocketSend("127.0.0.1",8088,b.toString(),0);//projectNodeRel.getnodeip
            Socket socket = new Socket("192.168.87.11",8088);//
            //2、获取输出流，向服务器发送信息
            OutputStream os = socket.getOutputStream();//字节输出流
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            //发送命令头
            byte[] cmdbytes = new byte[64];
            cmdbytes[0] = 0x55;
            cmdbytes[1] = 0x55;
            cmdbytes[2] = 0x55;
            cmdbytes[3] = 0x05;
            byte[] b1 = new byte[32];
            Random r = new Random();
            r.nextBytes(b1);
            for (int z = 0; z < 32; z++){
                cmdbytes[4 + z] = b1[z];
            }
            cmdbytes[63] = 0x07;
            dout.write(cmdbytes);
            dout.flush();
            //等一个反馈
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while((info = br.readLine())!=null){//循环读取服务器信息
                System.out.println("我是客户端，服务器说"+info);
            }
    try
        {
            File file = new File("C:\\Users\\Administrator\\Desktop\\test\\1.png");
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[512];
            int n;
            while ((n = fis.read(b)) != -1)
            {
                bos.write(b, 0, n);
                dout.write(b);
                Thread.sleep(1000);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


//							java.util.Arrays.fill(cmdbytes, (byte) 0);
            //end



//            DataOutputStream dout1 = new DataOutputStream(socket.getOutputStream());

//							byte[] A =  new byte[512];
//
//							for(int i=0;i<img.length/512;i++){
//                             	int X=0;
//                             	X=X+512;
//								System.arraycopy(img, X, A, 0, 512);
//								dout1.write(A);
//								dout1.flush();
//								//socket.setKeepAlive(true);
//								Thread.sleep(10000);
//							}
//
//							dout1.close();
//            dout1.write(buffer);
//            dout1.flush();
//            Thread.sleep(10000);



//							InputStream is1 = socket.getInputStream();
//							BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
//							String info1 = null;
//								if ((info1 = br1.readLine())!=null){//循环读取服务器信息
//									System.out.println("我是客户端，服务器说"+info1);
//									break;
//								}
//							Thread.sleep(15000);
            //end
            //发送结束后发送


            cmdbytes[0] = 0x55;
            cmdbytes[1] = 0x55;
            cmdbytes[2] = 0x55;
            cmdbytes[3] = 0x05;
            cmdbytes[63] = 0x08;
            dout.write(cmdbytes);
            dout.flush();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
