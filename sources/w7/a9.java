package w7;

import java.util.List;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class a9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long k10 = dVar.k(i10);
        List s10 = dVar.s(k10);
        if (s10.isEmpty()) {
            return;
        }
        if (i10 == dVar.u() - 1) {
            throw new IllegalStateException();
        }
        long k11 = dVar.k(i10 + 1) - dVar.k(i10);
        if (k11 > 0) {
            jVar.accept(new z3.a(k10, k11, s10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.j jVar) {
        int d;
        boolean z10;
        int i10;
        long j10 = lVar.a;
        if (j10 == -9223372036854775807L) {
            d = 0;
        } else {
            d = dVar.d(j10);
            if (d == -1) {
                d = dVar.u();
            }
            if (d > 0 && dVar.k(d - 1) == j10) {
                d--;
            }
        }
        if (j10 != -9223372036854775807L && d < dVar.u()) {
            List s10 = dVar.s(j10);
            long k10 = dVar.k(d);
            if (!s10.isEmpty()) {
                long j11 = lVar.a;
                if (j11 < k10) {
                    jVar.accept(new z3.a(j11, k10 - j11, s10));
                    z10 = true;
                    for (i10 = d; i10 < dVar.u(); i10++) {
                        a(dVar, i10, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i11 = 0; i11 < d; i11++) {
                        a(dVar, i11, jVar);
                    }
                    if (z10) {
                        jVar.accept(new z3.a(dVar.k(d), j10 - dVar.k(d), dVar.s(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.u()) {
        }
        if (lVar.b) {
        }
    }
}
