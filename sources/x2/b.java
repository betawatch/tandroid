package x2;

import android.os.SystemClock;
import b2.l1;
import e2.d0;
import e2.x;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final i0 o;
    public final x p;
    public float q;
    public int r;
    public int s;
    public long t;
    public v2.k u;

    public b(l1 l1Var, int[] iArr, y2.c cVar, long j3, long j10, long j11, i0 i0Var) {
        super(l1Var, iArr);
        if (j11 < j3) {
            e2.a.n("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.g = cVar;
        this.h = j3 * 1000;
        this.i = j10 * 1000;
        this.j = j11 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = i0.v(i0Var);
        this.p = x.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f0 f0Var = (f0) arrayList.get(i10);
            if (f0Var != null) {
                f0Var.b(new a(j3, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            v2.k kVar = (v2.k) e9.q.l(list);
            long j3 = kVar.h;
            if (j3 != -9223372036854775807L) {
                long j10 = kVar.n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // x2.r
    public final int c() {
        return this.r;
    }

    @Override // x2.c, x2.r
    public final void g() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // x2.c, x2.r
    public final int i(long j3, List list) {
        int i10;
        int i11;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((v2.k) e9.q.l(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (v2.k) e9.q.l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D = d0.D(((v2.k) list.get(size - 1)).h - j3, this.q);
        long j11 = this.j;
        if (D >= j11) {
            x(list);
            b2.s sVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.k kVar = (v2.k) list.get(i12);
                b2.s sVar2 = kVar.d;
                if (d0.D(kVar.h - j3, this.q) >= j11 && sVar2.j < sVar.j && (i10 = sVar2.z) != -1 && i10 <= this.l && (i11 = sVar2.y) != -1 && i11 <= this.k && i10 < sVar.z) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // x2.c, x2.r
    public final void j() {
        this.u = null;
    }

    @Override // x2.r
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long x10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.r;
        if (i10 >= lVarArr.length || !lVarArr[i10].next()) {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    x10 = x(list);
                    break;
                }
                v2.l lVar = lVarArr[i11];
                if (lVar.next()) {
                    x10 = lVar.d() - lVar.a();
                    break;
                }
                i11++;
            }
        } else {
            v2.l lVar2 = lVarArr[this.r];
            x10 = lVar2.d() - lVar2.a();
        }
        int i12 = this.s;
        if (i12 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.r;
        int s10 = list.isEmpty() ? -1 : s(((v2.k) e9.q.l(list)).d);
        if (s10 != -1) {
            i12 = ((v2.k) e9.q.l(list)).e;
            i13 = s10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i13 && !a(i13, elapsedRealtime)) {
            b2.s[] sVarArr = this.d;
            b2.s sVar = sVarArr[i13];
            b2.s sVar2 = sVarArr[w10];
            long j12 = this.h;
            if (j11 != -9223372036854775807L) {
                j12 = Math.min((long) ((x10 != -9223372036854775807L ? j11 - x10 : j11) * this.n), j12);
            }
            int i14 = sVar2.j;
            int i15 = sVar.j;
            if ((i14 > i15 && j10 < j12) || (i14 < i15 && j10 >= this.i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.s = i12;
        this.r = w10;
    }

    @Override // x2.r
    public final int n() {
        return this.s;
    }

    @Override // x2.c, x2.r
    public final void p(float f7) {
        this.q = f7;
    }

    @Override // x2.r
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j3) {
        long j10;
        y2.f fVar = (y2.f) this.g;
        synchronized (fVar) {
            j10 = fVar.l;
        }
        long j11 = (long) (j10 * this.m);
        this.g.getClass();
        long j12 = (long) (j11 / this.q);
        if (!this.o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.o.size() - 1 && ((a) this.o.get(i11)).a < j12) {
                i11++;
            }
            a aVar = (a) this.o.get(i11 - 1);
            a aVar2 = (a) this.o.get(i11);
            long j13 = aVar.a;
            long j14 = aVar.b;
            j12 = j14 + ((long) (((j12 - j13) / (aVar2.a - j13)) * (aVar2.b - j14)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.b; i13++) {
            if (j3 == Long.MIN_VALUE || !a(i13, j3)) {
                b2.s sVar = this.d[i13];
                int max = Math.max(sVar.y, sVar.z);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    b2.s sVar2 = this.d[num.intValue()];
                    boolean z10 = sVar2.m;
                    if ((!z10 || sVar.m) && ((!z10 && sVar.m) || sVar.j < sVar2.j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                }
            }
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].m) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i12 = ((Integer) obj2).intValue();
            b2.s sVar3 = this.d[i12];
            int i16 = sVar3.j;
            if (sVar3.m || i16 <= j12) {
                break;
            }
        }
        return i12;
    }
}
