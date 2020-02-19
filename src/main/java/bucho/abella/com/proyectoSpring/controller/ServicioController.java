package bucho.abella.com.proyectoSpring.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bucho.abella.com.proyectoSpring.Services.HelloService;

@Controller
public class ServicioController { // Nombre clase controlador
    @Autowired // Poner siempre Aquí
    HelloService hs; // Como un import para Spring declaramos una vble de la clase

    @Value("${mi.nombre}") // Coge valor de properties
    String nombre;

    @GetMapping("/hola") // Dirección en url donde da el servicio
    @ResponseBody // Para que aparezca
    public String helloWorld() {
        return hs.hola();
    }

    @GetMapping("/time") // Dirección en url donde da el servicio
    @ResponseBody
    public String fecha() {
        return hs.time();
    }
    @GetMapping("/cumple") // Dirección en url donde da el servicio
   
    @ResponseBody // le pedimos que responda en el body
    
        public String cumpleanyos(@RequestParam("d") String d) {// tomamos los parametros de la url
             
    return hs.cumpleanyos(d);

        
    
        }  
}
