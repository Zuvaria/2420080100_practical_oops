package myProject;

public class datatypes {

   
    int[] numbers;  
    double average;

    
    public datatypes(int[] numbers) {
        this.numbers = numbers;
    }

    
    public void calculateAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;  
        }
       
        average = (double) sum / numbers.length;
    }

    
    public void displayResult() {
        System.out.println("Average: " + average);

        if (average >= 50) {
            System.out.println("Average is high.");
        } else {
            System.out.println("Average is low.");
        }
    }

    
    public static void main(String[] args) {
        int[] sampleNumbers = {45, 67, 89, 34, 56};

        
        datatypes dt = new datatypes(sampleNumbers);

        
        dt.calculateAverage();
        dt.displayResult();
    }
}

	   
