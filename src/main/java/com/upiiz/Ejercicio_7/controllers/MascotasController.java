package com.upiiz.Ejercicio_7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MascotasController {
    @GetMapping("/Mascotas") public String listadoMascotas(){
        return "Mascotas/Mascotas-listado";
    }
    @GetMapping("/Mascotas/actualizar") public String formularioActulizarMascotas(){
        return "Mascotas/Mascotas-actualizar";
    }
    @PostMapping("/Mascotas/actualizar") public String actulizarMascotas(){
        return "redirect:/Mascotas";
    }
    @GetMapping("/Mascotas/eliminar") public String formularioEliminarMascotas(){
        return "Mascotas/Mascotas-eliminar";
    }
    @PostMapping("/Mascotas/eliminar") public String EliminarMascota(){
        return  "redirect:/Mascotas";
    }
    @GetMapping("/Mascotas/agregar") public String mostrarGuardar(){
        return "/Mascotas/Mascotas-agregar";
    }
    @PostMapping("/Mascotas/agregar") public String agregarMascotas(){
        //Guardamos la mascota y redireccionamos
        return "redirect:/Mascotas";
    }
}

