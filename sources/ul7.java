// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
