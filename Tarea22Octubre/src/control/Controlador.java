package control;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Logica")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Object[] listadoPorArray = new Object[20];
    private ArrayList<Object> listadoPorArrayList = null;
    private HashMap<String, Object> listadoPorMapa = null;
    
   
    public void init() throws ServletException{
    	
    	super.init();
    	listadoPorArray = new Object[5];
    	listadoPorArray[0] = 123;
    	listadoPorArray[0] = "123";
    	listadoPorArray[0] = 3.14f;
    	listadoPorArray[0] = true;
    	listadoPorArray[0] = LocalDate.now();
    	this.getServletContext().setAttribute("listadoPorArray", listadoPorArray);
    	
    	listadoPorArrayList = new ArrayList<Object>();
    	listadoPorArrayList.add(true);
    	listadoPorArrayList.add("Antonio");
    	listadoPorArrayList.add(666);
    	listadoPorArrayList.add(3.14f); 
    	this.getServletContext().setAttribute("listadoPorArrayList", listadoPorArrayList);
    	
    	listadoPorMapa = new HashMap<String, Object>();
    	listadoPorMapa.put("1", false);
    	listadoPorMapa.put("2", "2");
    	listadoPorMapa.put("3", 123);
    	listadoPorMapa.put("4", 3.14f);
    	this.getServletContext().setAttribute("listadoPorMapa", listadoPorMapa);
    }
    
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		String rutaJSP= "jsp/interSin"; 
		switch (opcion){
		case "sin":
			rutaJSP = "interSin";
		case "con":
			rutaJSP = "intercon";
			break;
		default: break;
		}
		request.getRequestDispatcher(rutaJSP + ".jsp").forward(request, response);
	}

}
