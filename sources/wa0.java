// default package

import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wa0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public wa0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        StringBuilder m = uh9.m(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str = gcc.a;
        Locale locale = Locale.US;
        m.append(String.format(locale, "%02d", objArr));
        m.append(z ? "H" : "M");
        m.append(".");
        m.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return m.toString();
    }

    public static wa0 b(byte[] bArr) {
        try {
            zd1 zd1Var = new zd1(bArr.length, bArr);
            zd1Var.m();
            int f = zd1Var.f(7);
            if (f != 1) {
                efd.f("Av1Config", "Unsupported av1C version: " + f);
                return null;
            }
            int f2 = zd1Var.f(3);
            int f3 = zd1Var.f(5);
            boolean e = zd1Var.e();
            int i = zd1Var.e() ? zd1Var.e() ? 12 : 10 : 8;
            zd1Var.n(13);
            String a = a(f2, f3, i, e);
            if (zd1Var.b() <= 0) {
                return new wa0(i, a);
            }
            zd1Var.m();
            int f4 = zd1Var.f(4);
            if (f4 != 1) {
                efd.e("Av1Config", "Unsupported obu_type: " + f4);
                return new wa0(i, a);
            }
            if (zd1Var.e()) {
                efd.e("Av1Config", "Unsupported obu_extension_flag");
                return new wa0(i, a);
            }
            boolean e2 = zd1Var.e();
            zd1Var.m();
            if (e2 && zd1Var.f(8) > 127) {
                efd.e("Av1Config", "Excessive obu_size");
                return new wa0(i, a);
            }
            int f5 = zd1Var.f(3);
            zd1Var.m();
            if (zd1Var.e()) {
                efd.e("Av1Config", "Unsupported reduced_still_picture_header");
                return new wa0(i, a);
            }
            if (zd1Var.e()) {
                efd.e("Av1Config", "Unsupported timing_info_present_flag");
                return new wa0(i, a);
            }
            if (zd1Var.e()) {
                efd.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new wa0(i, a);
            }
            int f6 = zd1Var.f(5);
            boolean z = false;
            for (int i2 = 0; i2 <= f6; i2++) {
                zd1Var.n(12);
                if (zd1Var.f(5) > 7) {
                    zd1Var.m();
                }
            }
            int f7 = zd1Var.f(4);
            int f8 = zd1Var.f(4);
            zd1Var.n(f7 + 1);
            zd1Var.n(f8 + 1);
            if (zd1Var.e()) {
                zd1Var.n(7);
            }
            zd1Var.n(7);
            boolean e3 = zd1Var.e();
            if (e3) {
                zd1Var.n(2);
            }
            if ((zd1Var.e() ? 2 : zd1Var.f(1)) > 0 && !zd1Var.e()) {
                zd1Var.n(1);
            }
            if (e3) {
                zd1Var.n(3);
            }
            zd1Var.n(3);
            boolean e4 = zd1Var.e();
            if (f5 == 2 && e4) {
                zd1Var.m();
            }
            if (f5 != 1 && zd1Var.e()) {
                z = true;
            }
            if (!zd1Var.e()) {
                return new wa0(i, a);
            }
            int f9 = zd1Var.f(8);
            int f10 = zd1Var.f(8);
            return new wa0(i, bm2.f(f9), ((z || f9 != 1 || f10 != 13 || zd1Var.f(8) != 0) ? zd1Var.f(1) : 1) == 1 ? 1 : 2, bm2.g(f10), a);
        } catch (RuntimeException e5) {
            throw hy7.a("Error parsing AV1 config", e5);
        }
    }

    public wa0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
