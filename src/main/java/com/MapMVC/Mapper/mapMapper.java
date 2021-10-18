package com.MapMVC.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.MapMVC.Model.Mmap;

public class mapMapper implements RowMapper<Mmap>{

	public Mmap mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Mmap Mmodel = new Mmap();
		Mmodel.setDiaChi(rs.getString("diachi"));
		Mmodel.setMoTa(rs.getString("mota"));
		Mmodel.setTheLoai(rs.getString("theloai"));
		Mmodel.setId(rs.getInt("id"));
		Mmodel.setLat(rs.getFloat("lat"));
		Mmodel.setLog(rs.getFloat("lon"));
		Mmodel.setSdt(rs.getString("sdt"));
		return Mmodel;
	}
	
}
