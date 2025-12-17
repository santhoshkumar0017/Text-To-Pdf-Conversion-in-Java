import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;


public class TextToPdf {

    static void main(String[] args) {
        TextFileToPdfDocument();
    }

    static void TextFileToPdfDocument(){

        String textFilePath="C:\\Users\\BLUE SCOPE\\Documents\\SDLC type.txt";
        String pdfFilePath="output.pdf";

        Document document = new Document();

        try{

            PdfWriter.getInstance(document,new FileOutputStream(pdfFilePath));

            document.open();

            BufferedReader bufferedReader= new BufferedReader(new FileReader(textFilePath));
            String line;
            document.add(new Paragraph("SDLC :"));
            while ((line = bufferedReader.readLine())!=null){
               document.add(new Paragraph(line));
            }

            bufferedReader.close();
            document.close();

            System.out.println("pdf created successfully");

        }
        catch (Exception e){
               e.printStackTrace();
        }


    }
}
