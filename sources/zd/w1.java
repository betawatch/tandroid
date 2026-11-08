package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w1 extends e1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(w1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public l0 f;

    public static void l(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    @Override // zd.e1
    public final boolean i() {
        return true;
    }

    @Override // zd.e1
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = h;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return;
                }
                l(i7);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 2));
        this.e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
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
