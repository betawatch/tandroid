package wd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w1 extends e1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(w1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public l0 f;

    public static void l(int i3) {
        throw new IllegalStateException(("Illegal state " + i3).toString());
    }

    @Override // wd.e1
    public final boolean i() {
        return true;
    }

    @Override // wd.e1
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = h;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    return;
                }
                l(i3);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 2));
        this.e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i3);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1)) {
                l0 l0Var = this.f;
                if (l0Var != null) {
                    l0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
