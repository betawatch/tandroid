package v7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
