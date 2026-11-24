// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zd0 extends tn5 {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // tn5
    public final tg6 b() {
        String a;
        String a2 = a(f);
        if (a2 == null) {
            return null;
        }
        int i = this.d;
        do {
            a = a(e);
            if (a == null) {
                this.d = i;
                return e(a2);
            }
        } while (!a.equals(a2));
        cj2 cj2Var = new cj2((byte) 0);
        String replace = this.c.substring(i, this.d - a2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (lqe.b(' ', replace, 0, length) != length) {
                replace = ir2.n(1, 1, replace);
            }
        }
        cj2Var.h = replace;
        return cj2Var;
    }

    @Override // tn5
    public final char c() {
        return '`';
    }
}
