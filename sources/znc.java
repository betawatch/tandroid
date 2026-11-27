// default package

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.os.Build;
import java.lang.reflect.Array;
import java.util.Random;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class znc {
    public static final int[] x = {-13669377, -13384961, -11887617};
    public final Object a;
    public float c;
    public long d;
    public long e;
    public float p;
    public final Paint t;
    public long u;
    public final float[] v;
    public float w;
    public final Paint b = new Paint();
    public final float[] f = new float[jn7.p2];
    public final float[] g = new float[jn7.p2];
    public final float[] h = new float[jn7.p2];
    public final float[] i = new float[jn7.p2];
    public final float[] j = new float[jn7.p2];
    public final float[] k = new float[jn7.p2];
    public final float[] l = new float[jn7.p2];
    public final int[] m = new int[jn7.p2];
    public final int[] n = new int[jn7.p2];
    public final boolean[] o = new boolean[jn7.p2];
    public final Random q = new Random();
    public final float[][] r = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 18, jn7.q5);
    public final int[] s = new int[18];

    public znc() {
        BlendMode blendMode;
        BlendMode blendMode2;
        Paint paint = new Paint(1);
        this.t = paint;
        this.v = new float[2];
        paint.setStrokeCap(Paint.Cap.ROUND);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            blendMode2 = BlendMode.PLUS;
            paint.setBlendMode(blendMode2);
        }
        this.w = 1.0f;
        if (i >= 33) {
            try {
                fn3.c();
                RuntimeShader runtimeShader = new RuntimeShader("uniform float2 uSize;\nuniform float2 uOrigin;\nuniform float uRadius;\nuniform float uDp;\nuniform float uTime;\nuniform float uK;\nuniform float uLv;\nuniform float uB;\nuniform float3 uC0;\nuniform float3 uC1;\nuniform float3 uC2;\nfloat sdRound(float2 p, float2 b, float r) {\n  float2 q = abs(p) - b + r;\n  return length(max(q, 0.0)) + min(max(q.x, q.y), 0.0) - r;\n}\nfloat3 pal(float x) {\n  float3 c = mix(uC0, uC1, 0.5 + 0.5 * sin(6.2832 * x));\n  float v = fract(x * 0.37 + uTime * 0.03) - 0.5;\n  return mix(c, uC2, 0.8 * exp(-v * v / 0.0072));\n}\nhalf4 main(float2 fc) {\n  float2 hs = uSize * 0.5;\n  float2 p = fc - (uOrigin + hs);\n  float R = min(uRadius, hs.y);\n  float d = sdRound(p, hs, R);\n  if (abs(d) > 24.0 * uDp) return half4(0.0);\n  float cr = hs.x - R;\n  float s0 = p.x > cr ? R * atan(abs(p.y), p.x - cr) : R * 1.5708 + (cr - p.x);\n  float sb = uB >= cr ? 0.0 : R * 1.5708 + (cr - uB);\n  float s = s0 >= sb ? s0 - sb : (sb - s0) * 3.0;\n  float L = uSize.x;\n  float fadeLen = (0.55 + 0.15 * uLv) * L;\n  float decay = 1.0 - smoothstep(0.0, fadeLen, s);\n  float pn = 1.0 - smoothstep(0.0, 0.4 * L, s);\n  float2 hp = p - float2(min(uB, hs.x), 0.0);\n  float halo = (0.18 + 0.4 * uLv) * exp(-dot(hp, hp) / (196.0 * uDp * uDp));\n  if (decay <= 0.0 && halo < 0.002) return half4(0.0);\n  float ad = abs(d);\n  float core = exp(-ad / ((0.75 + 0.35 * pn) * uDp));\n  float glow = (0.3 + 0.45 * pn) * exp(-ad / ((2.0 + 3.0 * pn) * uDp));\n  float a = min(1.0, core + glow) * max(decay, 0.0) * (0.2 + 0.25 * pn + (0.8 - 0.25 * pn) * uLv) * (1.0 + 0.9 * pn) * uK;\n  a += halo * uK;\n  float3 col = pal(s / max(fadeLen, 1.0) * 0.6 + uTime * 0.04);\n  a = min(a, 0.85 / max(max(col.r, col.g), max(col.b, 0.001)));\n  return half4(half3(col * a), half(a));\n}\n");
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = x[i2];
                    runtimeShader.setFloatUniform("uC" + i2, ((i3 >> 16) & jn7.d4) / 255.0f, ((i3 >> 8) & jn7.d4) / 255.0f, (i3 & jn7.d4) / 255.0f);
                }
                this.a = runtimeShader;
                this.b.setShader(runtimeShader);
                Paint paint2 = this.b;
                blendMode = BlendMode.PLUS;
                paint2.setBlendMode(blendMode);
            } catch (Throwable unused) {
                this.a = null;
            }
        }
    }

    public static float b(float f, float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, (f2 - 0.0f) / (f - 0.0f)));
        return xnb.B(max, 2.0f, 3.0f, max * max);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    public final void a(Canvas canvas, RectF rectF, float f, float f2, long j, float f3) {
        float f4;
        float f5;
        boolean z;
        int[] iArr;
        float[][] fArr;
        int i;
        int i2;
        float f6;
        int i3;
        float f7;
        int i4;
        float[] fArr2;
        Random random;
        Object obj = this.a;
        if (obj == null || Build.VERSION.SDK_INT < 33 || f2 <= 0.003f) {
            return;
        }
        float f8 = 0.0f;
        if (rectF.width() > 0.0f) {
            float f9 = hl.p;
            RuntimeShader runtimeShader = (RuntimeShader) obj;
            runtimeShader.setFloatUniform("uSize", rectF.width(), rectF.height());
            runtimeShader.setFloatUniform("uOrigin", rectF.left, rectF.top);
            runtimeShader.setFloatUniform("uRadius", Math.min(f, rectF.height() / 2.0f));
            runtimeShader.setFloatUniform("uDp", f9);
            runtimeShader.setFloatUniform("uTime", ((j - this.e) % 3600000) / 1000.0f);
            runtimeShader.setFloatUniform("uK", f2);
            runtimeShader.setFloatUniform("uLv", this.c);
            runtimeShader.setFloatUniform("uB", Math.min(0.0f, f3) + (rectF.width() / 2.0f));
            float f10 = 24.0f * f9;
            canvas.drawRect(rectF.left - f10, rectF.top - f10, rectF.right + f10, rectF.bottom + f10, this.b);
            float min = Math.min(f, rectF.height() / 2.0f);
            float min2 = this.u == 0 ? 0.0f : Math.min(0.05f, (j - r11) / 1000.0f);
            this.u = j;
            float width = rectF.width();
            float z2 = xnb.z(this.c, 0.15f, 0.55f, width);
            float f11 = 1.0f;
            this.w = Math.max(1.0f, width);
            float f12 = this.c;
            int i5 = jn7.p2;
            boolean[] zArr = this.o;
            if (f12 <= 0.06f || min2 <= 0.0f) {
                f4 = 0.3f;
                f5 = 0.5f;
                z = false;
                this.p = 0.0f;
            } else {
                f4 = 0.3f;
                this.p = c00.x(f12, 110.0f, min2, this.p);
                while (true) {
                    float f13 = this.p;
                    if (f13 < 1.0f) {
                        break;
                    }
                    this.p = f13 - 1.0f;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= 160) {
                            i6 = -1;
                            break;
                        } else if (!zArr[i6]) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 >= 0) {
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        int i7 = 0;
                        while (true) {
                            random = this.q;
                            if (i7 >= 6) {
                                break;
                            }
                            f14 = random.nextFloat() * z2;
                            f15 = 1.0f - b(z2, f14);
                            if (random.nextFloat() < f15) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        float f16 = f15;
                        c(f14, f16, f9, i6);
                        if (random.nextFloat() < (1.0f - b(this.w * 0.3f, f14)) * 0.5f) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= 160) {
                                    break;
                                }
                                if (!zArr[i8]) {
                                    c(((random.nextFloat() - 0.5f) * 4.0f * f9) + f14, f16, f9, i8);
                                    break;
                                }
                                i8++;
                            }
                        }
                    }
                }
                f5 = 0.5f;
                z = false;
            }
            int i9 = z ? 1 : 0;
            while (true) {
                iArr = this.s;
                if (i9 >= iArr.length) {
                    break;
                }
                iArr[i9] = z ? 1 : 0;
                i9++;
            }
            int i10 = z ? 1 : 0;
            int i11 = i10;
            while (true) {
                fArr = this.r;
                float f17 = f8;
                if (i10 >= i5) {
                    break;
                }
                if (zArr[i10]) {
                    float[] fArr3 = this.j;
                    float f18 = fArr3[i10] + min2;
                    fArr3[i10] = f18;
                    float f19 = f18 / this.k[i10];
                    if (f19 >= f11) {
                        zArr[i10] = z;
                    } else {
                        float f20 = f11 - f19;
                        float f21 = f20 * f20 * this.l[i10];
                        if (f21 < 0.02f) {
                            f7 = min;
                            i4 = i10;
                        } else {
                            float max = Math.max((-2.0f) * f9, this.h[i10] * ((f11 - ((float) Math.exp((-3.0f) * f18))) / 3.0f));
                            float f22 = (this.i[i10] * fArr3[i10]) + this.f[i10];
                            float f23 = this.g[i10];
                            float centerY = rectF.centerY();
                            float f24 = rectF.right - min;
                            float f25 = 1.5708f * min;
                            float[] fArr4 = this.v;
                            if (f22 < f25) {
                                fArr2 = fArr4;
                                i4 = i10;
                                double max2 = f22 / Math.max(min, 1.0f);
                                f7 = min;
                                float cos = (float) Math.cos(max2);
                                float sin = ((float) Math.sin(max2)) * (-f23);
                                float f26 = f7 + max;
                                fArr2[z ? 1 : 0] = (cos * f26) + f24;
                                fArr2[1] = (f26 * sin) + centerY;
                            } else {
                                f7 = min;
                                fArr2 = fArr4;
                                i4 = i10;
                                fArr2[z ? 1 : 0] = f24 - (f22 - f25);
                                fArr2[1] = f23 > f17 ? rectF.top - max : rectF.bottom + max;
                            }
                            int i12 = (((this.n[i4] * 3) + (f21 > 0.6f ? 2 : f21 > f4 ? 1 : z ? 1 : 0)) << 1) + this.m[i4];
                            int i13 = iArr[i12];
                            float[] fArr5 = fArr[i12];
                            int i14 = i13 << 1;
                            fArr5[i14] = fArr2[z ? 1 : 0];
                            fArr5[i14 + 1] = fArr2[1];
                            iArr[i12] = i13 + 1;
                        }
                        i11 = 1;
                        i10 = i4 + 1;
                        f8 = f17;
                        min = f7;
                        f11 = 1.0f;
                        i5 = jn7.p2;
                    }
                }
                f7 = min;
                i4 = i10;
                i10 = i4 + 1;
                f8 = f17;
                min = f7;
                f11 = 1.0f;
                i5 = jn7.p2;
            }
            int i15 = 1;
            if (i11 != 0) {
                int i16 = z ? 1 : 0;
                ?? r32 = z;
                while (i16 < 3) {
                    int i17 = r32;
                    int i18 = r32;
                    while (i17 < 3) {
                        int i19 = i18 == true ? 1 : 0;
                        int i20 = 2;
                        int i21 = i18;
                        while (i19 < i20) {
                            int i22 = (((i16 * 3) + i17) << 1) + i19;
                            int i23 = iArr[i22];
                            if (i23 == 0) {
                                i3 = i21 == true ? 1 : 0;
                                i2 = i15;
                                i = 2;
                            } else {
                                int i24 = x[i16];
                                Paint paint = this.t;
                                paint.setColor(i24);
                                float f27 = 255.0f * f2;
                                i = 2;
                                if (i17 == 2) {
                                    f6 = 0.85f;
                                    i2 = i15;
                                } else {
                                    i2 = i15;
                                    f6 = i17 == i2 ? f5 : 0.22f;
                                }
                                paint.setAlpha((int) (f27 * f6));
                                paint.setStrokeWidth((i19 == i2 ? 1.8f : 0.8f) * f9);
                                i3 = i21 == true ? 1 : 0;
                                canvas.drawPoints(fArr[i22], i3, i23 << 1, paint);
                            }
                            i19++;
                            i20 = i;
                            i15 = i2;
                            i21 = i3;
                        }
                        i17++;
                        i18 = i21;
                    }
                    i16++;
                    r32 = i18;
                }
            }
        }
    }

    public final void c(float f, float f2, float f3, int i) {
        int i2 = 1;
        this.o[i] = true;
        this.f[i] = Math.max(0.0f, f);
        Random random = this.q;
        this.g[i] = random.nextBoolean() ? 1.0f : -1.0f;
        this.h[i] = ((random.nextFloat() * 0.6f) + 0.7f) * (((1.0f - b(this.w * 0.3f, f)) * 0.3f) + 1.0f) * xnb.z(this.c, 48.0f, 12.0f, (random.nextFloat() > 0.1f ? 1 : (random.nextFloat() == 0.1f ? 0 : -1)) < 0 ? -1.0f : 1.0f) * f3;
        this.i[i] = ((random.nextFloat() * 12.0f) + 8.0f) * f3;
        this.j[i] = 0.0f;
        this.k[i] = ik8.e(random, 0.5f, 0.5f);
        this.m[i] = random.nextFloat() < (this.c * 0.6f) + 0.25f ? 1 : 0;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.6f) {
            i2 = 0;
        } else if (nextFloat >= 0.92f) {
            i2 = 2;
        }
        this.n[i] = i2;
        this.l[i] = Math.max(0.25f, f2);
    }
}
