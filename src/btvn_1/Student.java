package btvn_1;



public class Student {
	private String firstName;
    private String lastName;
    private String birthdate;
    private String address;
    private String className;
    private double oopScore; // Lập trình hướng đối tượng
    private double projectManagementScore; // Quản lý dự án
    private double machineLearningScore; // Học Máy
    private double databaseScore; // Cơ sở dữ liệu
    private double mobileAppDevelopmentScore; // Lập trình ứng dụng cho TBDĐ

    public Student(String firstName, String lastName, String birthdate, String address, String className,
                   double oopScore, double projectManagementScore, double machineLearningScore,
                   double databaseScore, double mobileAppDevelopmentScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.className = className;
        this.oopScore = oopScore;
        this.projectManagementScore = projectManagementScore;
        this.machineLearningScore = machineLearningScore;
        this.databaseScore = databaseScore;
        this.mobileAppDevelopmentScore = mobileAppDevelopmentScore;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public String getClassName() {
        return className;
    }

    public double getOopScore() {
        return oopScore;
    }

    public double getProjectManagementScore() {
        return projectManagementScore;
    }

    public double getMachineLearningScore() {
        return machineLearningScore;
    }

    public double getDatabaseScore() {
        return databaseScore;
    }

    public double getMobileAppDevelopmentScore() {
        return mobileAppDevelopmentScore;
    }

    public double getAverageScore() {
        return (oopScore + projectManagementScore + machineLearningScore + databaseScore + mobileAppDevelopmentScore) / 5;
    }

    public String getRank() {
        double average = getAverageScore();
        if (average >= 8.5) return "A";
        else if (average >= 7.0) return "B";
        else if (average >= 5.5) return "C";
        else if (average >= 4.0) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", className='" + className + '\'' +
                ", oopScore=" + oopScore +
                ", projectManagementScore=" + projectManagementScore +
                ", machineLearningScore=" + machineLearningScore +
                ", databaseScore=" + databaseScore +
                ", mobileAppDevelopmentScore=" + mobileAppDevelopmentScore +
                ", averageScore=" + getAverageScore() +
                ", rank=" + getRank() +
                '}';
    }
}
    

