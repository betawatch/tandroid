package v7;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
