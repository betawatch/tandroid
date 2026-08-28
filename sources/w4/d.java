package w4;

import android.graphics.Color;
import g7.r6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public d(String str, int i9, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.a = str;
        this.b = i9;
        this.c = num;
        this.d = num2;
        this.e = f10;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        ta.b.i("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            d5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            d5.a.f(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(r6.a(((parseLong >> 24) & 255) ^ 255), r6.a(parseLong & 255), r6.a((parseLong >> 8) & 255), r6.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            d5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
