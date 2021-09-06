package net.proselyte.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
* Base class class with property ID.
*/

@MappedSuperclass
@Getter //то есть можно не делать геттеры/сеттеры, а только аннотации? это за счет плагина жеш?
@Setter
@ToString
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //шось непонятное
    private long id;


}
