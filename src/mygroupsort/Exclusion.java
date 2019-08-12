/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupsort;

import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
class Exclusion extends ExceptionItem {

    //Constructor for an ArrayList exclusion:
    ArrayList<ExceptionItem> Exclusion = new ArrayList<>(2);

    public Exclusion(int eid, int sid, String stn) {
        super(sid, stn);
        this.exception_id = eid;
    }
}
