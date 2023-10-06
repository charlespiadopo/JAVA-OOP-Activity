package Main;

public class student {

    String FirstName, lastName, year, course, section;
    float midtermGrade, finalGrade;

    student(String FirstName,
            String lastName,
            String year,
            String course,
            String section,
            float midtermGrade,
            float finalGrade){

        this.FirstName = FirstName;
        this.lastName = lastName ;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void intoduceSelf() {
        System.out.println("Full Name : " + FirstName + "" + lastName);
        System.out.println("Course : " + course);
        System.out.println("Year : " + year);
        System.out.println("Section : " + section);
    }

    void evaluateGrade() {
        float average = (midtermGrade + finalGrade) / 2;
        System.out.println("Full Name : " + FirstName + " " + lastName);
        System.out.println("Average : " + average);

        String remark = "";

        if (average > 100) remark = "Invalid Grade";
        else if (average >= 98) remark = "With Highest Honors";
        else if (average >= 95) remark = "With High Honors";
        else if (average >= 90) remark = "With Honors";
        else if (average >= 75) remark = "Passed";
        else remark = "Failed";


        System.out.println("Remarks : " + remark);

        }
    }




