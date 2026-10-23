package zh;

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
import com.google.android.gms.internal.play_billing.k3;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.sl;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f {
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
    public e m;
    public e n;
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
        synchronized (f.class) {
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

    public static e c(String str, int i10, ic.c cVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.a, cVar);
            hashMap.put(dc.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            if (colorDrawable != null) {
                telegramQRCodeWriter.setCenterDrawable(colorDrawable);
            }
            e eVar = new e();
            Bitmap encode = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, f7, 0, -1);
            eVar.b = encode.getWidth();
            int i11 = ((kc.b) kc.c.b(str, cVar, hashMap).f).b;
            eVar.e = i11;
            eVar.f = (eVar.b - (eVar.g * 2.0f)) / i11;
            int i12 = i11 * i11;
            eVar.h = new boolean[i12];
            eVar.i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < eVar.e; i13++) {
                for (int i14 = 0; i14 < eVar.e; i14++) {
                    float f10 = eVar.g;
                    float f11 = i14 + 0.5f;
                    float f12 = eVar.f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int b10 = (int) sl.b(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        z10 = Color.alpha(encode.getPixel(Math.max(0, Math.min(eVar.b - 1, ((int) ((((float) i16) * eVar.f) * 0.3f)) + i15)), b10)) > 40;
                    }
                    boolean[] zArr = eVar.h;
                    int i17 = (eVar.e * i13) + i14;
                    zArr[i17] = z10;
                    eVar.i[i17] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i18 = eVar.b;
            eVar.d = i18 + 2;
            eVar.a = Bitmap.createBitmap(Math.max(i18, b11.getWidth()), eVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(eVar.a);
            canvas.drawBitmap(encode, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, eVar.d, (Paint) null);
            encode.recycle();
            eVar.a.prepareToDraw();
            Rect rect = eVar.c;
            int i19 = eVar.b;
            rect.set(0, 0, i19, i19);
            eVar.l = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / eVar.f) + 2;
            int i20 = (eVar.e - round) / 2;
            eVar.j = i20;
            eVar.k = i20 + round;
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float h(e eVar, float f7) {
        float f10 = 1.0f - f7;
        return sl.b(eVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * (f10 * f10)), -1.5f);
    }

    public static boolean i(e eVar, int i10, int i11) {
        if (i10 < 7 && i11 < 7) {
            return true;
        }
        int i12 = eVar.e;
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
        float y3 = k3.y(cbrt4, cbrt, f7, cbrt);
        float y10 = k3.y(cbrt5, cbrt2, f7, cbrt2);
        float y11 = k3.y(cbrt6, cbrt3, f7, cbrt3);
        float f16 = y3 * y3 * y3;
        float f17 = y10 * y10 * y10;
        float f18 = y11 * y11 * y11;
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

    public static void m(e eVar) {
        int i10;
        int i11;
        if (eVar.n != null) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= eVar.e) {
                break;
            }
            for (int i14 = 0; i14 < eVar.e; i14++) {
                int i15 = eVar.j;
                if (i14 < i15 || i14 >= (i11 = eVar.k) || i12 < i15 || i12 >= i11) {
                    i13++;
                }
            }
            i12++;
        }
        eVar.m = i13;
        eVar.n = new float[i13];
        eVar.o = new float[i13];
        eVar.p = new float[i13];
        eVar.q = new boolean[i13];
        eVar.r = new int[i13 * 4];
        float f7 = 1.4142f * ((r4 - 1) / 2.0f);
        int i16 = 0;
        for (int i17 = 0; i17 < eVar.e; i17++) {
            int i18 = 0;
            while (true) {
                int i19 = eVar.e;
                if (i18 < i19) {
                    int i20 = eVar.j;
                    if (i18 < i20 || i18 >= (i10 = eVar.k) || i17 < i20 || i17 >= i10) {
                        int i21 = (i19 * i17) + i18;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f7;
                        float f10 = eVar.i[i21] * 3.17f;
                        float floor = f10 - ((float) Math.floor(f10));
                        boolean i22 = i(eVar, i18, i17);
                        float[] fArr = eVar.n;
                        float f11 = eVar.g;
                        float f12 = eVar.f;
                        fArr[i16] = ((i18 + 0.5f) * f12) + f11;
                        eVar.o[i16] = sl.b(i17, 0.5f, f12, f11);
                        float f13 = hypot * 0.5f;
                        eVar.p[i16] = i22 ? f13 * 0.85f : f13 + (floor * 0.06f);
                        eVar.q[i16] = eVar.h[i21];
                        int[] iArr = eVar.r;
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

    public final void a(e eVar) {
        this.m = eVar;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0318, code lost:
    
        r7 = r7 + 1;
        r5 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0a1d  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7, float f10, float f11) {
        float f12;
        byte[] bArr;
        float f13;
        float f14;
        float f15;
        f fVar;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f16;
        float f17;
        float f18;
        e eVar;
        Paint paint;
        Paint paint2;
        e eVar2;
        RectF rectF2;
        Rect rect;
        float f19;
        int i10;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        RectF rectF3;
        e eVar3;
        int i14;
        float f20;
        ?? r02;
        e eVar4;
        float f21;
        int i15;
        int i16;
        int i17;
        int i18;
        float f22;
        float y3;
        float f23;
        float f24;
        float f25;
        float f26;
        float dp;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f27 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || SharedConfig.getDevicePerformanceClass() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i19 = this.q;
        long j10 = (i19 != 1 && i19 == 2) ? 380L : 450L;
        float f28 = this.o;
        if (f28 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i19 != 2 || (this.D < 0.0f && !this.F)) {
            f12 = 0.01f;
            if (f28 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr = d1.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr[51]));
            float f29 = fArr[53] / 100.0f;
            if (f29 > 0.01f) {
                float f30 = S;
                min2 = min2 < f29 ? (min2 * f30) / f29 : (((1.0f - f30) * (min2 - f29)) / Math.max(0.01f, 1.0f - f29)) + f30;
            }
            float p5 = p(min2 * 0.467f);
            float f31 = fArr[52];
            if (f31 > 0.0f) {
                float f32 = T;
                if (min2 > f32) {
                    float p9 = p(f32 * 0.467f);
                    float f33 = 1.0f - f32;
                    f12 = 0.01f;
                    float min3 = Math.min(((p((f32 + 0.002f) * 0.467f) - p9) / 0.002f) * f33, (1.0f - p9) * 3.0f);
                    float f34 = (min2 - f32) / f33;
                    float f35 = f34 * f34;
                    float f36 = f35 * f34;
                    float f37 = f35 * 3.0f;
                    p5 = ((((((f36 * (-2.0f)) + f37) * 1.0f) + ((((f36 - (f35 * 2.0f)) + f34) * min3) + ((((f36 * 2.0f) - f37) + 1.0f) * p9))) - p5) * f31) + p5;
                    max = Math.max(f28, min2 < 1.0f ? 1.0f : Math.min(1.0f, p5));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f12 = 0.01f;
            max = Math.max(f28, min2 < 1.0f ? 1.0f : Math.min(1.0f, p5));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint3 = this.t;
        paint3.setColorFilter(porterDuffColorFilter);
        float f38 = f11 / 2.0f;
        this.B = f7 + f38;
        this.C = f10 + f38;
        int i20 = this.q;
        RectF rectF4 = this.w;
        float f39 = 0.3f;
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
        if (i20 == 2) {
            float f40 = this.o;
            if (f40 < 1.0f) {
                bArr = bArr2;
                f(canvas, this.m, f7, f10, f11, f40);
                fVar = this;
                canvas2 = canvas;
                f18 = 0.0f;
                rectF = rectF4;
                f16 = min;
                f17 = 1.6f;
                i18 = fVar.l - 1;
                while (i18 >= 0) {
                    float f41 = fArr5[i18] + f16;
                    fArr5[i18] = f41;
                    if (f41 >= fArr6[i18]) {
                        int i21 = fVar.l - 1;
                        fVar.l = i21;
                        fArr11[i18] = fArr11[i21];
                        fArr10[i18] = fArr10[i21];
                        fArr8[i18] = fArr8[i21];
                        fArr7[i18] = fArr7[i21];
                        fArr9[i18] = fArr9[i21];
                        fArr6[i18] = fArr6[i21];
                        fArr5[i18] = fArr5[i21];
                        fArr4[i18] = fArr4[i21];
                        fArr3[i18] = fArr3[i21];
                        fArr2[i18] = fArr2[i21];
                        bArr[i18] = bArr[i21];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i18]);
                        Paint paint4 = fVar.u;
                        if (isNaN || fArr5[i18] >= f18) {
                            RectF rectF5 = fVar.r;
                            if (isNaN) {
                                fArr7[i18] = fArr7[i18] - (AndroidUtilities.dp(20.0f) * f16);
                                f22 = f16;
                                fArr8[i18] = k3.B(f22, 2.4f, 1.0f, fArr8[i18]);
                                fArr7[i18] = k3.B(f22, 3.0f, 1.0f, fArr7[i18]);
                                if (!rectF5.isEmpty() && fArr10[i18] < rectF5.top - AndroidUtilities.dp(56.0f)) {
                                    fArr7[i18] = fArr7[i18] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f18, 1.0f - (f16 * 6.5f));
                                fArr8[i18] = fArr8[i18] * max2;
                                fArr7[i18] = (fArr7[i18] * max2) - (AndroidUtilities.dp(260.0f) * f16);
                                f22 = f16;
                            }
                            fArr11[i18] = (fArr8[i18] * f22) + fArr11[i18];
                            fArr10[i18] = (fArr7[i18] * f22) + fArr10[i18];
                            fArr4[i18] = (fArr3[i18] * f22) + fArr4[i18];
                            float f42 = fArr5[i18] / fArr6[i18];
                            if (isNaN) {
                                if (f42 < 0.08f) {
                                    f23 = f42 / 0.08f;
                                } else {
                                    y3 = org.telegram.messenger.v0.y(f42, 0.08f, 0.92f, 1.0f);
                                    if (isNaN) {
                                        dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i18];
                                        if (dp > 0.0f) {
                                        }
                                    }
                                    f24 = 1.0f;
                                    float f43 = f24 - f42;
                                    float f44 = fArr9[i18] * (f24 - ((f24 - (f43 * f43)) * (isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i18] != 2) {
                                    }
                                }
                            } else if (f42 < 0.35f) {
                                y3 = 1.0f;
                                if (isNaN && !rectF5.isEmpty()) {
                                    dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i18];
                                    if (dp > 0.0f) {
                                        f24 = 1.0f;
                                        y3 *= Math.max(0.0f, 1.0f - (dp / AndroidUtilities.dp(24.0f)));
                                        float f432 = f24 - f42;
                                        float f442 = fArr9[i18] * (f24 - ((f24 - (f432 * f432)) * (isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i18] != 2) {
                                            paint4.setColor(-1);
                                            float f45 = y3 * 255.0f;
                                            paint4.setAlpha((int) (f45 * 0.9f));
                                            canvas2.drawCircle(fArr11[i18], fArr10[i18], f442, paint4);
                                            paint4.setAlpha((int) (f45 * 0.22f));
                                            canvas2.drawCircle(fArr11[i18], fArr10[i18], f442 * 2.6f, paint4);
                                            i18--;
                                            f16 = f22;
                                            f18 = 0.0f;
                                        } else {
                                            if (rectF5.isEmpty()) {
                                                f25 = 0.0f;
                                                f26 = 0.0f;
                                            } else {
                                                float f46 = rectF5.left;
                                                float f47 = fArr11[i18];
                                                f25 = 0.0f;
                                                float max3 = Math.max(f46 - f47, Math.max(0.0f, f47 - rectF5.right));
                                                float f48 = rectF5.top;
                                                float f49 = fArr10[i18];
                                                f26 = Math.min(1.0f, Math.max(max3, Math.max(f48 - f49, Math.max(0.0f, f49 - rectF5.bottom))) / AndroidUtilities.dp(36.0f));
                                            }
                                            paint4.setColor(f26 > f25 ? k(f26, fVar.y, -1) : fVar.y);
                                            paint4.setAlpha((int) (y3 * 255.0f));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i18], fArr11[i18], fArr10[i18]);
                                            float f50 = fArr11[i18];
                                            float f51 = f442 / 2.0f;
                                            float f52 = fArr10[i18];
                                            rectF.set(f50 - f51, f52 - f51, f50 + f51, f52 + f51);
                                            float f53 = f442 * f39;
                                            canvas2.drawRoundRect(rectF, f53, f53, paint4);
                                            if (bArr[i18] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f42 * f17) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (y3 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f53, f53, paint4);
                                            }
                                            canvas2.restore();
                                            i18--;
                                            f16 = f22;
                                            f18 = 0.0f;
                                        }
                                    }
                                }
                                f24 = 1.0f;
                                float f4322 = f24 - f42;
                                float f4422 = fArr9[i18] * (f24 - ((f24 - (f4322 * f4322)) * (isNaN ? 0.35f : 0.85f)));
                                if (bArr[i18] != 2) {
                                }
                            } else {
                                f23 = org.telegram.messenger.v0.y(f42, 0.35f, 0.65f, 1.0f);
                            }
                            y3 = f23;
                            if (isNaN) {
                            }
                            f24 = 1.0f;
                            float f43222 = f24 - f42;
                            float f44222 = fArr9[i18] * (f24 - ((f24 - (f43222 * f43222)) * (isNaN ? 0.35f : 0.85f)));
                            if (bArr[i18] != 2) {
                            }
                        } else {
                            paint4.setColor(fVar.y);
                            paint4.setAlpha(255);
                            float f54 = fArr9[i18];
                            float f55 = fArr11[i18];
                            float f56 = f54 / 2.0f;
                            float f57 = fArr10[i18];
                            rectF.set(f55 - f56, f57 - f56, f55 + f56, f57 + f56);
                            float f58 = f54 * f39;
                            canvas2.drawRoundRect(rectF, f58, f58, paint4);
                        }
                    }
                    f22 = f16;
                    i18--;
                    f16 = f22;
                    f18 = 0.0f;
                }
            }
            bArr = bArr2;
            f13 = 3.0f;
        } else {
            bArr = bArr2;
            f13 = 3.0f;
        }
        int i22 = 2400;
        Random random = this.x;
        float f59 = f13;
        if (i20 != 1 || (eVar4 = this.n) == null) {
            f14 = f7;
            f15 = f10;
            fVar = this;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f60 = f11 / eVar4.b;
                    int i23 = 0;
                    loop1: while (i23 < eVar4.e) {
                        int i24 = 0;
                        while (true) {
                            int i25 = eVar4.e;
                            if (i24 < i25) {
                                if (!eVar4.h[(i25 * i23) + i24] || ((i24 >= (i16 = eVar4.j) && i24 < (i17 = eVar4.k) && i23 >= i16 && i23 < i17) || random.nextFloat() < 0.4f)) {
                                    i15 = i24;
                                } else {
                                    int i26 = this.l;
                                    if (i26 >= i22) {
                                        i26 = -1;
                                    } else {
                                        this.l = i26 + 1;
                                    }
                                    if (i26 < 0) {
                                        break loop1;
                                    }
                                    float f61 = eVar4.g;
                                    float f62 = eVar4.f;
                                    float f63 = ((((i24 + 0.5f) * f62) + f61) * f60) + f7;
                                    float f64 = ((((i23 + 0.5f) * f62) + f61) * f60) + f10;
                                    float f65 = f63 - this.B;
                                    float max4 = Math.max(f27, Math.abs(f65));
                                    float nextFloat = (random.nextFloat() * AndroidUtilities.dp(900.0f)) + AndroidUtilities.dp(1000.0f);
                                    i15 = i24;
                                    float radians = (float) Math.toRadians((random.nextFloat() - 0.5f) * 36.0f);
                                    bArr[i26] = (byte) (random.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i26] = f63;
                                    fArr10[i26] = f64;
                                    fArr9[i26] = ((random.nextFloat() * 0.6f) + 0.7f) * eVar4.f * f60;
                                    double d = radians;
                                    fArr8[i26] = (Math.min(1.0f, max4 / (f11 * 0.5f)) * Math.signum(f65) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i26] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i26] = org.telegram.ui.Cells.b1.d(random, 0.06f, 0.24f);
                                    fArr5[i26] = (-(((eVar4.e - 1) - i23) / 4)) * 0.018f;
                                    fArr4[i26] = random.nextFloat() * 90.0f;
                                    fArr3[i26] = (random.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i26] = 1.0f;
                                }
                                i24 = i15 + 1;
                                i22 = 2400;
                                f27 = 1.0f;
                            }
                        }
                    }
                }
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f21 = 1.0f;
                    } else if (max5 < 0.45f) {
                        float f66 = 1.0f - (max5 / 0.45f);
                        f21 = ((1.0f - (f66 * f66)) * 0.12f) + 0.92f;
                    } else {
                        float f67 = (max5 - 0.45f) / 0.55f;
                        f21 = 1.04f - ((f59 - (f67 * 2.0f)) * ((0.04f * f67) * f67));
                    }
                    canvas.save();
                    canvas.scale(f21, f21, this.B, this.C);
                    f(canvas, this.m, f7, f10, f11, max5);
                    fVar = this;
                    canvas.restore();
                } else {
                    fVar = this;
                }
                canvas2 = canvas;
                rectF = rectF4;
                f16 = min;
                f17 = 1.6f;
                f18 = 0.0f;
                i18 = fVar.l - 1;
                while (i18 >= 0) {
                }
            }
            f14 = f7;
            f15 = f10;
            fVar = this;
        }
        float f68 = 0.5f;
        float f69 = 0.45f;
        if (fVar.o >= 1.0f || (eVar = fVar.n) == null) {
            canvas2 = canvas;
            float f70 = f15;
            rectF = rectF4;
            f16 = min;
            float f71 = f14;
            f17 = 1.6f;
            f18 = 0.0f;
            e eVar5 = fVar.m;
            int i27 = eVar5.b;
            rectF.set(f71, f70, f71 + f11, f70 + f11);
            canvas2.drawBitmap(eVar5.a, eVar5.c, rectF, paint3);
        } else {
            e eVar6 = fVar.m;
            m(eVar);
            int i28 = eVar.g;
            m(eVar6);
            Rect rect3 = eVar6.c;
            int i29 = eVar6.g;
            fVar.g(Math.max(eVar.m, eVar6.m));
            Bitmap bitmap = fVar.H;
            Bitmap bitmap2 = eVar.a;
            Paint paint5 = fVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = eVar.a;
                f16 = min;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                fVar.H = eVar.a;
            } else {
                f16 = min;
            }
            Bitmap bitmap4 = fVar.J;
            Bitmap bitmap5 = eVar6.a;
            Paint paint6 = fVar.K;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = eVar6.a;
                paint = paint5;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                fVar.J = eVar6.a;
            } else {
                paint = paint5;
            }
            float h = h(eVar, fVar.o);
            float h10 = h(eVar6, fVar.o);
            float f72 = f11 / eVar.b;
            float f73 = f11 / eVar6.b;
            int i30 = 0;
            int i31 = 0;
            while (i30 < eVar.m) {
                if (eVar.q[i30]) {
                    int[] iArr = eVar.r;
                    int i32 = i30 * 4;
                    int i33 = iArr[i32];
                    int i34 = iArr[i32 + 1];
                    i12 = i30;
                    int i35 = (i34 * eVar.e) + i33;
                    float f74 = (eVar.i[i35] * 3.2f) + ((r10 - 1) - i34);
                    if (h > f74) {
                        boolean[] zArr = fVar.s;
                        if (zArr[i35]) {
                            rect2 = rect3;
                            i13 = i29;
                        } else {
                            zArr[i35] = z10;
                            float f75 = i28;
                            float f76 = i33 + 0.5f;
                            float f77 = eVar.f;
                            float f78 = (((f76 * f77) + f75) * f72) + f14;
                            float f79 = ((((i34 + 0.5f) * f77) + f75) * f72) + f15;
                            float f80 = f77 * f72;
                            float f81 = f78 - fVar.B;
                            float f82 = f79 - fVar.C;
                            rectF3 = rectF4;
                            rect2 = rect3;
                            i13 = i29;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f81, f82));
                            float f83 = f81 / max6;
                            float f84 = f82 / max6;
                            float nextFloat2 = random.nextFloat();
                            int i36 = (nextFloat2 > 0.12f ? 1 : (nextFloat2 == 0.12f ? 0 : -1));
                            int i37 = i36 < 0 ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i38 = 0;
                            while (i38 < i37) {
                                int i39 = fVar.l;
                                int i40 = i37;
                                if (i39 >= 2400) {
                                    i39 = -1;
                                } else {
                                    fVar.l = i39 + 1;
                                }
                                if (i39 < 0) {
                                    break;
                                }
                                boolean z11 = (i38 <= 0 || random.nextFloat() >= f39) ? false : z10;
                                if (z11) {
                                    f20 = f84;
                                    r02 = 2;
                                } else if (random.nextFloat() < 0.14f) {
                                    f20 = f84;
                                    r02 = z10;
                                } else {
                                    f20 = f84;
                                    r02 = 0;
                                }
                                bArr[i39] = (byte) r02;
                                fArr11[i39] = ((random.nextFloat() - 0.5f) * f80 * 0.5f) + f78;
                                fArr10[i39] = ((random.nextFloat() - 0.5f) * f80 * 0.5f) + f79;
                                if (z11) {
                                    fArr9[i39] = AndroidUtilities.dpf2((random.nextFloat() * 0.9f) + 0.9f);
                                } else if (i38 != 0 || i36 >= 0) {
                                    fArr9[i39] = ((random.nextFloat() * 0.55f) + f39) * f80;
                                } else {
                                    fArr9[i39] = ((random.nextFloat() * f69) + 1.25f) * f80;
                                }
                                float nextFloat3 = (random.nextFloat() * AndroidUtilities.dp(150.0f)) + AndroidUtilities.dp(110.0f);
                                float f85 = f83;
                                float d10 = org.telegram.ui.Cells.b1.d(random, 0.35f, f69);
                                fArr8[i39] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(90.0f)) + (f85 * nextFloat3 * d10);
                                fArr7[i39] = k3.D(1.0f, d10, nextFloat3, (f20 * nextFloat3) * d10) - AndroidUtilities.dp(30.0f);
                                fArr6[i39] = org.telegram.ui.Cells.b1.d(random, 0.2f, f39);
                                fArr5[i39] = 0.0f;
                                fArr4[i39] = random.nextFloat() * 90.0f;
                                fArr3[i39] = (random.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i39] = Float.NaN;
                                i38++;
                                i36 = i36;
                                i37 = i40;
                                f84 = f20;
                                f83 = f85;
                                f69 = 0.45f;
                            }
                            eVar3 = eVar;
                            i14 = i28;
                            i30 = i12 + 1;
                            eVar = eVar3;
                            rectF4 = rectF3;
                            rect3 = rect2;
                            i29 = i13;
                            i28 = i14;
                            f39 = 0.3f;
                            f69 = 0.45f;
                        }
                    } else {
                        rect2 = rect3;
                        i13 = i29;
                        rectF3 = rectF4;
                        float min4 = 1.0f - Math.min(1.0f, (f74 - h) / 2.2f);
                        float dpf2 = min4 > 0.0f ? AndroidUtilities.dpf2(1.4f) * ((float) Math.sin((fVar.o * 60.0f) + (i34 * 7) + (i33 * 13))) * min4 : 0.0f;
                        float dpf22 = AndroidUtilities.dpf2(1.5f) * (-min4);
                        float f86 = i28;
                        float f87 = i33;
                        float f88 = eVar.f;
                        float f89 = (f87 * f88) + f86;
                        float f90 = (i34 * f88) + f86;
                        float f91 = f89 + f88;
                        eVar3 = eVar;
                        float f92 = f90 + f88;
                        i14 = i28;
                        n(fVar.L, fVar.M, fVar.P, i31, si.o0.c(f89, f72, f14, dpf2), si.o0.c(f90, f72, f15, dpf22), si.o0.c(f91, f72, f14, dpf2), si.o0.c(f92, f72, f15, dpf22), f89, f90, f91, f92, (((int) k3.B(min4, 0.25f, 1.0f, 255.0f)) << 24) | fVar.o());
                        i31++;
                        i30 = i12 + 1;
                        eVar = eVar3;
                        rectF4 = rectF3;
                        rect3 = rect2;
                        i29 = i13;
                        i28 = i14;
                        f39 = 0.3f;
                        f69 = 0.45f;
                    }
                } else {
                    rect2 = rect3;
                    i13 = i29;
                    i12 = i30;
                }
                rectF3 = rectF4;
                eVar3 = eVar;
                i14 = i28;
                i30 = i12 + 1;
                eVar = eVar3;
                rectF4 = rectF3;
                rect3 = rect2;
                i29 = i13;
                i28 = i14;
                f39 = 0.3f;
                f69 = 0.45f;
            }
            Rect rect4 = rect3;
            int i41 = i29;
            RectF rectF6 = rectF4;
            f18 = 0.0f;
            float f93 = 3.2f;
            boolean z12 = z10;
            int i42 = 0;
            int i43 = 0;
            while (i42 < eVar6.m) {
                if (eVar6.q[i42]) {
                    int[] iArr2 = eVar6.r;
                    int i44 = i42 * 4;
                    int i45 = iArr2[i44];
                    int i46 = iArr2[i44 + 1];
                    float c10 = si.o0.c(eVar6.i[(i46 * eVar6.e) + i45], f93, (r6 - 1) - i46, 1.6f);
                    if (h10 <= c10) {
                        i11 = i41;
                        z12 = false;
                        f93 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (h10 - c10) / 2.4f);
                        i11 = i41;
                        float f94 = i11;
                        float f95 = eVar6.f;
                        float f96 = (i45 * f95) + f94;
                        float f97 = (i46 * f95) + f94;
                        float f98 = f96 + f95;
                        float f99 = f97 + f95;
                        float f100 = min5 - 1.0f;
                        f93 = 3.2f;
                        float f101 = (((f100 * 2.2f * f100) + (f100 * 3.2f * f100 * f100) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f101 - 1.0f) < f12)) {
                            n(fVar.N, fVar.O, fVar.Q, i43, (f96 * f73) + f14, (f97 * f73) + f15, (f98 * f73) + f14, (f99 * f73) + f15, f96, f97, f98, f99, fVar.o() | (-16777216));
                            i43++;
                        } else {
                            float f102 = ((f96 + f98) * f68 * f73) + f14;
                            float f103 = ((f97 + f99) * f68 * f73) + f15;
                            float C = k3.C(eVar6.f, f68, f73, f101);
                            n(fVar.N, fVar.O, fVar.Q, i43, f102 - C, f103 - C, f102 + C, f103 + C, f96, f97, f98, f99, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | fVar.o());
                            i43++;
                            z12 = false;
                        }
                    }
                } else {
                    i11 = i41;
                }
                i42++;
                i41 = i11;
                f68 = 0.5f;
            }
            int i47 = i41;
            if (i31 == 0 && z12) {
                fVar.o = 1.0f;
                rectF = rectF6;
                rectF.set(f14, f15, f14 + f11, f15 + f11);
                canvas.drawBitmap(eVar6.a, rect4, rectF, paint3);
                canvas2 = canvas;
                f17 = 1.6f;
                f39 = 0.3f;
            } else {
                if (i31 > 0) {
                    f17 = 1.6f;
                    paint2 = paint3;
                    i10 = i47;
                    f19 = f73;
                    rectF2 = rectF6;
                    rect = rect4;
                    f39 = 0.3f;
                    eVar2 = eVar6;
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i31 * 8, fVar.L, 0, fVar.M, 0, fVar.P, 0, fVar.R, 0, i31 * 6, paint);
                } else {
                    paint2 = paint3;
                    eVar2 = eVar6;
                    rectF2 = rectF6;
                    rect = rect4;
                    f19 = f73;
                    f17 = 1.6f;
                    i10 = i47;
                    f39 = 0.3f;
                }
                if (i43 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i43 * 8, fVar.N, 0, fVar.O, 0, fVar.Q, 0, fVar.R, 0, i43 * 6, paint6);
                } else {
                    canvas2 = canvas;
                }
                float f104 = i10;
                float f105 = eVar2.j;
                float f106 = eVar2.f;
                float f107 = f19;
                float A = k3.A(f105, f106, f104, f107);
                float A2 = k3.A(eVar2.k, f106, f104, f107);
                canvas2.save();
                canvas2.clipRect(A + f7, A + f10, A2 + f7, A2 + f10);
                rectF = rectF2;
                rectF.set(f7, f10, f7 + f11, f10 + f11);
                canvas2.drawBitmap(eVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i18 = fVar.l - 1;
        while (i18 >= 0) {
        }
    }

    public final void f(Canvas canvas, e eVar, float f7, float f10, float f11, float f12) {
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
            int i14 = eVar.b;
            int i15 = eVar.g;
            float f26 = f11 / i14;
            float f27 = (eVar.e - 1) / 2.0f;
            float f28 = 1.4142f * f27;
            int i16 = 0;
            while (i16 < eVar.e) {
                int i17 = i13;
                while (true) {
                    int i18 = eVar.e;
                    if (i17 < i18) {
                        int i19 = (i18 * i16) + i17;
                        if (!eVar.h[i19] || i(eVar, i17, i16)) {
                            f13 = f26;
                            f14 = f27;
                            f15 = f28;
                            f16 = f22;
                            f17 = f21;
                        } else {
                            float f29 = i17;
                            float f30 = i16;
                            float d = (f12 - ((eVar.i[i19] * 0.06f) + a1.g.d((float) Math.hypot(f29 - f27, f30 - f27), f28, 0.52f, f25))) / 0.367f;
                            if (d > 0.0f) {
                                if (d >= 1.0f) {
                                    x10 = 1.0f;
                                } else {
                                    float f31 = 1.0f - d;
                                    x10 = org.telegram.ui.Cells.b1.x(f31, f31, f31, 1.0f);
                                }
                                float l4 = this.q == 2 ? (0.6f * x10) + 0.4f : l(d);
                                if (this.q != 2) {
                                    x10 = Math.min(1.0f, d * 6.0f);
                                }
                                int i20 = eVar.j;
                                if (i17 < i20 || i17 >= (i10 = eVar.k) || i16 < i20 || i16 >= i10) {
                                    float f32 = i15;
                                    float f33 = eVar.f;
                                    int i21 = (int) ((f29 * f33) + f32);
                                    int i22 = (int) ((f30 * f33) + f32);
                                    float f34 = l4;
                                    float f35 = ((i17 + 1) * f33) + f32;
                                    float f36 = f27;
                                    f15 = f28;
                                    int ceil = (int) Math.ceil(f35);
                                    int ceil2 = (int) Math.ceil(((i16 + 1) * eVar.f) + f32);
                                    Rect rect = this.v;
                                    rect.set(i21, i22, ceil, ceil2);
                                    float f37 = i21 + ceil;
                                    f14 = f36;
                                    float f38 = f24;
                                    f17 = f7;
                                    float d10 = a1.g.d(f37, f38, f26, f17);
                                    float f39 = i22 + ceil2;
                                    f16 = f10;
                                    float d11 = a1.g.d(f39, f38, f26, f16);
                                    float f40 = ((ceil - i21) / f38) * f26 * f34;
                                    float f41 = ((ceil2 - i22) / f38) * f26 * f34;
                                    f13 = f26;
                                    rectF.set(d10 - f40, d11 - f41, d10 + f40, d11 + f41);
                                    paint2.setAlpha((int) (x10 * 255.0f));
                                    e eVar2 = this.n;
                                    canvas.drawBitmap(eVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(255);
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
            float f44 = f11 / eVar.b;
            int i23 = 0;
            while (i23 < 3) {
                int i24 = i23 == i12 ? eVar.e - 7 : 0;
                int i25 = i23 == 2 ? eVar.e - 7 : 0;
                float f45 = f12 / 0.32f;
                if (f45 > 0.0f) {
                    float f46 = i15;
                    float f47 = eVar.f;
                    float f48 = (((i24 * f47) + f46) * f44) + f43;
                    float f49 = (((i25 * f47) + f46) * f44) + f42;
                    float f50 = ((((i24 + 7) * f47) + f46) * f44) + f43;
                    float f51 = ((((i25 + 7) * f47) + f46) * f44) + f42;
                    float l10 = l(f45);
                    canvas.save();
                    canvas.scale(l10, l10, (f48 + f50) / 2.0f, (f49 + f51) / 2.0f);
                    canvas.clipRect(f48 - 1.0f, f49 - 1.0f, f50 + 1.0f, f51 + 1.0f);
                    rectF.set(f43, f42, f43 + f11, f42 + f11);
                    paint2.setAlpha(255);
                    canvas.drawBitmap(eVar.a, eVar.c, rectF, paint2);
                    canvas.restore();
                }
                i23++;
                i12 = 1;
            }
            paint2.setAlpha(255);
            return;
        }
        m(eVar);
        int i26 = eVar.g;
        int i27 = eVar.m * 2;
        int i28 = eVar.e;
        g((i28 * i28) + i27);
        Bitmap bitmap = this.J;
        Bitmap bitmap2 = eVar.a;
        Paint paint3 = this.K;
        if (bitmap != bitmap2) {
            Bitmap bitmap3 = eVar.a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            this.J = eVar.a;
        }
        float f52 = f11 / eVar.b;
        float min = Math.min(1.0f, Math.max(0.0f, f23) / 0.1f);
        float f53 = eVar.f * 0.5f;
        float f54 = 1.0f;
        boolean z10 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i29 < eVar.m) {
            float f55 = (f23 - eVar.p[i29]) / 0.434f;
            if (f55 < 0.0f) {
                f55 = 0.0f;
            } else if (f55 > f54) {
                f55 = f54;
            }
            if (f55 < 0.5f) {
                f19 = k3.C(f55, 4.0f, f55, f55);
            } else {
                float f56 = (f55 * (-2.0f)) + 2.0f;
                f19 = f54 - (((f56 * f56) * f56) * 0.5f);
            }
            float f57 = (eVar.n[i29] * f52) + f21;
            float f58 = (eVar.o[i29] * f52) + f22;
            if (eVar.q[i29]) {
                float f59 = f19 > 0.75f ? 4.0f * (f19 - 0.75f) : 0.0f;
                paint = paint3;
                if (f59 < f54) {
                    float A = k3.A(f19, 0.8f, 0.2f, f53 * f52);
                    int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                    float f60 = (f54 - f59) * min;
                    if (f60 > 0.004f) {
                        n(this.L, this.M, this.P, i30, f57 - A, f58 - A, f57 + A, f58 + A, min2 * 48, eVar.d, r7 + 48, r5 + 48, (((int) (f60 * 255.0f)) << 24) | o());
                        i30++;
                    }
                    z10 = false;
                }
                if (f59 > 0.0f) {
                    float f61 = i26;
                    int[] iArr = eVar.r;
                    float f62 = iArr[i29 * 4];
                    float f63 = eVar.f;
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
                    y3 = org.telegram.messenger.v0.y(f19, 0.7f, 0.3f, f54);
                }
                float f69 = 0.9f * min * y3;
                if (f20 <= 0.01f || f69 <= 0.004f) {
                    z10 = z11;
                } else {
                    float f70 = f53 * f52 * f20;
                    n(this.L, this.M, this.P, i30, f57 - f70, f58 - f70, f57 + f70, f58 + f70, 0.0f, eVar.d, 48.0f, r5 + 48, (((int) (f69 * 255.0f)) << 24) | o());
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
        float x11 = org.telegram.ui.Cells.b1.x(max, max, max, 1.0f);
        if (x11 > 0.0f) {
            int i32 = eVar.j;
            while (i32 < eVar.k) {
                int i33 = eVar.j;
                int i34 = i31;
                while (i33 < eVar.k) {
                    if (eVar.h[(eVar.e * i32) + i33]) {
                        float f71 = i26;
                        float f72 = eVar.f;
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
            canvas.drawBitmap(eVar.a, eVar.c, rectF, paint2);
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
