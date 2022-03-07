package com.example.ff;

import javax.swing.*;
import java.sql.*;

public class MyJDBC {
    public static String maxGPA = "", Name = "",name1,name2,name3,name4,name5,name6,grade1,grade2,grade3,grade4,grade5,grade6
            ,depart1,depart2,depart3,depart4,depart5,depart6;

    /*       getting connection function         */
    public static Connection getConnection() {
        final String URL = "jdbc:mysql://localhost:3306/fxdata";
        final String USER = "root";
        final String PASS = "root";
        try {
            Connection conn = DriverManager.getConnection(URL, USER,"");
            return conn;
        } catch (SQLException e) {
            System.out.println("Your connection to database failed!");
            e.printStackTrace();
            return null;
        }
    }
    /*     End getting connection function          */

    /*      Searching in my database                */
    public static boolean searchAdmin(String id, String username, String password) {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select id, username, password from admins where id = ? and username= ? and password= ?";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);
            prepStat.setString(1, id);
            prepStat.setString(2, username);
            prepStat.setString(3, password);
            ResultSet results = prepStat.executeQuery();
            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return existed;
    }

    public static boolean searchAdminID(String id) {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select id from admins where id = ? ";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);
            prepStat.setString(1, id);
            ResultSet results = prepStat.executeQuery();
            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return existed;
    }

    /**********************************************************/
    public static boolean searchStudent(String id) {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select id from student where id=?";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);
            prepStat.setString(1, id);
            ResultSet results = prepStat.executeQuery();
            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return existed;
    }

    /******************************************************************/

    public static boolean searchGrade(String id) {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select id from student where id=?";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);
            prepStat.setString(1, id);
            ResultSet results = prepStat.executeQuery();
            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return existed;
    }

    public static boolean searchMax() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) ,round(max(mainGpa),4)" +
                    "from student where mainGpa = (select round(max(mainGpa),4) from student)";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            while (results.next()) {
                Name=results.getString(c);
                maxGPA = results.getString(n);
                c++;
                n++;
            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }

    /********************************************************************/

    public static boolean searchMaxC1() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course1Grade))" +
                    "from student where course1Grade = (select max(round(course1Grade)) from student) ";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            int m= 3;
            while (results.next()) {
                name1=results.getString(c);
                grade1 = results.getString(n);

                c++;
                n++;

            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }
    /**************************************************/
    public static boolean searchMaxC2() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course2Grade))" +
                    "from student where course2Grade = (select max(round(course2Grade)) from student);";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            while (results.next()) {
                name2=results.getString(c);
                grade2 = results.getString(n);
                c++;
                n++;
            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }
    /***************************************/

    public static boolean searchMaxC3() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course3Grade))" +
                    "from student where course3Grade = (select max(round(course3Grade)) from student);";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            while (results.next()) {
                name3=results.getString(c);
                grade3 = results.getString(n);
                c++;
                n++;
            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }
    /****************************************/

    public static boolean searchMaxC4() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course4Grade))" +
                    "from student where course4Grade = (select max(round(course4Grade)) from student);";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            while (results.next()) {
                name4=results.getString(c);
                grade4 = results.getString(n);
                c++;
                n++;
            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }

    /*****************************************/

    public static boolean searchMaxC5() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course5Grade))" +
                    "from student where course5Grade = (select max(round(course5Grade)) from student);";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;
            while (results.next()) {
                name5=results.getString(c);
                grade5 = results.getString(n);
                c++;
                n++;
            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }
    /************************************************/
    public static boolean searchMaxC6() {
        boolean existed = false;
        try {
            Connection conn = getConnection();
            String sql_query = "select Concat(firstName,' ',lastName) , max(round(course6Grade))" +
                    "from student where course6Grade = (select max(round(course6Grade)) from student) ;";
            PreparedStatement prepStat = conn.prepareStatement(sql_query);

            ResultSet results = prepStat.executeQuery();

            int c = 1;
            int n = 2;

            while (results.next()) {
                name6=results.getString(c);
                grade6 = results.getString(n);

                c++;
                n++;

            }

            existed = results.next();
            return existed;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existed;
    }


    /*      End Searching in my database             */


    /*      Inserting to my database                */


    /***        insert admin                   */

    public static boolean insertAdmin(String id, String username, String password) {
        boolean check = false;
        try {
            boolean existed = searchAdmin(id, username, password);

            if (existed) {
                JOptionPane.showMessageDialog(null, "User id is already existed, try something different !"
                        , "Invalid operation", 2);
            } else {
                Connection conn = getConnection();
                String sql_query = "insert into admins (id,username,password) values (?,?,?)";
                PreparedStatement prepStat = conn.prepareStatement(sql_query);
                prepStat.setString(1, id);
                prepStat.setString(2, username);
                prepStat.setString(3, password);
                prepStat.executeUpdate();

                conn.close();
                check = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    /************************************************/

    public static boolean insertStudent(String id, String firstNAME, String lastNAME,
                                        String ADDRESS, String PHONE, String academicEMAIL, String LEVEL,
                                        String course1, String course2, String course3, String course4,
                                        String course5, String course6,double gpa , String dept)
    {
        boolean check = false;
        try {
            Connection conn = getConnection();

            boolean existed = searchStudent(id);

            if (existed) {
                JOptionPane.showMessageDialog(null, "Student id is already existed, try something different !"
                        , "Invalid operation", 2);
            } else {
                String sql_query = "insert into student(id,firstName,lastName,address,phone,academicEmail,level," +
                        "course1,course2,course3,course4,course5,course6,mainGpa,department) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement prepStat = conn.prepareStatement(sql_query);
                prepStat.setString(1, id);
                prepStat.setString(2, firstNAME);
                prepStat.setString(3, lastNAME);
                prepStat.setString(4, ADDRESS);
                prepStat.setString(5, PHONE);
                prepStat.setString(6, academicEMAIL);
                prepStat.setString(7, LEVEL);
                prepStat.setString(8, course1);
                prepStat.setString(9, course2);
                prepStat.setString(10, course3);
                prepStat.setString(11, course4);
                prepStat.setString(12, course5);
                prepStat.setString(13, course6);
                prepStat.setDouble(14,gpa);
                prepStat.setString(15, dept);

                prepStat.executeUpdate();
                conn.close();
                check = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    /**************************************************************/

    public static boolean insertGrade(String id, String grade1, String grade2,
                                      String grade3, String grade4, String grade5, String grade6, double gpa) {


        boolean check = false;
        try {
            Connection conn = getConnection();

            boolean existed = searchStudent(id);

            if (!existed) {
                JOptionPane.showMessageDialog(null, "Student id does not exist, try something different !"
                        , "Invalid operation", 2);
            } else {
                String sql_query = "update student set" +
                        "course1Grade = ?,course2Grade=?,course3Grade=?,course4Grade=?,course5Grade=?,course6Grade=?," +
                        "mainGpa=round(?,4)) where id = ?";
                PreparedStatement prepStat = conn.prepareStatement(sql_query);
                prepStat.setString(1, grade1);
                prepStat.setString(2, grade2);
                prepStat.setString(3, grade3);
                prepStat.setString(4, grade4);
                prepStat.setString(5, grade5);
                prepStat.setString(6, grade6);
                prepStat.setDouble(7, gpa);
                prepStat.setString(8, id);
                prepStat.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null, "Student Grades inserted successfully !"
                        , "Success", 1);
                check = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }





    /*      End inserting to my database                */

    /*            updating data in my database         */
    public static boolean updateGrade(String grade1, String grade2, String grade3,
                                      String grade4, String grade5, String grade6, double gpa, String id) {
        boolean check = false;
        try {

            boolean existed = searchStudent(id);

            if (!existed) {
                JOptionPane.showMessageDialog(null, "Student id does not exist, try something different !"
                        , "Invalid operation", 2);
            }
            else {

                Connection conn = getConnection();
                String sql_query = "update student set course1Grade = ? ,course2Grade =? , course3Grade =? , course4Grade =? " +
                        ", course5Grade =? , course6Grade =? , mainGpa =round(?,4) where id=?";

                PreparedStatement prepState = conn.prepareStatement(sql_query);
                prepState.setString(1, grade1);
                prepState.setString(2, grade2);
                prepState.setString(3, grade3);
                prepState.setString(4, grade4);
                prepState.setString(5, grade5);
                prepState.setString(6, grade6);
                prepState.setDouble(7, gpa);
                prepState.setString(8, id);
                prepState.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null, "Grades updated successfully!", "Success!", 1);
                check = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    /********************************************************/
    public static boolean updateStudent(String firstNAME, String lastNAME, String ADDRESS, String PHONE, String academicEMAIL,
                                        String LEVEL, String COURSE1, String COURSE2, String COURSE3,
                                        String COURSE4, String COURSE5, String COURSE6,String dept ,String id) {
        boolean check = false;
        if(searchStudent(id)) {
            try {
                Connection conn = getConnection();
                String sql_query = "update student set " +
                        "firstName = ? , lastName =? , address =? , phone =? " +
                        ", academicEmail =? , level =? , course1 = ? , course2 =? " +
                        ", course3 =? ,course4 =? , course5 =? , course6=? ,department=? where id=?";
                PreparedStatement prepState = conn.prepareStatement(sql_query);
                prepState.setString(1, firstNAME);
                prepState.setString(2, lastNAME);
                prepState.setString(3, ADDRESS);
                prepState.setString(4, PHONE);
                prepState.setString(5, academicEMAIL);
                prepState.setString(6, LEVEL);
                prepState.setString(7, COURSE1);
                prepState.setString(8, COURSE2);
                prepState.setString(9, COURSE3);
                prepState.setString(10,COURSE4);
                prepState.setString(11,COURSE5);
                prepState.setString(12,COURSE6);
                prepState.setString(13,COURSE6);
                prepState.setString(14,id);
                prepState.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null, "Info updated successfully!", "Success!", 1);
                check = true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No such student for this id!",
                    "Invalid operation!", 2);
        }
        return check;
    }

    public static boolean updatePassword(String id,String newPass) {
        boolean check = false;
        try {
            Connection conn = getConnection();
            String sql_query = "update admins set password =? where id=?";

            PreparedStatement prepState = conn.prepareStatement(sql_query);

            prepState.setString(1, newPass);
            prepState.setString(2, id);
            prepState.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Your password updated successfully!", "Success!", 1);
            check = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    /*   End updating  */

    /*         Deleting from database                 */

    public static boolean delete(String id) {
        boolean check = false;
        try {
            Connection conn = getConnection();
            boolean existed = searchStudent(id);
            if (!existed) {
                JOptionPane.showMessageDialog(null, "User is not founded !"
                        , "Invalid operation", 2);
            } else {

                String sql_query = "delete from student where id= ?";
                PreparedStatement prepStat = conn.prepareStatement(sql_query);
                prepStat.setString(1, id);
                prepStat.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null,
                        "Data has been deleted successfully!", "Success!", 1);
                check = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    /***************************************************************/
//    public static boolean deleteGrade(String id) {
//        boolean check = false;
//        try {
//            Connection conn = getConnection();
//            boolean existed = searchGrade(id);
//            if (!existed) {
//                JOptionPane.showMessageDialog(null, "User is not founded !"
//                        , "Invalid operation", 2);
//            } else {
//
//                String sql_query = "delete from grades where id= ?";
//                PreparedStatement prepStat = conn.prepareStatement(sql_query);
//                prepStat.setString(1, id);
//                prepStat.executeUpdate();
//                conn.close();
//                JOptionPane.showMessageDialog(null,
//                        "Data has been deleted successfully!", "Success!", 1);
//                check = true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return check;
//    }


}



