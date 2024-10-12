package pe.edu.cibertec.app_service_suscripcion_pena.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionarUsuarioController {

    @Value("${mensaje:Default mensaje}")
    private String mensaje;
    @Value("${usuario:Default usuario}")
    private String usuario;

    @Value("${password:Default password}")
    private String password;

    @GetMapping("/registrar")
    public String registrarUsuarioNuevo() {
        return "Usuario registrado";
    }

    @GetMapping("/suscripcion")
    public String gestionarSuscripcion() {

        return "Suscripción gestionada " + mensaje;
    }
}
