package td;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k0 extends yd.s {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // yd.s, td.u1
    public final void b(Object obj) {
        g(obj);
    }

    @Override // yd.s, td.u1
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                yd.a.g(e0.r(obj), w6.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
