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
import java.util.BitSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h1 {
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

    public h1() {
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
        this.z = 67108864L;
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i7, float... fArr2) {
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

    public static long h(float f10, float f11, float f12) {
        double d = f12;
        double ceil = Math.ceil(f10 * d);
        double ceil2 = Math.ceil(f11 * d);
        if (ceil <= 0.0d || ceil2 <= 0.0d) {
            return 0L;
        }
        return (long) Math.min(ceil * ceil2, 1.0E15d);
    }

    public static float j(r7 r7Var, RectF rectF) {
        int[] iArr = (int[]) r7Var.b;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float max = Math.max(0.0f, ((float[]) r7Var.d)[i7]);
            int i10 = iArr[i7];
            if (i10 == 0) {
                float f14 = max * 3.0f;
                f10 += f14;
                f11 += f14;
                f12 += f14;
                f13 += f14;
            } else if (i10 == 9) {
                float f15 = ((float[]) r7Var.e)[i7];
                float f16 = ((float[]) r7Var.f)[i7];
                float f17 = max * 1.5f;
                f10 = Math.max(f10, f17 - f15);
                f12 = Math.max(f12, f15 + f17);
                f11 = Math.max(f11, f17 - f16);
                f13 = Math.max(f13, f17 + f16);
            }
        }
        rectF.set(rectF.left - f10, rectF.top - f11, rectF.right + f12, rectF.bottom + f13);
        return Math.max(Math.max(f10, f12), Math.max(f11, f13));
    }

    public static r7 k(b3.j jVar) {
        int e10 = jVar.e(64, 5);
        r7 r7Var = new r7(e10);
        for (int i7 = 0; i7 < e10; i7++) {
            ((int[]) r7Var.b)[i7] = jVar.o();
            ((float[]) r7Var.d)[i7] = jVar.j();
            ((float[]) r7Var.e)[i7] = jVar.j();
            ((float[]) r7Var.f)[i7] = jVar.j();
            ((int[]) r7Var.c)[i7] = jVar.o();
        }
        return r7Var;
    }

    public static void m(b3.j jVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, jVar.j()));
            iArr[i10] = jVar.o();
            if (i7 > 1) {
                fArr[i10] = max;
            }
        }
        if (i7 == 1) {
            iArr[1] = iArr[0];
        }
    }

    public static void o(int i7, Paint paint) {
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

    public final void b(int i7, int i10) {
        this.v = 0;
        this.w = 0;
        this.y = 0L;
        this.x = 0;
        this.z = Math.max(67108864L, Math.max(0, i7) * 8 * Math.max(0, i10));
    }

    public final void c(Canvas canvas, Paint paint) {
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
            n(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0658 A[LOOP:2: B:249:0x0656->B:250:0x0658, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0571  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, j jVar, int i7, g1 g1Var, float f10, boolean z10) {
        cc.e eVar;
        int i10;
        h1 h1Var;
        Matrix matrix;
        ArrayList arrayList;
        b3.j jVar2;
        cc.e eVar2;
        j jVar3;
        Paint paint;
        b3.j jVar4;
        cc.e eVar3;
        int i11;
        Shader shader;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        float[] fArr;
        float f12;
        float f13;
        Shader shader2;
        int i17;
        float f14;
        Shader shader3;
        Shader shader4;
        int i18;
        Paint.Cap cap;
        int i19;
        int i20;
        float f15;
        float[] fArr2;
        int i21;
        cc.e eVar4;
        Matrix matrix2;
        boolean z11;
        long h;
        boolean z12;
        cc.e eVar5;
        int i22;
        BlurMaskFilter blurMaskFilter;
        float f16;
        cc.e eVar6;
        h1 h1Var2 = this;
        int[] iArr = jVar.f;
        cc.e eVar7 = new cc.e();
        eVar7.e = new BitSet();
        eVar7.f = new Matrix();
        eVar7.g = new ArrayList();
        eVar7.h = new ArrayList();
        eVar7.d = canvas;
        Matrix matrix3 = (Matrix) eVar7.f;
        ArrayList arrayList2 = (ArrayList) eVar7.h;
        b3.j jVar5 = new b3.j(jVar);
        int i23 = 0;
        while (i23 < i7) {
            Canvas canvas2 = (Canvas) eVar7.d;
            int o4 = jVar5.o();
            int i24 = o4 & ks.e4;
            int i25 = o4 >>> 8;
            int i26 = i25 & 1;
            RectF rectF = h1Var2.p;
            if (i26 != 0) {
                float j3 = jVar5.j();
                float j10 = jVar5.j();
                eVar = eVar7;
                rectF.set(j3, j10, j3 + jVar5.j(), j10 + jVar5.j());
            } else {
                eVar = eVar7;
                rectF.setEmpty();
            }
            boolean z13 = (i25 & 2) != 0;
            h1Var2.s = z13;
            float[] fArr3 = h1Var2.r;
            if (z13) {
                jVar5.k(8, fArr3);
            }
            boolean z14 = (i25 & 4) != 0;
            h1Var2.t = z14;
            RectF rectF2 = h1Var2.q;
            if (z14) {
                float j11 = jVar5.j();
                float j12 = jVar5.j();
                i10 = 1;
                rectF2.set(j11, j12, j11 + jVar5.j(), j12 + jVar5.j());
            } else {
                i10 = 1;
            }
            RectF rectF3 = h1Var2.i;
            float[] fArr4 = h1Var2.o;
            float[] fArr5 = h1Var2.k;
            Paint paint2 = h1Var2.b;
            int i27 = i23;
            Path path = h1Var2.f;
            Paint paint3 = h1Var2.a;
            int[] iArr2 = iArr;
            RectF rectF4 = h1Var2.h;
            switch (i24) {
                case 0:
                    h1Var = h1Var2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    jVar3 = jVar;
                    int o10 = jVar2.o();
                    if (h1Var.t) {
                        canvas2.save();
                        canvas2.clipRect(rectF2);
                    }
                    o(o10, paint3);
                    h1Var.c(canvas2, paint3);
                    if (h1Var.t) {
                        canvas2.restore();
                    }
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 1:
                    h1Var = h1Var2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    jVar3 = jVar;
                    paint2.setColor(jVar2.o());
                    paint2.setStrokeWidth(jVar2.j());
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    h1Var.c(canvas2, paint2);
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 2:
                    h1Var = h1Var2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    jVar3 = jVar;
                    o(jVar2.o(), paint3);
                    canvas2.drawOval(rectF, paint3);
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 3:
                    h1Var = h1Var2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    jVar3 = jVar;
                    int o11 = jVar2.o();
                    float j13 = jVar2.j();
                    rectF4.set(rectF);
                    float f17 = j13 / 2.0f;
                    rectF4.inset(f17, f17);
                    paint2.setColor(o11);
                    paint2.setStrokeWidth(j13);
                    paint2.setStrokeCap(Paint.Cap.BUTT);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    paint2.setPathEffect(null);
                    canvas2.drawOval(rectF4, paint2);
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 4:
                    h1Var = h1Var2;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    int o12 = jVar2.o();
                    int o13 = jVar2.o();
                    float j14 = jVar2.j();
                    float j15 = jVar2.j();
                    int o14 = jVar2.o();
                    Paint deviceFont = g1Var.deviceFont(o13);
                    if (deviceFont == null) {
                        paint = null;
                    } else {
                        IdentityHashMap identityHashMap = h1Var.n;
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
                        if (o14 >= 0) {
                            jVar3 = jVar;
                            String[] strArr = jVar3.g;
                            if (o14 < strArr.length) {
                                int i28 = iArr2[o14];
                                int i29 = h1Var.x;
                                if (i28 > TLObject.FLAG_20 - i29) {
                                    continue;
                                } else {
                                    h1Var.x = i29 + i28;
                                    if (o14 < 0 || o14 >= strArr.length) {
                                        throw j.a();
                                    }
                                    String str = strArr[o14];
                                    if (str == null) {
                                        str = new String(jVar3.a.array(), jVar3.e[o14], iArr2[o14], StandardCharsets.UTF_8);
                                        strArr[o14] = str;
                                    }
                                    paint.setColor(o12);
                                    paint.setShader(null);
                                    canvas2.save();
                                    float f18 = 1.0f / f10;
                                    canvas2.scale(f18, f18);
                                    canvas2.drawText(str, j14 * f10, j15 * f10, paint);
                                    canvas2.restore();
                                }
                                i23 = i27 + 1;
                                h1Var2 = h1Var;
                                eVar7 = eVar2;
                                jVar5 = jVar2;
                                iArr = iArr2;
                                arrayList2 = arrayList;
                                matrix3 = matrix;
                            }
                        }
                        throw j.a();
                    }
                    jVar3 = jVar;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 5:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    eVar2 = eVar;
                    int i30 = jVar2.o() != 0 ? i10 : 0;
                    int o15 = jVar2.o();
                    Bitmap canvas3 = i30 != 0 ? g1Var.canvas(o15) : g1Var.image(o15);
                    if (canvas3 != null) {
                        canvas2.save();
                        h1Var = this;
                        if (h1Var.t) {
                            canvas2.clipRect(rectF2);
                        }
                        if (h1Var.s) {
                            if (!h1Var.t) {
                                rectF2 = rectF;
                            }
                            h1Var.n(rectF2, path);
                            canvas2.clipPath(path);
                        }
                        canvas2.drawBitmap(canvas3, (Rect) null, rectF, h1Var.c);
                        canvas2.restore();
                        jVar3 = jVar;
                        i23 = i27 + 1;
                        h1Var2 = h1Var;
                        eVar7 = eVar2;
                        jVar5 = jVar2;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    }
                    h1Var = this;
                    jVar3 = jVar;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 6:
                case 7:
                case 8:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    b3.j jVar6 = jVar5;
                    cc.e eVar8 = eVar;
                    jVar6.k(4, fArr5);
                    float f19 = fArr5[0];
                    float f20 = fArr5[1];
                    float f21 = fArr5[2];
                    float f22 = fArr5[3];
                    int e10 = jVar6.e(TLObject.FLAG_12, 2);
                    if (e10 == 0) {
                        jVar2 = jVar6;
                        eVar2 = eVar8;
                    } else {
                        int max = Math.max(2, e10);
                        eVar2 = eVar8;
                        int[] iArr3 = new int[max];
                        float[] fArr6 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[e10];
                        m(jVar6, e10, iArr3, fArr6);
                        canvas2.save();
                        if (h1Var2.t) {
                            canvas2.clipRect(rectF2);
                        }
                        h1Var2.n(rectF, path);
                        canvas2.clipPath(path);
                        paint3.setColor(-16777216);
                        if (i24 != 6 || max <= 16) {
                            jVar2 = jVar6;
                            if (i24 == 6) {
                                paint3.setShader(new LinearGradient(f19, f20, f21, f22, iArr3, fArr6, Shader.TileMode.CLAMP));
                            } else {
                                float[] fArr7 = fArr6;
                                if (i24 == 7) {
                                    float max2 = Math.max(f21, 0.01f);
                                    float max3 = Math.max(f22, 0.01f);
                                    paint3.setShader(new RadialGradient(f19, f20, max2, iArr3, fArr7, Shader.TileMode.CLAMP));
                                    canvas2.translate(f19, f20);
                                    canvas2.scale(1.0f, max3 / max2);
                                    canvas2.translate(-f19, -f20);
                                } else {
                                    paint3.setShader(new SweepGradient(f19, f20, iArr3, fArr7));
                                    canvas2.rotate(f21 - 90.0f, f19, f20);
                                }
                            }
                            canvas2.drawRect(rectF.left - 4000.0f, rectF.top - 4000.0f, rectF.right + 4000.0f, rectF.bottom + 4000.0f, paint3);
                            paint3.setShader(null);
                            canvas2.restore();
                        } else {
                            double d = f21 - f19;
                            double d2 = f22 - f20;
                            jVar2 = jVar6;
                            float hypot = (float) Math.hypot(d, d2);
                            if (hypot > 0.0f) {
                                canvas2.translate(f19, f20);
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(d2, d)));
                                int length = fArr6.length - 1;
                                int i31 = iArr3[0];
                                paint3.setShader(null);
                                paint3.setColor(i31);
                                canvas2.drawRect(-8000.0f, -8000.0f, fArr6[0] * hypot, 8000.0f, paint3);
                                int i32 = 0;
                                while (i32 < length) {
                                    float f23 = fArr6[i32] * hypot;
                                    int i33 = i32 + 1;
                                    float f24 = fArr6[i33] * hypot;
                                    if (f24 > f23) {
                                        int i34 = iArr3[i32];
                                        if (i34 == iArr3[i33]) {
                                            paint3.setShader(null);
                                            paint3.setColor(i34);
                                        } else {
                                            paint3.setColor(-16777216);
                                            paint3.setShader(new LinearGradient(f23, 0.0f, f24, 0.0f, iArr3[i32], iArr3[i33], Shader.TileMode.CLAMP));
                                        }
                                        canvas2.drawRect(f23, -8000.0f, f24, 8000.0f, paint3);
                                    }
                                    i32 = i33;
                                }
                                int i35 = iArr3[length];
                                paint3.setShader(null);
                                paint3.setColor(i35);
                                canvas2.drawRect(fArr6[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint3);
                                paint3.setShader(null);
                            }
                            canvas2.restore();
                        }
                    }
                    h1Var = this;
                    jVar3 = jVar;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 9:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    b3.j jVar7 = jVar5;
                    cc.e eVar9 = eVar;
                    boolean z15 = jVar7.o() != 0;
                    canvas2.save();
                    eVar9.u(false);
                    if (z15) {
                        h1Var2.l(jVar7, path);
                    } else {
                        h1Var2.n(rectF, path);
                    }
                    canvas2.clipPath(path);
                    jVar2 = jVar7;
                    eVar2 = eVar9;
                    jVar3 = jVar;
                    h1Var = h1Var2;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 10:
                case 13:
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar4 = jVar5;
                    eVar3 = eVar;
                    if (eVar3.a > 0) {
                        eVar3.t();
                    }
                    jVar2 = jVar4;
                    eVar2 = eVar3;
                    jVar3 = jVar;
                    h1Var = h1Var2;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 11:
                    arrayList = arrayList2;
                    jVar4 = jVar5;
                    Matrix matrix4 = matrix3;
                    eVar3 = eVar;
                    if (jVar4.o() != 0) {
                        Path path2 = h1Var2.e;
                        h1Var2.l(jVar4, path2);
                        int o16 = jVar4.o();
                        int i36 = o16 & 1;
                        if (i36 != 0) {
                            int o17 = jVar4.o();
                            if (o17 == 0) {
                                i11 = jVar4.o();
                            } else {
                                shader = h1Var2.g(jVar4, o17);
                                i11 = 0;
                                i12 = (o16 & 2) == 0 ? i10 : 0;
                                if (i12 == 0) {
                                    int o18 = jVar4.o();
                                    int o19 = jVar4.o();
                                    Shader g10 = o19 != 0 ? h1Var2.g(jVar4, o19) : null;
                                    float j16 = jVar4.j();
                                    int o20 = jVar4.o();
                                    int o21 = jVar4.o();
                                    f11 = jVar4.j();
                                    i13 = i12;
                                    i14 = i36;
                                    int e11 = jVar4.e(1024, i10);
                                    if (e11 > 0) {
                                        fArr2 = new float[e11];
                                        jVar4.k(e11, fArr2);
                                    } else {
                                        fArr2 = null;
                                    }
                                    matrix = matrix4;
                                    f12 = j16;
                                    f13 = jVar4.j();
                                    shader2 = g10;
                                    i15 = o20;
                                    i17 = o18;
                                    fArr = fArr2;
                                    i16 = o21;
                                } else {
                                    i13 = i12;
                                    i14 = i36;
                                    f11 = 4.0f;
                                    matrix = matrix4;
                                    i15 = 0;
                                    i16 = 0;
                                    fArr = null;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    shader2 = null;
                                    i17 = 0;
                                }
                                f14 = f11;
                                if (shader == null) {
                                    shader3 = shader2;
                                    paint3.setColor(-16777216);
                                    paint3.setShader(shader);
                                    canvas2.drawPath(path2, paint3);
                                    paint3.setShader(null);
                                } else {
                                    shader3 = shader2;
                                    if (i14 != 0 && (i11 >>> 24) != 0) {
                                        o(i11, paint3);
                                        canvas2.drawPath(path2, paint3);
                                    }
                                }
                                shader4 = f12 > 0.0f ? null : shader3;
                                if (i13 != 0 && (((i17 >>> 24) != 0 || shader4 != null) && f12 > 0.0f)) {
                                    paint2.setColor(shader4 == null ? -16777216 : i17);
                                    paint2.setShader(shader4);
                                    paint2.setStrokeWidth(f12);
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
                                            paint2.setPathEffect(new DashPathEffect(fArr8, f13));
                                        }
                                    }
                                    canvas2.drawPath(path2, paint2);
                                    paint2.setPathEffect(null);
                                    paint2.setShader(null);
                                }
                            }
                        } else {
                            i11 = 0;
                        }
                        shader = null;
                        if ((o16 & 2) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        f14 = f11;
                        if (shader == null) {
                        }
                        if (f12 > 0.0f) {
                        }
                        if (i13 != 0) {
                            paint2.setColor(shader4 == null ? -16777216 : i17);
                            paint2.setShader(shader4);
                            paint2.setStrokeWidth(f12);
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
                    } else {
                        matrix = matrix4;
                    }
                    jVar2 = jVar4;
                    eVar2 = eVar3;
                    jVar3 = jVar;
                    h1Var = h1Var2;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 12:
                    Matrix matrix5 = matrix3;
                    arrayList = arrayList2;
                    b3.j jVar8 = jVar5;
                    cc.e eVar10 = eVar;
                    jVar8.k(6, fArr5);
                    float j17 = jVar8.j();
                    int i37 = jVar8.o() != 0 ? i10 : 0;
                    fArr4[0] = fArr5[0];
                    fArr4[i10] = fArr5[2];
                    fArr4[2] = fArr5[4];
                    fArr4[3] = fArr5[i10];
                    fArr4[4] = fArr5[3];
                    fArr4[5] = fArr5[5];
                    fArr4[6] = 0.0f;
                    fArr4[7] = 0.0f;
                    fArr4[8] = 1.0f;
                    Matrix matrix6 = h1Var2.l;
                    matrix6.setValues(fArr4);
                    if (j17 >= 1.0f || i37 != 0) {
                        i21 = i37;
                        eVar4 = eVar10;
                        matrix2 = matrix5;
                        canvas2.save();
                        z11 = false;
                    } else {
                        int round = Math.round(Math.max(0.0f, Math.min(1.0f, j17)) * 255.0f);
                        boolean isEmpty = rectF.isEmpty();
                        if (!isEmpty) {
                            matrix6.mapRect(rectF4, rectF);
                            rectF4.inset(-1.0f, -1.0f);
                        }
                        RectF rectF5 = !isEmpty ? rectF4 : null;
                        eVar4 = eVar10;
                        if (eVar4.c >= 32) {
                            i21 = i37;
                            z12 = isEmpty;
                            matrix2 = matrix5;
                        } else {
                            RectF rectF6 = h1Var2.A;
                            if (rectF5 == null) {
                                h = h(rectF6.width(), rectF6.height(), f10);
                                matrix2 = matrix5;
                            } else {
                                RectF rectF7 = h1Var2.B;
                                matrix2 = matrix5;
                                matrix2.mapRect(rectF7, rectF5);
                                h = rectF7.intersect(rectF6) ? h(rectF7.width(), rectF7.height(), f10) : 0L;
                            }
                            long j18 = h1Var2.E;
                            i21 = i37;
                            z12 = isEmpty;
                            long j19 = h1Var2.D;
                            if (h <= j18 - j19) {
                                h1Var2.D = j19 + h;
                                if (i10 != 0) {
                                    canvas2.save();
                                } else if (z12) {
                                    canvas2.saveLayerAlpha(null, round);
                                } else {
                                    canvas2.saveLayerAlpha(rectF4, round);
                                }
                                z11 = i10;
                            }
                        }
                        i10 = 0;
                        if (i10 != 0) {
                        }
                        z11 = i10;
                    }
                    eVar4.u(z11);
                    canvas2.concat(matrix6);
                    matrix2.preConcat(matrix6);
                    if (i21 != 0) {
                        canvas2.clipRect(0, 0, 0, 0);
                        jVar2 = jVar8;
                        eVar2 = eVar4;
                        matrix = matrix2;
                        jVar3 = jVar;
                        h1Var = h1Var2;
                        i23 = i27 + 1;
                        h1Var2 = h1Var;
                        eVar7 = eVar2;
                        jVar5 = jVar2;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    } else {
                        jVar2 = jVar8;
                        eVar2 = eVar4;
                        matrix = matrix2;
                        jVar3 = jVar;
                        h1Var = h1Var2;
                        i23 = i27 + 1;
                        h1Var2 = h1Var;
                        eVar7 = eVar2;
                        jVar5 = jVar2;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    }
                case 14:
                    cc.e eVar11 = eVar;
                    int o22 = jVar5.o();
                    jVar5.k(4, fArr5);
                    int i38 = jVar5.o() != 0 ? i10 : 0;
                    float f25 = fArr5[0];
                    float f26 = fArr5[i10];
                    int i39 = i38;
                    arrayList = arrayList2;
                    float max5 = Math.max(fArr5[2], 0.0f);
                    float f27 = fArr5[3];
                    rectF3.set(rectF);
                    if (rectF3.isEmpty() || (o22 >>> 24) == 0 || ((i22 = Build.VERSION.SDK_INT) < 28 && (max5 / 2.0f) * f10 > 0.5f)) {
                        eVar5 = eVar11;
                        matrix = matrix3;
                    } else {
                        Paint paint4 = h1Var2.d;
                        paint4.setColor(o22);
                        float f28 = (max5 / 2.0f) * f10;
                        if (f28 > 0.5f) {
                            float f29 = ((f28 - 0.5f) / 0.57735f) / f10;
                            matrix = matrix3;
                            Float valueOf = Float.valueOf(f29);
                            HashMap hashMap = h1Var2.m;
                            blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                            if (blurMaskFilter == null) {
                                eVar5 = eVar11;
                                if (hashMap.size() >= 32) {
                                    hashMap.clear();
                                }
                                BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f29, BlurMaskFilter.Blur.NORMAL);
                                hashMap.put(Float.valueOf(f29), blurMaskFilter2);
                                blurMaskFilter = blurMaskFilter2;
                            } else {
                                eVar5 = eVar11;
                            }
                        } else {
                            eVar5 = eVar11;
                            matrix = matrix3;
                            blurMaskFilter = null;
                        }
                        paint4.setMaskFilter(blurMaskFilter);
                        if (h1Var2.s) {
                            f16 = fArr3[0];
                            int i40 = i10;
                            while (true) {
                                if (i40 < 8) {
                                    if (fArr3[i40] != f16) {
                                        f16 = -1.0f;
                                    } else {
                                        i40++;
                                    }
                                }
                            }
                        } else {
                            f16 = 0.0f;
                        }
                        if (i39 != 0 || f16 < 0.0f) {
                            Path path3 = h1Var2.g;
                            path3.rewind();
                            if (i39 != 0) {
                                float abs = Math.abs(f26) + Math.abs(f25) + Math.abs(f27) + (1.5f * max5) + 2.0f;
                                jVar2 = jVar5;
                                rectF4.set(rectF3.left - abs, rectF3.top - abs, rectF3.right + abs, rectF3.bottom + abs);
                                path3.addRect(rectF4, Path.Direction.CW);
                                rectF4.set(rectF3.left + f27, rectF3.top + f27, rectF3.right - f27, rectF3.bottom - f27);
                                if (!rectF4.isEmpty()) {
                                    h1Var2.a(path3, rectF4, -f27);
                                }
                                path3.setFillType(Path.FillType.EVEN_ODD);
                            } else {
                                jVar2 = jVar5;
                                rectF4.set(rectF3.left - f27, rectF3.top - f27, rectF3.right + f27, rectF3.bottom + f27);
                                if (!h1Var2.s) {
                                    f27 = 0.0f;
                                }
                                h1Var2.a(path3, rectF4, f27);
                            }
                            path3.offset(f25, f26);
                            canvas2.save();
                            h1Var2.n(rectF, path);
                            if (i39 != 0) {
                                canvas2.clipPath(path);
                            } else if (i22 >= 26) {
                                canvas2.clipOutPath(path);
                            } else {
                                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                            }
                            canvas2.drawPath(path3, paint4);
                            canvas2.restore();
                            paint4.setMaskFilter(null);
                            jVar3 = jVar;
                            h1Var = h1Var2;
                            eVar2 = eVar5;
                            i23 = i27 + 1;
                            h1Var2 = h1Var;
                            eVar7 = eVar2;
                            jVar5 = jVar2;
                            iArr = iArr2;
                            arrayList2 = arrayList;
                            matrix3 = matrix;
                        } else {
                            float f30 = f16;
                            rectF4.set((rectF3.left - f27) + f25, (rectF3.top - f27) + f26, rectF3.right + f27 + f25, rectF3.bottom + f27 + f26);
                            float max6 = h1Var2.s ? Math.max(f30 + f27, 0.0f) : 0.0f;
                            canvas2.save();
                            if (f16 != 0.0f) {
                                h1Var2.n(rectF, path);
                                if (i22 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                            } else if (i22 >= 26) {
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
                        }
                    }
                    jVar2 = jVar5;
                    jVar3 = jVar;
                    h1Var = h1Var2;
                    eVar2 = eVar5;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 15:
                    eVar6 = eVar;
                    r7 k10 = k(jVar5);
                    f1 f1Var = new f1();
                    f1Var.a = (Canvas) eVar6.d;
                    f1Var.b = eVar6.a;
                    arrayList2.add(f1Var);
                    if (((int[]) k10.b).length != 0 && eVar6.b < 16 && h1Var2.v < 64) {
                        rectF3.set(rectF);
                        if (!rectF3.isEmpty() && h1Var2.q(eVar6, rectF3, j(k10, rectF3))) {
                            if (Build.VERSION.SDK_INT < 31 || !((Canvas) eVar6.d).isHardwareAccelerated()) {
                                matrix3.getValues(fArr4);
                                if (fArr4[i10] == 0.0f && fArr4[3] == 0.0f) {
                                    Matrix matrix7 = f1Var.g;
                                    matrix7.set(matrix3);
                                    matrix7.postScale(f10, f10);
                                    matrix7.mapRect(rectF4, rectF3);
                                    float abs2 = Math.abs(fArr4[0]) * f10;
                                    double height = rectF4.height() * rectF4.width();
                                    if (height > 0.0d) {
                                        if (height > 4194304.0d) {
                                            float sqrt = (float) Math.sqrt(4194304.0d / height);
                                            matrix7.postScale(sqrt, sqrt);
                                            matrix7.mapRect(rectF4, rectF3);
                                            abs2 *= sqrt;
                                        }
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            long j20 = ceil2 * ceil;
                                            if (j20 <= 8388608 && h1Var2.p(j20)) {
                                                f1Var.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                eVar6.b++;
                                                h1Var2.v++;
                                                f1Var.d = floor;
                                                f1Var.e = floor2;
                                                f1Var.h = abs2;
                                                f1Var.i = k10;
                                                Canvas canvas4 = new Canvas(f1Var.f);
                                                canvas4.translate(-floor, -floor2);
                                                canvas4.concat(matrix7);
                                                eVar6.d = canvas4;
                                                eVar6.a = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Canvas b10 = e1.b(h1Var2, f1Var, rectF3, k10, f10);
                                if (b10 != null) {
                                    eVar6.d = b10;
                                    eVar6.a = 0;
                                    eVar6.b++;
                                    h1Var2.v++;
                                }
                            }
                        }
                    }
                    h1Var = h1Var2;
                    eVar2 = eVar6;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    jVar3 = jVar;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                    break;
                case 16:
                    eVar6 = eVar;
                    if (!arrayList2.isEmpty()) {
                        h1Var2.i(eVar6, f10);
                    }
                    h1Var = h1Var2;
                    eVar2 = eVar6;
                    matrix = matrix3;
                    arrayList = arrayList2;
                    jVar2 = jVar5;
                    jVar3 = jVar;
                    i23 = i27 + 1;
                    h1Var2 = h1Var;
                    eVar7 = eVar2;
                    jVar5 = jVar2;
                    iArr = iArr2;
                    arrayList2 = arrayList;
                    matrix3 = matrix;
                case 17:
                    r7 k11 = k(jVar5);
                    if (!z10 || Build.VERSION.SDK_INT < 31 || !canvas2.isHardwareAccelerated() || h1Var2.w >= 8) {
                        h1Var = h1Var2;
                        matrix = matrix3;
                        arrayList = arrayList2;
                        jVar2 = jVar5;
                        eVar2 = eVar;
                        jVar3 = jVar;
                        i23 = i27 + 1;
                        h1Var2 = h1Var;
                        eVar7 = eVar2;
                        jVar5 = jVar2;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    } else {
                        cc.e eVar12 = eVar;
                        e1.a(h1Var2, eVar12, jVar, i27, k11, new RectF(rectF), h1Var2.s ? (float[]) fArr3.clone() : null, g1Var, f10);
                        i27 = i27;
                        eVar2 = eVar12;
                        matrix = matrix3;
                        arrayList = arrayList2;
                        jVar2 = jVar5;
                        jVar3 = jVar;
                        h1Var = h1Var2;
                        i23 = i27 + 1;
                        h1Var2 = h1Var;
                        eVar7 = eVar2;
                        jVar5 = jVar2;
                        iArr = iArr2;
                        arrayList2 = arrayList;
                        matrix3 = matrix;
                    }
                    break;
                default:
                    throw j.a();
            }
        }
        cc.e eVar13 = eVar7;
        ArrayList arrayList3 = arrayList2;
        h1 h1Var3 = h1Var2;
        while (!arrayList3.isEmpty()) {
            h1Var3.i(eVar13, f10);
        }
        while (eVar13.a > 0) {
            eVar13.t();
        }
    }

    public final void f(Canvas canvas, j jVar, g1 g1Var, float f10, float f11, float f12, float f13, float f14) {
        RectF rectF = this.A;
        rectF.set(f11, f12, f13, f14);
        this.D = 0L;
        this.E = h(rectF.width(), rectF.height(), f10) * 64;
        boolean z10 = Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && jVar.c;
        int saveLayer = z10 ? canvas.saveLayer(null, null) : -1;
        e(canvas, jVar, jVar.b, g1Var, f10, true);
        if (z10) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Shader g(b3.j jVar, int i7) {
        float[] fArr = this.k;
        jVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int e10 = jVar.e(TLObject.FLAG_12, 2);
        int[] iArr = new int[Math.max(2, e10)];
        float[] fArr2 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(e10, 2)];
        m(jVar, e10, iArr, fArr2);
        if (e10 < 2) {
            return null;
        }
        return i7 == 1 ? new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP) : new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void i(cc.e eVar, float f10) {
        Object obj;
        f1 f1Var = (f1) p5.c.g(1, (ArrayList) eVar.h);
        if (f1Var.c != null || f1Var.f != null) {
            eVar.b--;
        }
        while (true) {
            int i7 = eVar.a;
            obj = f1Var.c;
            if (i7 <= ((obj == null && f1Var.f == null) ? f1Var.b : 0)) {
                break;
            } else {
                eVar.t();
            }
        }
        if (obj != null) {
            e1.d(f1Var, f10);
            eVar.d = f1Var.a;
        } else {
            Bitmap bitmap = f1Var.f;
            if (bitmap != null) {
                r7 r7Var = f1Var.i;
                WidgetClientNative.filterPixels(bitmap, (int[]) r7Var.b, (float[]) r7Var.d, (float[]) r7Var.e, (float[]) r7Var.f, (int[]) r7Var.c, f1Var.h);
                eVar.d = f1Var.a;
                Matrix matrix = new Matrix();
                if (f1Var.g.invert(matrix)) {
                    ((Canvas) eVar.d).save();
                    ((Canvas) eVar.d).concat(matrix);
                    ((Canvas) eVar.d).drawBitmap(f1Var.f, f1Var.d, f1Var.e, this.c);
                    ((Canvas) eVar.d).restore();
                }
            }
        }
        eVar.a = f1Var.b;
    }

    public final void l(b3.j jVar, Path path) {
        int i7;
        int i10;
        int i11;
        path.rewind();
        int e10 = jVar.e(TLObject.FLAG_20, 0);
        int e11 = jVar.e(6291456, 1);
        int i12 = jVar.b;
        long j3 = (e10 + 3) / 4;
        long j10 = 4 * j3;
        j jVar2 = (j) jVar.c;
        if (j10 > jVar2.d - i12) {
            throw j.a();
        }
        jVar.b = (((int) j3) * 4) + i12;
        float[] fArr = this.u;
        int i13 = 2;
        if (fArr.length < e11) {
            this.u = new float[Math.max(e11, fArr.length * 2)];
        }
        jVar.k(e11, this.u);
        int i14 = 0;
        int i15 = 0;
        while (i14 < e10) {
            int i16 = jVar2.a.get(i12 + i14) & 255;
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
        path.setFillType(jVar.o() != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
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

    public final boolean p(long j3) {
        if (j3 <= 0) {
            return false;
        }
        long j10 = j3 * 4;
        long j11 = this.z;
        long j12 = this.y;
        if (j10 > j11 - j12) {
            return false;
        }
        this.y = j12 + j10;
        return true;
    }

    public final boolean q(cc.e eVar, RectF rectF, float f10) {
        Matrix matrix = (Matrix) eVar.f;
        Matrix matrix2 = this.C;
        if (!matrix.invert(matrix2)) {
            return false;
        }
        RectF rectF2 = this.A;
        RectF rectF3 = this.B;
        matrix2.mapRect(rectF3, rectF2);
        float f11 = (-f10) - 1.0f;
        rectF3.inset(f11, f11);
        return rectF.intersect(rectF3);
    }
}
