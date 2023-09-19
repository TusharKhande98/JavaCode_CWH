public class CWH_16_conditionals {
    public static void main(String[] args) {
        int age = 20;
        if(age>18){
            System.out.println("Yes bro, you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet!");
        }

        int convent = 5;
        if(convent!=4){  // '!=' means 'not equal to' its a relational operator(it has fixed value only)
            System.out.println("you cannot take admission in KG-II, complete KG-I or do admission in class-1");
        }
        else{
            System.out.println("you can take admission in KG-II");
        }

        int licence = 20;
        if(licence==18){ // if we write 'licence=18' then its a error in JAVA, cauz it iake it as a 'int' & we need boolean value here... see below code
            System.out.println("Yes bro, you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet!");
        }

        int ageX = 18;
        boolean cond = (ageX==18);

        if(cond){
            System.out.println("Yes bro, you can vote in election!");
        }
        else{
            System.out.println("Can't vote");
        }

    }
}
