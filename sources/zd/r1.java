package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
