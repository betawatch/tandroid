package w7;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long g10 = dVar.g(i10);
        List q6 = dVar.q(g10);
        if (q6.isEmpty()) {
            return;
        }
        if (i10 == dVar.u() - 1) {
            throw new IllegalStateException();
        }
        long g11 = dVar.g(i10 + 1) - dVar.g(i10);
        if (g11 > 0) {
            hVar.accept(new z3.a(g10, g11, q6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.h hVar) {
        int d;
        boolean z10;
        int i10;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            d = 0;
        } else {
            d = dVar.d(j3);
            if (d == -1) {
                d = dVar.u();
            }
            if (d > 0 && dVar.g(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.u()) {
            List q6 = dVar.q(j3);
            long g10 = dVar.g(d);
            if (!q6.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < g10) {
                    hVar.accept(new z3.a(j10, g10 - j10, q6));
                    z10 = true;
                    for (i10 = d; i10 < dVar.u(); i10++) {
                        a(dVar, i10, hVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i11 = 0; i11 < d; i11++) {
                        a(dVar, i11, hVar);
                    }
                    if (z10) {
                        hVar.accept(new z3.a(dVar.g(d), j3 - dVar.g(d), dVar.q(j3)));
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
