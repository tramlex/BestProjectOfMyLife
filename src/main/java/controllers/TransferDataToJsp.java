package controllers;

import database.entities.AddressEntity;
import database.entities.UsersEntity;
import database.services.address.AddressService;
import database.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TransferDataToJsp {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/TransferDataToJsp", method = RequestMethod.GET)
    public ModelAndView addUsersAndAddressesToRequest() {
        List<UsersEntity> col = userService.getAllUsers();
        List<AddressEntity> adr = addressService.getAllAddresses();

        ModelAndView data = new ModelAndView("dataTables");

        data.addObject("col", col);
        data.addObject("adr", adr);

        return data;
    }
}
