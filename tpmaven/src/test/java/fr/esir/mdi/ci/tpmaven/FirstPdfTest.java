package fr.esir.mdi.ci.tpmaven;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import junit.framework.TestCase;

public class FirstPdfTest extends TestCase{
  
  public void testFirstPdf1() {
      Paragraph p = new Paragraph("Test Paragraphe");
      FirstPdf.addEmptyLine(p, 2);
      Paragraph result = new Paragraph("Test Paragraphe");
      result.add(new Paragraph(" "));
      result.add(new Paragraph(" "));
      assertEquals(p.getContent(), result.getContent());
  }
  
  public void testFirstPdf2()
  {
      try {
          Document document = new Document();
          PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
          document.open();
          String n = document.toString();
          FirstPdf.addTitlePage(document);
          assertNotSame(n, document.toString());
          document.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
