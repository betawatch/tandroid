package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 extends e1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final od.l e;

    public z0(od.l lVar) {
        this.e = lVar;
    }

    @Override // wd.e1
    public final boolean i() {
        return true;
    }

    @Override // wd.e1
    public final void j(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th2);
        }
    }
}
