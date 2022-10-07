package com.example.slt;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

public class FirstPdfTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FirstPdfTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdfTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFirstPdfTitle()
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
