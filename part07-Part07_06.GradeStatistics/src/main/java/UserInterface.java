import java.util.Scanner;

public class UserInterface{
    
    private Scanner scanner;
    private Grades grades;
    public UserInterface(){
        this.scanner = new Scanner(System.in);
        this.grades = new Grades();
    }
    
    public void start(){
        
        this.readPoints();
        System.out.println("Point average (all): " + this.grades.average());
        System.out.println("Point average (passing): " + this.grades.averageOfPassing());
        System.out.println("Pass percentage: " + this.grades.passPercentage());
        this.printGradeDistribution();
        
    }
    //Takes in the grades from user and adds to GradeList and PointList
    public void readPoints(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int points  = Integer.valueOf(this.scanner.nextLine());
            
            if(points == -1){
                break;
            }else if(points < 0 || points > 100){
                continue;
            }else{
                this.grades.add(points);
            }
        }
    }
    //Prints stars equal to the quanity of a grade
    public void printStars(int count){
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
    }
    //Prints grades with stars beside it for each grade in the GradeList
    public void printGradeDistribution(){
        
        for(int i = 5; i >= 0; i--){
            int stars = this.grades.numberOfPoints(i);
            System.out.print(i + ": ");
            this.printStars(stars);
            System.out.println("");
        }
    }
    
}