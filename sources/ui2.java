// default package

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ui2 extends tn5 {
    public static final Pattern e = bj6.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // tn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tg6 b() {
        boolean z;
        String str;
        String str2;
        int i = this.d + 1;
        this.d = i;
        bj6 bj6Var = this.a;
        sy0 sy0Var = bj6Var.i;
        if (sy0Var == null) {
            return e("]");
        }
        ugb ugbVar = (ugb) sy0Var.e;
        boolean z2 = sy0Var.a;
        if (!sy0Var.c) {
            bj6Var.i = (sy0) sy0Var.f;
            return e("]");
        }
        bj6Var.g = i;
        if (bj6Var.d() == '(') {
            this.d++;
            d();
            bj6 bj6Var2 = this.a;
            int i2 = this.d;
            bj6Var2.g = i2;
            int a = sne.a(i2, bj6Var2.f);
            if (a == -1) {
                str = null;
            } else {
                char d = bj6Var2.d();
                String str3 = bj6Var2.f;
                int i3 = bj6Var2.g;
                String substring = d == '<' ? str3.substring(i3 + 1, a - 1) : str3.substring(i3, a);
                bj6Var2.g = a;
                str = z34.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                d();
                String str4 = this.c;
                int i4 = this.d;
                if (e.matcher(str4.substring(i4 - 1, i4)).matches()) {
                    bj6 bj6Var3 = this.a;
                    int i5 = this.d;
                    bj6Var3.g = i5;
                    int c = sne.c(i5, bj6Var3.f);
                    if (c == -1) {
                        str2 = null;
                    } else {
                        String substring2 = bj6Var3.f.substring(bj6Var3.g + 1, c - 1);
                        bj6Var3.g = c;
                        str2 = z34.a(substring2);
                    }
                    this.d = this.a.g;
                    d();
                } else {
                    str2 = null;
                }
                bj6 bj6Var4 = this.a;
                bj6Var4.g = this.d;
                if (bj6Var4.d() == ')') {
                    this.d++;
                    z = true;
                } else {
                    this.d = i;
                    z = false;
                }
                if (!z) {
                    int i6 = this.d;
                    bj6 bj6Var5 = this.a;
                    bj6Var5.g = i6;
                    if (i6 < bj6Var5.f.length() && bj6Var5.f.charAt(bj6Var5.g) == '[') {
                        int i7 = bj6Var5.g + 1;
                        int b = sne.b(i7, bj6Var5.f);
                        int i8 = b - i7;
                        if (b != -1 && i8 <= 999 && b < bj6Var5.f.length() && bj6Var5.f.charAt(b) == ']') {
                            bj6Var5.g = b + 1;
                        }
                    }
                    int i9 = this.a.g;
                    this.d = i9;
                    int i10 = i9 - i6;
                    String substring3 = i10 > 2 ? this.c.substring(i6, i10 + i6) : !sy0Var.d ? this.c.substring(sy0Var.b, i) : null;
                    if (substring3 != null) {
                        Pattern pattern = z34.a;
                        String replaceAll = z34.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        bj6 bj6Var6 = this.a;
                        bj6Var6.getClass();
                        e46 e46Var = (e46) ((Map) bj6Var6.a.c).get(replaceAll);
                        if (e46Var != null) {
                            str = e46Var.h;
                            str2 = e46Var.i;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.d = i;
                    bj6 bj6Var7 = this.a;
                    bj6Var7.i = (sy0) bj6Var7.i.f;
                    return e("]");
                }
                bk5 bk5Var = z2 ? new bk5(str, str2, (byte) 0) : new bk5(str, str2, (byte) 1);
                tg6 tg6Var = (tg6) ugbVar.f;
                while (tg6Var != null) {
                    tg6 tg6Var2 = (tg6) tg6Var.f;
                    bk5Var.b(tg6Var);
                    tg6Var = tg6Var2;
                }
                ud3 ud3Var = (ud3) sy0Var.g;
                bj6 bj6Var8 = this.a;
                bj6Var8.g = this.d;
                bj6Var8.e(ud3Var);
                this.d = this.a.g;
                tg6 tg6Var3 = (tg6) bk5Var.c;
                tg6 tg6Var4 = (tg6) bk5Var.d;
                if (tg6Var3 != tg6Var4) {
                    yke.b(tg6Var3, tg6Var4);
                }
                ugbVar.g();
                bj6 bj6Var9 = this.a;
                sy0 sy0Var2 = (sy0) bj6Var9.i.f;
                bj6Var9.i = sy0Var2;
                if (!z2) {
                    while (sy0Var2 != null) {
                        if (!sy0Var2.a) {
                            sy0Var2.c = false;
                        }
                        sy0Var2 = (sy0) sy0Var2.f;
                    }
                }
                return bk5Var;
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

    @Override // tn5
    public final char c() {
        return ']';
    }
}
