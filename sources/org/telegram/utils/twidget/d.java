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
import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class d {
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

    public d(int i10) {
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
        this.n = i10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(int i10, Paint paint) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(i10, paint);
            return;
        }
        if (i10 > 0) {
            PorterDuff.Mode[] modeArr = W;
            if (i10 < modeArr.length) {
                mode = modeArr[i10];
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
        int i10 = this.x;
        float[] fArr2 = this.j;
        if (i10 == 1) {
            paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
            return;
        }
        if (i10 != 2) {
            SweepGradient sweepGradient = new SweepGradient(fArr2[1], fArr2[2], iArr, fArr);
            Matrix matrix = new Matrix();
            matrix.setRotate((float) Math.toDegrees(fArr2[0]), fArr2[1], fArr2[2]);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        float f7 = fArr2[2];
        float max = Math.max(fArr2[5], 0.01f);
        if (f7 > 0.0f && f7 < max) {
            float[] fArr3 = new float[fArr.length];
            for (int i11 = 0; i11 < fArr.length; i11++) {
                float f10 = f7 / max;
                fArr3[i11] = c3.i0.z(1.0f, f10, fArr[i11], f10);
            }
            fArr = fArr3;
        }
        paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, c cVar) {
        char c10;
        Bitmap image;
        boolean z10;
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
        int i10 = this.v;
        if (i10 == 1 || i10 == 2) {
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
        } else if (i10 == 4) {
            Paint font = cVar.font(this.M);
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
        } else if (i10 == 5) {
            int i11 = this.N;
            if (i11 != 0) {
                c10 = 6;
                int i12 = this.n;
                image = i11 == i12 ? this.o : cVar.canvasBitmap(i11);
                if (this.N == i12) {
                    z10 = true;
                    if (image != null) {
                        Bitmap copy = z10 ? image.copy(Bitmap.Config.ARGB_8888, false) : null;
                        if (copy != null) {
                            image = copy;
                        }
                        canvas.concat(matrix);
                        paint.setFilterBitmap(this.V);
                        float[] fArr2 = this.k;
                        float f7 = fArr2[4];
                        float f10 = fArr2[5];
                        float f11 = fArr2[c10] + f7;
                        float f12 = fArr2[7] + f10;
                        RectF rectF = this.l;
                        rectF.set(f7, f10, f11, f12);
                        float f13 = fArr2[2];
                        if (f13 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f14 = fArr2[0];
                            float f15 = fArr2[1];
                            int i13 = (int) (f14 + f13);
                            int i14 = (int) (f15 + fArr2[3]);
                            Rect rect = this.m;
                            rect.set((int) f14, (int) f15, i13, i14);
                            canvas.drawBitmap(image, rect, rectF, paint);
                        }
                        if (copy != null) {
                            copy.recycle();
                        }
                    }
                }
            } else {
                c10 = 6;
                image = cVar.image(this.O);
            }
            z10 = false;
            if (image != null) {
            }
        }
        canvas.restore();
    }

    public final void d(Paint paint) {
        paint.setStrokeWidth(this.I);
        int i10 = this.G;
        paint.setStrokeCap(i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
        int i11 = this.H;
        paint.setStrokeJoin(i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
        paint.setStrokeMiter(this.J);
        paint.setPathEffect(null);
        float[] fArr = this.L;
        if (fArr == null) {
            return;
        }
        int length = fArr.length;
        int i12 = length % 2 == 1 ? length * 2 : length;
        float[] fArr2 = new float[i12];
        float f7 = 0.0f;
        for (int i13 = 0; i13 < i12; i13++) {
            float max = Math.max(0.0f, this.L[i13 % length]);
            fArr2[i13] = max;
            f7 += max;
        }
        if (f7 > 0.0f) {
            paint.setPathEffect(new DashPathEffect(fArr2, this.K));
        }
    }

    public final float e() {
        int[] iArr = this.t;
        int i10 = this.u;
        this.u = i10 + 1;
        return Float.intBitsToFloat(iArr[i10]);
    }

    public final void f(Path path, boolean z10) {
        path.rewind();
        int[] iArr = this.t;
        int i10 = this.u;
        int i11 = i10 + 1;
        this.u = i11;
        int i12 = iArr[i10];
        int i13 = i10 + 2;
        this.u = i13;
        int i14 = iArr[i11];
        int i15 = i13 + i12;
        int i16 = i15;
        for (int i17 = i13; i17 < i15; i17++) {
            int i18 = iArr[i17];
            if (i18 == 0) {
                path.moveTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]));
            } else if (i18 != 1) {
                if (i18 == 2) {
                    path.quadTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]), Float.intBitsToFloat(iArr[i16 + 2]), Float.intBitsToFloat(iArr[i16 + 3]));
                    i16 += 4;
                } else if (i18 == 3) {
                    path.cubicTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]), Float.intBitsToFloat(iArr[i16 + 2]), Float.intBitsToFloat(iArr[i16 + 3]), Float.intBitsToFloat(iArr[i16 + 4]), Float.intBitsToFloat(iArr[i16 + 5]));
                    i16 += 6;
                } else if (i18 == 4) {
                    path.close();
                }
            } else {
                path.lineTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]));
            }
            i16 += 2;
        }
        this.u = i12 + i14 + this.u;
        if (z10) {
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
    public final void g(c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int[] iArr = this.t;
        int i13 = this.u;
        int i14 = i13 + 1;
        this.u = i14;
        int i15 = iArr[i13];
        this.v = i15;
        boolean z12 = false;
        if (i15 == 0) {
            this.o.eraseColor(0);
            return;
        }
        int i16 = 2;
        if (i15 == 6) {
            int e = (int) e();
            int e7 = (int) e();
            int[] iArr2 = this.t;
            int i17 = this.u;
            int i18 = i17 + 1;
            this.u = i18;
            int i19 = iArr2[i17];
            int i20 = i17 + 2;
            this.u = i20;
            int i21 = iArr2[i18];
            int i22 = i17 + 3;
            this.u = i22;
            int i23 = iArr2[i20];
            this.u = ((i23 + 3) >> 2) + i22;
            if (i19 <= 0 || i21 <= 0 || i23 != i19 * i21 * 4) {
                return;
            }
            int max = Math.max(0, e);
            int max2 = Math.max(0, e7);
            int min = Math.min(this.o.getWidth(), e + i19);
            int min2 = Math.min(this.o.getHeight(), i21 + e7);
            if (min <= max || min2 <= max2) {
                return;
            }
            int i24 = min - max;
            int i25 = min2 - max2;
            int[] iArr3 = new int[i24 * i25];
            for (int i26 = max2; i26 < min2; i26++) {
                int i27 = max;
                while (i27 < min) {
                    int i28 = this.t[(i27 - e) + i0.a.e(i26, e7, i19, i22)];
                    iArr3[(i27 - max) + ((i26 - max2) * i24)] = ((i28 & at.e4) << 16) | ((-16711936) & i28) | ((i28 >>> 16) & at.e4);
                    i27++;
                    e = e;
                }
            }
            this.o.setPixels(iArr3, 0, i24, max, max2, i24, i25);
            return;
        }
        this.u = i13 + 2;
        int i29 = iArr[i14];
        if (i29 > 0) {
            this.q.save();
            for (int i30 = 0; i30 < i29; i30++) {
                Path path = this.f;
                f(path, false);
                int[] iArr4 = this.t;
                int i31 = this.u;
                this.u = i31 + 1;
                path.setFillType(iArr4[i31] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                this.q.clipPath(path);
            }
        }
        int i32 = this.v;
        Path path2 = this.e;
        if (i32 == 1 || i32 == 2 || i32 == 3) {
            f(path2, i32 == 3);
        }
        int i33 = this.v;
        if (i33 == 3) {
            this.q.drawPath(path2, this.d);
        } else {
            int[] iArr5 = this.t;
            if (i33 == 1 || i33 == 2) {
                path2.setFillType(iArr5[this.u] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
            }
            this.u++;
            float e10 = e();
            float[] fArr = this.i;
            fArr[0] = e10;
            fArr[3] = e();
            fArr[1] = e();
            fArr[4] = e();
            fArr[2] = e();
            fArr[5] = e();
            this.A = Math.max(0.0f, Math.min(1.0f, e()));
            int i34 = this.u;
            int i35 = i34 + 1;
            this.u = i35;
            this.w = iArr5[i34];
            int i36 = i34 + 2;
            this.u = i36;
            Object[] objArr = iArr5[i35] != 0;
            this.z = 0;
            if (objArr != false) {
                this.u = i34 + 3;
                this.z = iArr5[i36];
                this.B = e();
                this.C = e();
                this.D = e();
            }
            int i37 = this.v;
            if (i37 == 1 || i37 == 2 || i37 == 4) {
                int i38 = this.u;
                int i39 = i38 + 1;
                this.u = i39;
                int i40 = iArr5[i38];
                this.x = i40;
                this.E = null;
                this.F = null;
                this.y = 0;
                if (i40 == 0) {
                    this.u = i38 + 2;
                    this.y = iArr5[i39];
                } else {
                    for (int i41 = 0; i41 < 6; i41++) {
                        this.j[i41] = e();
                    }
                    int[] iArr6 = this.t;
                    int i42 = this.u;
                    this.u = i42 + 1;
                    int i43 = iArr6[i42];
                    if (i43 == 0) {
                        z10 = false;
                        i10 = 2;
                    } else {
                        int[] iArr7 = new int[Math.max(2, i43)];
                        float[] fArr2 = new float[i43 == 1 ? 2 : i43];
                        int i44 = 0;
                        while (i44 < i43) {
                            float e11 = e();
                            int i45 = i16;
                            int[] iArr8 = this.t;
                            int i46 = this.u;
                            this.u = i46 + 1;
                            iArr7[i44] = iArr8[i46];
                            fArr2[i44] = Math.max(0.0f, Math.min(1.0f, e11));
                            i44++;
                            i16 = i45;
                            z12 = z12;
                        }
                        z10 = z12;
                        i10 = i16;
                        if (i43 == 1) {
                            iArr7[1] = iArr7[z10 ? 1 : 0];
                            fArr2[z10 ? 1 : 0] = 0.0f;
                            fArr2[1] = 1.0f;
                        }
                        this.E = iArr7;
                        this.F = fArr2;
                    }
                    z11 = z10;
                    this.U = z11;
                    if (this.v == 4) {
                        int[] iArr9 = this.t;
                        int i47 = this.u;
                        int i48 = i47 + 1;
                        this.u = i48;
                        this.M = iArr9[i47];
                        this.u = i47 + 2;
                        int i49 = iArr9[i48];
                        byte[] bArr = new byte[i49];
                        for (int i50 = 0; i50 < i49; i50++) {
                            bArr[i50] = (byte) (this.t[this.u + (i50 >> 2)] >>> ((i50 & 3) * 8));
                        }
                        this.u += (i49 + 3) >> 2;
                        this.P = new String(bArr, StandardCharsets.UTF_8);
                        this.Q = e();
                        this.R = e();
                        this.S = e();
                        this.T = e();
                        int[] iArr10 = this.t;
                        int i51 = this.u;
                        this.u = i51 + 1;
                        this.U = iArr10[i51] != 0;
                    }
                    if (this.v != i10 || this.U) {
                        this.I = e();
                        int[] iArr11 = this.t;
                        int i52 = this.u;
                        int i53 = i52 + 1;
                        this.u = i53;
                        this.G = iArr11[i52];
                        this.u = i52 + 2;
                        this.H = iArr11[i53];
                        this.J = e();
                        int[] iArr12 = this.t;
                        int i54 = this.u;
                        this.u = i54 + 1;
                        i11 = iArr12[i54];
                        this.L = null;
                        if (i11 > 0) {
                            this.L = new float[i11];
                            for (int i55 = 0; i55 < i11; i55++) {
                                this.L[i55] = e();
                            }
                        }
                        this.K = e();
                    }
                    if (this.v == 5) {
                        int i56 = this.u;
                        int i57 = i56 + 1;
                        this.u = i57;
                        this.N = iArr5[i56];
                        this.u = i56 + 2;
                        this.O = iArr5[i57];
                        for (int i58 = 0; i58 < 8; i58++) {
                            this.k[i58] = e();
                        }
                        int i59 = this.u;
                        this.u = i59 + 1;
                        this.V = iArr5[i59] != 0;
                    }
                    if (this.v != 1 && this.x == 0 && this.A == 1.0f && this.w == 0 && this.z == 0) {
                        int i60 = this.y;
                        Paint paint = this.b;
                        paint.setColor(i60);
                        this.q.drawPath(path2, paint);
                    } else {
                        i12 = this.z;
                        Paint paint2 = this.c;
                        if (i12 == 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(this.o.getWidth(), this.o.getHeight(), Bitmap.Config.ARGB_8888);
                            c(new Canvas(createBitmap), cVar);
                            Paint paint3 = new Paint(1);
                            float f7 = this.D / 2.0f;
                            if (f7 > 0.5f) {
                                paint3.setMaskFilter(new BlurMaskFilter((f7 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
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
                            c(this.q, cVar);
                            this.q.restore();
                        } else {
                            c(this.q, cVar);
                        }
                    }
                }
            }
            z11 = false;
            i10 = 2;
            this.U = z11;
            if (this.v == 4) {
            }
            if (this.v != i10) {
            }
            this.I = e();
            int[] iArr112 = this.t;
            int i522 = this.u;
            int i532 = i522 + 1;
            this.u = i532;
            this.G = iArr112[i522];
            this.u = i522 + 2;
            this.H = iArr112[i532];
            this.J = e();
            int[] iArr122 = this.t;
            int i542 = this.u;
            this.u = i542 + 1;
            i11 = iArr122[i542];
            this.L = null;
            if (i11 > 0) {
            }
            this.K = e();
            if (this.v == 5) {
            }
            if (this.v != 1) {
            }
            i12 = this.z;
            Paint paint22 = this.c;
            if (i12 == 0) {
            }
        }
        if (i29 > 0) {
            this.q.restore();
        }
    }
}
