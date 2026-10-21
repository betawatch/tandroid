package w7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
