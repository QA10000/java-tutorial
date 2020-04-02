package io;

import java.io.*;

public class IoDemo {

    public static void main(String[] args) {
      //  createFile(); // to create file
       // readFileByBufferedInputStream(); // to read file content
       // readFileByBufferedReader(); // to to read file content using buffered reader
       // renameFile(); // renaming the file
       // deleteFile(); // deleting the file // ok
       // writeToFileByFileOutputStream();
       // writeToFileByBufferWriter();
        appendToFile(); // yes it is lot so will read it // Thank you
    }

    public static void createFile() {
        File file = new File("C:\\Temp\\newfile.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            if(isFileCreated) {
                System.out.println("File is successfully created");
            } else {
                System.out.println("File is already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileByBufferedInputStream() {
        File file = new File("C:\\Temp\\newfile.txt");
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            while(bufferedInputStream.available() > 0) {
                System.out.print((char) bufferedInputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { // what line?
            e.printStackTrace(); // no
        }
        finally {
            try {
                if(bufferedInputStream != null && fileInputStream != null) {
                    fileInputStream.close();
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();// ok
            }

        }
    }

    public static void readFileByBufferedReader() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Temp\\newfile.txt"));
            String contentLine = bufferedReader.readLine();
            while(contentLine != null) {
                System.out.println(contentLine);
                contentLine = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void renameFile() {
        File oldFile = new File("C:\\Temp\\newfile.txt");
        File newFile = new File("C:\\Temp\\newfile1.txt");
        boolean flag = oldFile.renameTo(newFile);
        if(flag) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("File rename failed");
        }
    }

    public static void deleteFile() {
        File file = new File("C:\\Temp\\newfile.txt");
        if(file.delete()) {
            System.out.println(file.getName() + " is deleted");
        } else {
            System.out.println("File is not deleted");
        }
    }

    public static void writeToFileByFileOutputStream() {
        FileOutputStream fileOutputStream = null;
        File file;
        String myContent = "I have to write a string to the file";

        file = new File("C:\\Temp\\newfile.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File does not exist. Hence created a file");
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] byteArray = myContent.getBytes();
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            System.out.println("File is written successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeToFileByBufferWriter() {
        BufferedWriter bufferedWriter = null;
        try {
            String myContent = "This is my file";
            File file = new File("C:\\Temp\\newfile.txt");
            if(!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(myContent);
            System.out.println("The File is written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void appendToFile() {
        String myContent = "This is the content to be appended";
        File file = new File("C:\\Temp\\newfile.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
                System.out.println( "File does not exist. Hence create a new file" );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            FileWriter fileWriter = null; // it will be adding to existing file,
            try {
                fileWriter = new FileWriter(file, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write(myContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Text is successfully appended at the end of the file");
    }
}
