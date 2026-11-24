// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pd6 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = fy.a;
        a = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(pd6 pd6Var, int i) {
        pd6 pd6Var2;
        pd6 pd6Var3;
        while (true) {
            pd6 h = this.h();
            if (h instanceof c76) {
                return (((c76) h).d & i) == 0 && h.c(pd6Var, i);
            }
            Unsafe unsafe = fy.a;
            unsafe.putObjectVolatile(pd6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(pd6Var, j, this);
            while (true) {
                Unsafe unsafe2 = fy.a;
                pd6Var2 = this;
                pd6Var3 = pd6Var;
                if (unsafe2.compareAndSwapObject(h, a, pd6Var2, pd6Var3)) {
                    pd6Var3.e(pd6Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != pd6Var2) {
                    break;
                }
                this = pd6Var2;
                pd6Var = pd6Var3;
            }
            this = pd6Var2;
            pd6Var = pd6Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0029, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pd6 d() {
        pd6 pd6Var;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = fy.a;
            long j = b;
            pd6 pd6Var2 = (pd6) unsafe2.getObjectVolatile(this, j);
            pd6 pd6Var3 = null;
            pd6 pd6Var4 = pd6Var2;
            while (pd6Var4 != null) {
                Unsafe unsafe3 = fy.a;
                long j2 = a;
                Object objectVolatile = unsafe3.getObjectVolatile(pd6Var4, j2);
                if (objectVolatile != this) {
                    pd6 pd6Var5 = pd6Var2;
                    pd6Var = this;
                    if (pd6Var.i()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof u89)) {
                        objectVolatile.getClass();
                        pd6Var3 = pd6Var4;
                        pd6Var4 = (pd6) objectVolatile;
                    } else if (pd6Var3 != null) {
                        pd6 pd6Var6 = ((u89) objectVolatile).a;
                        do {
                            pd6 pd6Var7 = pd6Var4;
                            unsafe = fy.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(pd6Var3, a, pd6Var7, pd6Var6);
                            pd6Var4 = pd6Var7;
                            if (compareAndSwapObject) {
                                this = pd6Var;
                                pd6Var4 = pd6Var3;
                                pd6Var2 = pd6Var5;
                                pd6Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(pd6Var3, j2) == pd6Var4);
                    } else {
                        if (pd6Var4 == null) {
                            rjb.p();
                            return null;
                        }
                        pd6Var4 = (pd6) unsafe3.getObjectVolatile(pd6Var4, j);
                    }
                    this = pd6Var;
                    pd6Var2 = pd6Var5;
                } else {
                    if (pd6Var2 == pd6Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = fy.a;
                        pd6 pd6Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(pd6Var8, b, pd6Var2, pd6Var4);
                        pd6 pd6Var9 = pd6Var2;
                        pd6Var = pd6Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(pd6Var, j) == pd6Var9) {
                            this = pd6Var;
                            pd6Var2 = pd6Var9;
                        }
                    }
                }
                this = pd6Var;
            }
            rjb.p();
            return null;
        }
    }

    public final void e(pd6 pd6Var) {
        pd6 pd6Var2;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            pd6 pd6Var3 = (pd6) unsafe.getObjectVolatile(pd6Var, j);
            if (this.f() != pd6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                pd6Var2 = this;
                pd6 pd6Var4 = pd6Var;
                if (unsafe2.compareAndSwapObject(pd6Var4, b, pd6Var3, pd6Var2)) {
                    if (pd6Var2.i()) {
                        pd6Var4.d();
                        return;
                    }
                    return;
                } else {
                    pd6Var = pd6Var4;
                    if (unsafe2.getObjectVolatile(pd6Var4, j) != pd6Var3) {
                        break;
                    } else {
                        this = pd6Var2;
                    }
                }
            }
            this = pd6Var2;
        }
    }

    public final Object f() {
        return fy.a.getObjectVolatile(this, a);
    }

    public final pd6 g() {
        Object f = f();
        u89 u89Var = f instanceof u89 ? (u89) f : null;
        if (u89Var != null) {
            return u89Var.a;
        }
        f.getClass();
        return (pd6) f;
    }

    public final pd6 h() {
        pd6 d = d();
        if (d != null) {
            return d;
        }
        Unsafe unsafe = fy.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            pd6 pd6Var = (pd6) objectVolatile;
            if (!pd6Var.i()) {
                return pd6Var;
            }
            objectVolatile = fy.a.getObjectVolatile(pd6Var, j);
        }
    }

    public boolean i() {
        return f() instanceof u89;
    }

    public String toString() {
        return new od6(this, ea3.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + ea3.a(this);
    }
}
