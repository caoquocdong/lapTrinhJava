package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Khoa;

public class KhoaData {

    public void them(Khoa k) {

        try {

            Connection conn =
                    JavaConnection.getConnection();

            // KIEM TRA TRUNG MAKHOA
            String checkSQL =
                    "SELECT * FROM KHOA WHERE MAKHOA=?";

            PreparedStatement check =
                    conn.prepareStatement(checkSQL);

            check.setString(1, k.getMaKhoa());

            ResultSet rs =
                    check.executeQuery();

            if(rs.next()) {

                System.out.println(
                        "Ma khoa da ton tai!");

                return;
            }

            // THEM MOI
            String sql =
                    "INSERT INTO KHOA VALUES(?,?,?,?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, k.getMaKhoa());
            ps.setString(2, k.getTenKhoa());
            ps.setString(3, k.getNgayLap());
            ps.setString(4, k.getTruongKhoa());

            ps.executeUpdate();

            System.out.println(
                    "Them khoa thanh cong");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}