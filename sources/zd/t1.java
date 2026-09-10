package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 extends kotlin.jvm.internal.h implements rd.q {
    public static final t1 a = new t1(3, u1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // rd.q
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.a;
        do {
            u10 = u1Var.u();
            if (!(u10 instanceof a1)) {
                throw null;
            }
        } while (u1Var.I(u10) < 0);
        e0.n(u1Var, false, new o1(), 3);
        throw null;
    }
}
