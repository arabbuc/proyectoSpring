package bucho.abella.com.proyectoSpring.Services;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

@Service // Obligatorio en las Interfaces
@RequestScope // genera todo el rato y no usa Singleton
class HelloServiceImpl implements HelloService {
    Calendar c;

    @Override
    public String hola() {
        // TODO Auto-generated method stub
        return "Hola Army";
    }

    @Override
    public String time() {
        // TODO Auto-generated method stub

        return c.getTime().toString();
    }

    public HelloServiceImpl() {
        this.c = new GregorianCalendar();
    }

	@Override
	public String cumpleanyos (String fechac) {
        //Recoger el parámetro por get
       
    return fechac;
       

    }
}