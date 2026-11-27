// default package

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qj2 extends wp5 {
    public static final Pattern e = gl6.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // wp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yi6 b() {
        boolean z;
        String str;
        String str2;
        int i = this.d + 1;
        this.d = i;
        gl6 gl6Var = this.a;
        az0 az0Var = gl6Var.i;
        if (az0Var == null) {
            return e("]");
        }
        qkb qkbVar = (qkb) az0Var.e;
        boolean z2 = az0Var.a;
        if (!az0Var.c) {
            gl6Var.i = (az0) az0Var.f;
            return e("]");
        }
        gl6Var.g = i;
        if (gl6Var.d() == '(') {
            this.d++;
            d();
            gl6 gl6Var2 = this.a;
            int i2 = this.d;
            gl6Var2.g = i2;
            int a = kse.a(i2, gl6Var2.f);
            if (a == -1) {
                str = null;
            } else {
                char d = gl6Var2.d();
                String str3 = gl6Var2.f;
                int i3 = gl6Var2.g;
                String substring = d == '<' ? str3.substring(i3 + 1, a - 1) : str3.substring(i3, a);
                gl6Var2.g = a;
                str = u44.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                d();
                String str4 = this.c;
                int i4 = this.d;
                if (e.matcher(str4.substring(i4 - 1, i4)).matches()) {
                    gl6 gl6Var3 = this.a;
                    int i5 = this.d;
                    gl6Var3.g = i5;
                    int c = kse.c(i5, gl6Var3.f);
                    if (c == -1) {
                        str2 = null;
                    } else {
                        String substring2 = gl6Var3.f.substring(gl6Var3.g + 1, c - 1);
                        gl6Var3.g = c;
                        str2 = u44.a(substring2);
                    }
                    this.d = this.a.g;
                    d();
                } else {
                    str2 = null;
                }
                gl6 gl6Var4 = this.a;
                gl6Var4.g = this.d;
                if (gl6Var4.d() == ')') {
                    this.d++;
                    z = true;
                } else {
                    this.d = i;
                    z = false;
                }
                if (!z) {
                    int i6 = this.d;
                    gl6 gl6Var5 = this.a;
                    gl6Var5.g = i6;
                    if (i6 < gl6Var5.f.length() && gl6Var5.f.charAt(gl6Var5.g) == '[') {
                        int i7 = gl6Var5.g + 1;
                        int b = kse.b(i7, gl6Var5.f);
                        int i8 = b - i7;
                        if (b != -1 && i8 <= 999 && b < gl6Var5.f.length() && gl6Var5.f.charAt(b) == ']') {
                            gl6Var5.g = b + 1;
                        }
                    }
                    int i9 = this.a.g;
                    this.d = i9;
                    int i10 = i9 - i6;
                    String substring3 = i10 > 2 ? this.c.substring(i6, i10 + i6) : !az0Var.d ? this.c.substring(az0Var.b, i) : null;
                    if (substring3 != null) {
                        Pattern pattern = u44.a;
                        String replaceAll = u44.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        gl6 gl6Var6 = this.a;
                        gl6Var6.getClass();
                        i66 i66Var = (i66) ((Map) gl6Var6.a.c).get(replaceAll);
                        if (i66Var != null) {
                            str = i66Var.h;
                            str2 = i66Var.i;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.d = i;
                    gl6 gl6Var7 = this.a;
                    gl6Var7.i = (az0) gl6Var7.i.f;
                    return e("]");
                }
                em5 em5Var = z2 ? new em5(str, str2, (byte) 0) : new em5(str, str2, (byte) 1);
                yi6 yi6Var = (yi6) qkbVar.f;
                while (yi6Var != null) {
                    yi6 yi6Var2 = (yi6) yi6Var.f;
                    em5Var.b(yi6Var);
                    yi6Var = yi6Var2;
                }
                oe3 oe3Var = (oe3) az0Var.g;
                gl6 gl6Var8 = this.a;
                gl6Var8.g = this.d;
                gl6Var8.e(oe3Var);
                this.d = this.a.g;
                yi6 yi6Var3 = (yi6) em5Var.c;
                yi6 yi6Var4 = (yi6) em5Var.d;
                if (yi6Var3 != yi6Var4) {
                    spe.b(yi6Var3, yi6Var4);
                }
                qkbVar.g();
                gl6 gl6Var9 = this.a;
                az0 az0Var2 = (az0) gl6Var9.i.f;
                gl6Var9.i = az0Var2;
                if (!z2) {
                    while (az0Var2 != null) {
                        if (!az0Var2.a) {
                            az0Var2.c = false;
                        }
                        az0Var2 = (az0) az0Var2.f;
                    }
                }
                return em5Var;
            }
            z = false;
        } else {
            z = false;
            str = null;
        }
        str2 = null;
        if (!z) {
        }
        if (z) {
        }
    }

    @Override // wp5
    public final char c() {
        return ']';
    }
}
