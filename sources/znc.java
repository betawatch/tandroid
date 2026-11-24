// default package

import android.graphics.Color;
import android.util.LruCache;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class znc {
    public static final LruCache a = new LruCache(128);
    public static final float[] b = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] c = {0.0f, 0.47809f, 1.0f};
    public static final LruCache d = new LruCache(64);
    public static final int e;

    static {
        float[] j = j(-16748084);
        float f = j[0] * 0.876903f;
        float f2 = j[2];
        float e2 = e(f, f2);
        float f3 = f2;
        for (int i = -15; i <= 15; i++) {
            float radians = ((float) Math.toRadians(i)) + f2;
            float e3 = e(f, radians);
            if (e3 > 0.002f + e2) {
                f3 = radians;
                e2 = e3;
            }
        }
        float A = tb4.A(f3, f2, 0.723f, f2);
        e = l(f, e(f, A), A);
    }

    public static int a(int i, float[] fArr) {
        int i2 = i == -16216082 ? -14456619 : -14184457;
        if (fArr == null || fArr.length < 18) {
            return i2;
        }
        float f = fArr[10];
        int o = f < 0.0f ? i2 : o(i, (int) f, (int) fArr[11]);
        float f2 = fArr[14];
        if (f2 >= 0.0f) {
            i2 = o(i, (int) f2, (int) fArr[15]);
        }
        return bm2.f(fArr[8], o, i2);
    }

    public static int b(int i, float[] fArr) {
        int i2 = i << 2;
        int i3 = i2 + 10;
        int i4 = e;
        if (fArr != null && fArr.length >= 18) {
            float f = fArr[i3];
            float f2 = 0.0f;
            if (f >= 0.0f) {
                int n = n(-16216082, (int) f, (int) fArr[i2 + 11]);
                Integer valueOf = Integer.valueOf(n);
                LruCache lruCache = d;
                Integer num = (Integer) lruCache.get(valueOf);
                if (num != null) {
                    return num.intValue();
                }
                float[] j = j(n);
                float d2 = (d(-16216082) + 0.05f) / (d(i4) + 0.05f);
                float d3 = d(n);
                float f3 = ((d3 + 0.05f) / d2) - 0.05f;
                if (f3 < 0.004f) {
                    f3 = d3 * 0.3f;
                }
                float f4 = 1.0f;
                float w = ls6.w(j[1], 0.1f, 1.0f, 0.0f);
                for (int i5 = 0; i5 < 18; i5++) {
                    float f5 = (f2 + f4) / 2.0f;
                    if (d(l(f5, e(f5, j[2]) * w, j[2])) < f3) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                    }
                }
                float f6 = (f2 + f4) / 2.0f;
                int l = l(f6, e(f6, j[2]) * w, j[2]);
                lruCache.put(Integer.valueOf(n), Integer.valueOf(l));
                return l;
            }
        }
        return i4;
    }

    public static int c(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        return Math.max(0, Math.min(kk7.d4, (int) (((max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f) * 255.0f) + 0.5f)));
    }

    public static float d(int i) {
        return (h(i, 0) * 0.0722f) + (h(i, 8) * 0.7152f) + (h(i, 16) * 0.2126f);
    }

    public static float e(float f, float f2) {
        float f3 = 0.5f;
        float f4 = 0.0f;
        for (int i = 0; i < 18; i++) {
            float f5 = (f4 + f3) / 2.0f;
            float[] k = k(f, f5, f2);
            float f6 = k[0];
            if (f6 >= 0.0f) {
                float f7 = k[1];
                if (f7 >= 0.0f) {
                    float f8 = k[2];
                    if (f8 >= 0.0f && f6 <= 1.0f && f7 <= 1.0f && f8 <= 1.0f) {
                        f4 = f5;
                    }
                }
            }
            f3 = f5;
        }
        return f4;
    }

    public static float[] f(int i) {
        double[] c2 = bbd.c(bbd.d(bbd.b(i)));
        return new float[]{(float) c2[0], (float) c2[1], Double.isNaN(c2[2]) ? 0.0f : (float) Math.toRadians(c2[2])};
    }

    public static float g(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static float h(int i, int i2) {
        float f = ((i >> i2) & kk7.d4) / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] i(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] f = f(bm2.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)));
        float[] f2 = f(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(f[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{f[2] - f2[2], Math.min(yjb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (f[1] * 1.5f) / 0.155f))), (f(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, f[0] - 0.02f) / f2[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - f[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] j(int i) {
        float g = g(Color.red(i) / 255.0f);
        float g2 = g(Color.green(i) / 255.0f);
        float g3 = g(Color.blue(i) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * g3) + (0.53633255f * g2) + (0.41222146f * g));
        float cbrt2 = (float) Math.cbrt((0.10739696f * g3) + (0.6806995f * g2) + (0.2119035f * g));
        float cbrt3 = (float) Math.cbrt((g3 * 0.6299787f) + (g2 * 0.28171885f) + (g * 0.08830246f));
        float f = ((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3);
        double d2 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d3 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{f, (float) Math.hypot(d2, d3), (float) Math.atan2(d3, d2)};
    }

    public static float[] k(float f, float f2, float f3) {
        double d2 = f3;
        float cos = ((float) Math.cos(d2)) * f2;
        float sin = f2 * ((float) Math.sin(d2));
        float f4 = (0.21580376f * sin) + (0.39633778f * cos) + f;
        float f5 = (f - (0.105561346f * cos)) - (0.06385417f * sin);
        float f6 = (f - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        return new float[]{(0.23096994f * f9) + ((4.0767417f * f7) - (3.3077116f * f8)), ((2.6097574f * f8) + ((-1.268438f) * f7)) - (0.34131938f * f9), (f9 * 1.7076147f) + ((f7 * (-0.0041960864f)) - (f8 * 0.7034186f))};
    }

    public static int l(float f, float f2, float f3) {
        float[] k = k(f, f2, f3);
        loop0: for (int i = 0; i < 40; i++) {
            for (float f4 : k) {
                if (f4 < -0.001f || f4 > 1.001f) {
                    f2 *= 0.95f;
                    k = k(f, f2, f3);
                }
            }
        }
        return Color.rgb(c(k[0]), c(k[1]), c(k[2]));
    }

    public static void m(float[] fArr, int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        int i2 = i << 2;
        fArr[i2 + 10] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.center_color & 16777215;
        fArr[i2 + 11] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.edge_color & 16777215;
        fArr[i2 + 12] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.pattern_color & 16777215;
        fArr[i2 + 13] = stargiftattributebackdrop != null ? stargiftattributebackdrop.text_color & 16777215 : -1.0f;
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 | (-16777216);
        int i5 = i3 | (-16777216);
        float[] j = j(bm2.f(0.5f, i4, i5));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float z = yjb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j[1] * 1.5f) / 0.155f)));
        float[] j2 = j(i4);
        float[] j3 = j(i5);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j2[0] + j3[0]) / 2.0f)) / 0.15f));
        float f = j(-16216082)[0];
        float f2 = j(-15291399)[0];
        float[] j4 = j(i);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j4[0] - f) / (f2 - f)));
        float f3 = j3[0];
        float A = tb4.A(j2[0], f3, max2, f3 - 0.02f);
        float f4 = j4[0];
        float f5 = ((A - f4) * max) + f4 + (exp * (-0.025f));
        float f6 = j2[1] * 1.2f;
        float f7 = j4[1];
        return l(Math.max(0.05f, Math.min(0.97f, f5)), b00.w(j2[1], 1.1f, max, (1.0f - max) * Math.min(f7 * z, (f7 / 0.173f) * f6)), j[2]);
    }

    public static int o(int i, int i2, int i3) {
        String str = i + ":" + i2 + ":" + i3;
        LruCache lruCache = a;
        Integer num = (Integer) lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i4 = i2 | (-16777216);
        int i5 = i3 | (-16777216);
        float[] j = j(bm2.f(0.7f, i4, i5));
        float[] j2 = j(i4);
        float[] j3 = j(i5);
        float[] j4 = j(i);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float z = yjb.z(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j[1] * 1.5f) / 0.155f)));
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j2[0] + j3[0]) / 2.0f)) / 0.15f));
        float f = j(-16216082)[0];
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j4[0] - f) / (j(-15291399)[0] - f)));
        float f2 = j3[0];
        float A = tb4.A(j2[0], f2, max2, f2 - 0.02f);
        float f3 = j4[0];
        float A2 = tb4.A(A, f3, max, f3) - (exp * 0.025f);
        float f4 = j4[1];
        float w = b00.w(j2[1], 1.1f, max, (1.0f - max) * Math.min(z * f4, (f4 / 0.173f) * j2[1] * 1.2f));
        float[] j5 = i == -15291399 ? j(bm2.f(0.5f, i4, i5)) : j3;
        float A3 = tb4.A(j5[0], A2, 0.399f, A2);
        float A4 = tb4.A(j5[1], w, 0.399f, w);
        float atan2 = (((float) Math.atan2(Math.sin(j5[2] - r9), Math.cos(j5[2] - j[2]))) * 0.399f) + j[2];
        float max3 = (1.0f - Math.max(0.0f, Math.min(1.0f, (j[1] - 0.125f) / 0.015f))) * Math.max(0.0f, Math.min(1.0f, (j[1] - 0.06f) / 0.055f));
        float exp2 = (float) Math.exp(-Math.pow(((((Math.toDegrees(atan2) % 360.0d) + 360.0d) % 360.0d) - 70.0d) / 35.0d, 2.0d));
        float f5 = (((1.0f - (0.75f * exp2)) * max3 * 0.35f) + 1.0f) * A4;
        float B = yjb.B(exp2, 0.15f, 1.0f, Math.max(j2[1], j3[1]) * 1.3f);
        if (f5 > B && B > 0.0f) {
            f5 = tb4.A(B, f5, 0.8f, f5);
        }
        int l = l(Math.max(0.05f, Math.min(0.97f, A3 - (exp2 * 0.025f))), f5, atan2);
        lruCache.put(str, Integer.valueOf(l));
        return l;
    }

    public static int p(int i, int i2, float[] fArr) {
        int i3;
        int i4;
        boolean z;
        double d2;
        int i5 = ((i2 / 3) << 2) + 10;
        boolean z2 = false;
        if (fArr.length >= 18 && fArr[i5] >= 0.0f) {
            int i6 = i & 16777215;
            return (Color.alpha(i) << 24) | (((int) fArr[i5 + (i6 != 165332 ? (i6 == 29132 || i6 == 561134) ? 1 : (i6 == 2267888 || i6 == 1485817) ? 0 : 3 : 2)]) & 16777215);
        }
        if (fArr[i2] == 0.0f && fArr[i2 + 1] == 1.0f && fArr[i2 + 2] == 1.0f) {
            return i;
        }
        double[] c2 = bbd.c(bbd.d(bbd.b(i)));
        double d3 = c2[0];
        c2[0] = Math.max(d3 < 0.8d ? 0.0d : 0.8d, d3 * fArr[i2 + 2]);
        c2[1] = c2[1] * fArr[i2 + 1];
        c2[2] = Math.toDegrees(fArr[i2]) + (Double.isNaN(c2[2]) ? 0.0d : c2[2]);
        double[] dArr = null;
        int i7 = 0;
        while (true) {
            if (i7 >= 40) {
                i3 = r2;
                break;
            }
            double d4 = c2[0];
            double d5 = c2[1];
            double d6 = c2[r2];
            double cos = Double.isNaN(d6) ? 0.0d : Math.cos((d6 * 3.141592653589793d) / 180.0d) * d5;
            double sin = Double.isNaN(d6) ? 0.0d : Math.sin((d6 * 3.141592653589793d) / 180.0d) * d5;
            double[] dArr2 = new double[3];
            dArr2[0] = d4;
            dArr2[1] = cos;
            dArr2[r2] = sin;
            double[] a2 = bbd.a(bbd.f, dArr2);
            int i8 = 0;
            while (i8 < 3) {
                a2[i8] = Math.pow(a2[i8], 3.0d);
                i8++;
                r2 = r2;
                i7 = i7;
            }
            i3 = r2;
            int i9 = i7;
            dArr = bbd.a(bbd.h, bbd.a(bbd.d, a2));
            double d7 = dArr[0];
            if (d7 >= 0.0d) {
                double d8 = dArr[1];
                if (d8 >= 0.0d) {
                    double d9 = dArr[i3];
                    if (d9 >= 0.0d && d7 <= 1.0d && d8 <= 1.0d && d9 <= 1.0d) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            c2[1] = c2[1] * 0.95d;
            i7 = i9 + 1;
            r2 = i3;
        }
        double[] dArr3 = new double[3];
        int i10 = 0;
        while (i10 < dArr.length) {
            if (Math.abs(dArr[i10]) > 0.0031308d) {
                double d10 = dArr[i10];
                i4 = i3;
                z = z2;
                d2 = ((Math.pow(Math.abs(d10), 0.4166666666666667d) * 1.055d) - 0.055d) * (d10 < 0.0d ? -1 : 1);
            } else {
                i4 = i3;
                z = z2;
                d2 = 12.92d * dArr[i10];
            }
            dArr3[i10] = d2;
            i10++;
            i3 = i4;
            z2 = z;
        }
        return bm2.o(Color.rgb((int) Math.round(Utilities.h(dArr3[z2 ? 1 : 0], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[1], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[i3], 1.0d) * 255.0d)), Color.alpha(i));
    }
}
