package w7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
