// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class sv5 implements ev5, ah2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = fx.a;
        b = unsafe.objectFieldOffset(sv5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(sv5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public sv5(boolean z) {
        this._state$volatile = z ? yed.g : yed.f;
    }

    public static yg2 E(ud6 ud6Var) {
        while (ud6Var.i()) {
            ud6Var = ud6Var.h();
        }
        while (true) {
            ud6Var = ud6Var.g();
            if (!ud6Var.i()) {
                if (ud6Var instanceof yg2) {
                    return (yg2) ud6Var;
                }
                if (ud6Var instanceof qm7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof lv5)) {
            return obj instanceof hp5 ? ((hp5) obj).isActive() ? "Active" : "New" : obj instanceof yp2 ? "Cancelled" : "Completed";
        }
        lv5 lv5Var = (lv5) obj;
        return lv5Var.d() ? "Cancelling" : lv5Var.e() ? "Completing" : "Active";
    }

    public static CancellationException M(sv5 sv5Var, Throwable th) {
        sv5Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new fv5(sv5Var.l(), th, sv5Var) : cancellationException;
    }

    public boolean A() {
        return this instanceof pk0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == yed.a) {
                return false;
            }
            if (N == yed.b) {
                return true;
            }
        } while (N == yed.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == yed.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                yp2 yp2Var = obj instanceof yp2 ? (yp2) obj : null;
                throw new IllegalStateException(str, yp2Var != null ? yp2Var.a : null);
            }
        } while (N == yed.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(qm7 qm7Var, Throwable th) {
        qm7Var.c(new g76(4), 4);
        Object f = qm7Var.f();
        f.getClass();
        zp2 zp2Var = null;
        for (ud6 ud6Var = (ud6) f; !ud6Var.equals(qm7Var); ud6Var = ud6Var.g()) {
            if ((ud6Var instanceof iv5) && ((iv5) ud6Var).k()) {
                try {
                    ((iv5) ud6Var).l(th);
                } catch (Throwable th2) {
                    if (zp2Var != null) {
                        kke.a(zp2Var, th2);
                    } else {
                        zp2Var = new zp2("Exception in completion handler " + ud6Var + " for " + this, th2);
                    }
                }
            }
        }
        if (zp2Var != null) {
            x(zp2Var);
        }
        k(th);
    }

    public final void I(q24 q24Var) {
        qm7 qm7Var = new qm7();
        Object gp5Var = q24Var.a ? qm7Var : new gp5(qm7Var);
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            sv5 sv5Var = this;
            q24 q24Var2 = q24Var;
            if (unsafe.compareAndSwapObject(sv5Var, j, q24Var2, gp5Var) || unsafe.getObjectVolatile(sv5Var, j) != q24Var2) {
                return;
            }
            this = sv5Var;
            q24Var = q24Var2;
        }
    }

    public final void J(iv5 iv5Var) {
        iv5 iv5Var2;
        sv5 sv5Var;
        qm7 qm7Var = new qm7();
        Unsafe unsafe = fx.a;
        unsafe.putObjectVolatile(qm7Var, ud6.b, iv5Var);
        long j = ud6.a;
        unsafe.putObjectVolatile(qm7Var, j, iv5Var);
        loop0: while (true) {
            if (iv5Var.f() != iv5Var) {
                iv5Var2 = iv5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                iv5Var2 = iv5Var;
                if (unsafe2.compareAndSwapObject(iv5Var2, ud6.a, iv5Var, qm7Var)) {
                    qm7Var.e(iv5Var2);
                    break loop0;
                }
                sv5Var = this;
                iv5Var = iv5Var2;
                if (unsafe2.getObjectVolatile(iv5Var2, j) != iv5Var2) {
                    break;
                } else {
                    this = sv5Var;
                }
            }
            this = sv5Var;
        }
        ud6 g = iv5Var2.g();
        while (true) {
            Unsafe unsafe3 = fx.a;
            long j2 = b;
            sv5 sv5Var2 = this;
            if (unsafe3.compareAndSwapObject(sv5Var2, j2, iv5Var2, g) || unsafe3.getObjectVolatile(sv5Var2, j2) != iv5Var2) {
                return;
            } else {
                this = sv5Var2;
            }
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof q24;
        long j = b;
        if (!z) {
            sv5 sv5Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof gp5)) {
                return 0;
            }
            qm7 qm7Var = ((gp5) obj2).a;
            do {
                sv5 sv5Var2 = sv5Var;
                unsafe = fx.a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe.compareAndSwapObject(sv5Var2, b, obj3, qm7Var);
                sv5Var = sv5Var2;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    return 1;
                }
            } while (unsafe.getObjectVolatile(sv5Var, j) == obj2);
            return -1;
        }
        if (((q24) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = fx.a;
            sv5 sv5Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(sv5Var3, b, obj4, yed.g)) {
                return 1;
            }
            if (unsafe2.getObjectVolatile(sv5Var3, j) != obj4) {
                return -1;
            }
            this = sv5Var3;
            obj = obj4;
        }
    }

    public final Object N(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof hp5)) {
            return yed.a;
        }
        if ((!(obj instanceof q24) && !(obj instanceof iv5)) || (obj instanceof yg2) || (obj2 instanceof yp2)) {
            sv5 sv5Var = this;
            hp5 hp5Var = (hp5) obj;
            qm7 u = sv5Var.u(hp5Var);
            if (u == null) {
                return yed.c;
            }
            lv5 lv5Var = hp5Var instanceof lv5 ? (lv5) hp5Var : null;
            if (lv5Var == null) {
                lv5Var = new lv5(u, null);
            }
            lv5 lv5Var2 = lv5Var;
            synchronized (lv5Var2) {
                if (lv5Var2.e()) {
                    return yed.a;
                }
                fx.a.putIntVolatile(lv5Var2, lv5.c, 1);
                if (lv5Var2 != hp5Var) {
                    do {
                        unsafe = fx.a;
                        j = b;
                        sv5 sv5Var2 = sv5Var;
                        sv5Var = sv5Var2;
                        if (!unsafe.compareAndSwapObject(sv5Var2, j, hp5Var, lv5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(sv5Var, j) == hp5Var);
                    return yed.c;
                }
                boolean d = lv5Var2.d();
                yp2 yp2Var = obj2 instanceof yp2 ? (yp2) obj2 : null;
                if (yp2Var != null) {
                    lv5Var2.a(yp2Var.a);
                }
                Throwable c2 = d ? null : lv5Var2.c();
                if (c2 != null) {
                    sv5Var.F(u, c2);
                }
                yg2 E = E(u);
                if (E != null && sv5Var.O(lv5Var2, E, obj2)) {
                    return yed.b;
                }
                u.c(new g76(2), 2);
                yg2 E2 = E(u);
                return (E2 == null || !sv5Var.O(lv5Var2, E2, obj2)) ? sv5Var.p(lv5Var2, obj2) : yed.b;
            }
        }
        hp5 hp5Var2 = (hp5) obj;
        Object ip5Var = obj2 instanceof hp5 ? new ip5((hp5) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = fx.a;
            long j2 = b;
            sv5 sv5Var3 = this;
            if (unsafe2.compareAndSwapObject(sv5Var3, j2, hp5Var2, ip5Var)) {
                sv5Var3.G(obj2);
                sv5Var3.n(hp5Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(sv5Var3, j2) != hp5Var2) {
                return yed.c;
            }
            this = sv5Var3;
        }
    }

    public final boolean O(lv5 lv5Var, yg2 yg2Var, Object obj) {
        while (gqe.c(yg2Var.e, false, new kv5(this, lv5Var, yg2Var, obj)) == rm7.a) {
            yg2Var = E(yg2Var);
            if (yg2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // ev5
    public final xg2 attachChild(ah2 ah2Var) {
        sv5 sv5Var;
        yg2 yg2Var = new yg2(ah2Var);
        yg2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof q24) {
                q24 q24Var = (q24) v;
                if (q24Var.a) {
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j = b;
                        sv5Var = this;
                        if (unsafe.compareAndSwapObject(sv5Var, j, v, yg2Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(sv5Var, j) == v) {
                            this = sv5Var;
                        }
                    }
                } else {
                    sv5Var = this;
                    sv5Var.I(q24Var);
                }
                this = sv5Var;
            } else {
                sv5Var = this;
                boolean z = v instanceof hp5;
                rm7 rm7Var = rm7.a;
                if (!z) {
                    Object v2 = sv5Var.v();
                    yp2 yp2Var = v2 instanceof yp2 ? (yp2) v2 : null;
                    yg2Var.l(yp2Var != null ? yp2Var.a : null);
                    return rm7Var;
                }
                qm7 b2 = ((hp5) v).b();
                if (b2 == null) {
                    sv5Var.J((iv5) v);
                    this = sv5Var;
                } else if (!b2.c(yg2Var, 7)) {
                    boolean c2 = b2.c(yg2Var, 3);
                    Object v3 = sv5Var.v();
                    if (v3 instanceof lv5) {
                        r0 = ((lv5) v3).c();
                    } else {
                        yp2 yp2Var2 = v3 instanceof yp2 ? (yp2) v3 : null;
                        if (yp2Var2 != null) {
                            r0 = yp2Var2.a;
                        }
                    }
                    yg2Var.l(r0);
                    if (c2) {
                        break loop0;
                    }
                    return rm7Var;
                }
            }
        }
        return yg2Var;
    }

    public final Object await(zw2 zw2Var) {
        return h(zw2Var);
    }

    @Override // ev5
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // mx2
    public final kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override // ev5
    public final CancellationException getCancellationException() {
        Object v = v();
        if (!(v instanceof lv5)) {
            if (!(v instanceof hp5)) {
                return v instanceof yp2 ? M(this, ((yp2) v).a) : new fv5(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            lq5.i(this, "Job is still new or active: ");
            return null;
        }
        Throwable c2 = ((lv5) v).c();
        if (c2 == null) {
            lq5.i(this, "Job is still new or active: ");
            return null;
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        return cancellationException == null ? new fv5(concat, c2, this) : cancellationException;
    }

    @Override // ev5
    public final f8a getChildren() {
        return new l8a(new ov5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object v = v();
        if (v instanceof hp5) {
            grb.i("This job has not completed yet");
            return null;
        }
        yp2 yp2Var = v instanceof yp2 ? (yp2) v : null;
        if (yp2Var != null) {
            return yp2Var.a;
        }
        return null;
    }

    @Override // kx2
    public final lx2 getKey() {
        return qf5.c;
    }

    public final Object h(zw2 zw2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof hp5)) {
                if (v instanceof yp2) {
                    throw ((yp2) v).a;
                }
                return yed.a(v);
            }
        } while (K(v) < 0);
        jv5 jv5Var = new jv5(xpe.a(zw2Var), this);
        jv5Var.s();
        jv5Var.v(new qa1(gqe.c(this, true, new ne9(jv5Var)), (byte) 2));
        return jv5Var.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0 != yed.b) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        sv5 sv5Var;
        ow5 ow5Var;
        Object obj2;
        Object obj3 = yed.a;
        if (t()) {
            do {
                Object v = v();
                if (!(v instanceof hp5) || ((v instanceof lv5) && ((lv5) v).e())) {
                    obj3 = yed.a;
                    break;
                }
                obj3 = N(v, new yp2(o(obj), false));
            } while (obj3 == yed.c);
        }
        if (obj3 == yed.a) {
            Throwable th = null;
            loop1: while (true) {
                Object v2 = this.v();
                if (!(v2 instanceof lv5)) {
                    if (!(v2 instanceof hp5)) {
                        sv5Var = this;
                        obj2 = yed.d;
                        break;
                    }
                    if (th == null) {
                        th = this.o(obj);
                    }
                    hp5 hp5Var = (hp5) v2;
                    if (hp5Var.isActive()) {
                        qm7 u = this.u(hp5Var);
                        if (u == null) {
                            sv5Var = this;
                        } else {
                            lv5 lv5Var = new lv5(u, th);
                            while (true) {
                                Unsafe unsafe = fx.a;
                                long j = b;
                                sv5Var = this;
                                if (unsafe.compareAndSwapObject(sv5Var, j, hp5Var, lv5Var)) {
                                    sv5Var.F(u, th);
                                    obj2 = yed.a;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(sv5Var, j) == hp5Var) {
                                    this = sv5Var;
                                }
                            }
                        }
                        this = sv5Var;
                    } else {
                        sv5Var = this;
                        obj2 = sv5Var.N(v2, new yp2(th, false));
                        if (obj2 == yed.a) {
                            lq5.i(v2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != yed.c) {
                            break;
                        }
                        this = sv5Var;
                    }
                } else {
                    synchronized (v2) {
                        if (fx.a.getObjectVolatile((lv5) v2, lv5.b) == yed.e) {
                            ow5Var = yed.d;
                        } else {
                            boolean d = ((lv5) v2).d();
                            if (th == null) {
                                th = this.o(obj);
                            }
                            ((lv5) v2).a(th);
                            Throwable c2 = d ? null : ((lv5) v2).c();
                            if (c2 != null) {
                                this.F(((lv5) v2).a, c2);
                            }
                            ow5Var = yed.a;
                        }
                    }
                    sv5Var = this;
                    obj3 = ow5Var;
                }
            }
            obj3 = obj2;
        } else {
            sv5Var = this;
        }
        if (obj3 != yed.a && obj3 != yed.b) {
            if (obj3 == yed.d) {
                return false;
            }
            sv5Var.f(obj3);
            return true;
        }
        return true;
    }

    @Override // ev5
    public final ep3 invokeOnCompletion(boolean z, boolean z2, ur4 ur4Var) {
        return z(z2, z ? new nt5(ur4Var) : new ot5(ur4Var));
    }

    @Override // ev5
    public final boolean isActive() {
        Object v = v();
        return (v instanceof hp5) && ((hp5) v).isActive();
    }

    @Override // ev5
    public final boolean isCancelled() {
        Object v = v();
        if (v instanceof yp2) {
            return true;
        }
        return (v instanceof lv5) && ((lv5) v).d();
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    @Override // ev5
    public final Object join(zw2 zw2Var) {
        Object v;
        f9c f9cVar;
        do {
            v = v();
            boolean z = v instanceof hp5;
            f9cVar = f9c.a;
            if (!z) {
                gqe.a(zw2Var.getContext());
                return f9cVar;
            }
        } while (K(v) < 0);
        va1 va1Var = new va1(1, xpe.a(zw2Var));
        va1Var.s();
        va1Var.v(new qa1(gqe.c(this, true, new oe9(va1Var)), (byte) 2));
        Object q = va1Var.q();
        vx2 vx2Var = vx2.a;
        if (q != vx2Var) {
            q = f9cVar;
        }
        return q == vx2Var ? q : f9cVar;
    }

    public final boolean k(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        xg2 xg2Var = (xg2) fx.a.getObjectVolatile(this, a);
        return (xg2Var == null || xg2Var == rm7.a) ? z : xg2Var.a(th) || z;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && s();
    }

    @Override // mx2
    public final mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    public final void n(hp5 hp5Var, Object obj) {
        Unsafe unsafe = fx.a;
        long j = a;
        xg2 xg2Var = (xg2) unsafe.getObjectVolatile(this, j);
        if (xg2Var != null) {
            xg2Var.dispose();
            unsafe.putObjectVolatile(this, j, rm7.a);
        }
        zp2 zp2Var = null;
        yp2 yp2Var = obj instanceof yp2 ? (yp2) obj : null;
        Throwable th = yp2Var != null ? yp2Var.a : null;
        if (hp5Var instanceof iv5) {
            try {
                ((iv5) hp5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new zp2("Exception in completion handler " + hp5Var + " for " + this, th2));
                return;
            }
        }
        qm7 b2 = hp5Var.b();
        if (b2 != null) {
            b2.c(new g76(1), 1);
            Object f = b2.f();
            f.getClass();
            for (ud6 ud6Var = (ud6) f; !ud6Var.equals(b2); ud6Var = ud6Var.g()) {
                if (ud6Var instanceof iv5) {
                    try {
                        ((iv5) ud6Var).l(th);
                    } catch (Throwable th3) {
                        if (zp2Var != null) {
                            kke.a(zp2Var, th3);
                        } else {
                            zp2Var = new zp2("Exception in completion handler " + ud6Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (zp2Var != null) {
                x(zp2Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable o(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        sv5 sv5Var = (sv5) obj;
        Object v = sv5Var.v();
        if (v instanceof lv5) {
            cancellationException = ((lv5) v).c();
        } else if (v instanceof yp2) {
            cancellationException = ((yp2) v).a;
        } else {
            if (v instanceof hp5) {
                lq5.i(v, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new fv5("Parent job is ".concat(L(v)), cancellationException, sv5Var) : cancellationException2;
    }

    public final Object p(lv5 lv5Var, Object obj) {
        lv5 lv5Var2;
        Throwable th;
        Throwable r;
        sv5 sv5Var;
        lv5 lv5Var3;
        yp2 yp2Var = obj instanceof yp2 ? (yp2) obj : null;
        Throwable th2 = yp2Var != null ? yp2Var.a : null;
        synchronized (lv5Var) {
            try {
                lv5Var.d();
                ArrayList f = lv5Var.f(th2);
                r = r(lv5Var, f);
                if (r != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != r && th3 != r && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    kke.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        lv5Var2 = lv5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                lv5Var2 = lv5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new yp2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            fx.a.compareAndSwapInt((yp2) obj, yp2.b, 0, 1);
        }
        G(obj);
        Object ip5Var = obj instanceof hp5 ? new ip5((hp5) obj) : obj;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            sv5Var = this;
            lv5Var3 = lv5Var;
            if (unsafe.compareAndSwapObject(sv5Var, j, lv5Var3, ip5Var) || unsafe.getObjectVolatile(sv5Var, j) != lv5Var3) {
                break;
            }
            this = sv5Var;
            lv5Var = lv5Var3;
        }
        sv5Var.n(lv5Var3, obj);
        return obj;
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }

    public final Object q() {
        Object v = v();
        if (v instanceof hp5) {
            grb.i("This job has not completed yet");
            return null;
        }
        if (v instanceof yp2) {
            throw ((yp2) v).a;
        }
        return yed.a(v);
    }

    public final Throwable r(lv5 lv5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (lv5Var.d()) {
                return new fv5(l(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof msb) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof msb)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean s() {
        return true;
    }

    @Override // ev5
    public final boolean start() {
        int K;
        do {
            K = K(v());
            if (K == 0) {
                return false;
            }
        } while (K != 1);
        return true;
    }

    public boolean t() {
        return this instanceof vp2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + l93.a(this);
    }

    public final qm7 u(hp5 hp5Var) {
        qm7 b2 = hp5Var.b();
        if (b2 != null) {
            return b2;
        }
        if (hp5Var instanceof q24) {
            return new qm7();
        }
        if (hp5Var instanceof iv5) {
            J((iv5) hp5Var);
            return null;
        }
        lq5.i(hp5Var, "State should have list: ");
        return null;
    }

    public final Object v() {
        return fx.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(ev5 ev5Var) {
        long j = a;
        rm7 rm7Var = rm7.a;
        if (ev5Var == null) {
            fx.a.putObjectVolatile(this, j, rm7Var);
            return;
        }
        ev5Var.start();
        xg2 attachChild = ev5Var.attachChild(this);
        Unsafe unsafe = fx.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (v() instanceof hp5) {
            return;
        }
        attachChild.dispose();
        unsafe.putObjectVolatile(this, j, rm7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ep3 z(boolean z, iv5 iv5Var) {
        sv5 sv5Var;
        iv5 iv5Var2;
        rm7 rm7Var;
        boolean c2;
        iv5Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof q24) {
                q24 q24Var = (q24) v;
                if (q24Var.a) {
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j = b;
                        sv5Var = this;
                        iv5Var2 = iv5Var;
                        if (unsafe.compareAndSwapObject(sv5Var, j, v, iv5Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(sv5Var, j) == v) {
                            this = sv5Var;
                            iv5Var = iv5Var2;
                        }
                    }
                } else {
                    sv5Var = this;
                    iv5Var2 = iv5Var;
                    sv5Var.I(q24Var);
                }
                this = sv5Var;
                iv5Var = iv5Var2;
            } else {
                sv5Var = this;
                iv5Var2 = iv5Var;
                boolean z2 = v instanceof hp5;
                rm7Var = rm7.a;
                if (z2) {
                    hp5 hp5Var = (hp5) v;
                    qm7 b2 = hp5Var.b();
                    if (b2 == null) {
                        sv5Var.J((iv5) v);
                    } else {
                        if (iv5Var2.k()) {
                            lv5 lv5Var = hp5Var instanceof lv5 ? (lv5) hp5Var : null;
                            Throwable c3 = lv5Var != null ? lv5Var.c() : null;
                            if (c3 == null) {
                                c2 = b2.c(iv5Var2, 5);
                            } else if (z) {
                                iv5Var2.l(c3);
                                return rm7Var;
                            }
                        } else {
                            c2 = b2.c(iv5Var2, 1);
                        }
                        if (c2) {
                            break;
                        }
                    }
                    this = sv5Var;
                    iv5Var = iv5Var2;
                } else if (z) {
                    Object v2 = sv5Var.v();
                    yp2 yp2Var = v2 instanceof yp2 ? (yp2) v2 : null;
                    iv5Var2.l(yp2Var != null ? yp2Var.a : null);
                }
            }
        }
        return rm7Var;
    }

    @Override // ev5
    public final ep3 invokeOnCompletion(ur4 ur4Var) {
        return z(true, new ot5(ur4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(zp2 zp2Var) {
        throw zp2Var;
    }
}
