package w7;

import java.util.List;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class g9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long m10 = dVar.m(i10);
        List z10 = dVar.z(m10);
        if (z10.isEmpty()) {
            return;
        }
        if (i10 == dVar.G() - 1) {
            throw new IllegalStateException();
        }
        long m11 = dVar.m(i10 + 1) - dVar.m(i10);
        if (m11 > 0) {
            hVar.accept(new z3.a(m10, m11, z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.h hVar) {
        int c10;
        boolean z10;
        int i10;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            c10 = 0;
        } else {
            c10 = dVar.c(j3);
            if (c10 == -1) {
                c10 = dVar.G();
            }
            if (c10 > 0 && dVar.m(c10 - 1) == j3) {
                c10--;
            }
        }
        if (j3 != -9223372036854775807L && c10 < dVar.G()) {
            List z11 = dVar.z(j3);
            long m10 = dVar.m(c10);
            if (!z11.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < m10) {
                    hVar.accept(new z3.a(j10, m10 - j10, z11));
                    z10 = true;
                    for (i10 = c10; i10 < dVar.G(); i10++) {
                        a(dVar, i10, hVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        c10--;
                    }
                    for (int i11 = 0; i11 < c10; i11++) {
                        a(dVar, i11, hVar);
                    }
                    if (z10) {
                        hVar.accept(new z3.a(dVar.m(c10), j3 - dVar.m(c10), dVar.z(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.G()) {
        }
        if (lVar.b) {
        }
    }
}
