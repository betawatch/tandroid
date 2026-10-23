package v7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
