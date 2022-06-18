package service;

import model.Card;
import model.MyUser;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface CardService {
    public String addCard(Card card, HttpSession session);
    public String selectAllCards(Model model, HttpSession session);
    public Card selectCardById(Integer id);
    public String detail(Integer id, Model model);
    public String toUpdate(Integer id, Model model);
    public String update(Card card, Model model);
    public String delete(Integer id, Model model);
}
