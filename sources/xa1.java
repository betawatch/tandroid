// default package

import android.graphics.Color;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xa1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public xa1(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static xa1 a(int i) {
        hhc hhcVar = hhc.k;
        float b = yz2.b(Color.red(i));
        float b2 = yz2.b(Color.green(i));
        float b3 = yz2.b(Color.blue(i));
        float[][] fArr = yz2.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * b3) + (fArr2[1] * b2) + (fArr2[0] * b);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * b3) + (fArr3[1] * b2) + (fArr3[0] * b);
        float[] fArr4 = fArr[2];
        float f3 = (b3 * fArr4[2]) + (b2 * fArr4[1]) + (b * fArr4[0]);
        float[][] fArr5 = yz2.a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = hhcVar.g;
        float f7 = hhcVar.i;
        float f8 = hhcVar.d;
        float f9 = hhcVar.a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = hhcVar.h;
        float pow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float y = b10.y(signum3, 21.0f, (signum * 20.0f) + f16, 20.0f);
        float f17 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f17 * hhcVar.b) / f9, f8 * hhcVar.j)) * 100.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, hhcVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * hhcVar.e) * hhcVar.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (y + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f7 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f18;
        return new xa1(atan2, pow5, pow4, f19, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static xa1 b(float f, float f2, float f3) {
        float f4 = hhc.k.d;
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((r0.i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new xa1(f3, f2, f, f5, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(hhc hhcVar) {
        float f;
        float f2 = this.b;
        double d = f2;
        float f3 = this.c;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float f4 = hhcVar.f;
                float f5 = hhcVar.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d3 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = hhcVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / hhcVar.d) / hhcVar.j));
                float f6 = cos * 3846.1538f * hhcVar.e * hhcVar.c;
                float f7 = pow2 / hhcVar.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float w = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + b10.w(pow, 11.0f, cos2, f6 * 23.0f));
                float f8 = cos2 * w;
                float f9 = w * sin;
                float f10 = f7 * 460.0f;
                float y = b10.y(f9, 288.0f, (451.0f * f8) + f10, 1403.0f);
                float b = b10.b(f9, 261.0f, f10 - (891.0f * f8), 1403.0f);
                float b2 = b10.b(f9, 6300.0f, f10 - (f8 * 220.0f), 1403.0f);
                float f11 = 100.0f / f5;
                float signum = Math.signum(y) * f11 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y) * 27.13d) / (400.0d - Math.abs(y))), 2.380952380952381d));
                float signum2 = Math.signum(b) * f11 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(b) * 27.13d) / (400.0d - Math.abs(b))), 2.380952380952381d));
                float signum3 = Math.signum(b2) * f11 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(b2) * 27.13d) / (400.0d - Math.abs(b2))), 2.380952380952381d));
                float[] fArr = hhcVar.g;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float f14 = signum3 / fArr[2];
                float[][] fArr2 = yz2.b;
                float[] fArr3 = fArr2[0];
                float f15 = (fArr3[2] * f14) + (fArr3[1] * f13) + (fArr3[0] * f12);
                float[] fArr4 = fArr2[1];
                float f16 = (fArr4[2] * f14) + (fArr4[1] * f13) + (fArr4[0] * f12);
                float[] fArr5 = fArr2[2];
                return on2.e(f15, f16, (f14 * fArr5[2]) + (f13 * fArr5[1]) + (f12 * fArr5[0]));
            }
        }
        f = 0.0f;
        float f42 = hhcVar.f;
        float f52 = hhcVar.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d32 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = hhcVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / hhcVar.d) / hhcVar.j));
        float f62 = cos3 * 3846.1538f * hhcVar.e * hhcVar.c;
        float f72 = pow22 / hhcVar.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float w2 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + b10.w(pow3, 11.0f, cos22, f62 * 23.0f));
        float f82 = cos22 * w2;
        float f92 = w2 * sin2;
        float f102 = f72 * 460.0f;
        float y2 = b10.y(f92, 288.0f, (451.0f * f82) + f102, 1403.0f);
        float b3 = b10.b(f92, 261.0f, f102 - (891.0f * f82), 1403.0f);
        float b22 = b10.b(f92, 6300.0f, f102 - (f82 * 220.0f), 1403.0f);
        float f112 = 100.0f / f52;
        float signum4 = Math.signum(y2) * f112 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(y2) * 27.13d) / (400.0d - Math.abs(y2))), 2.380952380952381d));
        float signum22 = Math.signum(b3) * f112 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(b3) * 27.13d) / (400.0d - Math.abs(b3))), 2.380952380952381d));
        float signum32 = Math.signum(b22) * f112 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(b22) * 27.13d) / (400.0d - Math.abs(b22))), 2.380952380952381d));
        float[] fArr6 = hhcVar.g;
        float f122 = signum4 / fArr6[0];
        float f132 = signum22 / fArr6[1];
        float f142 = signum32 / fArr6[2];
        float[][] fArr22 = yz2.b;
        float[] fArr32 = fArr22[0];
        float f152 = (fArr32[2] * f142) + (fArr32[1] * f132) + (fArr32[0] * f122);
        float[] fArr42 = fArr22[1];
        float f162 = (fArr42[2] * f142) + (fArr42[1] * f132) + (fArr42[0] * f122);
        float[] fArr52 = fArr22[2];
        return on2.e(f152, f162, (f142 * fArr52[2]) + (f132 * fArr52[1]) + (f122 * fArr52[0]));
    }
}
