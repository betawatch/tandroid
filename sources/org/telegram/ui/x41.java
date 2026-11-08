package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x41 {
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

    public static ab.b0 a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i7 = (int) (d - d2);
        float abs = d2 == 0.0d ? 0.0f : Math.abs((i7 / ((float) d2)) * 100.0f);
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z9 = true;
        str = "";
        if (i7 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i7 > 0 ? "+" : "");
                sb2.append(org.telegram.messenger.g0.o0(i7, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i7 > 0 ? "+" : "");
                sb3.append(org.telegram.messenger.g0.o0(i7, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        boolean z10 = i7 >= 0;
        if (i7 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z9 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z9);
        ab.b0 b0Var = new ab.b0(11, false);
        b0Var.b = o02;
        b0Var.e = str;
        b0Var.c = valueOf;
        b0Var.d = valueOf2;
        return b0Var;
    }
}
