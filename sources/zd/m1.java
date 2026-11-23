package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 extends kotlin.jvm.internal.i implements rd.q {
    public static final m1 a = new m1(3, n1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
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
        b0.n(n1Var, true, new i1());
        throw null;
    }
}
