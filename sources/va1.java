// default package

import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class va1 extends ap3 implements ta1, wx2, noc {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final zw2 d;
    public final mx2 e;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(va1.class.getDeclaredField("_decisionAndIndex$volatile"));
        n = unsafe.objectFieldOffset(va1.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(va1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public va1(int i, zw2 zw2Var) {
        super(i);
        this.d = zw2Var;
        this.e = zw2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = i9.a;
    }

    public static Object D(sm7 sm7Var, Object obj, int i, ks4 ks4Var) {
        if (obj instanceof yp2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (ks4Var != null || (sm7Var instanceof ra1)) {
            return new wp2(obj, sm7Var instanceof ra1 ? (ra1) sm7Var : null, ks4Var, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(sm7 sm7Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + sm7Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, ks4 ks4Var) {
        B(obj, this.c, ks4Var);
    }

    public final void B(Object obj, int i, ks4 ks4Var) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sm7)) {
                va1 va1Var2 = this;
                if (objectVolatile instanceof xa1) {
                    xa1 xa1Var = (xa1) objectVolatile;
                    if (unsafe.compareAndSwapInt(xa1Var, xa1.c, 0, 1)) {
                        if (ks4Var != null) {
                            va1Var2.k(ks4Var, xa1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                lq5.i(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object D = D((sm7) objectVolatile, obj, i, ks4Var);
            while (true) {
                Unsafe unsafe2 = fx.a;
                va1Var = this;
                if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, D)) {
                    if (!va1Var.w()) {
                        va1Var.n();
                    }
                    va1Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = va1Var;
                }
            }
            this = va1Var;
        }
    }

    public final void C(px2 px2Var) {
        zw2 zw2Var = this.d;
        yo3 yo3Var = zw2Var instanceof yo3 ? (yo3) zw2Var : null;
        B(f9c.a, (yo3Var != null ? yo3Var.d : null) == px2Var ? 4 : this.c, null);
    }

    public final ow5 E(Object obj, ks4 ks4Var) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sm7)) {
                return null;
            }
            Object D = D((sm7) objectVolatile, obj, this.c, ks4Var);
            while (true) {
                Unsafe unsafe2 = fx.a;
                va1Var = this;
                if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, D)) {
                    boolean w = va1Var.w();
                    ow5 ow5Var = n53.a;
                    if (!w) {
                        va1Var.n();
                    }
                    return ow5Var;
                }
                if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                    break;
                }
                this = va1Var;
            }
            this = va1Var;
        }
    }

    @Override // noc
    public final void a(hz9 hz9Var, int i) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                grb.i("invokeOnCancellation should be called at most once");
                return;
            }
            va1 va1Var = this;
            if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                va1Var.v(hz9Var);
                return;
            }
            this = va1Var;
        }
    }

    @Override // ta1
    public final ow5 b(Object obj, ks4 ks4Var) {
        return E(obj, ks4Var);
    }

    @Override // ap3
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sm7) {
                grb.i("Not completed");
                return;
            }
            if (objectVolatile instanceof yp2) {
                return;
            }
            if (objectVolatile instanceof wp2) {
                wp2 wp2Var = (wp2) objectVolatile;
                if (wp2Var.e != null) {
                    grb.i("Must be called at most once");
                    return;
                }
                wp2 a = wp2.a(wp2Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    va1 va1Var2 = this;
                    if (unsafe2.compareAndSwapObject(va1Var2, n, objectVolatile, a)) {
                        ra1 ra1Var = wp2Var.b;
                        if (ra1Var != null) {
                            va1Var2.j(ra1Var, cancellationException);
                        }
                        ks4 ks4Var = wp2Var.c;
                        if (ks4Var != null) {
                            va1Var2.k(ks4Var, cancellationException, wp2Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(va1Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        va1Var = va1Var2;
                        break;
                    }
                    this = va1Var2;
                }
            } else {
                va1 va1Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                wp2 wp2Var2 = new wp2(objectVolatile, (ra1) null, (ks4) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    wp2 wp2Var3 = wp2Var2;
                    Unsafe unsafe3 = fx.a;
                    va1Var = va1Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(va1Var, n, objectVolatile, wp2Var3);
                    wp2Var2 = wp2Var3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(va1Var, j) != objectVolatile) {
                        break;
                    } else {
                        va1Var3 = va1Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = va1Var;
        }
    }

    @Override // ap3
    public final zw2 d() {
        return this.d;
    }

    @Override // ta1
    public final void e(Object obj) {
        o(this.c);
    }

    @Override // ap3
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override // ap3
    public final Object g(Object obj) {
        return obj instanceof wp2 ? ((wp2) obj).a : obj;
    }

    @Override // wx2
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.d;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override // zw2
    public final mx2 getContext() {
        return this.e;
    }

    @Override // ap3
    public final Object i() {
        return r();
    }

    public final void j(ra1 ra1Var, Throwable th) {
        try {
            ra1Var.a(th);
        } catch (Throwable th2) {
            sde.a(this.e, new zp2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(ks4 ks4Var, Throwable th, Object obj) {
        mx2 mx2Var = this.e;
        try {
            ks4Var.a(th, obj, mx2Var);
        } catch (Throwable th2) {
            sde.a(mx2Var, new zp2("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(hz9 hz9Var, Throwable th) {
        mx2 mx2Var = this.e;
        int intVolatile = fx.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            grb.i("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            hz9Var.h(intVolatile, mx2Var);
        } catch (Throwable th2) {
            sde.a(mx2Var, new zp2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sm7)) {
                return false;
            }
            xa1 xa1Var = new xa1(this, th, (objectVolatile instanceof ra1) || (objectVolatile instanceof hz9));
            while (true) {
                Unsafe unsafe2 = fx.a;
                va1Var = this;
                if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, xa1Var)) {
                    sm7 sm7Var = (sm7) objectVolatile;
                    if (sm7Var instanceof ra1) {
                        va1Var.j((ra1) objectVolatile, th);
                    } else if (sm7Var instanceof hz9) {
                        va1Var.l((hz9) objectVolatile, th);
                    }
                    if (!va1Var.w()) {
                        va1Var.n();
                    }
                    va1Var.o(va1Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                    break;
                }
                this = va1Var;
            }
            this = va1Var;
        }
    }

    public final void n() {
        Unsafe unsafe = fx.a;
        long j = h;
        ep3 ep3Var = (ep3) unsafe.getObjectVolatile(this, j);
        if (ep3Var == null) {
            return;
        }
        ep3Var.dispose();
        unsafe.putObjectVolatile(this, j, rm7.a);
    }

    public final void o(int i) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    grb.i("Already resumed");
                    return;
                }
                boolean z = i == 4;
                zw2 zw2Var = this.d;
                if (!z && (zw2Var instanceof yo3)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        yo3 yo3Var = (yo3) zw2Var;
                        px2 px2Var = yo3Var.d;
                        mx2 context = yo3Var.e.getContext();
                        if (px2Var.d(context)) {
                            px2Var.c(context, this);
                            return;
                        }
                        z44 a = crb.a();
                        if (a.c >= 4294967296L) {
                            ls lsVar = a.e;
                            if (lsVar == null) {
                                lsVar = new ls();
                                a.e = lsVar;
                            }
                            lsVar.addLast(this);
                            return;
                        }
                        a.g(true);
                        try {
                            vie.a(this, zw2Var, true);
                            do {
                            } while (a.i());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                vie.a(this, zw2Var, z);
                return;
            }
            va1 va1Var = this;
            if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, TLObject.FLAG_30 + (536870911 & intVolatile))) {
                return;
            } else {
                this = va1Var;
            }
        }
    }

    public Throwable p(sv5 sv5Var) {
        return sv5Var.getCancellationException();
    }

    public final Object q() {
        ev5 ev5Var;
        boolean w = w();
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    grb.i("Already suspended");
                    return null;
                }
                if (w) {
                    this.z();
                }
                Object r = this.r();
                if (r instanceof yp2) {
                    throw ((yp2) r).a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (ev5Var = (ev5) this.e.get(qf5.c)) == null || ev5Var.isActive()) {
                    return this.g(r);
                }
                CancellationException cancellationException = ev5Var.getCancellationException();
                this.c(cancellationException);
                throw cancellationException;
            }
            va1 va1Var = this;
            if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, TLObject.FLAG_29 + (536870911 & intVolatile))) {
                if (((ep3) unsafe.getObjectVolatile(va1Var, h)) == null) {
                    va1Var.t();
                }
                if (w) {
                    va1Var.z();
                }
                return vx2.a;
            }
            this = va1Var;
        }
    }

    public final Object r() {
        return fx.a.getObjectVolatile(this, n);
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            obj = new yp2(a, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        ep3 t = t();
        if (t == null || (r() instanceof sm7)) {
            return;
        }
        t.dispose();
        fx.a.putObjectVolatile(this, h, rm7.a);
    }

    public final ep3 t() {
        ev5 ev5Var = (ev5) this.e.get(qf5.c);
        if (ev5Var == null) {
            return null;
        }
        ep3 c = gqe.c(ev5Var, true, new wg2(this));
        while (true) {
            Unsafe unsafe = fx.a;
            long j = h;
            va1 va1Var = this;
            if (unsafe.compareAndSwapObject(va1Var, j, (Object) null, c) || unsafe.getObjectVolatile(va1Var, j) != null) {
                break;
            }
            this = va1Var;
        }
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(y());
        sb.append('(');
        sb.append(l93.d(this.d));
        sb.append("){");
        Object r = r();
        sb.append(r instanceof sm7 ? "Active" : r instanceof xa1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(l93.a(this));
        return sb.toString();
    }

    public final void u(ur4 ur4Var) {
        v(new qa1(ur4Var, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        x(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c2, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(sm7 sm7Var) {
        sm7 sm7Var2;
        va1 va1Var;
        va1 va1Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = fx.a;
            long j = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof i9) {
                while (true) {
                    Unsafe unsafe3 = fx.a;
                    va1 va1Var3 = this;
                    sm7 sm7Var3 = sm7Var;
                    va1Var = va1Var3;
                    sm7Var2 = sm7Var3;
                    if (!unsafe3.compareAndSwapObject(va1Var3, n, objectVolatile, sm7Var3)) {
                        if (unsafe3.getObjectVolatile(va1Var, j) != objectVolatile) {
                            break;
                        }
                        this = va1Var;
                        sm7Var = sm7Var2;
                    } else {
                        return;
                    }
                }
            } else {
                sm7Var2 = sm7Var;
                va1Var = this;
                if ((objectVolatile instanceof ra1) || (objectVolatile instanceof hz9)) {
                    break;
                }
                if (objectVolatile instanceof yp2) {
                    yp2 yp2Var = (yp2) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(yp2Var, yp2.b, 0, 1)) {
                        x(sm7Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof xa1) {
                        Throwable th = yp2Var.a;
                        if (sm7Var2 instanceof ra1) {
                            va1Var.j((ra1) sm7Var2, th);
                            return;
                        } else {
                            va1Var.l((hz9) sm7Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof wp2) {
                    wp2 wp2Var = (wp2) objectVolatile;
                    if (wp2Var.b != null) {
                        x(sm7Var2, objectVolatile);
                        throw null;
                    }
                    if (sm7Var2 instanceof hz9) {
                        return;
                    }
                    ra1 ra1Var = (ra1) sm7Var2;
                    Throwable th2 = wp2Var.e;
                    if (th2 != null) {
                        va1Var.j(ra1Var, th2);
                        return;
                    }
                    wp2 a = wp2.a(wp2Var, ra1Var, null, 29);
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(va1Var, n, objectVolatile, a)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(va1Var, j) == objectVolatile);
                } else {
                    if (sm7Var2 instanceof hz9) {
                        return;
                    }
                    wp2 wp2Var2 = new wp2(objectVolatile, (ra1) sm7Var2, (ks4) null, (CancellationException) null, 28);
                    while (true) {
                        wp2 wp2Var3 = wp2Var2;
                        Unsafe unsafe4 = fx.a;
                        va1Var2 = va1Var;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(va1Var2, n, objectVolatile, wp2Var3);
                        wp2Var2 = wp2Var3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(va1Var2, j) != objectVolatile) {
                            break;
                        } else {
                            va1Var = va1Var2;
                        }
                    }
                    this = va1Var2;
                    sm7Var = sm7Var2;
                }
            }
            va1Var2 = va1Var;
            this = va1Var2;
            sm7Var = sm7Var2;
        }
    }

    public final boolean w() {
        if (this.c == 2) {
            return fx.a.getObjectVolatile((yo3) this.d, yo3.n) != null;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r9.n();
        r9.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        va1 va1Var;
        Unsafe unsafe;
        zw2 zw2Var = this.d;
        Throwable th = null;
        yo3 yo3Var = zw2Var instanceof yo3 ? (yo3) zw2Var : null;
        if (yo3Var == null) {
            return;
        }
        long j = yo3.n;
        loop0: while (true) {
            Object objectVolatile = fx.a.getObjectVolatile(yo3Var, j);
            ow5 ow5Var = q7c.b;
            if (objectVolatile != ow5Var) {
                va1Var = this;
                if (!(objectVolatile instanceof Throwable)) {
                    lq5.i(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = fx.a;
                    if (unsafe.compareAndSwapObject(yo3Var, yo3.n, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(yo3Var, j) == objectVolatile);
                lq5.j("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                va1 va1Var2 = this;
                va1Var = va1Var2;
                if (unsafe2.compareAndSwapObject(yo3Var, yo3.n, ow5Var, va1Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(yo3Var, j) != ow5Var) {
                    break;
                } else {
                    this = va1Var;
                }
            }
            this = va1Var;
        }
    }
}
