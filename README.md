# # 🎓 College Management System

This is a **College Management System (CMS)** developed as part of our **2nd year Database Management Systems (DBMS) mini project**. It is a Java Swing-based desktop application backed by **MySQL**, designed to automate and manage various administrative and academic activities within a college.

## 📌 Project Overview

The CMS streamlines key operations such as:
- Student and faculty record management
- Leave applications
- Examination result entry and display
- Fee structure management
- Basic utility integrations like Calculator and Notepad

All the data is stored in a **centralized MySQL database**, ensuring efficient data handling and minimal redundancy.

## 🛠️ Tech Stack

| Layer            | Technology        |
|------------------|------------------|
| Frontend (UI)    | Java Swing       |
| Backend Logic    | Java             |
| Database         | MySQL (JDBC)     |
| Tools Used       | NetBeans / IntelliJ, MySQL Workbench |

## ✨ Features

- 🧑‍🎓 Add/View/Update Student and Faculty Details  
- 📝 Apply and Track Leave (Students & Faculty)  
- 🧾 Enter and View Examination Marks  
- 💰 Display Course-wise Fee Structure and Payment Form  
- 🖥️ Utility Shortcuts: Launch Calculator and Notepad  
- 🔒 Login Page for Authentication

## 📁 Folder Structure

college.management.system/
├── Project.java # Main dashboard with menu options
├── Conn.java # MySQL database connection
├── AddStudent.java # Form to add new students
├── AddTeacher.java # Form to add new teachers
├── UpdateStudent.java # Update student records
├── UpdateTeacher.java # Update teacher records
├── StudentDetails.java # View all students
├── TeacherDetails.java # View all teachers
├── StudentLeave.java # Apply leave for students
├── TeacherLeave.java # Apply leave for faculty
├── StudentLeaveDetails.java # View student leaves
├── TeacherLeaveDetails.java # View faculty leaves
├── EnterMarks.java # Enter semester marks
├── ExaminationDetails.java # View student exam results
├── FeeStructure.java # Course-wise fee structure
├── StudentFeeForm.java # Semester fee entry form
├── About.java # About project popup
└── icons/third.jpg # Background image


## 🧮 Database Schema

The following tables are used in the project:

- `teachers`
- `teacherleave`
- `students`
- `studentleave`
- `subject`
- `marks`
- `fee`
- `login`


## 🖼️ Screenshots

<img width="1158" height="559" alt="image" src="https://github.com/user-attachments/assets/db368141-e586-4571-a762-c2a72516ba25" />

---

<img width="1180" height="611" alt="image" src="https://github.com/user-attachments/assets/202c0c0a-48c3-443d-af13-7c726497dbfd" />

---

<img width="1233" height="609" alt="image" src="https://github.com/user-attachments/assets/2b0631c9-5f4f-40e7-ab3f-072d20e6588b" />

---

<img width="1153" height="747" alt="image" src="https://github.com/user-attachments/assets/2dde87e3-25e1-421c-8139-a9b6176f2834" />

---

<img width="1212" height="961" alt="image" src="https://github.com/user-attachments/assets/bfd9ff61-cf13-4cb1-93a5-46c28de730a9" />

---

<img width="1255" height="1260" alt="image" src="https://github.com/user-attachments/assets/e046d33b-fc88-422a-a14c-17045aa5ea24" />

---

<img width="1179" height="791" alt="image" src="https://github.com/user-attachments/assets/4c706854-709c-4141-842c-4a6d271b765c" />

---

<img width="1106" height="1421" alt="image" src="https://github.com/user-attachments/assets/3e51df49-d1af-4847-88db-9db888235d7c" />

---

<img width="1032" height="1333" alt="image" src="https://github.com/user-attachments/assets/7d93d250-c078-4571-be35-bf3088fd638d" />

---

<img width="1203" height="1346" alt="image" src="https://github.com/user-attachments/assets/8ce836bf-ad04-48e3-adc2-27885caf8db9" />

---


## 👥 Authors
Ajay Dilip
Allwin Nebu
Harith S
Jenna Maria Joby
Jomin J Joseph
Sebin Sabu


## 📜 License
This project is for academic purposes only and is not intended for production use.
