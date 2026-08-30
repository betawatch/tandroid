package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // qc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String j10 = e2.c.j(a2, 1, 1);
            ne.k kVar = new ne.k(1, v2.e("mailto:", j10), null);
            kVar.b(new s(j10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String j11 = e2.c.j(a10, 1, 1);
        ne.k kVar2 = new ne.k(1, j11, null);
        kVar2.b(new s(j11));
        return kVar2;
    }

    @Override // qc.h
    public final char d() {
        return '<';
    }
}
