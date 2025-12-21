# Student Management System
A simple Java application to manage students and courses with basic object-oriented programming concepts.

## What it does
This program lets you create students, track their grades and credits, and assign them to courses. It shows student lists, finds top performers, and calculates course averages.

## Classes Overview

**Student**
- Stores student info: name, ID, major, GPA, and credits
- Methods to update grades, add credits, and check if they're an honor student

**Course**
- Represents a course with a name, instructor, and student list
- Calculates the average GPA of all students in the course

**Main**
- Runs the program with sample data
- Finds the top student, counts honor students, and totals all credits

## Example Output

```
STUDENT MANAGEMENT SYSTEM
    
STUDENT LIST
Student: Khan Dosayev  ID: 1  GPA: 3.8  Credits: 45
Student: Ermakhan Tokayev  ID: 2  GPA: 3.9  Credits: 34
Student: Aigerim Utalieva  ID: 3  GPA: 3.4  Credits: 36
Student: Daniyar Zhumabek  ID: 4  GPA: 3.6  Credits: 48
Student: Assel Abdrakhmanov  ID: 5  GPA: 4.0  Credits: 52

STATISTICS
Top student: Assel Abdrakhmanov (GPA: 4.0)
Honor students: 4
Total credits: 215

COURSE INFO
Course: Java Programming  Instructor: Prof. Aidana  Average GPA: 3.74
```
