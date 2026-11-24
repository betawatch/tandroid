// default package

import android.content.SharedPreferences;
import android.graphics.Color;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class pm3 {
    public static boolean d;
    public static int e;
    public static final String[] a = {"hue", "chroma", "light", "haloW", "haloS", "lift", "rimW", "rimB", "speed", "spread", "buttonLean", "iconTint"};
    public static final float[] b = {150.0f, 0.26f, 0.82f, 1.0f, 1.1f, 0.6f, 1.0f, 1.15f, 1.0f, 40.0f, 0.0f, 0.25f};
    public static int c = 1;
    public static final float[] f = new float[12];
    public static final ArrayList g = new ArrayList();

    public static int a(float f2, float f3, float f4) {
        float f5 = ((f4 % 360.0f) + 360.0f) % 360.0f;
        float f6 = (f5 < 70.0f || f5 > 135.0f) ? 0.0f : f5 < 85.0f ? (f5 - 70.0f) / 15.0f : f5 > 120.0f ? (135.0f - f5) / 15.0f : 1.0f;
        return f6 <= 0.0f ? g(f2, f3, f4) : g(f2 - (0.04f * f6), yjb.B(f6, 0.4f, 1.0f, f3), (f6 * 12.0f) + f4);
    }

    public static int b(double d2) {
        double max = Math.max(0.0d, Math.min(1.0d, d2));
        return (int) Math.round((max <= 0.0031308d ? max * 12.92d : (Math.pow(max, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
    }

    public static float c(int i) {
        f();
        return f[i];
    }

    public static float d(float f2) {
        float f3 = ((f2 % 360.0f) + 360.0f) % 360.0f;
        return f2 - (((f3 < 145.0f || f3 > 205.0f) ? 0.0f : f3 < 160.0f ? (f3 - 145.0f) / 15.0f : f3 > 190.0f ? (205.0f - f3) / 15.0f : 1.0f) * 14.0f);
    }

    public static double e(double d2) {
        return d2 <= 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    public static void f() {
        if (d) {
            return;
        }
        d = true;
        SharedPreferences c1 = na7.c1();
        e = c1.getInt("dict_glow_day2_preset", 0);
        c1.getBoolean("dict_glow_day2_contrast", true);
        c = c1.getInt("dict_glow_day2_rimMode", 1);
        for (int i = 0; i < 12; i++) {
            f[i] = c1.getFloat("dict_glow_day2_" + a[i], b[i]);
        }
    }

    public static int g(float f2, float f3, float f4) {
        double radians = Math.toRadians(((f4 % 360.0f) + 360.0f) % 360.0f);
        double d2 = f3;
        for (int i = 0; i < 24; i++) {
            double cos = Math.cos(radians) * d2;
            double sin = Math.sin(radians) * d2;
            double d3 = f2;
            double d4 = (0.2158037573d * sin) + (0.3963377774d * cos) + d3;
            double d5 = (d3 - (0.1055613458d * cos)) - (0.0638541728d * sin);
            double d6 = (d3 - (cos * 0.0894841775d)) - (sin * 1.291485548d);
            double d7 = d4 * d4 * d4;
            double d8 = d5 * d5 * d5;
            double d9 = d6 * d6 * d6;
            double d10 = (0.2309699292d * d9) + ((4.0767416621d * d7) - (3.3077115913d * d8));
            double d11 = ((2.6097574011d * d8) + ((-1.2684380046d) * d7)) - (0.3413193965d * d9);
            double d12 = (d9 * 1.707614701d) + ((d7 * (-0.0041960863d)) - (d8 * 0.7034186147d));
            if (d10 >= -0.001d && d10 <= 1.001d && d11 >= -0.001d && d11 <= 1.001d && d12 >= -0.001d && d12 <= 1.001d) {
                return Color.rgb(b(d10), b(d11), b(d12));
            }
            d2 *= 0.9d;
        }
        int b2 = b(f2 * f2 * f2);
        return Color.rgb(b2, b2, b2);
    }

    public static float h(int i) {
        float[] i2 = i(i);
        float degrees = (float) Math.toDegrees(Math.atan2(i2[2], i2[1]));
        return degrees < 0.0f ? degrees + 360.0f : degrees;
    }

    public static float[] i(int i) {
        double e2 = e(Color.red(i) / 255.0d);
        double e3 = e(Color.green(i) / 255.0d);
        double e4 = e(Color.blue(i) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * e4) + (0.5363325363d * e3) + (0.4122214708d * e2));
        double cbrt2 = Math.cbrt((0.1073969566d * e4) + (0.6806995451d * e3) + (0.2119034982d * e2));
        double cbrt3 = Math.cbrt((e4 * 0.6299787005d) + (e3 * 0.2817188376d) + (e2 * 0.0883024619d));
        return new float[]{(float) (((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3)), (float) ((0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2))), (float) (((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d))};
    }
}
