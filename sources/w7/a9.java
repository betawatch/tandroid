package w7;

import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class a9 {
    public static void a(z3.e eVar, int i10, e2.j jVar) {
        long d = eVar.d(i10);
        List f7 = eVar.f(d);
        if (f7.isEmpty()) {
            return;
        }
        if (i10 == eVar.j() - 1) {
            throw new IllegalStateException();
        }
        long d10 = eVar.d(i10 + 1) - eVar.d(i10);
        if (d10 > 0) {
            jVar.accept(new z3.b(d, d10, f7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.e eVar, z3.m mVar, e2.j jVar) {
        int c10;
        boolean z10;
        int i10;
        long j10 = mVar.a;
        if (j10 == -9223372036854775807L) {
            c10 = 0;
        } else {
            c10 = eVar.c(j10);
            if (c10 == -1) {
                c10 = eVar.j();
            }
            if (c10 > 0 && eVar.d(c10 - 1) == j10) {
                c10--;
            }
        }
        if (j10 != -9223372036854775807L && c10 < eVar.j()) {
            List f7 = eVar.f(j10);
            long d = eVar.d(c10);
            if (!f7.isEmpty()) {
                long j11 = mVar.a;
                if (j11 < d) {
                    jVar.accept(new z3.b(j11, d - j11, f7));
                    z10 = true;
                    for (i10 = c10; i10 < eVar.j(); i10++) {
                        a(eVar, i10, jVar);
                    }
                    if (mVar.b) {
                        return;
                    }
                    if (z10) {
                        c10--;
                    }
                    for (int i11 = 0; i11 < c10; i11++) {
                        a(eVar, i11, jVar);
                    }
                    if (z10) {
                        jVar.accept(new z3.b(eVar.d(c10), j10 - eVar.d(c10), eVar.f(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < eVar.j()) {
        }
        if (mVar.b) {
        }
    }
}
