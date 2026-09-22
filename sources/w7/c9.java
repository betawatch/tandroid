package w7;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class c9 {
    public static void a(z3.e eVar, int i10, e2.h hVar) {
        long g10 = eVar.g(i10);
        List l4 = eVar.l(g10);
        if (l4.isEmpty()) {
            return;
        }
        if (i10 == eVar.A() - 1) {
            throw new IllegalStateException();
        }
        long g11 = eVar.g(i10 + 1) - eVar.g(i10);
        if (g11 > 0) {
            hVar.accept(new z3.b(g10, g11, l4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.e eVar, z3.m mVar, e2.h hVar) {
        int d;
        boolean z10;
        int i10;
        long j3 = mVar.a;
        if (j3 == -9223372036854775807L) {
            d = 0;
        } else {
            d = eVar.d(j3);
            if (d == -1) {
                d = eVar.A();
            }
            if (d > 0 && eVar.g(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < eVar.A()) {
            List l4 = eVar.l(j3);
            long g10 = eVar.g(d);
            if (!l4.isEmpty()) {
                long j10 = mVar.a;
                if (j10 < g10) {
                    hVar.accept(new z3.b(j10, g10 - j10, l4));
                    z10 = true;
                    for (i10 = d; i10 < eVar.A(); i10++) {
                        a(eVar, i10, hVar);
                    }
                    if (mVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i11 = 0; i11 < d; i11++) {
                        a(eVar, i11, hVar);
                    }
                    if (z10) {
                        hVar.accept(new z3.b(eVar.g(d), j3 - eVar.g(d), eVar.l(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < eVar.A()) {
        }
        if (mVar.b) {
        }
    }
}
