package yc;

import c3.i0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // yc.h
    public final df.c b() {
        this.d++;
        df.c cVar = (df.c) this.b.d;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            if (rVar.g.endsWith(" ")) {
                String str = rVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    rVar.g = i0.m(end, 0, str);
                }
                return end >= 2 ? new ve.g(1) : new ve.g(2);
            }
        }
        return new ve.g(2);
    }

    @Override // yc.h
    public final char d() {
        return '\n';
    }
}
