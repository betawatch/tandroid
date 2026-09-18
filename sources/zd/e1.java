package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class e1 extends h1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final d1 e;

    public e1(d1 d1Var) {
        this.e = d1Var;
    }

    @Override // zd.d1
    public final void a(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
