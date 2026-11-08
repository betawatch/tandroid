package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z0 extends e1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final rd.l e;

    public z0(rd.l lVar) {
        this.e = lVar;
    }

    @Override // zd.e1
    public final boolean i() {
        return true;
    }

    @Override // zd.e1
    public final void j(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th2);
        }
    }
}
