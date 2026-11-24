// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class uq2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = ex.a;
        a = unsafe.objectFieldOffset(uq2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(uq2.class.getDeclaredField("_prev$volatile"));
    }

    public uq2(nv9 nv9Var) {
        this._prev$volatile = nv9Var;
    }

    public final void b() {
        ex.a.putObjectVolatile(this, b, (Object) null);
    }

    public final uq2 c() {
        Object objectVolatile = ex.a.getObjectVolatile(this, a);
        if (objectVolatile == bd3.a) {
            return null;
        }
        return (uq2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        uq2 uq2Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = ex.a;
            long j = b;
            uq2 uq2Var2 = (uq2) unsafe2.getObjectVolatile(this, j);
            while (uq2Var2 != null && uq2Var2.d()) {
                uq2Var2 = (uq2) ex.a.getObjectVolatile(uq2Var2, j);
            }
            uq2 c2 = c();
            c2.getClass();
            do {
                uq2Var = c2;
                if (!uq2Var.d()) {
                    break;
                } else {
                    c2 = uq2Var.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = ex.a.getObjectVolatile(uq2Var, j);
                uq2 uq2Var3 = ((uq2) objectVolatile) == null ? null : uq2Var2;
                do {
                    unsafe = ex.a;
                    if (unsafe.compareAndSwapObject(uq2Var, b, objectVolatile, uq2Var3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(uq2Var, j) == objectVolatile);
            }
            if (uq2Var2 != null) {
                unsafe.putObjectVolatile(uq2Var2, a, uq2Var);
            }
            if (!uq2Var.d() || uq2Var.c() == null) {
                if (uq2Var2 == null || !uq2Var2.d()) {
                    return;
                }
            }
        }
    }
}
