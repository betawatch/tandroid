package qc;

import java.util.regex.Pattern;
import ne.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
