// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ov5 implements av5, wh2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = fy.a;
        b = unsafe.objectFieldOffset(ov5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(ov5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ov5(boolean z) {
        this._state$volatile = z ? hcd.g : hcd.f;
    }

    public static uh2 E(pd6 pd6Var) {
        while (pd6Var.i()) {
            pd6Var = pd6Var.h();
        }
        while (true) {
            pd6Var = pd6Var.g();
            if (!pd6Var.i()) {
                if (pd6Var instanceof uh2) {
                    return (uh2) pd6Var;
                }
                if (pd6Var instanceof ul7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof hv5)) {
            return obj instanceof ep5 ? ((ep5) obj).isActive() ? "Active" : "New" : obj instanceof qq2 ? "Cancelled" : "Completed";
        }
        hv5 hv5Var = (hv5) obj;
        return hv5Var.d() ? "Cancelling" : hv5Var.e() ? "Completing" : "Active";
    }

    public static CancellationException M(ov5 ov5Var, Throwable th) {
        ov5Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new bv5(ov5Var.l(), th, ov5Var) : cancellationException;
    }

    public boolean A() {
        return this instanceof ol0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == hcd.a) {
                return false;
            }
            if (N == hcd.b) {
                return true;
            }
        } while (N == hcd.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == hcd.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                qq2 qq2Var = obj instanceof qq2 ? (qq2) obj : null;
                throw new IllegalStateException(str, qq2Var != null ? qq2Var.a : null);
            }
        } while (N == hcd.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(ul7 ul7Var, Throwable th) {
        ul7Var.c(new c76(4), 4);
        Object f = ul7Var.f();
        f.getClass();
        rq2 rq2Var = null;
        for (pd6 pd6Var = (pd6) f; !pd6Var.equals(ul7Var); pd6Var = pd6Var.g()) {
            if ((pd6Var instanceof ev5) && ((ev5) pd6Var).k()) {
                try {
                    ((ev5) pd6Var).l(th);
                } catch (Throwable th2) {
                    if (rq2Var != null) {
                        uhe.a(rq2Var, th2);
                    } else {
                        rq2Var = new rq2("Exception in completion handler " + pd6Var + " for " + this, th2);
                    }
                }
            }
        }
        if (rq2Var != null) {
            x(rq2Var);
        }
        k(th);
    }

    public final void I(g34 g34Var) {
        ul7 ul7Var = new ul7();
        Object dp5Var = g34Var.a ? ul7Var : new dp5(ul7Var);
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            ov5 ov5Var = this;
            g34 g34Var2 = g34Var;
            if (unsafe.compareAndSwapObject(ov5Var, j, g34Var2, dp5Var) || unsafe.getObjectVolatile(ov5Var, j) != g34Var2) {
                return;
            }
            this = ov5Var;
            g34Var = g34Var2;
        }
    }

    public final void J(ev5 ev5Var) {
        ev5 ev5Var2;
        ov5 ov5Var;
        ul7 ul7Var = new ul7();
        Unsafe unsafe = fy.a;
        unsafe.putObjectVolatile(ul7Var, pd6.b, ev5Var);
        long j = pd6.a;
        unsafe.putObjectVolatile(ul7Var, j, ev5Var);
        loop0: while (true) {
            if (ev5Var.f() != ev5Var) {
                ev5Var2 = ev5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                ev5Var2 = ev5Var;
                if (unsafe2.compareAndSwapObject(ev5Var2, pd6.a, ev5Var, ul7Var)) {
                    ul7Var.e(ev5Var2);
                    break loop0;
                }
                ov5Var = this;
                ev5Var = ev5Var2;
                if (unsafe2.getObjectVolatile(ev5Var2, j) != ev5Var2) {
                    break;
                } else {
                    this = ov5Var;
                }
            }
            this = ov5Var;
        }
        pd6 g = ev5Var2.g();
        while (true) {
            Unsafe unsafe3 = fy.a;
            long j2 = b;
            ov5 ov5Var2 = this;
            if (unsafe3.compareAndSwapObject(ov5Var2, j2, ev5Var2, g) || unsafe3.getObjectVolatile(ov5Var2, j2) != ev5Var2) {
                return;
            } else {
                this = ov5Var2;
            }
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof g34;
        long j = b;
        if (!z) {
            ov5 ov5Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof dp5)) {
                return 0;
            }
            ul7 ul7Var = ((dp5) obj2).a;
            do {
                ov5 ov5Var2 = ov5Var;
                unsafe = fy.a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe.compareAndSwapObject(ov5Var2, b, obj3, ul7Var);
                ov5Var = ov5Var2;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    return 1;
                }
            } while (unsafe.getObjectVolatile(ov5Var, j) == obj2);
            return -1;
        }
        if (((g34) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = fy.a;
            ov5 ov5Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(ov5Var3, b, obj4, hcd.g)) {
                return 1;
            }
            if (unsafe2.getObjectVolatile(ov5Var3, j) != obj4) {
                return -1;
            }
            this = ov5Var3;
            obj = obj4;
        }
    }

    public final Object N(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof ep5)) {
            return hcd.a;
        }
        if ((!(obj instanceof g34) && !(obj instanceof ev5)) || (obj instanceof uh2) || (obj2 instanceof qq2)) {
            ov5 ov5Var = this;
            ep5 ep5Var = (ep5) obj;
            ul7 u = ov5Var.u(ep5Var);
            if (u == null) {
                return hcd.c;
            }
            hv5 hv5Var = ep5Var instanceof hv5 ? (hv5) ep5Var : null;
            if (hv5Var == null) {
                hv5Var = new hv5(u, null);
            }
            hv5 hv5Var2 = hv5Var;
            synchronized (hv5Var2) {
                if (hv5Var2.e()) {
                    return hcd.a;
                }
                fy.a.putIntVolatile(hv5Var2, hv5.c, 1);
                if (hv5Var2 != ep5Var) {
                    do {
                        unsafe = fy.a;
                        j = b;
                        ov5 ov5Var2 = ov5Var;
                        ov5Var = ov5Var2;
                        if (!unsafe.compareAndSwapObject(ov5Var2, j, ep5Var, hv5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(ov5Var, j) == ep5Var);
                    return hcd.c;
                }
                boolean d = hv5Var2.d();
                qq2 qq2Var = obj2 instanceof qq2 ? (qq2) obj2 : null;
                if (qq2Var != null) {
                    hv5Var2.a(qq2Var.a);
                }
                Throwable c2 = d ? null : hv5Var2.c();
                if (c2 != null) {
                    ov5Var.F(u, c2);
                }
                uh2 E = E(u);
                if (E != null && ov5Var.O(hv5Var2, E, obj2)) {
                    return hcd.b;
                }
                u.c(new c76(2), 2);
                uh2 E2 = E(u);
                return (E2 == null || !ov5Var.O(hv5Var2, E2, obj2)) ? ov5Var.p(hv5Var2, obj2) : hcd.b;
            }
        }
        ep5 ep5Var2 = (ep5) obj;
        Object fp5Var = obj2 instanceof ep5 ? new fp5((ep5) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = fy.a;
            long j2 = b;
            ov5 ov5Var3 = this;
            if (unsafe2.compareAndSwapObject(ov5Var3, j2, ep5Var2, fp5Var)) {
                ov5Var3.G(obj2);
                ov5Var3.n(ep5Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(ov5Var3, j2) != ep5Var2) {
                return hcd.c;
            }
            this = ov5Var3;
        }
    }

    public final boolean O(hv5 hv5Var, uh2 uh2Var, Object obj) {
        while (pne.c(uh2Var.e, false, new gv5(this, hv5Var, uh2Var, obj)) == vl7.a) {
            uh2Var = E(uh2Var);
            if (uh2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // av5
    public final th2 attachChild(wh2 wh2Var) {
        ov5 ov5Var;
        uh2 uh2Var = new uh2(wh2Var);
        uh2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof g34) {
                g34 g34Var = (g34) v;
                if (g34Var.a) {
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long j = b;
                        ov5Var = this;
                        if (unsafe.compareAndSwapObject(ov5Var, j, v, uh2Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(ov5Var, j) == v) {
                            this = ov5Var;
                        }
                    }
                } else {
                    ov5Var = this;
                    ov5Var.I(g34Var);
                }
                this = ov5Var;
            } else {
                ov5Var = this;
                boolean z = v instanceof ep5;
                vl7 vl7Var = vl7.a;
                if (!z) {
                    Object v2 = ov5Var.v();
                    qq2 qq2Var = v2 instanceof qq2 ? (qq2) v2 : null;
                    uh2Var.l(qq2Var != null ? qq2Var.a : null);
                    return vl7Var;
                }
                ul7 b2 = ((ep5) v).b();
                if (b2 == null) {
                    ov5Var.J((ev5) v);
                    this = ov5Var;
                } else if (!b2.c(uh2Var, 7)) {
                    boolean c2 = b2.c(uh2Var, 3);
                    Object v3 = ov5Var.v();
                    if (v3 instanceof hv5) {
                        r0 = ((hv5) v3).c();
                    } else {
                        qq2 qq2Var2 = v3 instanceof qq2 ? (qq2) v3 : null;
                        if (qq2Var2 != null) {
                            r0 = qq2Var2.a;
                        }
                    }
                    uh2Var.l(r0);
                    if (c2) {
                        break loop0;
                    }
                    return vl7Var;
                }
            }
        }
        return uh2Var;
    }

    public final Object await(px2 px2Var) {
        return h(px2Var);
    }

    @Override // av5
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new bv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override // cy2
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // cy2
    public final ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override // av5
    public final CancellationException getCancellationException() {
        Object v = v();
        if (!(v instanceof hv5)) {
            if (!(v instanceof ep5)) {
                return v instanceof qq2 ? M(this, ((qq2) v).a) : new bv5(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            zo4.p(this, "Job is still new or active: ");
            return null;
        }
        Throwable c2 = ((hv5) v).c();
        if (c2 == null) {
            zo4.p(this, "Job is still new or active: ");
            return null;
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        return cancellationException == null ? new bv5(concat, c2, this) : cancellationException;
    }

    @Override // av5
    public final p6a getChildren() {
        return new v6a(new kv5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object v = v();
        if (v instanceof ep5) {
            dq9.m("This job has not completed yet");
            return null;
        }
        qq2 qq2Var = v instanceof qq2 ? (qq2) v : null;
        if (qq2Var != null) {
            return qq2Var.a;
        }
        return null;
    }

    @Override // ay2
    public final by2 getKey() {
        return nf5.c;
    }

    public final Object h(px2 px2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof ep5)) {
                if (v instanceof qq2) {
                    throw ((qq2) v).a;
                }
                return hcd.a(v);
            }
        } while (K(v) < 0);
        fv5 fv5Var = new fv5(fne.a(px2Var), this);
        fv5Var.s();
        fv5Var.v(new qb1(pne.c(this, true, new zc9(fv5Var)), (byte) 2));
        return fv5Var.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0 != hcd.b) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        ov5 ov5Var;
        du2 du2Var;
        Object obj2;
        Object obj3 = hcd.a;
        if (t()) {
            do {
                Object v = v();
                if (!(v instanceof ep5) || ((v instanceof hv5) && ((hv5) v).e())) {
                    obj3 = hcd.a;
                    break;
                }
                obj3 = N(v, new qq2(o(obj), false));
            } while (obj3 == hcd.c);
        }
        if (obj3 == hcd.a) {
            Throwable th = null;
            loop1: while (true) {
                Object v2 = this.v();
                if (!(v2 instanceof hv5)) {
                    if (!(v2 instanceof ep5)) {
                        ov5Var = this;
                        obj2 = hcd.d;
                        break;
                    }
                    if (th == null) {
                        th = this.o(obj);
                    }
                    ep5 ep5Var = (ep5) v2;
                    if (ep5Var.isActive()) {
                        ul7 u = this.u(ep5Var);
                        if (u == null) {
                            ov5Var = this;
                        } else {
                            hv5 hv5Var = new hv5(u, th);
                            while (true) {
                                Unsafe unsafe = fy.a;
                                long j = b;
                                ov5Var = this;
                                if (unsafe.compareAndSwapObject(ov5Var, j, ep5Var, hv5Var)) {
                                    ov5Var.F(u, th);
                                    obj2 = hcd.a;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(ov5Var, j) == ep5Var) {
                                    this = ov5Var;
                                }
                            }
                        }
                        this = ov5Var;
                    } else {
                        ov5Var = this;
                        obj2 = ov5Var.N(v2, new qq2(th, false));
                        if (obj2 == hcd.a) {
                            zo4.p(v2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != hcd.c) {
                            break;
                        }
                        this = ov5Var;
                    }
                } else {
                    synchronized (v2) {
                        if (fy.a.getObjectVolatile((hv5) v2, hv5.b) == hcd.e) {
                            du2Var = hcd.d;
                        } else {
                            boolean d = ((hv5) v2).d();
                            if (th == null) {
                                th = this.o(obj);
                            }
                            ((hv5) v2).a(th);
                            Throwable c2 = d ? null : ((hv5) v2).c();
                            if (c2 != null) {
                                this.F(((hv5) v2).a, c2);
                            }
                            du2Var = hcd.a;
                        }
                    }
                    ov5Var = this;
                    obj3 = du2Var;
                }
            }
            obj3 = obj2;
        } else {
            ov5Var = this;
        }
        if (obj3 != hcd.a && obj3 != hcd.b) {
            if (obj3 == hcd.d) {
                return false;
            }
            ov5Var.f(obj3);
            return true;
        }
        return true;
    }

    @Override // av5
    public final xp3 invokeOnCompletion(boolean z, boolean z2, rr4 rr4Var) {
        return z(z2, z ? new kt5(rr4Var) : new lt5(rr4Var));
    }

    @Override // av5
    public final boolean isActive() {
        Object v = v();
        return (v instanceof ep5) && ((ep5) v).isActive();
    }

    @Override // av5
    public final boolean isCancelled() {
        Object v = v();
        if (v instanceof qq2) {
            return true;
        }
        return (v instanceof hv5) && ((hv5) v).d();
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    @Override // av5
    public final Object join(px2 px2Var) {
        Object v;
        g7c g7cVar;
        do {
            v = v();
            boolean z = v instanceof ep5;
            g7cVar = g7c.a;
            if (!z) {
                pne.a(px2Var.getContext());
                return g7cVar;
            }
        } while (K(v) < 0);
        vb1 vb1Var = new vb1(1, fne.a(px2Var));
        vb1Var.s();
        vb1Var.v(new qb1(pne.c(this, true, new ad9(vb1Var)), (byte) 2));
        Object q = vb1Var.q();
        ly2 ly2Var = ly2.a;
        if (q != ly2Var) {
            q = g7cVar;
        }
        return q == ly2Var ? q : g7cVar;
    }

    public final boolean k(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        th2 th2Var = (th2) fy.a.getObjectVolatile(this, a);
        return (th2Var == null || th2Var == vl7.a) ? z : th2Var.a(th) || z;
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

    @Override // cy2
    public final cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    public final void n(ep5 ep5Var, Object obj) {
        Unsafe unsafe = fy.a;
        long j = a;
        th2 th2Var = (th2) unsafe.getObjectVolatile(this, j);
        if (th2Var != null) {
            th2Var.dispose();
            unsafe.putObjectVolatile(this, j, vl7.a);
        }
        rq2 rq2Var = null;
        qq2 qq2Var = obj instanceof qq2 ? (qq2) obj : null;
        Throwable th = qq2Var != null ? qq2Var.a : null;
        if (ep5Var instanceof ev5) {
            try {
                ((ev5) ep5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new rq2("Exception in completion handler " + ep5Var + " for " + this, th2));
                return;
            }
        }
        ul7 b2 = ep5Var.b();
        if (b2 != null) {
            b2.c(new c76(1), 1);
            Object f = b2.f();
            f.getClass();
            for (pd6 pd6Var = (pd6) f; !pd6Var.equals(b2); pd6Var = pd6Var.g()) {
                if (pd6Var instanceof ev5) {
                    try {
                        ((ev5) pd6Var).l(th);
                    } catch (Throwable th3) {
                        if (rq2Var != null) {
                            uhe.a(rq2Var, th3);
                        } else {
                            rq2Var = new rq2("Exception in completion handler " + pd6Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (rq2Var != null) {
                x(rq2Var);
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
        ov5 ov5Var = (ov5) obj;
        Object v = ov5Var.v();
        if (v instanceof hv5) {
            cancellationException = ((hv5) v).c();
        } else if (v instanceof qq2) {
            cancellationException = ((qq2) v).a;
        } else {
            if (v instanceof ep5) {
                zo4.p(v, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new bv5("Parent job is ".concat(L(v)), cancellationException, ov5Var) : cancellationException2;
    }

    public final Object p(hv5 hv5Var, Object obj) {
        hv5 hv5Var2;
        Throwable th;
        Throwable r;
        ov5 ov5Var;
        hv5 hv5Var3;
        qq2 qq2Var = obj instanceof qq2 ? (qq2) obj : null;
        Throwable th2 = qq2Var != null ? qq2Var.a : null;
        synchronized (hv5Var) {
            try {
                hv5Var.d();
                ArrayList f = hv5Var.f(th2);
                r = r(hv5Var, f);
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
                                    uhe.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        hv5Var2 = hv5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                hv5Var2 = hv5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new qq2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            fy.a.compareAndSwapInt((qq2) obj, qq2.b, 0, 1);
        }
        G(obj);
        Object fp5Var = obj instanceof ep5 ? new fp5((ep5) obj) : obj;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            ov5Var = this;
            hv5Var3 = hv5Var;
            if (unsafe.compareAndSwapObject(ov5Var, j, hv5Var3, fp5Var) || unsafe.getObjectVolatile(ov5Var, j) != hv5Var3) {
                break;
            }
            this = ov5Var;
            hv5Var = hv5Var3;
        }
        ov5Var.n(hv5Var3, obj);
        return obj;
    }

    @Override // cy2
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }

    public final Object q() {
        Object v = v();
        if (v instanceof ep5) {
            dq9.m("This job has not completed yet");
            return null;
        }
        if (v instanceof qq2) {
            throw ((qq2) v).a;
        }
        return hcd.a(v);
    }

    public final Throwable r(hv5 hv5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (hv5Var.d()) {
                return new bv5(l(), null, this);
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
        if (th2 instanceof nqb) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof nqb)) {
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

    @Override // av5
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
        return this instanceof nq2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + ea3.a(this);
    }

    public final ul7 u(ep5 ep5Var) {
        ul7 b2 = ep5Var.b();
        if (b2 != null) {
            return b2;
        }
        if (ep5Var instanceof g34) {
            return new ul7();
        }
        if (ep5Var instanceof ev5) {
            J((ev5) ep5Var);
            return null;
        }
        zo4.p(ep5Var, "State should have list: ");
        return null;
    }

    public final Object v() {
        return fy.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(av5 av5Var) {
        long j = a;
        vl7 vl7Var = vl7.a;
        if (av5Var == null) {
            fy.a.putObjectVolatile(this, j, vl7Var);
            return;
        }
        av5Var.start();
        th2 attachChild = av5Var.attachChild(this);
        Unsafe unsafe = fy.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (v() instanceof ep5) {
            return;
        }
        attachChild.dispose();
        unsafe.putObjectVolatile(this, j, vl7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xp3 z(boolean z, ev5 ev5Var) {
        ov5 ov5Var;
        ev5 ev5Var2;
        vl7 vl7Var;
        boolean c2;
        ev5Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof g34) {
                g34 g34Var = (g34) v;
                if (g34Var.a) {
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long j = b;
                        ov5Var = this;
                        ev5Var2 = ev5Var;
                        if (unsafe.compareAndSwapObject(ov5Var, j, v, ev5Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(ov5Var, j) == v) {
                            this = ov5Var;
                            ev5Var = ev5Var2;
                        }
                    }
                } else {
                    ov5Var = this;
                    ev5Var2 = ev5Var;
                    ov5Var.I(g34Var);
                }
                this = ov5Var;
                ev5Var = ev5Var2;
            } else {
                ov5Var = this;
                ev5Var2 = ev5Var;
                boolean z2 = v instanceof ep5;
                vl7Var = vl7.a;
                if (z2) {
                    ep5 ep5Var = (ep5) v;
                    ul7 b2 = ep5Var.b();
                    if (b2 == null) {
                        ov5Var.J((ev5) v);
                    } else {
                        if (ev5Var2.k()) {
                            hv5 hv5Var = ep5Var instanceof hv5 ? (hv5) ep5Var : null;
                            Throwable c3 = hv5Var != null ? hv5Var.c() : null;
                            if (c3 == null) {
                                c2 = b2.c(ev5Var2, 5);
                            } else if (z) {
                                ev5Var2.l(c3);
                                return vl7Var;
                            }
                        } else {
                            c2 = b2.c(ev5Var2, 1);
                        }
                        if (c2) {
                            break;
                        }
                    }
                    this = ov5Var;
                    ev5Var = ev5Var2;
                } else if (z) {
                    Object v2 = ov5Var.v();
                    qq2 qq2Var = v2 instanceof qq2 ? (qq2) v2 : null;
                    ev5Var2.l(qq2Var != null ? qq2Var.a : null);
                }
            }
        }
        return vl7Var;
    }

    @Override // av5
    public final xp3 invokeOnCompletion(rr4 rr4Var) {
        return z(true, new lt5(rr4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(rq2 rq2Var) {
        throw rq2Var;
    }
}
