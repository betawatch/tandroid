package yc;

import c3.i0;
import java.util.regex.Pattern;
import ve.r;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // yc.h
    public final df.c b() {
        String a2 = a(e);
        if (a2 != null) {
            String m10 = i0.m(1, 1, a2);
            ve.k kVar = new ve.k(1, sc.e.h("mailto:", m10), null);
            kVar.b(new r(m10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String m11 = i0.m(1, 1, a10);
        ve.k kVar2 = new ve.k(1, m11, null);
        kVar2.b(new r(m11));
        return kVar2;
    }

    @Override // yc.h
    public final char d() {
        return '<';
    }
}
