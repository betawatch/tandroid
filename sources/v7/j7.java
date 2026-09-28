package v7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class j7 {
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
