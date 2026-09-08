package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class i7 {
    public static final Object a(ee.s sVar, ee.s sVar2, rd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new zd.v(th2, false);
        }
        jd.a aVar = jd.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == zd.e0.e) {
            return aVar;
        }
        if (B instanceof zd.v) {
            throw ((zd.v) B).a;
        }
        return zd.e0.u(B);
    }
}
