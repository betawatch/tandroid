package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 extends kotlin.jvm.internal.h implements rd.q {
    public static final r1 a = new r1(3, u1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

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
        e0.n(u1Var, false, new p0(u1Var), 3);
        throw null;
    }
}
