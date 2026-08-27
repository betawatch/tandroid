package w4;

import android.graphics.Color;
import h7.u6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.a = str;
        this.b = i10;
        this.c = num;
        this.d = num2;
        this.e = f10;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = i11;
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
        s3.c.k("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e9) {
            d5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e9);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            d5.a.f(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(u6.a(((parseLong >> 24) & 255) ^ 255), u6.a(parseLong & 255), u6.a((parseLong >> 8) & 255), u6.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e9) {
            d5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e9);
            return null;
        }
    }
}
