// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class w8d {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(qj0 qj0Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    qj0Var.c(i5, i4);
                    qj0Var.c(i5, i6);
                    qj0Var.c(i4, i5);
                    qj0Var.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        qj0Var.c(i7, i7);
        int i8 = i7 + 1;
        qj0Var.c(i8, i7);
        qj0Var.c(i7, i8);
        int i9 = i + i2;
        qj0Var.c(i9, i7);
        qj0Var.c(i9, i8);
        qj0Var.c(i9, i9 - 1);
    }

    public static pj0 b(pj0 pj0Var, int i, int i2) {
        hs4 hs4Var;
        int i3 = pj0Var.b / i2;
        if (i2 == 4) {
            hs4Var = hs4.k;
        } else if (i2 == 6) {
            hs4Var = hs4.j;
        } else if (i2 == 8) {
            hs4Var = hs4.m;
        } else if (i2 == 10) {
            hs4Var = hs4.i;
        } else {
            if (i2 != 12) {
                w26.j(de9.k(i2, "Unsupported word size "));
                return null;
            }
            hs4Var = hs4.h;
        }
        wk4 wk4Var = new wk4(hs4Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = pj0Var.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= pj0Var.d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        wk4Var.V(iArr, i4 - i3);
        pj0 pj0Var2 = new pj0();
        pj0Var2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            pj0Var2.b(iArr[i9], i2);
        }
        return pj0Var2;
    }

    public static pj0 c(pj0 pj0Var, int i) {
        pj0 pj0Var2 = new pj0();
        int i2 = pj0Var.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || pj0Var.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                pj0Var2.b(i8, i);
            } else if (i8 == 0) {
                pj0Var2.b(i5 | 1, i);
            } else {
                pj0Var2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return pj0Var2;
    }
}
