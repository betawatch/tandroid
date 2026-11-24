// default package

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w01 {
    public static final long[] Q = {300000, 1000000, 3300000};
    public final boolean F;
    public HashMap I;
    public q01 L;
    public boolean M;
    public int N;
    public k01 O;
    public final l01 a;
    public int b;
    public long e;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public k01 l;
    public k01 m;
    public k01 n;
    public long o;
    public boolean q;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public long w;
    public byte c = 0;
    public final TreeMap d = new TreeMap();
    public long f = -1;
    public long g = -1;
    public long p = -1;
    public float r = 1.0f;
    public int x = -1;
    public boolean y = false;
    public final a64[] z = new a64[2];
    public final boolean[] A = new boolean[2];
    public final long[][] B = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 3, 10);
    public final int[] C = new int[3];
    public final int[] D = new int[3];
    public byte E = 2;
    public final ArrayDeque G = new ArrayDeque();
    public final ArrayList H = new ArrayList();
    public final HashMap J = new HashMap();
    public final HashMap K = new HashMap();
    public final ArrayList P = new ArrayList();

    public w01(l01 l01Var, boolean z) {
        this.a = l01Var;
        this.F = z;
    }

    public static void d(k01 k01Var) {
        if (k01Var != null) {
            k01Var.cancel();
        }
    }

    public static long m(long j) {
        long j2 = j / 1000;
        if (j - (1000 * j2) != 0 && (((j ^ 1000) >> 63) | 1) < 0) {
            j2--;
        }
        return j2 * 1000;
    }

    public final void A(long j, long j2, boolean z) {
        if (z && this.v == 0) {
            double d = j2 - j;
            k().d.b(Math.exp((-Math.pow(d / 1000.0d, 2.0d)) / 2.0d) * 1.4142135623730951d, Math.max(d, 5.0d));
        }
    }

    public final void B() {
        d(this.n);
        this.n = this.a.j(new f01(this, (byte) 4), 100L);
    }

    public final void C() {
        if (this.c == 4) {
            return;
        }
        this.a.d("stop");
        this.c = (byte) 4;
        this.b++;
        e(true);
        d(this.l);
        d(this.m);
        d(this.n);
        d(this.O);
        this.O = null;
        this.n = null;
        this.m = null;
        this.l = null;
        this.G.clear();
        this.L = null;
        int i = 0;
        this.M = false;
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f((r01) obj);
        }
        arrayList.clear();
    }

    public final long D() {
        if (this.G.isEmpty()) {
            return 0L;
        }
        return (r0.size() * 1000) - (this.L == null ? this.N : 0);
    }

    public final void E() {
        long j = this.k;
        l01 l01Var = this.a;
        long h = (j <= 0 || this.p < 0) ? -1L : ((l01Var.h() - this.k) + this.j) - this.p;
        float f = 1.0f;
        if (!this.F && this.c == 2 && this.q && !this.h && this.g < 0 && h >= 0 && this.f - this.p > 1000) {
            if (h - (Math.min(this.i * 1000, 1000L) + 3000) > (this.r > 1.0f ? 100L : 500L)) {
                if (l01Var.h() - this.k > 10000) {
                    if (!this.s) {
                        this.s = true;
                        l01Var.e(new c01(this, this.b, (byte) 0));
                    }
                    f = this.r;
                } else {
                    f = 1.05f;
                }
            }
        }
        if (f != this.r) {
            this.r = f;
            l01Var.d("playback rate " + f + ", latency " + h + " ms, target " + (Math.min(this.i * 1000, 1000L) + 3000) + " ms");
            l01Var.a(f);
        }
    }

    public final int a(a64 a64Var, long j, long j2, int i, int i2, long j3) {
        double b = a64Var.b();
        double max = j - Math.max(j2, this.w);
        if (max <= Math.max(b, 500.0d)) {
            return -1;
        }
        double c = c();
        double a = a64Var.a();
        double d = b / 1000.0d;
        double s = ((s(i) * 1.0d) / a) + d;
        if (s <= c) {
            return -1;
        }
        int i3 = i - 1;
        double d2 = Double.POSITIVE_INFINITY;
        int i4 = i;
        while (true) {
            if (i3 < i2) {
                i3 = i4;
                break;
            }
            double d3 = d;
            d2 = ((s(i3) * 1.0d) / a) + d3;
            if (d2 < Math.min(c, d3 + 1.0d)) {
                break;
            }
            i4 = i3;
            i3--;
            d = d3;
        }
        if (i3 == i || d2 >= s || d2 > 10.0d) {
            return -1;
        }
        double s2 = s(i3);
        if (a64Var.a() * 0.7d > s2) {
            this.z[this.y ? 1 : 0] = new a64(s2);
            this.A[this.y ? 1 : 0] = true;
        }
        this.a.d("abandon " + j3 + " q" + i + " -> q" + i3 + ", loading " + ((long) max) + " ms, buffer " + String.format("%.2f", Double.valueOf(c)) + " s");
        return i3;
    }

    public final long b() {
        long j = this.g;
        long m = j >= 0 ? m(j) : Math.max(this.f, 0L);
        while (true) {
            m01 m01Var = (m01) this.d.get(Long.valueOf(m));
            if (m01Var == null || !m01Var.a()) {
                break;
            }
            m += 1000;
        }
        if (this.g >= 0 || this.f >= 0) {
            return m;
        }
        return 0L;
    }

    public final double c() {
        long max;
        if (this.g >= 0) {
            return 0.0d;
        }
        long j = this.f;
        if (j < 0) {
            return 0.0d;
        }
        if (this.F) {
            max = t();
        } else {
            long j2 = this.p;
            if (j2 >= 0) {
                j = j2;
            }
            max = Math.max(0L, b() - j);
        }
        return max / 1000.0d;
    }

    public final void e(boolean z) {
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            m01 m01Var = (m01) ((Map.Entry) it.next()).getValue();
            k01 k01Var = m01Var.c;
            if (k01Var != null) {
                k01Var.cancel();
                m01Var.c = null;
                m01Var.e++;
                this.v--;
            }
            d(m01Var.d);
            m01Var.d = null;
            Iterator it2 = m01Var.k.values().iterator();
            while (it2.hasNext()) {
                g((u01) it2.next());
            }
            if (z || !m01Var.a()) {
                it.remove();
            }
        }
        this.e = b();
    }

    public final void f(r01 r01Var) {
        k01 k01Var = r01Var.e;
        if (k01Var != null) {
            k01Var.cancel();
            r01Var.e = null;
            this.v--;
        }
        r01Var.g++;
        d(r01Var.f);
        r01Var.f = null;
    }

    public final void g(u01 u01Var) {
        k01 k01Var = u01Var.d;
        if (k01Var != null) {
            k01Var.cancel();
            u01Var.d = null;
            this.v--;
        }
        u01Var.f++;
        d(u01Var.e);
        u01Var.e = null;
    }

    public final int[] h() {
        int[] iArr;
        int i;
        int i2;
        int intValue;
        long j;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((t01) arrayList.get(i4)).b;
        }
        a64 a64Var = this.z[this.y ? 1 : 0];
        if (!o(a64Var) || size == 0) {
            return iArr2;
        }
        Integer[] numArr = new Integer[size];
        for (int i5 = 0; i5 < size; i5++) {
            numArr[i5] = Integer.valueOf(i5);
        }
        Arrays.sort(numArr, new i01(this, (byte) 0));
        double a = a64Var.a();
        double b = a64Var.b() / 1000.0d;
        double t = ((this.g >= 0 || this.f < 0) ? 0L : t()) / 1000.0d;
        int i6 = 0;
        while (true) {
            HashMap hashMap = this.J;
            if (i6 >= 2) {
                int[] iArr3 = iArr2;
                int i7 = i3;
                int[] iArr4 = new int[size];
                long j2 = 0;
                long j3 = 0;
                while (i3 < size) {
                    t01 t01Var = (t01) arrayList.get(i3);
                    t01Var.getClass();
                    iArr4[i3] = i7;
                    int i8 = i7;
                    j2 += s(i8);
                    Integer num = (Integer) hashMap.get(t01Var.a);
                    j3 = s(num != null ? num.intValue() : t01Var.b) + j3;
                    i3++;
                    i7 = i8;
                }
                int i9 = i7;
                if (j2 < j3) {
                    return iArr4;
                }
                for (int i10 = i9; i10 < size; i10++) {
                    Integer num2 = (Integer) hashMap.get(((t01) arrayList.get(i10)).a);
                    iArr3[i10] = num2 != null ? num2.intValue() : ((t01) arrayList.get(i10)).b;
                }
                return iArr3;
            }
            double d = i6 == 0 ? t : t + 1.0d;
            int[] iArr5 = (int[]) iArr2.clone();
            while (true) {
                iArr = iArr2;
                int i11 = i3;
                i = i11;
                i2 = i6;
                long j4 = 100000;
                while (i11 < iArr5.length) {
                    long s = s(iArr5[i11]) + j4;
                    Integer num3 = (Integer) hashMap.get(((t01) arrayList.get(i11)).a);
                    if (num3 != null) {
                        j = s;
                        if (iArr5[i11] > num3.intValue()) {
                            i = 1;
                        }
                    } else {
                        j = s;
                    }
                    i11++;
                    j4 = j;
                }
                double d2 = j4;
                if (d2 <= (i != 0 ? 0.7d : 0.95d) * a && ((d2 * 1.0d) / a) + b <= d) {
                    return iArr5;
                }
                for (int i12 = i; i12 < size; i12++) {
                    intValue = numArr[i12].intValue();
                    int i13 = iArr5[intValue];
                    ((t01) arrayList.get(intValue)).getClass();
                    if (i13 > 0) {
                        break;
                    }
                }
                iArr5[intValue] = iArr5[intValue] - 1;
                i3 = i;
                i6 = i2;
                iArr2 = iArr;
            }
            i6 = i2 + 1;
            i3 = i;
            iArr2 = iArr;
        }
    }

    public final void i(m01 m01Var, long j) {
        boolean a = m01Var.a();
        LinkedHashMap linkedHashMap = m01Var.k;
        if (a) {
            if (linkedHashMap.isEmpty() && m01Var.j == 0) {
                this.w = j;
                j();
                w();
                return;
            }
            a64 k = k();
            long j2 = m01Var.f;
            boolean z = m01Var.g;
            for (u01 u01Var : linkedHashMap.values()) {
                long j3 = u01Var.g;
                if (j3 < j2) {
                    z = u01Var.h;
                    j2 = j3;
                }
            }
            double max = j - Math.max(j2, this.w);
            if (z) {
                max -= k.b();
            }
            k.c(m01Var.l, max);
            this.w = j;
            j();
            w();
        }
    }

    public final void j() {
        boolean z = this.F;
        l01 l01Var = this.a;
        if (!z) {
            if (this.g >= 0) {
                long b = b();
                long j = this.g;
                if (b - j >= 2000) {
                    this.g = -1L;
                    this.h = false;
                    l01Var.d("player starts at " + j);
                    this.u = true;
                    l01Var.c(j);
                    this.f = m(j);
                    n();
                    return;
                }
                return;
            }
            long j2 = this.f;
            if (j2 >= 0) {
                if (this.h) {
                    long j3 = this.p;
                    if (j3 >= 0) {
                        j2 = j3;
                    }
                    if (b() - j2 < 2000) {
                        return;
                    }
                    l01Var.d("resume buffer loaded ahead of " + j2);
                    this.h = false;
                    this.u = true;
                }
                n();
                return;
            }
            return;
        }
        long j4 = this.g;
        TreeMap treeMap = this.d;
        if (j4 >= 0) {
            long m = m(j4);
            m01 m01Var = (m01) treeMap.get(Long.valueOf(m));
            if (m01Var == null || !m01Var.a()) {
                return;
            }
            this.N = (int) (this.g - m);
            this.f = m;
            this.g = -1L;
        }
        if (this.f >= 0) {
            while (true) {
                m01 m01Var2 = (m01) treeMap.get(Long.valueOf(this.f));
                if (m01Var2 == null) {
                    break;
                }
                LinkedHashMap linkedHashMap = m01Var2.k;
                if (!m01Var2.a()) {
                    break;
                }
                treeMap.remove(Long.valueOf(this.f));
                this.f += 1000;
                s01 s01Var = new s01(m01Var2.a, 0, m01Var2.h, m01Var2.i, linkedHashMap.isEmpty() ? m01Var2.j : 1000);
                for (u01 u01Var : linkedHashMap.values()) {
                    String str = u01Var.a;
                    s01Var.f.add(new v01(str, u01Var.b, u01Var.c, u01Var.i, u01Var.j));
                    Integer num = (Integer) this.K.put(str, Integer.valueOf(u01Var.c));
                    if (num == null || num.intValue() != u01Var.c) {
                        l01Var.d("video " + str + " quality " + num + " -> " + u01Var.c + " at " + m01Var2.a);
                    }
                }
                l01Var.b(s01Var);
                this.G.addLast(s01Var);
            }
            u();
        }
    }

    public final a64 k() {
        boolean z = this.y;
        a64[] a64VarArr = this.z;
        a64 a64Var = a64VarArr[z ? 1 : 0];
        if (a64Var != null) {
            return a64Var;
        }
        a64 a64Var2 = new a64(500000.0d);
        a64VarArr[z ? 1 : 0] = a64Var2;
        return a64Var2;
    }

    public final t01 l(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t01 t01Var = (t01) obj;
            if (t01Var.a.equals(str)) {
                return t01Var;
            }
        }
        return null;
    }

    public final void n() {
        while (true) {
            Long valueOf = Long.valueOf(this.f);
            TreeMap treeMap = this.d;
            m01 m01Var = (m01) treeMap.get(valueOf);
            if (m01Var == null || m01Var.h == null) {
                return;
            }
            treeMap.remove(Long.valueOf(this.f));
            this.f += 1000;
            this.a.b(new s01(m01Var.a, m01Var.b, m01Var.h, m01Var.i, m01Var.j));
        }
    }

    public final boolean o(a64 a64Var) {
        if (a64Var != null) {
            return a64Var.c.c >= 0.001d || this.A[this.y ? 1 : 0];
        }
        return false;
    }

    public final void p(m01 m01Var) {
        m01Var.d = null;
        l01 l01Var = this.a;
        m01Var.f = l01Var.h();
        int i = this.v;
        m01Var.g = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = m01Var.e + 1;
        m01Var.e = i3;
        long j = m01Var.a;
        p01 p01Var = this.F ? new p01(j, 0, 0) : new p01(j, 1, m01Var.b);
        m01Var.c = new qn0((byte) 11);
        ji i4 = l01Var.i(p01Var, new d01(this, i2, m01Var, i3, (byte) 0));
        if (m01Var.e != i3 || m01Var.c == null) {
            return;
        }
        m01Var.c = i4;
    }

    public final void q(r01 r01Var) {
        r01Var.f = null;
        l01 l01Var = this.a;
        r01Var.h = l01Var.h();
        int i = this.v;
        r01Var.i = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = r01Var.g + 1;
        r01Var.g = i3;
        r01Var.e = new qn0((byte) 11);
        ji i4 = l01Var.i(new p01(r01Var.a.a, r01Var.c, r01Var.d), new d01(this, i2, r01Var, i3, (byte) 1));
        if (r01Var.g != i3 || r01Var.e == null) {
            return;
        }
        r01Var.e = i4;
    }

    public final void r(final m01 m01Var, final u01 u01Var) {
        u01Var.e = null;
        l01 l01Var = this.a;
        u01Var.g = l01Var.h();
        int i = this.v;
        u01Var.h = i == 0;
        this.v = i + 1;
        final int i2 = this.b;
        final int i3 = u01Var.f + 1;
        u01Var.f = i3;
        u01Var.d = new qn0((byte) 11);
        ji i4 = l01Var.i(new p01(m01Var.a, u01Var.b, u01Var.c), new o01() { // from class: j01
            @Override // o01
            public final void b(n01 n01Var) {
                w01 w01Var = w01.this;
                w01Var.a.j(new h01(w01Var, i2, u01Var, i3, m01Var, n01Var), 0L);
            }
        });
        if (u01Var.f != i3 || u01Var.d == null) {
            return;
        }
        u01Var.d = i4;
    }

    public final long s(int i) {
        int i2 = this.C[i];
        if (i2 == 0) {
            return Q[i];
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += this.B[i][i3];
        }
        return j / i2;
    }

    public final long t() {
        long D = D();
        q01 q01Var = this.L;
        if (q01Var == null || !this.M) {
            return D;
        }
        return Math.max(0L, (Math.max(1000 - q01Var.c, 0L) + q01Var.b) - this.a.h()) + D;
    }

    public final void u() {
        long j;
        if (this.c != 4) {
            d(this.O);
            this.O = null;
            l01 l01Var = this.a;
            long h = l01Var.h();
            boolean z = this.M;
            ArrayDeque arrayDeque = this.G;
            if (z) {
                j = h;
            } else {
                long j2 = this.L == null ? 1000L : 2000L;
                if (arrayDeque.isEmpty() || D() < j2) {
                    return;
                }
                int i = this.L == null ? this.N : 0;
                s01 s01Var = (s01) arrayDeque.pollFirst();
                this.L = new q01(s01Var, h, i);
                l01Var.g(s01Var.a, i, h);
                j = h;
                this.M = true;
                if (!this.t) {
                    this.t = true;
                    B();
                }
            }
            long j3 = this.L.b;
            if (j3 > j) {
                this.O = l01Var.j(new f01(this, (byte) 1), j3 - j);
                return;
            }
            long max = Math.max(1000 - r1.c, 0L) + j3;
            if (!arrayDeque.isEmpty()) {
                long min = Math.min(this.L.b + Math.max(r1.d - r1.c, 0), max);
                if (min < max && (arrayDeque.size() - 1) * 1000 < 1000) {
                    min = max;
                }
                long max2 = Math.max(min, j);
                if (max2 <= max) {
                    s01 s01Var2 = (s01) arrayDeque.pollFirst();
                    this.L = new q01(s01Var2, max2, 0);
                    l01Var.g(s01Var2.a, 0, max2);
                    this.O = l01Var.j(new f01(this, (byte) 2), max2 - j);
                    return;
                }
            }
            if (j < max) {
                this.O = l01Var.j(new f01(this, (byte) 3), max - j);
                return;
            }
            this.M = false;
            this.i++;
            l01Var.d("stall after " + this.L.a + ", buffered to " + this.f);
            u();
        }
    }

    public final void v(m01 m01Var, HashMap hashMap) {
        if (hashMap != null) {
            ArrayList arrayList = this.H;
            if (arrayList.isEmpty()) {
                return;
            }
            int[] h = h();
            for (int i = 0; i < arrayList.size(); i++) {
                String str = ((t01) arrayList.get(i)).a;
                Integer num = (Integer) hashMap.get(str);
                LinkedHashMap linkedHashMap = m01Var.k;
                u01 u01Var = (u01) linkedHashMap.get(str);
                if (num == null) {
                    if (u01Var != null) {
                        g(u01Var);
                        linkedHashMap.remove(str);
                    }
                } else if (u01Var == null) {
                    u01 u01Var2 = new u01(str, num.intValue(), h[i]);
                    linkedHashMap.put(str, u01Var2);
                    r(m01Var, u01Var2);
                } else if (u01Var.b != num.intValue()) {
                    g(u01Var);
                    u01Var.b = num.intValue();
                    u01Var.i = null;
                    r(m01Var, u01Var);
                }
            }
        }
    }

    public final void w() {
        l01 l01Var;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        int i3 = 2;
        if (this.c != 2) {
            return;
        }
        d(this.l);
        this.l = null;
        while (true) {
            TreeMap treeMap = this.d;
            Iterator it = treeMap.values().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (!((m01) it.next()).a()) {
                    i4++;
                }
            }
            if (i4 >= i3) {
                return;
            }
            l01 l01Var2 = this.a;
            boolean z = this.F;
            if (!z || this.g >= 0 || this.f < 0) {
                long j4 = this.e;
                if (z) {
                    j2 = this.g;
                    if (j2 >= 0) {
                        l01Var = l01Var2;
                        j = 1000;
                    } else {
                        long h = l01Var2.h();
                        q01 q01Var = this.L;
                        if (q01Var == null || !this.M) {
                            l01Var = l01Var2;
                            j = 1000;
                        } else {
                            j = 1000;
                            long j5 = q01Var.b;
                            if (j5 <= h) {
                                long j6 = q01Var.a;
                                l01Var = l01Var2;
                                long j7 = q01Var.c;
                                j2 = Math.min(h - j5, 1000 - j7) + j6 + j7;
                            } else {
                                l01Var = l01Var2;
                            }
                        }
                        ArrayDeque arrayDeque = this.G;
                        j2 = !arrayDeque.isEmpty() ? ((s01) arrayDeque.peekFirst()).a : Math.max(this.f, 0L);
                    }
                } else {
                    l01Var = l01Var2;
                    j = 1000;
                    j2 = this.g;
                    if (j2 < 0) {
                        j2 = this.p;
                        if (j2 < 0) {
                            j2 = Math.max(this.f, 0L);
                        }
                    }
                }
                j3 = j4 - j2;
            } else {
                j3 = (this.e - this.f) + t();
                l01Var = l01Var2;
                j = 1000;
            }
            if (j3 >= 30000) {
                return;
            }
            long h2 = (l01Var.h() - this.k) + this.j;
            long j8 = this.e;
            long j9 = j8 + j;
            if (j9 > h2) {
                this.l = l01Var.j(new f01(this, (byte) 5), j9 - h2);
                return;
            }
            l01 l01Var3 = l01Var;
            m01 m01Var = new m01(j8);
            treeMap.put(Long.valueOf(m01Var.a), m01Var);
            this.e += j;
            if (z) {
                i2 = 0;
            } else {
                a64 a64Var = this.z[this.y ? 1 : 0];
                if (o(a64Var)) {
                    double a = a64Var.a();
                    double b = a64Var.b() / 1000.0d;
                    double c = c();
                    int i5 = 0;
                    while (true) {
                        i = 1;
                        if (i5 < 2) {
                            double d = 1.0d;
                            double d2 = i5 == 0 ? c : c + 1.0d;
                            int i6 = this.E;
                            while (i6 >= 1) {
                                double d3 = d;
                                long s = s(i6);
                                int i7 = this.x;
                                double d4 = s;
                                if (d4 <= ((i7 < 0 || i6 <= i7) ? 0.95d : 0.7d) * a && ((d4 * d3) / a) + b <= d2) {
                                    i = i6;
                                    break;
                                } else {
                                    i6--;
                                    d = d3;
                                }
                            }
                            i5++;
                        } else {
                            int i8 = this.x;
                            int i9 = this.E;
                            if (i8 >= 0) {
                                i9 = Math.min(i8, i9);
                            }
                            if (s(1) >= s(i9)) {
                                i = i9;
                            }
                        }
                    }
                } else {
                    i = this.E;
                }
                i2 = i;
            }
            m01Var.b = i2;
            l01Var3.h();
            p(m01Var);
            if (z) {
                v(m01Var, this.I);
            }
            i3 = 2;
        }
    }

    public final void x(int i, int i2) {
        long[] jArr = this.B[i];
        int[] iArr = this.D;
        int i3 = iArr[i];
        jArr[i3] = ((i2 << 3) * 1000) / 1000;
        iArr[i] = (i3 + 1) % 10;
        int[] iArr2 = this.C;
        iArr2[i] = Math.min(iArr2[i] + 1, 10);
    }

    public final void y() {
        this.c = (byte) 1;
        this.a.e(new c01(this, this.b, (byte) 1));
    }

    public final void z(long j) {
        e(false);
        d(this.l);
        this.l = null;
        if (j <= 0) {
            y();
            return;
        }
        this.j = j;
        l01 l01Var = this.a;
        this.k = l01Var.h();
        long min = Math.min(Math.max(j - 30000, j - (Math.min(this.i * 1000, 1000L) + 3000)), j - 1000);
        if (this.f < 0) {
            this.g = min;
            this.e = m(min);
        } else {
            long m = m(min);
            long b = b();
            if (m > b) {
                e(true);
                ArrayList arrayList = this.P;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    f((r01) obj);
                }
                arrayList.clear();
                this.h = false;
                this.f = m;
                this.e = m;
            } else {
                this.e = b;
            }
        }
        StringBuilder o = wi8.o(j, "listener resync at server time ", ", fetching from ");
        o.append(this.e);
        l01Var.d(o.toString());
        w();
    }
}
