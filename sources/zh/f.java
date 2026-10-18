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
import android.os.Build;
import com.google.android.gms.internal.play_billing.k3;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.kk;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
            if (o(f11 * 0.467f) >= 0.5f) {
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
            if (o(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        S = f7;
        T = f10;
    }

    public static synchronized Bitmap a() {
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

    public static e b(int i10, String str) {
        try {
            HashMap hashMap = new HashMap();
            dc.b bVar = dc.b.a;
            ic.c cVar = ic.c.c;
            hashMap.put(bVar, cVar);
            hashMap.put(dc.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            e eVar = new e();
            Bitmap encode = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, 0.75f, 0, -1);
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
                    float f7 = eVar.g;
                    float f10 = i14 + 0.5f;
                    float f11 = eVar.f;
                    int i15 = (int) ((f10 * f11) + f7);
                    int b10 = (int) kk.b(i13, 0.5f, f11, f7);
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
            Bitmap a2 = a();
            int i18 = eVar.b;
            eVar.d = i18 + 2;
            eVar.a = Bitmap.createBitmap(Math.max(i18, a2.getWidth()), eVar.d + a2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(eVar.a);
            canvas.drawBitmap(encode, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(a2, 0.0f, eVar.d, (Paint) null);
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

    public static int c(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float g(e eVar, float f7) {
        float f10 = 1.0f - f7;
        return kk.b(eVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * (f10 * f10)), -1.5f);
    }

    public static boolean h(e eVar, int i10, int i11) {
        if (i10 < 7 && i11 < 7) {
            return true;
        }
        int i12 = eVar.e;
        if (i10 < i12 - 7 || i11 >= 7) {
            return i10 < 7 && i11 >= i12 - 7;
        }
        return true;
    }

    public static float i(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int j(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float p5 = p(Color.red(i10) / 255.0f);
        float p9 = p(Color.green(i10) / 255.0f);
        float p10 = p(Color.blue(i10) / 255.0f);
        float p11 = p(Color.red(i11) / 255.0f);
        float p12 = p(Color.green(i11) / 255.0f);
        float p13 = p(Color.blue(i11) / 255.0f);
        float f10 = p10 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (p9 * 0.53633255f) + (p5 * 0.41222146f));
        float f11 = p10 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (p9 * 0.6806995f) + (p5 * 0.2119035f));
        float f12 = p10 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (p9 * 0.28171885f) + (p5 * 0.08830246f));
        float f13 = 0.051445995f * p13;
        float cbrt4 = (float) Math.cbrt(f13 + (0.53633255f * p12) + (0.41222146f * p11));
        float f14 = 0.10739696f * p13;
        float cbrt5 = (float) Math.cbrt(f14 + (0.6806995f * p12) + (0.2119035f * p11));
        float f15 = p13 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f15 + (p12 * 0.28171885f) + (p11 * 0.08830246f));
        float y3 = k3.y(cbrt4, cbrt, f7, cbrt);
        float y10 = k3.y(cbrt5, cbrt2, f7, cbrt2);
        float y11 = k3.y(cbrt6, cbrt3, f7, cbrt3);
        float f16 = y3 * y3 * y3;
        float f17 = y10 * y10 * y10;
        float f18 = y11 * y11 * y11;
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), c(i((0.23096994f * f18) + ((4.0767417f * f16) - (3.3077116f * f17)))), c(i(((2.6097574f * f17) + ((-1.268438f) * f16)) - (0.34131938f * f18))), c(i((f18 * 1.7076147f) + ((f16 * (-0.0041960864f)) - (f17 * 0.7034186f)))));
    }

    public static float k(float f7) {
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

    public static void l(e eVar) {
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
                        boolean h = h(eVar, i18, i17);
                        float[] fArr = eVar.n;
                        float f11 = eVar.g;
                        float f12 = eVar.f;
                        fArr[i16] = ((i18 + 0.5f) * f12) + f11;
                        eVar.o[i16] = kk.b(i17, 0.5f, f12, f11);
                        float f13 = hypot * 0.5f;
                        eVar.p[i16] = h ? f13 * 0.85f : f13 + (floor * 0.06f);
                        eVar.q[i16] = eVar.h[i21];
                        int[] iArr = eVar.r;
                        int i22 = i16 * 4;
                        iArr[i22] = i18;
                        iArr[i22 + 1] = i17;
                        i16++;
                    }
                    i18++;
                }
            }
        }
    }

    public static void m(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
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

    public static float o(float f7) {
        double d = f7;
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float p(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x031d, code lost:
    
        r7 = r7 + 1;
        r5 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a07  */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7, float f10, float f11) {
        float f12;
        byte[] bArr;
        float f13;
        RectF rectF;
        float f14;
        float f15;
        f fVar;
        boolean z10;
        float f16;
        Canvas canvas2;
        float f17;
        float f18;
        float f19;
        float f20;
        e eVar;
        Paint paint;
        Paint paint2;
        Rect rect;
        float f21;
        RectF rectF2;
        e eVar2;
        int i10;
        float f22;
        int i11;
        float f23;
        RectF rectF3;
        Random random;
        float f24;
        Random random2;
        e eVar3;
        int i12;
        int i13;
        ?? r02;
        e eVar4;
        float f25;
        int i14;
        int i15;
        int i16;
        int i17;
        float f26;
        float x10;
        float f27;
        float f28;
        float f29;
        float f30;
        float dp;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f31 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || SharedConfig.getDevicePerformanceClass() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i18 = this.q;
        long j10 = (i18 != 1 && i18 == 2) ? 380L : 450L;
        float f32 = this.o;
        if (f32 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i18 != 2 || (this.D < 0.0f && !this.F)) {
            f12 = 0.01f;
            if (f32 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr = v0.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr[51]));
            float f33 = fArr[53] / 100.0f;
            if (f33 > 0.01f) {
                float f34 = S;
                min2 = min2 < f33 ? (min2 * f34) / f33 : (((1.0f - f34) * (min2 - f33)) / Math.max(0.01f, 1.0f - f33)) + f34;
            }
            float o10 = o(min2 * 0.467f);
            float f35 = fArr[52];
            if (f35 > 0.0f) {
                float f36 = T;
                if (min2 > f36) {
                    float o11 = o(f36 * 0.467f);
                    float f37 = 1.0f - f36;
                    f12 = 0.01f;
                    float min3 = Math.min(((o((f36 + 0.002f) * 0.467f) - o11) / 0.002f) * f37, (1.0f - o11) * 3.0f);
                    float f38 = (min2 - f36) / f37;
                    float f39 = f38 * f38;
                    float f40 = f39 * f38;
                    float f41 = f39 * 3.0f;
                    o10 = ((((((f40 * (-2.0f)) + f41) * 1.0f) + ((((f40 - (f39 * 2.0f)) + f38) * min3) + ((((f40 * 2.0f) - f41) + 1.0f) * o11))) - o10) * f35) + o10;
                    max = Math.max(f32, min2 < 1.0f ? 1.0f : Math.min(1.0f, o10));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f12 = 0.01f;
            max = Math.max(f32, min2 < 1.0f ? 1.0f : Math.min(1.0f, o10));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint3 = this.t;
        paint3.setColorFilter(porterDuffColorFilter);
        float f42 = f11 / 2.0f;
        this.B = f7 + f42;
        this.C = f10 + f42;
        int i19 = this.q;
        RectF rectF4 = this.w;
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
        if (i19 == 2) {
            float f43 = this.o;
            if (f43 < 1.0f) {
                bArr = bArr2;
                rectF = rectF4;
                e(canvas, this.m, f7, f10, f11, f43);
                fVar = this;
                canvas2 = canvas;
                f20 = 0.0f;
                f17 = min;
                f18 = 1.6f;
                f19 = 255.0f;
                f16 = 0.3f;
                i17 = fVar.l - 1;
                while (i17 >= 0) {
                    float f44 = fArr5[i17] + f17;
                    fArr5[i17] = f44;
                    if (f44 >= fArr6[i17]) {
                        int i20 = fVar.l - 1;
                        fVar.l = i20;
                        fArr11[i17] = fArr11[i20];
                        fArr10[i17] = fArr10[i20];
                        fArr8[i17] = fArr8[i20];
                        fArr7[i17] = fArr7[i20];
                        fArr9[i17] = fArr9[i20];
                        fArr6[i17] = fArr6[i20];
                        fArr5[i17] = fArr5[i20];
                        fArr4[i17] = fArr4[i20];
                        fArr3[i17] = fArr3[i20];
                        fArr2[i17] = fArr2[i20];
                        bArr[i17] = bArr[i20];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i17]);
                        Paint paint4 = fVar.u;
                        if (isNaN || fArr5[i17] >= f20) {
                            RectF rectF5 = fVar.r;
                            if (isNaN) {
                                fArr7[i17] = fArr7[i17] - (AndroidUtilities.dp(20.0f) * f17);
                                f26 = f17;
                                fArr8[i17] = k3.B(f26, 2.4f, 1.0f, fArr8[i17]);
                                fArr7[i17] = k3.B(f26, 3.0f, 1.0f, fArr7[i17]);
                                if (!rectF5.isEmpty() && fArr10[i17] < rectF5.top - AndroidUtilities.dp(56.0f)) {
                                    fArr7[i17] = fArr7[i17] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f20, 1.0f - (f17 * 6.5f));
                                fArr8[i17] = fArr8[i17] * max2;
                                fArr7[i17] = (fArr7[i17] * max2) - (AndroidUtilities.dp(260.0f) * f17);
                                f26 = f17;
                            }
                            fArr11[i17] = (fArr8[i17] * f26) + fArr11[i17];
                            fArr10[i17] = (fArr7[i17] * f26) + fArr10[i17];
                            fArr4[i17] = (fArr3[i17] * f26) + fArr4[i17];
                            float f45 = fArr5[i17] / fArr6[i17];
                            if (isNaN) {
                                if (f45 < 0.08f) {
                                    f27 = f45 / 0.08f;
                                } else {
                                    x10 = org.telegram.messenger.g0.x(f45, 0.08f, 0.92f, 1.0f);
                                    if (isNaN) {
                                        dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i17];
                                        if (dp > 0.0f) {
                                        }
                                    }
                                    f28 = 1.0f;
                                    float f46 = f28 - f45;
                                    float f47 = fArr9[i17] * (f28 - ((f28 - (f46 * f46)) * (isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i17] != 2) {
                                    }
                                    i17--;
                                    f17 = f26;
                                    f20 = 0.0f;
                                }
                            } else if (f45 < 0.35f) {
                                x10 = 1.0f;
                                if (isNaN && !rectF5.isEmpty()) {
                                    dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i17];
                                    if (dp > 0.0f) {
                                        f28 = 1.0f;
                                        x10 *= Math.max(0.0f, 1.0f - (dp / AndroidUtilities.dp(24.0f)));
                                        float f462 = f28 - f45;
                                        float f472 = fArr9[i17] * (f28 - ((f28 - (f462 * f462)) * (isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i17] != 2) {
                                            paint4.setColor(-1);
                                            float f48 = x10 * f19;
                                            paint4.setAlpha((int) (f48 * 0.9f));
                                            canvas2.drawCircle(fArr11[i17], fArr10[i17], f472, paint4);
                                            paint4.setAlpha((int) (f48 * 0.22f));
                                            canvas2.drawCircle(fArr11[i17], fArr10[i17], f472 * 2.6f, paint4);
                                        } else {
                                            if (rectF5.isEmpty()) {
                                                f29 = 0.0f;
                                                f30 = 0.0f;
                                            } else {
                                                float f49 = rectF5.left;
                                                float f50 = fArr11[i17];
                                                f29 = 0.0f;
                                                float max3 = Math.max(f49 - f50, Math.max(0.0f, f50 - rectF5.right));
                                                float f51 = rectF5.top;
                                                float f52 = fArr10[i17];
                                                f30 = Math.min(1.0f, Math.max(max3, Math.max(f51 - f52, Math.max(0.0f, f52 - rectF5.bottom))) / AndroidUtilities.dp(36.0f));
                                            }
                                            paint4.setColor(f30 > f29 ? j(f30, fVar.y, -1) : fVar.y);
                                            paint4.setAlpha((int) (x10 * f19));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i17], fArr11[i17], fArr10[i17]);
                                            float f53 = fArr11[i17];
                                            float f54 = f472 / 2.0f;
                                            float f55 = fArr10[i17];
                                            rectF.set(f53 - f54, f55 - f54, f53 + f54, f55 + f54);
                                            float f56 = f472 * f16;
                                            canvas2.drawRoundRect(rectF, f56, f56, paint4);
                                            if (bArr[i17] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f45 * f18) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (x10 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f56, f56, paint4);
                                            }
                                            canvas2.restore();
                                        }
                                        i17--;
                                        f17 = f26;
                                        f20 = 0.0f;
                                    }
                                }
                                f28 = 1.0f;
                                float f4622 = f28 - f45;
                                float f4722 = fArr9[i17] * (f28 - ((f28 - (f4622 * f4622)) * (isNaN ? 0.35f : 0.85f)));
                                if (bArr[i17] != 2) {
                                }
                                i17--;
                                f17 = f26;
                                f20 = 0.0f;
                            } else {
                                f27 = org.telegram.messenger.g0.x(f45, 0.35f, 0.65f, 1.0f);
                            }
                            x10 = f27;
                            if (isNaN) {
                            }
                            f28 = 1.0f;
                            float f46222 = f28 - f45;
                            float f47222 = fArr9[i17] * (f28 - ((f28 - (f46222 * f46222)) * (isNaN ? 0.35f : 0.85f)));
                            if (bArr[i17] != 2) {
                            }
                            i17--;
                            f17 = f26;
                            f20 = 0.0f;
                        } else {
                            paint4.setColor(fVar.y);
                            paint4.setAlpha(255);
                            float f57 = fArr9[i17];
                            float f58 = fArr11[i17];
                            float f59 = f57 / 2.0f;
                            float f60 = fArr10[i17];
                            rectF.set(f58 - f59, f60 - f59, f58 + f59, f60 + f59);
                            float f61 = f57 * f16;
                            canvas2.drawRoundRect(rectF, f61, f61, paint4);
                        }
                    }
                    f26 = f17;
                    i17--;
                    f17 = f26;
                    f20 = 0.0f;
                }
            }
            bArr = bArr2;
            f13 = 3.0f;
        } else {
            bArr = bArr2;
            f13 = 3.0f;
        }
        rectF = rectF4;
        int i21 = 2400;
        Random random3 = this.x;
        float f62 = f13;
        if (i19 != 1 || (eVar4 = this.n) == null) {
            f14 = f7;
            f15 = f10;
            fVar = this;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f63 = f11 / eVar4.b;
                    int i22 = 0;
                    loop1: while (i22 < eVar4.e) {
                        int i23 = 0;
                        while (true) {
                            int i24 = eVar4.e;
                            if (i23 < i24) {
                                f16 = 0.3f;
                                if (!eVar4.h[(i24 * i22) + i23] || ((i23 >= (i15 = eVar4.j) && i23 < (i16 = eVar4.k) && i22 >= i15 && i22 < i16) || random3.nextFloat() < 0.4f)) {
                                    i14 = i23;
                                } else {
                                    int i25 = this.l;
                                    if (i25 >= i21) {
                                        i25 = -1;
                                    } else {
                                        this.l = i25 + 1;
                                    }
                                    if (i25 < 0) {
                                        break loop1;
                                    }
                                    float f64 = eVar4.g;
                                    float f65 = eVar4.f;
                                    float f66 = ((((i23 + 0.5f) * f65) + f64) * f63) + f7;
                                    float f67 = ((((i22 + 0.5f) * f65) + f64) * f63) + f10;
                                    float f68 = f66 - this.B;
                                    float max4 = Math.max(f31, Math.abs(f68));
                                    float nextFloat = (random3.nextFloat() * AndroidUtilities.dp(900.0f)) + AndroidUtilities.dp(1000.0f);
                                    i14 = i23;
                                    float radians = (float) Math.toRadians((random3.nextFloat() - 0.5f) * 36.0f);
                                    bArr[i25] = (byte) (random3.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i25] = f66;
                                    fArr10[i25] = f67;
                                    fArr9[i25] = ((random3.nextFloat() * 0.6f) + 0.7f) * eVar4.f * f63;
                                    double d = radians;
                                    fArr8[i25] = (Math.min(1.0f, max4 / (f11 * 0.5f)) * Math.signum(f68) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i25] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i25] = c1.d(random3, 0.06f, 0.24f);
                                    fArr5[i25] = (-(((eVar4.e - 1) - i22) / 4)) * 0.018f;
                                    fArr4[i25] = random3.nextFloat() * 90.0f;
                                    fArr3[i25] = (random3.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i25] = 1.0f;
                                }
                                i23 = i14 + 1;
                                i21 = 2400;
                                f31 = 1.0f;
                            }
                        }
                    }
                }
                f16 = 0.3f;
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f25 = 1.0f;
                    } else if (max5 < 0.45f) {
                        float f69 = 1.0f - (max5 / 0.45f);
                        f25 = ((1.0f - (f69 * f69)) * 0.12f) + 0.92f;
                    } else {
                        float f70 = (max5 - 0.45f) / 0.55f;
                        f25 = 1.04f - ((f62 - (f70 * 2.0f)) * ((0.04f * f70) * f70));
                    }
                    canvas.save();
                    canvas.scale(f25, f25, this.B, this.C);
                    e(canvas, this.m, f7, f10, f11, max5);
                    fVar = this;
                    canvas.restore();
                } else {
                    fVar = this;
                }
                canvas2 = canvas;
                f17 = min;
                f18 = 1.6f;
                f19 = 255.0f;
                f20 = 0.0f;
                i17 = fVar.l - 1;
                while (i17 >= 0) {
                }
            }
            f14 = f7;
            f15 = f10;
            fVar = this;
        }
        float f71 = 0.5f;
        f16 = 0.3f;
        float f72 = 0.45f;
        if (fVar.o >= 1.0f || (eVar = fVar.n) == null) {
            canvas2 = canvas;
            float f73 = f15;
            f17 = min;
            f18 = 1.6f;
            f19 = 255.0f;
            f20 = 0.0f;
            float f74 = f14;
            e eVar5 = fVar.m;
            int i26 = eVar5.b;
            rectF.set(f74, f73, f74 + f11, f73 + f11);
            canvas2.drawBitmap(eVar5.a, eVar5.c, rectF, paint3);
        } else {
            e eVar6 = fVar.m;
            l(eVar);
            int i27 = eVar.g;
            l(eVar6);
            Rect rect2 = eVar6.c;
            int i28 = eVar6.g;
            fVar.f(Math.max(eVar.m, eVar6.m));
            Bitmap bitmap = fVar.H;
            Bitmap bitmap2 = eVar.a;
            Paint paint5 = fVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = eVar.a;
                f17 = min;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                fVar.H = eVar.a;
            } else {
                f17 = min;
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
            float g10 = g(eVar, fVar.o);
            float g11 = g(eVar6, fVar.o);
            float f75 = f11 / eVar.b;
            float f76 = f11 / eVar6.b;
            int i29 = 0;
            int i30 = 0;
            while (i29 < eVar.m) {
                if (eVar.q[i29]) {
                    int[] iArr = eVar.r;
                    int i31 = i29 * 4;
                    int i32 = iArr[i31];
                    int i33 = iArr[i31 + 1];
                    i11 = i29;
                    int i34 = (i33 * eVar.e) + i32;
                    float f77 = (eVar.i[i34] * 3.2f) + ((r11 - 1) - i33);
                    if (g10 > f77) {
                        boolean[] zArr = fVar.s;
                        if (zArr[i34]) {
                            f23 = f76;
                        } else {
                            zArr[i34] = z10;
                            float f78 = i27;
                            float f79 = i32 + 0.5f;
                            float f80 = eVar.f;
                            float f81 = (((f79 * f80) + f78) * f75) + f14;
                            float f82 = ((((i33 + 0.5f) * f80) + f78) * f75) + f15;
                            float f83 = f80 * f75;
                            float f84 = f81 - fVar.B;
                            float f85 = f82 - fVar.C;
                            rectF3 = rectF;
                            f23 = f76;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f84, f85));
                            float f86 = f84 / max6;
                            float f87 = f85 / max6;
                            float nextFloat2 = random3.nextFloat();
                            int i35 = (nextFloat2 > 0.12f ? 1 : (nextFloat2 == 0.12f ? 0 : -1));
                            int i36 = i35 < 0 ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i37 = 0;
                            while (i37 < i36) {
                                float f88 = f87;
                                int i38 = fVar.l;
                                int i39 = i36;
                                if (i38 >= 2400) {
                                    i38 = -1;
                                } else {
                                    fVar.l = i38 + 1;
                                }
                                if (i38 < 0) {
                                    break;
                                }
                                boolean z11 = (i37 <= 0 || random3.nextFloat() >= f16) ? false : z10;
                                if (z11) {
                                    i13 = i38;
                                    r02 = 2;
                                } else if (random3.nextFloat() < 0.14f) {
                                    i13 = i38;
                                    r02 = z10;
                                } else {
                                    i13 = i38;
                                    r02 = 0;
                                }
                                bArr[i13] = (byte) r02;
                                fArr11[i13] = ((random3.nextFloat() - 0.5f) * f83 * 0.5f) + f81;
                                fArr10[i13] = ((random3.nextFloat() - 0.5f) * f83 * 0.5f) + f82;
                                if (z11) {
                                    fArr9[i13] = AndroidUtilities.dpf2((random3.nextFloat() * 0.9f) + 0.9f);
                                } else if (i37 != 0 || i35 >= 0) {
                                    fArr9[i13] = ((random3.nextFloat() * 0.55f) + f16) * f83;
                                } else {
                                    fArr9[i13] = ((random3.nextFloat() * f72) + 1.25f) * f83;
                                }
                                float nextFloat3 = (random3.nextFloat() * AndroidUtilities.dp(150.0f)) + AndroidUtilities.dp(110.0f);
                                float f89 = f72;
                                float f90 = f86;
                                int i40 = i35;
                                float d10 = c1.d(random3, 0.35f, f89);
                                fArr8[i13] = ((random3.nextFloat() - 0.5f) * AndroidUtilities.dp(90.0f)) + (f90 * nextFloat3 * d10);
                                fArr7[i13] = k3.D(1.0f, d10, nextFloat3, (f88 * nextFloat3) * d10) - AndroidUtilities.dp(30.0f);
                                fArr6[i13] = c1.d(random3, 0.2f, f16);
                                fArr5[i13] = 0.0f;
                                fArr4[i13] = random3.nextFloat() * 90.0f;
                                fArr3[i13] = (random3.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i13] = Float.NaN;
                                i37++;
                                f86 = f90;
                                f87 = f88;
                                i36 = i39;
                                i35 = i40;
                                f72 = 0.45f;
                            }
                            eVar3 = eVar;
                            i12 = i27;
                            random2 = random3;
                            i29 = i11 + 1;
                            random3 = random2;
                            rectF = rectF3;
                            f76 = f23;
                            eVar = eVar3;
                            i27 = i12;
                            f16 = 0.3f;
                            f72 = 0.45f;
                        }
                    } else {
                        f23 = f76;
                        rectF3 = rectF;
                        float min4 = 1.0f - Math.min(1.0f, (f77 - g10) / 2.2f);
                        if (min4 > 0.0f) {
                            random = random3;
                            f24 = AndroidUtilities.dpf2(1.4f) * ((float) Math.sin((fVar.o * 60.0f) + (i33 * 7) + (i32 * 13))) * min4;
                        } else {
                            random = random3;
                            f24 = 0.0f;
                        }
                        float dpf2 = (-min4) * AndroidUtilities.dpf2(1.5f);
                        random2 = random;
                        float f91 = i27;
                        float f92 = i32;
                        float f93 = eVar.f;
                        float f94 = (f92 * f93) + f91;
                        float f95 = (i33 * f93) + f91;
                        float f96 = f94 + f93;
                        eVar3 = eVar;
                        float f97 = f95 + f93;
                        i12 = i27;
                        m(fVar.L, fVar.M, fVar.P, i30, r4.c.c(f94, f75, f14, f24), r4.c.c(f95, f75, f15, dpf2), r4.c.c(f96, f75, f14, f24), r4.c.c(f97, f75, f15, dpf2), f94, f95, f96, f97, (((int) k3.B(min4, 0.25f, 1.0f, 255.0f)) << 24) | fVar.n());
                        i30++;
                        i29 = i11 + 1;
                        random3 = random2;
                        rectF = rectF3;
                        f76 = f23;
                        eVar = eVar3;
                        i27 = i12;
                        f16 = 0.3f;
                        f72 = 0.45f;
                    }
                } else {
                    f23 = f76;
                    i11 = i29;
                }
                rectF3 = rectF;
                eVar3 = eVar;
                i12 = i27;
                random2 = random3;
                i29 = i11 + 1;
                random3 = random2;
                rectF = rectF3;
                f76 = f23;
                eVar = eVar3;
                i27 = i12;
                f16 = 0.3f;
                f72 = 0.45f;
            }
            float f98 = f76;
            RectF rectF6 = rectF;
            f20 = 0.0f;
            float f99 = 3.2f;
            boolean z12 = z10;
            int i41 = 0;
            int i42 = 0;
            while (i41 < eVar6.m) {
                if (eVar6.q[i41]) {
                    int[] iArr2 = eVar6.r;
                    int i43 = i41 * 4;
                    int i44 = iArr2[i43];
                    int i45 = iArr2[i43 + 1];
                    float c10 = r4.c.c(eVar6.i[(i45 * eVar6.e) + i44], f99, (r9 - 1) - i45, 1.6f);
                    if (g11 <= c10) {
                        f22 = f98;
                        z12 = false;
                        f99 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (g11 - c10) / 2.4f);
                        float f100 = i28;
                        float f101 = eVar6.f;
                        float f102 = (i44 * f101) + f100;
                        float f103 = (i45 * f101) + f100;
                        float f104 = f102 + f101;
                        float f105 = f103 + f101;
                        float f106 = min5 - 1.0f;
                        f99 = 3.2f;
                        float f107 = (((f106 * 2.2f * f106) + (f106 * 3.2f * f106 * f106) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f107 - 1.0f) < f12)) {
                            f22 = f98;
                            m(fVar.N, fVar.O, fVar.Q, i42, (f102 * f22) + f14, (f103 * f22) + f15, (f104 * f22) + f14, (f105 * f22) + f15, f102, f103, f104, f105, fVar.n() | (-16777216));
                            i42++;
                        } else {
                            float f108 = ((f102 + f104) * f71 * f98) + f14;
                            float f109 = ((f103 + f105) * f71 * f98) + f15;
                            f22 = f98;
                            float C = k3.C(eVar6.f, f71, f22, f107);
                            m(fVar.N, fVar.O, fVar.Q, i42, f108 - C, f109 - C, f108 + C, f109 + C, f102, f103, f104, f105, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | fVar.n());
                            i42++;
                            z12 = false;
                        }
                    }
                } else {
                    f22 = f98;
                }
                i41++;
                f98 = f22;
                f71 = 0.5f;
            }
            float f110 = f98;
            f19 = 255.0f;
            if (i30 == 0 && z12) {
                fVar.o = 1.0f;
                rectF = rectF6;
                rectF.set(f14, f15, f14 + f11, f15 + f11);
                canvas.drawBitmap(eVar6.a, rect2, rectF, paint3);
                canvas2 = canvas;
                f18 = 1.6f;
                f16 = 0.3f;
            } else {
                if (i30 > 0) {
                    paint2 = paint3;
                    rect = rect2;
                    f21 = f110;
                    rectF2 = rectF6;
                    i10 = i28;
                    f18 = 1.6f;
                    f16 = 0.3f;
                    eVar2 = eVar6;
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i30 * 8, fVar.L, 0, fVar.M, 0, fVar.P, 0, fVar.R, 0, i30 * 6, paint);
                } else {
                    paint2 = paint3;
                    rect = rect2;
                    f21 = f110;
                    rectF2 = rectF6;
                    f18 = 1.6f;
                    f16 = 0.3f;
                    eVar2 = eVar6;
                    i10 = i28;
                }
                if (i42 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i42 * 8, fVar.N, 0, fVar.O, 0, fVar.Q, 0, fVar.R, 0, i42 * 6, paint6);
                } else {
                    canvas2 = canvas;
                }
                float f111 = i10;
                float f112 = eVar2.j;
                float f113 = eVar2.f;
                float f114 = f21;
                float A = k3.A(f112, f113, f111, f114);
                float A2 = k3.A(eVar2.k, f113, f111, f114);
                canvas2.save();
                canvas2.clipRect(A + f7, A + f10, A2 + f7, A2 + f10);
                rectF = rectF2;
                rectF.set(f7, f10, f7 + f11, f10 + f11);
                canvas2.drawBitmap(eVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i17 = fVar.l - 1;
        while (i17 >= 0) {
        }
    }

    public final void e(Canvas canvas, e eVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float z10;
        int i10;
        float f18;
        float f19;
        Paint paint;
        float f20;
        float x10;
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
                        if (!eVar.h[i19] || h(eVar, i17, i16)) {
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
                                    z10 = 1.0f;
                                } else {
                                    float f31 = 1.0f - d;
                                    z10 = c1.z(f31, f31, f31, 1.0f);
                                }
                                float k10 = this.q == 2 ? (0.6f * z10) + 0.4f : k(d);
                                if (this.q != 2) {
                                    z10 = Math.min(1.0f, d * 6.0f);
                                }
                                int i20 = eVar.j;
                                if (i17 < i20 || i17 >= (i10 = eVar.k) || i16 < i20 || i16 >= i10) {
                                    float f32 = i15;
                                    float f33 = eVar.f;
                                    int i21 = (int) ((f29 * f33) + f32);
                                    int i22 = (int) ((f30 * f33) + f32);
                                    float f34 = k10;
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
                                    paint2.setAlpha((int) (z10 * 255.0f));
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
                    float k11 = k(f45);
                    canvas.save();
                    canvas.scale(k11, k11, (f48 + f50) / 2.0f, (f49 + f51) / 2.0f);
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
        l(eVar);
        int i26 = eVar.g;
        int i27 = eVar.m * 2;
        int i28 = eVar.e;
        f((i28 * i28) + i27);
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
        boolean z11 = true;
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
                        m(this.L, this.M, this.P, i30, f57 - A, f58 - A, f57 + A, f58 + A, min2 * 48, eVar.d, r7 + 48, r5 + 48, (((int) (f60 * 255.0f)) << 24) | n());
                        i30++;
                    }
                    z11 = false;
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
                    m(this.N, this.O, this.Q, i31, (f64 * f52) + f21, (f65 * f52) + f22, (f66 * f52) + f21, (f67 * f52) + f22, f64, f65, f66, f67, (((int) (min * 255.0f)) << 24) | n());
                    i31++;
                }
            } else {
                paint = paint3;
                float f68 = (f54 - f19) * 0.2f;
                boolean z12 = f19 < f54 ? false : z11;
                if (f19 < 0.7f) {
                    f20 = f68;
                    x10 = f54;
                } else {
                    f20 = f68;
                    x10 = org.telegram.messenger.g0.x(f19, 0.7f, 0.3f, f54);
                }
                float f69 = 0.9f * min * x10;
                if (f20 <= 0.01f || f69 <= 0.004f) {
                    z11 = z12;
                } else {
                    float f70 = f53 * f52 * f20;
                    m(this.L, this.M, this.P, i30, f57 - f70, f58 - f70, f57 + f70, f58 + f70, 0.0f, eVar.d, 48.0f, r5 + 48, (((int) (f69 * 255.0f)) << 24) | n());
                    z11 = z12;
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
        float z13 = c1.z(max, max, max, 1.0f);
        if (z13 > 0.0f) {
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
                        f18 = z13;
                        float f75 = f73 + f72;
                        float f76 = f74 + f72;
                        m(this.N, this.O, this.Q, i34, (f73 * f52) + f21, (f74 * f52) + f22, (f75 * f52) + f21, (f76 * f52) + f22, f73, f74, f75, f76, (((int) ((min * 255.0f) * f18)) << 24) | n());
                        i34++;
                    } else {
                        f18 = z13;
                    }
                    i33++;
                    z13 = f18;
                }
                i32++;
                i31 = i34;
            }
        }
        if (z11 && min >= 1.0f) {
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

    public final void f(int i10) {
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

    public final int n() {
        return this.y & 16777215;
    }
}
