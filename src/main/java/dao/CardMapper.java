package dao;

import model.Card;
import model.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardMapper {

    public Integer addCard(Card card);
    public List<Card> selectAllCards(MyUser myUser);
    public Card selectCardById(Integer id);
    public Integer updateCard(Card card);
    public Integer deleteCardById(Integer id);

}
