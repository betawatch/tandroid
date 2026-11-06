package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 extends kotlin.jvm.internal.i implements rd.q {
    public static final l1 a = new l1(3, n1.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.a;
        ((n1) obj).getClass();
        if (obj3 instanceof v) {
            throw ((v) obj3).a;
        }
        return obj3;
    }
}
