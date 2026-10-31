package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.h("<" + aVar.i());
            kVar.a(a2.Q);
            return;
        }
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.O);
        } else {
            kVar.f('<');
            kVar.c = a2.K;
        }
    }
}
