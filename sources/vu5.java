// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vu5 extends wp5 {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // wp5
    public final yi6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        wu5 wu5Var = new wu5();
        wu5Var.g = bs2.n(2, 2, a);
        return wu5Var;
    }

    @Override // wp5
    public final char c() {
        return '$';
    }
}
