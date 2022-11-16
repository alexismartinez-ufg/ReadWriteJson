import java.io.*;


public class Main
{
    public static void main(String[] args)
    {
        User usuario = new User();
        usuario.setIdUser(1);
        usuario.setUsername("Alexis");
        usuario.setPassword("1234");

        CreateTxt();
        WithBufferLines(usuario);
    }

    public static void CreateTxt()
    {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WriteUserTxt(User usuario){
        try {
            FileWriter fw = new FileWriter("filename.txt");

            for (int i = 0; i < 10; i++) {
                fw.write("something");
            }

            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WithBufferLines(User usuario){
        try {
            File myWriter = new File("filename.txt");
            FileOutputStream fos = new FileOutputStream(myWriter);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (int i = 0; i < 10; i++) {
                bw.write("Usuario: \"+usuario.getUsername()+\" Contraseña: \"+usuario.getPassword()");
                bw.newLine();
            }
            bw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

