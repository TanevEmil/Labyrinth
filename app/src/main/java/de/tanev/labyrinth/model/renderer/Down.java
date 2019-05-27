package de.tanev.labyrinth.model.renderer;

import de.tanev.labyrinth.model.Renderer;

public class Down extends Renderer {

    public Down(int[] array, int left, int right, int toFound) {

        ilp2 = left + (right - left) / 2;
        ilp1 = array[left + (right - left) / 2];
        il = (left + left + (right - left) / 2) / 2;
        ilm1 = array[left];
        ilm2 = left;

        ip2 = array[right];
        ip1 = toFound;
        ic = array[left];
        im1 = left;

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

        sp2 = "^\n" + ip2;
        sp1 = "!=\n" + ip1;
        sc = "v\n" + ic;
        sm1 = "vv\n[ " + im1 + " ]";

        srp2 = "^^\n[ " + irp2 + " ]";
        srp1 = "^\n" + irp1;
        sr = ">\n[ " + ir + " ]";
        srm1 = "v\n" + irm1;
        srm2 = "vv\n[ " + irm2 + " ]";
    }
}
