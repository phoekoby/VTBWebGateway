package ru.vtb.integrationmodule.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.vtb.integrationmodule.entity.user.User;

import javax.persistence.*;


//обмен nft на рубли
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Exchange extends Transaction{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "amount")
    private Double amount;

}
