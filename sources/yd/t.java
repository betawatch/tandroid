package yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import td.x1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class t extends d implements x1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j10, t tVar, int i10) {
        super(tVar);
        this.c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // yd.d
    public final boolean d() {
        return d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, cd.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
