// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class pdd {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(rj0 rj0Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    rj0Var.c(i5, i4);
                    rj0Var.c(i5, i6);
                    rj0Var.c(i4, i5);
                    rj0Var.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        rj0Var.c(i7, i7);
        int i8 = i7 + 1;
        rj0Var.c(i8, i7);
        rj0Var.c(i7, i8);
        int i9 = i + i2;
        rj0Var.c(i9, i7);
        rj0Var.c(i9, i8);
        rj0Var.c(i9, i9 - 1);
    }

    public static qj0 b(qj0 qj0Var, int i, int i2) {
        lu4 lu4Var;
        int i3 = qj0Var.b / i2;
        if (i2 == 4) {
            lu4Var = lu4.k;
        } else if (i2 == 6) {
            lu4Var = lu4.j;
        } else if (i2 == 8) {
            lu4Var = lu4.m;
        } else if (i2 == 10) {
            lu4Var = lu4.i;
        } else {
            if (i2 != 12) {
                lq5.j(uh9.k(i2, "Unsupported word size "));
                return null;
            }
            lu4Var = lu4.h;
        }
        um4 um4Var = new um4(lu4Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = qj0Var.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= qj0Var.d((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        um4Var.P(iArr, i4 - i3);
        qj0 qj0Var2 = new qj0();
        qj0Var2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            qj0Var2.b(iArr[i9], i2);
        }
        return qj0Var2;
    }

    public static qj0 c(qj0 qj0Var, int i) {
        qj0 qj0Var2 = new qj0();
        int i2 = qj0Var.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || qj0Var.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                qj0Var2.b(i8, i);
            } else if (i8 == 0) {
                qj0Var2.b(i5 | 1, i);
            } else {
                qj0Var2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return qj0Var2;
    }
}
