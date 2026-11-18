package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
