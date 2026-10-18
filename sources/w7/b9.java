package w7;

import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class b9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long d = dVar.d(i10);
        List e = dVar.e(d);
        if (e.isEmpty()) {
            return;
        }
        if (i10 == dVar.i() - 1) {
            throw new IllegalStateException();
        }
        long d10 = dVar.d(i10 + 1) - dVar.d(i10);
        if (d10 > 0) {
            jVar.accept(new z3.a(d, d10, e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.j jVar) {
        int c10;
        boolean z10;
        int i10;
        long j10 = lVar.a;
        if (j10 == -9223372036854775807L) {
            c10 = 0;
        } else {
            c10 = dVar.c(j10);
            if (c10 == -1) {
                c10 = dVar.i();
            }
            if (c10 > 0 && dVar.d(c10 - 1) == j10) {
                c10--;
            }
        }
        if (j10 != -9223372036854775807L && c10 < dVar.i()) {
            List e = dVar.e(j10);
            long d = dVar.d(c10);
            if (!e.isEmpty()) {
                long j11 = lVar.a;
                if (j11 < d) {
                    jVar.accept(new z3.a(j11, d - j11, e));
                    z10 = true;
                    for (i10 = c10; i10 < dVar.i(); i10++) {
                        a(dVar, i10, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        c10--;
                    }
                    for (int i11 = 0; i11 < c10; i11++) {
                        a(dVar, i11, jVar);
                    }
                    if (z10) {
                        jVar.accept(new z3.a(dVar.d(c10), j10 - dVar.d(c10), dVar.e(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.i()) {
        }
        if (lVar.b) {
        }
    }
}
