package x2;

import android.os.SystemClock;
import b2.p1;
import b2.x;
import e2.g0;
import e2.l0;
import e9.k0;
import e9.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends c {
    public final y2.c g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final n0 o;
    public final g0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public v2.l u;

    public b(p1 p1Var, int[] iArr, y2.c cVar, long j10, long j11, long j12, n0 n0Var) {
        super(p1Var, iArr);
        if (j12 < j10) {
            e2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.g = cVar;
        this.h = j10 * 1000;
        this.i = j11 * 1000;
        this.j = j12 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = n0.u(n0Var);
        this.p = g0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k0 k0Var = (k0) arrayList.get(i10);
            if (k0Var != null) {
                k0Var.c(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            v2.l lVar = (v2.l) e9.s.m(list);
            long j10 = lVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = lVar.n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // x2.q
    public final int c() {
        return this.r;
    }

    @Override // x2.c, x2.q
    public final void g() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // x2.c, x2.q
    public final int i(long j10, List list) {
        int i10;
        int i11;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((v2.l) e9.s.m(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (v2.l) e9.s.m(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = l0.F(((v2.l) list.get(size - 1)).h - j10, this.q);
        long j12 = this.j;
        if (F >= j12) {
            x(list);
            x xVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.l lVar = (v2.l) list.get(i12);
                x xVar2 = lVar.d;
                if (l0.F(lVar.h - j10, this.q) >= j12 && xVar2.j < xVar.j && (i10 = xVar2.A) != -1 && i10 <= this.l && (i11 = xVar2.z) != -1 && i11 <= this.k && i10 < xVar.A) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // x2.c, x2.q
    public final void j() {
        this.u = null;
    }

    @Override // x2.q
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        long x10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.r;
        if (i10 >= mVarArr.length || !mVarArr[i10].next()) {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    x10 = x(list);
                    break;
                }
                v2.m mVar = mVarArr[i11];
                if (mVar.next()) {
                    x10 = mVar.C() - mVar.k();
                    break;
                }
                i11++;
            }
        } else {
            v2.m mVar2 = mVarArr[this.r];
            x10 = mVar2.C() - mVar2.k();
        }
        int i12 = this.s;
        if (i12 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.r;
        int s10 = list.isEmpty() ? -1 : s(((v2.l) e9.s.m(list)).d);
        if (s10 != -1) {
            i12 = ((v2.l) e9.s.m(list)).e;
            i13 = s10;
        }
        int w9 = w(1, elapsedRealtime);
        if (w9 != i13 && !a(i13, elapsedRealtime)) {
            x[] xVarArr = this.d;
            x xVar = xVarArr[i13];
            x xVar2 = xVarArr[w9];
            long j13 = this.h;
            if (j12 != -9223372036854775807L) {
                j13 = Math.min((long) ((x10 != -9223372036854775807L ? j12 - x10 : j12) * this.n), j13);
            }
            int i14 = xVar2.j;
            int i15 = xVar.j;
            if ((i14 > i15 && j11 < j13) || (i14 < i15 && j11 >= this.i)) {
                w9 = i13;
            }
        }
        if (w9 != i13) {
            i12 = 3;
        }
        this.s = i12;
        this.r = w9;
    }

    @Override // x2.q
    public final int n() {
        return this.s;
    }

    @Override // x2.c, x2.q
    public final void p(float f7) {
        this.q = f7;
    }

    @Override // x2.q
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j10) {
        x[] xVarArr;
        y2.c cVar = this.g;
        long a2 = (long) (((y2.f) cVar).a() * this.m);
        cVar.getClass();
        long j11 = (long) (a2 / this.q);
        n0 n0Var = this.o;
        if (!n0Var.isEmpty()) {
            int i11 = 1;
            while (i11 < n0Var.size() - 1 && ((a) n0Var.get(i11)).a < j11) {
                i11++;
            }
            a aVar = (a) n0Var.get(i11 - 1);
            a aVar2 = (a) n0Var.get(i11);
            long j12 = aVar.a;
            long j13 = aVar.b;
            j11 = ((long) (((j11 - j12) / (aVar2.a - j12)) * (aVar2.b - j13))) + j13;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.b;
            xVarArr = this.d;
            if (i13 >= i14) {
                break;
            }
            if (j10 == Long.MIN_VALUE || !a(i13, j10)) {
                x xVar = xVarArr[i13];
                int max = Math.max(xVar.z, xVar.A);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    x xVar2 = xVarArr[num.intValue()];
                    boolean z10 = xVar2.n;
                    if ((!z10 || xVar.n) && ((!z10 && xVar.n) || xVar.j < xVar2.j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                }
            }
            i13++;
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                int intValue = ((Integer) obj).intValue();
                if (xVarArr[intValue].n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList.get(i16);
            i16++;
            i12 = ((Integer) obj2).intValue();
            x xVar3 = xVarArr[i12];
            int i17 = xVar3.j;
            if (xVar3.n || i17 <= j11) {
                break;
            }
        }
        return i12;
    }
}
