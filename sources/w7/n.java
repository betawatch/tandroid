package w7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static kd.c a(kd.c cVar, kd.c cVar2, td.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof md.a) {
            return ((md.a) pVar).create(cVar, cVar2);
        }
        kd.h context = cVar2.getContext();
        return context == kd.i.a ? new ld.b(cVar2, cVar, pVar) : new ld.c(cVar2, context, pVar, cVar);
    }

    public static kd.c b(kd.c cVar) {
        kd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        md.c cVar2 = cVar instanceof md.c ? (md.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
