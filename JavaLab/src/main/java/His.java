 import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

    public class His{
        public static void main(String... args) throws IOException {
            String fileName=("DelliJ\\Sample1\\src\\test\\java\\Testing");

            File fileToBeHidden = new File(fileName);


            Path path = FileSystems.getDefault().getPath(fileName);


            // Hide file;
            Files.setAttribute(path, "dos:hidden", false);

            // Now, let's test whether file has been hidden or not
            boolean fileHidden = fileToBeHidden.isHidden();

            if (fileHidden)
                System.out.println(fileName + " is hidden ");
            else if(fileHidden) {
                System.out.println(fileName + " is hidden ");
            }
            else
                System.out.println(fileName + " isn't hidden ");


        }}

