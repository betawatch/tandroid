// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ss5 extends tn5 {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // tn5
    public final tg6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ts5 ts5Var = new ts5();
        ts5Var.g = ir2.n(2, 2, a);
        return ts5Var;
    }

    @Override // tn5
    public final char c() {
        return '$';
    }
}
