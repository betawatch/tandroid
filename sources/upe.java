// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class upe {
    public static int a(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    public static int b(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (gr5.a[roundingMode.ordinal()]) {
            case 1:
                cte.b(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                lq5.f();
                return 0;
        }
        return i3 + i5;
    }
}
