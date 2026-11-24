// default package

import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import java.util.Random;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zn3 {
    public static float U;
    public final int[] A;
    public final int[] B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public final int[] Q;
    public final boolean[] R;
    public final boolean[] S;
    public float T;
    public final Paint a;
    public final Object b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public final Paint f;
    public final RectF g;
    public boolean h;
    public final long i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final int[] r;
    public final boolean[] s;
    public final Random t;
    public long u;
    public float v;
    public float w;
    public final Path x;
    public final RectF y;
    public final float[] z;

    public zn3() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = true;
        this.i = SystemClock.uptimeMillis();
        this.j = new float[nm7.V1];
        this.k = new float[nm7.V1];
        this.l = new float[nm7.V1];
        this.m = new float[nm7.V1];
        this.n = new float[nm7.V1];
        this.o = new float[nm7.V1];
        this.p = new float[nm7.V1];
        this.q = new float[nm7.V1];
        this.r = new int[nm7.V1];
        this.s = new boolean[nm7.V1];
        this.t = new Random();
        this.x = new Path();
        this.y = new RectF();
        this.z = new float[]{0.08f, 0.73f, 0.76f, 0.1f, 0.74f, 0.52f, 0.19f, 0.6f, 0.93f, 0.72f, 0.98f, 0.9f};
        this.A = new int[]{-15420490, -14699385, -13787165};
        this.B = new int[7];
        this.C = -1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = new float[nm7.V1];
        this.J = new float[nm7.V1];
        this.K = new float[nm7.V1];
        this.L = new float[nm7.V1];
        this.M = new float[nm7.V1];
        this.N = new float[nm7.V1];
        this.O = new float[nm7.V1];
        this.P = new float[nm7.V1];
        this.Q = new int[nm7.V1];
        this.R = new boolean[nm7.V1];
        this.S = new boolean[nm7.V1];
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                yn3.c();
                RuntimeShader a = yn3.a();
                this.b = a;
                paint.setShader(a);
            } catch (Throwable unused) {
                this.b = null;
            }
        }
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStyle(style);
    }

    public static boolean c(int i) {
        return gm.B(i) < 0.5f;
    }

    public static int d(int i) {
        if (U == 0.0f) {
            return i;
        }
        float[] fArr = {(((U + 205.0f) % 360.0f) + 360.0f) % 360.0f, 0.0f, 0.0f};
        Color.colorToHSV(i, fArr);
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public static int e(int i) {
        if (U == 0.0f) {
            return i;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[0] = (((fArr[0] + U) % 360.0f) + 360.0f) % 360.0f;
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public static void h(int i) {
        float f = 0.0f;
        if (i != 0) {
            float[] fArr = new float[3];
            Color.colorToHSV(i | (-16777216), fArr);
            if (fArr[1] >= 0.25f && fArr[2] >= 0.25f) {
                float f2 = fArr[0] - 205.0f;
                while (f2 > 180.0f) {
                    f2 -= 360.0f;
                }
                while (f2 < -180.0f) {
                    f2 += 360.0f;
                }
                if (Math.abs(f2) >= 12.0f) {
                    f = f2;
                }
            }
        }
        U = f;
    }

    public static int[] k(boolean z) {
        if (U == 0.0f) {
            return null;
        }
        int[] iArr = z ? (int[]) lta.T.clone() : (int[]) lta.U.clone();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = e(iArr[i]);
        }
        return iArr;
    }

    public final int a(float f, float f2, RectF rectF) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return 0;
        }
        float uptimeMillis = (((SystemClock.uptimeMillis() - this.i) % 3600000) / 1000.0f) * (this.h ? 1.0f : ao3.c(8));
        float atan2 = (float) Math.atan2((f2 - rectF.centerY()) / Math.max(rectF.height() / 2.0f, 1.0f), (f - rectF.centerX()) / Math.max(rectF.width() / 2.0f, 1.0f));
        float max = (f - rectF.left) / Math.max(rectF.height(), 1.0f);
        if (this.h) {
            f9 = 0.12f;
            f10 = 0.22f;
            f11 = 0.33f;
            f6 = 1.0f;
            f5 = 0.86f;
            f7 = 0.43f;
            f3 = 0.4f;
            f8 = 1.0f;
            f4 = 1.0f;
        } else {
            float[] fArr = this.z;
            float f12 = fArr[0];
            f3 = fArr[1];
            f4 = fArr[2];
            float f13 = fArr[3];
            f5 = fArr[4];
            f6 = fArr[5];
            f7 = fArr[6];
            float f14 = fArr[7];
            f8 = fArr[8];
            f9 = f12;
            f10 = f13;
            f11 = f14;
        }
        float sin = (((float) Math.sin((0.9f * uptimeMillis) + atan2)) * 0.5f) + 0.5f;
        float sin2 = (((float) Math.sin((1.3f * max) + ((atan2 * 2.0f) - (uptimeMillis * 0.6f)))) * 0.5f) + 0.5f;
        float A = td4.A(f10, f9, sin, f9);
        float A2 = td4.A(f5, f3, sin, f3);
        float A3 = td4.A(f6, f4, sin, f4);
        int rgb = Color.rgb(Math.round(Math.min(1.0f, td4.A(f7, A, sin2, A)) * 255.0f), Math.round(Math.min(1.0f, td4.A(f11, A2, sin2, A2)) * 255.0f), Math.round(Math.min(1.0f, td4.A(f8, A3, sin2, A3)) * 255.0f));
        return this.h ? e(rgb) : rgb;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        Canvas canvas3;
        float f13;
        float f14;
        float f15;
        boolean equals;
        boolean z;
        int[] iArr;
        float f16;
        int i;
        int i2;
        int i3;
        int i4;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        float f17;
        float f18;
        float f19;
        double d;
        float f20;
        int i5;
        float sin;
        float f21;
        float f22;
        float f23;
        boolean z2;
        boolean z3;
        float f24;
        float f25;
        float e;
        float f26;
        int i6;
        float f27;
        float f28;
        if (f2 <= 0.001f || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            this.u = 0L;
            return;
        }
        float uptimeMillis = (((SystemClock.uptimeMillis() - this.i) % 3600000) / 1000.0f) * (this.h ? 1.0f : ao3.c(8));
        float max = (Math.max(0.0f, Math.min(1.0f, f4)) * (this.h ? gm.L(4.0f) : gm.L(10.0f))) + gm.L(26.0f);
        float f29 = 0.45f;
        float f30 = 0.7f;
        int i7 = 1;
        int i8 = 3;
        Object obj = this.b;
        if (obj == null) {
            f5 = 4.0f;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                RuntimeShader runtimeShader = (RuntimeShader) obj;
                f11 = 12.0f;
                runtimeShader.setFloatUniform("uSize", rectF.width(), rectF.height());
                runtimeShader.setFloatUniform("uOrigin", rectF.left, rectF.top);
                runtimeShader.setFloatUniform("uRadius", Math.min(f, rectF.height() / 2.0f));
                runtimeShader.setFloatUniform("uTime", uptimeMillis);
                runtimeShader.setFloatUniform("uIntensity", f2);
                runtimeShader.setFloatUniform("uSweep", f3);
                runtimeShader.setFloatUniform("uDark", this.h ? 1.0f : 0.0f);
                float x = kt6.x(rectF.height() - gm.L(52.0f), gm.L(70.0f) - gm.L(52.0f), 1.0f, 0.0f);
                runtimeShader.setFloatUniform("uHue", U / 360.0f);
                runtimeShader.setFloatUniform("uNStroke", this.E);
                runtimeShader.setFloatUniform("uNGlow", this.F);
                runtimeShader.setFloatUniform("uNSat", this.G);
                runtimeShader.setFloatUniform("uThin", 1.0f - ((3.0f - (x * 2.0f)) * (x * x)));
                runtimeShader.setFloatUniform("uHalo", max);
                runtimeShader.setFloatUniform("uDp", gm.p);
                runtimeShader.setFloatUniform("uLevel", f4);
                runtimeShader.setFloatUniform("uPulse", this.C);
                runtimeShader.setFloatUniform("uPulseAng", this.D);
                float[] fArr3 = this.z;
                runtimeShader.setFloatUniform("uL0", fArr3[0], fArr3[1], fArr3[2]);
                runtimeShader.setFloatUniform("uL1", fArr3[3], fArr3[4], fArr3[5]);
                runtimeShader.setFloatUniform("uL2", fArr3[6], fArr3[7], fArr3[8]);
                runtimeShader.setFloatUniform("uLHi", fArr3[9], fArr3[10], fArr3[11]);
                runtimeShader.setFloatUniform("uHaloW", ao3.c(3));
                runtimeShader.setFloatUniform("uHaloS", ao3.c(4));
                runtimeShader.setFloatUniform("uLift", ao3.c(5));
                runtimeShader.setFloatUniform("uRimW", ao3.c(6));
                runtimeShader.setFloatUniform("uRimB", ao3.c(7));
                int[] iArr3 = this.B;
                runtimeShader.setFloatUniform("uRim", Color.red(iArr3[4]) / 255.0f, Color.green(iArr3[4]) / 255.0f, Color.blue(iArr3[4]) / 255.0f);
                BlendMode blendMode = this.h ? BlendMode.PLUS : BlendMode.SRC_OVER;
                Paint paint = this.a;
                paint.setBlendMode(blendMode);
                f7 = 3.0f;
                f8 = 0.0f;
                f6 = 1.0f;
                f9 = 0.9f;
                f10 = 0.8f;
                f5 = 4.0f;
                canvas.drawRect(rectF.left - max, rectF.top - max, rectF.right + max, rectF.bottom + max, paint);
                canvas2 = canvas;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                float f31 = f6;
                float min = this.u != 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r5) / 1000.0f);
                this.u = uptimeMillis2;
                Random random = this.t;
                if (f2 <= 0.3f) {
                    float f32 = f9;
                    float f33 = 0.35f;
                    if (f3 >= f8 && f3 > 0.05f && f3 < 0.95f) {
                        float f34 = 0.3f;
                        this.v = (95.0f * min) + this.v;
                        while (true) {
                            float f35 = this.v;
                            if (f35 < f31) {
                                break;
                            }
                            this.v = f35 - f31;
                            float A = td4.A(rectF.height(), gm.L(8.0f), random.nextFloat(), rectF.top + gm.L(f5));
                            float width = ((((rectF.width() * ((1.7f * f3) - 0.35f)) + rectF.left) - ((A - rectF.centerY()) * f32)) - (random.nextFloat() * gm.L(70.0f))) + gm.L(f11);
                            float L = gm.L((random.nextFloat() * 6.0f) + 2.0f);
                            j(width, A, (random.nextFloat() - f34) * L, L * (random.nextFloat() - 0.5f), wi8.e(random, f29, f33), wi8.e(random, f29, 0.32f));
                            canvas2 = canvas;
                            min = min;
                            f33 = 0.35f;
                            f29 = 0.45f;
                            f34 = 0.3f;
                        }
                    }
                    float f36 = min;
                    canvas3 = canvas2;
                    f15 = 6.0f;
                    float f37 = this.C;
                    if (f37 >= f8) {
                        this.H = (32.0f * f36 * ((float) Math.sin(f37 * 3.141592653589793d))) + this.H;
                        while (true) {
                            float f38 = this.H;
                            if (f38 < f31) {
                                break;
                            }
                            this.H = f38 - f31;
                            double nextFloat = ((this.C * 3.77f) + this.D) - (random.nextFloat() * 0.5f);
                            float cos = (float) Math.cos(nextFloat);
                            float sin2 = (float) Math.sin(nextFloat);
                            float max2 = f31 / Math.max(Math.abs(cos), Math.abs(sin2));
                            float width2 = ((rectF.width() * (cos * max2)) / 2.0f) + rectF.centerX();
                            float height = ((rectF.height() * (max2 * sin2)) / 2.0f) + rectF.centerY();
                            float max3 = Math.max(rectF.left + gm.L(6.0f), Math.min(rectF.right - gm.L(6.0f), width2));
                            float max4 = Math.max(rectF.top + gm.L(f31), Math.min(rectF.bottom - gm.L(f31), height));
                            float L2 = gm.L((random.nextFloat() * 8.0f) + f5);
                            j(max3, max4, mlb.A(sin2, f10, cos * 0.6f, L2), mlb.B(cos, f10, sin2 * 0.6f, L2), wi8.e(random, 0.3f, 0.4f), wi8.e(random, 0.35f, 0.3f));
                        }
                    }
                    f13 = 0.3f;
                    f14 = 0.4f;
                    this.w = (((random.nextFloat() * f10) + 0.6f) * f36 * (f3 >= f8 ? 2.0f : (f4 * f7) + 3.6f)) + this.w;
                    while (true) {
                        float f39 = this.w;
                        if (f39 < f31) {
                            break;
                        }
                        this.w = f39 - f31;
                        float width3 = rectF.width();
                        float height2 = rectF.height();
                        float nextFloat2 = random.nextFloat() * (width3 + height2) * 2.0f;
                        float nextFloat3 = (random.nextFloat() * gm.L(f5)) + gm.L(f31);
                        if (nextFloat2 < width3) {
                            f27 = rectF.left + nextFloat2;
                            f28 = rectF.top + nextFloat3;
                        } else {
                            float f40 = nextFloat2 - width3;
                            if (f40 < height2) {
                                f27 = rectF.right - nextFloat3;
                                f28 = rectF.top + f40;
                            } else {
                                float f41 = f40 - height2;
                                if (f41 < width3) {
                                    f27 = rectF.right - f41;
                                    f28 = rectF.bottom - nextFloat3;
                                } else {
                                    float f42 = f41 - width3;
                                    f27 = rectF.left + nextFloat3;
                                    f28 = rectF.bottom - f42;
                                }
                            }
                        }
                        float max5 = Math.max(rectF.left + gm.L(10.0f), Math.min(rectF.right - gm.L(10.0f), f27));
                        float max6 = Math.max(rectF.top + gm.L(2.0f), Math.min(rectF.bottom - gm.L(2.0f), f28));
                        float L3 = gm.L((random.nextFloat() * 3.5f) + 1.5f);
                        double nextFloat4 = random.nextFloat() * 3.141592653589793d * 2.0d;
                        j(max5, max6, ((float) Math.cos(nextFloat4)) * L3, (((float) Math.sin(nextFloat4)) * L3) - gm.L(f31), wi8.e(random, 1.1f, f32), wi8.e(random, 0.38f, 0.3f));
                        f10 = f10;
                        f36 = f36;
                    }
                    f12 = f36;
                } else {
                    f12 = min;
                    canvas3 = canvas2;
                    f13 = 0.3f;
                    f14 = 0.4f;
                    f15 = 6.0f;
                }
                float f43 = f10;
                RectF rectF2 = this.y;
                equals = rectF2.equals(rectF);
                Path path = this.x;
                if (!equals) {
                    rectF2.set(rectF);
                    path.rewind();
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                }
                z = this.h;
                int[] iArr4 = this.A;
                Paint paint2 = this.f;
                if (z) {
                    float[] fArr4 = this.P;
                    f16 = 0.02f;
                    float[] fArr5 = this.O;
                    int[] iArr5 = this.Q;
                    float f44 = f13;
                    float[] fArr6 = this.L;
                    float[] fArr7 = this.K;
                    boolean[] zArr = this.R;
                    float[] fArr8 = this.N;
                    float[] fArr9 = this.J;
                    float[] fArr10 = this.I;
                    boolean[] zArr2 = this.S;
                    float[] fArr11 = this.M;
                    if (f2 > 0.3f) {
                        fArr = fArr11;
                        iArr = iArr4;
                        fArr2 = fArr5;
                        iArr2 = iArr5;
                        float f45 = f12;
                        this.T = aq1.g(f4, 55.0f, 30.0f, f45, this.T);
                        while (true) {
                            float f46 = this.T;
                            if (f46 < f31) {
                                break;
                            }
                            this.T = f46 - f31;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= 140) {
                                    i9 = -1;
                                    break;
                                } else if (!zArr[i9]) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            if (i9 < 0) {
                                f19 = f45;
                                i6 = i8;
                                f26 = f15;
                            } else {
                                float min2 = Math.min(f, rectF.height() / 2.0f);
                                float max7 = Math.max(f8, rectF.width() - (min2 * 2.0f));
                                f19 = f45;
                                float nextFloat5 = random.nextFloat() * ((max7 * 2.0f) + ((float) (min2 * 6.283185307179586d)));
                                if (nextFloat5 < max7) {
                                    f21 = rectF.left + min2 + nextFloat5;
                                    f22 = rectF.top;
                                    sin = -1.0f;
                                    i5 = i9;
                                } else {
                                    float f47 = nextFloat5 - max7;
                                    if (f47 < max7) {
                                        f21 = (rectF.right - min2) - f47;
                                        f22 = rectF.bottom;
                                        i5 = i9;
                                        sin = f31;
                                    } else {
                                        double d2 = (f47 - max7) / min2;
                                        if (d2 < 3.141592653589793d) {
                                            d = d2 - 1.5707963267948966d;
                                            f20 = rectF.right - min2;
                                        } else {
                                            d = (d2 - 3.141592653589793d) + 1.5707963267948966d;
                                            f20 = rectF.left + min2;
                                        }
                                        float centerY = rectF.centerY();
                                        i5 = i9;
                                        float cos2 = (float) Math.cos(d);
                                        sin = (float) Math.sin(d);
                                        f21 = (cos2 * min2) + f20;
                                        f22 = (sin * min2) + centerY;
                                        f23 = cos2;
                                        z2 = random.nextFloat() >= f44;
                                        if (z2) {
                                            z3 = z2;
                                            f24 = f22;
                                            f25 = f15;
                                            e = wi8.e(random, f11, f25);
                                        } else {
                                            float f48 = f7;
                                            f24 = f22;
                                            z3 = z2;
                                            e = wi8.e(random, f5, f48);
                                            f25 = f15;
                                        }
                                        float L4 = gm.L(e);
                                        f26 = f25;
                                        float nextFloat6 = (random.nextFloat() - 0.5f) * gm.L(f26);
                                        fArr10[i5] = f21;
                                        fArr9[i5] = f24;
                                        float f49 = -sin;
                                        fArr7[i5] = (f49 * nextFloat6) + ((!z3 ? -f23 : f23) * L4);
                                        if (z3) {
                                            sin = f49;
                                        }
                                        fArr6[i5] = (f23 * nextFloat6) + (sin * L4);
                                        f8 = 0.0f;
                                        fArr[i5] = 0.0f;
                                        fArr8[i5] = wi8.e(random, 1.2f, 1.1f);
                                        fArr2[i5] = gm.N((random.nextFloat() * 0.6f) + 0.55f);
                                        fArr4[i5] = random.nextFloat() * 6.28f;
                                        i6 = i8;
                                        iArr2[i5] = random.nextInt(i6);
                                        zArr2[i5] = z3;
                                        zArr[i5] = true;
                                    }
                                }
                                f23 = 0.0f;
                                if (random.nextFloat() >= f44) {
                                }
                                if (z2) {
                                }
                                float L42 = gm.L(e);
                                f26 = f25;
                                float nextFloat62 = (random.nextFloat() - 0.5f) * gm.L(f26);
                                fArr10[i5] = f21;
                                fArr9[i5] = f24;
                                float f492 = -sin;
                                fArr7[i5] = (f492 * nextFloat62) + ((!z3 ? -f23 : f23) * L42);
                                if (z3) {
                                }
                                fArr6[i5] = (f23 * nextFloat62) + (sin * L42);
                                f8 = 0.0f;
                                fArr[i5] = 0.0f;
                                fArr8[i5] = wi8.e(random, 1.2f, 1.1f);
                                fArr2[i5] = gm.N((random.nextFloat() * 0.6f) + 0.55f);
                                fArr4[i5] = random.nextFloat() * 6.28f;
                                i6 = i8;
                                iArr2[i5] = random.nextInt(i6);
                                zArr2[i5] = z3;
                                zArr[i5] = true;
                            }
                            i8 = i6;
                            f45 = f19;
                            f15 = f26;
                            f7 = 3.0f;
                            f5 = 4.0f;
                            f11 = 12.0f;
                        }
                        f12 = f45;
                    } else {
                        fArr = fArr11;
                        iArr = iArr4;
                        fArr2 = fArr5;
                        iArr2 = iArr5;
                    }
                    int i10 = 0;
                    int i11 = 2;
                    while (i10 < i11) {
                        int i12 = i7;
                        if (i10 == i12) {
                            canvas3.save();
                            canvas3.clipPath(path);
                        }
                        int i13 = 0;
                        while (i13 < 140) {
                            if (zArr[i13]) {
                                if (zArr2[i13] == (i10 == i12)) {
                                    if (i10 == 0) {
                                        float f50 = fArr[i13] + f12;
                                        fArr[i13] = f50;
                                        if (f50 >= fArr8[i13]) {
                                            zArr[i13] = false;
                                        } else {
                                            fArr10[i13] = (fArr7[i13] * f12) + fArr10[i13];
                                            fArr9[i13] = (fArr6[i13] * f12) + fArr9[i13];
                                            float f51 = f31 - (f12 * 0.6f);
                                            fArr7[i13] = fArr7[i13] * f51;
                                            fArr6[i13] = fArr6[i13] * f51;
                                        }
                                    }
                                    float f52 = fArr[i13] / fArr8[i13];
                                    float f53 = f31;
                                    float min3 = Math.min(f53, f52 / 0.15f);
                                    float f54 = f53 - f52;
                                    f17 = f30;
                                    f18 = f44;
                                    float A2 = mlb.A((float) Math.sin((fArr[i13] * 9.0f) + fArr4[i13]), f18, f17, mlb.C(min3, f54, f54, f2));
                                    if (A2 > 0.02f) {
                                        paint2.setColor(zArr2[i13] ? on2.f(f18, iArr[iArr2[i13]], -1) : on2.f(0.82f, iArr[iArr2[i13]], -1));
                                        paint2.setAlpha((int) (Math.min(1.0f, A2 * (zArr2[i13] ? f43 : 1.0f)) * 255.0f));
                                        canvas3.drawCircle(fArr10[i13], fArr9[i13], fArr2[i13], paint2);
                                    }
                                    i13++;
                                    f30 = f17;
                                    f44 = f18;
                                    i12 = 1;
                                    f31 = 1.0f;
                                }
                            }
                            f17 = f30;
                            f18 = f44;
                            i13++;
                            f30 = f17;
                            f44 = f18;
                            i12 = 1;
                            f31 = 1.0f;
                        }
                        float f55 = f30;
                        float f56 = f44;
                        if (i10 == i12) {
                            canvas3.restore();
                        }
                        i10++;
                        f30 = f55;
                        f44 = f56;
                        i11 = 2;
                        i7 = 1;
                        f31 = 1.0f;
                    }
                    i = -1;
                    for (int i14 = 0; i14 < 140; i14++) {
                        if (zArr[i14] && zArr2[i14]) {
                            float f57 = fArr[i14] + f12;
                            fArr[i14] = f57;
                            if (f57 >= fArr8[i14]) {
                                zArr[i14] = false;
                            } else {
                                fArr10[i14] = (fArr7[i14] * f12) + fArr10[i14];
                                fArr9[i14] = (fArr6[i14] * f12) + fArr9[i14];
                                float f58 = 1.0f - (f12 * 0.6f);
                                fArr7[i14] = fArr7[i14] * f58;
                                fArr6[i14] = fArr6[i14] * f58;
                            }
                        }
                    }
                } else {
                    iArr = iArr4;
                    f16 = 0.02f;
                    i = -1;
                }
                canvas3.save();
                canvas3.clipPath(path);
                for (i2 = 0; i2 < 140; i2++) {
                    boolean[] zArr3 = this.s;
                    if (zArr3[i2]) {
                        float[] fArr12 = this.o;
                        float f59 = fArr12[i2] + f12;
                        fArr12[i2] = f59;
                        float[] fArr13 = this.n;
                        if (f59 >= fArr13[i2]) {
                            zArr3[i2] = false;
                        } else {
                            float[] fArr14 = this.j;
                            float f60 = fArr14[i2];
                            float[] fArr15 = this.l;
                            fArr14[i2] = (fArr15[i2] * f12) + f60;
                            float[] fArr16 = this.k;
                            float f61 = fArr16[i2];
                            float[] fArr17 = this.m;
                            fArr16[i2] = (fArr17[i2] * f12) + f61;
                            float f62 = 1.0f - (f12 * f43);
                            fArr15[i2] = fArr15[i2] * f62;
                            fArr17[i2] = fArr17[i2] * f62;
                            float f63 = fArr12[i2] / fArr13[i2];
                            float sin3 = ((((float) Math.sin((fArr12[i2] * 14.0f) + this.q[i2])) * f14) + 0.6f) * mlb.B(f63, f63, 1.0f, Math.min(1.0f, f63 / 0.12f)) * f2;
                            if (sin3 > f16) {
                                boolean z4 = this.h;
                                int[] iArr6 = this.r;
                                if (z4) {
                                    int i15 = iArr6[i2];
                                    i3 = e(i15 == 0 ? i : i15 == 1 ? -4200705 : -2964225);
                                    i4 = e(iArr6[i2] == 2 ? -6652929 : -9455873);
                                } else {
                                    i3 = iArr[iArr6[i2]];
                                    i4 = -6295334;
                                }
                                paint2.setColor(i4);
                                paint2.setAlpha((int) (sin3 * 255.0f * (this.h ? 0.22f : 0.18f)));
                                float f64 = fArr14[i2];
                                float f65 = fArr16[i2];
                                float[] fArr18 = this.p;
                                canvas3.drawCircle(f64, f65, fArr18[i2] * 2.4f, paint2);
                                paint2.setColor(i3);
                                paint2.setAlpha((int) (Math.min(1.0f, sin3 * (this.h ? 1.0f : 0.85f)) * 255.0f));
                                canvas3.drawCircle(fArr14[i2], fArr16[i2], fArr18[i2], paint2);
                            }
                        }
                    }
                }
                canvas3.restore();
            }
            f5 = 4.0f;
        }
        canvas2 = canvas;
        f6 = 1.0f;
        f7 = 3.0f;
        f8 = 0.0f;
        f9 = 0.9f;
        f10 = 0.8f;
        f11 = 12.0f;
        int e2 = this.h ? e(-14717953) : -13712186;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, rectF.width(), 0.0f, new int[]{e2, this.h ? e(-13051649) : -12793440, this.h ? e(-9546241) : -11553808, e2}, (float[]) null, Shader.TileMode.MIRROR);
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postRotate(uptimeMillis * 40.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        matrix.postTranslate(rectF.left, rectF.top);
        linearGradient.setLocalMatrix(matrix);
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        paint3.setStrokeWidth(gm.L(10.0f));
        paint3.setMaskFilter(new BlurMaskFilter(gm.L(12.0f), BlurMaskFilter.Blur.NORMAL));
        paint3.setAlpha((int) (Math.min(1.0f, ((0.2f * f4) + 0.8f) * (this.h ? this.F * 0.7f : 0.45f) * f2) * 255.0f));
        canvas2.drawRoundRect(rectF, f, f, paint3);
        Paint paint4 = this.d;
        paint4.setShader(linearGradient);
        paint4.setStrokeWidth(gm.L(1.3f));
        paint4.setAlpha((int) (Math.min(1.0f, f2 * 0.9f * (this.h ? this.E : 1.0f)) * 255.0f));
        RectF rectF3 = this.g;
        rectF3.set(rectF);
        rectF3.inset(gm.L(0.6f), gm.L(0.6f));
        canvas2.drawRoundRect(rectF3, f, f, paint4);
        long uptimeMillis22 = SystemClock.uptimeMillis();
        float f312 = f6;
        if (this.u != 0) {
        }
        this.u = uptimeMillis22;
        Random random2 = this.t;
        if (f2 <= 0.3f) {
        }
        float f432 = f10;
        RectF rectF22 = this.y;
        equals = rectF22.equals(rectF);
        Path path2 = this.x;
        if (!equals) {
        }
        z = this.h;
        int[] iArr42 = this.A;
        Paint paint22 = this.f;
        if (z) {
        }
        canvas3.save();
        canvas3.clipPath(path2);
        while (i2 < 140) {
        }
        canvas3.restore();
    }

    public final void f() {
        for (int i = 0; i < 140; i++) {
            this.R[i] = false;
        }
        for (int i2 = 0; i2 < 140; i2++) {
            this.s[i2] = false;
        }
    }

    public final void g(int i, int i2) {
        char c;
        char c2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ao3.f();
        float[] fArr = ao3.f;
        float f7 = fArr[2];
        float f8 = fArr[1];
        float[] i3 = ao3.i(i);
        float f9 = i3[0];
        float h = ao3.h(i);
        float h2 = ao3.h(i2);
        boolean z = ((float) Math.hypot((double) i3[1], (double) i3[2])) < 0.035f;
        int i4 = ao3.e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    c = 1;
                    f5 = 30.0f;
                    f6 = 350.0f;
                    f3 = 60.0f;
                } else if (i4 != 4) {
                    float f10 = fArr[9];
                    float f11 = z ? h2 : h;
                    float f12 = f11 - (0.7f * f10);
                    float f13 = (f10 * 0.6f) + f11;
                    f5 = ao3.d(f11);
                    f6 = ao3.d(f12);
                    f3 = ao3.d(f13);
                    c = 1;
                    f7 = mlb.f(f9, 0.16f, 0.95f, f7);
                } else {
                    c = 1;
                    f6 = h2 - 28.0f;
                    f3 = h2 + 28.0f;
                    c2 = 4;
                    f = h2;
                    f2 = f6;
                }
                c2 = 4;
            } else {
                c = 1;
                f5 = 160.0f;
                f6 = 285.0f;
                c2 = 4;
                f3 = 205.0f;
            }
            f = f5;
            f2 = f6;
        } else {
            c = 1;
            c2 = 4;
            f = 230.0f;
            f2 = 200.0f;
            f3 = 255.0f;
        }
        int a = ao3.a(f7, f8, f);
        int[] iArr = this.B;
        iArr[0] = a;
        iArr[c] = ao3.a(f7, f8, f2);
        iArr[2] = ao3.a(f7, f8, f3);
        iArr[3] = ao3.g(Math.min(0.98f, f7 + 0.12f), 0.5f * f8, f);
        if (ao3.e != 0) {
            f4 = Math.min(0.62f, f7 - 0.1f);
        } else {
            f8 = 0.2f;
            f4 = 0.55f;
            if (!z) {
                int i5 = ao3.c;
                if (i5 == 0) {
                    f = fArr[0] + h;
                } else if (i5 != 2) {
                    f4 = Math.max(0.42f, Math.min(0.58f, f9 - 0.12f));
                    f8 = 0.24f;
                    f = h;
                }
            }
            f = h2;
        }
        iArr[c2] = ao3.g(f4, f8, f);
        float max = Math.max(205.0f, Math.min(235.0f, ((((((h - h2) % 360.0f) + 540.0f) % 360.0f) - 180.0f) * fArr[10]) + h2));
        iArr[5] = ao3.g(0.62f, 0.16f, max - 12.0f);
        iArr[6] = ao3.g(0.58f, 0.18f, max + 4.0f);
        int i6 = 0;
        while (true) {
            float[] fArr2 = this.z;
            if (i6 >= 3) {
                fArr2[9] = Color.red(iArr[3]) / 255.0f;
                fArr2[10] = Color.green(iArr[3]) / 255.0f;
                fArr2[11] = Color.blue(iArr[3]) / 255.0f;
                return;
            } else {
                int i7 = i6 * 3;
                fArr2[i7] = Color.red(iArr[i6]) / 255.0f;
                fArr2[i7 + 1] = Color.green(iArr[i6]) / 255.0f;
                fArr2[i7 + 2] = Color.blue(iArr[i6]) / 255.0f;
                this.A[i6] = iArr[i6];
                i6++;
            }
        }
    }

    public final void i() {
        this.E = 0.7f;
        this.F = 0.6f;
        this.G = 0.85f;
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr;
        float[] fArr2;
        boolean[] zArr;
        int i = 0;
        float f7 = -1.0f;
        int i2 = 0;
        while (true) {
            fArr = this.n;
            fArr2 = this.o;
            zArr = this.s;
            if (i >= 140) {
                i = i2;
                break;
            } else {
                if (!zArr[i]) {
                    break;
                }
                float f8 = fArr2[i] / fArr[i];
                if (f8 > f7) {
                    i2 = i;
                    f7 = f8;
                }
                i++;
            }
        }
        this.j[i] = f;
        this.k[i] = f2;
        this.l[i] = f3;
        this.m[i] = f4;
        fArr[i] = f5;
        fArr2[i] = 0.0f;
        this.p[i] = gm.L(f6);
        Random random = this.t;
        this.q[i] = random.nextFloat() * 6.28f;
        this.r[i] = random.nextInt(3);
        zArr[i] = true;
    }
}
