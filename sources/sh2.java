// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sh2 extends ev5 {
    public final vb1 e;

    public sh2(vb1 vb1Var) {
        this.e = vb1Var;
    }

    @Override // ev5
    public final boolean k() {
        return true;
    }

    @Override // ev5
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        ov5 j = j();
        vb1 vb1Var = this.e;
        Throwable p = vb1Var.p(j);
        if (vb1Var.w()) {
            rp3 rp3Var = (rp3) vb1Var.d;
            long j2 = rp3.n;
            loop0: while (true) {
                Object objectVolatile = fy.a.getObjectVolatile(rp3Var, j2);
                du2 du2Var = r5c.b;
                if (rr5.a(objectVolatile, du2Var)) {
                    do {
                        unsafe = fy.a;
                        if (unsafe.compareAndSwapObject(rp3Var, rp3.n, du2Var, p)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(rp3Var, j2) == du2Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = fy.a;
                        if (unsafe2.compareAndSwapObject(rp3Var, rp3.n, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(rp3Var, j2) == objectVolatile);
                }
            }
        }
        vb1Var.m(p);
        if (vb1Var.w()) {
            return;
        }
        vb1Var.n();
    }
}
