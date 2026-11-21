package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
