package v7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class u7 {
    public static final Object a(ge.s sVar, ge.s sVar2, td.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new be.v(th2, false);
        }
        ld.a aVar = ld.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == be.f0.e) {
            return aVar;
        }
        if (B instanceof be.v) {
            throw ((be.v) B).a;
        }
        return be.f0.u(B);
    }
}
