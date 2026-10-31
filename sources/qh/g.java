package qh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.i00;
import org.telegram.messenger.m5;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g {
    public static final float S;
    public static final float T;
    public static Bitmap U;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public Bitmap J;
    public float[] L;
    public float[] M;
    public float[] N;
    public float[] O;
    public int[] P;
    public int[] Q;
    public short[] R;
    public int l;
    public f m;
    public f n;
    public long p;
    public boolean[] s;
    public PorterDuffColorFilter z;
    public final float[] a = new float[2400];
    public final float[] b = new float[2400];
    public final float[] c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f = new float[2400];
    public final float[] g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] i = new float[2400];
    public final float[] j = new float[2400];
    public final byte[] k = new byte[2400];
    public float o = 1.0f;
    public int q = 0;
    public final RectF r = new RectF();
    public final Paint t = new Paint(3);
    public final Paint u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF w = new RectF();
    public final Random x = new Random();
    public int y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

    static {
        float f7;
        float f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            f7 = 0.5f;
            if (i11 > 1000) {
                break;
            }
            float f11 = i11 / 1000.0f;
            if (p(f11 * 0.467f) >= 0.5f) {
                f7 = f11;
                break;
            }
            i11++;
        }
        while (true) {
            f10 = 0.8f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (p(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        S = f7;
        T = f10;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (g.class) {
            try {
                if (U == null) {
                    U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(U);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    RectF rectF = new RectF();
                    for (int i10 = 0; i10 < 8; i10++) {
                        rectF.set((i10 * 48) + 1.5f, 1.5f, (r7 + 48) - 1.5f, 46.5f);
                        float f7 = (1.0f - ((i10 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static f c(String str, int i10, ac.d dVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(vb.b.a, dVar);
            hashMap.put(vb.b.c, 0);
            i00 i00Var = new i00();
            if (colorDrawable != null) {
                i00Var.g = colorDrawable;
            }
            f fVar = new f();
            Bitmap a2 = i00Var.a(str, i10, i10, hashMap, null, f7, 0, -1);
            fVar.b = a2.getWidth();
            int i11 = ((b4.d) cc.b.b(str, dVar, hashMap).f).b;
            fVar.e = i11;
            fVar.f = (fVar.b - (fVar.g * 2.0f)) / i11;
            int i12 = i11 * i11;
            fVar.h = new boolean[i12];
            fVar.i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < fVar.e; i13++) {
                for (int i14 = 0; i14 < fVar.e; i14++) {
                    float f10 = fVar.g;
                    float f11 = i14 + 0.5f;
                    float f12 = fVar.f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int b10 = (int) z20.b(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        z10 = Color.alpha(a2.getPixel(Math.max(0, Math.min(fVar.b - 1, ((int) ((((float) i16) * fVar.f) * 0.3f)) + i15)), b10)) > 40;
                    }
                    boolean[] zArr = fVar.h;
                    int i17 = (fVar.e * i13) + i14;
                    zArr[i17] = z10;
                    fVar.i[i17] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i18 = fVar.b;
            fVar.d = i18 + 2;
            fVar.a = Bitmap.createBitmap(Math.max(i18, b11.getWidth()), fVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(fVar.a);
            canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, fVar.d, (Paint) null);
            a2.recycle();
            fVar.a.prepareToDraw();
            Rect rect = fVar.c;
            int i19 = fVar.b;
            rect.set(0, 0, i19, i19);
            int i20 = i00Var.f;
            fVar.l = i20;
            int round = Math.round(i20 / fVar.f) + 2;
            int i21 = (fVar.e - round) / 2;
            fVar.j = i21;
            fVar.k = i21 + round;
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(zs.e4, Math.round(f7 * 255.0f)));
    }

    public static float h(f fVar, float f7) {
        float f10 = 1.0f - f7;
        return z20.b(fVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * (f10 * f10)), -1.5f);
    }

    public static boolean i(f fVar, int i10, int i11) {
        if (i10 < 7 && i11 < 7) {
            return true;
        }
        int i12 = fVar.e;
        if (i10 < i12 - 7 || i11 >= 7) {
            return i10 < 7 && i11 >= i12 - 7;
        }
        return true;
    }

    public static float j(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float q6 = q(Color.red(i10) / 255.0f);
        float q10 = q(Color.green(i10) / 255.0f);
        float q11 = q(Color.blue(i10) / 255.0f);
        float q12 = q(Color.red(i11) / 255.0f);
        float q13 = q(Color.green(i11) / 255.0f);
        float q14 = q(Color.blue(i11) / 255.0f);
        float f10 = q11 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (q10 * 0.53633255f) + (q6 * 0.41222146f));
        float f11 = q11 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (q10 * 0.6806995f) + (q6 * 0.2119035f));
        float f12 = q11 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (q10 * 0.28171885f) + (q6 * 0.08830246f));
        float f13 = 0.051445995f * q14;
        float cbrt4 = (float) Math.cbrt(f13 + (0.53633255f * q13) + (0.41222146f * q12));
        float f14 = 0.10739696f * q14;
        float cbrt5 = (float) Math.cbrt(f14 + (0.6806995f * q13) + (0.2119035f * q12));
        float f15 = q14 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f15 + (q13 * 0.28171885f) + (q12 * 0.08830246f));
        float z10 = c3.i0.z(cbrt4, cbrt, f7, cbrt);
        float z11 = c3.i0.z(cbrt5, cbrt2, f7, cbrt2);
        float z12 = c3.i0.z(cbrt6, cbrt3, f7, cbrt3);
        float f16 = z10 * z10 * z10;
        float f17 = z11 * z11 * z11;
        float f18 = z12 * z12 * z12;
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), d(j((0.23096994f * f18) + ((4.0767417f * f16) - (3.3077116f * f17)))), d(j(((2.6097574f * f17) + ((-1.268438f) * f16)) - (0.34131938f * f18))), d(j((f18 * 1.7076147f) + ((f16 * (-0.0041960864f)) - (f17 * 0.7034186f)))));
    }

    public static float l(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 < 0.6f) {
            float f10 = 1.0f - (f7 / 0.6f);
            return (1.0f - ((f10 * f10) * f10)) * 1.08f;
        }
        float f11 = (f7 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f11 * 2.0f)) * ((0.08f * f11) * f11));
    }

    public static void m(f fVar) {
        int i10;
        int i11;
        if (fVar.n != null) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= fVar.e) {
                break;
            }
            for (int i14 = 0; i14 < fVar.e; i14++) {
                int i15 = fVar.j;
                if (i14 < i15 || i14 >= (i11 = fVar.k) || i12 < i15 || i12 >= i11) {
                    i13++;
                }
            }
            i12++;
        }
        fVar.m = i13;
        fVar.n = new float[i13];
        fVar.o = new float[i13];
        fVar.p = new float[i13];
        fVar.q = new boolean[i13];
        fVar.r = new int[i13 * 4];
        float f7 = 1.4142f * ((r4 - 1) / 2.0f);
        int i16 = 0;
        for (int i17 = 0; i17 < fVar.e; i17++) {
            int i18 = 0;
            while (true) {
                int i19 = fVar.e;
                if (i18 < i19) {
                    int i20 = fVar.j;
                    if (i18 < i20 || i18 >= (i10 = fVar.k) || i17 < i20 || i17 >= i10) {
                        int i21 = (i19 * i17) + i18;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f7;
                        float f10 = fVar.i[i21] * 3.17f;
                        float floor = f10 - ((float) Math.floor(f10));
                        boolean i22 = i(fVar, i18, i17);
                        float[] fArr = fVar.n;
                        float f11 = fVar.g;
                        float f12 = fVar.f;
                        fArr[i16] = ((i18 + 0.5f) * f12) + f11;
                        fVar.o[i16] = z20.b(i17, 0.5f, f12, f11);
                        float f13 = hypot * 0.5f;
                        fVar.p[i16] = i22 ? f13 * 0.85f : f13 + (floor * 0.06f);
                        fVar.q[i16] = fVar.h[i21];
                        int[] iArr = fVar.r;
                        int i23 = i16 * 4;
                        iArr[i23] = i18;
                        iArr[i23 + 1] = i17;
                        i16++;
                    }
                    i18++;
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
        int i12 = i10 * 8;
        fArr[i12] = f7;
        int i13 = i12 + 1;
        fArr[i13] = f10;
        int i14 = i12 + 2;
        fArr[i14] = f11;
        int i15 = i12 + 3;
        fArr[i15] = f10;
        int i16 = i12 + 4;
        fArr[i16] = f11;
        int i17 = i12 + 5;
        fArr[i17] = f12;
        int i18 = i12 + 6;
        fArr[i18] = f7;
        int i19 = i12 + 7;
        fArr[i19] = f12;
        fArr2[i12] = f13;
        fArr2[i13] = f14;
        fArr2[i14] = f15;
        fArr2[i15] = f14;
        fArr2[i16] = f15;
        fArr2[i17] = f16;
        fArr2[i18] = f13;
        fArr2[i19] = f16;
        int i20 = i10 * 4;
        iArr[i20] = i11;
        iArr[i20 + 1] = i11;
        iArr[i20 + 2] = i11;
        iArr[i20 + 3] = i11;
    }

    public static float p(float f7) {
        double d = f7;
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float q(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(f fVar) {
        this.m = fVar;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x031f, code lost:
    
        r7 = r7 + 1;
        r5 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a0f  */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [int] */
    /* JADX WARN: Type inference failed for: r6v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        g gVar;
        Canvas canvas2;
        boolean z10;
        byte[] bArr;
        RectF rectF;
        float f18;
        float f19;
        float f20;
        float f21;
        f fVar;
        Paint paint;
        Paint paint2;
        Rect rect;
        RectF rectF2;
        int i10;
        float f22;
        f fVar2;
        int i11;
        int i12;
        float f23;
        int i13;
        float f24;
        Rect rect2;
        int i14;
        int i15;
        f fVar3;
        int i16;
        ?? r62;
        f fVar4;
        float f25;
        float f26;
        int i17;
        int i18;
        int i19;
        int i20;
        float f27;
        float f28;
        float y3;
        float f29;
        float f30;
        float f31;
        float f32;
        float L;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f33 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || tz.o() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i21 = this.q;
        long j10 = (i21 != 1 && i21 == 2) ? 380L : 450L;
        float f34 = this.o;
        if (f34 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i21 != 2 || (this.D < 0.0f && !this.F)) {
            f12 = 0.01f;
            if (f34 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr = y0.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr[51]));
            float f35 = fArr[53] / 100.0f;
            if (f35 > 0.01f) {
                float f36 = S;
                min2 = min2 < f35 ? (min2 * f36) / f35 : (((1.0f - f36) * (min2 - f35)) / Math.max(0.01f, 1.0f - f35)) + f36;
            }
            float p5 = p(min2 * 0.467f);
            float f37 = fArr[52];
            if (f37 > 0.0f) {
                float f38 = T;
                if (min2 > f38) {
                    float p9 = p(f38 * 0.467f);
                    float f39 = 1.0f - f38;
                    f12 = 0.01f;
                    float min3 = Math.min(((p((f38 + 0.002f) * 0.467f) - p9) / 0.002f) * f39, (1.0f - p9) * 3.0f);
                    float f40 = (min2 - f38) / f39;
                    float f41 = f40 * f40;
                    float f42 = f41 * f40;
                    float f43 = f41 * 3.0f;
                    p5 = ((((((f42 * (-2.0f)) + f43) * 1.0f) + ((((f42 - (f41 * 2.0f)) + f40) * min3) + ((((f42 * 2.0f) - f43) + 1.0f) * p9))) - p5) * f37) + p5;
                    max = Math.max(f34, min2 < 1.0f ? 1.0f : Math.min(1.0f, p5));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f12 = 0.01f;
            max = Math.max(f34, min2 < 1.0f ? 1.0f : Math.min(1.0f, p5));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint3 = this.t;
        paint3.setColorFilter(porterDuffColorFilter);
        float f44 = f11 / 2.0f;
        this.B = f7 + f44;
        this.C = f10 + f44;
        int i22 = this.q;
        RectF rectF3 = this.w;
        float[] fArr2 = this.j;
        float[] fArr3 = this.i;
        float[] fArr4 = this.h;
        float[] fArr5 = this.g;
        float[] fArr6 = this.f;
        float[] fArr7 = this.d;
        float[] fArr8 = this.c;
        float[] fArr9 = this.e;
        float[] fArr10 = this.b;
        float[] fArr11 = this.a;
        byte[] bArr2 = this.k;
        if (i22 == 2) {
            float f45 = this.o;
            if (f45 < 1.0f) {
                f14 = 0.92f;
                f(canvas, this.m, f7, f10, f11, f45);
                f21 = 0.0f;
                bArr = bArr2;
                rectF = rectF3;
                f18 = min;
                f15 = 3.0f;
                f19 = 1.6f;
                f20 = 255.0f;
                gVar = this;
                canvas2 = canvas;
                i20 = gVar.l - 1;
                while (i20 >= 0) {
                    float f46 = fArr5[i20] + f18;
                    fArr5[i20] = f46;
                    if (f46 >= fArr6[i20]) {
                        int i23 = gVar.l - 1;
                        gVar.l = i23;
                        fArr11[i20] = fArr11[i23];
                        fArr10[i20] = fArr10[i23];
                        fArr8[i20] = fArr8[i23];
                        fArr7[i20] = fArr7[i23];
                        fArr9[i20] = fArr9[i23];
                        fArr6[i20] = fArr6[i23];
                        fArr5[i20] = fArr5[i23];
                        fArr4[i20] = fArr4[i23];
                        fArr3[i20] = fArr3[i23];
                        fArr2[i20] = fArr2[i23];
                        bArr[i20] = bArr[i23];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i20]);
                        Paint paint4 = gVar.u;
                        if (isNaN || fArr5[i20] >= f21) {
                            RectF rectF4 = gVar.r;
                            if (isNaN) {
                                fArr7[i20] = fArr7[i20] - (org.telegram.messenger.i0.L(20.0f) * f18);
                                f27 = f18;
                                fArr8[i20] = c3.i0.D(f27, 2.4f, 1.0f, fArr8[i20]);
                                fArr7[i20] = c3.i0.D(f27, f15, 1.0f, fArr7[i20]);
                                if (!rectF4.isEmpty() && fArr10[i20] < rectF4.top - org.telegram.messenger.i0.L(56.0f)) {
                                    fArr7[i20] = fArr7[i20] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f21, 1.0f - (f18 * 6.5f));
                                fArr8[i20] = fArr8[i20] * max2;
                                fArr7[i20] = (fArr7[i20] * max2) - (org.telegram.messenger.i0.L(260.0f) * f18);
                                f27 = f18;
                            }
                            fArr11[i20] = (fArr8[i20] * f27) + fArr11[i20];
                            fArr10[i20] = (fArr7[i20] * f27) + fArr10[i20];
                            fArr4[i20] = (fArr3[i20] * f27) + fArr4[i20];
                            float f47 = fArr5[i20] / fArr6[i20];
                            if (isNaN) {
                                if (f47 < 0.08f) {
                                    f29 = f47 / 0.08f;
                                    f28 = f14;
                                    y3 = f29;
                                    if (isNaN) {
                                    }
                                    f30 = 1.0f;
                                    float f48 = f30 - f47;
                                    float f49 = fArr9[i20] * (f30 - ((f30 - (f48 * f48)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i20] == 2) {
                                    }
                                } else {
                                    f28 = f14;
                                    y3 = m5.y(f47, 0.08f, f28, 1.0f);
                                    if (isNaN) {
                                    }
                                    f30 = 1.0f;
                                    float f482 = f30 - f47;
                                    float f492 = fArr9[i20] * (f30 - ((f30 - (f482 * f482)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i20] == 2) {
                                    }
                                }
                            } else if (f47 < 0.35f) {
                                f28 = f14;
                                y3 = 1.0f;
                                if (isNaN && !rectF4.isEmpty()) {
                                    L = (rectF4.top - org.telegram.messenger.i0.L(56.0f)) - fArr10[i20];
                                    if (L > 0.0f) {
                                        f30 = 1.0f;
                                        y3 *= Math.max(0.0f, 1.0f - (L / org.telegram.messenger.i0.L(24.0f)));
                                        float f4822 = f30 - f47;
                                        float f4922 = fArr9[i20] * (f30 - ((f30 - (f4822 * f4822)) * (!isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i20] == 2) {
                                            paint4.setColor(-1);
                                            float f50 = y3 * f20;
                                            paint4.setAlpha((int) (f50 * 0.9f));
                                            canvas2.drawCircle(fArr11[i20], fArr10[i20], f4922, paint4);
                                            paint4.setAlpha((int) (f50 * 0.22f));
                                            canvas2.drawCircle(fArr11[i20], fArr10[i20], f4922 * 2.6f, paint4);
                                            i20--;
                                            f18 = f27;
                                            f14 = f28;
                                            f15 = 3.0f;
                                            f21 = 0.0f;
                                        } else {
                                            if (rectF4.isEmpty()) {
                                                f31 = 0.0f;
                                                f32 = 0.0f;
                                            } else {
                                                float f51 = rectF4.left;
                                                float f52 = fArr11[i20];
                                                f31 = 0.0f;
                                                float max3 = Math.max(f51 - f52, Math.max(0.0f, f52 - rectF4.right));
                                                float f53 = rectF4.top;
                                                float f54 = fArr10[i20];
                                                f32 = Math.min(1.0f, Math.max(max3, Math.max(f53 - f54, Math.max(0.0f, f54 - rectF4.bottom))) / org.telegram.messenger.i0.L(36.0f));
                                            }
                                            paint4.setColor(f32 > f31 ? k(f32, gVar.y, -1) : gVar.y);
                                            paint4.setAlpha((int) (y3 * f20));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i20], fArr11[i20], fArr10[i20]);
                                            float f55 = fArr11[i20];
                                            float f56 = f4922 / 2.0f;
                                            float f57 = fArr10[i20];
                                            rectF.set(f55 - f56, f57 - f56, f55 + f56, f57 + f56);
                                            float f58 = f4922 * 0.3f;
                                            canvas2.drawRoundRect(rectF, f58, f58, paint4);
                                            if (bArr[i20] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f47 * f19) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (y3 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f58, f58, paint4);
                                            }
                                            canvas2.restore();
                                            i20--;
                                            f18 = f27;
                                            f14 = f28;
                                            f15 = 3.0f;
                                            f21 = 0.0f;
                                        }
                                    }
                                }
                                f30 = 1.0f;
                                float f48222 = f30 - f47;
                                float f49222 = fArr9[i20] * (f30 - ((f30 - (f48222 * f48222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i20] == 2) {
                                }
                            } else {
                                f29 = m5.y(f47, 0.35f, 0.65f, 1.0f);
                                f28 = f14;
                                y3 = f29;
                                if (isNaN) {
                                    L = (rectF4.top - org.telegram.messenger.i0.L(56.0f)) - fArr10[i20];
                                    if (L > 0.0f) {
                                    }
                                }
                                f30 = 1.0f;
                                float f482222 = f30 - f47;
                                float f492222 = fArr9[i20] * (f30 - ((f30 - (f482222 * f482222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i20] == 2) {
                                }
                            }
                        } else {
                            paint4.setColor(gVar.y);
                            paint4.setAlpha(zs.e4);
                            float f59 = fArr9[i20];
                            float f60 = fArr11[i20];
                            float f61 = f59 / 2.0f;
                            float f62 = fArr10[i20];
                            rectF.set(f60 - f61, f62 - f61, f60 + f61, f62 + f61);
                            float f63 = f59 * 0.3f;
                            canvas2.drawRoundRect(rectF, f63, f63, paint4);
                        }
                    }
                    f28 = f14;
                    f27 = f18;
                    i20--;
                    f18 = f27;
                    f14 = f28;
                    f15 = 3.0f;
                    f21 = 0.0f;
                }
            }
            f13 = 3.0f;
        } else {
            f13 = 3.0f;
        }
        f14 = 0.92f;
        int i24 = 2400;
        Random random = this.x;
        f15 = f13;
        if (i22 != 1 || (fVar4 = this.n) == null) {
            f16 = f7;
            f17 = f10;
            gVar = this;
            canvas2 = canvas;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f64 = f11 / fVar4.b;
                    int i25 = 0;
                    loop1: while (i25 < fVar4.e) {
                        int i26 = 0;
                        while (true) {
                            int i27 = fVar4.e;
                            if (i26 < i27) {
                                if (!fVar4.h[(i27 * i25) + i26] || ((i26 >= (i18 = fVar4.j) && i26 < (i19 = fVar4.k) && i25 >= i18 && i25 < i19) || random.nextFloat() < 0.4f)) {
                                    f26 = f64;
                                    i17 = i26;
                                } else {
                                    int i28 = this.l;
                                    if (i28 >= i24) {
                                        i28 = -1;
                                    } else {
                                        this.l = i28 + 1;
                                    }
                                    if (i28 < 0) {
                                        break loop1;
                                    }
                                    float f65 = fVar4.g;
                                    float f66 = fVar4.f;
                                    float f67 = ((((i26 + 0.5f) * f66) + f65) * f64) + f7;
                                    float f68 = ((((i25 + 0.5f) * f66) + f65) * f64) + f10;
                                    float f69 = f67 - this.B;
                                    float max4 = Math.max(f33, Math.abs(f69));
                                    f26 = f64;
                                    float nextFloat = (random.nextFloat() * org.telegram.messenger.i0.L(900.0f)) + org.telegram.messenger.i0.L(1000.0f);
                                    i17 = i26;
                                    float radians = (float) Math.toRadians((random.nextFloat() - 0.5f) * 36.0f);
                                    bArr2[i28] = (byte) (random.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i28] = f67;
                                    fArr10[i28] = f68;
                                    fArr9[i28] = ((random.nextFloat() * 0.6f) + 0.7f) * fVar4.f * f26;
                                    double d = radians;
                                    fArr8[i28] = (Math.min(1.0f, max4 / (f11 * 0.5f)) * Math.signum(f69) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i28] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i28] = (random.nextFloat() * 0.06f) + 0.24f;
                                    fArr5[i28] = (-(((fVar4.e - 1) - i25) / 4)) * 0.018f;
                                    fArr4[i28] = random.nextFloat() * 90.0f;
                                    fArr3[i28] = (random.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i28] = 1.0f;
                                }
                                i26 = i17 + 1;
                                f64 = f26;
                                i24 = 2400;
                                f33 = 1.0f;
                            }
                        }
                    }
                }
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f25 = 1.0f;
                    } else if (max5 < 0.45f) {
                        float f70 = 1.0f - (max5 / 0.45f);
                        f25 = ((1.0f - (f70 * f70)) * 0.12f) + 0.92f;
                    } else {
                        float f71 = (max5 - 0.45f) / 0.55f;
                        f25 = 1.04f - ((f15 - (f71 * 2.0f)) * ((0.04f * f71) * f71));
                    }
                    canvas.save();
                    canvas.scale(f25, f25, this.B, this.C);
                    f(canvas, this.m, f7, f10, f11, max5);
                    gVar = this;
                    canvas2 = canvas;
                    canvas2.restore();
                } else {
                    gVar = this;
                    canvas2 = canvas;
                }
                bArr = bArr2;
                rectF = rectF3;
                f18 = min;
                f19 = 1.6f;
                f20 = 255.0f;
                f21 = 0.0f;
                i20 = gVar.l - 1;
                while (i20 >= 0) {
                }
            }
            f16 = f7;
            f17 = f10;
            gVar = this;
            canvas2 = canvas;
        }
        float f72 = 0.5f;
        if (gVar.o >= 1.0f || (fVar = gVar.n) == null) {
            float f73 = f17;
            bArr = bArr2;
            rectF = rectF3;
            f18 = min;
            float f74 = f16;
            f19 = 1.6f;
            f20 = 255.0f;
            f21 = 0.0f;
            f fVar5 = gVar.m;
            int i29 = fVar5.b;
            rectF.set(f74, f73, f74 + f11, f73 + f11);
            canvas2.drawBitmap(fVar5.a, fVar5.c, rectF, paint3);
        } else {
            f fVar6 = gVar.m;
            m(fVar);
            int i30 = fVar.g;
            m(fVar6);
            Rect rect3 = fVar6.c;
            int i31 = fVar6.g;
            gVar.g(Math.max(fVar.m, fVar6.m));
            Bitmap bitmap = gVar.H;
            Bitmap bitmap2 = fVar.a;
            Paint paint5 = gVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = fVar.a;
                bArr = bArr2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                gVar.H = fVar.a;
            } else {
                bArr = bArr2;
            }
            Bitmap bitmap4 = gVar.J;
            Bitmap bitmap5 = fVar6.a;
            Paint paint6 = gVar.K;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = fVar6.a;
                paint = paint5;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                gVar.J = fVar6.a;
            } else {
                paint = paint5;
            }
            float h = h(fVar, gVar.o);
            float h10 = h(fVar6, gVar.o);
            float f75 = f11 / fVar.b;
            float f76 = f11 / fVar6.b;
            int i32 = 0;
            int i33 = 0;
            while (true) {
                f18 = min;
                if (i32 >= fVar.m) {
                    break;
                }
                if (fVar.q[i32]) {
                    int[] iArr = fVar.r;
                    int i34 = i32 * 4;
                    int i35 = iArr[i34];
                    int i36 = iArr[i34 + 1];
                    i13 = i32;
                    int i37 = (i36 * fVar.e) + i35;
                    float f77 = (fVar.i[i37] * 3.2f) + ((r9 - 1) - i36);
                    if (h > f77) {
                        boolean[] zArr = gVar.s;
                        if (zArr[i37]) {
                            f24 = f76;
                            rect2 = rect3;
                            i14 = i31;
                        } else {
                            zArr[i37] = z10;
                            float f78 = i30;
                            float f79 = fVar.f;
                            float f80 = ((((i35 + 0.5f) * f79) + f78) * f75) + f16;
                            float f81 = ((((i36 + 0.5f) * f79) + f78) * f75) + f17;
                            float f82 = f79 * f75;
                            float f83 = f80 - gVar.B;
                            float f84 = f81 - gVar.C;
                            f24 = f76;
                            rect2 = rect3;
                            i14 = i31;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f83, f84));
                            float f85 = f83 / max6;
                            float f86 = f84 / max6;
                            float nextFloat2 = random.nextFloat();
                            int i38 = (nextFloat2 > 0.12f ? 1 : (nextFloat2 == 0.12f ? 0 : -1));
                            int i39 = i38 < 0 ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i40 = 0;
                            while (i40 < i39) {
                                int i41 = i39;
                                int i42 = gVar.l;
                                int i43 = i38;
                                if (i42 >= 2400) {
                                    i42 = -1;
                                } else {
                                    gVar.l = i42 + 1;
                                }
                                if (i42 < 0) {
                                    break;
                                }
                                boolean z11 = (i40 <= 0 || random.nextFloat() >= 0.3f) ? false : z10;
                                if (z11) {
                                    i16 = i42;
                                    r62 = 2;
                                } else if (random.nextFloat() < 0.14f) {
                                    i16 = i42;
                                    r62 = z10;
                                } else {
                                    i16 = i42;
                                    r62 = 0;
                                }
                                bArr[i16] = (byte) r62;
                                fArr11[i16] = ((random.nextFloat() - 0.5f) * f82 * 0.5f) + f80;
                                fArr10[i16] = ((random.nextFloat() - 0.5f) * f82 * 0.5f) + f81;
                                if (z11) {
                                    fArr9[i16] = org.telegram.messenger.i0.N((random.nextFloat() * 0.9f) + 0.9f);
                                } else if (i40 != 0 || i43 >= 0) {
                                    fArr9[i16] = ((random.nextFloat() * 0.55f) + 0.3f) * f82;
                                } else {
                                    fArr9[i16] = ((random.nextFloat() * 0.45f) + 1.25f) * f82;
                                }
                                float nextFloat3 = (random.nextFloat() * org.telegram.messenger.i0.L(150.0f)) + org.telegram.messenger.i0.L(110.0f);
                                float nextFloat4 = (random.nextFloat() * 0.35f) + 0.45f;
                                fArr8[i16] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.i0.L(90.0f)) + (f85 * nextFloat3 * nextFloat4);
                                fArr7[i16] = sc.e.z(1.0f, nextFloat4, nextFloat3, (f86 * nextFloat3) * nextFloat4) - org.telegram.messenger.i0.L(30.0f);
                                fArr6[i16] = (random.nextFloat() * 0.2f) + 0.3f;
                                fArr5[i16] = 0.0f;
                                fArr4[i16] = random.nextFloat() * 90.0f;
                                fArr3[i16] = (random.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i16] = Float.NaN;
                                i40++;
                                i39 = i41;
                                i38 = i43;
                                f85 = f85;
                            }
                        }
                    } else {
                        f24 = f76;
                        rect2 = rect3;
                        i14 = i31;
                        float min4 = 1.0f - Math.min(1.0f, (f77 - h) / 2.2f);
                        float N = min4 > 0.0f ? org.telegram.messenger.i0.N(1.4f) * ((float) Math.sin((gVar.o * 60.0f) + (i36 * 7) + (i35 * 13))) * min4 : 0.0f;
                        float N2 = org.telegram.messenger.i0.N(1.5f) * (-min4);
                        float f87 = i30;
                        i15 = i30;
                        float f88 = fVar.f;
                        float f89 = (i35 * f88) + f87;
                        float f90 = (i36 * f88) + f87;
                        float f91 = f89 + f88;
                        float f92 = f88 + f90;
                        fVar3 = fVar;
                        n(gVar.L, gVar.M, gVar.P, i33, sc.e.d(f89, f75, f16, N), sc.e.d(f90, f75, f17, N2), sc.e.d(f91, f75, f16, N), sc.e.d(f92, f75, f17, N2), f89, f90, f91, f92, (((int) c3.i0.D(min4, 0.25f, 1.0f, 255.0f)) << 24) | gVar.o());
                        i33++;
                        i32 = i13 + 1;
                        min = f18;
                        rect3 = rect2;
                        f76 = f24;
                        i31 = i14;
                        i30 = i15;
                        fVar = fVar3;
                    }
                } else {
                    f24 = f76;
                    rect2 = rect3;
                    i14 = i31;
                    i13 = i32;
                }
                fVar3 = fVar;
                i15 = i30;
                i32 = i13 + 1;
                min = f18;
                rect3 = rect2;
                f76 = f24;
                i31 = i14;
                i30 = i15;
                fVar = fVar3;
            }
            float f93 = f76;
            Rect rect4 = rect3;
            int i44 = i31;
            f21 = 0.0f;
            float f94 = 3.2f;
            boolean z12 = z10;
            int i45 = 0;
            int i46 = 0;
            while (i45 < fVar6.m) {
                if (fVar6.q[i45]) {
                    int[] iArr2 = fVar6.r;
                    int i47 = i45 * 4;
                    int i48 = iArr2[i47];
                    int i49 = iArr2[i47 + 1];
                    float d10 = sc.e.d(fVar6.i[(i49 * fVar6.e) + i48], f94, (r7 - 1) - i49, 1.6f);
                    if (h10 <= d10) {
                        i12 = i45;
                        f23 = f93;
                        i11 = i44;
                        z12 = false;
                        f94 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (h10 - d10) / 2.4f);
                        i11 = i44;
                        float f95 = i11;
                        float f96 = fVar6.f;
                        float f97 = (i48 * f96) + f95;
                        float f98 = (i49 * f96) + f95;
                        float f99 = f97 + f96;
                        float f100 = f98 + f96;
                        float f101 = min5 - 1.0f;
                        f94 = 3.2f;
                        float f102 = (((f101 * 2.2f * f101) + (f101 * 3.2f * f101 * f101) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f102 - 1.0f) < f12)) {
                            i12 = i45;
                            f23 = f93;
                            n(gVar.N, gVar.O, gVar.Q, i46, (f97 * f23) + f16, (f98 * f23) + f17, (f99 * f23) + f16, (f100 * f23) + f17, f97, f98, f99, f100, gVar.o() | (-16777216));
                            i46++;
                        } else {
                            float f103 = ((f97 + f99) * f72 * f93) + f16;
                            float f104 = ((f98 + f100) * f72 * f93) + f17;
                            f23 = f93;
                            float E = c3.i0.E(fVar6.f, f72, f23, f102);
                            i12 = i45;
                            n(gVar.N, gVar.O, gVar.Q, i46, f103 - E, f104 - E, f103 + E, f104 + E, f97, f98, f99, f100, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | gVar.o());
                            i46++;
                            z12 = false;
                        }
                    }
                } else {
                    i12 = i45;
                    f23 = f93;
                    i11 = i44;
                }
                i45 = i12 + 1;
                i44 = i11;
                f93 = f23;
                f72 = 0.5f;
            }
            float f105 = f93;
            int i50 = i44;
            f20 = 255.0f;
            if (i33 == 0 && z12) {
                gVar.o = 1.0f;
                rectF3.set(f16, f17, f16 + f11, f17 + f11);
                canvas2.drawBitmap(fVar6.a, rect4, rectF3, paint3);
                rectF = rectF3;
                f19 = 1.6f;
            } else {
                if (i33 > 0) {
                    rectF2 = rectF3;
                    i10 = i50;
                    f22 = f105;
                    paint2 = paint3;
                    fVar2 = fVar6;
                    rect = rect4;
                    f19 = 1.6f;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i33 * 8, gVar.L, 0, gVar.M, 0, gVar.P, 0, gVar.R, 0, i33 * 6, paint);
                } else {
                    paint2 = paint3;
                    rect = rect4;
                    rectF2 = rectF3;
                    i10 = i50;
                    f22 = f105;
                    f19 = 1.6f;
                    fVar2 = fVar6;
                }
                if (i46 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i46 * 8, gVar.N, 0, gVar.O, 0, gVar.Q, 0, gVar.R, 0, i46 * 6, paint6);
                } else {
                    canvas2 = canvas;
                }
                float f106 = i10;
                float f107 = fVar2.j;
                float f108 = fVar2.f;
                float f109 = f22;
                float C = c3.i0.C(f107, f108, f106, f109);
                float C2 = c3.i0.C(fVar2.k, f108, f106, f109);
                canvas2.save();
                canvas2.clipRect(C + f7, C + f10, C2 + f7, C2 + f10);
                rectF = rectF2;
                rectF.set(f7, f10, f7 + f11, f10 + f11);
                canvas2.drawBitmap(fVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i20 = gVar.l - 1;
        while (i20 >= 0) {
        }
    }

    public final void f(Canvas canvas, f fVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float x10;
        int i10;
        float f18;
        float f19;
        Paint paint;
        float f20;
        float y3;
        float f21 = f7;
        float f22 = f10;
        float f23 = f12;
        int i11 = this.q;
        Paint paint2 = this.t;
        RectF rectF = this.w;
        int i12 = 1;
        if (i11 != 2) {
            int i13 = 0;
            float f24 = 2.0f;
            float f25 = 0.05f;
            int i14 = fVar.b;
            int i15 = fVar.g;
            float f26 = f11 / i14;
            float f27 = (fVar.e - 1) / 2.0f;
            float f28 = 1.4142f * f27;
            int i16 = 0;
            while (i16 < fVar.e) {
                int i17 = i13;
                while (true) {
                    int i18 = fVar.e;
                    if (i17 < i18) {
                        int i19 = (i18 * i16) + i17;
                        if (!fVar.h[i19] || i(fVar, i17, i16)) {
                            f13 = f26;
                            f14 = f27;
                            f15 = f28;
                            f16 = f22;
                            f17 = f21;
                        } else {
                            float f29 = i17;
                            float f30 = i16;
                            float c10 = (f12 - ((fVar.i[i19] * 0.06f) + a1.g.c((float) Math.hypot(f29 - f27, f30 - f27), f28, 0.52f, f25))) / 0.367f;
                            if (c10 > 0.0f) {
                                if (c10 >= 1.0f) {
                                    x10 = 1.0f;
                                } else {
                                    float f31 = 1.0f - c10;
                                    x10 = f1.x(f31, f31, f31, 1.0f);
                                }
                                float l4 = this.q == 2 ? (0.6f * x10) + 0.4f : l(c10);
                                if (this.q != 2) {
                                    x10 = Math.min(1.0f, c10 * 6.0f);
                                }
                                int i20 = fVar.j;
                                if (i17 < i20 || i17 >= (i10 = fVar.k) || i16 < i20 || i16 >= i10) {
                                    float f32 = i15;
                                    float f33 = fVar.f;
                                    int i21 = (int) ((f29 * f33) + f32);
                                    int i22 = (int) ((f30 * f33) + f32);
                                    float f34 = l4;
                                    float f35 = ((i17 + 1) * f33) + f32;
                                    float f36 = f27;
                                    f15 = f28;
                                    int ceil = (int) Math.ceil(f35);
                                    int ceil2 = (int) Math.ceil(((i16 + 1) * fVar.f) + f32);
                                    Rect rect = this.v;
                                    rect.set(i21, i22, ceil, ceil2);
                                    float f37 = i21 + ceil;
                                    f14 = f36;
                                    float f38 = f24;
                                    f17 = f7;
                                    float c11 = a1.g.c(f37, f38, f26, f17);
                                    float f39 = i22 + ceil2;
                                    f16 = f10;
                                    float c12 = a1.g.c(f39, f38, f26, f16);
                                    float f40 = ((ceil - i21) / f38) * f26 * f34;
                                    float f41 = ((ceil2 - i22) / f38) * f26 * f34;
                                    f13 = f26;
                                    rectF.set(c11 - f40, c12 - f41, c11 + f40, c12 + f41);
                                    paint2.setAlpha((int) (x10 * 255.0f));
                                    f fVar2 = this.n;
                                    canvas.drawBitmap(fVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(zs.e4);
                                }
                            }
                            f17 = f7;
                            f13 = f26;
                            f14 = f27;
                            f15 = f28;
                            f16 = f10;
                        }
                        i17++;
                        f21 = f17;
                        f22 = f16;
                        f26 = f13;
                        f28 = f15;
                        f27 = f14;
                        f24 = 2.0f;
                        f25 = 0.05f;
                    }
                }
                i16++;
                f22 = f22;
                f27 = f27;
                i13 = 0;
                f24 = 2.0f;
                f25 = 0.05f;
            }
            float f42 = f22;
            float f43 = f21;
            float f44 = f11 / fVar.b;
            int i23 = 0;
            while (i23 < 3) {
                int i24 = i23 == i12 ? fVar.e - 7 : 0;
                int i25 = i23 == 2 ? fVar.e - 7 : 0;
                float f45 = f12 / 0.32f;
                if (f45 > 0.0f) {
                    float f46 = i15;
                    float f47 = fVar.f;
                    float f48 = (((i24 * f47) + f46) * f44) + f43;
                    float f49 = (((i25 * f47) + f46) * f44) + f42;
                    float f50 = ((((i24 + 7) * f47) + f46) * f44) + f43;
                    float f51 = ((((i25 + 7) * f47) + f46) * f44) + f42;
                    float l10 = l(f45);
                    canvas.save();
                    canvas.scale(l10, l10, (f48 + f50) / 2.0f, (f49 + f51) / 2.0f);
                    canvas.clipRect(f48 - 1.0f, f49 - 1.0f, f50 + 1.0f, f51 + 1.0f);
                    rectF.set(f43, f42, f43 + f11, f42 + f11);
                    paint2.setAlpha(zs.e4);
                    canvas.drawBitmap(fVar.a, fVar.c, rectF, paint2);
                    canvas.restore();
                }
                i23++;
                i12 = 1;
            }
            paint2.setAlpha(zs.e4);
            return;
        }
        m(fVar);
        int i26 = fVar.g;
        int i27 = fVar.m * 2;
        int i28 = fVar.e;
        g((i28 * i28) + i27);
        Bitmap bitmap = this.J;
        Bitmap bitmap2 = fVar.a;
        Paint paint3 = this.K;
        if (bitmap != bitmap2) {
            Bitmap bitmap3 = fVar.a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            this.J = fVar.a;
        }
        float f52 = f11 / fVar.b;
        float min = Math.min(1.0f, Math.max(0.0f, f23) / 0.1f);
        float f53 = fVar.f * 0.5f;
        float f54 = 1.0f;
        boolean z10 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i29 < fVar.m) {
            float f55 = (f23 - fVar.p[i29]) / 0.434f;
            if (f55 < 0.0f) {
                f55 = 0.0f;
            } else if (f55 > f54) {
                f55 = f54;
            }
            if (f55 < 0.5f) {
                f19 = c3.i0.E(f55, 4.0f, f55, f55);
            } else {
                float f56 = (f55 * (-2.0f)) + 2.0f;
                f19 = f54 - (((f56 * f56) * f56) * 0.5f);
            }
            float f57 = (fVar.n[i29] * f52) + f21;
            float f58 = (fVar.o[i29] * f52) + f22;
            if (fVar.q[i29]) {
                float f59 = f19 > 0.75f ? 4.0f * (f19 - 0.75f) : 0.0f;
                paint = paint3;
                if (f59 < f54) {
                    float C = c3.i0.C(f19, 0.8f, 0.2f, f53 * f52);
                    int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                    float f60 = (f54 - f59) * min;
                    if (f60 > 0.004f) {
                        n(this.L, this.M, this.P, i30, f57 - C, f58 - C, f57 + C, f58 + C, min2 * 48, fVar.d, r7 + 48, r5 + 48, (((int) (f60 * 255.0f)) << 24) | o());
                        i30++;
                    }
                    z10 = false;
                }
                if (f59 > 0.0f) {
                    float f61 = i26;
                    int[] iArr = fVar.r;
                    float f62 = iArr[i29 * 4];
                    float f63 = fVar.f;
                    float f64 = (f62 * f63) + f61;
                    float f65 = (iArr[r5 + 1] * f63) + f61;
                    float f66 = f64 + f63;
                    float f67 = f65 + f63;
                    n(this.N, this.O, this.Q, i31, (f64 * f52) + f21, (f65 * f52) + f22, (f66 * f52) + f21, (f67 * f52) + f22, f64, f65, f66, f67, (((int) (min * 255.0f)) << 24) | o());
                    i31++;
                }
            } else {
                paint = paint3;
                float f68 = (f54 - f19) * 0.2f;
                boolean z11 = f19 < f54 ? false : z10;
                if (f19 < 0.7f) {
                    f20 = f68;
                    y3 = f54;
                } else {
                    f20 = f68;
                    y3 = m5.y(f19, 0.7f, 0.3f, f54);
                }
                float f69 = 0.9f * min * y3;
                if (f20 <= 0.01f || f69 <= 0.004f) {
                    z10 = z11;
                } else {
                    float f70 = f53 * f52 * f20;
                    n(this.L, this.M, this.P, i30, f57 - f70, f58 - f70, f57 + f70, f58 + f70, 0.0f, fVar.d, 48.0f, r5 + 48, (((int) (f69 * 255.0f)) << 24) | o());
                    z10 = z11;
                    i30++;
                }
            }
            i29++;
            f23 = f12;
            paint3 = paint;
            f54 = 1.0f;
        }
        Paint paint4 = paint3;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
        float x11 = f1.x(max, max, max, 1.0f);
        if (x11 > 0.0f) {
            int i32 = fVar.j;
            while (i32 < fVar.k) {
                int i33 = fVar.j;
                int i34 = i31;
                while (i33 < fVar.k) {
                    if (fVar.h[(fVar.e * i32) + i33]) {
                        float f71 = i26;
                        float f72 = fVar.f;
                        float f73 = (i33 * f72) + f71;
                        float f74 = (i32 * f72) + f71;
                        f18 = x11;
                        float f75 = f73 + f72;
                        float f76 = f74 + f72;
                        n(this.N, this.O, this.Q, i34, (f73 * f52) + f21, (f74 * f52) + f22, (f75 * f52) + f21, (f76 * f52) + f22, f73, f74, f75, f76, (((int) ((min * 255.0f) * f18)) << 24) | o());
                        i34++;
                    } else {
                        f18 = x11;
                    }
                    i33++;
                    x11 = f18;
                }
                i32++;
                i31 = i34;
            }
        }
        if (z10 && min >= 1.0f) {
            rectF.set(f21, f22, f21 + f11, f22 + f11);
            canvas.drawBitmap(fVar.a, fVar.c, rectF, paint2);
            return;
        }
        if (i30 > 0) {
            int i35 = i31 * 8;
            int i36 = i30 * 8;
            System.arraycopy(this.L, 0, this.N, i35, i36);
            System.arraycopy(this.M, 0, this.O, i35, i36);
            System.arraycopy(this.P, 0, this.Q, i31 * 4, i30 * 4);
        }
        int i37 = i31 + i30;
        if (i37 > 0) {
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i37 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i37 * 6, paint4);
        }
    }

    public final void g(int i10) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.L = new float[i11];
            this.M = new float[i11];
            int i12 = i10 * 4;
            this.P = new int[i12];
            this.N = new float[i11];
            this.O = new float[i11];
            this.Q = new int[i12];
            this.R = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.R;
                int i15 = i13 * 6;
                short s10 = (short) i14;
                sArr[i15] = s10;
                sArr[i15 + 1] = (short) (i14 + 1);
                short s11 = (short) (i14 + 2);
                sArr[i15 + 2] = s11;
                sArr[i15 + 3] = s10;
                sArr[i15 + 4] = s11;
                sArr[i15 + 5] = (short) (i14 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
