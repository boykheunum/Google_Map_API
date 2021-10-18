package com.MapMVC.Interface;

import java.util.List;

import org.json.JSONArray;

import com.MapMVC.Model.Mmap;
import com.google.gson.JsonArray;

public interface mapInterface {
	public List<Mmap>listDiaChi();
	public Mmap search(int id, Mmap mmap);
	public int deleteDiaChi(int id);
	public int addDiaChi(Mmap mmap);
	public Mmap updateDiaChi(int id, Mmap mmap);
	public List<Object> getAjax();
}
