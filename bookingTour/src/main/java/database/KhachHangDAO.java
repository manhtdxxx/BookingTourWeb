package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.KhachHang;

public class KhachHangDAO implements DAO_Interface<KhachHang> {

	@Override
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> result = new ArrayList<>();
		String sql = "SELECT * FROM khachhang";

		try (Connection conn = JDBCUtil.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				ResultSet rs = st.executeQuery()) {

			while (rs.next()) {
				String maKH = rs.getString("maKH");
				String tenKH = rs.getString("tenKH");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String gioiTinh = rs.getString("gioiTinh");
				Date ngaySinh = rs.getDate("ngaySinh");
				String soDienThoai = rs.getString("soDienThoai");
				String email = rs.getString("email");
				
				KhachHang kh = new KhachHang(maKH, tenKH, username, password, gioiTinh, ngaySinh, soDienThoai, email);
				result.add(kh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public KhachHang selectById(KhachHang obj) {
		KhachHang result = null;
		String sql = "SELECT * FROM khachhang WHERE maKH = ?";
		//
		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			st.setString(1, obj.getMaKH());
			try (ResultSet rs = st.executeQuery()) {
				if (rs.next()) {
					String maKH = rs.getString("maKH");
					String tenKH = rs.getString("tenKH");
					String username = rs.getString("username");
					String password = rs.getString("password");
					String gioiTinh = rs.getString("gioiTinh");
					Date ngaySinh = rs.getDate("ngaySinh");
					String soDienThoai = rs.getString("soDienThoai");
					String email = rs.getString("email");
					result = new KhachHang(maKH, tenKH, username, password, gioiTinh, ngaySinh, soDienThoai, email);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insert(KhachHang obj) {
		int result = 0;
		String sql = "INSERT INTO khachhang (maKH, tenKH, username, password, gioiTinh, ngaySinh, soDienThoai, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			st.setString(1, obj.getMaKH());
			st.setString(2, obj.getTenKH());
			st.setString(3, obj.getUsername());
			st.setString(4, obj.getPassword());
			st.setString(5, obj.getGioiTinh());
			st.setDate(6, obj.getNgaySinh());
			st.setString(7, obj.getSoDienThoai());
			st.setString(8, obj.getEmail());

			result = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> objs) {
		int result = 0;
		String sql = "INSERT INTO khachhang (maKH, tenKH, username, password, gioiTinh, ngaySinh, soDienThoai, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			conn.setAutoCommit(false);

			for (KhachHang obj : objs) {
				st.setString(1, obj.getMaKH());
				st.setString(2, obj.getTenKH());
				st.setString(3, obj.getUsername());
				st.setString(4, obj.getPassword());
				st.setString(5, obj.getGioiTinh());
				st.setDate(6, obj.getNgaySinh());
				st.setString(7, obj.getSoDienThoai());
				st.setString(8, obj.getEmail());
				//
				st.addBatch();
			}

			int[] results = st.executeBatch();
			conn.commit();

			for (int count : results) {
				result += count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(KhachHang obj) {
		int result = 0;
		String sql = "DELETE FROM khachhang WHERE maKH = ?";

		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			st.setString(1, obj.getMaKH());
			result = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteAll(ArrayList<KhachHang> objs) {
		int result = 0;
		String sql = "DELETE FROM khachhang WHERE maKH = ?";

		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			conn.setAutoCommit(false);

			for (KhachHang obj : objs) {
				st.setString(1, obj.getMaKH());
				//
				st.addBatch();
			}

			int[] results = st.executeBatch();
			conn.commit();

			for (int count : results) {
				result += count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(KhachHang obj) {
		int result = 0;
		String sql = "UPDATE khachhang SET tenKH = ?, username = ?, password = ?, gioiTinh = ?, ngaySinh = ?, soDienThoai = ?, email = ? WHERE maKH = ?";

		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

			st.setString(1, obj.getTenKH());
			st.setString(2, obj.getUsername());
			st.setString(3, obj.getPassword());
			st.setString(4, obj.getGioiTinh());
			st.setDate(5, obj.getNgaySinh());
			st.setString(6, obj.getSoDienThoai());
			st.setString(7, obj.getEmail());
			st.setString(8, obj.getMaKH());

			result = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}