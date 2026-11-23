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
import com.google.android.gms.internal.vision.e2;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class i {
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

    public i(int i7) {
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
            g.a(i7, paint);
            return;
        }
        if (i7 > 0) {
            PorterDuff.Mode[] modeArr = Y;
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
                fArr3[i10] = e2.z(1.0f, f11, fArr[i10], f11);
            }
            fArr = fArr3;
        }
        paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, h hVar) {
        char c10;
        Bitmap image;
        boolean z10;
        char c11;
        char c12;
        char c13;
        char c14;
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
            Paint font = hVar.font(this.M);
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
                image = i10 == i11 ? this.o : hVar.canvasBitmap(i10);
                if (this.N == i11) {
                    z10 = true;
                    if (image != null) {
                        if (z10) {
                            c11 = 5;
                            c12 = 3;
                            c13 = 1;
                            c14 = 4;
                            long width = image.getWidth() * image.getHeight();
                            long j3 = this.X;
                            if (width <= 1073741824 - j3) {
                                this.X = j3 + width;
                            }
                        } else {
                            c11 = 5;
                            c12 = 3;
                            c13 = 1;
                            c14 = 4;
                        }
                        Bitmap copy = z10 ? image.copy(Bitmap.Config.ARGB_8888, false) : null;
                        if (copy != null) {
                            image = copy;
                        }
                        canvas.concat(matrix);
                        paint.setFilterBitmap(this.V);
                        float[] fArr2 = this.k;
                        float f10 = fArr2[c14];
                        float f11 = fArr2[c11];
                        float f12 = fArr2[c10] + f10;
                        float f13 = fArr2[7] + f11;
                        RectF rectF = this.l;
                        rectF.set(f10, f11, f12, f13);
                        float f14 = fArr2[2];
                        if (f14 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f15 = fArr2[0];
                            float f16 = fArr2[c13];
                            int i12 = (int) (f15 + f14);
                            int i13 = (int) (f16 + fArr2[c12]);
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
                image = hVar.image(this.O);
            }
            z10 = false;
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

    public final void e(int i7) {
        if (i7 < 0 || i7 > this.t.length - this.u) {
            throw new IllegalArgumentException("Canvas batch: count");
        }
    }

    public final float f() {
        int[] iArr = this.t;
        int i7 = this.u;
        this.u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void g(Path path, boolean z10) {
        path.rewind();
        int[] iArr = this.t;
        int i7 = this.u;
        int i10 = i7 + 1;
        this.u = i10;
        int i11 = iArr[i7];
        this.u = i7 + 2;
        int i12 = iArr[i10];
        e(i11);
        if (i12 >= 0) {
            int[] iArr2 = this.t;
            int length = iArr2.length;
            int i13 = this.u;
            if (i12 <= (length - i13) - i11) {
                int i14 = i13 + i11;
                int i15 = i14 + i12;
                int i16 = i14;
                for (int i17 = i13; i17 < i14; i17++) {
                    int i18 = iArr2[i17];
                    if (((i18 == 0 || i18 == 1) ? 2 : i18 == 2 ? 4 : i18 == 3 ? 6 : 0) + i16 > i15) {
                        throw new IllegalArgumentException("Canvas batch: path");
                    }
                    if (i18 == 0) {
                        path.moveTo(Float.intBitsToFloat(iArr2[i16]), Float.intBitsToFloat(iArr2[i16 + 1]));
                    } else if (i18 != 1) {
                        if (i18 == 2) {
                            path.quadTo(Float.intBitsToFloat(iArr2[i16]), Float.intBitsToFloat(iArr2[i16 + 1]), Float.intBitsToFloat(iArr2[i16 + 2]), Float.intBitsToFloat(iArr2[i16 + 3]));
                            i16 += 4;
                        } else if (i18 == 3) {
                            path.cubicTo(Float.intBitsToFloat(iArr2[i16]), Float.intBitsToFloat(iArr2[i16 + 1]), Float.intBitsToFloat(iArr2[i16 + 2]), Float.intBitsToFloat(iArr2[i16 + 3]), Float.intBitsToFloat(iArr2[i16 + 4]), Float.intBitsToFloat(iArr2[i16 + 5]));
                            i16 += 6;
                        } else if (i18 == 4) {
                            path.close();
                        }
                    } else {
                        path.lineTo(Float.intBitsToFloat(iArr2[i16]), Float.intBitsToFloat(iArr2[i16 + 1]));
                    }
                    i16 += 2;
                }
                this.u = i11 + i12 + this.u;
                if (z10) {
                    path.setFillType(Path.FillType.WINDING);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(h hVar) {
        boolean z10;
        boolean z11;
        float f10;
        int i7;
        int i10;
        Paint paint;
        float f11;
        float f12;
        long j3;
        float f13;
        long j10;
        int[] iArr = this.t;
        int i11 = this.u;
        int i12 = i11 + 1;
        this.u = i12;
        int i13 = iArr[i11];
        this.v = i13;
        boolean z12 = false;
        if (i13 == 0) {
            this.o.eraseColor(0);
            return;
        }
        if (i13 == 6) {
            int f14 = (int) f();
            int f15 = (int) f();
            int[] iArr2 = this.t;
            int i14 = this.u;
            int i15 = i14 + 1;
            this.u = i15;
            int i16 = iArr2[i14];
            int i17 = i14 + 2;
            this.u = i17;
            int i18 = iArr2[i15];
            int i19 = i14 + 3;
            this.u = i19;
            int i20 = iArr2[i17];
            if (i20 >= 0) {
                long j11 = i20;
                if (((3 + j11) >> 2) <= iArr2.length - i19) {
                    this.u = ((i20 + 3) >> 2) + i19;
                    if (i16 <= 0 || i18 <= 0 || j11 != i16 * i18 * 4) {
                        return;
                    }
                    int max = Math.max(0, f14);
                    int max2 = Math.max(0, f15);
                    int min = Math.min(this.o.getWidth(), f14 + i16);
                    int min2 = Math.min(this.o.getHeight(), i18 + f15);
                    if (min <= max || min2 <= max2) {
                        return;
                    }
                    int i21 = min - max;
                    int i22 = min2 - max2;
                    int[] iArr3 = new int[i21 * i22];
                    for (int i23 = max2; i23 < min2; i23++) {
                        int i24 = max;
                        while (i24 < min) {
                            int i25 = this.t[(i24 - f14) + e2.v(i23, f15, i16, i19)];
                            iArr3[(i24 - max) + ((i23 - max2) * i21)] = ((i25 & ls.e4) << 16) | ((-16711936) & i25) | ((i25 >>> 16) & ls.e4);
                            i24++;
                            f14 = f14;
                        }
                    }
                    this.o.setPixels(iArr3, 0, i21, max, max2, i21, i22);
                    return;
                }
            }
            throw new IllegalArgumentException("Canvas batch: pixels");
        }
        this.u = i11 + 2;
        int i26 = iArr[i12];
        e(i26);
        if (i26 > 0) {
            this.q.save();
            for (int i27 = 0; i27 < i26; i27++) {
                Path path = this.f;
                g(path, false);
                int[] iArr4 = this.t;
                int i28 = this.u;
                this.u = i28 + 1;
                path.setFillType(iArr4[i28] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                this.q.clipPath(path);
            }
        }
        int i29 = this.v;
        Path path2 = this.e;
        if (i29 == 1 || i29 == 2 || i29 == 3) {
            g(path2, i29 == 3);
        }
        int i30 = this.v;
        if (i30 == 3) {
            this.q.drawPath(path2, this.d);
        } else {
            int[] iArr5 = this.t;
            if (i30 == 1 || i30 == 2) {
                path2.setFillType(iArr5[this.u] != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
            }
            this.u++;
            float f16 = f();
            float[] fArr = this.i;
            fArr[0] = f16;
            fArr[3] = f();
            fArr[1] = f();
            fArr[4] = f();
            fArr[2] = f();
            fArr[5] = f();
            this.A = Math.max(0.0f, Math.min(1.0f, f()));
            int i31 = this.u;
            int i32 = i31 + 1;
            this.u = i32;
            this.w = iArr5[i31];
            int i33 = i31 + 2;
            this.u = i33;
            Object[] objArr = iArr5[i32] != 0;
            this.z = 0;
            if (objArr != false) {
                this.u = i31 + 3;
                this.z = iArr5[i33];
                this.B = f();
                this.C = f();
                this.D = f();
            }
            int i34 = this.v;
            if (i34 == 1 || i34 == 2 || i34 == 4) {
                int i35 = this.u;
                int i36 = i35 + 1;
                this.u = i36;
                int i37 = iArr5[i35];
                this.x = i37;
                this.E = null;
                this.F = null;
                this.y = 0;
                if (i37 == 0) {
                    this.u = i35 + 2;
                    this.y = iArr5[i36];
                } else {
                    for (int i38 = 0; i38 < 6; i38++) {
                        this.j[i38] = f();
                    }
                    int[] iArr6 = this.t;
                    int i39 = this.u;
                    int i40 = i39 + 1;
                    this.u = i40;
                    int i41 = iArr6[i39];
                    if (i41 == 0) {
                        z10 = false;
                    } else {
                        if (i41 < 0 || i41 > (iArr6.length - i40) / 2) {
                            throw new IllegalArgumentException("Canvas batch: stops");
                        }
                        int[] iArr7 = new int[Math.max(2, i41)];
                        float[] fArr2 = new float[i41 == 1 ? 2 : i41];
                        int i42 = 0;
                        while (i42 < i41) {
                            float f17 = f();
                            int[] iArr8 = this.t;
                            int i43 = this.u;
                            this.u = i43 + 1;
                            iArr7[i42] = iArr8[i43];
                            fArr2[i42] = Math.max(0.0f, Math.min(1.0f, f17));
                            i42++;
                            z12 = z12;
                        }
                        z10 = z12;
                        if (i41 == 1) {
                            iArr7[1] = iArr7[z10 ? 1 : 0];
                            fArr2[z10 ? 1 : 0] = 0.0f;
                            fArr2[1] = 1.0f;
                        }
                        this.E = iArr7;
                        this.F = fArr2;
                    }
                    z11 = z10;
                    this.U = z11;
                    if (this.v != 4) {
                        int[] iArr9 = this.t;
                        int i44 = this.u;
                        int i45 = i44 + 1;
                        this.u = i45;
                        this.M = iArr9[i44];
                        int i46 = i44 + 2;
                        this.u = i46;
                        int i47 = iArr9[i45];
                        if (i47 >= 0) {
                            long j12 = (i47 + 3) >> 2;
                            int length = iArr9.length - i46;
                            f10 = 1.0f;
                            if (j12 <= length) {
                                byte[] bArr = new byte[i47];
                                for (int i48 = 0; i48 < i47; i48++) {
                                    bArr[i48] = (byte) (this.t[this.u + (i48 >> 2)] >>> ((i48 & 3) * 8));
                                }
                                this.u += (i47 + 3) >> 2;
                                this.P = new String(bArr, StandardCharsets.UTF_8);
                                this.Q = f();
                                this.R = f();
                                this.S = f();
                                this.T = f();
                                int[] iArr10 = this.t;
                                int i49 = this.u;
                                this.u = i49 + 1;
                                this.U = iArr10[i49] != 0;
                            }
                        }
                        throw new IllegalArgumentException("Canvas batch: bytes");
                    }
                    f10 = 1.0f;
                    if (this.v != 2 || this.U) {
                        this.I = f();
                        int[] iArr11 = this.t;
                        int i50 = this.u;
                        int i51 = i50 + 1;
                        this.u = i51;
                        this.G = iArr11[i50];
                        this.u = i50 + 2;
                        this.H = iArr11[i51];
                        this.J = f();
                        int[] iArr12 = this.t;
                        int i52 = this.u;
                        this.u = i52 + 1;
                        i7 = iArr12[i52];
                        e(i7);
                        this.L = null;
                        if (i7 > 0) {
                            this.L = new float[i7];
                            for (int i53 = 0; i53 < i7; i53++) {
                                this.L[i53] = f();
                            }
                        }
                        this.K = f();
                    }
                    if (this.v == 5) {
                        int i54 = this.u;
                        int i55 = i54 + 1;
                        this.u = i55;
                        this.N = iArr5[i54];
                        this.u = i54 + 2;
                        this.O = iArr5[i55];
                        for (int i56 = 0; i56 < 8; i56++) {
                            this.k[i56] = f();
                        }
                        int i57 = this.u;
                        this.u = i57 + 1;
                        this.V = iArr5[i57] != 0;
                    }
                    if (this.v != 1 && this.x == 0 && this.A == f10 && this.w == 0 && this.z == 0) {
                        int i58 = this.y;
                        Paint paint2 = this.b;
                        paint2.setColor(i58);
                        this.q.drawPath(path2, paint2);
                    } else {
                        i10 = this.z;
                        paint = this.c;
                        if (i10 == 0) {
                            long width = this.o.getWidth();
                            long height = this.o.getHeight();
                            float f18 = this.D / 2.0f;
                            f12 = 255.0f;
                            f11 = f10;
                            if ((f18 > 0.5f ? Math.min((f18 - 0.5f) / 0.57735f, 1024.0f) : 0.0f) > 0.0f) {
                                j3 = width;
                                f13 = 0.57735f;
                                j10 = (long) Math.ceil(e2.B(r3, 0.57735f, 0.5f, 3.0f));
                            } else {
                                j3 = width;
                                f13 = 0.57735f;
                                j10 = 0;
                            }
                            long j13 = j10 * 2;
                            long j14 = ((height + j13) * (j3 + j13)) + (j3 * height);
                            long j15 = this.X;
                            if (j14 <= 1073741824 - j15) {
                                this.X = j15 + j14;
                                Bitmap createBitmap = Bitmap.createBitmap(this.o.getWidth(), this.o.getHeight(), Bitmap.Config.ARGB_8888);
                                c(new Canvas(createBitmap), hVar);
                                Paint paint3 = new Paint(1);
                                float f19 = this.D / 2.0f;
                                float min3 = f19 > 0.5f ? Math.min((f19 - 0.5f) / f13, 1024.0f) : 0.0f;
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
                            f11 = f10;
                            f12 = 255.0f;
                        }
                        if (this.A >= f11 || this.w != 0) {
                            paint.reset();
                            paint.setAlpha(Math.round(this.A * f12));
                            b(this.w, paint);
                            this.q.saveLayer(null, paint);
                            c(this.q, hVar);
                            this.q.restore();
                        } else {
                            c(this.q, hVar);
                        }
                    }
                }
            }
            z11 = false;
            this.U = z11;
            if (this.v != 4) {
            }
            if (this.v != 2) {
            }
            this.I = f();
            int[] iArr112 = this.t;
            int i502 = this.u;
            int i512 = i502 + 1;
            this.u = i512;
            this.G = iArr112[i502];
            this.u = i502 + 2;
            this.H = iArr112[i512];
            this.J = f();
            int[] iArr122 = this.t;
            int i522 = this.u;
            this.u = i522 + 1;
            i7 = iArr122[i522];
            e(i7);
            this.L = null;
            if (i7 > 0) {
            }
            this.K = f();
            if (this.v == 5) {
            }
            if (this.v != 1) {
            }
            i10 = this.z;
            paint = this.c;
            if (i10 == 0) {
            }
            if (this.A >= f11) {
            }
            paint.reset();
            paint.setAlpha(Math.round(this.A * f12));
            b(this.w, paint);
            this.q.saveLayer(null, paint);
            c(this.q, hVar);
            this.q.restore();
        }
        if (i26 > 0) {
            this.q.restore();
        }
    }

    public final synchronized void i() {
        try {
            Bitmap bitmap = this.o;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.o = null;
            this.q = null;
            this.p = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Bitmap j() {
        try {
            Bitmap bitmap = this.o;
            if (bitmap == null) {
                return null;
            }
            if (this.s == this.r) {
                if (this.p == null) {
                }
                return this.p;
            }
            this.p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.s = this.r;
            return this.p;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
