import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class FileHandlingProject 
//reading the file
{ 
  public static List<String> readFileInList(String fileName) 
  { 
  
    List<String> lines = Collections.emptyList(); //creates an empty list
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
  //writing in file
  private static void createFileUsingFileClass() throws IOException
  {
        File file = new File("E://Files//testFile1.txt");

        //Create the file
        if (file.createNewFile()==true){
          System.out.println("File is created!");
        }else{
          System.out.println("File already exists.");
        }
         
        //Write Content in file
        FileWriter writer = new FileWriter(file);
        writer.write("Test data 14-05-22");
        
        //appending in file
        writer.append("appending in testfile1");
        writer.close();
  }

  public static void main(String[] args) throws IOException
  { //creating the file
    createFileUsingFileClass();
      //reading the file
      
      List l = readFileInList("E://Files//testFile1.txt"); 
      Iterator<String> itr = l.iterator(); 
      while (itr.hasNext()) 
        System.out.println(itr.next());
  } 
}
