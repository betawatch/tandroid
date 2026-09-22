package w7;

import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class d9 {
    public static void a(z3.d dVar, int i10, e2.h hVar) {
        long d = dVar.d(i10);
        List f7 = dVar.f(d);
        if (f7.isEmpty()) {
            return;
        }
        if (i10 == dVar.g() - 1) {
            throw new IllegalStateException();
        }
        long d10 = dVar.d(i10 + 1) - dVar.d(i10);
        if (d10 > 0) {
            hVar.accept(new z3.a(d, d10, f7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3.d dVar, z3.l lVar, e2.h hVar) {
        int a2;
        boolean z10;
        int i10;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            a2 = 0;
        } else {
            a2 = dVar.a(j3);
            if (a2 == -1) {
                a2 = dVar.g();
            }
            if (a2 > 0 && dVar.d(a2 - 1) == j3) {
                a2--;
            }
        }
        if (j3 != -9223372036854775807L && a2 < dVar.g()) {
            List f7 = dVar.f(j3);
            long d = dVar.d(a2);
            if (!f7.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < d) {
                    hVar.accept(new z3.a(j10, d - j10, f7));
                    z10 = true;
                    for (i10 = a2; i10 < dVar.g(); i10++) {
                        a(dVar, i10, hVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        a2--;
                    }
                    for (int i11 = 0; i11 < a2; i11++) {
                        a(dVar, i11, hVar);
                    }
                    if (z10) {
                        hVar.accept(new z3.a(dVar.d(a2), j3 - dVar.d(a2), dVar.f(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < dVar.g()) {
        }
        if (lVar.b) {
        }
    }
}
