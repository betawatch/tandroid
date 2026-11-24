// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vi6 extends tn5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // tn5
    public final tg6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ts5 ts5Var = new ts5();
        ts5Var.g = ir2.n(1, 1, a);
        return ts5Var;
    }

    @Override // tn5
    public final char c() {
        return '$';
    }
}
