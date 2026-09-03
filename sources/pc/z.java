package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum z extends a2 {
    public z() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.H;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = yVar;
        } else if (d == '-') {
            kVar.f(d);
            kVar.c = a2.J;
        } else if (d == '<') {
            kVar.c = a2.K;
        } else {
            kVar.f(d);
            kVar.c = yVar;
        }
    }
}
