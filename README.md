# Student-Exam-Eligibility
A Java console application that determines whether a student is eligible to write the examination based on attendance percentage.

# Student Exam Eligibility Calculator

## Description

The Student Exam Eligibility Calculator is a simple Java console application that calculates a student's attendance percentage and determines whether they are eligible to appear for the examination. The application follows the common academic rule that students must maintain at least **75% attendance** to be eligible for exams.

## Features

- Accepts the total number of working days.
- Accepts the number of days attended.
- Calculates the attendance percentage.
- Determines exam eligibility based on attendance.
- Displays the eligibility result.

## Technologies Used

- Java
- Scanner Class
- Conditional Statements (`if-else`)

## Eligibility Criteria

| Criteria | Requirement |
|----------|-------------|
| Minimum Attendance | 75% |

## How It Works

1. Enter the total number of working days.
2. Enter the number of days attended.
3. The application calculates the attendance percentage.
4. If attendance is **75% or above**, the student is eligible to write the examination.
5. Otherwise, the student is not eligible.

## Sample Output

```
Student Exam Eligibility Checker

Enter the total number of working days (Usually 100 days): 100
Enter the number of attended days: 82

Your attendance: 82.0%

You are Eligible to write exam
```

### Another Example

```
Student Exam Eligibility Checker

Enter the total number of working days (Usually 100 days): 100
Enter the number of attended days: 60

Your attendance: 60.0%

You are Not Eligible to write exam !!!
```

## Project Structure

```
Student-Exam-Eligibility/
│
├── ExamEligibilityCalculator.java
├── README.md
└── LICENSE
```

## Author

**Jai Harish**
