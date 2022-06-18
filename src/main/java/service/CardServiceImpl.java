package service;

import dao.CardMapper;
import model.Card;
import model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardMapper cardMapper;

    @Override
    public String addCard(Card card, HttpSession session) {
        MyUser myUser = (MyUser) session.getAttribute("userLogin");
        System.out.println("addcard: myUser from session = " + myUser);
        card.setUser_id(myUser.getId());
        Integer integer = cardMapper.addCard(card);
        if (integer > 0) {
            return "redirect:/card/allcards";
            //增删改，需要丢弃请求域的数据，选用重定向
        } else {
            return "error";
        }
    }

    @Override
    public String selectAllCards(Model model, HttpSession session) {
        MyUser myUser = (MyUser) session.getAttribute("userLogin");
        List<Card> cards = cardMapper.selectAllCards(myUser);
        model.addAttribute("allCards", cards);
        return "main";
        //查，保留请求域的数据，选用默认的转发
    }

    @Override
    public Card selectCardById(Integer id) {
        Card card1 = cardMapper.selectCardById(id);
        return card1;
    }

    @Override
    public String detail(Integer id, Model model) {
        Card card = cardMapper.selectCardById(id);
        model.addAttribute("card", card);
        return "detail";
    }

    @Override
    public String toUpdate(Integer id, Model model) {
        Card card = cardMapper.selectCardById(id);
        model.addAttribute("card", card);
        return "update";
    }

    @Override
    public String update(Card card, Model model) {
        Integer integer = cardMapper.updateCard(card);
        if (integer > 0) {
            return "redirect:/card/allcards";
        } else {
            return "error";
        }
    }

    @Override
    public String delete(Integer id, Model model) {
        Integer integer = cardMapper.deleteCardById(id);
        if (integer > 0) {
            return "redirect:/card/allcards";
        } else {
            return "error";
        }
    }
}
