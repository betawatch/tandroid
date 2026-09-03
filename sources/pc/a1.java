package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.g0;
        if (d == 0) {
            kVar.m(this);
            StringBuilder sb = eVar.c;
            sb.append('-');
            sb.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            kVar.c = a2.i0;
            return;
        }
        if (d == 65535) {
            kVar.l(this);
            kVar.i();
            kVar.c = a2.a;
        } else {
            StringBuilder sb2 = eVar.c;
            sb2.append('-');
            sb2.append(d);
            kVar.c = z0Var;
        }
    }
}
