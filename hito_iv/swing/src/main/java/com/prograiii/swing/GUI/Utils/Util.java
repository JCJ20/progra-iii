package com.prograiii.swing.GUI.Utils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Util {
    //si no funciona verificar en file/settings/build,excecution/compiler si esya jpg
    public static final ImageIcon failed = new ImageIcon(Path("Images/failed.jpg"));
    public static final ImageIcon succeess = new ImageIcon(Path("Images/success.jpg"));
    //crear el font aqui
    public static final Font font_btn = new Font("Arial", Font.BOLD, 24);


    private static URL Path(String s) {
        return Util.class.getClassLoader().getResource(s);
    }


    public Util() {
    }
}
