package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.t8;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                ee.a.g(e0.r(obj), t8.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
