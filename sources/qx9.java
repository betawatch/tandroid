// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qx9 extends fs2 implements wl7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(qx9.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = fy.a.objectFieldOffset(qx9.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public qx9(long j, qx9 qx9Var, int i) {
        super(qx9Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // fs2
    public final boolean d() {
        return fy.a.getIntVolatile(this, f) == g() && c() != null;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, cy2 cy2Var);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            qx9 qx9Var = this;
            if (unsafe.compareAndSwapInt(qx9Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = qx9Var;
        }
    }
}
