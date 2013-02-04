package springmvc.web;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
import springmvc.service.CarManager;
 
public class CarListController implements Controller {
	
  private CarManager carManager;
 
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
 
		CarManager carManager = new CarManager();
 
		ModelAndView modelAndView = new ModelAndView("car_list");
		modelAndView.addObject("car_list", this.carManager.getCarList());
 
		return modelAndView;
	}
  
  public CarManager getCarManager() {
    return this.carManager;
  }
  
  public void setCarManager(CarManager pCarManager) {
    this.carManager = pCarManager;
  }
  
}