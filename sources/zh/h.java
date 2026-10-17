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
import com.google.android.gms.internal.cast.a6;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.wh;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h {
    public static final float U;
    public static final float V;
    public static Bitmap W;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public BitmapShader J;
    public Bitmap K;
    public float[] N;
    public float[] O;
    public float[] P;
    public float[] Q;
    public int[] R;
    public int[] S;
    public short[] T;
    public int l;
    public g m;
    public g n;
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
    public final Paint L = new Paint(3);
    public final Paint M = new Paint(3);

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
            if (m(f11 * 0.467f) >= 0.5f) {
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
            if (m(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        U = f7;
        V = f10;
    }

    public static g a(int i10, String str) {
        try {
            HashMap hashMap = new HashMap();
            dc.b bVar = dc.b.a;
            ic.c cVar = ic.c.c;
            hashMap.put(bVar, cVar);
            hashMap.put(dc.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            g gVar = new g();
            gVar.a = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, 0.75f, 0, -16777216);
            gVar.b = ((kc.b) kc.c.b(str, cVar, hashMap).f).b;
            float f7 = 16;
            int i11 = gVar.b;
            gVar.c = (gVar.a.getWidth() - (2.0f * f7)) / i11;
            int i12 = i11 * i11;
            gVar.d = new boolean[i12];
            gVar.e = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < gVar.b; i13++) {
                for (int i14 = 0; i14 < gVar.b; i14++) {
                    float f10 = i14 + 0.5f;
                    float f11 = gVar.c;
                    int i15 = (int) ((f10 * f11) + f7);
                    int b10 = (int) wh.b(i13, 0.5f, f11, f7);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        z10 = Color.alpha(gVar.a.getPixel(Math.max(0, Math.min(gVar.a.getWidth() - 1, ((int) ((((float) i16) * gVar.c) * 0.3f)) + i15)), b10)) > 40;
                    }
                    boolean[] zArr = gVar.d;
                    int i17 = (gVar.b * i13) + i14;
                    zArr[i17] = z10;
                    gVar.e[i17] = random.nextFloat();
                }
            }
            gVar.h = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / gVar.c) + 2;
            int i18 = (gVar.b - round) / 2;
            gVar.f = i18;
            gVar.g = i18 + round;
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int b(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float f(g gVar, float f7) {
        float f10 = 1.0f - f7;
        return wh.b(gVar.b, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * (f10 * f10)), -1.5f);
    }

    public static boolean g(g gVar, int i10, int i11) {
        if (i10 < 7 && i11 < 7) {
            return true;
        }
        int i12 = gVar.b;
        if (i10 < i12 - 7 || i11 >= 7) {
            return i10 < 7 && i11 >= i12 - 7;
        }
        return true;
    }

    public static float h(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int i(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float n10 = n(Color.red(i10) / 255.0f);
        float n11 = n(Color.green(i10) / 255.0f);
        float n12 = n(Color.blue(i10) / 255.0f);
        float n13 = n(Color.red(i11) / 255.0f);
        float n14 = n(Color.green(i11) / 255.0f);
        float n15 = n(Color.blue(i11) / 255.0f);
        float f10 = n12 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (n11 * 0.53633255f) + (n10 * 0.41222146f));
        float f11 = n12 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (n11 * 0.6806995f) + (n10 * 0.2119035f));
        float f12 = n12 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (n11 * 0.28171885f) + (n10 * 0.08830246f));
        float f13 = 0.051445995f * n15;
        float cbrt4 = (float) Math.cbrt(f13 + (0.53633255f * n14) + (0.41222146f * n13));
        float f14 = 0.10739696f * n15;
        float cbrt5 = (float) Math.cbrt(f14 + (0.6806995f * n14) + (0.2119035f * n13));
        float f15 = n15 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f15 + (n14 * 0.28171885f) + (n13 * 0.08830246f));
        float x10 = a6.x(cbrt4, cbrt, f7, cbrt);
        float x11 = a6.x(cbrt5, cbrt2, f7, cbrt2);
        float x12 = a6.x(cbrt6, cbrt3, f7, cbrt3);
        float f16 = x10 * x10 * x10;
        float f17 = x11 * x11 * x11;
        float f18 = x12 * x12 * x12;
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), b(h((0.23096994f * f18) + ((4.0767417f * f16) - (3.3077116f * f17)))), b(h(((2.6097574f * f17) + ((-1.268438f) * f16)) - (0.34131938f * f18))), b(h((f18 * 1.7076147f) + ((f16 * (-0.0041960864f)) - (f17 * 0.7034186f)))));
    }

    public static float j(float f7) {
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

    public static void k(g gVar) {
        int i10;
        int i11;
        if (gVar.j != null) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= gVar.b) {
                break;
            }
            for (int i14 = 0; i14 < gVar.b; i14++) {
                int i15 = gVar.f;
                if (i14 < i15 || i14 >= (i11 = gVar.g) || i12 < i15 || i12 >= i11) {
                    i13++;
                }
            }
            i12++;
        }
        gVar.i = i13;
        gVar.j = new float[i13];
        gVar.k = new float[i13];
        gVar.l = new float[i13];
        gVar.m = new boolean[i13];
        gVar.n = new int[i13 * 4];
        float f7 = 1.4142f * ((r4 - 1) / 2.0f);
        int i16 = 0;
        for (int i17 = 0; i17 < gVar.b; i17++) {
            int i18 = 0;
            while (true) {
                int i19 = gVar.b;
                if (i18 < i19) {
                    int i20 = gVar.f;
                    if (i18 < i20 || i18 >= (i10 = gVar.g) || i17 < i20 || i17 >= i10) {
                        int i21 = (i19 * i17) + i18;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f7;
                        float f10 = gVar.e[i21] * 3.17f;
                        float floor = f10 - ((float) Math.floor(f10));
                        boolean g10 = g(gVar, i18, i17);
                        float[] fArr = gVar.j;
                        float f11 = 16;
                        float f12 = gVar.c;
                        fArr[i16] = ((i18 + 0.5f) * f12) + f11;
                        gVar.k[i16] = wh.b(i17, 0.5f, f12, f11);
                        float f13 = hypot * 0.5f;
                        gVar.l[i16] = g10 ? f13 * 0.85f : f13 + (floor * 0.06f);
                        gVar.m[i16] = gVar.d[i21];
                        int[] iArr = gVar.n;
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

    public static void l(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
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

    public static float m(float f7) {
        double d = f7;
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float n(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f0, code lost:
    
        r15 = r15 + 1;
        r5 = 2400;
        r7 = 1.0f;
        r10 = 16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x09ac  */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11 */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f7, float f10, float f11) {
        float f12;
        byte[] bArr;
        float f13;
        h hVar;
        Canvas canvas2;
        boolean z10;
        float f14;
        float f15;
        float f16;
        float[] fArr;
        RectF rectF;
        float f17;
        float f18;
        float f19;
        g gVar;
        Paint paint;
        float f20;
        g gVar2;
        RectF rectF2;
        int i10;
        int i11;
        Paint paint2;
        RectF rectF3;
        Random random;
        float f21;
        g gVar3;
        int i12;
        int i13;
        g gVar4;
        float f22;
        float f23;
        float f24;
        int i14;
        int i15;
        int i16;
        ?? r42;
        int i17;
        float f25;
        float x10;
        float f26;
        float f27;
        float f28;
        byte b10;
        float f29;
        float dp;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        int i18 = this.q;
        long j10 = (i18 != 1 && i18 == 2) ? 380L : 450L;
        float f30 = this.o;
        float f31 = 1.0f;
        if (f30 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i18 != 2 || (this.D < 0.0f && !this.F)) {
            f12 = 0.01f;
            if (f30 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr2 = e1.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr2[51]));
            float f32 = fArr2[53] / 100.0f;
            if (f32 > 0.01f) {
                float f33 = U;
                min2 = min2 < f32 ? (min2 * f33) / f32 : (((1.0f - f33) * (min2 - f32)) / Math.max(0.01f, 1.0f - f32)) + f33;
            }
            float m10 = m(min2 * 0.467f);
            float f34 = fArr2[52];
            if (f34 > 0.0f) {
                float f35 = V;
                if (min2 > f35) {
                    float m11 = m(f35 * 0.467f);
                    float f36 = 1.0f - f35;
                    f12 = 0.01f;
                    float min3 = Math.min(((m((f35 + 0.002f) * 0.467f) - m11) / 0.002f) * f36, (1.0f - m11) * 3.0f);
                    float f37 = (min2 - f35) / f36;
                    float f38 = f37 * f37;
                    float f39 = f38 * f37;
                    float f40 = f38 * 3.0f;
                    m10 = ((((((f39 * (-2.0f)) + f40) * 1.0f) + ((((f39 - (f38 * 2.0f)) + f37) * min3) + ((((f39 * 2.0f) - f40) + 1.0f) * m11))) - m10) * f34) + m10;
                    max = Math.max(f30, min2 < 1.0f ? 1.0f : Math.min(1.0f, m10));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f12 = 0.01f;
            max = Math.max(f30, min2 < 1.0f ? 1.0f : Math.min(1.0f, m10));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint3 = this.t;
        paint3.setColorFilter(porterDuffColorFilter);
        float f41 = f11 / 2.0f;
        this.B = f7 + f41;
        this.C = f10 + f41;
        int i19 = this.q;
        RectF rectF4 = this.w;
        float f42 = 0.3f;
        float[] fArr3 = this.j;
        float[] fArr4 = this.i;
        float[] fArr5 = this.h;
        float[] fArr6 = this.g;
        float[] fArr7 = this.f;
        float[] fArr8 = this.d;
        float[] fArr9 = this.c;
        float[] fArr10 = this.e;
        float[] fArr11 = this.b;
        float[] fArr12 = this.a;
        byte[] bArr2 = this.k;
        if (i19 == 2) {
            float f43 = this.o;
            if (f43 < 1.0f) {
                bArr = bArr2;
                d(canvas, this.m, f7, f10, f11, f43);
                hVar = this;
                canvas2 = canvas;
                f19 = 1.0f;
                f18 = 0.0f;
                fArr = fArr3;
                rectF = rectF4;
                f17 = min;
                r42 = 1;
                i17 = hVar.l - 1;
                byte b11 = r42;
                while (i17 >= 0) {
                    float f44 = fArr6[i17] + f17;
                    fArr6[i17] = f44;
                    if (f44 >= fArr7[i17]) {
                        int i20 = hVar.l - 1;
                        hVar.l = i20;
                        fArr12[i17] = fArr12[i20];
                        fArr11[i17] = fArr11[i20];
                        fArr9[i17] = fArr9[i20];
                        fArr8[i17] = fArr8[i20];
                        fArr10[i17] = fArr10[i20];
                        fArr7[i17] = fArr7[i20];
                        fArr6[i17] = fArr6[i20];
                        fArr5[i17] = fArr5[i20];
                        fArr4[i17] = fArr4[i20];
                        fArr[i17] = fArr[i20];
                        bArr[i17] = bArr[i20];
                    } else {
                        boolean isNaN = Float.isNaN(fArr[i17]);
                        Paint paint4 = hVar.u;
                        if (isNaN || fArr6[i17] >= f18) {
                            RectF rectF5 = hVar.r;
                            if (isNaN) {
                                fArr8[i17] = fArr8[i17] - (AndroidUtilities.dp(20.0f) * f17);
                                float f45 = f19;
                                f25 = f17;
                                fArr9[i17] = a6.B(f25, 2.4f, f45, fArr9[i17]);
                                fArr8[i17] = a6.B(f25, 3.0f, f45, fArr8[i17]);
                                if (!rectF5.isEmpty() && fArr11[i17] < rectF5.top - AndroidUtilities.dp(56.0f)) {
                                    fArr8[i17] = fArr8[i17] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f18, f19 - (f17 * 6.5f));
                                fArr9[i17] = fArr9[i17] * max2;
                                fArr8[i17] = (fArr8[i17] * max2) - (AndroidUtilities.dp(260.0f) * f17);
                                f25 = f17;
                            }
                            fArr12[i17] = (fArr9[i17] * f25) + fArr12[i17];
                            fArr11[i17] = (fArr8[i17] * f25) + fArr11[i17];
                            fArr5[i17] = (fArr4[i17] * f25) + fArr5[i17];
                            float f46 = fArr6[i17] / fArr7[i17];
                            if (!isNaN) {
                                x10 = f46 < 0.35f ? 1.0f : org.telegram.messenger.q.x(f46, 0.35f, 0.65f, 1.0f);
                            } else if (f46 < 0.08f) {
                                x10 = f46 / 0.08f;
                            } else {
                                x10 = org.telegram.messenger.q.x(f46, 0.08f, 0.92f, 1.0f);
                                if (isNaN && !rectF5.isEmpty()) {
                                    dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr11[i17];
                                    if (dp > 0.0f) {
                                        f26 = 1.0f;
                                        x10 *= Math.max(0.0f, 1.0f - (dp / AndroidUtilities.dp(24.0f)));
                                        float f47 = f26 - f46;
                                        float f48 = fArr10[i17] * (f26 - ((f26 - (f47 * f47)) * (!isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i17] == 2) {
                                            paint4.setColor(-1);
                                            float f49 = x10 * 255.0f;
                                            paint4.setAlpha((int) (f49 * 0.9f));
                                            canvas2.drawCircle(fArr12[i17], fArr11[i17], f48, paint4);
                                            paint4.setAlpha((int) (f49 * 0.22f));
                                            canvas2.drawCircle(fArr12[i17], fArr11[i17], f48 * 2.6f, paint4);
                                            b10 = b11;
                                            f29 = 1.0f;
                                            i17--;
                                            b11 = b10;
                                            f17 = f25;
                                            f19 = f29;
                                            f18 = 0.0f;
                                        } else {
                                            if (rectF5.isEmpty()) {
                                                f27 = 0.0f;
                                                f28 = 0.0f;
                                            } else {
                                                float f50 = rectF5.left;
                                                float f51 = fArr12[i17];
                                                f27 = 0.0f;
                                                float max3 = Math.max(f50 - f51, Math.max(0.0f, f51 - rectF5.right));
                                                float f52 = rectF5.top;
                                                float f53 = fArr11[i17];
                                                f28 = Math.min(1.0f, Math.max(max3, Math.max(f52 - f53, Math.max(0.0f, f53 - rectF5.bottom))) / AndroidUtilities.dp(36.0f));
                                            }
                                            paint4.setColor(f28 > f27 ? i(f28, hVar.y, -1) : hVar.y);
                                            paint4.setAlpha((int) (x10 * 255.0f));
                                            canvas2.save();
                                            canvas2.rotate(fArr5[i17], fArr12[i17], fArr11[i17]);
                                            float f54 = fArr12[i17];
                                            float f55 = f48 / 2.0f;
                                            float f56 = fArr11[i17];
                                            rectF.set(f54 - f55, f56 - f55, f54 + f55, f56 + f55);
                                            float f57 = f48 * f42;
                                            canvas2.drawRoundRect(rectF, f57, f57, paint4);
                                            b10 = b11;
                                            if (bArr[i17] == b10) {
                                                f29 = 1.0f;
                                                float sin = (float) Math.sin(Math.min(1.0f, f46 * 1.6f) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (x10 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f57, f57, paint4);
                                            } else {
                                                f29 = 1.0f;
                                            }
                                            canvas2.restore();
                                            i17--;
                                            b11 = b10;
                                            f17 = f25;
                                            f19 = f29;
                                            f18 = 0.0f;
                                        }
                                    }
                                }
                                f26 = 1.0f;
                                float f472 = f26 - f46;
                                float f482 = fArr10[i17] * (f26 - ((f26 - (f472 * f472)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i17] == 2) {
                                }
                            }
                            if (isNaN) {
                                dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr11[i17];
                                if (dp > 0.0f) {
                                }
                            }
                            f26 = 1.0f;
                            float f4722 = f26 - f46;
                            float f4822 = fArr10[i17] * (f26 - ((f26 - (f4722 * f4722)) * (!isNaN ? 0.35f : 0.85f)));
                            if (bArr[i17] == 2) {
                            }
                        } else {
                            paint4.setColor(hVar.y);
                            paint4.setAlpha(255);
                            float f58 = fArr10[i17];
                            float f59 = fArr12[i17];
                            float f60 = f58 / 2.0f;
                            float f61 = fArr11[i17];
                            rectF.set(f59 - f60, f61 - f60, f59 + f60, f61 + f60);
                            float f62 = f58 * f42;
                            canvas2.drawRoundRect(rectF, f62, f62, paint4);
                        }
                    }
                    b10 = b11;
                    f29 = f19;
                    f25 = f17;
                    i17--;
                    b11 = b10;
                    f17 = f25;
                    f19 = f29;
                    f18 = 0.0f;
                }
            }
        }
        bArr = bArr2;
        int i21 = 16;
        int i22 = 2400;
        Random random2 = this.x;
        if (i19 != 1 || (gVar4 = this.n) == null) {
            f13 = f10;
            hVar = this;
            canvas2 = canvas;
            z10 = true;
            f14 = 0.5f;
            f15 = 0.45f;
            f16 = f7;
        } else {
            boolean z11 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float width = f11 / gVar4.a.getWidth();
                    int i23 = 0;
                    loop1: while (i23 < gVar4.b) {
                        int i24 = 0;
                        while (true) {
                            int i25 = gVar4.b;
                            if (i24 < i25) {
                                f22 = 0.45f;
                                if (!gVar4.d[(i25 * i23) + i24] || ((i24 >= (i15 = gVar4.f) && i24 < (i16 = gVar4.g) && i23 >= i15 && i23 < i16) || random2.nextFloat() < 0.4f)) {
                                    f24 = width;
                                    i14 = i24;
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
                                    float f63 = i21;
                                    float f64 = gVar4.c;
                                    float f65 = ((((i24 + 0.5f) * f64) + f63) * width) + f7;
                                    float f66 = ((((i23 + 0.5f) * f64) + f63) * width) + f10;
                                    float f67 = f65 - this.B;
                                    float max4 = Math.max(f31, Math.abs(f67));
                                    f24 = width;
                                    float nextFloat = (random2.nextFloat() * AndroidUtilities.dp(900.0f)) + AndroidUtilities.dp(1000.0f);
                                    i14 = i24;
                                    float radians = (float) Math.toRadians((random2.nextFloat() - 0.5f) * 36.0f);
                                    bArr[i26] = (byte) (random2.nextFloat() < 0.12f ? 1 : 0);
                                    fArr12[i26] = f65;
                                    fArr11[i26] = f66;
                                    fArr10[i26] = ((random2.nextFloat() * 0.6f) + 0.7f) * gVar4.c * f24;
                                    double d = radians;
                                    fArr9[i26] = (Math.min(1.0f, max4 / (f11 * 0.5f)) * Math.signum(f67) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr8[i26] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr7[i26] = org.telegram.ui.Cells.t0.d(random2, 0.06f, 0.24f);
                                    fArr6[i26] = (-(((gVar4.b - 1) - i23) / 4)) * 0.018f;
                                    fArr5[i26] = random2.nextFloat() * 90.0f;
                                    fArr4[i26] = (random2.nextFloat() - 0.5f) * 720.0f;
                                    fArr3[i26] = 1.0f;
                                }
                                i24 = i14 + 1;
                                width = f24;
                                i22 = 2400;
                                f31 = 1.0f;
                                i21 = 16;
                            }
                        }
                    }
                }
                f22 = 0.45f;
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f23 = 1.0f;
                    } else if (max5 < f22) {
                        float f68 = 1.0f - (max5 / f22);
                        f23 = ((1.0f - (f68 * f68)) * 0.12f) + 0.92f;
                    } else {
                        float f69 = (max5 - f22) / 0.55f;
                        f23 = 1.04f - ((3.0f - (f69 * 2.0f)) * ((0.04f * f69) * f69));
                    }
                    canvas.save();
                    canvas.scale(f23, f23, this.B, this.C);
                    d(canvas, this.m, f7, f10, f11, max5);
                    hVar = this;
                    canvas2 = canvas;
                    canvas2.restore();
                } else {
                    hVar = this;
                    canvas2 = canvas;
                }
                fArr = fArr3;
                rectF = rectF4;
                f17 = min;
                f18 = 0.0f;
                f19 = 1.0f;
                r42 = z11;
                i17 = hVar.l - 1;
                byte b112 = r42;
                while (i17 >= 0) {
                }
            }
            f16 = f7;
            f13 = f10;
            hVar = this;
            canvas2 = canvas;
            f14 = 0.5f;
            f15 = 0.45f;
            z10 = z11;
        }
        if (hVar.o >= 1.0f || (gVar = hVar.n) == null) {
            float f70 = f13;
            fArr = fArr3;
            rectF = rectF4;
            f17 = min;
            float f71 = f16;
            f18 = 0.0f;
            f19 = 1.0f;
            g gVar5 = hVar.m;
            gVar5.a.getWidth();
            rectF.set(f71, f70, f71 + f11, f70 + f11);
            canvas2.drawBitmap(gVar5.a, (Rect) null, rectF, paint3);
            r42 = z10;
        } else {
            g gVar6 = hVar.m;
            k(gVar);
            k(gVar6);
            hVar.e(Math.max(gVar.i, gVar6.i));
            Bitmap bitmap = hVar.H;
            Bitmap bitmap2 = gVar.a;
            Paint paint5 = hVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = gVar.a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                hVar.H = gVar.a;
            }
            Bitmap bitmap4 = hVar.K;
            Bitmap bitmap5 = gVar6.a;
            Paint paint6 = hVar.M;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = gVar6.a;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                hVar.K = gVar6.a;
            }
            paint5.setColorFilter(hVar.z);
            paint6.setColorFilter(hVar.z);
            float f72 = f(gVar, hVar.o);
            float f73 = f(gVar6, hVar.o);
            float width2 = f11 / gVar.a.getWidth();
            float width3 = f11 / gVar6.a.getWidth();
            int i27 = 0;
            int i28 = 0;
            while (true) {
                fArr = fArr3;
                if (i27 >= gVar.i) {
                    break;
                }
                if (gVar.m[i27]) {
                    int[] iArr = gVar.n;
                    int i29 = i27 * 4;
                    int i30 = iArr[i29];
                    int i31 = iArr[i29 + 1];
                    i11 = i27;
                    int i32 = (i31 * gVar.b) + i30;
                    float f74 = (gVar.e[i32] * 3.2f) + ((r6 - 1) - i31);
                    if (f72 > f74) {
                        boolean[] zArr = hVar.s;
                        if (!zArr[i32]) {
                            zArr[i32] = z10;
                            paint2 = paint6;
                            float f75 = 16;
                            float f76 = i30 + f14;
                            float f77 = gVar.c;
                            float f78 = (((f76 * f77) + f75) * width2) + f16;
                            float f79 = ((((i31 + f14) * f77) + f75) * width2) + f13;
                            float f80 = f77 * width2;
                            float f81 = f78 - hVar.B;
                            float f82 = f79 - hVar.C;
                            rectF3 = rectF4;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f81, f82));
                            float f83 = f81 / max6;
                            float f84 = f82 / max6;
                            float nextFloat2 = random2.nextFloat();
                            int i33 = nextFloat2 < 0.12f ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i34 = 0;
                            while (i34 < i33) {
                                float f85 = f84;
                                int i35 = hVar.l;
                                float f86 = f83;
                                if (i35 >= 2400) {
                                    i35 = -1;
                                } else {
                                    hVar.l = i35 + 1;
                                }
                                if (i35 < 0) {
                                    break;
                                }
                                boolean z12 = (i34 <= 0 || random2.nextFloat() >= f42) ? false : z10 ? 1 : 0;
                                if (z12) {
                                    i12 = i35;
                                    i13 = 2;
                                } else if (random2.nextFloat() < 0.14f) {
                                    i12 = i35;
                                    i13 = z10 ? 1 : 0;
                                } else {
                                    i12 = i35;
                                    i13 = 0;
                                }
                                bArr[i12] = (byte) i13;
                                fArr12[i12] = ((random2.nextFloat() - f14) * f80 * f14) + f78;
                                fArr11[i12] = ((random2.nextFloat() - f14) * f80 * f14) + f79;
                                if (z12) {
                                    fArr10[i12] = AndroidUtilities.dpf2((random2.nextFloat() * 0.9f) + 0.9f);
                                } else if (i34 != 0 || nextFloat2 >= 0.12f) {
                                    fArr10[i12] = ((random2.nextFloat() * 0.55f) + f42) * f80;
                                } else {
                                    fArr10[i12] = ((random2.nextFloat() * f15) + 1.25f) * f80;
                                }
                                float nextFloat3 = (random2.nextFloat() * AndroidUtilities.dp(150.0f)) + AndroidUtilities.dp(110.0f);
                                int i36 = i33;
                                float d10 = org.telegram.ui.Cells.t0.d(random2, 0.35f, f15);
                                fArr9[i12] = ((random2.nextFloat() - f14) * AndroidUtilities.dp(90.0f)) + (f86 * nextFloat3 * d10);
                                fArr8[i12] = a6.D(1.0f, d10, nextFloat3, (f85 * nextFloat3) * d10) - AndroidUtilities.dp(30.0f);
                                fArr7[i12] = org.telegram.ui.Cells.t0.d(random2, 0.2f, f42);
                                fArr6[i12] = 0.0f;
                                fArr5[i12] = random2.nextFloat() * 90.0f;
                                fArr4[i12] = (random2.nextFloat() - f14) * 720.0f;
                                fArr[i12] = Float.NaN;
                                i34++;
                                f84 = f85;
                                f83 = f86;
                                i33 = i36;
                                f15 = 0.45f;
                            }
                            gVar3 = gVar;
                            random = random2;
                            f21 = min;
                            i27 = i11 + 1;
                            random2 = random;
                            fArr3 = fArr;
                            paint6 = paint2;
                            rectF4 = rectF3;
                            min = f21;
                            gVar = gVar3;
                            f42 = 0.3f;
                            f15 = 0.45f;
                        }
                    } else {
                        paint2 = paint6;
                        rectF3 = rectF4;
                        float min4 = 1.0f - Math.min(1.0f, (f74 - f72) / 2.2f);
                        float dpf2 = min4 > 0.0f ? AndroidUtilities.dpf2(1.4f) * ((float) Math.sin((hVar.o * 60.0f) + (i31 * 7) + (i30 * 13))) * min4 : 0.0f;
                        float dpf22 = (-min4) * AndroidUtilities.dpf2(1.5f);
                        random = random2;
                        f21 = min;
                        float f87 = 16;
                        float f88 = gVar.c;
                        float f89 = (i30 * f88) + f87;
                        float f90 = (i31 * f88) + f87;
                        float f91 = f89 + f88;
                        float f92 = f88 + f90;
                        gVar3 = gVar;
                        l(hVar.N, hVar.O, hVar.R, i28, r.c.c(f89, width2, f16, dpf2), r.c.c(f90, width2, f13, dpf22), r.c.c(f91, width2, f16, dpf2), r.c.c(f92, width2, f13, dpf22), f89, f90, f91, f92, (((int) a6.B(min4, 0.25f, 1.0f, 255.0f)) << 24) | 16777215);
                        i28++;
                        i27 = i11 + 1;
                        random2 = random;
                        fArr3 = fArr;
                        paint6 = paint2;
                        rectF4 = rectF3;
                        min = f21;
                        gVar = gVar3;
                        f42 = 0.3f;
                        f15 = 0.45f;
                    }
                } else {
                    i11 = i27;
                }
                paint2 = paint6;
                rectF3 = rectF4;
                gVar3 = gVar;
                random = random2;
                f21 = min;
                i27 = i11 + 1;
                random2 = random;
                fArr3 = fArr;
                paint6 = paint2;
                rectF4 = rectF3;
                min = f21;
                gVar = gVar3;
                f42 = 0.3f;
                f15 = 0.45f;
            }
            Paint paint7 = paint6;
            RectF rectF6 = rectF4;
            f17 = min;
            f18 = 0.0f;
            float f93 = 3.2f;
            boolean z13 = z10 ? 1 : 0;
            int i37 = 0;
            int i38 = 0;
            while (i37 < gVar6.i) {
                if (gVar6.m[i37]) {
                    int[] iArr2 = gVar6.n;
                    int i39 = i37 * 4;
                    int i40 = iArr2[i39];
                    int i41 = iArr2[i39 + 1];
                    float c10 = r.c.c(gVar6.e[(i41 * gVar6.b) + i40], f93, (r8 - 1) - i41, 1.6f);
                    if (f73 <= c10) {
                        z13 = false;
                        f93 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (f73 - c10) / 2.4f);
                        float f94 = 16;
                        float f95 = gVar6.c;
                        float f96 = (i40 * f95) + f94;
                        float f97 = (i41 * f95) + f94;
                        float f98 = f96 + f95;
                        float f99 = f97 + f95;
                        float f100 = min5 - 1.0f;
                        f93 = 3.2f;
                        float f101 = (((f100 * 2.2f * f100) + (f100 * 3.2f * f100 * f100) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f101 - 1.0f) < f12)) {
                            l(hVar.P, hVar.Q, hVar.S, i38, (f96 * width3) + f16, (f97 * width3) + f13, (f98 * width3) + f16, (f99 * width3) + f13, f96, f97, f98, f99, -1);
                            i38++;
                        } else {
                            float f102 = ((f96 + f98) * f14 * width3) + f16;
                            float f103 = ((f97 + f99) * f14 * width3) + f13;
                            float C = a6.C(gVar6.c, f14, width3, f101);
                            l(hVar.P, hVar.Q, hVar.S, i38, f102 - C, f103 - C, f102 + C, f103 + C, f96, f97, f98, f99, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | 16777215);
                            i38++;
                            z13 = false;
                        }
                    }
                }
                i37++;
                f14 = 0.5f;
            }
            if (i28 == 0 && z13) {
                hVar.o = 1.0f;
                rectF = rectF6;
                rectF.set(f16, f13, f16 + f11, f13 + f11);
                canvas2.drawBitmap(gVar6.a, (Rect) null, rectF, paint3);
                f19 = 1.0f;
                f42 = 0.3f;
                r42 = z10;
            } else {
                if (i28 > 0) {
                    f20 = width3;
                    f19 = 1.0f;
                    i10 = 16;
                    paint = paint3;
                    gVar2 = gVar6;
                    rectF2 = rectF6;
                    f42 = 0.3f;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i28 * 8, hVar.N, 0, hVar.O, 0, hVar.R, 0, hVar.T, 0, i28 * 6, paint5);
                } else {
                    paint = paint3;
                    f20 = width3;
                    gVar2 = gVar6;
                    rectF2 = rectF6;
                    f19 = 1.0f;
                    i10 = 16;
                    f42 = 0.3f;
                }
                if (i38 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i38 * 8, hVar.P, 0, hVar.Q, 0, hVar.S, 0, hVar.T, 0, i38 * 6, paint7);
                } else {
                    canvas2 = canvas;
                }
                float f104 = i10;
                float f105 = gVar2.f;
                float f106 = gVar2.c;
                float f107 = f20;
                float A = a6.A(f105, f106, f104, f107);
                float A2 = a6.A(gVar2.g, f106, f104, f107);
                canvas2.save();
                canvas2.clipRect(A + f7, A + f10, A2 + f7, A2 + f10);
                rectF = rectF2;
                rectF.set(f7, f10, f7 + f11, f10 + f11);
                canvas2.drawBitmap(gVar2.a, (Rect) null, rectF, paint);
                canvas2.restore();
                r42 = z10;
            }
        }
        i17 = hVar.l - 1;
        byte b1122 = r42;
        while (i17 >= 0) {
        }
    }

    public final void d(Canvas canvas, g gVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        boolean z10;
        float f15;
        Paint paint;
        float f16;
        float f17;
        float f18;
        float x10;
        float f19 = f12;
        int i13 = this.q;
        Paint paint2 = this.t;
        RectF rectF2 = this.w;
        float f20 = 2.0f;
        float f21 = 0.05f;
        if (i13 != 2) {
            int i14 = 1;
            float width = f11 / gVar.a.getWidth();
            float f22 = (gVar.b - 1) / 2.0f;
            float f23 = 1.4142f * f22;
            int i15 = 0;
            while (i15 < gVar.b) {
                int i16 = 0;
                while (true) {
                    int i17 = gVar.b;
                    if (i16 < i17) {
                        int i18 = (i17 * i15) + i16;
                        if (!gVar.d[i18] || g(gVar, i16, i15)) {
                            f13 = f22;
                            f14 = f23;
                            i10 = i15;
                            i11 = i16;
                            rectF = rectF2;
                        } else {
                            float f24 = i16;
                            float f25 = i15;
                            f13 = f22;
                            RectF rectF3 = rectF2;
                            float d = (f12 - ((gVar.e[i18] * 0.06f) + a1.g.d((float) Math.hypot(f24 - f22, f25 - f13), f23, 0.52f, f21))) / 0.367f;
                            if (d > 0.0f) {
                                float f26 = 1.0f;
                                if (d < 1.0f) {
                                    float f27 = 1.0f - d;
                                    f26 = org.telegram.ui.Cells.t0.z(f27, f27, f27, 1.0f);
                                }
                                float j10 = this.q == 2 ? (0.6f * f26) + 0.4f : j(d);
                                if (this.q != 2) {
                                    f26 = Math.min(1.0f, d * 6.0f);
                                }
                                int i19 = gVar.f;
                                if (i16 < i19 || i16 >= (i12 = gVar.g) || i15 < i19 || i15 >= i12) {
                                    float f28 = 16;
                                    float f29 = gVar.c;
                                    int i20 = (int) ((f24 * f29) + f28);
                                    int i21 = (int) ((f25 * f29) + f28);
                                    f14 = f23;
                                    int ceil = (int) Math.ceil(((i16 + 1) * f29) + f28);
                                    float f30 = (gVar.c * (i15 + 1)) + f28;
                                    i10 = i15;
                                    i11 = i16;
                                    int ceil2 = (int) Math.ceil(f30);
                                    Rect rect = this.v;
                                    rect.set(i20, i21, ceil, ceil2);
                                    float f31 = i20 + ceil;
                                    float f32 = f20;
                                    float d10 = a1.g.d(f31, f32, width, f7);
                                    float d11 = a1.g.d(i21 + ceil2, f32, width, f10);
                                    float f33 = ((ceil - i20) / f32) * width * j10;
                                    float f34 = ((ceil2 - i21) / f32) * width * j10;
                                    float f35 = d11 + f34;
                                    rectF = rectF3;
                                    rectF.set(d10 - f33, d11 - f34, d10 + f33, f35);
                                    paint2.setAlpha((int) (f26 * 255.0f));
                                    g gVar2 = this.n;
                                    canvas.drawBitmap(gVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(255);
                                }
                            }
                            f14 = f23;
                            i10 = i15;
                            i11 = i16;
                            rectF = rectF3;
                        }
                        i16 = i11 + 1;
                        rectF2 = rectF;
                        i15 = i10;
                        f23 = f14;
                        f22 = f13;
                        f20 = 2.0f;
                        f21 = 0.05f;
                    }
                }
                i15++;
                f20 = 2.0f;
                f21 = 0.05f;
            }
            RectF rectF4 = rectF2;
            float width2 = f11 / gVar.a.getWidth();
            int i22 = 0;
            while (i22 < 3) {
                int i23 = i22 == i14 ? gVar.b - 7 : 0;
                int i24 = i22 == 2 ? gVar.b - 7 : 0;
                float f36 = f12 / 0.32f;
                if (f36 > 0.0f) {
                    float f37 = 16;
                    float f38 = gVar.c;
                    float f39 = (((i23 * f38) + f37) * width2) + f7;
                    float f40 = (((i24 * f38) + f37) * width2) + f10;
                    float f41 = ((((i23 + 7) * f38) + f37) * width2) + f7;
                    float f42 = ((((i24 + 7) * f38) + f37) * width2) + f10;
                    float j11 = j(f36);
                    canvas.save();
                    canvas.scale(j11, j11, (f39 + f41) / 2.0f, (f40 + f42) / 2.0f);
                    canvas.clipRect(f39 - 1.0f, f40 - 1.0f, f41 + 1.0f, f42 + 1.0f);
                    rectF4.set(f7, f10, f7 + f11, f10 + f11);
                    paint2.setAlpha(255);
                    canvas.drawBitmap(gVar.a, (Rect) null, rectF4, paint2);
                    canvas.restore();
                }
                i22++;
                i14 = 1;
            }
            paint2.setAlpha(255);
            return;
        }
        k(gVar);
        int i25 = gVar.i;
        int i26 = gVar.b;
        e((i26 * i26) + i25);
        BitmapShader bitmapShader = this.J;
        Paint paint3 = this.L;
        float f43 = 0.7f;
        if (bitmapShader == null) {
            if (W == null) {
                W = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(W);
                Paint paint4 = new Paint(1);
                paint4.setColor(-1);
                RectF rectF5 = new RectF();
                z10 = true;
                f15 = 1.0f;
                for (int i27 = 0; i27 < 8; i27++) {
                    rectF5.set((i27 * 48) + 1.5f, 1.5f, (r12 + 48) - 1.5f, 46.5f);
                    float f44 = (1.0f - ((i27 * 0.7f) / 7.0f)) * 22.5f;
                    canvas2.drawRoundRect(rectF5, f44, f44, paint4);
                }
            } else {
                z10 = true;
                f15 = 1.0f;
            }
            Bitmap bitmap = W;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(bitmap, tileMode, tileMode);
            this.J = bitmapShader2;
            paint3.setShader(bitmapShader2);
        } else {
            z10 = true;
            f15 = 1.0f;
        }
        Bitmap bitmap2 = this.K;
        Bitmap bitmap3 = gVar.a;
        Paint paint5 = this.M;
        if (bitmap2 != bitmap3) {
            Bitmap bitmap4 = gVar.a;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            paint5.setShader(new BitmapShader(bitmap4, tileMode2, tileMode2));
            this.K = gVar.a;
        }
        paint3.setColorFilter(this.z);
        paint5.setColorFilter(this.z);
        float width3 = f11 / gVar.a.getWidth();
        float min = Math.min(f15, Math.max(0.0f, f19) / 0.1f);
        float f45 = gVar.c * 0.5f;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        boolean z11 = z10;
        while (i28 < gVar.i) {
            float f46 = (f19 - gVar.l[i28]) / 0.434f;
            if (f46 < 0.0f) {
                f46 = 0.0f;
            } else if (f46 > 1.0f) {
                f46 = 1.0f;
            }
            float f47 = width3;
            if (f46 < 0.5f) {
                f17 = a6.C(f46, 4.0f, f46, f46);
            } else {
                float f48 = (f46 * (-2.0f)) + 2.0f;
                f17 = 1.0f - (((f48 * f48) * f48) * 0.5f);
            }
            float f49 = (gVar.j[i28] * f47) + f7;
            float f50 = (gVar.k[i28] * f47) + f10;
            if (gVar.m[i28]) {
                float f51 = f17 > 0.75f ? 4.0f * (f17 - 0.75f) : 0.0f;
                if (f51 < 1.0f) {
                    float A = a6.A(f17, 0.8f, 0.2f, f45 * f47);
                    int min2 = Math.min(7, (int) ((f17 * 7.0f) + 0.5f));
                    float f52 = (1.0f - f51) * min;
                    if (f52 > 0.004f) {
                        l(this.N, this.O, this.R, i30, f49 - A, f50 - A, f49 + A, f50 + A, min2 * 48, 0.0f, r5 + 48, 48.0f, (((int) (f52 * 255.0f)) << 24) | 16777215);
                        z11 = false;
                        i30++;
                    } else {
                        z11 = false;
                    }
                }
                if (f51 > 0.0f) {
                    float f53 = 16;
                    int[] iArr = gVar.n;
                    float f54 = iArr[i28 * 4];
                    float f55 = gVar.c;
                    float f56 = (f54 * f55) + f53;
                    float f57 = (iArr[r1 + 1] * f55) + f53;
                    float f58 = f56 + f55;
                    float f59 = f57 + f55;
                    l(this.P, this.Q, this.S, i29, (f56 * f47) + f7, (f57 * f47) + f10, (f58 * f47) + f7, (f59 * f47) + f10, f56, f57, f58, f59, (((int) (min * 255.0f)) << 24) | 16777215);
                    i29++;
                }
                f18 = f45;
            } else {
                if (f17 < 1.0f) {
                    z11 = false;
                }
                float f60 = 0.2f * (1.0f - f17);
                if (f17 < f43) {
                    x10 = 1.0f;
                    f18 = f45;
                } else {
                    f18 = f45;
                    x10 = org.telegram.messenger.q.x(f17, f43, 0.3f, 1.0f);
                }
                float f61 = 0.9f * min * x10;
                if (f60 > 0.01f && f61 > 0.004f) {
                    float f62 = f18 * f47 * f60;
                    l(this.N, this.O, this.R, i30, f49 - f62, f50 - f62, f49 + f62, f50 + f62, 0.0f, 0.0f, 48.0f, 48.0f, (((int) (f61 * 255.0f)) << 24) | 16777215);
                    i30++;
                }
            }
            i28++;
            f19 = f12;
            f45 = f18;
            width3 = f47;
            f43 = 0.7f;
        }
        float f63 = width3;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
        float z12 = org.telegram.ui.Cells.t0.z(max, max, max, 1.0f);
        if (z12 > 0.0f) {
            int i31 = gVar.f;
            while (i31 < gVar.g) {
                int i32 = gVar.f;
                int i33 = i29;
                while (i32 < gVar.g) {
                    if (gVar.d[(gVar.b * i31) + i32]) {
                        float f64 = 16;
                        float f65 = gVar.c;
                        float f66 = (i32 * f65) + f64;
                        float f67 = (i31 * f65) + f64;
                        f16 = z12;
                        float f68 = f66 + f65;
                        float f69 = f67 + f65;
                        l(this.P, this.Q, this.S, i33, (f66 * f63) + f7, (f67 * f63) + f10, (f68 * f63) + f7, (f69 * f63) + f10, f66, f67, f68, f69, (((int) ((min * 255.0f) * f16)) << 24) | 16777215);
                        i33++;
                    } else {
                        f16 = z12;
                    }
                    i32++;
                    z12 = f16;
                }
                i31++;
                i29 = i33;
            }
        }
        if (z11 && min >= 1.0f) {
            rectF2.set(f7, f10, f7 + f11, f10 + f11);
            canvas.drawBitmap(gVar.a, (Rect) null, rectF2, paint2);
            return;
        }
        if (i29 > 0) {
            paint = paint3;
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i29 * 8, this.P, 0, this.Q, 0, this.S, 0, this.T, 0, i29 * 6, paint5);
        } else {
            paint = paint3;
        }
        if (i30 > 0) {
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i30 * 8, this.N, 0, this.O, 0, this.R, 0, this.T, 0, i30 * 6, paint);
        }
    }

    public final void e(int i10) {
        float[] fArr = this.N;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.N = new float[i11];
            this.O = new float[i11];
            int i12 = i10 * 4;
            this.R = new int[i12];
            this.P = new float[i11];
            this.Q = new float[i11];
            this.S = new int[i12];
            this.T = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.T;
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
}
