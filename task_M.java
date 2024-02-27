import java.util.*;
class manage{
    int id;
    String description;
    String due;
    String sts;

    public manage(int id,String description,String due,String sts)
    {
        this.id=id;
        this.description=description;
        this.due=due;
        this.sts=sts;

    }

    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Description : "+description);
        System.out.println("Duedate : "+due);
        System.out.println("Status : "+sts);
    }

    public int ID()
    {
        return id;
    }
    public String des()
    {
        return description;
    }
    public String Duedate()
    {
        return due;
    }
    public String Status()
    {
        return sts;
    }
}


    class todo
    {
        ArrayList<manage> a = new ArrayList<>();

        public void add1(manage t)
        {
            a.add(t);
        }
        public void delete(int id)
        {
            int l=a.size();
            for(int i=0;i<l;i++)
            {
                if(a.get(i).ID() ==  id)
                {
                    a.remove(i);
                    return;
                }
            }
            System.out.println("ID not found...");
        }
        public void displayALL()
        {
            for(manage t:a)
            {
                t.display();
                System.out.println();
            }
        }
     }

     public class task_M{
        public static void main(String[] args) {
            todo k = new todo();
            Scanner s= new Scanner(System.in);
            int choice;

            manage m1=new manage(1,"Homework","2024-09-05","Not completed");
            manage m2=new manage(2,"Sell products","2024-10-15","Completed");
            manage m3=new manage(3,"Buy beauty products","2024-09-01","completed");

            k.add1(m1);
            k.add1(m2);
            k.add1(m3);

            while(true)
            {
            System.out.println("\n1. Add Task\n2. Delete Task\n3. Display All Tasks\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            switch(choice)
            {
                case 1:
                System.out.print("Enter task description: ");
                s.nextLine(); 
                String description = s.nextLine();
                System.out.print("Enter due date: ");
                String due = s.nextLine();
		System.out.print("Enter status(Completed/ not completed): ");
                String sts = s.nextLine();
                manage t = new manage(k.a.size() + 1, description, due,sts);
                k.add1(t);
                System.out.println("Task added.....");
                break;

                case 2:
                System.out.print("Enter ID of task to be deleted: ");
                int id = s.nextInt();
                k.delete(id);
                break;

                case 3:
                    k.displayALL();
                    break;
                
                case 4:
                System.out.println("The program was completed successfully....");
		System.exit(0);
                break;

                default:
                System.out.println("Invalid choice...");
            
            }


        }
     }
}