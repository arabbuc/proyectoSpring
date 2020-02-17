package bucho.abella.com.proyectoSpring.controller;

import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ResponseBody;	
@Controller	public class ServicioController {	//Nombre clase controlador
                @GetMapping("/time") //Dirección en url donde da el servicio
                @ResponseBody	 //Para que aparezca   
                 public String helloWorld() {	      
                       return  "Hola";	   
                    }	
            }