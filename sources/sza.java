// default package

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sza {
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

    public static xvc a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i = (int) (d - d2);
        float abs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
        String o0 = gm.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z = true;
        if (i != 0 && abs != 0.0f) {
            int i2 = (int) abs;
            if (abs == i2) {
                Locale locale = Locale.ENGLISH;
                str = ((i > 0 ? "+" : "") + gm.o0(i, 0)) + " (" + i2 + "%)";
            } else {
                str = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i > 0 ? "+" : "") + gm.o0(i, 0), Float.valueOf(abs), "%");
            }
        }
        boolean z2 = i >= 0;
        if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z);
        xvc xvcVar = new xvc((byte) 15, false);
        xvcVar.b = o0;
        xvcVar.c = str;
        xvcVar.d = valueOf;
        xvcVar.e = valueOf2;
        return xvcVar;
    }
}
