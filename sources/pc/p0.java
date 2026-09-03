package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.C0);
        if (g10.length() > 0) {
            kVar.i.l(g10);
        } else {
            kVar.i.n = true;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.k((char) 65533);
            return;
        }
        if (d == '\"') {
            kVar.c = a2.a0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                kVar.i.k(d);
                return;
            } else {
                kVar.l(this);
                kVar.c = a2.a;
                return;
            }
        }
        int[] c3 = kVar.c('\"', true);
        if (c3 != null) {
            kVar.i.m(c3);
        } else {
            kVar.i.k('&');
        }
    }
}
