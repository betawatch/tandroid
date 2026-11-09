package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class h {
    public static final PorterDuff.Mode[] W = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public float A;
    public float B;
    public float C;
    public float D;
    public int[] E;
    public float[] F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float[] L;
    public int M;
    public int N;
    public int O;
    public String P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public final Paint a = new Paint(3);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Matrix g;
    public final Matrix h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final RectF l;
    public final Rect m;
    public final int n;
    public Bitmap o;
    public Bitmap p;
    public Canvas q;
    public int r;
    public int s;
    public int[] t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public h(int i7) {
        Paint paint = new Paint();
        this.d = paint;
        this.e = new Path();
        this.f = new Path();
        this.g = new Matrix();
        this.h = new Matrix();
        this.i = new float[9];
        this.j = new float[6];
        this.k = new float[8];
        this.l = new RectF();
        this.m = new Rect();
        this.s = -1;
        this.n = i7;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(int i7, Paint paint) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            f.a(i7, paint);
            return;
        }
        if (i7 > 0) {
            PorterDuff.Mode[] modeArr = W;
            if (i7 < modeArr.length) {
                mode = modeArr[i7];
                paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            }
        }
        mode = null;
        paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.x == 0 || (iArr = this.E) == null) {
            paint.setShader(null);
            paint.setColor(this.y);
            return;
        }
        float[] fArr = this.F;
        paint.setColor(-16777216);
        int i7 = this.x;
        float[] fArr2 = this.j;
        if (i7 == 1) {
            paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
            return;
        }
        if (i7 != 2) {
            SweepGradient sweepGradient = new SweepGradient(fArr2[1], fArr2[2], iArr, fArr);
            Matrix matrix = new Matrix();
            matrix.setRotate((float) Math.toDegrees(fArr2[0]), fArr2[1], fArr2[2]);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        float f10 = fArr2[2];
        float max = Math.max(fArr2[5], 0.01f);
        if (f10 > 0.0f && f10 < max) {
            float[] fArr3 = new float[fArr.length];
            for (int i10 = 0; i10 < fArr.length; i10++) {
                float f11 = f10 / max;
                fArr3[i10] = com.google.android.recaptcha.internal.a.z(1.0f, f11, fArr[i10], f11);
            }
            fArr = fArr3;
        }
        paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, g gVar) {
        char c10;
        Bitmap image;
        boolean z9;
        float[] fArr = this.i;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        Matrix matrix = this.g;
        matrix.setValues(fArr);
        Paint paint = this.a;
        paint.reset();
        paint.setFlags(3);
        canvas.save();
        int i7 = this.v;
        if (i7 == 1 || i7 == 2) {
            Matrix matrix2 = this.h;
            if (matrix.invert(matrix2)) {
                Path path = this.e;
                path.transform(matrix2);
                canvas.concat(matrix);
                a(paint);
                if (this.v == 2) {
                    paint.setStyle(Paint.Style.STROKE);
                    d(paint);
                }
                canvas.drawPath(path, paint);
            }
        } else if (i7 == 4) {
            Paint font = gVar.font(this.M);
            if (font != null) {
                Paint paint2 = new Paint(font);
                canvas.concat(matrix);
                canvas.translate(this.Q, this.R);
                canvas.scale(this.S, 1.0f);
                paint2.setShader(null);
                a(paint2);
                if (this.U) {
                    paint2.setStyle(Paint.Style.STROKE);
                    d(paint2);
                }
                canvas.drawText(this.P, this.T, 0.0f, paint2);
            }
        } else if (i7 == 5) {
            int i10 = this.N;
            if (i10 != 0) {
                c10 = 6;
                int i11 = this.n;
                image = i10 == i11 ? this.o : gVar.canvasBitmap(i10);
                if (this.N == i11) {
                    z9 = true;
                    if (image != null) {
                        Bitmap copy = z9 ? image.copy(Bitmap.Config.ARGB_8888, false) : null;
                        if (copy != null) {
                            image = copy;
                        }
                        canvas.concat(matrix);
                        paint.setFilterBitmap(this.V);
                        float[] fArr2 = this.k;
                        float f10 = fArr2[4];
                        float f11 = fArr2[5];
                        float f12 = fArr2[c10] + f10;
                        float f13 = fArr2[7] + f11;
                        RectF rectF = this.l;
                        rectF.set(f10, f11, f12, f13);
                        float f14 = fArr2[2];
                        if (f14 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f15 = fArr2[0];
                            float f16 = fArr2[1];
                            int i12 = (int) (f15 + f14);
                            int i13 = (int) (f16 + fArr2[3]);
                            Rect rect = this.m;
                            rect.set((int) f15, (int) f16, i12, i13);
                            canvas.drawBitmap(image, rect, rectF, paint);
                        }
                        if (copy != null) {
                            copy.recycle();
                        }
                    }
                }
            } else {
                c10 = 6;
                image = gVar.image(this.O);
            }
            z9 = false;
            if (image != null) {
            }
        }
        canvas.restore();
    }

    public final void d(Paint paint) {
        paint.setStrokeWidth(this.I);
        int i7 = this.G;
        paint.setStrokeCap(i7 == 1 ? Paint.Cap.ROUND : i7 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
        int i10 = this.H;
        paint.setStrokeJoin(i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
        paint.setStrokeMiter(this.J);
        paint.setPathEffect(null);
        float[] fArr = this.L;
        if (fArr == null) {
            return;
        }
        int length = fArr.length;
        int i11 = length % 2 == 1 ? length * 2 : length;
        float[] fArr2 = new float[i11];
        float f10 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float max = Math.max(0.0f, this.L[i12 % length]);
            fArr2[i12] = max;
            f10 += max;
        }
        if (f10 > 0.0f) {
            paint.setPathEffect(new DashPathEffect(fArr2, this.K));
        }
    }

    public final float e() {
        int[] iArr = this.t;
        int i7 = this.u;
        this.u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void f(Path path, boolean z9) {
        path.rewind();
        int[] iArr = this.t;
        int i7 = this.u;
        int i10 = i7 + 1;
        this.u = i10;
        int i11 = iArr[i7];
        int i12 = i7 + 2;
        this.u = i12;
        int i13 = iArr[i10];
        int i14 = i12 + i11;
        int i15 = i14;
        for (int i16 = i12; i16 < i14; i16++) {
            int i17 = iArr[i16];
            if (i17 == 0) {
                path.moveTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]));
            } else if (i17 != 1) {
                if (i17 == 2) {
                    path.quadTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]), Float.intBitsToFloat(iArr[i15 + 2]), Float.intBitsToFloat(iArr[i15 + 3]));
                    i15 += 4;
                } else if (i17 == 3) {
                    path.cubicTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]), Float.intBitsToFloat(iArr[i15 + 2]), Float.intBitsToFloat(iArr[i15 + 3]), Float.intBitsToFloat(iArr[i15 + 4]), Float.intBitsToFloat(iArr[i15 + 5]));
                    i15 += 6;
                } else if (i17 == 4) {
                    path.close();
                }
            } else {
                path.lineTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]));
            }
            i15 += 2;
        }
        this.u = i11 + i13 + this.u;
        if (z9) {
            path.setFillType(Path.FillType.WINDING);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(g gVar) {
        boolean z9;
        int i7;
        boolean z10;
        int i10;
        int i11;
        int[] iArr = this.t;
        int i12 = this.u;
        int i13 = i12 + 1;
        this.u = i13;
        int i14 = iArr[i12];
        this.v = i14;
        boolean z11 = false;
        if (i14 == 0) {
            this.o.eraseColor(0);
            return;
        }
        int i15 = 2;
        if (i14 == 6) {
            int e10 = (int) e();
            int e11 = (int) e();
            int[] iArr2 = this.t;
            int i16 = this.u;
            int i17 = i16 + 1;
            this.u = i17;
            int i18 = iArr2[i16];
            int i19 = i16 + 2;
            this.u = i19;
            int i20 = iArr2[i17];
            int i21 = i16 + 3;
            this.u = i21;
            int i22 = iArr2[i19];
            this.u = ((i22 + 3) >> 2) + i21;
            if (i18 <= 0 || i20 <= 0 || i22 != i18 * i20 * 4) {
                return;
            }
            int max = Math.max(0, e10);
            int max2 = Math.max(0, e11);
            int min = Math.min(this.o.getWidth(), e10 + i18);
            int min2 = Math.min(this.o.getHeight(), i20 + e11);
            if (min <= max || min2 <= max2) {
                return;
            }
            int i23 = min - max;
            int i24 = min2 - max2;
            int[] iArr3 = new int[i23 * i24];
            for (int i25 = max2; i25 < min2; i25++) {
                int i26 = max;
                while (i26 < min) {
                    int i27 = this.t[(i26 - e10) + com.google.android.recaptcha.internal.a.e(i25, e11, i18, i21)];
                    iArr3[(i26 - max) + ((i25 - max2) * i23)] = ((i27 & qs.e4) << 16) | ((-16711936) & i27) | ((i27 >>> 16) & qs.e4);
                    i26++;
                    e10 = e10;
                }
            }
            this.o.setPixels(iArr3, 0, i23, max, max2, i23, i24);
            return;
        }
        this.u = i12 + 2;
        int i28 = iArr[i13];
        if (i28 > 0) {
            this.q.save();
            for (int i29 = 0; i29 < i28; i29++) {
                Path path = this.f;
                f(path, false);
                int[] iArr4 = this.t;
                int i30 = this.u;
                this.u = i30 + 1;
                path.setFillType(iArr4[i30] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                this.q.clipPath(path);
            }
        }
        int i31 = this.v;
        Path path2 = this.e;
        if (i31 == 1 || i31 == 2 || i31 == 3) {
            f(path2, i31 == 3);
        }
        int i32 = this.v;
        if (i32 == 3) {
            this.q.drawPath(path2, this.d);
        } else {
            int[] iArr5 = this.t;
            if (i32 == 1 || i32 == 2) {
                path2.setFillType(iArr5[this.u] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
            }
            this.u++;
            float e12 = e();
            float[] fArr = this.i;
            fArr[0] = e12;
            fArr[3] = e();
            fArr[1] = e();
            fArr[4] = e();
            fArr[2] = e();
            fArr[5] = e();
            this.A = Math.max(0.0f, Math.min(1.0f, e()));
            int i33 = this.u;
            int i34 = i33 + 1;
            this.u = i34;
            this.w = iArr5[i33];
            int i35 = i33 + 2;
            this.u = i35;
            Object[] objArr = iArr5[i34] != 0;
            this.z = 0;
            if (objArr != false) {
                this.u = i33 + 3;
                this.z = iArr5[i35];
                this.B = e();
                this.C = e();
                this.D = e();
            }
            int i36 = this.v;
            if (i36 == 1 || i36 == 2 || i36 == 4) {
                int i37 = this.u;
                int i38 = i37 + 1;
                this.u = i38;
                int i39 = iArr5[i37];
                this.x = i39;
                this.E = null;
                this.F = null;
                this.y = 0;
                if (i39 == 0) {
                    this.u = i37 + 2;
                    this.y = iArr5[i38];
                } else {
                    for (int i40 = 0; i40 < 6; i40++) {
                        this.j[i40] = e();
                    }
                    int[] iArr6 = this.t;
                    int i41 = this.u;
                    this.u = i41 + 1;
                    int i42 = iArr6[i41];
                    if (i42 == 0) {
                        z9 = false;
                        i7 = 2;
                    } else {
                        int[] iArr7 = new int[Math.max(2, i42)];
                        float[] fArr2 = new float[i42 == 1 ? 2 : i42];
                        int i43 = 0;
                        while (i43 < i42) {
                            float e13 = e();
                            int i44 = i15;
                            int[] iArr8 = this.t;
                            int i45 = this.u;
                            this.u = i45 + 1;
                            iArr7[i43] = iArr8[i45];
                            fArr2[i43] = Math.max(0.0f, Math.min(1.0f, e13));
                            i43++;
                            i15 = i44;
                            z11 = z11;
                        }
                        z9 = z11;
                        i7 = i15;
                        if (i42 == 1) {
                            iArr7[1] = iArr7[z9 ? 1 : 0];
                            fArr2[z9 ? 1 : 0] = 0.0f;
                            fArr2[1] = 1.0f;
                        }
                        this.E = iArr7;
                        this.F = fArr2;
                    }
                    z10 = z9;
                    this.U = z10;
                    if (this.v == 4) {
                        int[] iArr9 = this.t;
                        int i46 = this.u;
                        int i47 = i46 + 1;
                        this.u = i47;
                        this.M = iArr9[i46];
                        this.u = i46 + 2;
                        int i48 = iArr9[i47];
                        byte[] bArr = new byte[i48];
                        for (int i49 = 0; i49 < i48; i49++) {
                            bArr[i49] = (byte) (this.t[this.u + (i49 >> 2)] >>> ((i49 & 3) * 8));
                        }
                        this.u += (i48 + 3) >> 2;
                        this.P = new String(bArr, StandardCharsets.UTF_8);
                        this.Q = e();
                        this.R = e();
                        this.S = e();
                        this.T = e();
                        int[] iArr10 = this.t;
                        int i50 = this.u;
                        this.u = i50 + 1;
                        this.U = iArr10[i50] != 0;
                    }
                    if (this.v != i7 || this.U) {
                        this.I = e();
                        int[] iArr11 = this.t;
                        int i51 = this.u;
                        int i52 = i51 + 1;
                        this.u = i52;
                        this.G = iArr11[i51];
                        this.u = i51 + 2;
                        this.H = iArr11[i52];
                        this.J = e();
                        int[] iArr12 = this.t;
                        int i53 = this.u;
                        this.u = i53 + 1;
                        i10 = iArr12[i53];
                        this.L = null;
                        if (i10 > 0) {
                            this.L = new float[i10];
                            for (int i54 = 0; i54 < i10; i54++) {
                                this.L[i54] = e();
                            }
                        }
                        this.K = e();
                    }
                    if (this.v == 5) {
                        int i55 = this.u;
                        int i56 = i55 + 1;
                        this.u = i56;
                        this.N = iArr5[i55];
                        this.u = i55 + 2;
                        this.O = iArr5[i56];
                        for (int i57 = 0; i57 < 8; i57++) {
                            this.k[i57] = e();
                        }
                        int i58 = this.u;
                        this.u = i58 + 1;
                        this.V = iArr5[i58] != 0;
                    }
                    if (this.v != 1 && this.x == 0 && this.A == 1.0f && this.w == 0 && this.z == 0) {
                        int i59 = this.y;
                        Paint paint = this.b;
                        paint.setColor(i59);
                        this.q.drawPath(path2, paint);
                    } else {
                        i11 = this.z;
                        Paint paint2 = this.c;
                        if (i11 == 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.o.getWidth(), this.o.getHeight(), Bitmap.Config.ARGB_8888);
                            c(new Canvas(createBitmap), gVar);
                            Paint paint3 = new Paint(1);
                            float f10 = this.D / 2.0f;
                            if (f10 > 0.5f) {
                                paint3.setMaskFilter(new BlurMaskFilter((f10 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
                            }
                            Bitmap extractAlpha = createBitmap.extractAlpha(paint3, new int[2]);
                            paint2.reset();
                            paint2.setAlpha(Math.round(this.A * 255.0f));
                            b(this.w, paint2);
                            this.q.saveLayer(null, paint2);
                            Paint paint4 = new Paint(1);
                            paint4.setColor(this.z);
                            this.q.drawBitmap(extractAlpha, r7[0] + this.B, r7[1] + this.C, paint4);
                            this.q.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                            this.q.restore();
                            extractAlpha.recycle();
                            createBitmap.recycle();
                        } else if (this.A < 1.0f || this.w != 0) {
                            paint2.reset();
                            paint2.setAlpha(Math.round(this.A * 255.0f));
                            b(this.w, paint2);
                            this.q.saveLayer(null, paint2);
                            c(this.q, gVar);
                            this.q.restore();
                        } else {
                            c(this.q, gVar);
                        }
                    }
                }
            }
            z10 = false;
            i7 = 2;
            this.U = z10;
            if (this.v == 4) {
            }
            if (this.v != i7) {
            }
            this.I = e();
            int[] iArr112 = this.t;
            int i512 = this.u;
            int i522 = i512 + 1;
            this.u = i522;
            this.G = iArr112[i512];
            this.u = i512 + 2;
            this.H = iArr112[i522];
            this.J = e();
            int[] iArr122 = this.t;
            int i532 = this.u;
            this.u = i532 + 1;
            i10 = iArr122[i532];
            this.L = null;
            if (i10 > 0) {
            }
            this.K = e();
            if (this.v == 5) {
            }
            if (this.v != 1) {
            }
            i11 = this.z;
            Paint paint22 = this.c;
            if (i11 == 0) {
            }
        }
        if (i28 > 0) {
            this.q.restore();
        }
    }
}
