// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xzc {
    public static final PorterDuff.Mode[] Y = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
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
    public volatile long W;
    public long X;
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

    public xzc(int i) {
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
        this.n = i;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(int i, Paint paint) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            vzc.a(i, paint);
            return;
        }
        if (i > 0) {
            PorterDuff.Mode[] modeArr = Y;
            if (i < modeArr.length) {
                mode = modeArr[i];
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
        int i = this.x;
        float[] fArr2 = this.j;
        if (i == 1) {
            paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
            return;
        }
        if (i != 2) {
            SweepGradient sweepGradient = new SweepGradient(fArr2[1], fArr2[2], iArr, fArr);
            Matrix matrix = new Matrix();
            matrix.setRotate((float) Math.toDegrees(fArr2[0]), fArr2[1], fArr2[2]);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        float f = fArr2[2];
        float max = Math.max(fArr2[5], 0.01f);
        if (f > 0.0f && f < max) {
            float[] fArr3 = new float[fArr.length];
            for (int i2 = 0; i2 < fArr.length; i2++) {
                float f2 = f / max;
                fArr3[i2] = qd4.A(1.0f, f2, fArr[i2], f2);
            }
            fArr = fArr3;
        }
        paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, wzc wzcVar) {
        Bitmap image;
        boolean z;
        char c;
        char c2;
        char c3;
        char c4;
        Bitmap bitmap;
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
        int i = this.v;
        if (i == 1 || i == 2) {
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
        } else if (i == 4) {
            Paint font = wzcVar.font(this.M);
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
        } else if (i == 5) {
            int i2 = this.N;
            if (i2 != 0) {
                int i3 = this.n;
                image = i2 == i3 ? this.o : wzcVar.canvasBitmap(i2);
                if (this.N == i3) {
                    z = true;
                    if (image != null) {
                        if (z) {
                            c = 5;
                            c2 = 3;
                            c3 = 1;
                            c4 = 4;
                            long width = image.getWidth() * image.getHeight();
                            long j = this.X;
                            if (width <= 1073741824 - j) {
                                this.X = j + width;
                                bitmap = image.copy(Bitmap.Config.ARGB_8888, false);
                            }
                        } else {
                            c = 5;
                            c2 = 3;
                            c3 = 1;
                            c4 = 4;
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            image = bitmap;
                        }
                        canvas.concat(matrix);
                        paint.setFilterBitmap(this.V);
                        float[] fArr2 = this.k;
                        float f = fArr2[c4];
                        float f2 = fArr2[c];
                        float f3 = fArr2[6] + f;
                        float f4 = fArr2[7] + f2;
                        RectF rectF = this.l;
                        rectF.set(f, f2, f3, f4);
                        float f5 = fArr2[2];
                        if (f5 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f6 = fArr2[0];
                            float f7 = fArr2[c3];
                            int i4 = (int) (f6 + f5);
                            int i5 = (int) (f7 + fArr2[c2]);
                            Rect rect = this.m;
                            rect.set((int) f6, (int) f7, i4, i5);
                            canvas.drawBitmap(image, rect, rectF, paint);
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                }
            } else {
                image = wzcVar.image(this.O);
            }
            z = false;
            if (image != null) {
            }
        }
        canvas.restore();
    }

    public final void d(Paint paint) {
        paint.setStrokeWidth(this.I);
        int i = this.G;
        paint.setStrokeCap(i == 1 ? Paint.Cap.ROUND : i == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
        int i2 = this.H;
        paint.setStrokeJoin(i2 == 1 ? Paint.Join.ROUND : i2 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
        paint.setStrokeMiter(this.J);
        paint.setPathEffect(null);
        float[] fArr = this.L;
        if (fArr != null) {
            int length = fArr.length;
            int i3 = length % 2 == 1 ? length << 1 : length;
            float[] fArr2 = new float[i3];
            float f = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                float max = Math.max(0.0f, this.L[i4 % length]);
                fArr2[i4] = max;
                f += max;
            }
            if (f > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr2, this.K));
            }
        }
    }

    public final void e(int i) {
        if (i < 0 || i > this.t.length - this.u) {
            lq5.j("Canvas batch: count");
        }
    }

    public final float f() {
        int[] iArr = this.t;
        int i = this.u;
        this.u = i + 1;
        return Float.intBitsToFloat(iArr[i]);
    }

    public final void g(Path path, boolean z) {
        path.rewind();
        int[] iArr = this.t;
        int i = this.u;
        int i2 = i + 1;
        this.u = i2;
        int i3 = iArr[i];
        this.u = i + 2;
        int i4 = iArr[i2];
        e(i3);
        if (i4 >= 0) {
            int[] iArr2 = this.t;
            int length = iArr2.length;
            int i5 = this.u;
            if (i4 <= (length - i5) - i3) {
                int i6 = i5 + i3;
                int i7 = i6 + i4;
                int i8 = i6;
                for (int i9 = i5; i9 < i6; i9++) {
                    int i10 = iArr2[i9];
                    if (((i10 == 0 || i10 == 1) ? 2 : i10 == 2 ? 4 : i10 == 3 ? 6 : 0) + i8 > i7) {
                        lq5.j("Canvas batch: path");
                        return;
                    }
                    if (i10 == 0) {
                        path.moveTo(Float.intBitsToFloat(iArr2[i8]), Float.intBitsToFloat(iArr2[i8 + 1]));
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            path.quadTo(Float.intBitsToFloat(iArr2[i8]), Float.intBitsToFloat(iArr2[i8 + 1]), Float.intBitsToFloat(iArr2[i8 + 2]), Float.intBitsToFloat(iArr2[i8 + 3]));
                            i8 += 4;
                        } else if (i10 == 3) {
                            path.cubicTo(Float.intBitsToFloat(iArr2[i8]), Float.intBitsToFloat(iArr2[i8 + 1]), Float.intBitsToFloat(iArr2[i8 + 2]), Float.intBitsToFloat(iArr2[i8 + 3]), Float.intBitsToFloat(iArr2[i8 + 4]), Float.intBitsToFloat(iArr2[i8 + 5]));
                            i8 += 6;
                        } else if (i10 == 4) {
                            path.close();
                        }
                    } else {
                        path.lineTo(Float.intBitsToFloat(iArr2[i8]), Float.intBitsToFloat(iArr2[i8 + 1]));
                    }
                    i8 += 2;
                }
                this.u = i3 + i4 + this.u;
                if (z) {
                    path.setFillType(Path.FillType.WINDING);
                    return;
                }
                return;
            }
        }
        lq5.j("Canvas batch: count");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(wzc wzcVar) {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        int i;
        int i2;
        Paint paint;
        float f2;
        float f3;
        float f4;
        float f5;
        long j;
        int[] iArr = this.t;
        int i3 = this.u;
        int i4 = i3 + 1;
        this.u = i4;
        int i5 = iArr[i3];
        this.v = i5;
        boolean z4 = false;
        if (i5 == 0) {
            this.o.eraseColor(0);
            return;
        }
        if (i5 == 6) {
            int f6 = (int) f();
            int f7 = (int) f();
            int[] iArr2 = this.t;
            int i6 = this.u;
            int i7 = i6 + 1;
            this.u = i7;
            int i8 = iArr2[i6];
            int i9 = i6 + 2;
            this.u = i9;
            int i10 = iArr2[i7];
            int i11 = i6 + 3;
            this.u = i11;
            int i12 = iArr2[i9];
            if (i12 >= 0) {
                long j2 = i12;
                if (((3 + j2) >> 2) <= iArr2.length - i11) {
                    this.u = ((i12 + 3) >> 2) + i11;
                    if (i8 <= 0 || i10 <= 0 || j2 != ((i8 * i10) << 2)) {
                        return;
                    }
                    int max = Math.max(0, f6);
                    int max2 = Math.max(0, f7);
                    int min = Math.min(this.o.getWidth(), f6 + i8);
                    int min2 = Math.min(this.o.getHeight(), i10 + f7);
                    if (min <= max || min2 <= max2) {
                        return;
                    }
                    int i13 = min - max;
                    int i14 = min2 - max2;
                    int[] iArr3 = new int[i13 * i14];
                    for (int i15 = max2; i15 < min2; i15++) {
                        int i16 = max;
                        while (i16 < min) {
                            int i17 = this.t[(i16 - f6) + bp1.h(i15, f7, i8, i11)];
                            iArr3[(i16 - max) + ((i15 - max2) * i13)] = ((-16711936) & i17) | ((i17 & jn7.d4) << 16) | ((i17 >>> 16) & jn7.d4);
                            i16++;
                            f6 = f6;
                        }
                    }
                    this.o.setPixels(iArr3, 0, i13, max, max2, i13, i14);
                    return;
                }
            }
            lq5.j("Canvas batch: pixels");
            return;
        }
        this.u = i3 + 2;
        int i18 = iArr[i4];
        e(i18);
        if (i18 > 0) {
            this.q.save();
            for (int i19 = 0; i19 < i18; i19++) {
                Path path = this.f;
                g(path, false);
                int[] iArr4 = this.t;
                int i20 = this.u;
                this.u = i20 + 1;
                path.setFillType(iArr4[i20] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                this.q.clipPath(path);
            }
        }
        int i21 = this.v;
        Path path2 = this.e;
        if (i21 == 1 || i21 == 2 || i21 == 3) {
            g(path2, i21 == 3);
        }
        int i22 = this.v;
        if (i22 == 3) {
            this.q.drawPath(path2, this.d);
        } else {
            int[] iArr5 = this.t;
            if (i22 == 1 || i22 == 2) {
                path2.setFillType(iArr5[this.u] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
            }
            this.u++;
            float f8 = f();
            float[] fArr = this.i;
            fArr[0] = f8;
            fArr[3] = f();
            fArr[1] = f();
            fArr[4] = f();
            fArr[2] = f();
            fArr[5] = f();
            this.A = Math.max(0.0f, Math.min(1.0f, f()));
            int i23 = this.u;
            int i24 = i23 + 1;
            this.u = i24;
            this.w = iArr5[i23];
            int i25 = i23 + 2;
            this.u = i25;
            Object[] objArr = iArr5[i24] != 0;
            this.z = 0;
            if (objArr != false) {
                this.u = i23 + 3;
                this.z = iArr5[i25];
                this.B = f();
                this.C = f();
                this.D = f();
            }
            int i26 = this.v;
            if (i26 == 1 || i26 == 2 || i26 == 4) {
                int i27 = this.u;
                int i28 = i27 + 1;
                this.u = i28;
                int i29 = iArr5[i27];
                this.x = i29;
                this.E = null;
                this.F = null;
                this.y = 0;
                if (i29 == 0) {
                    this.u = i27 + 2;
                    this.y = iArr5[i28];
                } else {
                    for (int i30 = 0; i30 < 6; i30++) {
                        this.j[i30] = f();
                    }
                    int[] iArr6 = this.t;
                    int i31 = this.u;
                    int i32 = i31 + 1;
                    this.u = i32;
                    int i33 = iArr6[i31];
                    if (i33 == 0) {
                        z = false;
                    } else {
                        if (i33 < 0 || i33 > (iArr6.length - i32) / 2) {
                            lq5.j("Canvas batch: stops");
                            return;
                        }
                        int[] iArr7 = new int[Math.max(2, i33)];
                        float[] fArr2 = new float[i33 == 1 ? 2 : i33];
                        int i34 = 0;
                        while (i34 < i33) {
                            float f9 = f();
                            int[] iArr8 = this.t;
                            int i35 = this.u;
                            this.u = i35 + 1;
                            iArr7[i34] = iArr8[i35];
                            fArr2[i34] = Math.max(0.0f, Math.min(1.0f, f9));
                            i34++;
                            z4 = z4;
                        }
                        z = z4;
                        if (i33 == 1) {
                            iArr7[1] = iArr7[z ? 1 : 0];
                            fArr2[z ? 1 : 0] = 0.0f;
                            fArr2[1] = 1.0f;
                        }
                        this.E = iArr7;
                        this.F = fArr2;
                    }
                    z2 = z;
                    this.U = z2;
                    if (this.v != 4) {
                        int[] iArr9 = this.t;
                        int i36 = this.u;
                        int i37 = i36 + 1;
                        this.u = i37;
                        this.M = iArr9[i36];
                        int i38 = i36 + 2;
                        this.u = i38;
                        int i39 = iArr9[i37];
                        if (i39 >= 0) {
                            long j3 = (i39 + 3) >> 2;
                            int length = iArr9.length - i38;
                            f = 1.0f;
                            if (j3 <= length) {
                                byte[] bArr = new byte[i39];
                                for (int i40 = 0; i40 < i39; i40++) {
                                    bArr[i40] = (byte) (this.t[this.u + (i40 >> 2)] >>> ((i40 & 3) << 3));
                                }
                                this.u += (i39 + 3) >> 2;
                                this.P = new String(bArr, StandardCharsets.UTF_8);
                                this.Q = f();
                                this.R = f();
                                this.S = f();
                                this.T = f();
                                int[] iArr10 = this.t;
                                int i41 = this.u;
                                this.u = i41 + 1;
                                z3 = iArr10[i41] != 0;
                                this.U = z3;
                            }
                        }
                        lq5.j("Canvas batch: bytes");
                        return;
                    }
                    f = 1.0f;
                    z3 = false;
                    if (this.v != 2 || z3) {
                        this.I = f();
                        int[] iArr11 = this.t;
                        int i42 = this.u;
                        int i43 = i42 + 1;
                        this.u = i43;
                        this.G = iArr11[i42];
                        this.u = i42 + 2;
                        this.H = iArr11[i43];
                        this.J = f();
                        int[] iArr12 = this.t;
                        int i44 = this.u;
                        this.u = i44 + 1;
                        i = iArr12[i44];
                        e(i);
                        this.L = null;
                        if (i > 0) {
                            this.L = new float[i];
                            for (int i45 = 0; i45 < i; i45++) {
                                this.L[i45] = f();
                            }
                        }
                        this.K = f();
                    }
                    if (this.v == 5) {
                        int i46 = this.u;
                        int i47 = i46 + 1;
                        this.u = i47;
                        this.N = iArr5[i46];
                        this.u = i46 + 2;
                        this.O = iArr5[i47];
                        for (int i48 = 0; i48 < 8; i48++) {
                            this.k[i48] = f();
                        }
                        int i49 = this.u;
                        this.u = i49 + 1;
                        this.V = iArr5[i49] != 0;
                    }
                    if (this.v != 1 && this.x == 0 && this.A == f && this.w == 0 && this.z == 0) {
                        int i50 = this.y;
                        Paint paint2 = this.b;
                        paint2.setColor(i50);
                        this.q.drawPath(path2, paint2);
                    } else {
                        i2 = this.z;
                        paint = this.c;
                        if (i2 == 0) {
                            long width = this.o.getWidth();
                            long height = this.o.getHeight();
                            float f10 = this.D / 2.0f;
                            f3 = 255.0f;
                            f2 = f;
                            if ((f10 > 0.5f ? Math.min((f10 - 0.5f) / 0.57735f, 1024.0f) : 0.0f) > 0.0f) {
                                f4 = 2.0f;
                                f5 = 0.5f;
                                j = (long) Math.ceil(xnb.z(r3, 0.57735f, 0.5f, 3.0f));
                            } else {
                                f4 = 2.0f;
                                f5 = 0.5f;
                                j = 0;
                            }
                            long j4 = j << 1;
                            long j5 = ((height + j4) * (width + j4)) + (width * height);
                            long j6 = this.X;
                            if (j5 <= 1073741824 - j6) {
                                this.X = j6 + j5;
                                Bitmap createBitmap = Bitmap.createBitmap(this.o.getWidth(), this.o.getHeight(), Bitmap.Config.ARGB_8888);
                                c(new Canvas(createBitmap), wzcVar);
                                Paint paint3 = new Paint(1);
                                float f11 = this.D / f4;
                                float min3 = f11 > f5 ? Math.min((f11 - f5) / 0.57735f, 1024.0f) : 0.0f;
                                if (min3 > 0.0f) {
                                    paint3.setMaskFilter(new BlurMaskFilter(min3, BlurMaskFilter.Blur.NORMAL));
                                }
                                Bitmap extractAlpha = createBitmap.extractAlpha(paint3, new int[2]);
                                paint.reset();
                                paint.setAlpha(Math.round(this.A * 255.0f));
                                b(this.w, paint);
                                this.q.saveLayer(null, paint);
                                Paint paint4 = new Paint(1);
                                paint4.setColor(this.z);
                                this.q.drawBitmap(extractAlpha, r4[0] + this.B, r4[1] + this.C, paint4);
                                this.q.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                                this.q.restore();
                                extractAlpha.recycle();
                                createBitmap.recycle();
                            }
                        } else {
                            f2 = f;
                            f3 = 255.0f;
                        }
                        if (this.A >= f2 || this.w != 0) {
                            paint.reset();
                            paint.setAlpha(Math.round(this.A * f3));
                            b(this.w, paint);
                            this.q.saveLayer(null, paint);
                            c(this.q, wzcVar);
                            this.q.restore();
                        } else {
                            c(this.q, wzcVar);
                        }
                    }
                }
            }
            z2 = false;
            this.U = z2;
            if (this.v != 4) {
            }
            if (this.v != 2) {
            }
            this.I = f();
            int[] iArr112 = this.t;
            int i422 = this.u;
            int i432 = i422 + 1;
            this.u = i432;
            this.G = iArr112[i422];
            this.u = i422 + 2;
            this.H = iArr112[i432];
            this.J = f();
            int[] iArr122 = this.t;
            int i442 = this.u;
            this.u = i442 + 1;
            i = iArr122[i442];
            e(i);
            this.L = null;
            if (i > 0) {
            }
            this.K = f();
            if (this.v == 5) {
            }
            if (this.v != 1) {
            }
            i2 = this.z;
            paint = this.c;
            if (i2 == 0) {
            }
            if (this.A >= f2) {
            }
            paint.reset();
            paint.setAlpha(Math.round(this.A * f3));
            b(this.w, paint);
            this.q.saveLayer(null, paint);
            c(this.q, wzcVar);
            this.q.restore();
        }
        if (i18 > 0) {
            this.q.restore();
        }
    }

    public final synchronized void i() {
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.o = null;
        this.q = null;
        this.p = null;
    }

    public final synchronized Bitmap j() {
        Bitmap copy;
        Bitmap bitmap = this.o;
        if (bitmap == null) {
            return null;
        }
        if (this.s != this.r || (copy = this.p) == null) {
            copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.p = copy;
            this.s = this.r;
        }
        return copy;
    }
}
