package r4;

import h5.d0;
import j3.c1;
import j3.m2;
import j3.n2;
import j3.o2;
import j3.x0;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends o2 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long h;
    public final long n;
    public final s4.c r;
    public final c1 s;
    public final x0 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, s4.c cVar, c1 c1Var, x0 x0Var) {
        h5.a.i(cVar.d == (x0Var != null));
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = i10;
        this.f = j13;
        this.h = j14;
        this.n = j15;
        this.r = cVar;
        this.s = c1Var;
        this.v = x0Var;
    }

    @Override // j3.o2
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // j3.o2
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        h5.a.h(i10, h());
        s4.c cVar = this.r;
        String str = z4 ? cVar.b(i10).a : null;
        Integer valueOf = z4 ? Integer.valueOf(this.e + i10) : null;
        long d = cVar.d(i10);
        long G = d0.G(cVar.b(i10).b - cVar.b(0).b) - this.f;
        m2Var.getClass();
        m2Var.i(str, valueOf, 0, d, G, p4.b.f, false);
        return m2Var;
    }

    @Override // j3.o2
    public final int h() {
        return this.r.m.size();
    }

    @Override // j3.o2
    public final Object l(int i10) {
        h5.a.h(i10, h());
        return Integer.valueOf(this.e + i10);
    }

    @Override // j3.o2
    public final n2 m(int i10, n2 n2Var, long j10) {
        long j11;
        long j12;
        h c3;
        h5.a.h(i10, 1);
        s4.c cVar = this.r;
        boolean z4 = cVar.d;
        long j13 = this.n;
        if (z4 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.h) {
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    n2Var.b(n2.E, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
                    return n2Var;
                }
            }
            long j15 = this.f + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            s4.h b10 = cVar.b(i11);
            List list = b10.c;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j12 = j14;
                    i12 = -1;
                    break;
                }
                j12 = j14;
                if (((s4.a) list.get(i12)).b == 2) {
                    break;
                }
                i12++;
                j14 = j12;
            }
            if (i12 != -1 && (c3 = ((s4.m) ((s4.a) b10.c.get(i12)).c.get(0)).c()) != null && c3.F(d) != j12) {
                j13 = (c3.a(c3.t(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        n2Var.b(n2.E, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
        return n2Var;
    }

    @Override // j3.o2
    public final int o() {
        return 1;
    }
}
