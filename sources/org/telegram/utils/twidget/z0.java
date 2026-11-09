package org.telegram.utils.twidget;

import a8.r7;
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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class z0 {
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

    public z0() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        new RectF();
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
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void c(JSONArray jSONArray, float[] fArr, int i7, float... fArr2) {
        int i10 = 0;
        while (i10 < i7) {
            float f10 = i10 < fArr2.length ? fArr2[i10] : 0.0f;
            if (jSONArray != null && i10 < jSONArray.length()) {
                f10 = (float) jSONArray.optDouble(i10, f10);
            }
            fArr[i10] = f10;
            i10++;
        }
    }

    public static r7 h(f5.u uVar) {
        int e10 = uVar.e(64, 5);
        r7 r7Var = new r7(e10);
        for (int i7 = 0; i7 < e10; i7++) {
            ((int[]) r7Var.b)[i7] = uVar.p();
            ((float[]) r7Var.d)[i7] = uVar.j();
            ((float[]) r7Var.e)[i7] = uVar.j();
            ((float[]) r7Var.f)[i7] = uVar.j();
            ((int[]) r7Var.c)[i7] = uVar.p();
        }
        return r7Var;
    }

    public static void j(f5.u uVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, uVar.j()));
            iArr[i10] = uVar.p();
            if (i7 > 1) {
                fArr[i10] = max;
            }
        }
        if (i7 == 1) {
            iArr[1] = iArr[0];
        }
    }

    public static void l(int i7, Paint paint) {
        paint.setShader(null);
        paint.setColor(i7);
    }

    public final void a(Path path, RectF rectF, float f10) {
        if (!this.s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.j;
            if (i7 >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i7] = Math.max(this.r[i7] + f10, 0.0f);
                i7++;
            }
        }
    }

    public final void b(Canvas canvas, Paint paint) {
        float f10;
        if (this.s) {
            float[] fArr = this.r;
            f10 = fArr[0];
            int i7 = 1;
            while (true) {
                if (i7 >= 8) {
                    break;
                }
                if (fArr[i7] != f10) {
                    f10 = -1.0f;
                    break;
                }
                i7++;
            }
        } else {
            f10 = 0.0f;
        }
        RectF rectF = this.p;
        if (f10 == 0.0f) {
            canvas.drawRect(rectF, paint);
        } else {
            if (f10 > 0.0f) {
                canvas.drawRoundRect(rectF, f10, f10, paint);
                return;
            }
            Path path = this.e;
            k(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e5 A[LOOP:3: B:225:0x05e3->B:226:0x05e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, i iVar, int i7, y0 y0Var, float f10, boolean z9) {
        a4.k kVar;
        int i10;
        ArrayList arrayList;
        Matrix matrix;
        ArrayList arrayList2;
        f5.u uVar;
        a4.k kVar2;
        i iVar2;
        Paint paint;
        a4.k kVar3;
        Matrix matrix2;
        f5.u uVar2;
        Shader shader;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        float[] fArr;
        float f13;
        int i17;
        Shader shader2;
        float f14;
        Shader shader3;
        int i18;
        Paint.Cap cap;
        int i19;
        int i20;
        float f15;
        float[] fArr2;
        z0 z0Var;
        a4.k kVar4;
        Matrix matrix3;
        f5.u uVar3;
        float f16;
        BlurMaskFilter blurMaskFilter;
        float f17;
        ArrayList arrayList3;
        z0 z0Var2 = this;
        a4.k kVar5 = new a4.k(canvas);
        ArrayList arrayList4 = (ArrayList) kVar5.e;
        Matrix matrix4 = (Matrix) kVar5.d;
        ArrayList arrayList5 = (ArrayList) kVar5.f;
        f5.u uVar4 = new f5.u(iVar);
        int i21 = 0;
        while (i21 < i7) {
            Canvas canvas2 = (Canvas) kVar5.c;
            int p10 = uVar4.p();
            int i22 = p10 & qs.e4;
            int i23 = p10 >>> 8;
            int i24 = i23 & 1;
            RectF rectF = z0Var2.p;
            if (i24 != 0) {
                float j3 = uVar4.j();
                float j10 = uVar4.j();
                kVar = kVar5;
                rectF.set(j3, j10, j3 + uVar4.j(), j10 + uVar4.j());
            } else {
                kVar = kVar5;
                rectF.setEmpty();
            }
            boolean z10 = (i23 & 2) != 0;
            z0Var2.s = z10;
            float[] fArr3 = z0Var2.r;
            if (z10) {
                uVar4.k(8, fArr3);
            }
            boolean z11 = (i23 & 4) != 0;
            z0Var2.t = z11;
            RectF rectF2 = z0Var2.q;
            if (z11) {
                float j11 = uVar4.j();
                float j12 = uVar4.j();
                i10 = 1;
                rectF2.set(j11, j12, j11 + uVar4.j(), j12 + uVar4.j());
            } else {
                i10 = 1;
            }
            RectF rectF3 = z0Var2.i;
            float[] fArr4 = z0Var2.o;
            float[] fArr5 = z0Var2.k;
            Paint paint2 = z0Var2.b;
            int i25 = i21;
            Path path = z0Var2.f;
            Paint paint3 = z0Var2.a;
            RectF rectF4 = z0Var2.h;
            switch (i22) {
                case 0:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    iVar2 = iVar;
                    int p11 = uVar.p();
                    if (z0Var2.t) {
                        canvas2.save();
                        canvas2.clipRect(rectF2);
                    }
                    l(p11, paint3);
                    z0Var2.b(canvas2, paint3);
                    if (z0Var2.t) {
                        canvas2.restore();
                    }
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 1:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    iVar2 = iVar;
                    paint2.setColor(uVar.p());
                    paint2.setStrokeWidth(uVar.j());
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    z0Var2.b(canvas2, paint2);
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 2:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    iVar2 = iVar;
                    l(uVar.p(), paint3);
                    canvas2.drawOval(rectF, paint3);
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 3:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    iVar2 = iVar;
                    int p12 = uVar.p();
                    float j13 = uVar.j();
                    rectF4.set(rectF);
                    float f18 = j13 / 2.0f;
                    rectF4.inset(f18, f18);
                    paint2.setColor(p12);
                    paint2.setStrokeWidth(j13);
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    canvas2.drawOval(rectF4, paint2);
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 4:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    int p13 = uVar.p();
                    int p14 = uVar.p();
                    float j14 = uVar.j();
                    float j15 = uVar.j();
                    int p15 = uVar.p();
                    iVar2 = iVar;
                    String[] strArr = iVar2.g;
                    if (p15 < 0 || p15 >= strArr.length) {
                        throw i.a();
                    }
                    String str = strArr[p15];
                    if (str == null) {
                        str = new String(iVar2.a.array(), iVar2.e[p15], iVar2.f[p15], StandardCharsets.UTF_8);
                        strArr[p15] = str;
                    }
                    Paint deviceFont = y0Var.deviceFont(p14);
                    if (deviceFont == null) {
                        paint = null;
                    } else {
                        IdentityHashMap identityHashMap = z0Var2.n;
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
                        paint.setColor(p13);
                        paint.setShader(null);
                        canvas2.save();
                        float f19 = 1.0f / f10;
                        canvas2.scale(f19, f19);
                        canvas2.drawText(str, j14 * f10, j15 * f10, paint);
                        canvas2.restore();
                    }
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                    break;
                case 5:
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    kVar2 = kVar;
                    if (uVar.p() == 0) {
                        i10 = 0;
                    }
                    int p16 = uVar.p();
                    Bitmap canvas3 = i10 != 0 ? y0Var.canvas(p16) : y0Var.image(p16);
                    if (canvas3 != null) {
                        canvas2.save();
                        if (z0Var2.t) {
                            canvas2.clipRect(rectF2);
                        }
                        if (z0Var2.s) {
                            if (!z0Var2.t) {
                                rectF2 = rectF;
                            }
                            z0Var2.k(rectF2, path);
                            canvas2.clipPath(path);
                        }
                        canvas2.drawBitmap(canvas3, (Rect) null, rectF, z0Var2.c);
                        canvas2.restore();
                    }
                    iVar2 = iVar;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 6:
                case 7:
                case 8:
                    Matrix matrix5 = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    a4.k kVar6 = kVar;
                    uVar.k(4, fArr5);
                    float f20 = fArr5[0];
                    float f21 = fArr5[i10];
                    float f22 = fArr5[2];
                    float f23 = fArr5[3];
                    int e10 = uVar.e(TLObject.FLAG_12, 2);
                    if (e10 == 0) {
                        matrix = matrix5;
                        arrayList = arrayList4;
                        kVar2 = kVar6;
                    } else {
                        matrix = matrix5;
                        int max = Math.max(2, e10);
                        arrayList = arrayList4;
                        int[] iArr = new int[max];
                        kVar2 = kVar6;
                        float[] fArr6 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[e10];
                        j(uVar, e10, iArr, fArr6);
                        canvas2.save();
                        if (z0Var2.t) {
                            canvas2.clipRect(rectF2);
                        }
                        z0Var2.k(rectF, path);
                        canvas2.clipPath(path);
                        paint3.setColor(-16777216);
                        if (i22 != 6 || max <= 16) {
                            if (i22 == 6) {
                                paint3.setShader(new LinearGradient(f20, f21, f22, f23, iArr, fArr6, Shader.TileMode.CLAMP));
                            } else {
                                float[] fArr7 = fArr6;
                                if (i22 == 7) {
                                    float max2 = Math.max(f22, 0.01f);
                                    float max3 = Math.max(f23, 0.01f);
                                    paint3.setShader(new RadialGradient(f20, f21, max2, iArr, fArr7, Shader.TileMode.CLAMP));
                                    canvas2.translate(f20, f21);
                                    canvas2.scale(1.0f, max3 / max2);
                                    canvas2.translate(-f20, -f21);
                                } else {
                                    paint3.setShader(new SweepGradient(f20, f21, iArr, fArr7));
                                    canvas2.rotate(f22 - 90.0f, f20, f21);
                                }
                            }
                            canvas2.drawRect(rectF.left - 4000.0f, rectF.top - 4000.0f, rectF.right + 4000.0f, rectF.bottom + 4000.0f, paint3);
                            paint3.setShader(null);
                            canvas2.restore();
                        } else {
                            double d = f22 - f20;
                            double d2 = f23 - f21;
                            float hypot = (float) Math.hypot(d, d2);
                            if (hypot > 0.0f) {
                                canvas2.translate(f20, f21);
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(d2, d)));
                                int length = fArr6.length - 1;
                                int i26 = iArr[0];
                                paint3.setShader(null);
                                paint3.setColor(i26);
                                canvas2.drawRect(-8000.0f, -8000.0f, fArr6[0] * hypot, 8000.0f, paint3);
                                int i27 = 0;
                                while (i27 < length) {
                                    float f24 = fArr6[i27] * hypot;
                                    int i28 = i27 + 1;
                                    float f25 = fArr6[i28] * hypot;
                                    if (f25 > f24) {
                                        int i29 = iArr[i27];
                                        if (i29 == iArr[i28]) {
                                            paint3.setShader(null);
                                            paint3.setColor(i29);
                                        } else {
                                            paint3.setColor(-16777216);
                                            paint3.setShader(new LinearGradient(f24, 0.0f, f25, 0.0f, iArr[i27], iArr[i28], Shader.TileMode.CLAMP));
                                        }
                                        canvas2.drawRect(f24, -8000.0f, f25, 8000.0f, paint3);
                                    }
                                    i27 = i28;
                                }
                                int i30 = iArr[length];
                                paint3.setShader(null);
                                paint3.setColor(i30);
                                canvas2.drawRect(fArr6[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint3);
                                paint3.setShader(null);
                            }
                            canvas2.restore();
                        }
                    }
                    iVar2 = iVar;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                    break;
                case 9:
                    Matrix matrix6 = matrix4;
                    arrayList2 = arrayList5;
                    f5.u uVar5 = uVar4;
                    kVar3 = kVar;
                    boolean z12 = uVar5.p() != 0;
                    canvas2.save();
                    arrayList4.add(new Matrix(matrix6));
                    kVar3.b++;
                    if (z12) {
                        z0Var2 = this;
                        uVar = uVar5;
                        z0Var2.i(uVar, path);
                    } else {
                        z0Var2 = this;
                        uVar = uVar5;
                        z0Var2.k(rectF, path);
                    }
                    canvas2.clipPath(path);
                    matrix = matrix6;
                    arrayList = arrayList4;
                    kVar2 = kVar3;
                    iVar2 = iVar;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 10:
                case 13:
                    matrix2 = matrix4;
                    arrayList2 = arrayList5;
                    uVar2 = uVar4;
                    kVar3 = kVar;
                    if (kVar3.b > 0) {
                        kVar3.q();
                    }
                    z0Var2 = this;
                    matrix = matrix2;
                    arrayList = arrayList4;
                    uVar = uVar2;
                    iVar2 = iVar;
                    kVar2 = kVar3;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 11:
                    matrix2 = matrix4;
                    arrayList2 = arrayList5;
                    f5.u uVar6 = uVar4;
                    kVar3 = kVar;
                    if (uVar6.p() != 0) {
                        Path path2 = z0Var2.e;
                        z0Var2.i(uVar6, path2);
                        int p17 = uVar6.p();
                        int i31 = p17 & 1;
                        if (i31 != 0) {
                            int p18 = uVar6.p();
                            if (p18 == 0) {
                                i11 = uVar6.p();
                                shader = null;
                                i12 = (p17 & 2) == 0 ? i10 : 0;
                                if (i12 == 0) {
                                    int p19 = uVar6.p();
                                    int p20 = uVar6.p();
                                    Shader f26 = p20 != 0 ? z0Var2.f(uVar6, p20) : null;
                                    float j16 = uVar6.j();
                                    int p21 = uVar6.p();
                                    int p22 = uVar6.p();
                                    f11 = uVar6.j();
                                    i13 = i12;
                                    int e11 = uVar6.e(1024, i10);
                                    if (e11 > 0) {
                                        fArr2 = new float[e11];
                                        uVar6.k(e11, fArr2);
                                    } else {
                                        fArr2 = null;
                                    }
                                    f12 = uVar6.j();
                                    i16 = p22;
                                    shader2 = f26;
                                    f13 = j16;
                                    i14 = i31;
                                    fArr = fArr2;
                                    i15 = p21;
                                    i17 = p19;
                                } else {
                                    i13 = i12;
                                    f11 = 4.0f;
                                    i14 = i31;
                                    f12 = 0.0f;
                                    i15 = 0;
                                    i16 = 0;
                                    fArr = null;
                                    f13 = 0.0f;
                                    i17 = 0;
                                    shader2 = null;
                                }
                                f14 = f11;
                                if (shader == null) {
                                    uVar2 = uVar6;
                                    paint3.setColor(-16777216);
                                    paint3.setShader(shader);
                                    canvas2.drawPath(path2, paint3);
                                    paint3.setShader(null);
                                } else {
                                    uVar2 = uVar6;
                                    if (i14 != 0 && (i11 >>> 24) != 0) {
                                        l(i11, paint3);
                                        canvas2.drawPath(path2, paint3);
                                    }
                                }
                                shader3 = f13 > 0.0f ? null : shader2;
                                if (i13 != 0 && (((i17 >>> 24) != 0 || shader3 != null) && f13 > 0.0f)) {
                                    paint2.setColor(shader3 == null ? -16777216 : i17);
                                    paint2.setShader(shader3);
                                    paint2.setStrokeWidth(f13);
                                    if (i15 != 1) {
                                        cap = Paint.Cap.ROUND;
                                        i18 = 2;
                                    } else {
                                        i18 = 2;
                                        cap = i15 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                                    }
                                    paint2.setStrokeCap(cap);
                                    paint2.setStrokeJoin(i16 != 1 ? Paint.Join.ROUND : i16 == i18 ? Paint.Join.BEVEL : Paint.Join.MITER);
                                    paint2.setStrokeMiter(f14);
                                    paint2.setPathEffect(null);
                                    if (fArr != null && fArr.length != 0) {
                                        int length2 = fArr.length;
                                        i19 = length2 % 2 != 1 ? length2 * 2 : length2;
                                        float[] fArr8 = new float[i19];
                                        f15 = 0.0f;
                                        for (i20 = 0; i20 < i19; i20++) {
                                            float max4 = Math.max(0.0f, fArr[i20 % length2]);
                                            fArr8[i20] = max4;
                                            f15 += max4;
                                        }
                                        if (f15 > 0.0f) {
                                            paint2.setPathEffect(new DashPathEffect(fArr8, f12));
                                        }
                                    }
                                    canvas2.drawPath(path2, paint2);
                                    paint2.setPathEffect(null);
                                    paint2.setShader(null);
                                }
                                z0Var2 = this;
                                matrix = matrix2;
                                arrayList = arrayList4;
                                uVar = uVar2;
                                iVar2 = iVar;
                                kVar2 = kVar3;
                                i21 = i25 + 1;
                                uVar4 = uVar;
                                matrix4 = matrix;
                                arrayList4 = arrayList;
                                kVar5 = kVar2;
                                arrayList5 = arrayList2;
                            } else {
                                shader = z0Var2.f(uVar6, p18);
                            }
                        } else {
                            shader = null;
                        }
                        i11 = 0;
                        if ((p17 & 2) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        f14 = f11;
                        if (shader == null) {
                        }
                        if (f13 > 0.0f) {
                        }
                        if (i13 != 0) {
                            paint2.setColor(shader3 == null ? -16777216 : i17);
                            paint2.setShader(shader3);
                            paint2.setStrokeWidth(f13);
                            if (i15 != 1) {
                            }
                            paint2.setStrokeCap(cap);
                            paint2.setStrokeJoin(i16 != 1 ? Paint.Join.ROUND : i16 == i18 ? Paint.Join.BEVEL : Paint.Join.MITER);
                            paint2.setStrokeMiter(f14);
                            paint2.setPathEffect(null);
                            if (fArr != null) {
                                int length22 = fArr.length;
                                if (length22 % 2 != 1) {
                                }
                                float[] fArr82 = new float[i19];
                                f15 = 0.0f;
                                while (i20 < i19) {
                                }
                                if (f15 > 0.0f) {
                                }
                            }
                            canvas2.drawPath(path2, paint2);
                            paint2.setPathEffect(null);
                            paint2.setShader(null);
                        }
                        z0Var2 = this;
                        matrix = matrix2;
                        arrayList = arrayList4;
                        uVar = uVar2;
                        iVar2 = iVar;
                        kVar2 = kVar3;
                        i21 = i25 + 1;
                        uVar4 = uVar;
                        matrix4 = matrix;
                        arrayList4 = arrayList;
                        kVar5 = kVar2;
                        arrayList5 = arrayList2;
                    } else {
                        z0Var2 = this;
                        matrix = matrix2;
                        uVar = uVar6;
                        arrayList = arrayList4;
                        kVar2 = kVar3;
                        iVar2 = iVar;
                        i21 = i25 + 1;
                        uVar4 = uVar;
                        matrix4 = matrix;
                        arrayList4 = arrayList;
                        kVar5 = kVar2;
                        arrayList5 = arrayList2;
                    }
                    break;
                case 12:
                    ArrayList arrayList6 = arrayList4;
                    Matrix matrix7 = matrix4;
                    arrayList2 = arrayList5;
                    f5.u uVar7 = uVar4;
                    a4.k kVar7 = kVar;
                    uVar7.k(6, fArr5);
                    float j17 = uVar7.j();
                    int i32 = uVar7.p() != 0 ? i10 : 0;
                    fArr4[0] = fArr5[0];
                    fArr4[i10] = fArr5[2];
                    fArr4[2] = fArr5[4];
                    fArr4[3] = fArr5[i10];
                    fArr4[4] = fArr5[3];
                    fArr4[5] = fArr5[5];
                    fArr4[6] = 0.0f;
                    fArr4[7] = 0.0f;
                    fArr4[8] = 1.0f;
                    Matrix matrix8 = z0Var2.l;
                    matrix8.setValues(fArr4);
                    if (j17 >= 1.0f || i32 != 0) {
                        canvas2.save();
                    } else {
                        int round = Math.round(Math.max(0.0f, Math.min(1.0f, j17)) * 255.0f);
                        if (rectF.isEmpty()) {
                            canvas2.saveLayerAlpha(null, round);
                        } else {
                            matrix8.mapRect(rectF4, rectF);
                            rectF4.inset(-1.0f, -1.0f);
                            canvas2.saveLayerAlpha(rectF4, round);
                        }
                    }
                    arrayList6.add(new Matrix(matrix7));
                    kVar7.b++;
                    canvas2.concat(matrix8);
                    matrix7.preConcat(matrix8);
                    if (i32 != 0) {
                        canvas2.clipRect(0, 0, 0, 0);
                    }
                    kVar2 = kVar7;
                    matrix = matrix7;
                    uVar = uVar7;
                    arrayList = arrayList6;
                    iVar2 = iVar;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 14:
                    ArrayList arrayList7 = arrayList4;
                    arrayList2 = arrayList5;
                    a4.k kVar8 = kVar;
                    int p23 = uVar4.p();
                    uVar4.k(4, fArr5);
                    int i33 = uVar4.p() != 0 ? i10 : 0;
                    float f27 = fArr5[0];
                    float f28 = fArr5[i10];
                    float max5 = Math.max(fArr5[2], 0.0f);
                    float f29 = fArr5[3];
                    rectF3.set(rectF);
                    if (!rectF3.isEmpty() && (p23 >>> 24) != 0) {
                        int i34 = Build.VERSION.SDK_INT;
                        int i35 = i33;
                        if (i34 >= 28 || (max5 / 2.0f) * f10 <= 0.5f) {
                            z0Var = this;
                            Paint paint4 = z0Var.d;
                            paint4.setColor(p23);
                            float f30 = (max5 / 2.0f) * f10;
                            if (f30 > 0.5f) {
                                float f31 = ((f30 - 0.5f) / 0.57735f) / f10;
                                f16 = max5;
                                Float valueOf = Float.valueOf(f31);
                                kVar4 = kVar8;
                                HashMap hashMap = z0Var.m;
                                BlurMaskFilter blurMaskFilter2 = (BlurMaskFilter) hashMap.get(valueOf);
                                if (blurMaskFilter2 == null) {
                                    matrix3 = matrix4;
                                    if (hashMap.size() >= 32) {
                                        hashMap.clear();
                                    }
                                    blurMaskFilter = new BlurMaskFilter(f31, BlurMaskFilter.Blur.NORMAL);
                                    hashMap.put(Float.valueOf(f31), blurMaskFilter);
                                } else {
                                    matrix3 = matrix4;
                                    blurMaskFilter = blurMaskFilter2;
                                }
                            } else {
                                kVar4 = kVar8;
                                matrix3 = matrix4;
                                f16 = max5;
                                blurMaskFilter = null;
                            }
                            paint4.setMaskFilter(blurMaskFilter);
                            if (z0Var.s) {
                                float f32 = fArr3[0];
                                int i36 = i10;
                                while (true) {
                                    if (i36 >= 8) {
                                        f17 = f32;
                                    } else if (fArr3[i36] != f32) {
                                        f17 = -1.0f;
                                    } else {
                                        i36++;
                                    }
                                }
                            } else {
                                f17 = 0.0f;
                            }
                            if (i35 != 0 || f17 < 0.0f) {
                                Path path3 = z0Var.g;
                                path3.rewind();
                                if (i35 != 0) {
                                    float abs = Math.abs(f28) + Math.abs(f27) + Math.abs(f29) + (f16 * 1.5f) + 2.0f;
                                    uVar3 = uVar4;
                                    rectF4.set(rectF3.left - abs, rectF3.top - abs, rectF3.right + abs, rectF3.bottom + abs);
                                    path3.addRect(rectF4, Path.Direction.CW);
                                    rectF4.set(rectF3.left + f29, rectF3.top + f29, rectF3.right - f29, rectF3.bottom - f29);
                                    if (!rectF4.isEmpty()) {
                                        z0Var.a(path3, rectF4, -f29);
                                    }
                                    path3.setFillType(Path.FillType.EVEN_ODD);
                                } else {
                                    uVar3 = uVar4;
                                    rectF4.set(rectF3.left - f29, rectF3.top - f29, rectF3.right + f29, rectF3.bottom + f29);
                                    if (!z0Var.s) {
                                        f29 = 0.0f;
                                    }
                                    z0Var.a(path3, rectF4, f29);
                                }
                                path3.offset(f27, f28);
                                canvas2.save();
                                z0Var.k(rectF, path);
                                if (i35 != 0) {
                                    canvas2.clipPath(path);
                                } else if (i34 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                                canvas2.drawPath(path3, paint4);
                                canvas2.restore();
                                paint4.setMaskFilter(null);
                                iVar2 = iVar;
                                z0Var2 = z0Var;
                                uVar = uVar3;
                                arrayList = arrayList7;
                                kVar2 = kVar4;
                                matrix = matrix3;
                                i21 = i25 + 1;
                                uVar4 = uVar;
                                matrix4 = matrix;
                                arrayList4 = arrayList;
                                kVar5 = kVar2;
                                arrayList5 = arrayList2;
                            } else {
                                rectF4.set((rectF3.left - f29) + f27, (rectF3.top - f29) + f28, rectF3.right + f29 + f27, rectF3.bottom + f29 + f28);
                                float max6 = z0Var.s ? Math.max(f17 + f29, 0.0f) : 0.0f;
                                canvas2.save();
                                if (f17 != 0.0f) {
                                    z0Var.k(rectF, path);
                                    if (i34 >= 26) {
                                        canvas2.clipOutPath(path);
                                    } else {
                                        canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                    }
                                } else if (i34 >= 26) {
                                    canvas2.clipOutRect(rectF3);
                                } else {
                                    canvas2.clipRect(rectF3, Region.Op.DIFFERENCE);
                                }
                                if (max6 > 0.0f) {
                                    canvas2.drawRoundRect(rectF4, max6, max6, paint4);
                                } else {
                                    canvas2.drawRect(rectF4, paint4);
                                }
                                canvas2.restore();
                                paint4.setMaskFilter(null);
                                uVar3 = uVar4;
                                iVar2 = iVar;
                                z0Var2 = z0Var;
                                uVar = uVar3;
                                arrayList = arrayList7;
                                kVar2 = kVar4;
                                matrix = matrix3;
                                i21 = i25 + 1;
                                uVar4 = uVar;
                                matrix4 = matrix;
                                arrayList4 = arrayList;
                                kVar5 = kVar2;
                                arrayList5 = arrayList2;
                            }
                        }
                    }
                    z0Var = this;
                    kVar4 = kVar8;
                    matrix3 = matrix4;
                    uVar3 = uVar4;
                    iVar2 = iVar;
                    z0Var2 = z0Var;
                    uVar = uVar3;
                    arrayList = arrayList7;
                    kVar2 = kVar4;
                    matrix = matrix3;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                    break;
                case 15:
                    a4.k kVar9 = kVar;
                    r7 h = h(uVar4);
                    x0 x0Var = new x0();
                    x0Var.a = (Canvas) kVar9.c;
                    x0Var.b = kVar9.b;
                    arrayList5.add(x0Var);
                    int[] iArr2 = (int[]) h.b;
                    if (iArr2.length != 0) {
                        rectF3.set(rectF);
                        if (!rectF3.isEmpty()) {
                            arrayList3 = arrayList4;
                            arrayList2 = arrayList5;
                            float f33 = 0.0f;
                            int i37 = 0;
                            float f34 = 0.0f;
                            float f35 = 0.0f;
                            float f36 = 0.0f;
                            while (i37 < iArr2.length) {
                                int i38 = i37;
                                float max7 = Math.max(0.0f, ((float[]) h.d)[i37]);
                                int i39 = iArr2[i38];
                                if (i39 == 0) {
                                    float f37 = max7 * 3.0f;
                                    f36 += f37;
                                    f35 += f37;
                                    f33 += f37;
                                    f34 += f37;
                                } else if (i39 == 9) {
                                    float f38 = ((float[]) h.e)[i38];
                                    float f39 = ((float[]) h.f)[i38];
                                    float f40 = max7 * 1.5f;
                                    float max8 = Math.max(f36, f40 - f38);
                                    f33 = Math.max(f33, f40 + f38);
                                    f35 = Math.max(f35, f40 - f39);
                                    f36 = max8;
                                    f34 = Math.max(f34, f40 + f39);
                                }
                                i37 = i38 + 1;
                            }
                            rectF3.set(rectF3.left - f36, rectF3.top - f35, rectF3.right + f33, rectF3.bottom + f34);
                            if (Build.VERSION.SDK_INT < 31 || !((Canvas) kVar9.c).isHardwareAccelerated()) {
                                matrix4.getValues(fArr4);
                                if (fArr4[i10] == 0.0f && fArr4[3] == 0.0f) {
                                    Matrix matrix9 = x0Var.g;
                                    matrix9.set(matrix4);
                                    matrix9.postScale(f10, f10);
                                    matrix9.mapRect(rectF4, rectF3);
                                    int floor = (int) Math.floor(rectF4.left);
                                    int floor2 = (int) Math.floor(rectF4.top);
                                    int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                    int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                    if (ceil > 0 && ceil2 > 0 && ceil2 * ceil <= 16777216) {
                                        x0Var.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                        x0Var.d = floor;
                                        x0Var.e = floor2;
                                        x0Var.h = Math.abs(fArr4[0]) * f10;
                                        x0Var.i = h;
                                        Canvas canvas4 = new Canvas(x0Var.f);
                                        canvas4.translate(-floor, -floor2);
                                        canvas4.concat(matrix9);
                                        kVar9.c = canvas4;
                                        kVar9.b = 0;
                                    }
                                }
                            } else {
                                Canvas b10 = w0.b(x0Var, rectF3, h, f10);
                                if (b10 != null) {
                                    kVar9.c = b10;
                                    kVar9.b = 0;
                                }
                            }
                            z0Var2 = this;
                            iVar2 = iVar;
                            kVar2 = kVar9;
                            matrix = matrix4;
                            uVar = uVar4;
                            arrayList = arrayList3;
                            i21 = i25 + 1;
                            uVar4 = uVar;
                            matrix4 = matrix;
                            arrayList4 = arrayList;
                            kVar5 = kVar2;
                            arrayList5 = arrayList2;
                        }
                    }
                    arrayList3 = arrayList4;
                    arrayList2 = arrayList5;
                    z0Var2 = this;
                    iVar2 = iVar;
                    kVar2 = kVar9;
                    matrix = matrix4;
                    uVar = uVar4;
                    arrayList = arrayList3;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                    break;
                case 16:
                    a4.k kVar10 = kVar;
                    if (!arrayList5.isEmpty()) {
                        z0Var2.g(kVar10, f10);
                    }
                    kVar2 = kVar10;
                    arrayList = arrayList4;
                    matrix = matrix4;
                    arrayList2 = arrayList5;
                    uVar = uVar4;
                    iVar2 = iVar;
                    i21 = i25 + 1;
                    uVar4 = uVar;
                    matrix4 = matrix;
                    arrayList4 = arrayList;
                    kVar5 = kVar2;
                    arrayList5 = arrayList2;
                case 17:
                    r7 h7 = h(uVar4);
                    if (z9 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                        RectF rectF5 = new RectF(rectF);
                        float[] fArr9 = z0Var2.s ? (float[]) fArr3.clone() : null;
                        a4.k kVar11 = kVar;
                        w0.a(z0Var2, kVar11, iVar, i25, h7, rectF5, fArr9, y0Var, f10);
                        i25 = i25;
                        kVar2 = kVar11;
                        arrayList = arrayList4;
                        matrix = matrix4;
                        arrayList2 = arrayList5;
                        uVar = uVar4;
                        iVar2 = iVar;
                        i21 = i25 + 1;
                        uVar4 = uVar;
                        matrix4 = matrix;
                        arrayList4 = arrayList;
                        kVar5 = kVar2;
                        arrayList5 = arrayList2;
                    } else {
                        arrayList = arrayList4;
                        matrix = matrix4;
                        arrayList2 = arrayList5;
                        uVar = uVar4;
                        kVar2 = kVar;
                        iVar2 = iVar;
                        i21 = i25 + 1;
                        uVar4 = uVar;
                        matrix4 = matrix;
                        arrayList4 = arrayList;
                        kVar5 = kVar2;
                        arrayList5 = arrayList2;
                    }
                    break;
                default:
                    throw i.a();
            }
        }
        ArrayList arrayList8 = arrayList5;
        a4.k kVar12 = kVar5;
        while (!arrayList8.isEmpty()) {
            z0Var2.g(kVar12, f10);
        }
        while (kVar12.b > 0) {
            kVar12.q();
        }
    }

    public final void e(Canvas canvas, i iVar, y0 y0Var, float f10) {
        boolean z9 = Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && iVar.c;
        int saveLayer = z9 ? canvas.saveLayer(null, null) : -1;
        d(canvas, iVar, iVar.b, y0Var, f10, true);
        if (z9) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Shader f(f5.u uVar, int i7) {
        float[] fArr = this.k;
        uVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int e10 = uVar.e(TLObject.FLAG_12, 2);
        int[] iArr = new int[Math.max(2, e10)];
        float[] fArr2 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(e10, 2)];
        j(uVar, e10, iArr, fArr2);
        if (e10 < 2) {
            return null;
        }
        return i7 == 1 ? new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP) : new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void g(a4.k kVar, float f10) {
        Object obj;
        int i7;
        x0 x0Var = (x0) org.telegram.ui.Cells.f1.k(1, (ArrayList) kVar.f);
        while (true) {
            int i10 = kVar.b;
            obj = x0Var.c;
            if (i10 <= ((obj == null && x0Var.f == null) ? x0Var.b : 0)) {
                break;
            } else {
                kVar.q();
            }
        }
        if (obj != null) {
            w0.d(x0Var, f10);
            kVar.c = x0Var.a;
        } else {
            Bitmap bitmap = x0Var.f;
            if (bitmap != null) {
                r7 r7Var = x0Var.i;
                int[] iArr = (int[]) r7Var.b;
                StringBuilder sb2 = new StringBuilder("[");
                for (i7 = 0; i7 < iArr.length; i7++) {
                    if (i7 > 0) {
                        sb2.append(',');
                    }
                    sb2.append('[');
                    sb2.append(iArr[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.d)[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.e)[i7]);
                    sb2.append(',');
                    sb2.append(((float[]) r7Var.f)[i7]);
                    sb2.append(',');
                    sb2.append(((int[]) r7Var.c)[i7] & 4294967295L);
                    sb2.append(']');
                }
                sb2.append(']');
                WidgetSandboxNative.filterPixels(bitmap, sb2.toString().getBytes(StandardCharsets.UTF_8), x0Var.h);
                kVar.c = x0Var.a;
                Matrix matrix = new Matrix();
                if (x0Var.g.invert(matrix)) {
                    ((Canvas) kVar.c).save();
                    ((Canvas) kVar.c).concat(matrix);
                    ((Canvas) kVar.c).drawBitmap(x0Var.f, x0Var.d, x0Var.e, this.c);
                    ((Canvas) kVar.c).restore();
                }
            }
        }
        kVar.b = x0Var.b;
    }

    public final void i(f5.u uVar, Path path) {
        int i7;
        int i10;
        int i11;
        path.rewind();
        int e10 = uVar.e(TLObject.FLAG_20, 0);
        int e11 = uVar.e(6291456, 1);
        int i12 = uVar.b;
        long j3 = (e10 + 3) / 4;
        long j10 = 4 * j3;
        i iVar = (i) uVar.c;
        if (j10 > iVar.d - i12) {
            throw i.a();
        }
        uVar.b = (((int) j3) * 4) + i12;
        float[] fArr = this.u;
        int i13 = 2;
        if (fArr.length < e11) {
            this.u = new float[Math.max(e11, fArr.length * 2)];
        }
        uVar.k(e11, this.u);
        int i14 = 0;
        int i15 = 0;
        while (i14 < e10) {
            int i16 = iVar.a.get(i12 + i14) & 255;
            int i17 = (i16 == 3 ? 6 : i16 == i13 ? 4 : i16 == 4 ? 0 : i13) + i15;
            if (i17 > e11) {
                break;
            }
            if (i16 == 0) {
                i7 = i14;
                int i18 = i15;
                i10 = i13;
                i11 = i17;
                float[] fArr2 = this.u;
                path.moveTo(fArr2[i18], fArr2[i18 + 1]);
            } else if (i16 == 1) {
                i7 = i14;
                int i19 = i15;
                i10 = i13;
                i11 = i17;
                float[] fArr3 = this.u;
                path.lineTo(fArr3[i19], fArr3[i19 + 1]);
            } else if (i16 == i13) {
                i7 = i14;
                int i20 = i15;
                i10 = i13;
                i11 = i17;
                float[] fArr4 = this.u;
                path.quadTo(fArr4[i20], fArr4[i20 + 1], fArr4[i20 + 2], fArr4[i20 + 3]);
            } else if (i16 != 3) {
                if (i16 == 4) {
                    path.close();
                }
                i7 = i14;
                i10 = i13;
                i11 = i17;
            } else {
                float[] fArr5 = this.u;
                int i21 = i15;
                i10 = i13;
                i11 = i17;
                i7 = i14;
                path.cubicTo(fArr5[i21], fArr5[i21 + 1], fArr5[i21 + 2], fArr5[i21 + 3], fArr5[i21 + 4], fArr5[i21 + 5]);
            }
            i14 = i7 + 1;
            i15 = i11;
            i13 = i10;
        }
        path.setFillType(uVar.p() != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void k(RectF rectF, Path path) {
        float[] fArr = this.s ? this.r : null;
        path.rewind();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }
}
