// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wg2 extends iv5 {
    public final va1 e;

    public wg2(va1 va1Var) {
        this.e = va1Var;
    }

    @Override // iv5
    public final boolean k() {
        return true;
    }

    @Override // iv5
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        sv5 j = j();
        va1 va1Var = this.e;
        Throwable p = va1Var.p(j);
        if (va1Var.w()) {
            yo3 yo3Var = (yo3) va1Var.d;
            long j2 = yo3.n;
            loop0: while (true) {
                Object objectVolatile = fx.a.getObjectVolatile(yo3Var, j2);
                ow5 ow5Var = q7c.b;
                if (ur5.a(objectVolatile, ow5Var)) {
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(yo3Var, yo3.n, ow5Var, p)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(yo3Var, j2) == ow5Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = fx.a;
                        if (unsafe2.compareAndSwapObject(yo3Var, yo3.n, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(yo3Var, j2) == objectVolatile);
                }
            }
        }
        va1Var.m(p);
        if (va1Var.w()) {
            return;
        }
        va1Var.n();
    }
}
