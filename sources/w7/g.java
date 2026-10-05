package w7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static id.c a(id.c cVar, id.c cVar2, rd.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof kd.a) {
            return ((kd.a) pVar).create(cVar, cVar2);
        }
        id.h context = cVar2.getContext();
        return context == id.i.a ? new jd.b(cVar2, cVar, pVar) : new jd.c(cVar2, context, pVar, cVar);
    }

    public static id.c b(id.c cVar) {
        id.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        kd.c cVar2 = cVar instanceof kd.c ? (kd.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
