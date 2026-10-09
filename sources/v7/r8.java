package v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class r8 {
    public static int a(a4.g gVar, int i10, int i11, int i12) {
        e2.d.b(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        m7.a(m7.a(i13, i14), 1 << i12);
        if (gVar.b() < i10) {
            return -1;
        }
        int i15 = gVar.i(i10);
        if (i15 == i13) {
            if (gVar.b() < i11) {
                return -1;
            }
            int i16 = gVar.i(i11);
            i15 += i16;
            if (i16 == i14) {
                if (gVar.b() < i12) {
                    return -1;
                }
                return gVar.i(i12) + i15;
            }
        }
        return i15;
    }

    public static void b(a4.g gVar) {
        gVar.t(3);
        gVar.t(8);
        boolean h = gVar.h();
        boolean h10 = gVar.h();
        if (h) {
            gVar.t(5);
        }
        if (h10) {
            gVar.t(6);
        }
    }

    public static void c(a4.g gVar) {
        int i10;
        int i11 = gVar.i(2);
        if (i11 == 0) {
            gVar.t(6);
            return;
        }
        int a2 = a(gVar, 5, 8, 16) + 1;
        if (i11 == 1) {
            gVar.t(a2 * 7);
            return;
        }
        if (i11 == 2) {
            boolean h = gVar.h();
            int i12 = h ? 1 : 5;
            int i13 = h ? 7 : 5;
            int i14 = h ? 8 : 6;
            int i15 = 0;
            while (i15 < a2) {
                if (gVar.h()) {
                    gVar.t(7);
                    i10 = 0;
                } else {
                    if (gVar.i(2) == 3 && gVar.i(i13) * i12 != 0) {
                        gVar.s();
                    }
                    i10 = gVar.i(i14) * i12;
                    if (i10 != 0 && i10 != 180) {
                        gVar.s();
                    }
                    gVar.s();
                }
                if (i10 != 0 && i10 != 180 && gVar.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }
}
