package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
