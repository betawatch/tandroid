package w7;

import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m9 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long g10 = dVar.g(i10);
        List p5 = dVar.p(g10);
        if (p5.isEmpty()) {
            return;
        }
        if (i10 == dVar.s() - 1) {
            throw new IllegalStateException();
        }
        long g11 = dVar.g(i10 + 1) - dVar.g(i10);
        if (g11 > 0) {
            jVar.accept(new z3.a(g10, g11, p5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.j jVar) {
        int a2;
        boolean z10;
        int i10;
        long j10 = lVar.a;
        if (j10 == -9223372036854775807L) {
            a2 = 0;
        } else {
            a2 = dVar.a(j10);
            if (a2 == -1) {
                a2 = dVar.s();
            }
            if (a2 > 0 && dVar.g(a2 - 1) == j10) {
                a2--;
            }
        }
        if (j10 != -9223372036854775807L && a2 < dVar.s()) {
            List p5 = dVar.p(j10);
            long g10 = dVar.g(a2);
            if (!p5.isEmpty()) {
                long j11 = lVar.a;
                if (j11 < g10) {
                    jVar.accept(new z3.a(j11, g10 - j11, p5));
                    z10 = true;
                    for (i10 = a2; i10 < dVar.s(); i10++) {
                        a(dVar, i10, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        a2--;
                    }
                    for (int i11 = 0; i11 < a2; i11++) {
                        a(dVar, i11, jVar);
                    }
                    if (z10) {
                        jVar.accept(new z3.a(dVar.g(a2), j10 - dVar.g(a2), dVar.p(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.s()) {
        }
        if (lVar.b) {
        }
    }
}
