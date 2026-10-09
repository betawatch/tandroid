package w7;

import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class c9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long l4 = dVar.l(i10);
        List p5 = dVar.p(l4);
        if (p5.isEmpty()) {
            return;
        }
        if (i10 == dVar.w() - 1) {
            throw new IllegalStateException();
        }
        long l10 = dVar.l(i10 + 1) - dVar.l(i10);
        if (l10 > 0) {
            hVar.accept(new z3.a(l4, l10, p5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.h hVar) {
        int e7;
        boolean z10;
        int i10;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            e7 = 0;
        } else {
            e7 = dVar.e(j3);
            if (e7 == -1) {
                e7 = dVar.w();
            }
            if (e7 > 0 && dVar.l(e7 - 1) == j3) {
                e7--;
            }
        }
        if (j3 != -9223372036854775807L && e7 < dVar.w()) {
            List p5 = dVar.p(j3);
            long l4 = dVar.l(e7);
            if (!p5.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < l4) {
                    hVar.accept(new z3.a(j10, l4 - j10, p5));
                    z10 = true;
                    for (i10 = e7; i10 < dVar.w(); i10++) {
                        a(dVar, i10, hVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        e7--;
                    }
                    for (int i11 = 0; i11 < e7; i11++) {
                        a(dVar, i11, hVar);
                    }
                    if (z10) {
                        hVar.accept(new z3.a(dVar.l(e7), j3 - dVar.l(e7), dVar.p(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.w()) {
        }
        if (lVar.b) {
        }
    }
}
