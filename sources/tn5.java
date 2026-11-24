// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class tn5 {
    public bj6 a;
    public tg6 b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        bj6 bj6Var = this.a;
        bj6Var.g = this.d;
        String c = bj6Var.c(pattern);
        this.d = this.a.g;
        return c;
    }

    public tg6 b() {
        String a = a(sa0.e);
        String str = null;
        byte b = 1;
        if (a != null) {
            String n = ir2.n(1, 1, a);
            bk5 bk5Var = new bk5("mailto:".concat(n), str, b);
            bk5Var.b(new ugb(n));
            return bk5Var;
        }
        String a2 = a(sa0.f);
        if (a2 == null) {
            return null;
        }
        String n2 = ir2.n(1, 1, a2);
        bk5 bk5Var2 = new bk5(n2, str, b);
        bk5Var2.b(new ugb(n2));
        return bk5Var2;
    }

    public char c() {
        return '<';
    }

    public final void d() {
        bj6 bj6Var = this.a;
        bj6Var.g = this.d;
        bj6Var.c(bj6.k);
        this.d = this.a.g;
    }

    public final ugb e(String str) {
        this.a.getClass();
        return new ugb(str);
    }
}
