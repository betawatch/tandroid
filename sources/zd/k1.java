package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.i implements rd.q {
    public static final k1 a = new k1(3, n1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

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
        b0.n(n1Var, true, new m0(n1Var));
        throw null;
    }
}
