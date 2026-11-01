package xc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum e1 extends a2 {
    public e1() {
        super("Doctype", 50);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        f1 f1Var = a2.o0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = f1Var;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                kVar.c = f1Var;
                return;
            }
            kVar.l(this);
        }
        kVar.m(this);
        fVar.b();
        fVar.getClass();
        kVar.j();
        kVar.c = a2.a;
    }
}
