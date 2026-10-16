package w7;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class a9 {
    public static void a(z3.e eVar, int i10, e2.j jVar) {
        long h = eVar.h(i10);
        List o10 = eVar.o(h);
        if (o10.isEmpty()) {
            return;
        }
        if (i10 == eVar.u() - 1) {
            throw new IllegalStateException();
        }
        long h10 = eVar.h(i10 + 1) - eVar.h(i10);
        if (h10 > 0) {
            jVar.accept(new z3.b(h, h10, o10));
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
                c10 = eVar.u();
            }
            if (c10 > 0 && eVar.h(c10 - 1) == j10) {
                c10--;
            }
        }
        if (j10 != -9223372036854775807L && c10 < eVar.u()) {
            List o10 = eVar.o(j10);
            long h = eVar.h(c10);
            if (!o10.isEmpty()) {
                long j11 = mVar.a;
                if (j11 < h) {
                    jVar.accept(new z3.b(j11, h - j11, o10));
                    z10 = true;
                    for (i10 = c10; i10 < eVar.u(); i10++) {
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
                        jVar.accept(new z3.b(eVar.h(c10), j10 - eVar.h(c10), eVar.o(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < eVar.u()) {
        }
        if (mVar.b) {
        }
    }
}
