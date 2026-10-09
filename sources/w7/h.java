package w7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static jd.c a(jd.c cVar, jd.c cVar2, sd.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof ld.a) {
            return ((ld.a) pVar).create(cVar, cVar2);
        }
        jd.h context = cVar2.getContext();
        return context == jd.i.a ? new kd.b(cVar2, cVar, pVar) : new kd.c(cVar2, context, pVar, cVar);
    }

    public static jd.c b(jd.c cVar) {
        jd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        ld.c cVar2 = cVar instanceof ld.c ? (ld.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
