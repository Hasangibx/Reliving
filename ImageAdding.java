package apointment;

import com.itextpdf.io.image.ImageData; 
import com.itextpdf.io.image.ImageDataFactory; 

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph; 
public class ImageAdding

{
	
public static void main(String[] args) throws Exception 
	 {  
	
//		a=1;
//		System.out.println(a);
//		System.out.println(new A().a);
//		new ImageAdding();

		             
		      
		      // Creating a PdfWriter       
		      String dest = "D:\\Zydni-Reliving Letter.pdf";       
		      PdfWriter writer = new PdfWriter(dest);        
		      
		      // Creating a PdfDocument       
		      PdfDocument pdf = new PdfDocument(writer);              
		      
		      // Creating a Document        
		      Document document = new Document(pdf);      
		      
		      
		      
		      // Creating an ImageData object       
		      String imFile = "D:\\Zydni-logo.png";       
		      ImageData data = ImageDataFactory.create(imFile);              
		      
		      
		      String para1="Ref. No.: HR/20-21/RL/ZYDNI/1586";
		      String para2="July 15, 2023";
		      String para3="MOHAMMED HASAN C ";
		      String para4="Dear Hasan,";
		      
		      String para5="With reference to your resignation dated May 02, 2022. we hereby inform you that it has been \r\n"
		      		        + "accepted. You have been relieved of your duties from the closing hours of June 30, 2022";
		      
		      
		      String para6="As per the service records, here are your details at the time of leaving of the company:";
		      
		      List list=new List();
		      List list1=new List();
		     List list2=new List(); 
		     List list3=new List(); 
		      list.add("DATE OF JOINING              :  September 26,2022");
		      
		      list.add("DESIGNATION                  :   Java Developer  ");
		      
		      list.add("DEPARTMENT                   :    Developer Team ");       

		      list.add("LOCATION                     :        Chennai     ");
		      
		      
		      
		      String para7="You have been an integral part of our growth and we appreciate your contribution during this journey.";
		      
		      String para9="\n";
		      
		      String para8=  "While we wish that this association could have been longer, we hope you achieve every success in "
		      		       + "your future endeavours. We draw your attention to your continuing obligation of confidentiality  "
		      	           + "with respect to any proprietary and confidential information of Karix Mobile Pvt. Ltd. and its   "
		      		       + "subsidiaries and affiliates that you may have accessed during the course of your employment.";
		      
		      String para10="\n";
		      
		      list1.add("For Zydni Software Solution Pvt.Ltd");
		      
		     String para11="\n";
		     
		     
		     list2.add("SHOUIB MOHAMMED");
		     list2.add("Chief Executive Officer");
		     
		     
		     String para12="\n";
		     
		     
		     list3.add("For Contuct us,");
		     
		     String Para13=" Zydni Software Solution";
		     String para14=" Near Spenzer Plaza Chennai 600 005";
		     String para15=" +91 1020304050";
		      Paragraph paragraph1=new Paragraph(para1);
		      Paragraph paragraph2=new Paragraph(para2);
		      Paragraph paragraph3=new Paragraph(para3);
		      Paragraph paragraph4=new Paragraph(para4);
		      Paragraph paragraph5=new Paragraph(para5);
		      Paragraph paragraph6=new Paragraph(para6);
		      Paragraph paragraph7=new Paragraph(para7);
		      Paragraph paragraph8=new Paragraph(para8);
		      Paragraph paragraph9=new Paragraph(para9);
              Paragraph paragraph10=new Paragraph(para10);		   
		      Paragraph paragraph11=new Paragraph(para11);
              Paragraph paragraph12=new Paragraph(para12);
		      Paragraph paragraph13=new Paragraph(Para13);
		      Paragraph paragraph14=new Paragraph(para14);
		      Paragraph paragraph15=new Paragraph(para15);
		      // Creating an Image object        
              
		      Image image = new Image(data);                        
		      
		      // Adding image to the document       
		     document.add(image);  
		     document.add(paragraph1);
		     document.add(paragraph2);
		     document.add(paragraph3);
		     document.add(paragraph4);
		     document.add(paragraph5);
		     document.add(paragraph6);
		     
		     document.add(list);
		     
		     document.add(paragraph7);
		     document.add(paragraph9);
		     document.add(paragraph8);
		     document.add(paragraph10);
		     document.add(list1);
		     
		     document.add(paragraph11);
		     document.add(list2);
		     document.add(paragraph12);
		     document.add(list3);
		     document.add(paragraph13);
		     document.add(paragraph14);
		     document.add(paragraph15);
		     
		      // Closing the document       
		      document.close();              
		      
		      System.out.println("Image added");    
		   }
		}
	
