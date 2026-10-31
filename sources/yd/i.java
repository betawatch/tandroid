package yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import td.a0;
import td.f2;
import td.g0;
import td.j0;
import td.o0;
import td.z1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // td.j0
    public final void a(long j10, td.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override // td.j0
    public final o0 b(long j10, f2 f2Var, cd.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override // td.a0
    public final void c(cd.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 == null) {
                    return;
                }
                this.c.c(this, new z1(this, f7, false, 13));
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
