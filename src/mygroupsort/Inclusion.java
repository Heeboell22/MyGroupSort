/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupsort;

import java.util.ArrayList;

/**
 * Inger
 */
public class Inclusion extends ExceptionItem {

    //Constructor for an ArrayList inclusion:
    ArrayList<ExceptionItem> Inclusion = new ArrayList<>(2);

    public Inclusion(int eid, int sid, String stn) {
        super(sid, stn);
        this.exception_id = eid;
    }
}
