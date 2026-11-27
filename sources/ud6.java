// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ud6 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = fx.a;
        a = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(ud6 ud6Var, int i) {
        ud6 ud6Var2;
        ud6 ud6Var3;
        while (true) {
            ud6 h = this.h();
            if (h instanceof g76) {
                return (((g76) h).d & i) == 0 && h.c(ud6Var, i);
            }
            Unsafe unsafe = fx.a;
            unsafe.putObjectVolatile(ud6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(ud6Var, j, this);
            while (true) {
                Unsafe unsafe2 = fx.a;
                ud6Var2 = this;
                ud6Var3 = ud6Var;
                if (unsafe2.compareAndSwapObject(h, a, ud6Var2, ud6Var3)) {
                    ud6Var3.e(ud6Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != ud6Var2) {
                    break;
                }
                this = ud6Var2;
                ud6Var = ud6Var3;
            }
            this = ud6Var2;
            ud6Var = ud6Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0029, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ud6 d() {
        ud6 ud6Var;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = fx.a;
            long j = b;
            ud6 ud6Var2 = (ud6) unsafe2.getObjectVolatile(this, j);
            ud6 ud6Var3 = null;
            ud6 ud6Var4 = ud6Var2;
            while (ud6Var4 != null) {
                Unsafe unsafe3 = fx.a;
                long j2 = a;
                Object objectVolatile = unsafe3.getObjectVolatile(ud6Var4, j2);
                if (objectVolatile != this) {
                    ud6 ud6Var5 = ud6Var2;
                    ud6Var = this;
                    if (ud6Var.i()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof fa9)) {
                        objectVolatile.getClass();
                        ud6Var3 = ud6Var4;
                        ud6Var4 = (ud6) objectVolatile;
                    } else if (ud6Var3 != null) {
                        ud6 ud6Var6 = ((fa9) objectVolatile).a;
                        do {
                            ud6 ud6Var7 = ud6Var4;
                            unsafe = fx.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(ud6Var3, a, ud6Var7, ud6Var6);
                            ud6Var4 = ud6Var7;
                            if (compareAndSwapObject) {
                                this = ud6Var;
                                ud6Var4 = ud6Var3;
                                ud6Var2 = ud6Var5;
                                ud6Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(ud6Var3, j2) == ud6Var4);
                    } else {
                        if (ud6Var4 == null) {
                            grb.o();
                            return null;
                        }
                        ud6Var4 = (ud6) unsafe3.getObjectVolatile(ud6Var4, j);
                    }
                    this = ud6Var;
                    ud6Var2 = ud6Var5;
                } else {
                    if (ud6Var2 == ud6Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = fx.a;
                        ud6 ud6Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(ud6Var8, b, ud6Var2, ud6Var4);
                        ud6 ud6Var9 = ud6Var2;
                        ud6Var = ud6Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(ud6Var, j) == ud6Var9) {
                            this = ud6Var;
                            ud6Var2 = ud6Var9;
                        }
                    }
                }
                this = ud6Var;
            }
            grb.o();
            return null;
        }
    }

    public final void e(ud6 ud6Var) {
        ud6 ud6Var2;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            ud6 ud6Var3 = (ud6) unsafe.getObjectVolatile(ud6Var, j);
            if (this.f() != ud6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                ud6Var2 = this;
                ud6 ud6Var4 = ud6Var;
                if (unsafe2.compareAndSwapObject(ud6Var4, b, ud6Var3, ud6Var2)) {
                    if (ud6Var2.i()) {
                        ud6Var4.d();
                        return;
                    }
                    return;
                } else {
                    ud6Var = ud6Var4;
                    if (unsafe2.getObjectVolatile(ud6Var4, j) != ud6Var3) {
                        break;
                    } else {
                        this = ud6Var2;
                    }
                }
            }
            this = ud6Var2;
        }
    }

    public final Object f() {
        return fx.a.getObjectVolatile(this, a);
    }

    public final ud6 g() {
        Object f = f();
        fa9 fa9Var = f instanceof fa9 ? (fa9) f : null;
        if (fa9Var != null) {
            return fa9Var.a;
        }
        f.getClass();
        return (ud6) f;
    }

    public final ud6 h() {
        ud6 d = d();
        if (d != null) {
            return d;
        }
        Unsafe unsafe = fx.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            ud6 ud6Var = (ud6) objectVolatile;
            if (!ud6Var.i()) {
                return ud6Var;
            }
            objectVolatile = fx.a.getObjectVolatile(ud6Var, j);
        }
    }

    public boolean i() {
        return f() instanceof fa9;
    }

    public String toString() {
        return new td6(this, l93.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + l93.a(this);
    }
}
