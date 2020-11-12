package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeAll implements Serializable{
    private List<Shape> list=new ArrayList<>();
private String filename;

SerializeAll(String string){
    this.filename=string;
}

    public void save(List<Shape> list) {
        try(FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file)) {

            objectOutputStream.writeObject(list);


        }
        catch(NullPointerException d){
            throw new NullPointerException("File is empty");
        }
        catch(FileNotFoundException d)
        {
            throw new RuntimeException("File dont found");

        }
        catch(IOException d){
            throw new RuntimeException("Exception");
        }


    }

    public List<Shape> load(){

        List<Shape> newlist = new ArrayList<>();
        try(FileInputStream file = new FileInputStream(filename);
       ObjectInputStream objectOutputStream = new ObjectInputStream(file)) {

            newlist=(List<Shape>) objectOutputStream.readObject();


        }
        catch(NullPointerException d){
            throw new NullPointerException("File is empty");
        }
        catch(FileNotFoundException d)
        {
            throw new RuntimeException("File dont found");

        }
        catch(IOException d){
            throw new RuntimeException("Exception");
        }
        catch (ClassNotFoundException d){
            throw new RuntimeException("Class not found");
        }

        return newlist;
    }
}
