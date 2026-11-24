// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qj7 extends t2a implements oj7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(qj7.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long i = fy.a.objectFieldOffset(qj7.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = ycd.a;

    public final boolean c() {
        return Math.max(fy.a.getIntVolatile(this, t2a.e), 0) == 0;
    }

    public final Object d(px2 px2Var) {
        boolean e = e();
        g7c g7cVar = g7c.a;
        if (!e) {
            vb1 a = lsd.a(fne.a(px2Var));
            try {
                a(new pj7(this, a));
                Object q = a.q();
                ly2 ly2Var = ly2.a;
                if (q != ly2Var) {
                    q = g7cVar;
                }
                if (q == ly2Var) {
                    return q;
                }
            } catch (Throwable th) {
                a.z();
                throw th;
            }
        }
        return g7cVar;
    }

    public final boolean e() {
        qj7 qj7Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = t2a.e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > 1) {
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    long j2 = t2a.e;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    if (intVolatile2 <= 1) {
                        qj7Var = this;
                        break;
                    }
                    qj7 qj7Var2 = this;
                    qj7Var = qj7Var2;
                    if (!unsafe2.compareAndSwapInt(qj7Var2, j2, intVolatile2, 1)) {
                        this = qj7Var;
                    }
                }
            } else {
                qj7Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(qj7Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(qj7Var, i, (Object) null);
                    return true;
                }
            }
            this = qj7Var;
        }
    }

    public final void f(Object obj) {
        while (this.c()) {
            Unsafe unsafe = fy.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            du2 du2Var = ycd.a;
            if (objectVolatile != du2Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    qj7 qj7Var = this;
                    if (unsafe2.compareAndSwapObject(qj7Var, i, objectVolatile, du2Var)) {
                        qj7Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(qj7Var, j) != objectVolatile) {
                            this = qj7Var;
                            break;
                        }
                        this = qj7Var;
                    }
                }
            }
        }
        dq9.m("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + ea3.a(this) + "[isLocked=" + c() + ",owner=" + fy.a.getObjectVolatile(this, i) + ']';
    }
}
