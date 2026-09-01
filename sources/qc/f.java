package qc;

import java.util.regex.Pattern;
import ne.p;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // qc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(me.b.a(a2));
        }
        return null;
    }

    @Override // qc.h
    public final char d() {
        return '&';
    }
}
