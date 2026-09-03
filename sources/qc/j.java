package qc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.p;
import ne.s;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // qc.h
    public final p b() {
        this.d++;
        p pVar = (p) this.b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.g.endsWith(" ")) {
                String str = sVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    sVar.g = e2.c.j(str, end, 0);
                }
                return end >= 2 ? new ne.g(1) : new ne.g(2);
            }
        }
        return new ne.g(2);
    }

    @Override // qc.h
    public final char d() {
        return '\n';
    }
}
