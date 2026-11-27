// default package

import android.graphics.Color;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class vm2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m(i), m(round), m(round2));
    }

    public static int b(double d, double d2, double d3) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        double d7 = pow * 95.047d;
        dArr[0] = d7;
        double d8 = pow2 * 100.0d;
        dArr[1] = d8;
        double d9 = pow3 * 108.883d;
        dArr[2] = d9;
        return e(d7, d8, d9);
    }

    public static void c(int i, int i2, int i3, float[] fArr) {
        float z;
        float abs;
        float f = i / 255.0f;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        if (max == min) {
            z = 0.0f;
            abs = 0.0f;
        } else {
            z = max == f ? ((f2 - f3) / f4) % 6.0f : max == f2 ? bp1.z(f3, f, f4, 2.0f) : bp1.z(f, f2, f4, 4.0f);
            abs = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        float f6 = (z * 60.0f) % 360.0f;
        if (f6 < 0.0f) {
            f6 += 360.0f;
        }
        fArr[0] = f6 < 0.0f ? 0.0f : Math.min(f6, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f5 >= 0.0f ? Math.min(f5, 1.0f) : 0.0f;
    }

    public static void d(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            lq5.j("outXyz must have a length of 3.");
            return;
        }
        double d = i / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    public static int e(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int f(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static double g(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            c22.b(Integer.toHexString(i2), "background can not be translucent: #");
            return 0.0d;
        }
        if (Color.alpha(i) < 255) {
            i = k(i, i2);
        }
        double h = h(i) + 0.05d;
        double h2 = h(i2) + 0.05d;
        return Math.max(h, h2) / Math.min(h, h2);
    }

    public static double h(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        d(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    public static int i(float f, int i, int i2) {
        int alpha = Color.alpha(i2);
        int i3 = jn7.d4;
        if (alpha != 255) {
            c22.b(Integer.toHexString(i2), "background can not be translucent: #");
            return 0;
        }
        double d = f;
        if (g(o(i, jn7.d4), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (g(o(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void j(int i, double[] dArr) {
        d(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        if (dArr.length != 3) {
            lq5.j("outLab must have a length of 3.");
            return;
        }
        double n = n(d / 95.047d);
        double n2 = n(d2 / 100.0d);
        double n3 = n(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * n2) - 16.0d);
        dArr[1] = (n - n2) * 500.0d;
        dArr[2] = (n2 - n3) * 200.0d;
    }

    public static int k(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / jn7.d4);
        return Color.argb(i3, l(Color.red(i), alpha2, Color.red(i2), alpha, i3), l(Color.green(i), alpha2, Color.green(i2), alpha, i3), l(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return bp1.h(jn7.d4, i2, i3 * i4, (i * jn7.d4) * i2) / (i5 * jn7.d4);
    }

    public static int m(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, jn7.d4);
    }

    public static double n(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        lq5.j("alpha must be between 0 and 255.");
        return 0;
    }
}
