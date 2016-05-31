package fileparse1;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author akshaya
 */
public class FileParse1 {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws SAXException, ParserConfigurationException {
        // TODO code application logic here
        try{
    File input= new File("address1.xml");
    DocumentBuilderFactory db= DocumentBuilderFactory.newInstance();
    DocumentBuilder dbld= db.newDocumentBuilder();
    Document doc = dbld.parse(input);
    doc.getDocumentElement().normalize();
   
    NodeList nlist = doc.getElementsByTagName("name");
     for (int temp = 0; temp < nlist.getLength(); temp++) {
            Node nNode = nlist.item(temp);
            
            System.out.print(nNode.getTextContent()+",\n");
    
            }  
      NodeList nlist1 = doc.getElementsByTagName("streetnumber");
     for (int temp = 0; temp < nlist1.getLength(); temp++) {
            Node nNode = nlist1.item(temp);
            
            System.out.print(nNode.getTextContent()+" ");
    
            }  
      NodeList nlist2 = doc.getElementsByTagName("streetname");
     for (int temp = 0; temp < nlist2.getLength(); temp++) {
            Node nNode = nlist2.item(temp);
            
            System.out.print(nNode.getTextContent()+",\n");
    
            }  
      NodeList nlist3 = doc.getElementsByTagName("secondaryaddress");
     for (int temp = 0; temp < nlist3.getLength(); temp++) {
            Node nNode = nlist3.item(temp);
            
            System.out.print(nNode.getTextContent()+",\n");
    
            }  
      NodeList nlist4 = doc.getElementsByTagName("city");
     for (int temp = 0; temp < nlist4.getLength(); temp++) {
            Node nNode = nlist4.item(temp);
            
            System.out.print(nNode.getTextContent()+",\n");
    
            } 
      NodeList nlist5 = doc.getElementsByTagName("statecode");
     for (int temp = 0; temp < nlist5.getLength(); temp++) {
            Node nNode = nlist5.item(temp);
            
            System.out.print(nNode.getTextContent()+" ");
    
            }  
      NodeList nlist6 = doc.getElementsByTagName("zipcode");
     for (int temp = 0; temp < nlist6.getLength(); temp++) {
            Node nNode = nlist6.item(temp);
            
            System.out.print(nNode.getTextContent()+".");
    
            }  
        }catch(ParserConfigurationException | SAXException | IOException e){
            System.out.println("ERROR"+e);
      } 


    }
}
    

