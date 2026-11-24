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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pz0 {
    public static final long[] Q = {300000, 1000000, 3300000};
    public final boolean F;
    public HashMap I;
    public jz0 L;
    public boolean M;
    public int N;
    public dz0 O;
    public final ez0 a;
    public int b;
    public long e;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public dz0 l;
    public dz0 m;
    public dz0 n;
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
    public final p44[] z = new p44[2];
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

    public pz0(ez0 ez0Var, boolean z) {
        this.a = ez0Var;
        this.F = z;
    }

    public static void d(dz0 dz0Var) {
        if (dz0Var != null) {
            dz0Var.cancel();
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
        this.n = this.a.j(new yy0(this, (byte) 4), 100L);
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
            f((kz0) obj);
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
        ez0 ez0Var = this.a;
        long h = (j <= 0 || this.p < 0) ? -1L : ((ez0Var.h() - this.k) + this.j) - this.p;
        float f = 1.0f;
        if (!this.F && this.c == 2 && this.q && !this.h && this.g < 0 && h >= 0 && this.f - this.p > 1000) {
            if (h - (Math.min(this.i * 1000, 1000L) + 3000) > (this.r > 1.0f ? 100L : 500L)) {
                if (ez0Var.h() - this.k > 10000) {
                    if (!this.s) {
                        this.s = true;
                        ez0Var.e(new vy0(this, this.b, (byte) 0));
                    }
                    f = this.r;
                } else {
                    f = 1.05f;
                }
            }
        }
        if (f != this.r) {
            this.r = f;
            ez0Var.d("playback rate " + f + ", latency " + h + " ms, target " + (Math.min(this.i * 1000, 1000L) + 3000) + " ms");
            ez0Var.a(f);
        }
    }

    public final int a(p44 p44Var, long j, long j2, int i, int i2, long j3) {
        double b = p44Var.b();
        double max = j - Math.max(j2, this.w);
        if (max <= Math.max(b, 500.0d)) {
            return -1;
        }
        double c = c();
        double a = p44Var.a();
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
        if (p44Var.a() * 0.7d > s2) {
            this.z[this.y ? 1 : 0] = new p44(s2);
            this.A[this.y ? 1 : 0] = true;
        }
        this.a.d("abandon " + j3 + " q" + i + " -> q" + i3 + ", loading " + ((long) max) + " ms, buffer " + String.format("%.2f", Double.valueOf(c)) + " s");
        return i3;
    }

    public final long b() {
        long j = this.g;
        long m = j >= 0 ? m(j) : Math.max(this.f, 0L);
        while (true) {
            fz0 fz0Var = (fz0) this.d.get(Long.valueOf(m));
            if (fz0Var == null || !fz0Var.a()) {
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
            fz0 fz0Var = (fz0) ((Map.Entry) it.next()).getValue();
            dz0 dz0Var = fz0Var.c;
            if (dz0Var != null) {
                dz0Var.cancel();
                fz0Var.c = null;
                fz0Var.e++;
                this.v--;
            }
            d(fz0Var.d);
            fz0Var.d = null;
            Iterator it2 = fz0Var.k.values().iterator();
            while (it2.hasNext()) {
                g((nz0) it2.next());
            }
            if (z || !fz0Var.a()) {
                it.remove();
            }
        }
        this.e = b();
    }

    public final void f(kz0 kz0Var) {
        dz0 dz0Var = kz0Var.e;
        if (dz0Var != null) {
            dz0Var.cancel();
            kz0Var.e = null;
            this.v--;
        }
        kz0Var.g++;
        d(kz0Var.f);
        kz0Var.f = null;
    }

    public final void g(nz0 nz0Var) {
        dz0 dz0Var = nz0Var.d;
        if (dz0Var != null) {
            dz0Var.cancel();
            nz0Var.d = null;
            this.v--;
        }
        nz0Var.f++;
        d(nz0Var.e);
        nz0Var.e = null;
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
            iArr2[i4] = ((mz0) arrayList.get(i4)).b;
        }
        p44 p44Var = this.z[this.y ? 1 : 0];
        if (!o(p44Var) || size == 0) {
            return iArr2;
        }
        Integer[] numArr = new Integer[size];
        for (int i5 = 0; i5 < size; i5++) {
            numArr[i5] = Integer.valueOf(i5);
        }
        Arrays.sort(numArr, new bz0(this, (byte) 0));
        double a = p44Var.a();
        double b = p44Var.b() / 1000.0d;
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
                    mz0 mz0Var = (mz0) arrayList.get(i3);
                    mz0Var.getClass();
                    iArr4[i3] = i7;
                    int i8 = i7;
                    j2 += s(i8);
                    Integer num = (Integer) hashMap.get(mz0Var.a);
                    j3 = s(num != null ? num.intValue() : mz0Var.b) + j3;
                    i3++;
                    i7 = i8;
                }
                int i9 = i7;
                if (j2 < j3) {
                    return iArr4;
                }
                for (int i10 = i9; i10 < size; i10++) {
                    Integer num2 = (Integer) hashMap.get(((mz0) arrayList.get(i10)).a);
                    iArr3[i10] = num2 != null ? num2.intValue() : ((mz0) arrayList.get(i10)).b;
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
                    Integer num3 = (Integer) hashMap.get(((mz0) arrayList.get(i11)).a);
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
                    ((mz0) arrayList.get(intValue)).getClass();
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

    public final void i(fz0 fz0Var, long j) {
        boolean a = fz0Var.a();
        LinkedHashMap linkedHashMap = fz0Var.k;
        if (a) {
            if (linkedHashMap.isEmpty() && fz0Var.j == 0) {
                this.w = j;
                j();
                w();
                return;
            }
            p44 k = k();
            long j2 = fz0Var.f;
            boolean z = fz0Var.g;
            for (nz0 nz0Var : linkedHashMap.values()) {
                long j3 = nz0Var.g;
                if (j3 < j2) {
                    z = nz0Var.h;
                    j2 = j3;
                }
            }
            double max = j - Math.max(j2, this.w);
            if (z) {
                max -= k.b();
            }
            k.c(fz0Var.l, max);
            this.w = j;
            j();
            w();
        }
    }

    public final void j() {
        boolean z = this.F;
        ez0 ez0Var = this.a;
        if (!z) {
            if (this.g >= 0) {
                long b = b();
                long j = this.g;
                if (b - j >= 2000) {
                    this.g = -1L;
                    this.h = false;
                    ez0Var.d("player starts at " + j);
                    this.u = true;
                    ez0Var.c(j);
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
                    ez0Var.d("resume buffer loaded ahead of " + j2);
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
            fz0 fz0Var = (fz0) treeMap.get(Long.valueOf(m));
            if (fz0Var == null || !fz0Var.a()) {
                return;
            }
            this.N = (int) (this.g - m);
            this.f = m;
            this.g = -1L;
        }
        if (this.f >= 0) {
            while (true) {
                fz0 fz0Var2 = (fz0) treeMap.get(Long.valueOf(this.f));
                if (fz0Var2 == null) {
                    break;
                }
                LinkedHashMap linkedHashMap = fz0Var2.k;
                if (!fz0Var2.a()) {
                    break;
                }
                treeMap.remove(Long.valueOf(this.f));
                this.f += 1000;
                lz0 lz0Var = new lz0(fz0Var2.a, 0, fz0Var2.h, fz0Var2.i, linkedHashMap.isEmpty() ? fz0Var2.j : 1000);
                for (nz0 nz0Var : linkedHashMap.values()) {
                    String str = nz0Var.a;
                    lz0Var.f.add(new oz0(str, nz0Var.b, nz0Var.c, nz0Var.i, nz0Var.j));
                    Integer num = (Integer) this.K.put(str, Integer.valueOf(nz0Var.c));
                    if (num == null || num.intValue() != nz0Var.c) {
                        ez0Var.d("video " + str + " quality " + num + " -> " + nz0Var.c + " at " + fz0Var2.a);
                    }
                }
                ez0Var.b(lz0Var);
                this.G.addLast(lz0Var);
            }
            u();
        }
    }

    public final p44 k() {
        boolean z = this.y;
        p44[] p44VarArr = this.z;
        p44 p44Var = p44VarArr[z ? 1 : 0];
        if (p44Var != null) {
            return p44Var;
        }
        p44 p44Var2 = new p44(500000.0d);
        p44VarArr[z ? 1 : 0] = p44Var2;
        return p44Var2;
    }

    public final mz0 l(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mz0 mz0Var = (mz0) obj;
            if (mz0Var.a.equals(str)) {
                return mz0Var;
            }
        }
        return null;
    }

    public final void n() {
        while (true) {
            Long valueOf = Long.valueOf(this.f);
            TreeMap treeMap = this.d;
            fz0 fz0Var = (fz0) treeMap.get(valueOf);
            if (fz0Var == null || fz0Var.h == null) {
                return;
            }
            treeMap.remove(Long.valueOf(this.f));
            this.f += 1000;
            this.a.b(new lz0(fz0Var.a, fz0Var.b, fz0Var.h, fz0Var.i, fz0Var.j));
        }
    }

    public final boolean o(p44 p44Var) {
        if (p44Var != null) {
            return p44Var.c.c >= 0.001d || this.A[this.y ? 1 : 0];
        }
        return false;
    }

    public final void p(fz0 fz0Var) {
        fz0Var.d = null;
        ez0 ez0Var = this.a;
        fz0Var.f = ez0Var.h();
        int i = this.v;
        fz0Var.g = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = fz0Var.e + 1;
        fz0Var.e = i3;
        long j = fz0Var.a;
        iz0 iz0Var = this.F ? new iz0(j, 0, 0) : new iz0(j, 1, fz0Var.b);
        fz0Var.c = new qm0((byte) 11);
        jh i4 = ez0Var.i(iz0Var, new wy0(this, i2, fz0Var, i3, (byte) 0));
        if (fz0Var.e != i3 || fz0Var.c == null) {
            return;
        }
        fz0Var.c = i4;
    }

    public final void q(kz0 kz0Var) {
        kz0Var.f = null;
        ez0 ez0Var = this.a;
        kz0Var.h = ez0Var.h();
        int i = this.v;
        kz0Var.i = i == 0;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = kz0Var.g + 1;
        kz0Var.g = i3;
        kz0Var.e = new qm0((byte) 11);
        jh i4 = ez0Var.i(new iz0(kz0Var.a.a, kz0Var.c, kz0Var.d), new wy0(this, i2, kz0Var, i3, (byte) 1));
        if (kz0Var.g != i3 || kz0Var.e == null) {
            return;
        }
        kz0Var.e = i4;
    }

    public final void r(final fz0 fz0Var, final nz0 nz0Var) {
        nz0Var.e = null;
        ez0 ez0Var = this.a;
        nz0Var.g = ez0Var.h();
        int i = this.v;
        nz0Var.h = i == 0;
        this.v = i + 1;
        final int i2 = this.b;
        final int i3 = nz0Var.f + 1;
        nz0Var.f = i3;
        nz0Var.d = new qm0((byte) 11);
        jh i4 = ez0Var.i(new iz0(fz0Var.a, nz0Var.b, nz0Var.c), new hz0() { // from class: cz0
            @Override // hz0
            public final void b(gz0 gz0Var) {
                pz0 pz0Var = pz0.this;
                pz0Var.a.j(new az0(pz0Var, i2, nz0Var, i3, fz0Var, gz0Var), 0L);
            }
        });
        if (nz0Var.f != i3 || nz0Var.d == null) {
            return;
        }
        nz0Var.d = i4;
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
        jz0 jz0Var = this.L;
        if (jz0Var == null || !this.M) {
            return D;
        }
        return Math.max(0L, (Math.max(1000 - jz0Var.c, 0L) + jz0Var.b) - this.a.h()) + D;
    }

    public final void u() {
        long j;
        if (this.c != 4) {
            d(this.O);
            this.O = null;
            ez0 ez0Var = this.a;
            long h = ez0Var.h();
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
                lz0 lz0Var = (lz0) arrayDeque.pollFirst();
                this.L = new jz0(lz0Var, h, i);
                ez0Var.g(lz0Var.a, i, h);
                j = h;
                this.M = true;
                if (!this.t) {
                    this.t = true;
                    B();
                }
            }
            long j3 = this.L.b;
            if (j3 > j) {
                this.O = ez0Var.j(new yy0(this, (byte) 1), j3 - j);
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
                    lz0 lz0Var2 = (lz0) arrayDeque.pollFirst();
                    this.L = new jz0(lz0Var2, max2, 0);
                    ez0Var.g(lz0Var2.a, 0, max2);
                    this.O = ez0Var.j(new yy0(this, (byte) 2), max2 - j);
                    return;
                }
            }
            if (j < max) {
                this.O = ez0Var.j(new yy0(this, (byte) 3), max - j);
                return;
            }
            this.M = false;
            this.i++;
            ez0Var.d("stall after " + this.L.a + ", buffered to " + this.f);
            u();
        }
    }

    public final void v(fz0 fz0Var, HashMap hashMap) {
        if (hashMap != null) {
            ArrayList arrayList = this.H;
            if (arrayList.isEmpty()) {
                return;
            }
            int[] h = h();
            for (int i = 0; i < arrayList.size(); i++) {
                String str = ((mz0) arrayList.get(i)).a;
                Integer num = (Integer) hashMap.get(str);
                LinkedHashMap linkedHashMap = fz0Var.k;
                nz0 nz0Var = (nz0) linkedHashMap.get(str);
                if (num == null) {
                    if (nz0Var != null) {
                        g(nz0Var);
                        linkedHashMap.remove(str);
                    }
                } else if (nz0Var == null) {
                    nz0 nz0Var2 = new nz0(str, num.intValue(), h[i]);
                    linkedHashMap.put(str, nz0Var2);
                    r(fz0Var, nz0Var2);
                } else if (nz0Var.b != num.intValue()) {
                    g(nz0Var);
                    nz0Var.b = num.intValue();
                    nz0Var.i = null;
                    r(fz0Var, nz0Var);
                }
            }
        }
    }

    public final void w() {
        ez0 ez0Var;
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
                if (!((fz0) it.next()).a()) {
                    i4++;
                }
            }
            if (i4 >= i3) {
                return;
            }
            ez0 ez0Var2 = this.a;
            boolean z = this.F;
            if (!z || this.g >= 0 || this.f < 0) {
                long j4 = this.e;
                if (z) {
                    j2 = this.g;
                    if (j2 >= 0) {
                        ez0Var = ez0Var2;
                        j = 1000;
                    } else {
                        long h = ez0Var2.h();
                        jz0 jz0Var = this.L;
                        if (jz0Var == null || !this.M) {
                            ez0Var = ez0Var2;
                            j = 1000;
                        } else {
                            j = 1000;
                            long j5 = jz0Var.b;
                            if (j5 <= h) {
                                long j6 = jz0Var.a;
                                ez0Var = ez0Var2;
                                long j7 = jz0Var.c;
                                j2 = Math.min(h - j5, 1000 - j7) + j6 + j7;
                            } else {
                                ez0Var = ez0Var2;
                            }
                        }
                        ArrayDeque arrayDeque = this.G;
                        j2 = !arrayDeque.isEmpty() ? ((lz0) arrayDeque.peekFirst()).a : Math.max(this.f, 0L);
                    }
                } else {
                    ez0Var = ez0Var2;
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
                ez0Var = ez0Var2;
                j = 1000;
            }
            if (j3 >= 30000) {
                return;
            }
            long h2 = (ez0Var.h() - this.k) + this.j;
            long j8 = this.e;
            long j9 = j8 + j;
            if (j9 > h2) {
                this.l = ez0Var.j(new yy0(this, (byte) 5), j9 - h2);
                return;
            }
            ez0 ez0Var3 = ez0Var;
            fz0 fz0Var = new fz0(j8);
            treeMap.put(Long.valueOf(fz0Var.a), fz0Var);
            this.e += j;
            if (z) {
                i2 = 0;
            } else {
                p44 p44Var = this.z[this.y ? 1 : 0];
                if (o(p44Var)) {
                    double a = p44Var.a();
                    double b = p44Var.b() / 1000.0d;
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
            fz0Var.b = i2;
            ez0Var3.h();
            p(fz0Var);
            if (z) {
                v(fz0Var, this.I);
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
        this.a.e(new vy0(this, this.b, (byte) 1));
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
        ez0 ez0Var = this.a;
        this.k = ez0Var.h();
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
                    f((kz0) obj);
                }
                arrayList.clear();
                this.h = false;
                this.f = m;
                this.e = m;
            } else {
                this.e = b;
            }
        }
        StringBuilder o = ug8.o(j, "listener resync at server time ", ", fetching from ");
        o.append(this.e);
        ez0Var.d(o.toString());
        w();
    }
}
