// default package

import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ua0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public ua0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        StringBuilder m = de9.m(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str = g8c.a;
        Locale locale = Locale.US;
        m.append(String.format(locale, "%02d", objArr));
        m.append(z ? "H" : "M");
        m.append(".");
        m.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return m.toString();
    }

    public static ua0 b(byte[] bArr) {
        try {
            qd1 qd1Var = new qd1(bArr.length, bArr);
            qd1Var.m();
            int f = qd1Var.f(7);
            if (f != 1) {
                lad.f("Av1Config", "Unsupported av1C version: " + f);
                return null;
            }
            int f2 = qd1Var.f(3);
            int f3 = qd1Var.f(5);
            boolean e = qd1Var.e();
            int i = qd1Var.e() ? qd1Var.e() ? 12 : 10 : 8;
            qd1Var.n(13);
            String a = a(f2, f3, i, e);
            if (qd1Var.b() <= 0) {
                return new ua0(i, a);
            }
            qd1Var.m();
            int f4 = qd1Var.f(4);
            if (f4 != 1) {
                lad.e("Av1Config", "Unsupported obu_type: " + f4);
                return new ua0(i, a);
            }
            if (qd1Var.e()) {
                lad.e("Av1Config", "Unsupported obu_extension_flag");
                return new ua0(i, a);
            }
            boolean e2 = qd1Var.e();
            qd1Var.m();
            if (e2 && qd1Var.f(8) > 127) {
                lad.e("Av1Config", "Excessive obu_size");
                return new ua0(i, a);
            }
            int f5 = qd1Var.f(3);
            qd1Var.m();
            if (qd1Var.e()) {
                lad.e("Av1Config", "Unsupported reduced_still_picture_header");
                return new ua0(i, a);
            }
            if (qd1Var.e()) {
                lad.e("Av1Config", "Unsupported timing_info_present_flag");
                return new ua0(i, a);
            }
            if (qd1Var.e()) {
                lad.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new ua0(i, a);
            }
            int f6 = qd1Var.f(5);
            boolean z = false;
            for (int i2 = 0; i2 <= f6; i2++) {
                qd1Var.n(12);
                if (qd1Var.f(5) > 7) {
                    qd1Var.m();
                }
            }
            int f7 = qd1Var.f(4);
            int f8 = qd1Var.f(4);
            qd1Var.n(f7 + 1);
            qd1Var.n(f8 + 1);
            if (qd1Var.e()) {
                qd1Var.n(7);
            }
            qd1Var.n(7);
            boolean e3 = qd1Var.e();
            if (e3) {
                qd1Var.n(2);
            }
            if ((qd1Var.e() ? 2 : qd1Var.f(1)) > 0 && !qd1Var.e()) {
                qd1Var.n(1);
            }
            if (e3) {
                qd1Var.n(3);
            }
            qd1Var.n(3);
            boolean e4 = qd1Var.e();
            if (f5 == 2 && e4) {
                qd1Var.m();
            }
            if (f5 != 1 && qd1Var.e()) {
                z = true;
            }
            if (!qd1Var.e()) {
                return new ua0(i, a);
            }
            int f9 = qd1Var.f(8);
            int f10 = qd1Var.f(8);
            return new ua0(i, hl2.f(f9), ((z || f9 != 1 || f10 != 13 || qd1Var.f(8) != 0) ? qd1Var.f(1) : 1) == 1 ? 1 : 2, hl2.g(f10), a);
        } catch (RuntimeException e5) {
            throw av7.a("Error parsing AV1 config", e5);
        }
    }

    public ua0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
