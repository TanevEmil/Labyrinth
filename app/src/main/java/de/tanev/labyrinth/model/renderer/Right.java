package de.tanev.labyrinth.model.renderer;

import de.tanev.labyrinth.model.Renderer;

public class Right extends Renderer {

    public Right(int[] array, int left, int right, int toFound) {
        ip2 = right;
        ip1 = array[right];
        ilp1 = left + (right - left) / 2 + 1 + (right - (left + (right - left) / 2 + 1)) / 2;
        irp1 = left + (right - left) / 2 + 1;

        il = toFound;
        ic = left + (right - left) / 2;
        ir = array[left + (right - left) / 2];

        ilm1 = left + (right - left) / 2;
        irm1 = left + ((left + (right - left) / 2) - left) / 2;
        im1 = array[left];
        im2 = left;

        sp2 = "^^\n[ " + ip2 + " ]";
        sp1 = "^\n" + ip1;
        slp1 = "<\n[ " + ilp1 + " ]";
        srp1 = ">\n[ " + irp1 + " ]";

        sr = ">>\n" + ir;
        sc = ">\n[ " + ic + " ]";
        sl = "!=\n" + il;

        slm1 = "<\n[ " + ilm1 + " ]";
        srm1 = ">\n[ " + irm1 + " ]";
        sm1 = "v\n" + im1;
        sm2 = "vv\n[ " + im2 + " ]";
    }
}

