package de.tanev.labyrinth.model.renderer;

import de.tanev.labyrinth.model.Renderer;

public class Up extends Renderer {

    public Up(int[] array, int left, int right, int toFound) {

        ilp2 = left + (right - left) / 2;
        ilp1 = array[left + (right - left) / 2];
        il = (left + left + (right - left) / 2) / 2;
        ilm1 = array[left];
        ilm2 = left;

        ip1 = right;
        ic = array[right];
        im1 = toFound;
        im2 = array[left];

        irp2 = right;
        irp1 = array[right];
        ir = (left + (right - left) / 2 + 1 + right) / 2;
        irm1 = array[left + (right - left) / 2 + 1];
        irm2 = left + (right - left) / 2 + 1;

        slp2 = "^^\n[ " + ilp2 + " ]";
        slp1 = "^\n" + ilp1;
        sl = "<\n[ " + il + " ]";
        slm1 = "v\n" + ilm1;
        slm2 = "vv\n[ " + ilm2 + " ]";

        sp1 = "^^\n[ " + ip1 + " ]";
        sc = "^\n" + ic;
        sm1 = "!=\n" + im1;
        sm2 = "v\n" + im2;

        srp2 = "^^\n[ " + irp2 + " ]";
        srp1 = "^\n" + irp1;
        sr = ">\n[ " + ir + " ]";
        srm1 = "v\n" + irm1;
        srm2 = "vv\n[ " + irm2 + " ]";
    }
}
