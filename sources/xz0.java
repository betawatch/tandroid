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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xz0 {
    public static final long[] Q = {300000, 1000000, 3300000};
    public final boolean F;
    public HashMap I;
    public rz0 L;
    public boolean M;
    public int N;
    public lz0 O;
    public final mz0 a;
    public int b;
    public long e;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public lz0 l;
    public lz0 m;
    public lz0 n;
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
    public final l54[] z = new l54[2];
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

    public xz0(mz0 mz0Var, boolean z) {
        this.a = mz0Var;
        this.F = z;
    }

    public static void d(lz0 lz0Var) {
        if (lz0Var != null) {
            lz0Var.cancel();
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
        this.n = this.a.j(new gz0(this, (byte) 4), 100L);
    }

    public final void C() {
        if (this.c == 4) {
            return;
        }
        this.a.c("stop");
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
            f((sz0) obj);
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
        mz0 mz0Var = this.a;
        long h = (j <= 0 || this.p < 0) ? -1L : ((mz0Var.h() - this.k) + this.j) - this.p;
        float f = 1.0f;
        if (!this.F && this.c == 2 && this.q && !this.h && this.g < 0 && h >= 0 && this.f - this.p > 1000) {
            if (h - (Math.min(this.i * 1000, 1000L) + 3000) > (this.r > 1.0f ? 100L : 500L)) {
                if (mz0Var.h() - this.k > 10000) {
                    if (!this.s) {
                        this.s = true;
                        mz0Var.e(new dz0(this, this.b, (byte) 0));
                    }
                    f = this.r;
                } else {
                    f = 1.05f;
                }
            }
        }
        if (f != this.r) {
            this.r = f;
            mz0Var.c("playback rate " + f + ", latency " + h + " ms, target " + (Math.min(this.i * 1000, 1000L) + 3000) + " ms");
            mz0Var.a(f);
        }
    }

    public final int a(l54 l54Var, long j, long j2, int i, int i2, long j3) {
        double b = l54Var.b();
        double max = j - Math.max(j2, this.w);
        if (max <= Math.max(b, 500.0d)) {
            return -1;
        }
        double c = c();
        double a = l54Var.a();
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
        if (l54Var.a() * 0.7d > s2) {
            this.z[this.y ? 1 : 0] = new l54(s2);
            this.A[this.y ? 1 : 0] = true;
        }
        this.a.c("abandon " + j3 + " q" + i + " -> q" + i3 + ", loading " + ((long) max) + " ms, buffer " + String.format("%.2f", Double.valueOf(c)) + " s");
        return i3;
    }

    public final long b() {
        long j = this.g;
        long m = j >= 0 ? m(j) : Math.max(this.f, 0L);
        while (true) {
            nz0 nz0Var = (nz0) this.d.get(Long.valueOf(m));
            if (nz0Var == null || !nz0Var.a()) {
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
            nz0 nz0Var = (nz0) ((Map.Entry) it.next()).getValue();
            lz0 lz0Var = nz0Var.c;
            if (lz0Var != null) {
                lz0Var.cancel();
                nz0Var.c = null;
                nz0Var.e++;
                this.v--;
            }
            d(nz0Var.d);
            nz0Var.d = null;
            Iterator it2 = nz0Var.k.values().iterator();
            while (it2.hasNext()) {
                g((vz0) it2.next());
            }
            if (z || !nz0Var.a()) {
                it.remove();
            }
        }
        this.e = b();
    }

    public final void f(sz0 sz0Var) {
        lz0 lz0Var = sz0Var.e;
        if (lz0Var != null) {
            lz0Var.cancel();
            sz0Var.e = null;
            this.v--;
        }
        sz0Var.g++;
        d(sz0Var.f);
        sz0Var.f = null;
    }

    public final void g(vz0 vz0Var) {
        lz0 lz0Var = vz0Var.d;
        if (lz0Var != null) {
            lz0Var.cancel();
            vz0Var.d = null;
            this.v--;
        }
        vz0Var.f++;
        d(vz0Var.e);
        vz0Var.e = null;
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
            iArr2[i4] = ((uz0) arrayList.get(i4)).b;
        }
        l54 l54Var = this.z[this.y ? 1 : 0];
        if (!o(l54Var) || size == 0) {
            return iArr2;
        }
        Integer[] numArr = new Integer[size];
        for (int i5 = 0; i5 < size; i5++) {
            numArr[i5] = Integer.valueOf(i5);
        }
        Arrays.sort(numArr, new jz0(this, (byte) 0));
        double a = l54Var.a();
        double b = l54Var.b() / 1000.0d;
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
                    uz0 uz0Var = (uz0) arrayList.get(i3);
                    uz0Var.getClass();
                    iArr4[i3] = i7;
                    int i8 = i7;
                    j2 += s(i8);
                    Integer num = (Integer) hashMap.get(uz0Var.a);
                    j3 = s(num != null ? num.intValue() : uz0Var.b) + j3;
                    i3++;
                    i7 = i8;
                }
                int i9 = i7;
                if (j2 < j3) {
                    return iArr4;
                }
                for (int i10 = i9; i10 < size; i10++) {
                    Integer num2 = (Integer) hashMap.get(((uz0) arrayList.get(i10)).a);
                    iArr3[i10] = num2 != null ? num2.intValue() : ((uz0) arrayList.get(i10)).b;
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
                    Integer num3 = (Integer) hashMap.get(((uz0) arrayList.get(i11)).a);
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
                    ((uz0) arrayList.get(intValue)).getClass();
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

    public final void i(nz0 nz0Var, long j) {
        boolean a = nz0Var.a();
        LinkedHashMap linkedHashMap = nz0Var.k;
        if (a) {
            if (linkedHashMap.isEmpty() && nz0Var.j == 0) {
                this.w = j;
                j();
                w();
                return;
            }
            l54 k = k();
            long j2 = nz0Var.f;
            boolean z = nz0Var.g;
            for (vz0 vz0Var : linkedHashMap.values()) {
                long j3 = vz0Var.g;
                if (j3 < j2) {
                    z = vz0Var.h;
                    j2 = j3;
                }
            }
            double max = j - Math.max(j2, this.w);
            if (z) {
                max -= k.b();
            }
            k.c(max, nz0Var.l);
            this.w = j;
            j();
            w();
        }
    }

    public final void j() {
        boolean z = this.F;
        mz0 mz0Var = this.a;
        if (!z) {
            if (this.g >= 0) {
                long b = b();
                long j = this.g;
                if (b - j >= 2000) {
                    this.g = -1L;
                    this.h = false;
                    mz0Var.c("player starts at " + j);
                    this.u = true;
                    mz0Var.d(j);
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
                    mz0Var.c("resume buffer loaded ahead of " + j2);
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
            nz0 nz0Var = (nz0) treeMap.get(Long.valueOf(m));
            if (nz0Var == null || !nz0Var.a()) {
                return;
            }
            this.N = (int) (this.g - m);
            this.f = m;
            this.g = -1L;
        }
        if (this.f >= 0) {
            while (true) {
                nz0 nz0Var2 = (nz0) treeMap.get(Long.valueOf(this.f));
                if (nz0Var2 == null) {
                    break;
                }
                LinkedHashMap linkedHashMap = nz0Var2.k;
                if (!nz0Var2.a()) {
                    break;
                }
                treeMap.remove(Long.valueOf(this.f));
                this.f += 1000;
                tz0 tz0Var = new tz0(nz0Var2.a, 0, nz0Var2.h, nz0Var2.i, linkedHashMap.isEmpty() ? nz0Var2.j : 1000);
                for (vz0 vz0Var : linkedHashMap.values()) {
                    String str = vz0Var.a;
                    tz0Var.f.add(new wz0(str, vz0Var.b, vz0Var.c, vz0Var.i, vz0Var.j));
                    Integer num = (Integer) this.K.put(str, Integer.valueOf(vz0Var.c));
                    if (num == null || num.intValue() != vz0Var.c) {
                        mz0Var.c("video " + str + " quality " + num + " -> " + vz0Var.c + " at " + nz0Var2.a);
                    }
                }
                mz0Var.b(tz0Var);
                this.G.addLast(tz0Var);
            }
            u();
        }
    }

    public final l54 k() {
        boolean z = this.y;
        l54[] l54VarArr = this.z;
        l54 l54Var = l54VarArr[z ? 1 : 0];
        if (l54Var != null) {
            return l54Var;
        }
        l54 l54Var2 = new l54(500000.0d);
        l54VarArr[z ? 1 : 0] = l54Var2;
        return l54Var2;
    }

    public final uz0 l(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            uz0 uz0Var = (uz0) obj;
            if (uz0Var.a.equals(str)) {
                return uz0Var;
            }
        }
        return null;
    }

    public final void n() {
        while (true) {
            Long valueOf = Long.valueOf(this.f);
            TreeMap treeMap = this.d;
            nz0 nz0Var = (nz0) treeMap.get(valueOf);
            if (nz0Var == null || nz0Var.h == null) {
                return;
            }
            treeMap.remove(Long.valueOf(this.f));
            this.f += 1000;
            this.a.b(new tz0(nz0Var.a, nz0Var.b, nz0Var.h, nz0Var.i, nz0Var.j));
        }
    }

    public final boolean o(l54 l54Var) {
        if (l54Var != null) {
            return l54Var.c.c >= 0.001d || this.A[this.y ? 1 : 0];
        }
        return false;
    }

    public final void p(nz0 nz0Var) {
        nz0Var.d = null;
        mz0 mz0Var = this.a;
        nz0Var.f = mz0Var.h();
        int i = this.v;
        nz0Var.g = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = nz0Var.e + 1;
        nz0Var.e = i3;
        long j = nz0Var.a;
        qz0 qz0Var = this.F ? new qz0(j, 0, 0) : new qz0(j, 1, nz0Var.b);
        nz0Var.c = new rm0((byte) 12);
        wg i4 = mz0Var.i(qz0Var, new ez0(this, i2, nz0Var, i3, (byte) 0));
        if (nz0Var.e != i3 || nz0Var.c == null) {
            return;
        }
        nz0Var.c = i4;
    }

    public final void q(sz0 sz0Var) {
        sz0Var.f = null;
        mz0 mz0Var = this.a;
        sz0Var.h = mz0Var.h();
        int i = this.v;
        sz0Var.i = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = sz0Var.g + 1;
        sz0Var.g = i3;
        sz0Var.e = new rm0((byte) 12);
        wg i4 = mz0Var.i(new qz0(sz0Var.a.a, sz0Var.c, sz0Var.d), new ez0(this, i2, sz0Var, i3, (byte) 1));
        if (sz0Var.g != i3 || sz0Var.e == null) {
            return;
        }
        sz0Var.e = i4;
    }

    public final void r(final nz0 nz0Var, final vz0 vz0Var) {
        vz0Var.e = null;
        mz0 mz0Var = this.a;
        vz0Var.g = mz0Var.h();
        int i = this.v;
        vz0Var.h = i == 0;
        this.v = i + 1;
        final int i2 = this.b;
        final int i3 = vz0Var.f + 1;
        vz0Var.f = i3;
        vz0Var.d = new rm0((byte) 12);
        wg i4 = mz0Var.i(new qz0(nz0Var.a, vz0Var.b, vz0Var.c), new pz0() { // from class: kz0
            @Override // pz0
            public final void b(oz0 oz0Var) {
                xz0 xz0Var = xz0.this;
                xz0Var.a.j(new iz0(xz0Var, i2, vz0Var, i3, nz0Var, oz0Var), 0L);
            }
        });
        if (vz0Var.f != i3 || vz0Var.d == null) {
            return;
        }
        vz0Var.d = i4;
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
        rz0 rz0Var = this.L;
        if (rz0Var == null || !this.M) {
            return D;
        }
        return Math.max(0L, (Math.max(1000 - rz0Var.c, 0L) + rz0Var.b) - this.a.h()) + D;
    }

    public final void u() {
        long j;
        if (this.c != 4) {
            d(this.O);
            this.O = null;
            mz0 mz0Var = this.a;
            long h = mz0Var.h();
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
                tz0 tz0Var = (tz0) arrayDeque.pollFirst();
                this.L = new rz0(tz0Var, h, i);
                mz0Var.g(tz0Var.a, i, h);
                j = h;
                this.M = true;
                if (!this.t) {
                    this.t = true;
                    B();
                }
            }
            long j3 = this.L.b;
            if (j3 > j) {
                this.O = mz0Var.j(new gz0(this, (byte) 1), j3 - j);
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
                    tz0 tz0Var2 = (tz0) arrayDeque.pollFirst();
                    this.L = new rz0(tz0Var2, max2, 0);
                    mz0Var.g(tz0Var2.a, 0, max2);
                    this.O = mz0Var.j(new gz0(this, (byte) 2), max2 - j);
                    return;
                }
            }
            if (j < max) {
                this.O = mz0Var.j(new gz0(this, (byte) 3), max - j);
                return;
            }
            this.M = false;
            this.i++;
            mz0Var.c("stall after " + this.L.a + ", buffered to " + this.f);
            u();
        }
    }

    public final void v(nz0 nz0Var, HashMap hashMap) {
        if (hashMap != null) {
            ArrayList arrayList = this.H;
            if (arrayList.isEmpty()) {
                return;
            }
            int[] h = h();
            for (int i = 0; i < arrayList.size(); i++) {
                String str = ((uz0) arrayList.get(i)).a;
                Integer num = (Integer) hashMap.get(str);
                LinkedHashMap linkedHashMap = nz0Var.k;
                vz0 vz0Var = (vz0) linkedHashMap.get(str);
                if (num == null) {
                    if (vz0Var != null) {
                        g(vz0Var);
                        linkedHashMap.remove(str);
                    }
                } else if (vz0Var == null) {
                    vz0 vz0Var2 = new vz0(str, num.intValue(), h[i]);
                    linkedHashMap.put(str, vz0Var2);
                    r(nz0Var, vz0Var2);
                } else if (vz0Var.b != num.intValue()) {
                    g(vz0Var);
                    vz0Var.b = num.intValue();
                    vz0Var.i = null;
                    r(nz0Var, vz0Var);
                }
            }
        }
    }

    public final void w() {
        mz0 mz0Var;
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
                if (!((nz0) it.next()).a()) {
                    i4++;
                }
            }
            if (i4 >= i3) {
                return;
            }
            mz0 mz0Var2 = this.a;
            boolean z = this.F;
            if (!z || this.g >= 0 || this.f < 0) {
                long j4 = this.e;
                if (z) {
                    j2 = this.g;
                    if (j2 >= 0) {
                        mz0Var = mz0Var2;
                        j = 1000;
                    } else {
                        long h = mz0Var2.h();
                        rz0 rz0Var = this.L;
                        if (rz0Var == null || !this.M) {
                            mz0Var = mz0Var2;
                            j = 1000;
                        } else {
                            j = 1000;
                            long j5 = rz0Var.b;
                            if (j5 <= h) {
                                long j6 = rz0Var.a;
                                mz0Var = mz0Var2;
                                long j7 = rz0Var.c;
                                j2 = Math.min(h - j5, 1000 - j7) + j6 + j7;
                            } else {
                                mz0Var = mz0Var2;
                            }
                        }
                        ArrayDeque arrayDeque = this.G;
                        j2 = !arrayDeque.isEmpty() ? ((tz0) arrayDeque.peekFirst()).a : Math.max(this.f, 0L);
                    }
                } else {
                    mz0Var = mz0Var2;
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
                mz0Var = mz0Var2;
                j = 1000;
            }
            if (j3 >= 30000) {
                return;
            }
            long h2 = (mz0Var.h() - this.k) + this.j;
            long j8 = this.e;
            long j9 = j8 + j;
            if (j9 > h2) {
                this.l = mz0Var.j(new gz0(this, (byte) 5), j9 - h2);
                return;
            }
            mz0 mz0Var3 = mz0Var;
            nz0 nz0Var = new nz0(j8);
            treeMap.put(Long.valueOf(nz0Var.a), nz0Var);
            this.e += j;
            if (z) {
                i2 = 0;
            } else {
                l54 l54Var = this.z[this.y ? 1 : 0];
                if (o(l54Var)) {
                    double a = l54Var.a();
                    double b = l54Var.b() / 1000.0d;
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
            nz0Var.b = i2;
            mz0Var3.h();
            p(nz0Var);
            if (z) {
                v(nz0Var, this.I);
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
        this.a.e(new dz0(this, this.b, (byte) 1));
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
        mz0 mz0Var = this.a;
        this.k = mz0Var.h();
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
                    f((sz0) obj);
                }
                arrayList.clear();
                this.h = false;
                this.f = m;
                this.e = m;
            } else {
                this.e = b;
            }
        }
        StringBuilder o = ik8.o(j, "listener resync at server time ", ", fetching from ");
        o.append(this.e);
        mz0Var.c(o.toString());
        w();
    }
}
