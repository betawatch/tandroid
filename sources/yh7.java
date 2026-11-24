// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yh7 {
    public static final Pattern c = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern d = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;

    public yh7(String str) {
        String str2;
        this.a = str;
        str2 = "";
        if (str != null) {
            Matcher matcher = c.matcher(str);
            str2 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = d.matcher(str);
            this.b = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.b = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(str2)) {
            Matcher matcher3 = e.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
