package data;

import java.sql.*;

import domain.GiaoVien;

public class GiaoVienData {

    public void them(GiaoVien gv) {

        try {

            Connection conn =
                    JavaConnection.getConnection();

            // KIEM TRA TRUNG MAGV
            String checkSQL =
                    "SELECT * FROM GIAOVIEN WHERE MAGV=?";

            PreparedStatement check =
                    conn.prepareStatement(checkSQL);

            check.setString(1, gv.getMaGV());

            ResultSet rs =
                    check.executeQuery();

            if(rs.next()) {

                System.out.println(
                        "Ma giao vien da ton tai!");

                return;
            }

            // THEM MOI
            String sql =
                    "INSERT INTO GIAOVIEN VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, gv.getMaGV());
            ps.setString(2, gv.getHoTen());
            ps.setString(3, gv.getHocVi());
            ps.setString(4, gv.getHocHam());
            ps.setString(5, gv.getGioiTinh());
            ps.setFloat(6, gv.getHeSo());
            ps.setDouble(7, gv.getMucLuong());
            ps.setString(8, gv.getMaKhoa());

            ps.executeUpdate();

            System.out.println(
                    "Them GV thanh cong");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void lietKeGVNamCNTT() {

        try {

            Connection conn =
                    JavaConnection.getConnection();

            String sql =
                    "SELECT HOTEN " +
                    "FROM GIAOVIEN GV JOIN KHOA K " +
                    "ON GV.MAKHOA=K.MAKHOA " +
                    "WHERE GIOITINH='Nam' " +
                    "AND TENKHOA='Cong Nghe Thong Tin'";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getString("HOTEN"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}