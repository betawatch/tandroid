// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ze0 extends tp5 {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // tp5
    public final ui6 b() {
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
        qk2 qk2Var = new qk2((byte) 0);
        String replace = this.c.substring(i, this.d - a2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (ose.b(' ', replace, 0, length) != length) {
                replace = ts2.m(1, 1, replace);
            }
        }
        qk2Var.h = replace;
        return qk2Var;
    }

    @Override // tp5
    public final char c() {
        return '`';
    }
}
