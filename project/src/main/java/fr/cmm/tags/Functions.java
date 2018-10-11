package fr.cmm.tags;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

public class Functions {

    public static String text(String s) {
        s = StringEscapeUtils.escapeXml10(s);
        s = StringUtils.replace(s,"\n","<br>");
        return s;
    }
}
