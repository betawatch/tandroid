package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h0 extends ee.q {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ee.q, zd.n1
    public final void g(Object obj) {
        h(obj);
    }

    @Override // ee.q, zd.n1
    public final void h(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                ee.a.h(c8.v0.b(this.d), b0.s(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
