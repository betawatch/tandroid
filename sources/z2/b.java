package z2;

import android.os.SystemClock;
import d2.o1;
import d2.v;
import g2.h0;
import g2.n0;
import g9.f0;
import g9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends c {
    public final a3.d g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final i0 o;
    public final h0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public x2.l u;

    public b(o1 o1Var, int[] iArr, a3.d dVar, long j10, long j11, long j12, i0 i0Var) {
        super(o1Var, iArr);
        if (j12 < j10) {
            g2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.g = dVar;
        this.h = j10 * 1000;
        this.i = j11 * 1000;
        this.j = j12 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = i0.q(i0Var);
        this.p = h0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f0 f0Var = (f0) arrayList.get(i3);
            if (f0Var != null) {
                f0Var.c(new a(j10, jArr[i3]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            x2.l lVar = (x2.l) g9.o.n(list);
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

    @Override // z2.p
    public final int c() {
        return this.r;
    }

    @Override // z2.p
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        long x10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.r;
        if (i3 >= mVarArr.length || !mVarArr[i3].next()) {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    x10 = x(list);
                    break;
                }
                x2.m mVar = mVarArr[i10];
                if (mVar.next()) {
                    x10 = mVar.D() - mVar.t();
                    break;
                }
                i10++;
            }
        } else {
            x2.m mVar2 = mVarArr[this.r];
            x10 = mVar2.D() - mVar2.t();
        }
        int i11 = this.s;
        if (i11 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.r;
        int e10 = list.isEmpty() ? -1 : e(((x2.l) g9.o.n(list)).d);
        if (e10 != -1) {
            i11 = ((x2.l) g9.o.n(list)).e;
            i12 = e10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            v[] vVarArr = this.d;
            v vVar = vVarArr[i12];
            v vVar2 = vVarArr[w10];
            long j13 = this.h;
            if (j12 != -9223372036854775807L) {
                j13 = Math.min((long) ((x10 != -9223372036854775807L ? j12 - x10 : j12) * this.n), j13);
            }
            int i13 = vVar2.j;
            int i14 = vVar.j;
            if ((i13 > i14 && j11 < j13) || (i13 < i14 && j11 >= this.i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.s = i11;
        this.r = w10;
    }

    @Override // z2.c, z2.p
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // z2.c, z2.p
    public final int j(long j10, List list) {
        int i3;
        int i10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((x2.l) g9.o.n(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (x2.l) g9.o.n(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = n0.F(((x2.l) list.get(size - 1)).h - j10, this.q);
        long j12 = this.j;
        if (F >= j12) {
            x(list);
            v vVar = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                x2.l lVar = (x2.l) list.get(i11);
                v vVar2 = lVar.d;
                if (n0.F(lVar.h - j10, this.q) >= j12 && vVar2.j < vVar.j && (i3 = vVar2.A) != -1 && i3 <= this.l && (i10 = vVar2.z) != -1 && i10 <= this.k && i3 < vVar.A) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // z2.c, z2.p
    public final void k() {
        this.u = null;
    }

    @Override // z2.p
    public final int o() {
        return this.s;
    }

    @Override // z2.c, z2.p
    public final void q(float f10) {
        this.q = f10;
    }

    @Override // z2.p
    public final Object r() {
        return null;
    }

    public final int w(int i3, long j10) {
        v[] vVarArr;
        a3.d dVar = this.g;
        long a10 = (long) (((a3.g) dVar).a() * this.m);
        dVar.getClass();
        long j11 = (long) (a10 / this.q);
        i0 i0Var = this.o;
        if (!i0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < i0Var.size() - 1 && ((a) i0Var.get(i10)).a < j11) {
                i10++;
            }
            a aVar = (a) i0Var.get(i10 - 1);
            a aVar2 = (a) i0Var.get(i10);
            long j12 = aVar.a;
            long j13 = aVar.b;
            j11 = ((long) (((j11 - j12) / (aVar2.a - j12)) * (aVar2.b - j13))) + j13;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.b;
            vVarArr = this.d;
            if (i12 >= i13) {
                break;
            }
            if (j10 == Long.MIN_VALUE || !a(i12, j10)) {
                v vVar = vVarArr[i12];
                int max = Math.max(vVar.z, vVar.A);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    v vVar2 = vVarArr[num.intValue()];
                    boolean z10 = vVar2.n;
                    if ((!z10 || vVar.n) && ((!z10 && vVar.n) || vVar.j < vVar2.j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            i12++;
        }
        if (i3 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (vVarArr[intValue].n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i11 = ((Integer) obj2).intValue();
            v vVar3 = vVarArr[i11];
            int i16 = vVar3.j;
            if (vVar3.n || i16 <= j11) {
                break;
            }
        }
        return i11;
    }
}
