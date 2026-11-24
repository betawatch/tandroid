// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vr6 {
    public final l93 c;
    public final cdb d;
    public final kx3 e;
    public long f;
    public int g;
    public boolean h;
    public tr6 i;
    public final tr6[] j;
    public final tr6[] k;
    public tr6 l;
    public tr6 m;
    public int n;
    public Object o;
    public long p;
    public final xnb a = new xnb();
    public final znb b = new znb();
    public ArrayList q = new ArrayList();

    public vr6(l93 l93Var, cdb cdbVar, kx3 kx3Var, int i) {
        this.c = l93Var;
        this.d = cdbVar;
        this.e = kx3Var;
        this.j = new tr6[i];
        this.k = new tr6[i];
    }

    public static boolean m(tr6[] tr6VarArr, long[] jArr, tr6 tr6Var, long j) {
        for (int i = 0; i < tr6VarArr.length; i++) {
            tr6 tr6Var2 = tr6VarArr[i];
            if (tr6Var2 != null) {
                tr6 tr6Var3 = tr6Var;
                do {
                    tr6Var3 = tr6Var3.m;
                    if (tr6Var3 == null) {
                        if (tr6Var2 == tr6Var) {
                            long j2 = jArr[i];
                            if (j2 == Long.MIN_VALUE || j2 >= j) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                } while (tr6Var3 != tr6Var2);
                return true;
            }
        }
        return false;
    }

    public static rx6 t(aob aobVar, Object obj, long j, long j2, znb znbVar, xnb xnbVar) {
        aobVar.g(obj, xnbVar);
        aobVar.n(xnbVar.c, znbVar);
        aobVar.b(obj);
        int i = da.c.a;
        if (i != 0) {
            if (i == 1) {
                xnbVar.f(0);
            }
            xnbVar.g(0);
        }
        aobVar.g(obj, xnbVar);
        int c = xnbVar.c(j);
        return c == -1 ? new rx6(obj, j2, xnbVar.b(j)) : new rx6(obj, c, xnbVar.e(c), j2, -1);
    }

    public final tr6 a() {
        tr6 tr6Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            tr6[] tr6VarArr = this.j;
            if (i2 >= tr6VarArr.length) {
                break;
            }
            if (this.i.equals(tr6VarArr[i2])) {
                tr6VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            tr6[] tr6VarArr2 = this.k;
            int length = tr6VarArr2.length;
            tr6Var = this.i;
            if (i >= length) {
                break;
            }
            if (tr6Var.equals(tr6VarArr2[i])) {
                tr6VarArr2[i] = this.i.m;
            }
            i++;
        }
        tr6Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            tr6 tr6Var2 = this.i;
            this.o = tr6Var2.b;
            this.p = tr6Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        tr6 tr6Var = this.i;
        tr6Var.getClass();
        this.o = tr6Var.b;
        this.p = tr6Var.g.a.d;
        while (tr6Var != null) {
            tr6Var.i();
            tr6Var = tr6Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final tr6 c() {
        tr6 tr6Var = this.i;
        while (tr6Var != null) {
            for (tr6 tr6Var2 : this.k) {
                if (tr6Var == tr6Var2) {
                    return tr6Var;
                }
            }
            tr6Var = tr6Var.m;
        }
        return tr6Var;
    }

    public final tr6 d() {
        tr6 tr6Var = this.i;
        while (tr6Var != null) {
            for (tr6 tr6Var2 : this.j) {
                if (tr6Var == tr6Var2) {
                    return tr6Var;
                }
            }
            tr6Var = tr6Var.m;
        }
        return tr6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ur6 e(aob aobVar, tr6 tr6Var, long j) {
        aob aobVar2;
        da daVar;
        ur6 ur6Var;
        rx6 rx6Var;
        aob aobVar3;
        Object obj;
        xnb xnbVar;
        long j2;
        long j3;
        znb znbVar;
        long j4;
        long j5;
        Pair j6;
        long v;
        ur6 ur6Var2 = tr6Var.g;
        long j7 = (tr6Var.p + ur6Var2.e) - j;
        long j8 = 0;
        long j9 = -9223372036854775807L;
        if (!ur6Var2.g) {
            rx6 rx6Var2 = ur6Var2.a;
            Object obj2 = rx6Var2.a;
            int i = rx6Var2.e;
            xnb xnbVar2 = this.a;
            aobVar.g(obj2, xnbVar2);
            if (!rx6Var2.c()) {
                if (i != -1) {
                    xnbVar2.f(i);
                }
                int e = xnbVar2.e(i);
                xnbVar2.g(i);
                da daVar2 = da.c;
                if (e != daVar2.a(i).a) {
                    return i(aobVar, rx6Var2.a, rx6Var2.e, e, ur6Var2.e, rx6Var2.d);
                }
                aobVar.g(obj2, xnbVar2);
                xnbVar2.d(i);
                daVar2.a(i).getClass();
                return j(aobVar, rx6Var2.a, 0L, -9223372036854775807L, ur6Var2.e, rx6Var2.d);
            }
            int i2 = rx6Var2.b;
            da daVar3 = da.c;
            int i3 = daVar3.a(i2).a;
            if (i3 != -1) {
                int a = daVar3.a(i2).a(rx6Var2.c);
                if (a < i3) {
                    return i(aobVar, rx6Var2.a, i2, a, ur6Var2.d, rx6Var2.d);
                }
                long j10 = ur6Var2.d;
                if (j10 == -9223372036854775807L) {
                    int i4 = xnbVar2.c;
                    long j11 = xnbVar2.d;
                    znb znbVar2 = this.b;
                    if (j11 == -9223372036854775807L) {
                        aobVar.n(i4, znbVar2);
                        if (znbVar2.h && !znbVar2.j) {
                            j9 = Math.max(0L, j7);
                        }
                    }
                    aobVar2 = aobVar;
                    daVar = daVar3;
                    long j12 = j9;
                    Pair j13 = aobVar2.j(znbVar2, xnbVar2, xnbVar2.c, -9223372036854775807L, j12);
                    if (j13 != null) {
                        j9 = j12;
                        j10 = ((Long) j13.second).longValue();
                    }
                } else {
                    aobVar2 = aobVar;
                    daVar = daVar3;
                }
                int i5 = rx6Var2.b;
                aobVar2.g(obj2, xnbVar2);
                xnbVar2.d(i5);
                daVar.a(i5).getClass();
                return j(aobVar2, rx6Var2.a, Math.max(0L, j10), j9, ur6Var2.d, rx6Var2.d);
            }
            return null;
        }
        ur6 ur6Var3 = tr6Var.g;
        rx6 rx6Var3 = ur6Var3.a;
        long j14 = ur6Var3.d;
        int b = aobVar.b(rx6Var3.a);
        int i6 = this.g;
        boolean z = this.h;
        xnb xnbVar3 = this.a;
        znb znbVar3 = this.b;
        int d = aobVar.d(b, xnbVar3, znbVar3, i6, z);
        if (d != -1) {
            int i7 = aobVar.f(d, xnbVar3, true).c;
            Object obj3 = xnbVar3.b;
            obj3.getClass();
            long j15 = rx6Var3.d;
            ur6Var = null;
            if (aobVar.m(i7, znbVar3, 0L).m == d) {
                int i8 = xnbVar3.c;
                if (xnbVar3.d == -9223372036854775807L) {
                    aobVar.n(i8, znbVar3);
                    if (znbVar3.h && !znbVar3.j) {
                        j5 = Math.max(0L, j7);
                        rx6Var = rx6Var3;
                        long j16 = j5;
                        j6 = aobVar.j(znbVar3, xnbVar3, i7, -9223372036854775807L, j16);
                        if (j6 != null) {
                            Object obj4 = j6.first;
                            long longValue = ((Long) j6.second).longValue();
                            tr6 tr6Var2 = tr6Var.m;
                            if (tr6Var2 == null || !tr6Var2.b.equals(obj4)) {
                                v = v(obj4);
                                if (v == -1) {
                                    v = this.f;
                                    this.f = 1 + v;
                                }
                            } else {
                                v = tr6Var2.g.a.d;
                            }
                            aobVar3 = aobVar;
                            j3 = j16;
                            znbVar = znbVar3;
                            xnbVar = xnbVar3;
                            obj = obj4;
                            j2 = v;
                            j4 = longValue;
                            j8 = -9223372036854775807L;
                        }
                    }
                }
                j5 = -9223372036854775807L;
                rx6Var = rx6Var3;
                long j162 = j5;
                j6 = aobVar.j(znbVar3, xnbVar3, i7, -9223372036854775807L, j162);
                if (j6 != null) {
                }
            } else {
                rx6Var = rx6Var3;
                aobVar3 = aobVar;
                obj = obj3;
                xnbVar = xnbVar3;
                j2 = j15;
                j3 = -9223372036854775807L;
                znbVar = znbVar3;
                j4 = 0;
            }
            rx6 t = t(aobVar3, obj, j4, j2, znbVar, xnbVar);
            long j17 = j4;
            xnb xnbVar4 = xnbVar;
            if (j8 != -9223372036854775807L && j14 != -9223372036854775807L) {
                aobVar3.g(rx6Var.a, xnbVar4).getClass();
                if (da.c.a > 0) {
                    xnbVar4.g(0);
                }
            }
            return h(aobVar3, t, j8, j17, j3);
        }
        ur6Var = null;
        return ur6Var;
    }

    public final tr6 f() {
        tr6[] tr6VarArr = this.j;
        if (tr6VarArr.length == 0) {
            return null;
        }
        tr6 tr6Var = tr6VarArr[0];
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            int length = tr6VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (tr6Var2 == tr6VarArr[i]) {
                    tr6Var = tr6Var2;
                    break;
                }
                i++;
            }
        }
        return tr6Var;
    }

    public final long g(aob aobVar, rx6 rx6Var) {
        Object obj = rx6Var.a;
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        if (rx6Var.c()) {
            return xnbVar.a(rx6Var.b, rx6Var.c);
        }
        int i = rx6Var.e;
        if (i == -1) {
            return xnbVar.d;
        }
        xnbVar.d(i);
        return 0L;
    }

    public final ur6 h(aob aobVar, rx6 rx6Var, long j, long j2, long j3) {
        aobVar.g(rx6Var.a, this.a);
        boolean c = rx6Var.c();
        Object obj = rx6Var.a;
        return c ? i(aobVar, obj, rx6Var.b, rx6Var.c, j, rx6Var.d) : j(aobVar, obj, j2, j3, j, rx6Var.d);
    }

    public final ur6 i(aob aobVar, Object obj, int i, int i2, long j, long j2) {
        rx6 rx6Var = new rx6(obj, i, i2, j2, -1);
        xnb xnbVar = this.a;
        long a = aobVar.g(obj, xnbVar).a(i, i2);
        if (i2 == xnbVar.e(i)) {
            da daVar = da.c;
        }
        xnbVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new ur6(rx6Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final ur6 j(aob aobVar, Object obj, long j, long j2, long j3, long j4) {
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        int b = xnbVar.b(j);
        if (b != -1) {
            xnbVar.g(b);
            xnbVar.g(b);
        }
        rx6 rx6Var = new rx6(obj, j4, b);
        boolean z = !rx6Var.c() && b == -1;
        boolean o = o(aobVar, rx6Var);
        boolean n = n(aobVar, rx6Var, z);
        long g = g(aobVar, rx6Var);
        return new ur6(rx6Var, (g == -9223372036854775807L || j < g) ? j : Math.max(0L, g - 1), j2, j3, g, false, z, o, n);
    }

    public final tr6 k(int i) {
        return this.k[i];
    }

    public final ur6 l(aob aobVar, ur6 ur6Var) {
        rx6 rx6Var = ur6Var.a;
        int i = rx6Var.e;
        boolean z = !rx6Var.c() && i == -1;
        boolean o = o(aobVar, rx6Var);
        boolean n = n(aobVar, rx6Var, z);
        long g = g(aobVar, rx6Var);
        Object obj = rx6Var.a;
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        if (rx6Var.c()) {
            xnbVar.g(rx6Var.b);
        } else if (i != -1) {
            xnbVar.g(i);
        }
        return new ur6(rx6Var, ur6Var.b, ur6Var.c, ur6Var.d, g, false, z, o, n);
    }

    public final boolean n(aob aobVar, rx6 rx6Var, boolean z) {
        int b = aobVar.b(rx6Var.a);
        xnb xnbVar = this.a;
        int i = aobVar.f(b, xnbVar, false).c;
        znb znbVar = this.b;
        return !aobVar.m(i, znbVar, 0L).h && aobVar.d(b, xnbVar, znbVar, this.g, this.h) == -1 && z;
    }

    public final boolean o(aob aobVar, rx6 rx6Var) {
        boolean z = !rx6Var.c() && rx6Var.e == -1;
        Object obj = rx6Var.a;
        if (z) {
            if (aobVar.m(aobVar.g(obj, this.a).c, this.b, 0L).n == aobVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        tr6 tr6Var = this.m;
        if (tr6Var == null || tr6Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                tr6 tr6Var2 = (tr6) this.q.get(i);
                if (!tr6Var2.h()) {
                    this.m = tr6Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        tr6 tr6Var;
        jm5 p = mm5.p();
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            p.c(tr6Var2.g.a);
        }
        tr6[] tr6VarArr = this.j;
        this.d.e(new lo6((Object) this, (Object) p, (Object) ((tr6VarArr.length == 0 || (tr6Var = tr6VarArr[0]) == null) ? null : tr6Var.g.a), (byte) 4));
    }

    public final void r(long j) {
        tr6 tr6Var = this.l;
        if (tr6Var != null) {
            gre.p(tr6Var.m == null);
            if (tr6Var.e) {
                tr6Var.a.t(j - tr6Var.p);
            }
        }
    }

    public final int s(tr6 tr6Var) {
        tr6[] tr6VarArr;
        tr6[] tr6VarArr2;
        tr6Var.getClass();
        if (tr6Var == this.l) {
            return 0;
        }
        this.l = tr6Var;
        int i = 0;
        while (true) {
            tr6Var = tr6Var.m;
            if (tr6Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                tr6VarArr = this.j;
                int length = tr6VarArr.length;
                tr6VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (tr6Var == tr6VarArr[i2]) {
                    tr6 tr6Var2 = this.i;
                    tr6VarArr[i2] = tr6Var2;
                    tr6VarArr2[i2] = tr6Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < tr6VarArr2.length; i3++) {
                if (tr6Var == tr6VarArr2[i3]) {
                    tr6VarArr2[i3] = tr6VarArr[i3];
                    i |= 2;
                }
            }
            tr6Var.i();
            this.n--;
        }
        tr6 tr6Var3 = this.l;
        tr6Var3.getClass();
        if (tr6Var3.m != null) {
            tr6Var3.b();
            tr6Var3.m = null;
            tr6Var3.c();
        }
        q();
        return i;
    }

    public final rx6 u(yb8 yb8Var, aob aobVar, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        xnb xnbVar = this.a;
        int i = aobVar.g(obj, xnbVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 == null || (b = aobVar.b(obj2)) == -1 || aobVar.f(b, xnbVar, false).c != i) {
            tr6 tr6Var = this.i;
            while (true) {
                if (tr6Var == null) {
                    tr6 tr6Var2 = this.i;
                    while (true) {
                        if (tr6Var2 != null) {
                            int b2 = aobVar.b(tr6Var2.b);
                            if (b2 != -1 && aobVar.f(b2, xnbVar, false).c == i) {
                                v = tr6Var2.g.a.d;
                                break;
                            }
                            tr6Var2 = tr6Var2.m;
                        } else {
                            v = v(obj);
                            if (v == -1) {
                                v = this.f;
                                this.f = 1 + v;
                                if (this.i == null) {
                                    this.o = obj;
                                    this.p = v;
                                }
                            }
                        }
                    }
                } else {
                    if (tr6Var.b.equals(obj)) {
                        v = tr6Var.g.a.d;
                        break;
                    }
                    tr6Var = tr6Var.m;
                }
            }
        } else {
            v = this.p;
        }
        znb znbVar = this.b;
        if (!z && !z2) {
            rx6 rx6Var = yb8Var.b;
            long j2 = v;
            rx6 t = t(aobVar, obj, j, j2, znbVar, xnbVar);
            if (rx6Var.c() && rx6Var.equals(t)) {
                return rx6Var;
            }
            aobVar.g(obj, xnbVar);
            return new rx6(obj, j2, xnbVar.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        aobVar.g(obj3, xnbVar);
        aobVar.n(xnbVar.c, znbVar);
        int b3 = aobVar.b(obj);
        boolean z4 = false;
        while (b3 >= znbVar.m) {
            aobVar.f(b3, xnbVar, true);
            boolean z5 = da.c.a <= 0 ? z3 : true;
            z4 |= z5;
            znb znbVar2 = znbVar;
            if (xnbVar.c(xnbVar.d) != -1) {
                obj3 = xnbVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || xnbVar.d != 0)) {
                znbVar = znbVar2;
                break;
            }
            b3--;
            z3 = false;
            znbVar = znbVar2;
        }
        rx6 t2 = t(aobVar, obj3, j, j3, znbVar, xnbVar);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            aobVar.g(obj4, xnbVar);
            da.c.a(i2).getClass();
            if (0 != j) {
                return new rx6(obj4, t2.d, xnbVar.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            tr6 tr6Var = (tr6) this.q.get(i);
            if (tr6Var.b.equals(obj)) {
                return tr6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(aob aobVar) {
        aob aobVar2;
        tr6 tr6Var;
        tr6 tr6Var2 = this.i;
        if (tr6Var2 == null) {
            return 0;
        }
        int b = aobVar.b(tr6Var2.b);
        while (true) {
            aobVar2 = aobVar;
            b = aobVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                tr6Var = tr6Var2.m;
                if (tr6Var == null || tr6Var2.g.g) {
                    break;
                }
                tr6Var2 = tr6Var;
            }
            if (b == -1 || tr6Var == null || aobVar2.b(tr6Var.b) != b) {
                break;
            }
            tr6Var2 = tr6Var;
            aobVar = aobVar2;
        }
        int s = s(tr6Var2);
        tr6Var2.g = l(aobVar2, tr6Var2.g);
        return s;
    }

    public final int x(aob aobVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        ur6 b;
        tr6 tr6Var = null;
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            ur6 ur6Var = tr6Var2.g;
            rx6 rx6Var = ur6Var.a;
            if (tr6Var != null) {
                ur6 e = e(aobVar, tr6Var, j);
                if (e != null) {
                    long j3 = e.b;
                    long j4 = ur6Var.c;
                    j2 = -9223372036854775807L;
                    long j5 = ur6Var.b;
                    i = 0;
                    if (rx6Var.equals(e.a)) {
                        if (j5 == j3) {
                            b = e;
                        } else if (j4 != -9223372036854775807L) {
                            long j6 = e.c;
                            if (j6 != -9223372036854775807L) {
                                if (Math.abs((j3 - j6) - (j5 - j4)) < 5000000) {
                                    b = e.b(j5, j4);
                                }
                            }
                        }
                    }
                }
                return s(tr6Var);
            }
            b = l(aobVar, ur6Var);
            j2 = -9223372036854775807L;
            i = 0;
            long j7 = ur6Var.d;
            long j8 = ur6Var.e;
            ur6 a = b.a(j7);
            tr6Var2.g = a;
            long j9 = b.e;
            if (j8 != j9) {
                long j10 = j9 == j2 ? Long.MAX_VALUE : j9 + tr6Var2.p;
                int i2 = (a.f || !m(this.j, jArr, tr6Var2, j10)) ? i : 1;
                boolean m = m(this.k, jArr2, tr6Var2, j10);
                int s = s(tr6Var2);
                if (s != 0) {
                    return s;
                }
                int i3 = (i2 == 0 || (j8 == j2 && rx6Var.e == -1)) ? i : 1;
                return m ? i3 | 2 : i3;
            }
            tr6Var = tr6Var2;
        }
        return 0;
    }
}
