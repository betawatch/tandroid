// default package

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r1b {
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

    public static lyc a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i = (int) (d - d2);
        float abs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
        String o0 = hl.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z = true;
        if (i != 0 && abs != 0.0f) {
            int i2 = (int) abs;
            if (abs == i2) {
                Locale locale = Locale.ENGLISH;
                str = ((i > 0 ? "+" : "") + hl.o0(i, 0)) + " (" + i2 + "%)";
            } else {
                str = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i > 0 ? "+" : "") + hl.o0(i, 0), Float.valueOf(abs), "%");
            }
        }
        boolean z2 = i >= 0;
        if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z);
        lyc lycVar = new lyc((byte) 15, false);
        lycVar.b = o0;
        lycVar.c = str;
        lycVar.d = valueOf;
        lycVar.e = valueOf2;
        return lycVar;
    }
}
