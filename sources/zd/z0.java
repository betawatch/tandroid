package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
