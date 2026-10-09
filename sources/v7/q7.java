package v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class q7 {
    public static final Object a(fe.s sVar, fe.s sVar2, sd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ae.v(th2, false);
        }
        kd.a aVar = kd.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == ae.g0.e) {
            return aVar;
        }
        if (B instanceof ae.v) {
            throw ((ae.v) B).a;
        }
        return ae.g0.u(B);
    }
}
