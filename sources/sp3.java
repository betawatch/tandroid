// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sp3 extends ss9 {
    public static final /* synthetic */ long f = fy.a.objectFieldOffset(sp3.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ss9, ov5
    public final void f(Object obj) {
        g(obj);
    }

    @Override // ss9, ov5
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    r5c.c(fne.a(this.e), cvd.a(obj));
                    return;
                } else {
                    dq9.m("Already resumed");
                    return;
                }
            }
            sp3 sp3Var = this;
            if (unsafe.compareAndSwapInt(sp3Var, j, 0, 2)) {
                return;
            } else {
                this = sp3Var;
            }
        }
    }
}
