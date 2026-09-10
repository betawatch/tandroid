package w7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
