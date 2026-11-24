// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qb6 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = ex.a;
        a = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(qb6 qb6Var, int i) {
        qb6 qb6Var2;
        qb6 qb6Var3;
        while (true) {
            qb6 h = this.h();
            if (h instanceof c56) {
                return (((c56) h).d & i) == 0 && h.c(qb6Var, i);
            }
            Unsafe unsafe = ex.a;
            unsafe.putObjectVolatile(qb6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(qb6Var, j, this);
            while (true) {
                Unsafe unsafe2 = ex.a;
                qb6Var2 = this;
                qb6Var3 = qb6Var;
                if (unsafe2.compareAndSwapObject(h, a, qb6Var2, qb6Var3)) {
                    qb6Var3.e(qb6Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != qb6Var2) {
                    break;
                }
                this = qb6Var2;
                qb6Var = qb6Var3;
            }
            this = qb6Var2;
            qb6Var = qb6Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0029, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb6 d() {
        qb6 qb6Var;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = ex.a;
            long j = b;
            qb6 qb6Var2 = (qb6) unsafe2.getObjectVolatile(this, j);
            qb6 qb6Var3 = null;
            qb6 qb6Var4 = qb6Var2;
            while (qb6Var4 != null) {
                Unsafe unsafe3 = ex.a;
                long j2 = a;
                Object objectVolatile = unsafe3.getObjectVolatile(qb6Var4, j2);
                if (objectVolatile != this) {
                    qb6 qb6Var5 = qb6Var2;
                    qb6Var = this;
                    if (qb6Var.i()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof s69)) {
                        objectVolatile.getClass();
                        qb6Var3 = qb6Var4;
                        qb6Var4 = (qb6) objectVolatile;
                    } else if (qb6Var3 != null) {
                        qb6 qb6Var6 = ((s69) objectVolatile).a;
                        do {
                            qb6 qb6Var7 = qb6Var4;
                            unsafe = ex.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(qb6Var3, a, qb6Var7, qb6Var6);
                            qb6Var4 = qb6Var7;
                            if (compareAndSwapObject) {
                                this = qb6Var;
                                qb6Var4 = qb6Var3;
                                qb6Var2 = qb6Var5;
                                qb6Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(qb6Var3, j2) == qb6Var4);
                    } else {
                        if (qb6Var4 == null) {
                            fyb.g();
                            return null;
                        }
                        qb6Var4 = (qb6) unsafe3.getObjectVolatile(qb6Var4, j);
                    }
                    this = qb6Var;
                    qb6Var2 = qb6Var5;
                } else {
                    if (qb6Var2 == qb6Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = ex.a;
                        qb6 qb6Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(qb6Var8, b, qb6Var2, qb6Var4);
                        qb6 qb6Var9 = qb6Var2;
                        qb6Var = qb6Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(qb6Var, j) == qb6Var9) {
                            this = qb6Var;
                            qb6Var2 = qb6Var9;
                        }
                    }
                }
                this = qb6Var;
            }
            fyb.g();
            return null;
        }
    }

    public final void e(qb6 qb6Var) {
        qb6 qb6Var2;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            qb6 qb6Var3 = (qb6) unsafe.getObjectVolatile(qb6Var, j);
            if (this.f() != qb6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                qb6Var2 = this;
                qb6 qb6Var4 = qb6Var;
                if (unsafe2.compareAndSwapObject(qb6Var4, b, qb6Var3, qb6Var2)) {
                    if (qb6Var2.i()) {
                        qb6Var4.d();
                        return;
                    }
                    return;
                } else {
                    qb6Var = qb6Var4;
                    if (unsafe2.getObjectVolatile(qb6Var4, j) != qb6Var3) {
                        break;
                    } else {
                        this = qb6Var2;
                    }
                }
            }
            this = qb6Var2;
        }
    }

    public final Object f() {
        return ex.a.getObjectVolatile(this, a);
    }

    public final qb6 g() {
        Object f = f();
        s69 s69Var = f instanceof s69 ? (s69) f : null;
        if (s69Var != null) {
            return s69Var.a;
        }
        f.getClass();
        return (qb6) f;
    }

    public final qb6 h() {
        qb6 d = d();
        if (d != null) {
            return d;
        }
        Unsafe unsafe = ex.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            qb6 qb6Var = (qb6) objectVolatile;
            if (!qb6Var.i()) {
                return qb6Var;
            }
            objectVolatile = ex.a.getObjectVolatile(qb6Var, j);
        }
    }

    public boolean i() {
        return f() instanceof s69;
    }

    public String toString() {
        return new pb6(this, s83.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + s83.a(this);
    }
}
