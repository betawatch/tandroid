package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.g0;
        if (d == 0) {
            kVar.m(this);
            eVar.c.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            kVar.c = a2.f0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            kVar.i();
            kVar.c = vVar;
        } else if (d != 65535) {
            eVar.c.append(d);
            kVar.c = z0Var;
        } else {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        }
    }
}
