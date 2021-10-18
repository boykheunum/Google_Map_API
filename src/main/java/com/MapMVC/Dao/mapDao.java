package com.MapMVC.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Repository;

import com.MapMVC.Interface.mapInterface;
import com.MapMVC.Mapper.mapMapper;
import com.MapMVC.Model.Mmap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Repository
public class mapDao implements mapInterface {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Mmap> listDiaChi() {
		// TODO Auto-generated method stub
		List<Mmap> listDiaChi = new ArrayList<Mmap>();
		String sqlString = "SELECT * FROM `map`";
		listDiaChi = _jdbcTemplate.query(sqlString, new mapMapper());
		return listDiaChi;
	}

	public int deleteDiaChi(int id) {
		// TODO Auto-generated method stub
		String sqlString = "DELETE FROM `map` WHERE id=?";
		_jdbcTemplate.update(sqlString, new Object[] { id });
		return 1;
	}

	public int addDiaChi(Mmap mmap) {
		// TODO Auto-generated method stub
		String sqlString = "INSERT INTO `map`( `diachi`, `lat`, `lon`, `mota`, `sdt`, `theloai`) VALUES (?,?,?,?,?,?)";
		_jdbcTemplate.update(sqlString, mmap.getDiaChi(), mmap.getLat(), mmap.getLog(), mmap.getMoTa(), mmap.getSdt(),
				mmap.getTheLoai());
		return 1;
	}

	public Mmap updateDiaChi(int id, Mmap mmap) {
		// TODO Auto-generated method stub
		String sqlString = "UPDATE `map` SET `diachi`=?, `lat`= ?, `lon`= ?, `mota`= ?, `sdt`= ?, `theloai`= ? WHERE id = ?";
		_jdbcTemplate.update(sqlString, mmap.getDiaChi(), mmap.getLat(), mmap.getLog(), mmap.getMoTa(), mmap.getSdt(),
				mmap.getTheLoai(), id);
		return null;
	}

	public List<Object> getAjax() {
		// TODO Auto-generated method stub
		List<Object> jsonArray = new ArrayList<Object>();
		List<Mmap> list = listDiaChi();
		for (Mmap mmap : list) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", mmap.getId());
			jsonObject.put("diachi", mmap.getDiaChi());
			jsonObject.put("mota", mmap.getMoTa());
			jsonObject.put("theloai", mmap.getTheLoai());
			jsonObject.put("lat", mmap.getLat());
			jsonObject.put("log", mmap.getLog());
			jsonObject.put("sdt", mmap.getSdt());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	public Mmap search(int id, Mmap mmap) {
		// TODO Auto-generated method stub
		String sqlString = "SELECT * FROM `map` WHERE id = ?";
		mmap = _jdbcTemplate.queryForObject(sqlString, new Object[] { id }, new mapMapper());
		return mmap;
	}

}
