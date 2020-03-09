package com.mani.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by gbs05347 on 09-03-2020.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {

    private String firstName;

    private String lastName;

    private String designation;
}
