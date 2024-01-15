package buoi1.bai1;

public class bai1 {
    public static void main(String[] args) {
        student st1 = new student("Nguyen Van A", 19,"Male");
        st1.ShowInfo1();
        student st2 = new student("Tran Thi B", 18, "Female");
        st2.ShowInfo1();
        teacher tc1 = new teacher("Nguyen Van X", 30, "Math");
        tc1.ShowInfo2();
        teacher tc2 = new teacher("Le Thi T", 30, "English");
        tc2.ShowInfo2();
    }
}

class student {
    String name;  // thuoc tinh
    int age;   // thuoc tinh
    String gender;    // thuoc tinh

    public student(String _name, int _age, String _gender) {
        name = _name;
        age = _age;
        gender = _gender;
    }

    public void ShowInfo1() {
        System.out.println("Name: "+ name +", Age: " + age +", Gender: " + gender);
    }
}
class teacher {
    String name;
    int age;
    String subject;

    public teacher(String _name, int _age, String _subject) {
        name = _name;
        age = _age;
        subject = _subject;
    }

    public void ShowInfo2() {
        System.out.println("Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}