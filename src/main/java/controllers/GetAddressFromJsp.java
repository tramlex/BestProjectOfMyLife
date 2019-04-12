package controllers;

import database.services.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetAddressFromJsp {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/GetAddressFromJsp", method = RequestMethod.GET)
    protected String saveAddress(@RequestParam(name = "street") String street, @RequestParam(name = "house") String house, @RequestParam(name = "room") String room) {

        addressService.saveAddress(street, house, room);
        return "redirect:address.jsp";

    }
}
