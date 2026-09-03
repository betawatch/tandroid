package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.g("<" + aVar.i());
            kVar.a(a2.N);
            return;
        }
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.L);
        } else {
            kVar.f('<');
            kVar.c = a2.H;
        }
    }
}
