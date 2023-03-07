package com.eventos.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventos.entities.Usuarios;
import com.eventos.service.UsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@RequestMapping
	public String frmUsuarios(Model model) {
		
		List<Usuarios> usuarios = usuariosService.findAll();
		
		model.addAttribute("keyUsuarios", usuarios);
		
		return "usuarios";
	}
	
	
	@RequestMapping("/frmAdd")
	public String frmAgregarUsuarios(@ModelAttribute("usuario") Usuarios usuario) throws ParseException {
		
//		String string = usuario.getFechaNacimiento().toString()+"T00:00:00";
//		Date fecha = new Date(string);
//		usuario.setFechaNacimiento(fecha);		
//		usuariosService.add(usuario);
		
		return "agregar-usuarios";
		
	}
	
	@RequestMapping("/frmDel")
	public String frmEliminarUsuario() {
		return "eliminar-usuario";
		
	}

}
