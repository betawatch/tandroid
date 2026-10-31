package v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static cd.c a(cd.c cVar, cd.c cVar2, ld.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof ed.a) {
            return ((ed.a) pVar).create(cVar, cVar2);
        }
        cd.h context = cVar2.getContext();
        return context == cd.i.a ? new dd.b(cVar2, cVar, pVar) : new dd.c(cVar2, context, pVar, cVar);
    }

    public static cd.c b(cd.c cVar) {
        cd.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        ed.c cVar2 = cVar instanceof ed.c ? (ed.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
