/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.FoodDAO;
import model.polo.Foods;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Minh Quan
 */
public class FoodController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("foods");
        try {
            List<Foods> lst = FoodDAO.layDS();
            mv.addObject("foodlist", lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
