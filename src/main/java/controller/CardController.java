package controller;

import model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CardService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @RequestMapping("/toaddcard")
    public String toAddCard() {
        return "addcard";
    }

    @RequestMapping("/addcard")
    public String addCard(Card card, HttpSession session) {
        //字段并不完全匹配于card，不存在的字段就null
        System.out.println("get a request: addcard");
        System.out.println("card = " + card);
        return cardService.addCard(card, session);
    }

    @RequestMapping("/allcards")
    public String allCards(Model model, HttpSession session) {
        return cardService.selectAllCards(model, session);
    }

    @RequestMapping("/detail")
    public String detail(Integer id, Model model) {
        return cardService.detail(id, model);
    }

    @RequestMapping("toupdate")
    public String toUpdate(Integer id, Model model) {
        return cardService.toUpdate(id, model);
    }

    @RequestMapping("/update")
    public String update(Card card, Model model) {
        return cardService.update(card, model);
    }

    @RequestMapping("/delete")
    public String delete(Integer id, Model model) {
        return cardService.delete(id, model);
    }

}
