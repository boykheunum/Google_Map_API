package com.MapMVC.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.MapMVC.Interface.mapInterface;
import com.MapMVC.Model.Mmap;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

@Controller
@RequestMapping(value = "/admin/")
public class admin {
	@Autowired
	mapInterface mapInterface;

	@RequestMapping(value = { "/", "Trang-chu" }, method = RequestMethod.GET)
	public ModelAndView adminBase() {
		ModelAndView mView = new ModelAndView("admin/trang-chu");
		return mView;
	}

	@RequestMapping(value = "Table", method = RequestMethod.GET)
	public ModelAndView Table(Model model) {
		ModelAndView mView = new ModelAndView("admin/Table");
		List<Mmap> list = mapInterface.listDiaChi();
		model.addAttribute("list", list);
		return mView;
	}

	@RequestMapping(value = "addDiaChi", method = RequestMethod.GET)
	public ModelAndView getDiaChi(Model model) {
		Mmap mmap = new Mmap();
		ModelAndView mView = new ModelAndView("admin/addDiaChi");
		model.addAttribute("Mmap", mmap);
		return mView;
	}

	@RequestMapping(value = "addDiachi", method = RequestMethod.POST)
	public ModelAndView addDiachi(@ModelAttribute(value = "Mmap") Mmap mmap, ModelMap modelmap, Model model) {
		Mmap map = new Mmap(mmap.getDiaChi(), mmap.getMoTa(), mmap.getTheLoai(), mmap.getLat(), mmap.getLog(),
				mmap.getSdt());
		mapInterface.addDiaChi(map);
		return Table(model);
	}

	@RequestMapping(value = "getAjax", method = RequestMethod.GET)
	public @ResponseBody Object getAjax(Model model) {
		List<Object> array = mapInterface.getAjax();
		model.addAttribute("ajax", array);
		JSONArray jsonArray = new JSONArray(array);
		// return "admin/getAjax";
		return jsonArray;
	}

	@RequestMapping(value = "deleteDiaChi/{id}", method = RequestMethod.GET)
	public ModelAndView DeleteDiaChi(@PathVariable(name = "id") int id, Model model) {
		mapInterface.deleteDiaChi(id);
		return Table(model);
	}

	@RequestMapping(value = "updateDiaChi", method = RequestMethod.GET)
	public ModelAndView updateDiaChi(@RequestParam(name = "id") int id, Model model, Mmap modelMap) {
		ModelAndView mView = new ModelAndView("admin/UpdateDiaChi");
		modelMap = new Mmap();
		modelMap = mapInterface.search(id, modelMap);
		//model.addAttribute("mmap", mmap);
		model.addAttribute("Mmap", modelMap);
		model.addAttribute("id", id);
		return mView;
	}

	@RequestMapping(value = "UpdateDiachi", method = RequestMethod.POST)
	public ModelAndView UpdateDiachi(@ModelAttribute(value = "Mmap") Mmap mmap, ModelMap modelmap, Model model) {
		int id = mmap.getId();
		String diachiString = mmap.getDiaChi();
		Mmap map = new Mmap(mmap.getDiaChi(), mmap.getMoTa(), mmap.getTheLoai(), mmap.getLat(), mmap.getLog(),
				mmap.getSdt());
		mapInterface.updateDiaChi(id, map);
		return Table(model);
	}
}
