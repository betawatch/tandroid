// default package

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pxa {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public static c5a a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i = (int) (d - d2);
        float abs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
        String o0 = gl.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z = true;
        if (i != 0 && abs != 0.0f) {
            int i2 = (int) abs;
            if (abs == i2) {
                Locale locale = Locale.ENGLISH;
                str = ((i > 0 ? "+" : "") + gl.o0(i, 0)) + " (" + i2 + "%)";
            } else {
                str = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i > 0 ? "+" : "") + gl.o0(i, 0), Float.valueOf(abs), "%");
            }
        }
        boolean z2 = i >= 0;
        if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z);
        c5a c5aVar = new c5a((byte) 15, false);
        c5aVar.b = o0;
        c5aVar.e = str;
        c5aVar.c = valueOf;
        c5aVar.d = valueOf2;
        return c5aVar;
    }
}
