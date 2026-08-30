package qd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ld.a0;
import ld.e2;
import ld.g0;
import ld.j0;
import ld.o0;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends a0 implements j0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 c;
    public final int d;
    public final /* synthetic */ j0 e;
    public final l f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(a0 a0Var, int i10) {
        this.c = a0Var;
        this.d = i10;
        j0 j0Var = a0Var instanceof j0 ? (j0) a0Var : null;
        this.e = j0Var == null ? g0.a : j0Var;
        this.f = new l();
        this.h = new Object();
    }

    @Override // ld.j0
    public final o0 a(long j10, e2 e2Var, uc.h hVar) {
        return this.e.a(j10, e2Var, hVar);
    }

    @Override // ld.j0
    public final void b(long j10, ld.m mVar) {
        this.e.b(j10, mVar);
    }

    @Override // ld.a0
    public final void c(uc.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f10 = f();
                if (f10 == null) {
                    return;
                }
                this.c.c(this, new yy(7, this, f10));
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
