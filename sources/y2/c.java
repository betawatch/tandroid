package y2;

import b8.zb;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.n;
import g9.n1;
import g9.s1;
import g9.x;
import java.util.ArrayList;
import u9.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements a {
    public static final x b = new x(new n(new j(25), n1.b), new n(new j(26), n1.c));
    public final ArrayList a = new ArrayList();

    @Override // y2.a
    public final long a(long j10) {
        int i3 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i3 >= arrayList.size()) {
                break;
            }
            long j12 = ((b4.a) arrayList.get(i3)).b;
            long j13 = ((b4.a) arrayList.get(i3)).d;
            if (j10 < j12) {
                j11 = j11 == -9223372036854775807L ? j12 : Math.min(j11, j12);
            } else {
                if (j10 < j13) {
                    j11 = j11 == -9223372036854775807L ? j13 : Math.min(j11, j13);
                }
                i3++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    @Override // y2.a
    public final boolean b(b4.a aVar, long j10) {
        long j11 = aVar.b;
        zb.f(j11 != -9223372036854775807L);
        zb.f(aVar.c != -9223372036854775807L);
        boolean z10 = j11 <= j10 && j10 < aVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((b4.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // y2.a
    public final i0 c(long j10) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((b4.a) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    b4.a aVar = (b4.a) arrayList.get(i3);
                    if (j10 >= aVar.b && j10 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.b) {
                        break;
                    }
                }
                s1 w10 = i0.w(b, arrayList2);
                f0 p10 = i0.p();
                for (int i10 = 0; i10 < w10.d; i10++) {
                    p10.d(((b4.a) w10.get(i10)).a);
                }
                return p10.f();
            }
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // y2.a
    public final void clear() {
        this.a.clear();
    }

    @Override // y2.a
    public final long d(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((b4.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j11 = ((b4.a) arrayList.get(0)).b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long j12 = ((b4.a) arrayList.get(i3)).b;
            long j13 = ((b4.a) arrayList.get(i3)).d;
            if (j13 > j10) {
                if (j12 > j10) {
                    break;
                }
                j11 = Math.max(j11, j12);
            } else {
                j11 = Math.max(j11, j13);
            }
        }
        return j11;
    }

    @Override // y2.a
    public final void e(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i3 >= arrayList.size()) {
                return;
            }
            long j11 = ((b4.a) arrayList.get(i3)).b;
            if (j10 > j11 && j10 > ((b4.a) arrayList.get(i3)).d) {
                arrayList.remove(i3);
                i3--;
            } else if (j10 < j11) {
                return;
            }
            i3++;
        }
    }
}
