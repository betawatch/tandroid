// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ul7 extends wp5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // wp5
    public final yi6 b() {
        this.d++;
        yi6 yi6Var = (yi6) this.b.d;
        if (yi6Var instanceof qkb) {
            qkb qkbVar = (qkb) yi6Var;
            if (qkbVar.g.endsWith(" ")) {
                String str = qkbVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    qkbVar.g = bs2.n(end, 0, str);
                }
                return end >= 2 ? new p24((byte) 1) : new p24((byte) 2);
            }
        }
        return new p24((byte) 2);
    }

    @Override // wp5
    public final char c() {
        return '\n';
    }
}
