// default package

import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ub0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public ub0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        StringBuilder l = hg9.l(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str = hac.a;
        Locale locale = Locale.US;
        l.append(String.format(locale, "%02d", objArr));
        l.append(z ? "H" : "M");
        l.append(".");
        l.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return l.toString();
    }

    public static ub0 b(byte[] bArr) {
        try {
            ye1 ye1Var = new ye1(bArr.length, bArr);
            ye1Var.m();
            int f = ye1Var.f(7);
            if (f != 1) {
                ncd.f("Av1Config", "Unsupported av1C version: " + f);
                return null;
            }
            int f2 = ye1Var.f(3);
            int f3 = ye1Var.f(5);
            boolean e = ye1Var.e();
            int i = ye1Var.e() ? ye1Var.e() ? 12 : 10 : 8;
            ye1Var.n(13);
            String a = a(f2, f3, i, e);
            if (ye1Var.b() <= 0) {
                return new ub0(i, a);
            }
            ye1Var.m();
            int f4 = ye1Var.f(4);
            if (f4 != 1) {
                ncd.e("Av1Config", "Unsupported obu_type: " + f4);
                return new ub0(i, a);
            }
            if (ye1Var.e()) {
                ncd.e("Av1Config", "Unsupported obu_extension_flag");
                return new ub0(i, a);
            }
            boolean e2 = ye1Var.e();
            ye1Var.m();
            if (e2 && ye1Var.f(8) > 127) {
                ncd.e("Av1Config", "Excessive obu_size");
                return new ub0(i, a);
            }
            int f5 = ye1Var.f(3);
            ye1Var.m();
            if (ye1Var.e()) {
                ncd.e("Av1Config", "Unsupported reduced_still_picture_header");
                return new ub0(i, a);
            }
            if (ye1Var.e()) {
                ncd.e("Av1Config", "Unsupported timing_info_present_flag");
                return new ub0(i, a);
            }
            if (ye1Var.e()) {
                ncd.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new ub0(i, a);
            }
            int f6 = ye1Var.f(5);
            boolean z = false;
            for (int i2 = 0; i2 <= f6; i2++) {
                ye1Var.n(12);
                if (ye1Var.f(5) > 7) {
                    ye1Var.m();
                }
            }
            int f7 = ye1Var.f(4);
            int f8 = ye1Var.f(4);
            ye1Var.n(f7 + 1);
            ye1Var.n(f8 + 1);
            if (ye1Var.e()) {
                ye1Var.n(7);
            }
            ye1Var.n(7);
            boolean e3 = ye1Var.e();
            if (e3) {
                ye1Var.n(2);
            }
            if ((ye1Var.e() ? 2 : ye1Var.f(1)) > 0 && !ye1Var.e()) {
                ye1Var.n(1);
            }
            if (e3) {
                ye1Var.n(3);
            }
            ye1Var.n(3);
            boolean e4 = ye1Var.e();
            if (f5 == 2 && e4) {
                ye1Var.m();
            }
            if (f5 != 1 && ye1Var.e()) {
                z = true;
            }
            if (!ye1Var.e()) {
                return new ub0(i, a);
            }
            int f9 = ye1Var.f(8);
            int f10 = ye1Var.f(8);
            return new ub0(i, tm2.f(f9), ((z || f9 != 1 || f10 != 13 || ye1Var.f(8) != 0) ? ye1Var.f(1) : 1) == 1 ? 1 : 2, tm2.g(f10), a);
        } catch (RuntimeException e5) {
            throw bx7.a("Error parsing AV1 config", e5);
        }
    }

    public ub0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
