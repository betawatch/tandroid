package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class y {
    public final RectF A;
    public final RectF B;
    public final Matrix C;
    public long D;
    public long E;
    public final Paint a = new Paint(1);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final RectF h;
    public final RectF i;
    public final float[] j;
    public final float[] k;
    public final Matrix l;
    public final HashMap m;
    public final IdentityHashMap n;
    public final float[] o;
    public final RectF p;
    public final RectF q;
    public final float[] r;
    public boolean s;
    public boolean t;
    public float[] u;
    public int v;
    public int w;
    public int x;
    public long y;
    public long z;

    public y() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new float[8];
        this.k = new float[8];
        this.l = new Matrix();
        this.m = new HashMap();
        this.n = new IdentityHashMap();
        this.o = new float[9];
        this.p = new RectF();
        this.q = new RectF();
        this.r = new float[8];
        this.u = new float[64];
        this.z = 67108864L;
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i, float... fArr2) {
        int i2 = 0;
        while (i2 < i) {
            float f = i2 < fArr2.length ? fArr2[i2] : 0.0f;
            if (jSONArray != null && i2 < jSONArray.length()) {
                f = (float) jSONArray.optDouble(i2, f);
            }
            fArr[i2] = f;
            i2++;
        }
    }

    public static long h(float f, float f2, float f3) {
        double d = f3;
        double ceil = Math.ceil(f * d);
        double ceil2 = Math.ceil(f2 * d);
        if (ceil <= 0.0d || ceil2 <= 0.0d) {
            return 0L;
        }
        return (long) Math.min(ceil * ceil2, 1.0E15d);
    }

    public static float j(sm2 sm2Var, RectF rectF) {
        int[] iArr = (int[]) sm2Var.b;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float max = Math.max(0.0f, ((float[]) sm2Var.f)[i]);
            int i2 = iArr[i];
            if (i2 == 0) {
                float f5 = max * 3.0f;
                f += f5;
                f2 += f5;
                f3 += f5;
                f4 += f5;
            } else if (i2 == 9) {
                float f6 = ((float[]) sm2Var.d)[i];
                float f7 = ((float[]) sm2Var.e)[i];
                float f8 = max * 1.5f;
                f = Math.max(f, f8 - f6);
                f3 = Math.max(f3, f6 + f8);
                f2 = Math.max(f2, f8 - f7);
                f4 = Math.max(f4, f8 + f7);
            }
        }
        rectF.set(rectF.left - f, rectF.top - f2, rectF.right + f3, rectF.bottom + f4);
        return Math.max(Math.max(f, f3), Math.max(f2, f4));
    }

    public static sm2 k(de deVar) {
        int Z = deVar.Z(64, 5);
        sm2 sm2Var = new sm2(Z);
        for (int i = 0; i < Z; i++) {
            ((int[]) sm2Var.b)[i] = deVar.j0();
            ((float[]) sm2Var.f)[i] = deVar.d0();
            ((float[]) sm2Var.d)[i] = deVar.d0();
            ((float[]) sm2Var.e)[i] = deVar.d0();
            ((int[]) sm2Var.c)[i] = deVar.j0();
        }
        return sm2Var;
    }

    public static void m(de deVar, int i, int[] iArr, float[] fArr) {
        for (int i2 = 0; i2 < i; i2++) {
            float max = Math.max(0.0f, Math.min(1.0f, deVar.d0()));
            iArr[i2] = deVar.j0();
            if (i > 1) {
                fArr[i2] = max;
            }
        }
        if (i == 1) {
            iArr[1] = iArr[0];
        }
    }

    public final void a(Path path, RectF rectF, float f) {
        if (!this.s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.j;
            if (i >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i] = Math.max(this.r[i] + f, 0.0f);
                i++;
            }
        }
    }

    public final void b(int i, int i2) {
        this.v = 0;
        this.w = 0;
        this.y = 0L;
        this.x = 0;
        this.z = Math.max(67108864L, (Math.max(0, i) << 3) * Math.max(0, i2));
    }

    public final void c(Canvas canvas, Paint paint) {
        float f;
        if (this.s) {
            float[] fArr = this.r;
            f = fArr[0];
            int i = 1;
            while (true) {
                if (i >= 8) {
                    break;
                }
                if (fArr[i] != f) {
                    f = -1.0f;
                    break;
                }
                i++;
            }
        } else {
            f = 0.0f;
        }
        RectF rectF = this.p;
        if (f == 0.0f) {
            canvas.drawRect(rectF, paint);
        } else {
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
                return;
            }
            Path path = this.e;
            n(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0602 A[LOOP:2: B:245:0x0600->B:246:0x0602, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x051a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, kxc kxcVar, int i, eyc eycVar, float f, boolean z) {
        lma lmaVar;
        int i2;
        y yVar;
        Matrix matrix;
        ArrayList arrayList;
        de deVar;
        lma lmaVar2;
        Paint paint;
        Paint paint2;
        de deVar2;
        lma lmaVar3;
        int i3;
        Shader shader;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        float[] fArr;
        float f3;
        float f4;
        Shader shader2;
        int i9;
        float f5;
        Shader shader3;
        int i10;
        Paint.Cap cap;
        int i11;
        int i12;
        float f6;
        float[] fArr2;
        int i13;
        lma lmaVar4;
        Matrix matrix2;
        boolean z2;
        RectF rectF;
        long h;
        boolean z3;
        lma lmaVar5;
        int i14;
        BlurMaskFilter blurMaskFilter;
        float f7;
        lma lmaVar6;
        y yVar2 = this;
        int[] iArr = kxcVar.f;
        lma lmaVar7 = new lma(canvas);
        Matrix matrix3 = (Matrix) lmaVar7.f;
        ArrayList arrayList2 = (ArrayList) lmaVar7.h;
        de deVar3 = new de(kxcVar);
        int i15 = 0;
        while (i15 < i) {
            Canvas canvas2 = (Canvas) lmaVar7.d;
            int j0 = deVar3.j0();
            int i16 = j0 & nm7.d4;
            int i17 = j0 >>> 8;
            int i18 = i17 & 1;
            RectF rectF2 = yVar2.p;
            if (i18 != 0) {
                float d0 = deVar3.d0();
                float d02 = deVar3.d0();
                lmaVar = lmaVar7;
                rectF2.set(d0, d02, d0 + deVar3.d0(), d02 + deVar3.d0());
            } else {
                lmaVar = lmaVar7;
                rectF2.setEmpty();
            }
            boolean z4 = (i17 & 2) != 0;
            yVar2.s = z4;
            float[] fArr3 = yVar2.r;
            if (z4) {
                deVar3.e0(8, fArr3);
            }
            boolean z5 = (i17 & 4) != 0;
            yVar2.t = z5;
            RectF rectF3 = yVar2.q;
            if (z5) {
                float d03 = deVar3.d0();
                float d04 = deVar3.d0();
                i2 = 1;
                rectF3.set(d03, d04, d03 + deVar3.d0(), d04 + deVar3.d0());
            } else {
                i2 = 1;
            }
            RectF rectF4 = yVar2.i;
            float[] fArr4 = yVar2.o;
            float[] fArr5 = yVar2.k;
            Paint paint3 = yVar2.b;
            int i19 = i15;
            Path path = yVar2.f;
            Paint paint4 = yVar2.a;
            int[] iArr2 = iArr;
            RectF rectF5 = yVar2.h;
            switch (i16) {
                case 0:
                    yVar = yVar2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    int j02 = deVar.j0();
                    if (yVar.t) {
                        canvas2.save();
                        canvas2.clipRect(rectF3);
                    }
                    paint4.setShader(null);
                    paint4.setColor(j02);
                    yVar.c(canvas2, paint4);
                    if (yVar.t) {
                        canvas2.restore();
                    }
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 1:
                    yVar = yVar2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    paint3.setColor(deVar.j0());
                    paint3.setStrokeWidth(deVar.d0());
                    paint3.setStrokeCap(Paint.Cap.BUTT);
                    paint3.setStrokeJoin(Paint.Join.MITER);
                    paint3.setPathEffect(null);
                    yVar.c(canvas2, paint3);
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 2:
                    yVar = yVar2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    int j03 = deVar.j0();
                    paint4.setShader(null);
                    paint4.setColor(j03);
                    canvas2.drawOval(rectF2, paint4);
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 3:
                    yVar = yVar2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    int j04 = deVar.j0();
                    float d05 = deVar.d0();
                    rectF5.set(rectF2);
                    float f8 = d05 / 2.0f;
                    rectF5.inset(f8, f8);
                    paint3.setColor(j04);
                    paint3.setStrokeWidth(d05);
                    paint3.setStrokeCap(Paint.Cap.BUTT);
                    paint3.setStrokeJoin(Paint.Join.MITER);
                    paint3.setPathEffect(null);
                    canvas2.drawOval(rectF5, paint3);
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 4:
                    yVar = yVar2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    int j05 = deVar.j0();
                    int j06 = deVar.j0();
                    float d06 = deVar.d0();
                    float d07 = deVar.d0();
                    int j07 = deVar.j0();
                    Paint deviceFont = eycVar.deviceFont(j06);
                    if (deviceFont == null) {
                        paint = null;
                    } else {
                        IdentityHashMap identityHashMap = yVar.n;
                        paint = (Paint) identityHashMap.get(deviceFont);
                        if (paint == null) {
                            if (identityHashMap.size() >= 64) {
                                identityHashMap.clear();
                            }
                            paint = new Paint(deviceFont);
                            identityHashMap.put(deviceFont, paint);
                        }
                    }
                    if (paint != null) {
                        if (j07 >= 0) {
                            String[] strArr = kxcVar.g;
                            if (j07 < strArr.length) {
                                int i20 = iArr2[j07];
                                int i21 = yVar.x;
                                if (i20 <= TLObject.FLAG_20 - i21) {
                                    yVar.x = i21 + i20;
                                    if (j07 < 0 || j07 >= strArr.length) {
                                        throw kxc.a();
                                    }
                                    String str = strArr[j07];
                                    if (str == null) {
                                        str = new String(kxcVar.a.array(), kxcVar.e[j07], iArr2[j07], StandardCharsets.UTF_8);
                                        strArr[j07] = str;
                                    }
                                    paint.setColor(j05);
                                    paint.setShader(null);
                                    canvas2.save();
                                    float f9 = 1.0f / f;
                                    canvas2.scale(f9, f9);
                                    canvas2.drawText(str, d06 * f, d07 * f, paint);
                                    canvas2.restore();
                                } else {
                                    continue;
                                }
                            }
                        }
                        throw kxc.a();
                    }
                    continue;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 5:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    lmaVar2 = lmaVar;
                    int i22 = deVar.j0() != 0 ? i2 : 0;
                    int j08 = deVar.j0();
                    Bitmap canvas3 = i22 != 0 ? eycVar.canvas(j08) : eycVar.image(j08);
                    if (canvas3 != null) {
                        canvas2.save();
                        yVar = this;
                        if (yVar.t) {
                            canvas2.clipRect(rectF3);
                        }
                        if (yVar.s) {
                            if (!yVar.t) {
                                rectF3 = rectF2;
                            }
                            yVar.n(rectF3, path);
                            canvas2.clipPath(path);
                        }
                        canvas2.drawBitmap(canvas3, (Rect) null, rectF2, yVar.c);
                        canvas2.restore();
                        i15 = i19 + 1;
                        yVar2 = yVar;
                        lmaVar7 = lmaVar2;
                        deVar3 = deVar;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    }
                    yVar = this;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 6:
                case 7:
                case 8:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    de deVar4 = deVar3;
                    lma lmaVar8 = lmaVar;
                    deVar4.e0(4, fArr5);
                    float f10 = fArr5[0];
                    float f11 = fArr5[1];
                    float f12 = fArr5[2];
                    float f13 = fArr5[3];
                    int Z = deVar4.Z(TLObject.FLAG_12, 2);
                    if (Z == 0) {
                        deVar = deVar4;
                        lmaVar2 = lmaVar8;
                    } else {
                        int max = Math.max(2, Z);
                        lmaVar2 = lmaVar8;
                        int[] iArr3 = new int[max];
                        float[] fArr6 = Z == 1 ? new float[]{0.0f, 1.0f} : new float[Z];
                        m(deVar4, Z, iArr3, fArr6);
                        canvas2.save();
                        if (yVar2.t) {
                            canvas2.clipRect(rectF3);
                        }
                        yVar2.n(rectF2, path);
                        canvas2.clipPath(path);
                        paint4.setColor(-16777216);
                        if (i16 != 6) {
                            deVar = deVar4;
                            float[] fArr7 = fArr6;
                            paint2 = paint4;
                            if (i16 == 7) {
                                float max2 = Math.max(f12, 0.01f);
                                float max3 = Math.max(f13, 0.01f);
                                paint2.setShader(new RadialGradient(f10, f11, max2, iArr3, fArr7, Shader.TileMode.CLAMP));
                                canvas2.translate(f10, f11);
                                canvas2.scale(1.0f, max3 / max2);
                                canvas2.translate(-f10, -f11);
                            } else {
                                paint2.setShader(new SweepGradient(f10, f11, iArr3, fArr7));
                                canvas2.rotate(f12 - 90.0f, f10, f11);
                            }
                        } else if (max > 16) {
                            double d = f12 - f10;
                            double d2 = f13 - f11;
                            deVar = deVar4;
                            float hypot = (float) Math.hypot(d, d2);
                            if (hypot > 0.0f) {
                                canvas2.translate(f10, f11);
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(d2, d)));
                                int length = fArr6.length - 1;
                                int i23 = iArr3[0];
                                paint4.setShader(null);
                                paint4.setColor(i23);
                                canvas2.drawRect(-8000.0f, -8000.0f, fArr6[0] * hypot, 8000.0f, paint4);
                                int i24 = 0;
                                while (i24 < length) {
                                    float f14 = fArr6[i24] * hypot;
                                    int i25 = i24 + 1;
                                    float f15 = fArr6[i25] * hypot;
                                    if (f15 > f14) {
                                        int i26 = iArr3[i24];
                                        if (i26 == iArr3[i25]) {
                                            paint4.setShader(null);
                                            paint4.setColor(i26);
                                        } else {
                                            paint4.setColor(-16777216);
                                            paint4.setShader(new LinearGradient(f14, 0.0f, f15, 0.0f, iArr3[i24], iArr3[i25], Shader.TileMode.CLAMP));
                                        }
                                        canvas2.drawRect(f14, -8000.0f, f15, 8000.0f, paint4);
                                    }
                                    i24 = i25;
                                }
                                int i27 = iArr3[length];
                                paint4.setShader(null);
                                paint4.setColor(i27);
                                canvas2.drawRect(fArr6[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint4);
                                paint4.setShader(null);
                            }
                            canvas2.restore();
                        } else {
                            deVar = deVar4;
                            paint2 = paint4;
                            paint2.setShader(new LinearGradient(f10, f11, f12, f13, iArr3, fArr6, Shader.TileMode.CLAMP));
                        }
                        canvas2.drawRect(rectF2.left - 4000.0f, rectF2.top - 4000.0f, rectF2.right + 4000.0f, rectF2.bottom + 4000.0f, paint2);
                        paint2.setShader(null);
                        canvas2.restore();
                    }
                    yVar = this;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 9:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar2 = deVar3;
                    lmaVar3 = lmaVar;
                    boolean z6 = deVar2.j0() != 0;
                    canvas2.save();
                    lmaVar3.u(false);
                    if (z6) {
                        yVar2.l(deVar2, path);
                    } else {
                        yVar2.n(rectF2, path);
                    }
                    canvas2.clipPath(path);
                    deVar = deVar2;
                    lmaVar2 = lmaVar3;
                    yVar = yVar2;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 10:
                case 13:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar2 = deVar3;
                    lmaVar3 = lmaVar;
                    if (lmaVar3.a > 0) {
                        lmaVar3.t();
                    }
                    deVar = deVar2;
                    lmaVar2 = lmaVar3;
                    yVar = yVar2;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 11:
                    arrayList = arrayList2;
                    deVar2 = deVar3;
                    Matrix matrix4 = matrix3;
                    lmaVar3 = lmaVar;
                    if (deVar2.j0() != 0) {
                        Path path2 = yVar2.e;
                        yVar2.l(deVar2, path2);
                        int j09 = deVar2.j0();
                        int i28 = j09 & 1;
                        if (i28 != 0) {
                            int j010 = deVar2.j0();
                            if (j010 == 0) {
                                i3 = deVar2.j0();
                            } else {
                                shader = yVar2.g(deVar2, j010);
                                i3 = 0;
                                i4 = (j09 & 2) == 0 ? i2 : 0;
                                if (i4 == 0) {
                                    int j011 = deVar2.j0();
                                    int j012 = deVar2.j0();
                                    Shader g = j012 != 0 ? yVar2.g(deVar2, j012) : null;
                                    float d08 = deVar2.d0();
                                    int j013 = deVar2.j0();
                                    int j014 = deVar2.j0();
                                    f2 = deVar2.d0();
                                    i5 = i4;
                                    i6 = i28;
                                    int Z2 = deVar2.Z(1024, i2);
                                    if (Z2 > 0) {
                                        fArr2 = new float[Z2];
                                        deVar2.e0(Z2, fArr2);
                                    } else {
                                        fArr2 = null;
                                    }
                                    matrix = matrix4;
                                    f3 = d08;
                                    f4 = deVar2.d0();
                                    shader2 = g;
                                    i7 = j013;
                                    i9 = j011;
                                    fArr = fArr2;
                                    i8 = j014;
                                } else {
                                    i5 = i4;
                                    i6 = i28;
                                    f2 = 4.0f;
                                    matrix = matrix4;
                                    i7 = 0;
                                    i8 = 0;
                                    fArr = null;
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                    shader2 = null;
                                    i9 = 0;
                                }
                                f5 = f2;
                                Shader shader4 = shader2;
                                if (shader == null) {
                                    paint4.setColor(-16777216);
                                    paint4.setShader(shader);
                                    canvas2.drawPath(path2, paint4);
                                    paint4.setShader(null);
                                } else if (i6 != 0 && (i3 >>> 24) != 0) {
                                    paint4.setShader(null);
                                    paint4.setColor(i3);
                                    canvas2.drawPath(path2, paint4);
                                }
                                shader3 = f3 > 0.0f ? null : shader4;
                                if (i5 != 0 && (((i9 >>> 24) != 0 || shader3 != null) && f3 > 0.0f)) {
                                    paint3.setColor(shader3 == null ? -16777216 : i9);
                                    paint3.setShader(shader3);
                                    paint3.setStrokeWidth(f3);
                                    if (i7 != 1) {
                                        cap = Paint.Cap.ROUND;
                                        i10 = 2;
                                    } else {
                                        i10 = 2;
                                        cap = i7 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                                    }
                                    paint3.setStrokeCap(cap);
                                    paint3.setStrokeJoin(i8 != 1 ? Paint.Join.ROUND : i8 == i10 ? Paint.Join.BEVEL : Paint.Join.MITER);
                                    paint3.setStrokeMiter(f5);
                                    paint3.setPathEffect(null);
                                    if (fArr != null && fArr.length != 0) {
                                        int length2 = fArr.length;
                                        i11 = length2 % 2 != 1 ? length2 << 1 : length2;
                                        float[] fArr8 = new float[i11];
                                        f6 = 0.0f;
                                        for (i12 = 0; i12 < i11; i12++) {
                                            float max4 = Math.max(0.0f, fArr[i12 % length2]);
                                            fArr8[i12] = max4;
                                            f6 += max4;
                                        }
                                        if (f6 > 0.0f) {
                                            paint3.setPathEffect(new DashPathEffect(fArr8, f4));
                                        }
                                    }
                                    canvas2.drawPath(path2, paint3);
                                    paint3.setPathEffect(null);
                                    paint3.setShader(null);
                                }
                            }
                        } else {
                            i3 = 0;
                        }
                        shader = null;
                        if ((j09 & 2) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        f5 = f2;
                        Shader shader42 = shader2;
                        if (shader == null) {
                        }
                        if (f3 > 0.0f) {
                        }
                        if (i5 != 0) {
                            paint3.setColor(shader3 == null ? -16777216 : i9);
                            paint3.setShader(shader3);
                            paint3.setStrokeWidth(f3);
                            if (i7 != 1) {
                            }
                            paint3.setStrokeCap(cap);
                            paint3.setStrokeJoin(i8 != 1 ? Paint.Join.ROUND : i8 == i10 ? Paint.Join.BEVEL : Paint.Join.MITER);
                            paint3.setStrokeMiter(f5);
                            paint3.setPathEffect(null);
                            if (fArr != null) {
                                int length22 = fArr.length;
                                if (length22 % 2 != 1) {
                                }
                                float[] fArr82 = new float[i11];
                                f6 = 0.0f;
                                while (i12 < i11) {
                                }
                                if (f6 > 0.0f) {
                                }
                            }
                            canvas2.drawPath(path2, paint3);
                            paint3.setPathEffect(null);
                            paint3.setShader(null);
                        }
                    } else {
                        matrix = matrix4;
                    }
                    deVar = deVar2;
                    lmaVar2 = lmaVar3;
                    yVar = yVar2;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 12:
                    Matrix matrix5 = matrix3;
                    arrayList = arrayList2;
                    de deVar5 = deVar3;
                    lma lmaVar9 = lmaVar;
                    deVar5.e0(6, fArr5);
                    float d09 = deVar5.d0();
                    int i29 = deVar5.j0() != 0 ? i2 : 0;
                    fArr4[0] = fArr5[0];
                    fArr4[i2] = fArr5[2];
                    fArr4[2] = fArr5[4];
                    fArr4[3] = fArr5[i2];
                    fArr4[4] = fArr5[3];
                    fArr4[5] = fArr5[5];
                    fArr4[6] = 0.0f;
                    fArr4[7] = 0.0f;
                    fArr4[8] = 1.0f;
                    Matrix matrix6 = yVar2.l;
                    matrix6.setValues(fArr4);
                    if (d09 >= 1.0f || i29 != 0) {
                        i13 = i29;
                        lmaVar4 = lmaVar9;
                        matrix2 = matrix5;
                        canvas2.save();
                        z2 = false;
                    } else {
                        int round = Math.round(Math.max(0.0f, Math.min(1.0f, d09)) * 255.0f);
                        boolean isEmpty = rectF2.isEmpty();
                        if (isEmpty) {
                            rectF = null;
                        } else {
                            matrix6.mapRect(rectF5, rectF2);
                            rectF5.inset(-1.0f, -1.0f);
                            rectF = rectF5;
                        }
                        lmaVar4 = lmaVar9;
                        if (lmaVar4.c >= 32) {
                            i13 = i29;
                            z3 = isEmpty;
                            matrix2 = matrix5;
                        } else {
                            RectF rectF6 = yVar2.A;
                            if (rectF == null) {
                                h = h(rectF6.width(), rectF6.height(), f);
                                matrix2 = matrix5;
                            } else {
                                RectF rectF7 = yVar2.B;
                                matrix2 = matrix5;
                                matrix2.mapRect(rectF7, rectF);
                                h = rectF7.intersect(rectF6) ? h(rectF7.width(), rectF7.height(), f) : 0L;
                            }
                            long j = yVar2.E;
                            i13 = i29;
                            z3 = isEmpty;
                            long j2 = yVar2.D;
                            if (h <= j - j2) {
                                yVar2.D = j2 + h;
                                if (i2 != 0) {
                                    canvas2.save();
                                } else if (z3) {
                                    canvas2.saveLayerAlpha(null, round);
                                } else {
                                    canvas2.saveLayerAlpha(rectF5, round);
                                }
                                z2 = i2;
                            }
                        }
                        i2 = 0;
                        if (i2 != 0) {
                        }
                        z2 = i2;
                    }
                    lmaVar4.u(z2);
                    canvas2.concat(matrix6);
                    matrix2.preConcat(matrix6);
                    if (i13 != 0) {
                        canvas2.clipRect(0, 0, 0, 0);
                    }
                    deVar = deVar5;
                    lmaVar2 = lmaVar4;
                    matrix = matrix2;
                    yVar = yVar2;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 14:
                    lma lmaVar10 = lmaVar;
                    int j015 = deVar3.j0();
                    deVar3.e0(4, fArr5);
                    int i30 = deVar3.j0() != 0 ? i2 : 0;
                    float f16 = fArr5[0];
                    float f17 = fArr5[i2];
                    int i31 = i30;
                    arrayList = arrayList2;
                    float max5 = Math.max(fArr5[2], 0.0f);
                    float f18 = fArr5[3];
                    rectF4.set(rectF2);
                    if (rectF4.isEmpty() || (j015 >>> 24) == 0 || ((i14 = Build.VERSION.SDK_INT) < 28 && (max5 / 2.0f) * f > 0.5f)) {
                        lmaVar5 = lmaVar10;
                        matrix = matrix3;
                    } else {
                        Paint paint5 = yVar2.d;
                        paint5.setColor(j015);
                        float f19 = (max5 / 2.0f) * f;
                        if (f19 > 0.5f) {
                            float f20 = ((f19 - 0.5f) / 0.57735f) / f;
                            matrix = matrix3;
                            Float valueOf = Float.valueOf(f20);
                            HashMap hashMap = yVar2.m;
                            blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                            if (blurMaskFilter == null) {
                                lmaVar5 = lmaVar10;
                                if (hashMap.size() >= 32) {
                                    hashMap.clear();
                                }
                                BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f20, BlurMaskFilter.Blur.NORMAL);
                                hashMap.put(Float.valueOf(f20), blurMaskFilter2);
                                blurMaskFilter = blurMaskFilter2;
                            } else {
                                lmaVar5 = lmaVar10;
                            }
                        } else {
                            lmaVar5 = lmaVar10;
                            matrix = matrix3;
                            blurMaskFilter = null;
                        }
                        paint5.setMaskFilter(blurMaskFilter);
                        if (yVar2.s) {
                            f7 = fArr3[0];
                            int i32 = i2;
                            while (true) {
                                if (i32 < 8) {
                                    if (fArr3[i32] != f7) {
                                        f7 = -1.0f;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                        } else {
                            f7 = 0.0f;
                        }
                        if (i31 != 0 || f7 < 0.0f) {
                            Path path3 = yVar2.g;
                            path3.rewind();
                            float f21 = rectF4.left;
                            float f22 = rectF4.top;
                            if (i31 != 0) {
                                float abs = Math.abs(f17) + Math.abs(f16) + Math.abs(f18) + (1.5f * max5) + 2.0f;
                                deVar = deVar3;
                                rectF5.set(f21 - abs, f22 - abs, rectF4.right + abs, rectF4.bottom + abs);
                                path3.addRect(rectF5, Path.Direction.CW);
                                rectF5.set(rectF4.left + f18, rectF4.top + f18, rectF4.right - f18, rectF4.bottom - f18);
                                if (!rectF5.isEmpty()) {
                                    yVar2.a(path3, rectF5, -f18);
                                }
                                path3.setFillType(Path.FillType.EVEN_ODD);
                            } else {
                                deVar = deVar3;
                                rectF5.set(f21 - f18, f22 - f18, rectF4.right + f18, rectF4.bottom + f18);
                                if (!yVar2.s) {
                                    f18 = 0.0f;
                                }
                                yVar2.a(path3, rectF5, f18);
                            }
                            path3.offset(f16, f17);
                            canvas2.save();
                            yVar2.n(rectF2, path);
                            if (i31 != 0) {
                                canvas2.clipPath(path);
                            } else if (i14 >= 26) {
                                canvas2.clipOutPath(path);
                            } else {
                                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                            }
                            canvas2.drawPath(path3, paint5);
                            canvas2.restore();
                            paint5.setMaskFilter(null);
                            yVar = yVar2;
                            lmaVar2 = lmaVar5;
                            i15 = i19 + 1;
                            yVar2 = yVar;
                            lmaVar7 = lmaVar2;
                            deVar3 = deVar;
                            iArr = iArr2;
                            arrayList2 = arrayList;
                            matrix3 = matrix;
                        } else {
                            float f23 = f7;
                            rectF5.set((rectF4.left - f18) + f16, (rectF4.top - f18) + f17, rectF4.right + f18 + f16, rectF4.bottom + f18 + f17);
                            float max6 = yVar2.s ? Math.max(f23 + f18, 0.0f) : 0.0f;
                            canvas2.save();
                            if (f7 != 0.0f) {
                                yVar2.n(rectF2, path);
                                if (i14 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                            } else if (i14 >= 26) {
                                canvas2.clipOutRect(rectF4);
                            } else {
                                canvas2.clipRect(rectF4, Region.Op.DIFFERENCE);
                            }
                            if (max6 > 0.0f) {
                                canvas2.drawRoundRect(rectF5, max6, max6, paint5);
                            } else {
                                canvas2.drawRect(rectF5, paint5);
                            }
                            canvas2.restore();
                            paint5.setMaskFilter(null);
                        }
                    }
                    deVar = deVar3;
                    yVar = yVar2;
                    lmaVar2 = lmaVar5;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 15:
                    lmaVar6 = lmaVar;
                    sm2 k = k(deVar3);
                    dyc dycVar = new dyc();
                    dycVar.a = (Canvas) lmaVar6.d;
                    dycVar.b = lmaVar6.a;
                    arrayList2.add(dycVar);
                    if (((int[]) k.b).length != 0 && lmaVar6.b < 16 && yVar2.v < 64) {
                        rectF4.set(rectF2);
                        if (!rectF4.isEmpty() && yVar2.p(lmaVar6, rectF4, j(k, rectF4))) {
                            if (Build.VERSION.SDK_INT < 31 || !((Canvas) lmaVar6.d).isHardwareAccelerated()) {
                                matrix3.getValues(fArr4);
                                if (fArr4[i2] == 0.0f && fArr4[3] == 0.0f) {
                                    Matrix matrix7 = dycVar.g;
                                    matrix7.set(matrix3);
                                    matrix7.postScale(f, f);
                                    matrix7.mapRect(rectF5, rectF4);
                                    float abs2 = Math.abs(fArr4[0]) * f;
                                    double height = rectF5.height() * rectF5.width();
                                    if (height > 0.0d) {
                                        if (height > 4194304.0d) {
                                            float sqrt = (float) Math.sqrt(4194304.0d / height);
                                            matrix7.postScale(sqrt, sqrt);
                                            matrix7.mapRect(rectF5, rectF4);
                                            abs2 *= sqrt;
                                        }
                                        int floor = (int) Math.floor(rectF5.left);
                                        int floor2 = (int) Math.floor(rectF5.top);
                                        int ceil = ((int) Math.ceil(rectF5.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF5.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            long j3 = ceil2 * ceil;
                                            if (j3 <= 8388608 && yVar2.o(j3)) {
                                                dycVar.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                lmaVar6.b++;
                                                yVar2.v++;
                                                dycVar.d = floor;
                                                dycVar.e = floor2;
                                                dycVar.h = abs2;
                                                dycVar.i = k;
                                                Canvas canvas4 = new Canvas(dycVar.f);
                                                canvas4.translate(-floor, -floor2);
                                                canvas4.concat(matrix7);
                                                lmaVar6.d = canvas4;
                                                lmaVar6.a = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Canvas b = y00.b(yVar2, dycVar, rectF4, k, f);
                                if (b != null) {
                                    lmaVar6.d = b;
                                    lmaVar6.a = 0;
                                    lmaVar6.b++;
                                    yVar2.v++;
                                }
                            }
                        }
                    }
                    yVar = yVar2;
                    lmaVar2 = lmaVar6;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 16:
                    lmaVar6 = lmaVar;
                    if (!arrayList2.isEmpty()) {
                        yVar2.i(lmaVar6, f);
                    }
                    yVar = yVar2;
                    lmaVar2 = lmaVar6;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    deVar = deVar3;
                    i15 = i19 + 1;
                    yVar2 = yVar;
                    lmaVar7 = lmaVar2;
                    deVar3 = deVar;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 17:
                    sm2 k2 = k(deVar3);
                    if (!z || Build.VERSION.SDK_INT < 31 || !canvas2.isHardwareAccelerated() || yVar2.w >= 8) {
                        yVar = yVar2;
                        matrix = matrix3;
                        arrayList = arrayList2;
                        deVar = deVar3;
                        lmaVar2 = lmaVar;
                        i15 = i19 + 1;
                        yVar2 = yVar;
                        lmaVar7 = lmaVar2;
                        deVar3 = deVar;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    } else {
                        lma lmaVar11 = lmaVar;
                        y00.a(yVar2, lmaVar11, kxcVar, i19, k2, new RectF(rectF2), yVar2.s ? (float[]) fArr3.clone() : null, eycVar, f);
                        i19 = i19;
                        lmaVar2 = lmaVar11;
                        matrix = matrix3;
                        arrayList = arrayList2;
                        deVar = deVar3;
                        yVar = yVar2;
                        i15 = i19 + 1;
                        yVar2 = yVar;
                        lmaVar7 = lmaVar2;
                        deVar3 = deVar;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    }
                    break;
                default:
                    throw kxc.a();
            }
        }
        lma lmaVar12 = lmaVar7;
        ArrayList arrayList3 = arrayList2;
        y yVar3 = yVar2;
        while (!arrayList3.isEmpty()) {
            yVar3.i(lmaVar12, f);
        }
        while (lmaVar12.a > 0) {
            lmaVar12.t();
        }
    }

    public final void f(Canvas canvas, kxc kxcVar, eyc eycVar, float f, float f2, float f3, float f4, float f5) {
        RectF rectF = this.A;
        rectF.set(f2, f3, f4, f5);
        this.D = 0L;
        this.E = h(rectF.width(), rectF.height(), f) << 6;
        boolean z = Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && kxcVar.c;
        int saveLayer = z ? canvas.saveLayer(null, null) : -1;
        e(canvas, kxcVar, kxcVar.b, eycVar, f, true);
        if (z) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Shader g(de deVar, int i) {
        float[] fArr = this.k;
        deVar.e0(7, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        int Z = deVar.Z(TLObject.FLAG_12, 2);
        int[] iArr = new int[Math.max(2, Z)];
        float[] fArr2 = Z == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(Z, 2)];
        m(deVar, Z, iArr, fArr2);
        if (Z < 2) {
            return null;
        }
        return i == 1 ? new LinearGradient(f, f2, f3, f4, iArr, fArr2, Shader.TileMode.CLAMP) : new RadialGradient(f, f2, Math.max(f5, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void i(lma lmaVar, float f) {
        Object obj;
        dyc dycVar = (dyc) td4.m(1, (ArrayList) lmaVar.h);
        if (dycVar.c != null || dycVar.f != null) {
            lmaVar.b--;
        }
        while (true) {
            int i = lmaVar.a;
            obj = dycVar.c;
            if (i <= ((obj == null && dycVar.f == null) ? dycVar.b : 0)) {
                break;
            } else {
                lmaVar.t();
            }
        }
        if (obj != null) {
            y00.j(dycVar, f);
            lmaVar.d = dycVar.a;
        } else {
            Bitmap bitmap = dycVar.f;
            if (bitmap != null) {
                sm2 sm2Var = dycVar.i;
                WidgetClientNative.filterPixels(bitmap, (int[]) sm2Var.b, (float[]) sm2Var.f, (float[]) sm2Var.d, (float[]) sm2Var.e, (int[]) sm2Var.c, dycVar.h);
                lmaVar.d = dycVar.a;
                Matrix matrix = new Matrix();
                if (dycVar.g.invert(matrix)) {
                    ((Canvas) lmaVar.d).save();
                    ((Canvas) lmaVar.d).concat(matrix);
                    ((Canvas) lmaVar.d).drawBitmap(dycVar.f, dycVar.d, dycVar.e, this.c);
                    ((Canvas) lmaVar.d).restore();
                }
            }
        }
        lmaVar.a = dycVar.b;
    }

    public final void l(de deVar, Path path) {
        int i;
        int i2;
        path.rewind();
        int Z = deVar.Z(TLObject.FLAG_20, 0);
        int Z2 = deVar.Z(6291456, 1);
        int i3 = deVar.b;
        long j = (Z + 3) / 4;
        long j2 = j << 2;
        kxc kxcVar = (kxc) deVar.c;
        if (j2 > kxcVar.d - i3) {
            throw kxc.a();
        }
        deVar.b = (((int) j) << 2) + i3;
        float[] fArr = this.u;
        if (fArr.length < Z2) {
            fArr = new float[Math.max(Z2, fArr.length << 1)];
            this.u = fArr;
        }
        deVar.e0(Z2, fArr);
        int i4 = 0;
        int i5 = 0;
        while (i4 < Z) {
            int i6 = kxcVar.a.get(i3 + i4) & 255;
            int i7 = (i6 == 3 ? 6 : i6 == 2 ? 4 : i6 == 4 ? 0 : 2) + i5;
            if (i7 > Z2) {
                break;
            }
            if (i6 == 0) {
                i = i4;
                int i8 = i5;
                i2 = i7;
                float[] fArr2 = this.u;
                path.moveTo(fArr2[i8], fArr2[i8 + 1]);
            } else if (i6 == 1) {
                i = i4;
                int i9 = i5;
                i2 = i7;
                float[] fArr3 = this.u;
                path.lineTo(fArr3[i9], fArr3[i9 + 1]);
            } else if (i6 == 2) {
                i = i4;
                int i10 = i5;
                i2 = i7;
                float[] fArr4 = this.u;
                path.quadTo(fArr4[i10], fArr4[i10 + 1], fArr4[i10 + 2], fArr4[i10 + 3]);
            } else if (i6 != 3) {
                if (i6 == 4) {
                    path.close();
                }
                i = i4;
                i2 = i7;
            } else {
                float[] fArr5 = this.u;
                int i11 = i5;
                i2 = i7;
                i = i4;
                path.cubicTo(fArr5[i11], fArr5[i11 + 1], fArr5[i11 + 2], fArr5[i11 + 3], fArr5[i11 + 4], fArr5[i11 + 5]);
            }
            i4 = i + 1;
            i5 = i2;
        }
        path.setFillType(deVar.j0() != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void n(RectF rectF, Path path) {
        float[] fArr = this.s ? this.r : null;
        path.rewind();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final boolean o(long j) {
        if (j <= 0) {
            return false;
        }
        long j2 = j << 2;
        long j3 = this.z;
        long j4 = this.y;
        if (j2 > j3 - j4) {
            return false;
        }
        this.y = j4 + j2;
        return true;
    }

    public final boolean p(lma lmaVar, RectF rectF, float f) {
        Matrix matrix = (Matrix) lmaVar.f;
        Matrix matrix2 = this.C;
        if (!matrix.invert(matrix2)) {
            return false;
        }
        RectF rectF2 = this.A;
        RectF rectF3 = this.B;
        matrix2.mapRect(rectF3, rectF2);
        float f2 = (-f) - 1.0f;
        rectF3.inset(f2, f2);
        return rectF.intersect(rectF3);
    }
}
