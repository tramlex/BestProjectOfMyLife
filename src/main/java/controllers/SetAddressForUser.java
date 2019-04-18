package controllers;

import database.services.address.AddressService;
import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SetAddressForUser {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/SetAddressForUser", method = RequestMethod.GET)
    protected String setUserForAddress(@RequestParam(name = "user") Integer user, @RequestParam(name = "addressOf") Integer address) {

        System.out.println(user);
        System.out.println(address);
        addressService.setUserToAddress(user, address);

        return "redirect:/TransferDataToJsp";
    }
}
