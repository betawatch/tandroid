// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class pt5 implements bt5, ig2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = ex.a;
        b = unsafe.objectFieldOffset(pt5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(pt5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pt5(boolean z) {
        this._state$volatile = z ? fad.g : fad.f;
    }

    public static gg2 E(qb6 qb6Var) {
        while (qb6Var.i()) {
            qb6Var = qb6Var.h();
        }
        while (true) {
            qb6Var = qb6Var.g();
            if (!qb6Var.i()) {
                if (qb6Var instanceof gg2) {
                    return (gg2) qb6Var;
                }
                if (qb6Var instanceof rj7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof it5)) {
            return obj instanceof en5 ? ((en5) obj).isActive() ? "Active" : "New" : obj instanceof fp2 ? "Cancelled" : "Completed";
        }
        it5 it5Var = (it5) obj;
        return it5Var.d() ? "Cancelling" : it5Var.e() ? "Completing" : "Active";
    }

    public static CancellationException M(pt5 pt5Var, Throwable th) {
        pt5Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new ct5(pt5Var.l(), th, pt5Var) : cancellationException;
    }

    public boolean A() {
        return this instanceof ok0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == fad.a) {
                return false;
            }
            if (N == fad.b) {
                return true;
            }
        } while (N == fad.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == fad.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                fp2 fp2Var = obj instanceof fp2 ? (fp2) obj : null;
                throw new IllegalStateException(str, fp2Var != null ? fp2Var.a : null);
            }
        } while (N == fad.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(rj7 rj7Var, Throwable th) {
        rj7Var.c(new c56(4), 4);
        Object f = rj7Var.f();
        f.getClass();
        gp2 gp2Var = null;
        for (qb6 qb6Var = (qb6) f; !qb6Var.equals(rj7Var); qb6Var = qb6Var.g()) {
            if ((qb6Var instanceof ft5) && ((ft5) qb6Var).k()) {
                try {
                    ((ft5) qb6Var).l(th);
                } catch (Throwable th2) {
                    if (gp2Var != null) {
                        tfe.a(gp2Var, th2);
                    } else {
                        gp2Var = new gp2("Exception in completion handler " + qb6Var + " for " + this, th2);
                    }
                }
            }
        }
        if (gp2Var != null) {
            x(gp2Var);
        }
        k(th);
    }

    public final void I(v14 v14Var) {
        rj7 rj7Var = new rj7();
        Object dn5Var = v14Var.a ? rj7Var : new dn5(rj7Var);
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            pt5 pt5Var = this;
            v14 v14Var2 = v14Var;
            if (unsafe.compareAndSwapObject(pt5Var, j, v14Var2, dn5Var) || unsafe.getObjectVolatile(pt5Var, j) != v14Var2) {
                return;
            }
            this = pt5Var;
            v14Var = v14Var2;
        }
    }

    public final void J(ft5 ft5Var) {
        ft5 ft5Var2;
        pt5 pt5Var;
        rj7 rj7Var = new rj7();
        Unsafe unsafe = ex.a;
        unsafe.putObjectVolatile(rj7Var, qb6.b, ft5Var);
        long j = qb6.a;
        unsafe.putObjectVolatile(rj7Var, j, ft5Var);
        loop0: while (true) {
            if (ft5Var.f() != ft5Var) {
                ft5Var2 = ft5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                ft5Var2 = ft5Var;
                if (unsafe2.compareAndSwapObject(ft5Var2, qb6.a, ft5Var, rj7Var)) {
                    rj7Var.e(ft5Var2);
                    break loop0;
                }
                pt5Var = this;
                ft5Var = ft5Var2;
                if (unsafe2.getObjectVolatile(ft5Var2, j) != ft5Var2) {
                    break;
                } else {
                    this = pt5Var;
                }
            }
            this = pt5Var;
        }
        qb6 g = ft5Var2.g();
        while (true) {
            Unsafe unsafe3 = ex.a;
            long j2 = b;
            pt5 pt5Var2 = this;
            if (unsafe3.compareAndSwapObject(pt5Var2, j2, ft5Var2, g) || unsafe3.getObjectVolatile(pt5Var2, j2) != ft5Var2) {
                return;
            } else {
                this = pt5Var2;
            }
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof v14;
        long j = b;
        if (!z) {
            pt5 pt5Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof dn5)) {
                return 0;
            }
            rj7 rj7Var = ((dn5) obj2).a;
            do {
                pt5 pt5Var2 = pt5Var;
                unsafe = ex.a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe.compareAndSwapObject(pt5Var2, b, obj3, rj7Var);
                pt5Var = pt5Var2;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    return 1;
                }
            } while (unsafe.getObjectVolatile(pt5Var, j) == obj2);
            return -1;
        }
        if (((v14) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = ex.a;
            pt5 pt5Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(pt5Var3, b, obj4, fad.g)) {
                return 1;
            }
            if (unsafe2.getObjectVolatile(pt5Var3, j) != obj4) {
                return -1;
            }
            this = pt5Var3;
            obj = obj4;
        }
    }

    public final Object N(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof en5)) {
            return fad.a;
        }
        if ((!(obj instanceof v14) && !(obj instanceof ft5)) || (obj instanceof gg2) || (obj2 instanceof fp2)) {
            pt5 pt5Var = this;
            en5 en5Var = (en5) obj;
            rj7 u = pt5Var.u(en5Var);
            if (u == null) {
                return fad.c;
            }
            it5 it5Var = en5Var instanceof it5 ? (it5) en5Var : null;
            if (it5Var == null) {
                it5Var = new it5(u, null);
            }
            it5 it5Var2 = it5Var;
            synchronized (it5Var2) {
                if (it5Var2.e()) {
                    return fad.a;
                }
                ex.a.putIntVolatile(it5Var2, it5.c, 1);
                if (it5Var2 != en5Var) {
                    do {
                        unsafe = ex.a;
                        j = b;
                        pt5 pt5Var2 = pt5Var;
                        pt5Var = pt5Var2;
                        if (!unsafe.compareAndSwapObject(pt5Var2, j, en5Var, it5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(pt5Var, j) == en5Var);
                    return fad.c;
                }
                boolean d = it5Var2.d();
                fp2 fp2Var = obj2 instanceof fp2 ? (fp2) obj2 : null;
                if (fp2Var != null) {
                    it5Var2.a(fp2Var.a);
                }
                Throwable c2 = d ? null : it5Var2.c();
                if (c2 != null) {
                    pt5Var.F(u, c2);
                }
                gg2 E = E(u);
                if (E != null && pt5Var.O(it5Var2, E, obj2)) {
                    return fad.b;
                }
                u.c(new c56(2), 2);
                gg2 E2 = E(u);
                return (E2 == null || !pt5Var.O(it5Var2, E2, obj2)) ? pt5Var.p(it5Var2, obj2) : fad.b;
            }
        }
        en5 en5Var2 = (en5) obj;
        Object fn5Var = obj2 instanceof en5 ? new fn5((en5) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = ex.a;
            long j2 = b;
            pt5 pt5Var3 = this;
            if (unsafe2.compareAndSwapObject(pt5Var3, j2, en5Var2, fn5Var)) {
                pt5Var3.G(obj2);
                pt5Var3.n(en5Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(pt5Var3, j2) != en5Var2) {
                return fad.c;
            }
            this = pt5Var3;
        }
    }

    public final boolean O(it5 it5Var, gg2 gg2Var, Object obj) {
        while (nle.c(gg2Var.e, false, new ht5(this, it5Var, gg2Var, obj)) == sj7.a) {
            gg2Var = E(gg2Var);
            if (gg2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // bt5
    public final fg2 attachChild(ig2 ig2Var) {
        pt5 pt5Var;
        gg2 gg2Var = new gg2(ig2Var);
        gg2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof v14) {
                v14 v14Var = (v14) v;
                if (v14Var.a) {
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long j = b;
                        pt5Var = this;
                        if (unsafe.compareAndSwapObject(pt5Var, j, v, gg2Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(pt5Var, j) == v) {
                            this = pt5Var;
                        }
                    }
                } else {
                    pt5Var = this;
                    pt5Var.I(v14Var);
                }
                this = pt5Var;
            } else {
                pt5Var = this;
                boolean z = v instanceof en5;
                sj7 sj7Var = sj7.a;
                if (!z) {
                    Object v2 = pt5Var.v();
                    fp2 fp2Var = v2 instanceof fp2 ? (fp2) v2 : null;
                    gg2Var.l(fp2Var != null ? fp2Var.a : null);
                    return sj7Var;
                }
                rj7 b2 = ((en5) v).b();
                if (b2 == null) {
                    pt5Var.J((ft5) v);
                    this = pt5Var;
                } else if (!b2.c(gg2Var, 7)) {
                    boolean c2 = b2.c(gg2Var, 3);
                    Object v3 = pt5Var.v();
                    if (v3 instanceof it5) {
                        r0 = ((it5) v3).c();
                    } else {
                        fp2 fp2Var2 = v3 instanceof fp2 ? (fp2) v3 : null;
                        if (fp2Var2 != null) {
                            r0 = fp2Var2.a;
                        }
                    }
                    gg2Var.l(r0);
                    if (c2) {
                        break loop0;
                    }
                    return sj7Var;
                }
            }
        }
        return gg2Var;
    }

    public final Object await(fw2 fw2Var) {
        return h(fw2Var);
    }

    @Override // bt5
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ct5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // sw2
    public final qw2 get(rw2 rw2Var) {
        return kud.a(this, rw2Var);
    }

    @Override // bt5
    public final CancellationException getCancellationException() {
        Object v = v();
        if (!(v instanceof it5)) {
            if (!(v instanceof en5)) {
                return v instanceof fp2 ? M(this, ((fp2) v).a) : new ct5(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            wn4.n(this, "Job is still new or active: ");
            return null;
        }
        Throwable c2 = ((it5) v).c();
        if (c2 == null) {
            wn4.n(this, "Job is still new or active: ");
            return null;
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        return cancellationException == null ? new ct5(concat, c2, this) : cancellationException;
    }

    @Override // bt5
    public final n4a getChildren() {
        return new t4a(new lt5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object v = v();
        if (v instanceof en5) {
            sc8.j("This job has not completed yet");
            return null;
        }
        fp2 fp2Var = v instanceof fp2 ? (fp2) v : null;
        if (fp2Var != null) {
            return fp2Var.a;
        }
        return null;
    }

    @Override // qw2
    public final rw2 getKey() {
        return pd5.c;
    }

    public final Object h(fw2 fw2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof en5)) {
                if (v instanceof fp2) {
                    throw ((fp2) v).a;
                }
                return fad.a(v);
            }
        } while (K(v) < 0);
        gt5 gt5Var = new gt5(dle.a(fw2Var), this);
        gt5Var.s();
        gt5Var.v(new ia1(nle.c(this, true, new za9(gt5Var)), (byte) 2));
        return gt5Var.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0 != fad.b) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        pt5 pt5Var;
        lo5 lo5Var;
        Object obj2;
        Object obj3 = fad.a;
        if (t()) {
            do {
                Object v = v();
                if (!(v instanceof en5) || ((v instanceof it5) && ((it5) v).e())) {
                    obj3 = fad.a;
                    break;
                }
                obj3 = N(v, new fp2(o(obj), false));
            } while (obj3 == fad.c);
        }
        if (obj3 == fad.a) {
            Throwable th = null;
            loop1: while (true) {
                Object v2 = this.v();
                if (!(v2 instanceof it5)) {
                    if (!(v2 instanceof en5)) {
                        pt5Var = this;
                        obj2 = fad.d;
                        break;
                    }
                    if (th == null) {
                        th = this.o(obj);
                    }
                    en5 en5Var = (en5) v2;
                    if (en5Var.isActive()) {
                        rj7 u = this.u(en5Var);
                        if (u == null) {
                            pt5Var = this;
                        } else {
                            it5 it5Var = new it5(u, th);
                            while (true) {
                                Unsafe unsafe = ex.a;
                                long j = b;
                                pt5Var = this;
                                if (unsafe.compareAndSwapObject(pt5Var, j, en5Var, it5Var)) {
                                    pt5Var.F(u, th);
                                    obj2 = fad.a;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(pt5Var, j) == en5Var) {
                                    this = pt5Var;
                                }
                            }
                        }
                        this = pt5Var;
                    } else {
                        pt5Var = this;
                        obj2 = pt5Var.N(v2, new fp2(th, false));
                        if (obj2 == fad.a) {
                            wn4.n(v2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != fad.c) {
                            break;
                        }
                        this = pt5Var;
                    }
                } else {
                    synchronized (v2) {
                        if (ex.a.getObjectVolatile((it5) v2, it5.b) == fad.e) {
                            lo5Var = fad.d;
                        } else {
                            boolean d = ((it5) v2).d();
                            if (th == null) {
                                th = this.o(obj);
                            }
                            ((it5) v2).a(th);
                            Throwable c2 = d ? null : ((it5) v2).c();
                            if (c2 != null) {
                                this.F(((it5) v2).a, c2);
                            }
                            lo5Var = fad.a;
                        }
                    }
                    pt5Var = this;
                    obj3 = lo5Var;
                }
            }
            obj3 = obj2;
        } else {
            pt5Var = this;
        }
        if (obj3 != fad.a && obj3 != fad.b) {
            if (obj3 == fad.d) {
                return false;
            }
            pt5Var.f(obj3);
            return true;
        }
        return true;
    }

    @Override // bt5
    public final no3 invokeOnCompletion(boolean z, boolean z2, qp4 qp4Var) {
        return z(z2, z ? new lr5(qp4Var) : new mr5(qp4Var));
    }

    @Override // bt5
    public final boolean isActive() {
        Object v = v();
        return (v instanceof en5) && ((en5) v).isActive();
    }

    @Override // bt5
    public final boolean isCancelled() {
        Object v = v();
        if (v instanceof fp2) {
            return true;
        }
        return (v instanceof it5) && ((it5) v).d();
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    @Override // bt5
    public final Object join(fw2 fw2Var) {
        Object v;
        g5c g5cVar;
        do {
            v = v();
            boolean z = v instanceof en5;
            g5cVar = g5c.a;
            if (!z) {
                nle.a(fw2Var.getContext());
                return g5cVar;
            }
        } while (K(v) < 0);
        na1 na1Var = new na1(1, dle.a(fw2Var));
        na1Var.s();
        na1Var.v(new ia1(nle.c(this, true, new ab9(na1Var)), (byte) 2));
        Object q = na1Var.q();
        bx2 bx2Var = bx2.a;
        if (q != bx2Var) {
            q = g5cVar;
        }
        return q == bx2Var ? q : g5cVar;
    }

    public final boolean k(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        fg2 fg2Var = (fg2) ex.a.getObjectVolatile(this, a);
        return (fg2Var == null || fg2Var == sj7.a) ? z : fg2Var.a(th) || z;
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

    @Override // sw2
    public final sw2 minusKey(rw2 rw2Var) {
        return kud.b(this, rw2Var);
    }

    public final void n(en5 en5Var, Object obj) {
        Unsafe unsafe = ex.a;
        long j = a;
        fg2 fg2Var = (fg2) unsafe.getObjectVolatile(this, j);
        if (fg2Var != null) {
            fg2Var.dispose();
            unsafe.putObjectVolatile(this, j, sj7.a);
        }
        gp2 gp2Var = null;
        fp2 fp2Var = obj instanceof fp2 ? (fp2) obj : null;
        Throwable th = fp2Var != null ? fp2Var.a : null;
        if (en5Var instanceof ft5) {
            try {
                ((ft5) en5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new gp2("Exception in completion handler " + en5Var + " for " + this, th2));
                return;
            }
        }
        rj7 b2 = en5Var.b();
        if (b2 != null) {
            b2.c(new c56(1), 1);
            Object f = b2.f();
            f.getClass();
            for (qb6 qb6Var = (qb6) f; !qb6Var.equals(b2); qb6Var = qb6Var.g()) {
                if (qb6Var instanceof ft5) {
                    try {
                        ((ft5) qb6Var).l(th);
                    } catch (Throwable th3) {
                        if (gp2Var != null) {
                            tfe.a(gp2Var, th3);
                        } else {
                            gp2Var = new gp2("Exception in completion handler " + qb6Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (gp2Var != null) {
                x(gp2Var);
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
        pt5 pt5Var = (pt5) obj;
        Object v = pt5Var.v();
        if (v instanceof it5) {
            cancellationException = ((it5) v).c();
        } else if (v instanceof fp2) {
            cancellationException = ((fp2) v).a;
        } else {
            if (v instanceof en5) {
                wn4.n(v, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new ct5("Parent job is ".concat(L(v)), cancellationException, pt5Var) : cancellationException2;
    }

    public final Object p(it5 it5Var, Object obj) {
        it5 it5Var2;
        Throwable th;
        Throwable r;
        pt5 pt5Var;
        it5 it5Var3;
        fp2 fp2Var = obj instanceof fp2 ? (fp2) obj : null;
        Throwable th2 = fp2Var != null ? fp2Var.a : null;
        synchronized (it5Var) {
            try {
                it5Var.d();
                ArrayList f = it5Var.f(th2);
                r = r(it5Var, f);
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
                                    tfe.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        it5Var2 = it5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                it5Var2 = it5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new fp2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            ex.a.compareAndSwapInt((fp2) obj, fp2.b, 0, 1);
        }
        G(obj);
        Object fn5Var = obj instanceof en5 ? new fn5((en5) obj) : obj;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            pt5Var = this;
            it5Var3 = it5Var;
            if (unsafe.compareAndSwapObject(pt5Var, j, it5Var3, fn5Var) || unsafe.getObjectVolatile(pt5Var, j) != it5Var3) {
                break;
            }
            this = pt5Var;
            it5Var = it5Var3;
        }
        pt5Var.n(it5Var3, obj);
        return obj;
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        return kud.c(this, sw2Var);
    }

    public final Object q() {
        Object v = v();
        if (v instanceof en5) {
            sc8.j("This job has not completed yet");
            return null;
        }
        if (v instanceof fp2) {
            throw ((fp2) v).a;
        }
        return fad.a(v);
    }

    public final Throwable r(it5 it5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (it5Var.d()) {
                return new ct5(l(), null, this);
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
        if (th2 instanceof mob) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof mob)) {
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

    @Override // bt5
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
        return this instanceof cp2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + s83.a(this);
    }

    public final rj7 u(en5 en5Var) {
        rj7 b2 = en5Var.b();
        if (b2 != null) {
            return b2;
        }
        if (en5Var instanceof v14) {
            return new rj7();
        }
        if (en5Var instanceof ft5) {
            J((ft5) en5Var);
            return null;
        }
        wn4.n(en5Var, "State should have list: ");
        return null;
    }

    public final Object v() {
        return ex.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(bt5 bt5Var) {
        long j = a;
        sj7 sj7Var = sj7.a;
        if (bt5Var == null) {
            ex.a.putObjectVolatile(this, j, sj7Var);
            return;
        }
        bt5Var.start();
        fg2 attachChild = bt5Var.attachChild(this);
        Unsafe unsafe = ex.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (v() instanceof en5) {
            return;
        }
        attachChild.dispose();
        unsafe.putObjectVolatile(this, j, sj7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final no3 z(boolean z, ft5 ft5Var) {
        pt5 pt5Var;
        ft5 ft5Var2;
        sj7 sj7Var;
        boolean c2;
        ft5Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof v14) {
                v14 v14Var = (v14) v;
                if (v14Var.a) {
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long j = b;
                        pt5Var = this;
                        ft5Var2 = ft5Var;
                        if (unsafe.compareAndSwapObject(pt5Var, j, v, ft5Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(pt5Var, j) == v) {
                            this = pt5Var;
                            ft5Var = ft5Var2;
                        }
                    }
                } else {
                    pt5Var = this;
                    ft5Var2 = ft5Var;
                    pt5Var.I(v14Var);
                }
                this = pt5Var;
                ft5Var = ft5Var2;
            } else {
                pt5Var = this;
                ft5Var2 = ft5Var;
                boolean z2 = v instanceof en5;
                sj7Var = sj7.a;
                if (z2) {
                    en5 en5Var = (en5) v;
                    rj7 b2 = en5Var.b();
                    if (b2 == null) {
                        pt5Var.J((ft5) v);
                    } else {
                        if (ft5Var2.k()) {
                            it5 it5Var = en5Var instanceof it5 ? (it5) en5Var : null;
                            Throwable c3 = it5Var != null ? it5Var.c() : null;
                            if (c3 == null) {
                                c2 = b2.c(ft5Var2, 5);
                            } else if (z) {
                                ft5Var2.l(c3);
                                return sj7Var;
                            }
                        } else {
                            c2 = b2.c(ft5Var2, 1);
                        }
                        if (c2) {
                            break;
                        }
                    }
                    this = pt5Var;
                    ft5Var = ft5Var2;
                } else if (z) {
                    Object v2 = pt5Var.v();
                    fp2 fp2Var = v2 instanceof fp2 ? (fp2) v2 : null;
                    ft5Var2.l(fp2Var != null ? fp2Var.a : null);
                }
            }
        }
        return sj7Var;
    }

    @Override // bt5
    public final no3 invokeOnCompletion(qp4 qp4Var) {
        return z(true, new mr5(qp4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(gp2 gp2Var) {
        throw gp2Var;
    }
}
