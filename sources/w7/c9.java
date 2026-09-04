package w7;

import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long e7 = dVar.e(i10);
        List h = dVar.h(e7);
        if (h.isEmpty()) {
            return;
        }
        if (i10 == dVar.k() - 1) {
            throw new IllegalStateException();
        }
        long e10 = dVar.e(i10 + 1) - dVar.e(i10);
        if (e10 > 0) {
            hVar.accept(new z3.a(e7, e10, h));
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
                d = dVar.k();
            }
            if (d > 0 && dVar.e(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.k()) {
            List h = dVar.h(j3);
            long e7 = dVar.e(d);
            if (!h.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < e7) {
                    hVar.accept(new z3.a(j10, e7 - j10, h));
                    z10 = true;
                    for (i10 = d; i10 < dVar.k(); i10++) {
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
                        hVar.accept(new z3.a(dVar.e(d), j3 - dVar.e(d), dVar.h(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.k()) {
        }
        if (lVar.b) {
        }
    }
}
