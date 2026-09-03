package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.B0);
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
        if (d == 65535) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        if (d != '&') {
            if (d != '\'') {
                kVar.i.k(d);
                return;
            } else {
                kVar.c = a2.a0;
                return;
            }
        }
        int[] c3 = kVar.c('\'', true);
        if (c3 != null) {
            kVar.i.m(c3);
        } else {
            kVar.i.k('&');
        }
    }
}
