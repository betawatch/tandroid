package v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class p8 {
    public static int a(a4.h hVar, int i10, int i11, int i12) {
        e2.d.b(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        o7.a(o7.a(i13, i14), 1 << i12);
        if (hVar.b() < i10) {
            return -1;
        }
        int i15 = hVar.i(i10);
        if (i15 == i13) {
            if (hVar.b() < i11) {
                return -1;
            }
            int i16 = hVar.i(i11);
            i15 += i16;
            if (i16 == i14) {
                if (hVar.b() < i12) {
                    return -1;
                }
                return hVar.i(i12) + i15;
            }
        }
        return i15;
    }

    public static void b(a4.h hVar) {
        hVar.t(3);
        hVar.t(8);
        boolean h = hVar.h();
        boolean h10 = hVar.h();
        if (h) {
            hVar.t(5);
        }
        if (h10) {
            hVar.t(6);
        }
    }

    public static void c(a4.h hVar) {
        int i10;
        int i11 = hVar.i(2);
        if (i11 == 0) {
            hVar.t(6);
            return;
        }
        int a2 = a(hVar, 5, 8, 16) + 1;
        if (i11 == 1) {
            hVar.t(a2 * 7);
            return;
        }
        if (i11 == 2) {
            boolean h = hVar.h();
            int i12 = h ? 1 : 5;
            int i13 = h ? 7 : 5;
            int i14 = h ? 8 : 6;
            int i15 = 0;
            while (i15 < a2) {
                if (hVar.h()) {
                    hVar.t(7);
                    i10 = 0;
                } else {
                    if (hVar.i(2) == 3 && hVar.i(i13) * i12 != 0) {
                        hVar.s();
                    }
                    i10 = hVar.i(i14) * i12;
                    if (i10 != 0 && i10 != 180) {
                        hVar.s();
                    }
                    hVar.s();
                }
                if (i10 != 0 && i10 != 180 && hVar.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }
}
