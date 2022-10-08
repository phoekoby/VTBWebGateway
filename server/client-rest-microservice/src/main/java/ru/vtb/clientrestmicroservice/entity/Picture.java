package ru.vtb.clientrestmicroservice.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nft_picture", schema = "transaction_management")
@Getter
@Setter
@RequiredArgsConstructor
public class Picture extends BaseEntity{
    //может быть хранить сами байты?
    //хотя их скорее всего будет много, так что...
    @Column(name = "url")
    private String url;
}
