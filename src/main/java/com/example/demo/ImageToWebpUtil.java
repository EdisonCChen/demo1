package com.example.demo;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.*;

import java.net.URL;

/**
 * Description: 普通格式图片转换为webp格式图片 工具类
 *  耗时稍长，建议异步调用
 *
 * @author XU SAN DUO
 * Date: 2018/1/11 15:13
 * @version 1.0
 */
public class ImageToWebpUtil {

    public static final String WEBP = "webp";
    public static final String WEBP_SUFFIX = ".webp";

    /**
     * 1. 传入图片文件路径，返回file对象
     * @param imgFilePath 图片文件路径(比如转换图片为F:/1.png 那么转换后的webp文件为：F:/1.png.webp)
     * @return
     */
    public static File toWebpFile(String imgFilePath){
        File imgFile = new File(imgFilePath);
        File webpFile = new File(imgFilePath + WEBP_SUFFIX);
        try {
            BufferedImage bufferedImage = ImageIO.read(imgFile);
            ImageIO.write(bufferedImage, WEBP, webpFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return webpFile;
    }

    /**
     * 2. 传入图片url，返回file对象
     * @param imgUrlPath 图片路径url
     * @param webpFilePath 生成的webp文件路径
     * @return
     */
    public static File toWebpFile(String imgUrlPath, String webpFilePath){
        File webpFile = new File(webpFilePath);
        try {
            BufferedImage bufferedImage = ImageIO.read(new URL(imgUrlPath));
            ImageIO.write(bufferedImage, WEBP, webpFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return webpFile;
    }

    /**
     * 3. 传入图片文件路径，返回InputStream
     * @param imgFilePath 图片文件路径(比如转换图片为F:/1.png 那么转换后的webp文件为：F:/1.png.webp)
     * @return
     */
    public static InputStream toWebpStream(String imgFilePath){
        File imgFile = new File(imgFilePath);
        File webpFile = new File(imgFilePath + WEBP_SUFFIX);
        FileInputStream fis = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(imgFile);
            ImageIO.write(bufferedImage, WEBP, webpFile);
            fis = new FileInputStream(webpFile);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fis;
    }

    /**
     * 4. 传入图片url，返回InputStream
     * @param imgUrlPath 图片路径url
     * @param webpFilePath 生成的webp文件路径
     * @return
     */
    public static InputStream toWebpStream(String imgUrlPath, String webpFilePath){
        File webpFile = new File(webpFilePath);
        FileInputStream fis = null;
        try {
            BufferedImage bufferedImage = ImageIO.read(new URL(imgUrlPath));
            ImageIO.write(bufferedImage, WEBP, webpFile);
            fis = new FileInputStream(webpFile);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fis;
    }

    // 测试
    public static void main(String[] args) {
        long start = System.currentTimeMillis();


        // 1. test 传入图片文件路径，返回file对象
        String imgFilePath = "D:/Users/CHENJH/Desktop/test/1.jpg";
        File result = toWebpFile(imgFilePath);

        // 2. test 传入图片url，返回file对象
//        String imgUrlPath = "D:/Users/CHENJH/Desktop/test/1.jpg";
//        String webpFilePath = "D:/Users/CHENJH/Desktop/test/1.webp";
//        File result = toWebpFile(imgUrlPath,webpFilePath);

        // 3. test 传入图片文件路径，返回InputStream
//        String imgFilePath = "F:/test.png";
//        InputStream result = toWebpStream(imgFilePath);

        // 4. test 传入图片url，返回InputStream
//        String imgUrlPath = "http://pic151.nipic.com/file/20171228/22164794_210348306033_2.jpg";
//        String webpFilePath = "F:/xiche.jpg.webp";
//        InputStream result = toWebpStream(imgUrlPath,webpFilePath);


        long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start) + "  ms ; return ---->");
        System.out.print(result);
    }

}