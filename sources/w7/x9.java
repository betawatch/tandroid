package w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class x9 {
    public static final Object a(yd.s sVar, yd.s sVar2, ld.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new td.v(th2, false);
        }
        dd.a aVar = dd.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == td.e0.e) {
            return aVar;
        }
        if (B instanceof td.v) {
            throw ((td.v) B).a;
        }
        return td.e0.u(B);
    }
}
