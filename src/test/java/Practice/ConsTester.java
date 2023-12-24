package Practice;

import java.util.*;

public class ConsTester {

    public static void main(String[] args) {
        ConstructorPractice obj1=new ConstructorPractice("ahmed");
        ConstructorPractice obj2=new ConstructorPractice("farafiro");
        String []obj={new String("ahmed2"),new String("far2")};



       // System.out.println(obj1.getAccountNumber());
        //System.out.println(obj2.getUserName());


     /*   System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(Arrays.toString(obj));*/


        List<String> names= new ArrayList<>();
        names.add("Ahmed");
        names.add("Marina");
       // printInfo(names.get(0), names.get(1) );
       // names.forEach(x-> System.out.println(x));
        int nums=1234;
        Random random=new Random(nums);
        for (int i = 0; i <6 ; i++) {
           int ran= random.nextInt(1000);
            System.out.println(ran);
        }





        Iterator itr=names.iterator();
        while (itr.hasNext()){
            String list = itr.next().toString();


            //System.out.println(list.repeat(3)+" ");

        }

}    public static void printInfo(String name1 ,String name2){
        System.out.println(name1 +" "+name2);
    }



}
