package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;
    public final String c;

    public b(String str) {
        this.a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            this.c = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.b = "";
            this.c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.b)) {
            Matcher matcher3 = f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
