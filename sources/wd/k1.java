package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.i implements od.q {
    public static final k1 a = new k1(3, n1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // od.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        n1 n1Var = (n1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.a;
        n1Var.getClass();
        do {
            obj4 = n1.a.get(n1Var);
            if (!(obj4 instanceof x0)) {
                throw null;
            }
        } while (n1Var.L(obj4) < 0);
        b0.n(n1Var, true, new m0(n1Var));
        throw null;
    }
}
