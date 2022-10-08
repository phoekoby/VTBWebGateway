package ru.vtb.clientrestmicroservice.entity.courses;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.vtb.clientrestmicroservice.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "slide", schema = "transaction_management")
@Getter
@Setter
@RequiredArgsConstructor
public class Course extends BaseEntity {

    @OneToMany(mappedBy = "course")
    private List<Slide> slides;

    @Column(name = "ord")
    private Integer order;

    @Column(name = "course_prize")
    private Double coursePrize;
}
