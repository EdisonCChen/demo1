package com.example.demo;
import java.io.*;
import java.net.Socket;
import java.util.Random;


public class FileTransferClient extends Socket {

    private static final String SERVER_IP = "192.168.87.11"; // 服务端IP
    private static final int SERVER_PORT = 8088; // 服务端端口

    private Socket client;

    private FileInputStream fis;

    private DataOutputStream dos;

    /**
     * 构造函数<br/>
     * 与服务器建立连接
     * @throws Exception
     */
    public FileTransferClient() throws Exception {
        super(SERVER_IP, SERVER_PORT);
        this.client = this;
        System.out.println("Cliect[port:" + client.getLocalPort() + "] 成功连接服务端");
    }

    /**
     * 向服务端传输文件
     * @throws Exception
     */
    public void sendFile() throws Exception {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\test\\1.png");
            if(file.exists()) {
                fis = new FileInputStream(file);
                dos = new DataOutputStream(client.getOutputStream());

                // 文件名和长度
//                dos.writeUTF(file.getName());
//                dos.flush();
//                dos.writeLong(file.length());
//                dos.flush();
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
                dos.write(cmdbytes,0,cmdbytes.length);
//                dos.flush();
                Thread.sleep(300);
                //等一个反馈
//                InputStream is = client.getInputStream();
//                BufferedReader br = new BufferedReader(new InputStreamReader(is));
//                String info = null;
//                while((info = br.readLine())!=null){//循环读取服务器信息
//                    System.out.println("我是客户端，服务器说"+info);
//                }

                // 开始传输文件
                System.out.println("======== 开始传输文件 ========");
                byte[] bytes = new byte[1024];
                int length = 0;
                long progress = 0;
                while((length = fis.read(bytes, 0, bytes.length)) != -1) {
                    dos.write(bytes, 0, length);
//                    dos.flush();
                    Thread.sleep(10);
                    progress += length;
                    System.out.print("| " + (100*progress/file.length()) + "% |");
                }
                Thread.sleep(3000);
                cmdbytes[0] = 0x55;
                cmdbytes[1] = 0x55;
                cmdbytes[2] = 0x55;
                cmdbytes[3] = 0x05;
                cmdbytes[63] = 0x08;
                dos.write(cmdbytes,0,cmdbytes.length);
                Thread.sleep(1000);
                dos.flush();
                System.out.println();
                System.out.println("======== 文件传输成功 ========");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(fis != null)
                fis.close();
            if(dos != null)
                dos.close();
            client.close();
        }
    }

    /**
     * 入口
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileTransferClient client = new FileTransferClient(); // 启动客户端连接
            client.sendFile(); // 传输文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
