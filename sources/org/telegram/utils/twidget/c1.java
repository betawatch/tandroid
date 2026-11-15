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
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class c1 {
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
    public long x;

    public c1() {
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

    public static r7 h(f5.v vVar) {
        int f10 = vVar.f(64, 5);
        r7 r7Var = new r7(f10);
        for (int i7 = 0; i7 < f10; i7++) {
            ((int[]) r7Var.b)[i7] = vVar.p();
            ((float[]) r7Var.d)[i7] = vVar.j();
            ((float[]) r7Var.e)[i7] = vVar.j();
            ((float[]) r7Var.f)[i7] = vVar.j();
            ((int[]) r7Var.c)[i7] = vVar.p();
        }
        return r7Var;
    }

    public static void j(f5.v vVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, vVar.j()));
            iArr[i10] = vVar.p();
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

    /* JADX WARN: Removed duplicated region for block: B:195:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x064a A[LOOP:3: B:233:0x0648->B:234:0x064a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0563  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, i iVar, int i7, b1 b1Var, float f10, boolean z10) {
        n2.o0 o0Var;
        int i10;
        ArrayList arrayList;
        Matrix matrix;
        ArrayList arrayList2;
        f5.v vVar;
        n2.o0 o0Var2;
        i iVar2;
        Paint paint;
        n2.o0 o0Var3;
        Matrix matrix2;
        f5.v vVar2;
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
        n2.o0 o0Var4;
        int i21;
        int i22;
        BlurMaskFilter blurMaskFilter;
        float f16;
        ArrayList arrayList3;
        f5.v vVar3;
        c1 c1Var = this;
        n2.o0 o0Var5 = new n2.o0();
        o0Var5.d = new Matrix();
        o0Var5.e = new ArrayList();
        o0Var5.f = new ArrayList();
        o0Var5.c = canvas;
        ArrayList arrayList4 = (ArrayList) o0Var5.e;
        Matrix matrix3 = (Matrix) o0Var5.d;
        ArrayList arrayList5 = (ArrayList) o0Var5.f;
        f5.v vVar4 = new f5.v(iVar);
        int i23 = 0;
        while (i23 < i7) {
            Canvas canvas2 = (Canvas) o0Var5.c;
            int p10 = vVar4.p();
            int i24 = p10 & ns.e4;
            int i25 = p10 >>> 8;
            int i26 = i25 & 1;
            RectF rectF = c1Var.p;
            if (i26 != 0) {
                float j3 = vVar4.j();
                float j10 = vVar4.j();
                o0Var = o0Var5;
                rectF.set(j3, j10, j3 + vVar4.j(), j10 + vVar4.j());
            } else {
                o0Var = o0Var5;
                rectF.setEmpty();
            }
            boolean z11 = (i25 & 2) != 0;
            c1Var.s = z11;
            float[] fArr3 = c1Var.r;
            if (z11) {
                vVar4.k(8, fArr3);
            }
            boolean z12 = (i25 & 4) != 0;
            c1Var.t = z12;
            RectF rectF2 = c1Var.q;
            if (z12) {
                float j11 = vVar4.j();
                float j12 = vVar4.j();
                i10 = 1;
                rectF2.set(j11, j12, j11 + vVar4.j(), j12 + vVar4.j());
            } else {
                i10 = 1;
            }
            RectF rectF3 = c1Var.i;
            float[] fArr4 = c1Var.o;
            float[] fArr5 = c1Var.k;
            Paint paint2 = c1Var.b;
            int i27 = i23;
            Path path = c1Var.f;
            Paint paint3 = c1Var.a;
            RectF rectF4 = c1Var.h;
            switch (i24) {
                case 0:
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    iVar2 = iVar;
                    int p11 = vVar.p();
                    if (c1Var.t) {
                        canvas2.save();
                        canvas2.clipRect(rectF2);
                    }
                    l(p11, paint3);
                    c1Var.b(canvas2, paint3);
                    if (c1Var.t) {
                        canvas2.restore();
                    }
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 1:
                    iVar2 = iVar;
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    paint2.setColor(vVar.p());
                    paint2.setStrokeWidth(vVar.j());
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    c1Var.b(canvas2, paint2);
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 2:
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    iVar2 = iVar;
                    l(vVar.p(), paint3);
                    canvas2.drawOval(rectF, paint3);
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 3:
                    iVar2 = iVar;
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    int p12 = vVar.p();
                    float j13 = vVar.j();
                    rectF4.set(rectF);
                    float f17 = j13 / 2.0f;
                    rectF4.inset(f17, f17);
                    paint2.setColor(p12);
                    paint2.setStrokeWidth(j13);
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    canvas2.drawOval(rectF4, paint2);
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 4:
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    int p13 = vVar.p();
                    int p14 = vVar.p();
                    float j14 = vVar.j();
                    float j15 = vVar.j();
                    int p15 = vVar.p();
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
                    Paint deviceFont = b1Var.deviceFont(p14);
                    if (deviceFont == null) {
                        paint = null;
                    } else {
                        IdentityHashMap identityHashMap = c1Var.n;
                        Paint paint4 = (Paint) identityHashMap.get(deviceFont);
                        if (paint4 == null) {
                            if (identityHashMap.size() >= 64) {
                                identityHashMap.clear();
                            }
                            paint4 = new Paint(deviceFont);
                            identityHashMap.put(deviceFont, paint4);
                        }
                        paint = paint4;
                    }
                    if (paint != null) {
                        paint.setColor(p13);
                        paint.setShader(null);
                        canvas2.save();
                        float f18 = 1.0f / f10;
                        canvas2.scale(f18, f18);
                        canvas2.drawText(str, j14 * f10, j15 * f10, paint);
                        canvas2.restore();
                    }
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                    break;
                case 5:
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    int i28 = vVar.p() != 0 ? i10 : 0;
                    int p16 = vVar.p();
                    Bitmap canvas3 = i28 != 0 ? b1Var.canvas(p16) : b1Var.image(p16);
                    if (canvas3 != null) {
                        canvas2.save();
                        if (c1Var.t) {
                            canvas2.clipRect(rectF2);
                        }
                        if (c1Var.s) {
                            if (!c1Var.t) {
                                rectF2 = rectF;
                            }
                            c1Var.k(rectF2, path);
                            canvas2.clipPath(path);
                        }
                        canvas2.drawBitmap(canvas3, (Rect) null, rectF, c1Var.c);
                        canvas2.restore();
                    }
                    iVar2 = iVar;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 6:
                case 7:
                case 8:
                    Matrix matrix4 = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    n2.o0 o0Var6 = o0Var;
                    vVar.k(4, fArr5);
                    float f19 = fArr5[0];
                    float f20 = fArr5[i10];
                    float f21 = fArr5[2];
                    float f22 = fArr5[3];
                    int f23 = vVar.f(TLObject.FLAG_12, 2);
                    if (f23 == 0) {
                        matrix = matrix4;
                        arrayList = arrayList4;
                        o0Var2 = o0Var6;
                    } else {
                        matrix = matrix4;
                        int max = Math.max(2, f23);
                        arrayList = arrayList4;
                        int[] iArr = new int[max];
                        o0Var2 = o0Var6;
                        float[] fArr6 = f23 == 1 ? new float[]{0.0f, 1.0f} : new float[f23];
                        j(vVar, f23, iArr, fArr6);
                        canvas2.save();
                        if (c1Var.t) {
                            canvas2.clipRect(rectF2);
                        }
                        c1Var.k(rectF, path);
                        canvas2.clipPath(path);
                        paint3.setColor(-16777216);
                        int i29 = 6;
                        if (i24 == 6) {
                            if (max > 16) {
                                double d = f21 - f19;
                                double d2 = f22 - f20;
                                float hypot = (float) Math.hypot(d, d2);
                                if (hypot > 0.0f) {
                                    canvas2.translate(f19, f20);
                                    canvas2.rotate((float) Math.toDegrees(Math.atan2(d2, d)));
                                    int length = fArr6.length - 1;
                                    int i30 = iArr[0];
                                    paint3.setShader(null);
                                    paint3.setColor(i30);
                                    canvas2.drawRect(-8000.0f, -8000.0f, fArr6[0] * hypot, 8000.0f, paint3);
                                    int i31 = 0;
                                    while (i31 < length) {
                                        float f24 = fArr6[i31] * hypot;
                                        int i32 = i31 + 1;
                                        float f25 = fArr6[i32] * hypot;
                                        if (f25 > f24) {
                                            int i33 = iArr[i31];
                                            if (i33 == iArr[i32]) {
                                                paint3.setShader(null);
                                                paint3.setColor(i33);
                                            } else {
                                                paint3.setColor(-16777216);
                                                paint3.setShader(new LinearGradient(f24, 0.0f, f25, 0.0f, iArr[i31], iArr[i32], Shader.TileMode.CLAMP));
                                            }
                                            canvas2.drawRect(f24, -8000.0f, f25, 8000.0f, paint3);
                                        }
                                        i31 = i32;
                                    }
                                    int i34 = iArr[length];
                                    paint3.setShader(null);
                                    paint3.setColor(i34);
                                    canvas2.drawRect(fArr6[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint3);
                                    paint3.setShader(null);
                                }
                                canvas2.restore();
                            } else {
                                i29 = 6;
                            }
                        }
                        if (i24 == i29) {
                            paint3.setShader(new LinearGradient(f19, f20, f21, f22, iArr, fArr6, Shader.TileMode.CLAMP));
                        } else {
                            float[] fArr7 = fArr6;
                            if (i24 == 7) {
                                float max2 = Math.max(f21, 0.01f);
                                float max3 = Math.max(f22, 0.01f);
                                paint3.setShader(new RadialGradient(f19, f20, max2, iArr, fArr7, Shader.TileMode.CLAMP));
                                canvas2.translate(f19, f20);
                                canvas2.scale(1.0f, max3 / max2);
                                canvas2.translate(-f19, -f20);
                            } else {
                                paint3.setShader(new SweepGradient(f19, f20, iArr, fArr7));
                                canvas2.rotate(f21 - 90.0f, f19, f20);
                            }
                        }
                        canvas2.drawRect(rectF.left - 4000.0f, rectF.top - 4000.0f, rectF.right + 4000.0f, rectF.bottom + 4000.0f, paint3);
                        paint3.setShader(null);
                        canvas2.restore();
                    }
                    iVar2 = iVar;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 9:
                    Matrix matrix5 = matrix3;
                    arrayList2 = arrayList5;
                    f5.v vVar5 = vVar4;
                    o0Var3 = o0Var;
                    boolean z13 = vVar5.p() != 0;
                    canvas2.save();
                    arrayList4.add(new Matrix(matrix5));
                    o0Var3.a++;
                    if (z13) {
                        c1Var = this;
                        vVar = vVar5;
                        c1Var.i(vVar, path);
                    } else {
                        c1Var = this;
                        vVar = vVar5;
                        c1Var.k(rectF, path);
                    }
                    canvas2.clipPath(path);
                    iVar2 = iVar;
                    matrix = matrix5;
                    arrayList = arrayList4;
                    o0Var2 = o0Var3;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 10:
                case 13:
                    matrix2 = matrix3;
                    arrayList2 = arrayList5;
                    vVar2 = vVar4;
                    o0Var3 = o0Var;
                    if (o0Var3.a > 0) {
                        o0Var3.l();
                    }
                    c1Var = this;
                    iVar2 = iVar;
                    matrix = matrix2;
                    arrayList = arrayList4;
                    o0Var2 = o0Var3;
                    vVar = vVar2;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 11:
                    matrix2 = matrix3;
                    arrayList2 = arrayList5;
                    f5.v vVar6 = vVar4;
                    o0Var3 = o0Var;
                    if (vVar6.p() != 0) {
                        Path path2 = c1Var.e;
                        c1Var.i(vVar6, path2);
                        int p17 = vVar6.p();
                        int i35 = p17 & 1;
                        if (i35 != 0) {
                            int p18 = vVar6.p();
                            if (p18 == 0) {
                                i11 = vVar6.p();
                                shader = null;
                                i12 = (p17 & 2) == 0 ? i10 : 0;
                                if (i12 == 0) {
                                    int p19 = vVar6.p();
                                    int p20 = vVar6.p();
                                    Shader f26 = p20 != 0 ? c1Var.f(vVar6, p20) : null;
                                    float j16 = vVar6.j();
                                    int p21 = vVar6.p();
                                    int p22 = vVar6.p();
                                    f11 = vVar6.j();
                                    i13 = i12;
                                    int f27 = vVar6.f(1024, i10);
                                    if (f27 > 0) {
                                        fArr2 = new float[f27];
                                        vVar6.k(f27, fArr2);
                                    } else {
                                        fArr2 = null;
                                    }
                                    fArr = fArr2;
                                    i16 = p22;
                                    shader2 = f26;
                                    f13 = j16;
                                    i14 = i35;
                                    f12 = vVar6.j();
                                    i15 = p21;
                                    i17 = p19;
                                } else {
                                    i13 = i12;
                                    f11 = 4.0f;
                                    i14 = i35;
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
                                    vVar2 = vVar6;
                                    paint3.setColor(-16777216);
                                    paint3.setShader(shader);
                                    canvas2.drawPath(path2, paint3);
                                    paint3.setShader(null);
                                } else {
                                    vVar2 = vVar6;
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
                                c1Var = this;
                                iVar2 = iVar;
                                matrix = matrix2;
                                arrayList = arrayList4;
                                o0Var2 = o0Var3;
                                vVar = vVar2;
                                i23 = i27 + 1;
                                vVar4 = vVar;
                                matrix3 = matrix;
                                arrayList4 = arrayList;
                                o0Var5 = o0Var2;
                                arrayList5 = arrayList2;
                            } else {
                                shader = c1Var.f(vVar6, p18);
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
                        c1Var = this;
                        iVar2 = iVar;
                        matrix = matrix2;
                        arrayList = arrayList4;
                        o0Var2 = o0Var3;
                        vVar = vVar2;
                        i23 = i27 + 1;
                        vVar4 = vVar;
                        matrix3 = matrix;
                        arrayList4 = arrayList;
                        o0Var5 = o0Var2;
                        arrayList5 = arrayList2;
                    } else {
                        c1Var = this;
                        iVar2 = iVar;
                        matrix = matrix2;
                        vVar = vVar6;
                        arrayList = arrayList4;
                        o0Var2 = o0Var3;
                        i23 = i27 + 1;
                        vVar4 = vVar;
                        matrix3 = matrix;
                        arrayList4 = arrayList;
                        o0Var5 = o0Var2;
                        arrayList5 = arrayList2;
                    }
                    break;
                case 12:
                    ArrayList arrayList6 = arrayList4;
                    Matrix matrix6 = matrix3;
                    arrayList2 = arrayList5;
                    f5.v vVar7 = vVar4;
                    n2.o0 o0Var7 = o0Var;
                    vVar7.k(6, fArr5);
                    float j17 = vVar7.j();
                    int i36 = vVar7.p() != 0 ? i10 : 0;
                    fArr4[0] = fArr5[0];
                    fArr4[i10] = fArr5[2];
                    fArr4[2] = fArr5[4];
                    fArr4[3] = fArr5[i10];
                    fArr4[4] = fArr5[3];
                    fArr4[5] = fArr5[5];
                    fArr4[6] = 0.0f;
                    fArr4[7] = 0.0f;
                    fArr4[8] = 1.0f;
                    Matrix matrix7 = c1Var.l;
                    matrix7.setValues(fArr4);
                    if (j17 >= 1.0f || i36 != 0) {
                        canvas2.save();
                    } else {
                        int round = Math.round(Math.max(0.0f, Math.min(1.0f, j17)) * 255.0f);
                        if (rectF.isEmpty()) {
                            canvas2.saveLayerAlpha(null, round);
                        } else {
                            matrix7.mapRect(rectF4, rectF);
                            rectF4.inset(-1.0f, -1.0f);
                            canvas2.saveLayerAlpha(rectF4, round);
                        }
                    }
                    arrayList6.add(new Matrix(matrix6));
                    o0Var7.a++;
                    canvas2.concat(matrix7);
                    matrix6.preConcat(matrix7);
                    if (i36 != 0) {
                        canvas2.clipRect(0, 0, 0, 0);
                    }
                    iVar2 = iVar;
                    o0Var2 = o0Var7;
                    matrix = matrix6;
                    vVar = vVar7;
                    arrayList = arrayList6;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 14:
                    ArrayList arrayList7 = arrayList4;
                    arrayList2 = arrayList5;
                    f5.v vVar8 = vVar4;
                    n2.o0 o0Var8 = o0Var;
                    int p23 = vVar8.p();
                    vVar8.k(4, fArr5);
                    int i37 = vVar8.p() != 0 ? i10 : 0;
                    float f28 = fArr5[0];
                    float f29 = fArr5[i10];
                    float max5 = Math.max(fArr5[2], 0.0f);
                    float f30 = fArr5[3];
                    rectF3.set(rectF);
                    if (rectF3.isEmpty() || (p23 >>> 24) == 0 || ((i21 = Build.VERSION.SDK_INT) < 28 && (max5 / 2.0f) * f10 > 0.5f)) {
                        vVar2 = vVar8;
                        o0Var4 = o0Var8;
                        matrix = matrix3;
                    } else {
                        Paint paint5 = c1Var.d;
                        paint5.setColor(p23);
                        float f31 = (max5 / 2.0f) * f10;
                        if (f31 > 0.5f) {
                            float f32 = ((f31 - 0.5f) / 0.57735f) / f10;
                            i22 = i37;
                            Float valueOf = Float.valueOf(f32);
                            o0Var4 = o0Var8;
                            HashMap hashMap = c1Var.m;
                            blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                            if (blurMaskFilter == null) {
                                matrix = matrix3;
                                if (hashMap.size() >= 32) {
                                    hashMap.clear();
                                }
                                blurMaskFilter = new BlurMaskFilter(f32, BlurMaskFilter.Blur.NORMAL);
                                hashMap.put(Float.valueOf(f32), blurMaskFilter);
                            } else {
                                matrix = matrix3;
                            }
                        } else {
                            o0Var4 = o0Var8;
                            i22 = i37;
                            matrix = matrix3;
                            blurMaskFilter = null;
                        }
                        paint5.setMaskFilter(blurMaskFilter);
                        if (c1Var.s) {
                            f16 = fArr3[0];
                            int i38 = i10;
                            while (true) {
                                if (i38 < 8) {
                                    if (fArr3[i38] != f16) {
                                        f16 = -1.0f;
                                    } else {
                                        i38++;
                                    }
                                }
                            }
                        } else {
                            f16 = 0.0f;
                        }
                        if (i22 != 0 || f16 < 0.0f) {
                            Path path3 = c1Var.g;
                            path3.rewind();
                            if (i22 != 0) {
                                float abs = Math.abs(f29) + Math.abs(f28) + Math.abs(f30) + (max5 * 1.5f) + 2.0f;
                                vVar2 = vVar8;
                                rectF4.set(rectF3.left - abs, rectF3.top - abs, rectF3.right + abs, rectF3.bottom + abs);
                                path3.addRect(rectF4, Path.Direction.CW);
                                rectF4.set(rectF3.left + f30, rectF3.top + f30, rectF3.right - f30, rectF3.bottom - f30);
                                if (!rectF4.isEmpty()) {
                                    c1Var.a(path3, rectF4, -f30);
                                }
                                path3.setFillType(Path.FillType.EVEN_ODD);
                            } else {
                                vVar2 = vVar8;
                                rectF4.set(rectF3.left - f30, rectF3.top - f30, rectF3.right + f30, rectF3.bottom + f30);
                                if (!c1Var.s) {
                                    f30 = 0.0f;
                                }
                                c1Var.a(path3, rectF4, f30);
                            }
                            path3.offset(f28, f29);
                            canvas2.save();
                            c1Var.k(rectF, path);
                            if (i22 != 0) {
                                canvas2.clipPath(path);
                            } else if (i21 >= 26) {
                                canvas2.clipOutPath(path);
                            } else {
                                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                            }
                            canvas2.drawPath(path3, paint5);
                            canvas2.restore();
                            paint5.setMaskFilter(null);
                        } else {
                            float f33 = f16;
                            rectF4.set((rectF3.left - f30) + f28, (rectF3.top - f30) + f29, rectF3.right + f30 + f28, rectF3.bottom + f30 + f29);
                            float max6 = c1Var.s ? Math.max(f33 + f30, 0.0f) : 0.0f;
                            canvas2.save();
                            if (f16 != 0.0f) {
                                c1Var.k(rectF, path);
                                if (i21 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                            } else if (i21 >= 26) {
                                canvas2.clipOutRect(rectF3);
                            } else {
                                canvas2.clipRect(rectF3, Region.Op.DIFFERENCE);
                            }
                            if (max6 > 0.0f) {
                                canvas2.drawRoundRect(rectF4, max6, max6, paint5);
                            } else {
                                canvas2.drawRect(rectF4, paint5);
                            }
                            canvas2.restore();
                            paint5.setMaskFilter(null);
                            vVar2 = vVar8;
                        }
                    }
                    iVar2 = iVar;
                    o0Var2 = o0Var4;
                    arrayList = arrayList7;
                    vVar = vVar2;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                    break;
                case 15:
                    n2.o0 o0Var9 = o0Var;
                    r7 h = h(vVar4);
                    a1 a1Var = new a1();
                    a1Var.a = (Canvas) o0Var9.c;
                    a1Var.b = o0Var9.a;
                    arrayList5.add(a1Var);
                    int[] iArr2 = (int[]) h.b;
                    if (iArr2.length == 0) {
                        arrayList3 = arrayList4;
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        if (o0Var9.b < 16 && c1Var.v < 64) {
                            rectF3.set(rectF);
                            if (!rectF3.isEmpty()) {
                                arrayList3 = arrayList4;
                                vVar3 = vVar4;
                                float f34 = 0.0f;
                                int i39 = 0;
                                float f35 = 0.0f;
                                float f36 = 0.0f;
                                float f37 = 0.0f;
                                while (i39 < iArr2.length) {
                                    int i40 = i39;
                                    float max7 = Math.max(0.0f, ((float[]) h.d)[i39]);
                                    int i41 = iArr2[i40];
                                    if (i41 == 0) {
                                        float f38 = max7 * 3.0f;
                                        f36 += f38;
                                        f37 += f38;
                                        f34 += f38;
                                        f35 += f38;
                                    } else if (i41 == 9) {
                                        float f39 = ((float[]) h.e)[i40];
                                        float f40 = ((float[]) h.f)[i40];
                                        float f41 = max7 * 1.5f;
                                        float max8 = Math.max(f36, f41 - f39);
                                        f34 = Math.max(f34, f41 + f39);
                                        float max9 = Math.max(f37, f41 - f40);
                                        f35 = Math.max(f35, f41 + f40);
                                        f37 = max9;
                                        f36 = max8;
                                    }
                                    i39 = i40 + 1;
                                }
                                rectF3.set(rectF3.left - f36, rectF3.top - f37, rectF3.right + f34, rectF3.bottom + f35);
                                if (Build.VERSION.SDK_INT < 31 || !((Canvas) o0Var9.c).isHardwareAccelerated()) {
                                    matrix3.getValues(fArr4);
                                    if (fArr4[i10] == 0.0f && fArr4[3] == 0.0f) {
                                        Matrix matrix8 = a1Var.g;
                                        matrix8.set(matrix3);
                                        matrix8.postScale(f10, f10);
                                        matrix8.mapRect(rectF4, rectF3);
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            long j18 = ceil * ceil2;
                                            if (j18 <= 16777216) {
                                                long j19 = (j18 * 4) + c1Var.x;
                                                if (j19 <= 67108864) {
                                                    c1Var.x = j19;
                                                    a1Var.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                    o0Var9.b++;
                                                    c1Var.v++;
                                                    a1Var.d = floor;
                                                    a1Var.e = floor2;
                                                    a1Var.h = Math.abs(fArr4[0]) * f10;
                                                    a1Var.i = h;
                                                    Canvas canvas4 = new Canvas(a1Var.f);
                                                    canvas4.translate(-floor, -floor2);
                                                    canvas4.concat(matrix8);
                                                    o0Var9.c = canvas4;
                                                    o0Var9.a = 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Canvas b10 = z0.b(a1Var, rectF3, h, f10);
                                    if (b10 != null) {
                                        o0Var9.c = b10;
                                        o0Var9.a = 0;
                                        o0Var9.b++;
                                        c1Var.v++;
                                    }
                                }
                                o0Var2 = o0Var9;
                                matrix = matrix3;
                                arrayList = arrayList3;
                                vVar = vVar3;
                                iVar2 = iVar;
                                i23 = i27 + 1;
                                vVar4 = vVar;
                                matrix3 = matrix;
                                arrayList4 = arrayList;
                                o0Var5 = o0Var2;
                                arrayList5 = arrayList2;
                            }
                        }
                        arrayList3 = arrayList4;
                    }
                    vVar3 = vVar4;
                    o0Var2 = o0Var9;
                    matrix = matrix3;
                    arrayList = arrayList3;
                    vVar = vVar3;
                    iVar2 = iVar;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                    break;
                case 16:
                    n2.o0 o0Var10 = o0Var;
                    if (!arrayList5.isEmpty()) {
                        c1Var.g(o0Var10, f10);
                    }
                    o0Var2 = o0Var10;
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    iVar2 = iVar;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                case 17:
                    r7 h7 = h(vVar4);
                    if (z10 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                        int i42 = c1Var.w;
                        c1Var.w = i42 + 1;
                        if (i42 < 8) {
                            n2.o0 o0Var11 = o0Var;
                            z0.a(c1Var, o0Var11, iVar, i27, h7, new RectF(rectF), c1Var.s ? (float[]) fArr3.clone() : null, b1Var, f10);
                            i27 = i27;
                            iVar2 = iVar;
                            o0Var2 = o0Var11;
                            arrayList = arrayList4;
                            matrix = matrix3;
                            arrayList2 = arrayList5;
                            vVar = vVar4;
                            i23 = i27 + 1;
                            vVar4 = vVar;
                            matrix3 = matrix;
                            arrayList4 = arrayList;
                            o0Var5 = o0Var2;
                            arrayList5 = arrayList2;
                        }
                    }
                    iVar2 = iVar;
                    arrayList = arrayList4;
                    matrix = matrix3;
                    arrayList2 = arrayList5;
                    vVar = vVar4;
                    o0Var2 = o0Var;
                    i23 = i27 + 1;
                    vVar4 = vVar;
                    matrix3 = matrix;
                    arrayList4 = arrayList;
                    o0Var5 = o0Var2;
                    arrayList5 = arrayList2;
                    break;
                default:
                    throw i.a();
            }
        }
        ArrayList arrayList8 = arrayList5;
        n2.o0 o0Var12 = o0Var5;
        while (!arrayList8.isEmpty()) {
            c1Var.g(o0Var12, f10);
        }
        while (o0Var12.a > 0) {
            o0Var12.l();
        }
    }

    public final void e(Canvas canvas, i iVar, b1 b1Var, float f10) {
        boolean z10 = Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && iVar.c;
        int saveLayer = z10 ? canvas.saveLayer(null, null) : -1;
        d(canvas, iVar, iVar.b, b1Var, f10, true);
        if (z10) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Shader f(f5.v vVar, int i7) {
        float[] fArr = this.k;
        vVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int f15 = vVar.f(TLObject.FLAG_12, 2);
        int[] iArr = new int[Math.max(2, f15)];
        float[] fArr2 = f15 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(f15, 2)];
        j(vVar, f15, iArr, fArr2);
        if (f15 < 2) {
            return null;
        }
        return i7 == 1 ? new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP) : new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void g(n2.o0 o0Var, float f10) {
        Object obj;
        a1 a1Var = (a1) r.b.g(1, (ArrayList) o0Var.f);
        if (a1Var.c != null || a1Var.f != null) {
            o0Var.b--;
        }
        while (true) {
            int i7 = o0Var.a;
            obj = a1Var.c;
            if (i7 <= ((obj == null && a1Var.f == null) ? a1Var.b : 0)) {
                break;
            } else {
                o0Var.l();
            }
        }
        if (obj != null) {
            z0.d(a1Var, f10);
            o0Var.c = a1Var.a;
        } else {
            Bitmap bitmap = a1Var.f;
            if (bitmap != null) {
                r7 r7Var = a1Var.i;
                WidgetClientNative.filterPixels(bitmap, (int[]) r7Var.b, (float[]) r7Var.d, (float[]) r7Var.e, (float[]) r7Var.f, (int[]) r7Var.c, a1Var.h);
                o0Var.c = a1Var.a;
                Matrix matrix = new Matrix();
                if (a1Var.g.invert(matrix)) {
                    ((Canvas) o0Var.c).save();
                    ((Canvas) o0Var.c).concat(matrix);
                    ((Canvas) o0Var.c).drawBitmap(a1Var.f, a1Var.d, a1Var.e, this.c);
                    ((Canvas) o0Var.c).restore();
                }
            }
        }
        o0Var.a = a1Var.b;
    }

    public final void i(f5.v vVar, Path path) {
        int i7;
        int i10;
        int i11;
        path.rewind();
        int f10 = vVar.f(TLObject.FLAG_20, 0);
        int f11 = vVar.f(6291456, 1);
        int i12 = vVar.b;
        long j3 = (f10 + 3) / 4;
        long j10 = 4 * j3;
        i iVar = (i) vVar.c;
        if (j10 > iVar.d - i12) {
            throw i.a();
        }
        vVar.b = (((int) j3) * 4) + i12;
        float[] fArr = this.u;
        int i13 = 2;
        if (fArr.length < f11) {
            this.u = new float[Math.max(f11, fArr.length * 2)];
        }
        vVar.k(f11, this.u);
        int i14 = 0;
        int i15 = 0;
        while (i14 < f10) {
            int i16 = iVar.a.get(i12 + i14) & 255;
            int i17 = (i16 == 3 ? 6 : i16 == i13 ? 4 : i16 == 4 ? 0 : i13) + i15;
            if (i17 > f11) {
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
        path.setFillType(vVar.p() != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
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
