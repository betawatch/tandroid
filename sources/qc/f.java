package qc;

import java.util.regex.Pattern;
import ne.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
