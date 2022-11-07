
import java.io.*;

public class Main {
    main(String[] args) throws IOException
    {

        System.out.println("Введите имя текстового файла, а затем текст, который будет содержаться в нём:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());

        while (true)
        {
            String data = reader.readLine();
            if(data.equals("exit")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();

    }


}
}