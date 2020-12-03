package com.aakash.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QrCodeTest {

	public static void main(String[] args) {
		
		//String sContent_p = "CoC/CoI/NCR No. 2065-1625209 \n Exporter Name PT.ELANG PERDANA TYRE INDUSTRY AND THIS IS TEST CHECK FOR MAX LENGTH WHERE QR CODE IMA TAKING THE B \n Invoice No. 0887/EPTI/2017 FOB Value 36952.27 USD \n No of Line Items 10 \n http://10.195.18.138:9090/ViewContent/?token=E7B66649AD5BF3870AFB85DFAC4508665E09880BC676F1076F15A91B8BFAE32A";
		//String sContent_p = "CoC/CoI/NCR No. 0028-1169119 Exporter Name GE PACIFIC PTE LTD - GE INDUSTRIAL Invoice No. FI89746A FOB Value 255000 USD No of Line Items 2 https://astra-portal-test.intertek.com/ViewContent/?token=75D88EE0A4D1E6FD048C4EA069640BE781F0DFD14A82225C06C631A2C2CB3261";
		String sContent_p = "Botswana SIIR Registration No.: BTS R-506219 Registrant Name: RENAULT  V.I Issuance Date: 17 August 2017 Expiry Date: 15 May 2018 https://astra-portal-test.intertek.com/ViewContent/?token=2EABAEEDE76D609C0DBDAFBE7B30E75B7003DA711675104EABA5CD30E636737C";
	
		BufferedImage image;
		try {
			image = createQrCode(sContent_p, 165);
			String szQRFormatExt="png";
			String sFullPath ="D:\\All_Workspace\\Java-J2EE\\MyTestProjects\\TestQROutput\\cert-276581718127.png";
			ImageIO.write(image, szQRFormatExt,  new File(sFullPath));
			System.out.println("done");
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static BufferedImage createQrCode(String content, int qrCodeSize) throws WriterException, IOException    
	{ 
		String charset = "UTF-8"; // or "ISO-8859-1"
      // Create the ByteMatrix for the QR-Code that encodes the given String. 
		//oLog_c.debug("Content: "+content.length()); 
      Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>(); 
      hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M); 

      QRCodeWriter qrCodeWriter = new QRCodeWriter(); 
      BitMatrix byteMatrix = qrCodeWriter.encode(new String(content.getBytes(charset), charset), BarcodeFormat.QR_CODE, qrCodeSize, qrCodeSize, hintMap); 

      // Make the BufferedImage that are to hold the QRCode 
      int matrixWidth = byteMatrix.getWidth(); 

      BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB); 
      image.createGraphics(); 

      Graphics2D graphics = (Graphics2D) image.getGraphics();
      graphics.fillRect(0, 0, matrixWidth, matrixWidth); 

      // Paint and save the image using the ByteMatrix 

      graphics.setColor(Color.BLACK); 

      for (int i = 0; i < matrixWidth; i++) 
      { 
          for (int j = 0; j < matrixWidth; j++) 
          { 
              if (byteMatrix.get(i, j) == true) 
              { 
                  graphics.fillRect(i, j, 1, 1); 
              } 
          } 
      } 
      return image; 
      //ImageIO.write(image, imageFormat, outputStream); 

	} 	
	
/*	public static void createQRCode(String qrCodeData, String filePath,
			String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
			throws WriterException, IOException 
	{
		BitMatrix matrix = new MultiFormatWriter().encode(
				new String(qrCodeData.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
		
		MatrixToImageWriter.writeToFile(matrix, "png", new File(filePath));
	}  
*/  
}
