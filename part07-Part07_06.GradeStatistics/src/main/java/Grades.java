import java.util.ArrayList;
public class Grades{
    
    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesToPoints;
    
    public Grades(){
        this.grades = new ArrayList<>();
        this.gradesToPoints = new ArrayList<>();
    }
    
    //Adds the points to a list and adds converted  grades to list
    public void add(int grade){
        this.grades.add(grade);
        this.gradesToPoints.add(this.pointToGrade(grade));
    }
    //Takes the average of points
    public double average(){
        double sumOfGrades = 0;
        for(int i = 0; i < grades.size(); i++){
            
            sumOfGrades = sumOfGrades + this.grades.get(i);
        }
        return sumOfGrades / this.grades.size();
    }
    //Takes the average of grades above 50
    public double averageOfPassing(){
        int sum = 0;
        int passingScores = 0;
        for(int holder : this.grades){
            if(holder >= 50){
                sum = sum + holder;
                passingScores++;
            }
        }
        return sum / passingScores;
    }
    //Give a percentage of passing points relative to the whole list
    public double passPercentage(){
        int scoreSum = 0;
        int passingScores = 0;
        for(int i = 0; i < this.grades.size(); i++){
            int currentGrade = this.grades.get(i);
            if(currentGrade >= 50){
                scoreSum = scoreSum + currentGrade;
                passingScores++;
            }
        }
        return (double) 100 * passingScores / this.grades.size();
    }
    //Converts points to grades
    public int pointToGrade(int points){
        
        int grade = 0;
        
        if(points < 50){
            grade = 0;
        }else if(points < 60){
            grade = 1;
        }else if(points < 70){
            grade = 2;
        }else if(points < 80){
            grade = 3;
        }else if(points < 90){
            grade = 4;
        }else if(points <= 100){
            grade = 5;
        }
        return grade;
    }
    //Tells how many of a point is in the list
    public int numberOfPoints(int grade){
        int count = 0;
        for(int holder : this.gradesToPoints){
            if(grade == holder){
                count++;
            }
        }
        return count;
    }
    //Prints the points list
    public void printPoints(){
        for(int holder : this.gradesToPoints){
            System.out.println(holder);
        }
    }
}