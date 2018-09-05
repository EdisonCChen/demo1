//package com.example.demo;
//
//import java.rmi.RemoteException;
//import javax.xml.namespace.QName;
//import javax.xml.rpc.ParameterMode;
//import javax.xml.rpc.ServiceException;
//import org.apache.axis.client.Call;
//import org.apache.axis.client.Service;
//import org.apache.axis.encoding.XMLType;
//
//public class WebServiceTest {
//
//    public String invokeRemoteFuc() {
//        String endpoint = "http://119.40.53.179:8096;
//        String result = "no result!";
//        Service service = new Service();
//        Call call;
//        Object[] object = new Object[3];
//        object[0] = "15757831883";//Object是用来存储方法的参数
//        object[1] = "123";//Object是用来存储方法的参数
//        object[2] = "123";//Object是用来存储方法的参数
//        try {
//            call = (Call) service.createCall();
//
//            call.setTargetEndpointAddress(endpoint);// 远程调用路径
////	            call.setOperationName("SendSMS");// 调用的方法名
//            call.setOperationName(new QName("http://tempuri.org/","SendSMS"));
//            call.setSOAPActionURI("http://tempuri.org/SendSMS");
//
//            // 设置参数名:
//            call.addParameter(new QName("http://tempuri.org/","tel"), // 参数名
//                    XMLType.XSD_STRING,// 参数类型:String
//                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
//            call.addParameter(new QName("http://tempuri.org/","type"), // 参数名
//                    XMLType.XSD_STRING,// 参数类型:String
//                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
//            call.addParameter(new QName("http://tempuri.org/","code"), // 参数名
//                    XMLType.XSD_STRING,// 参数类型:String
//                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
//
//            // 设置返回值类型：
//            call.setReturnType(XMLType.XSD_STRING);// 返回值类型：String
//
//            result = (String) call.invoke(object);// 远程调用
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        WebServiceTest t = new WebServiceTest();
//        String result = t.invokeRemoteFuc();
//        System.out.println(result);
//    }
//
//}
