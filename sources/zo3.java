// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zo3 extends ju9 {
    public static final /* synthetic */ long f = fx.a.objectFieldOffset(zo3.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // ju9, sv5
    public final void f(Object obj) {
        g(obj);
    }

    @Override // ju9, sv5
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    q7c.c(xpe.a(this.e), pxd.a(obj));
                    return;
                } else {
                    grb.i("Already resumed");
                    return;
                }
            }
            zo3 zo3Var = this;
            if (unsafe.compareAndSwapInt(zo3Var, j, 0, 2)) {
                return;
            } else {
                this = zo3Var;
            }
        }
    }
}
