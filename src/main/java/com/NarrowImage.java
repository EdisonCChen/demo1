package com;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class NarrowImage {

    /**
     * @param src
     *            原始图像
     * @param toWidth,toHeight
     *
     * @return 返回处理后的图像
     */
    public BufferedImage zoomImage(String src,int toWidth,int toHeight) {

        BufferedImage result = null;

        try {
            File srcfile = new File(src);
            if (!srcfile.exists()) {
                System.out.println("文件不存在");

            }
            BufferedImage im = ImageIO.read(srcfile);

            /* 新生成结果图片 */
            result = new BufferedImage(toWidth, toHeight,
                    BufferedImage.TYPE_INT_RGB);
              // 设置透明度
            // ----------  增加下面的代码使得背景透明  -----------------
            Graphics2D g2d = result.createGraphics();
            result = g2d.getDeviceConfiguration().createCompatibleImage(toWidth, toWidth, Transparency.TRANSLUCENT);
//            g2d.dispose();
            g2d = result.createGraphics();
// ----------  背景透明代码结束  -----------------
            g2d.drawImage(
                    im.getScaledInstance(toWidth, toHeight,
                            java.awt.Image.SCALE_SMOOTH), 0, 0, null);

        } catch (Exception e) {
            System.out.println("创建缩略图发生异常" + e.getMessage());
        }

        return result;

    }

    public static void main(String[] args) {

        String inputFoler = "D:\\Users\\CHENJH\\Desktop\\test1\\PT.png" ;
        /*这儿填写你存放要缩小图片的文件夹全地址*/
        String outputFolder = "D:\\Users\\CHENJH\\Desktop\\test1\\r.png";
        /*这儿填写你转化后的图片存放的文件夹*/

        NarrowImage narrowImage = new NarrowImage();
        try {
            ImageIO.write(narrowImage.zoomImage(inputFoler,50,50), "PNG", new File(outputFolder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
