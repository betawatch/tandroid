package w7;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m5 {
    public static void a(z3.d dVar, int i10, e2.j jVar) {
        long e = dVar.e(i10);
        List g7 = dVar.g(e);
        if (g7.isEmpty()) {
            return;
        }
        if (i10 == dVar.k() - 1) {
            throw new IllegalStateException();
        }
        long e10 = dVar.e(i10 + 1) - dVar.e(i10);
        if (e10 > 0) {
            jVar.accept(new z3.a(e, e10, g7));
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
                c10 = dVar.k();
            }
            if (c10 > 0 && dVar.e(c10 - 1) == j10) {
                c10--;
            }
        }
        if (j10 != -9223372036854775807L && c10 < dVar.k()) {
            List g7 = dVar.g(j10);
            long e = dVar.e(c10);
            if (!g7.isEmpty()) {
                long j11 = lVar.a;
                if (j11 < e) {
                    jVar.accept(new z3.a(j11, e - j11, g7));
                    z10 = true;
                    for (i10 = c10; i10 < dVar.k(); i10++) {
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
                        jVar.accept(new z3.a(dVar.e(c10), j10 - dVar.e(c10), dVar.g(j10)));
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
