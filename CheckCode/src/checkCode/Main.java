package checkCode;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private List<MyClass> myClasses = new ArrayList<>();

    public Main(){
    }


    public boolean isExistId(int id){
        for (MyClass idcheck :myClasses) {
            if (idcheck.getId()==id){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return myClasses.size();
    }

    public MyClass remove(int idRemove){
        MyClass obj=null;
        for (int i = 0;i<myClasses.size();i++){
            if (idRemove == myClasses.get(i).getId()){
                obj = myClasses.get(i);
                myClasses.remove(i);
            }
        }
        return obj;
    }

}


