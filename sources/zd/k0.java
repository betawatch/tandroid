package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class k0 extends ee.s {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ee.s, zd.u1
    public final void f(Object obj) {
        g(obj);
    }

    @Override // ee.s, zd.u1
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                ee.a.g(e0.r(obj), w7.g.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
