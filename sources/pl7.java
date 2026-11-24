// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pl7 extends tp5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // tp5
    public final ui6 b() {
        this.d++;
        ui6 ui6Var = (ui6) this.b.d;
        if (ui6Var instanceof vib) {
            vib vibVar = (vib) ui6Var;
            if (vibVar.g.endsWith(" ")) {
                String str = vibVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    vibVar.g = ts2.m(end, 0, str);
                }
                return end >= 2 ? new f34((byte) 1) : new f34((byte) 2);
            }
        }
        return new f34((byte) 2);
    }

    @Override // tp5
    public final char c() {
        return '\n';
    }
}
