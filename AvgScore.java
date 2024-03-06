package com.tap;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    @Override
    public int compareTo(Student other) {
        if (Double.compare(this.averageScore, other.averageScore) != 0) {
            return Double.compare(other.averageScore, this.averageScore); // Descending order of average scores
        } else {
            return this.name.compareTo(other.name); // Ascending order of names if average scores are equal
        }
    }

    @Override
    public String toString() {
        return name + ", " + averageScore;
    }
}

public class AvgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            String name = details[0].trim();
            int sum = 0;
            for (int j = 1; j < details.length; j++) {
                sum += Integer.parseInt(details[j].trim());
            }
            double averageScore = (double) sum / (details.length - 1);
            students.add(new Student(name, averageScore));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.printf("%s, %.1f\n", student.name, student.averageScore);
        }
    }
}


/*Java program- you are given a list of students and their corresponding scores in different subjects. Your task is to find and print the average score of each student along with their names . Additionally print the students in descending order of their average scores. If 2 students have same average score print them in ascending order of their names.
Input format:
The first line of input corresponds to the number of students ‘n’.
The next ‘n’ lines of input contain student details in CSV format:  StudentName, Subject1, Subject2, Subject3.
Output format:
Print the average score of each student along with their names in CSV format: StudentName, Average Score.
Print the students in descending order of their average scores.
If 2  students have same average score print them in ascending order of their names.
Sample input:
4
Alice,75,80,90
Bob,85,90,80
Charlie,92,88,78
David,80,85,88

Sample output
Charlie, 86.0
Bob, 85.0
David, 84.3
Alice, 81.7
*/
