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
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class a0 {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final float[] k;
    public final float[] l;
    public final Matrix m;
    public final HashMap n;
    public final IdentityHashMap o;
    public final float[] p;

    public a0() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new float[8];
        this.l = new float[8];
        this.m = new Matrix();
        this.n = new HashMap();
        this.o = new IdentityHashMap();
        this.p = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i10, float... fArr2) {
        int i11 = 0;
        while (i11 < i10) {
            float f7 = i11 < fArr2.length ? fArr2[i11] : 0.0f;
            if (jSONArray != null && i11 < jSONArray.length()) {
                f7 = (float) jSONArray.optDouble(i11, f7);
            }
            fArr[i11] = f7;
            i11++;
        }
    }

    public static void e(Paint paint, JSONObject jSONObject, float f7, float f10) {
        paint.setStrokeWidth(f7);
        int optInt = jSONObject.optInt("lc");
        int optInt2 = jSONObject.optInt("lj");
        paint.setStrokeCap(optInt == 1 ? Paint.Cap.ROUND : optInt == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
        paint.setStrokeJoin(optInt2 == 1 ? Paint.Join.ROUND : optInt2 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
        paint.setStrokeMiter((float) jSONObject.optDouble("ml", f10));
        JSONArray optJSONArray = jSONObject.optJSONArray("d");
        paint.setPathEffect(null);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        int length = optJSONArray.length();
        int i10 = length % 2 == 1 ? length * 2 : length;
        float[] fArr = new float[i10];
        float f11 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float max = Math.max(0.0f, (float) optJSONArray.optDouble(i11 % length));
            fArr[i11] = max;
            f11 += max;
        }
        if (f11 > 0.0f) {
            paint.setPathEffect(new DashPathEffect(fArr, (float) jSONObject.optDouble("do")));
        }
    }

    public static void j(JSONObject jSONObject, Path path) {
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("o");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("v");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray2 == null ? 0 : optJSONArray2.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < optJSONArray.length()) {
            int optInt = optJSONArray.optInt(i11);
            int i12 = i10 + (optInt == 3 ? 6 : optInt == 2 ? 4 : optInt == 4 ? 0 : 2);
            if (i12 > length) {
                break;
            }
            if (optInt == 0) {
                path.moveTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
            } else if (optInt == 1) {
                path.lineTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
            } else if (optInt == 2) {
                path.quadTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3));
            } else if (optInt == 3) {
                path.cubicTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3), (float) optJSONArray2.optDouble(i10 + 4), (float) optJSONArray2.optDouble(i10 + 5));
            } else if (optInt == 4) {
                path.close();
            }
            i11++;
            i10 = i12;
        }
        path.setFillType(jSONObject.optInt("e") != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public static RectF k(JSONObject jSONObject, String str, RectF rectF) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            rectF.setEmpty();
            return rectF;
        }
        float optDouble = (float) optJSONArray.optDouble(0);
        float optDouble2 = (float) optJSONArray.optDouble(1);
        rectF.set(optDouble, optDouble2, ((float) optJSONArray.optDouble(2)) + optDouble, ((float) optJSONArray.optDouble(3)) + optDouble2);
        return rectF;
    }

    public static void m(int i10, Paint paint) {
        paint.setShader(null);
        paint.setColor(i10);
    }

    public static int[] n(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = (int) jSONArray.optLong((i10 * 2) + 1);
        }
        if (length == 1) {
            iArr[1] = iArr[0];
        }
        return iArr;
    }

    public static float[] o(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        if (length == 1) {
            return new float[]{0.0f, 1.0f};
        }
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i10 * 2)));
        }
        return fArr;
    }

    public static float p(JSONArray jSONArray) {
        if (jSONArray.length() < 8) {
            return -1.0f;
        }
        double optDouble = jSONArray.optDouble(0);
        for (int i10 = 1; i10 < 8; i10++) {
            if (jSONArray.optDouble(i10) != optDouble) {
                return -1.0f;
            }
        }
        return (float) optDouble;
    }

    public final void a(Path path, JSONObject jSONObject, RectF rectF, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.k;
            if (i10 >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i10] = Math.max(((float) optJSONArray.optDouble(i10)) + f7, 0.0f);
                i10++;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(k(jSONObject, "l", this.i));
        }
    }

    public final void c(Canvas canvas, JSONObject jSONObject, Paint paint) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        float p5 = optJSONArray == null ? 0.0f : p(optJSONArray);
        RectF rectF = this.h;
        if (p5 == 0.0f) {
            canvas.drawRect(k(jSONObject, "r", rectF), paint);
        } else {
            if (p5 > 0.0f) {
                canvas.drawRoundRect(k(jSONObject, "r", rectF), p5, p5, paint);
                return;
            }
            Path path = this.e;
            l(jSONObject, "r", path);
            canvas.drawPath(path, paint);
        }
    }

    public final void f(Canvas canvas, JSONArray jSONArray, int i10, z zVar, float f7, boolean z10) {
        int i11;
        ArrayList arrayList;
        cc.f fVar;
        Matrix matrix;
        ArrayList arrayList2;
        a0 a0Var;
        Paint paint;
        cc.f fVar2;
        String str;
        Matrix matrix2;
        cc.f fVar3;
        cc.f fVar4;
        int i12;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        boolean z11;
        int i13;
        float[] fArr;
        RectF rectF;
        a0 a0Var2 = this;
        cc.f fVar5 = new cc.f(canvas);
        ArrayList arrayList3 = (ArrayList) fVar5.e;
        Matrix matrix3 = (Matrix) fVar5.d;
        ArrayList arrayList4 = (ArrayList) fVar5.f;
        int i14 = 0;
        while (i14 < i10) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i14);
            if (optJSONObject == null) {
                fVar = fVar5;
                i11 = i14;
                arrayList = arrayList3;
                matrix = matrix3;
                arrayList2 = arrayList4;
            } else {
                Canvas canvas2 = (Canvas) fVar5.c;
                int optInt = optJSONObject.optInt("k");
                cc.f fVar6 = fVar5;
                float[] fArr2 = a0Var2.p;
                i11 = i14;
                float[] fArr3 = a0Var2.l;
                Paint paint2 = a0Var2.b;
                Path path = a0Var2.f;
                RectF rectF2 = a0Var2.j;
                Paint paint3 = a0Var2.a;
                RectF rectF3 = a0Var2.h;
                switch (optInt) {
                    case 0:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        boolean has = optJSONObject.has("l");
                        if (has) {
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                        }
                        m((int) optJSONObject.optLong("c"), paint3);
                        a0Var.c(canvas2, optJSONObject, paint3);
                        if (!has) {
                            break;
                        } else {
                            canvas2.restore();
                            break;
                        }
                    case 1:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth((float) optJSONObject.optDouble("w", 1.0d));
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        a0Var.c(canvas2, optJSONObject, paint2);
                        break;
                    case 2:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        m((int) optJSONObject.optLong("c"), paint3);
                        canvas2.drawOval(k(optJSONObject, "r", rectF3), paint3);
                        break;
                    case 3:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f12 = optDouble / 2.0f;
                        k(optJSONObject, "r", rectF3).inset(f12, f12);
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth(optDouble);
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        canvas2.drawOval(rectF3, paint2);
                        break;
                    case 4:
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        Paint deviceFont = zVar.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont == null) {
                            paint = null;
                        } else {
                            IdentityHashMap identityHashMap = a0Var.o;
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
                            paint.setColor((int) optJSONObject.optLong("c"));
                            paint.setShader(null);
                            canvas2.save();
                            float f13 = 1.0f / f7;
                            canvas2.scale(f13, f13);
                            canvas2.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f7, ((float) optJSONObject.optDouble("y")) * f7, paint);
                            canvas2.restore();
                        }
                        arrayList = arrayList3;
                        break;
                    case 5:
                        fVar2 = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        Bitmap canvas3 = optJSONObject.has("cv") ? zVar.canvas(optJSONObject.optInt("cv")) : zVar.image(optJSONObject.optInt("i"));
                        if (canvas3 != null) {
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                            if (optJSONObject.has("q")) {
                                str = "l";
                                a0Var.l(optJSONObject, optJSONObject.has(str) ? "l" : "r", path);
                                canvas2.clipPath(path);
                            }
                            canvas2.drawBitmap(canvas3, (Rect) null, k(optJSONObject, "r", rectF3), a0Var.c);
                            canvas2.restore();
                        }
                        arrayList = arrayList3;
                        fVar = fVar2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix4 = matrix3;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            fVar2 = fVar6;
                            matrix = matrix4;
                        } else {
                            int[] n10 = n(optJSONArray);
                            float[] o10 = o(optJSONArray);
                            fVar2 = fVar6;
                            matrix = matrix4;
                            d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f14 = fArr3[0];
                            float f15 = fArr3[1];
                            float f16 = fArr3[2];
                            float f17 = fArr3[3];
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                            a0Var.l(optJSONObject, "r", path);
                            canvas2.clipPath(path);
                            paint3.setColor(-16777216);
                            if (optInt != 6 || n10.length <= 16) {
                                if (optInt == 6) {
                                    paint3.setShader(new LinearGradient(f14, f15, f16, f17, n10, o10, Shader.TileMode.CLAMP));
                                } else if (optInt == 7) {
                                    float max = Math.max(f16, 0.01f);
                                    float max2 = Math.max(f17, 0.01f);
                                    paint3.setShader(new RadialGradient(f14, f15, max, n10, o10, Shader.TileMode.CLAMP));
                                    canvas2.translate(f14, f15);
                                    canvas2.scale(1.0f, max2 / max);
                                    canvas2.translate(-f14, -f15);
                                } else {
                                    paint3.setShader(new SweepGradient(f14, f15, n10, o10));
                                    canvas2.rotate(f16 - 90.0f, f14, f15);
                                }
                                k(optJSONObject, "r", rectF3);
                                canvas2.drawRect(rectF3.left - 4000.0f, rectF3.top - 4000.0f, rectF3.right + 4000.0f, rectF3.bottom + 4000.0f, paint3);
                                paint3.setShader(null);
                                canvas2.restore();
                            } else {
                                double d = f16 - f14;
                                double d10 = f17 - f15;
                                float hypot = (float) Math.hypot(d, d10);
                                if (hypot > 0.0f) {
                                    canvas2.translate(f14, f15);
                                    canvas2.rotate((float) Math.toDegrees(Math.atan2(d10, d)));
                                    int length = o10.length - 1;
                                    int i15 = n10[0];
                                    paint3.setShader(null);
                                    paint3.setColor(i15);
                                    canvas2.drawRect(-8000.0f, -8000.0f, o10[0] * hypot, 8000.0f, paint3);
                                    Paint paint4 = paint3;
                                    int i16 = 0;
                                    while (i16 < length) {
                                        float f18 = o10[i16] * hypot;
                                        int i17 = i16 + 1;
                                        float f19 = o10[i17] * hypot;
                                        if (f19 > f18) {
                                            int i18 = n10[i16];
                                            if (i18 == n10[i17]) {
                                                paint4.setShader(null);
                                                paint4.setColor(i18);
                                            } else {
                                                paint4.setColor(-16777216);
                                                paint4.setShader(new LinearGradient(f18, 0.0f, f19, 0.0f, n10[i16], n10[i17], Shader.TileMode.CLAMP));
                                            }
                                            Paint paint5 = paint4;
                                            canvas2.drawRect(f18, -8000.0f, f19, 8000.0f, paint5);
                                            paint4 = paint5;
                                        }
                                        i16 = i17;
                                    }
                                    int i19 = n10[length];
                                    paint4.setShader(null);
                                    paint4.setColor(i19);
                                    Paint paint6 = paint4;
                                    canvas2.drawRect(o10[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint6);
                                    paint6.setShader(null);
                                }
                                canvas2.restore();
                            }
                        }
                        arrayList = arrayList3;
                        fVar = fVar2;
                        break;
                    case 9:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        canvas2.save();
                        arrayList3.add(new Matrix(matrix2));
                        fVar3.b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            j(optJSONObject2, path);
                        } else {
                            a0Var.l(optJSONObject, "r", path);
                        }
                        canvas2.clipPath(path);
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 10:
                    case 13:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        if (fVar3.b > 0) {
                            fVar3.b();
                        }
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 11:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            Path path2 = a0Var.e;
                            j(optJSONObject3, path2);
                            Shader h = a0Var.h(optJSONObject3, "g", "ga", "s");
                            if (h != null) {
                                paint3.setColor(-16777216);
                                paint3.setShader(h);
                                canvas2.drawPath(path2, paint3);
                                paint3.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                m((int) optJSONObject3.optLong("f"), paint3);
                                canvas2.drawPath(path2, paint3);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            Shader h10 = optDouble2 > 0.0f ? a0Var.h(optJSONObject3, "sg", "sga", "ss") : null;
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || h10 != null) && optDouble2 > 0.0f)) {
                                paint2.setColor(h10 != null ? -16777216 : (int) optJSONObject3.optLong("sc"));
                                paint2.setShader(h10);
                                e(paint2, optJSONObject3, optDouble2, 4.0f);
                                canvas2.drawPath(path2, paint2);
                                paint2.setPathEffect(null);
                                paint2.setShader(null);
                            }
                        }
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 12:
                        Matrix matrix5 = matrix3;
                        a0Var = a0Var2;
                        ArrayList arrayList5 = arrayList3;
                        arrayList2 = arrayList4;
                        float optDouble3 = (float) optJSONObject.optDouble("o", 1.0d);
                        boolean z12 = optJSONObject.optInt("h") != 0;
                        d(optJSONObject.optJSONArray("m"), fArr3, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                        fArr2[0] = fArr3[0];
                        fArr2[1] = fArr3[2];
                        fArr2[2] = fArr3[4];
                        fArr2[3] = fArr3[1];
                        fArr2[4] = fArr3[3];
                        fArr2[5] = fArr3[5];
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                        fArr2[8] = 1.0f;
                        Matrix matrix6 = a0Var.m;
                        matrix6.setValues(fArr2);
                        if (optDouble3 >= 1.0f || z12) {
                            canvas2.save();
                        } else {
                            int round = Math.round(Math.max(0.0f, Math.min(1.0f, optDouble3)) * 255.0f);
                            k(optJSONObject, "r", rectF2);
                            if (rectF2.isEmpty()) {
                                canvas2.saveLayerAlpha(null, round);
                            } else {
                                matrix6.mapRect(rectF3, rectF2);
                                rectF3.inset(-1.0f, -1.0f);
                                canvas2.saveLayerAlpha(rectF3, round);
                            }
                        }
                        arrayList5.add(new Matrix(matrix5));
                        fVar6.b++;
                        canvas2.concat(matrix6);
                        matrix5.preConcat(matrix6);
                        if (!z12) {
                            matrix = matrix5;
                            arrayList = arrayList5;
                            fVar = fVar6;
                            break;
                        } else {
                            canvas2.clipRect(0, 0, 0, 0);
                            matrix = matrix5;
                            arrayList = arrayList5;
                            fVar = fVar6;
                            break;
                        }
                    case 14:
                        arrayList2 = arrayList4;
                        d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f20 = fArr3[0];
                        float f21 = fArr3[1];
                        float max3 = Math.max(fArr3[2], 0.0f);
                        float f22 = fArr3[3];
                        arrayList = arrayList3;
                        matrix = matrix3;
                        int optLong = (int) optJSONObject.optLong("c");
                        k(optJSONObject, "r", rectF2);
                        if (rectF2.isEmpty() || (optLong >>> 24) == 0 || ((i12 = Build.VERSION.SDK_INT) < 28 && (max3 / 2.0f) * f7 > 0.5f)) {
                            a0Var = this;
                            fVar4 = fVar6;
                        } else {
                            boolean z13 = optJSONObject.optInt("n") != 0;
                            a0Var = this;
                            Paint paint7 = a0Var.d;
                            paint7.setColor(optLong);
                            float f23 = (max3 / 2.0f) * f7;
                            if (f23 > 0.5f) {
                                float f24 = ((f23 - 0.5f) / 0.57735f) / f7;
                                f11 = max3;
                                Float valueOf = Float.valueOf(f24);
                                fVar4 = fVar6;
                                HashMap hashMap = a0Var.n;
                                blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                                if (blurMaskFilter == null) {
                                    f10 = f20;
                                    if (hashMap.size() >= 32) {
                                        hashMap.clear();
                                    }
                                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f24, BlurMaskFilter.Blur.NORMAL);
                                    hashMap.put(Float.valueOf(f24), blurMaskFilter2);
                                    blurMaskFilter = blurMaskFilter2;
                                } else {
                                    f10 = f20;
                                }
                            } else {
                                f10 = f20;
                                f11 = max3;
                                fVar4 = fVar6;
                                blurMaskFilter = null;
                            }
                            paint7.setMaskFilter(blurMaskFilter);
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("q");
                            float p5 = optJSONArray2 == null ? 0.0f : p(optJSONArray2);
                            if (z13 || p5 < 0.0f) {
                                Path path3 = a0Var.g;
                                path3.rewind();
                                if (z13) {
                                    float abs = Math.abs(f21) + Math.abs(f10) + Math.abs(f22) + (f11 * 1.5f) + 2.0f;
                                    rectF3.set(rectF2.left - abs, rectF2.top - abs, rectF2.right + abs, rectF2.bottom + abs);
                                    path3.addRect(rectF3, Path.Direction.CW);
                                    rectF3.set(rectF2.left + f22, rectF2.top + f22, rectF2.right - f22, rectF2.bottom - f22);
                                    if (!rectF3.isEmpty()) {
                                        a0Var.a(path3, optJSONObject, rectF3, -f22);
                                    }
                                    path3.setFillType(Path.FillType.EVEN_ODD);
                                } else {
                                    rectF3.set(rectF2.left - f22, rectF2.top - f22, rectF2.right + f22, rectF2.bottom + f22);
                                    if (!optJSONObject.has("q")) {
                                        f22 = 0.0f;
                                    }
                                    a0Var.a(path3, optJSONObject, rectF3, f22);
                                }
                                path3.offset(f10, f21);
                                canvas2.save();
                                a0Var.l(optJSONObject, "r", path);
                                if (z13) {
                                    canvas2.clipPath(path);
                                } else if (i12 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                                canvas2.drawPath(path3, paint7);
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            } else {
                                float f25 = p5;
                                rectF3.set((rectF2.left - f22) + f10, (rectF2.top - f22) + f21, rectF2.right + f22 + f10, rectF2.bottom + f22 + f21);
                                float max4 = optJSONArray2 != null ? Math.max(f25 + f22, 0.0f) : 0.0f;
                                canvas2.save();
                                if (p5 != 0.0f) {
                                    a0Var.l(optJSONObject, "r", path);
                                    if (i12 >= 26) {
                                        canvas2.clipOutPath(path);
                                    } else {
                                        canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                    }
                                } else if (i12 >= 26) {
                                    canvas2.clipOutRect(rectF2);
                                } else {
                                    canvas2.clipRect(rectF2, Region.Op.DIFFERENCE);
                                }
                                if (max4 > 0.0f) {
                                    canvas2.drawRoundRect(rectF3, max4, max4, paint7);
                                } else {
                                    canvas2.drawRect(rectF3, paint7);
                                }
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            }
                        }
                        fVar = fVar4;
                        break;
                    case 15:
                        y yVar = new y();
                        yVar.a = (Canvas) fVar6.c;
                        yVar.b = fVar6.b;
                        arrayList4.add(yVar);
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                            k(optJSONObject, "r", rectF2);
                            if (!rectF2.isEmpty()) {
                                arrayList2 = arrayList4;
                                int i20 = 0;
                                float f26 = 0.0f;
                                float f27 = 0.0f;
                                float f28 = 0.0f;
                                float f29 = 0.0f;
                                while (i20 < optJSONArray3.length()) {
                                    JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i20);
                                    if (optJSONArray4 == null) {
                                        i13 = i20;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                    } else {
                                        i13 = i20;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                        float max5 = Math.max(0.0f, (float) optJSONArray4.optDouble(1));
                                        if (optJSONArray4.optInt(0) == 0) {
                                            float f30 = max5 * 3.0f;
                                            f26 += f30;
                                            f27 += f30;
                                            f28 += f30;
                                            f29 += f30;
                                        } else if (optJSONArray4.optInt(0) == 9) {
                                            float optDouble4 = (float) optJSONArray4.optDouble(2);
                                            float optDouble5 = (float) optJSONArray4.optDouble(3);
                                            float f31 = max5 * 1.5f;
                                            float max6 = Math.max(f26, f31 - optDouble4);
                                            float max7 = Math.max(f28, optDouble4 + f31);
                                            float max8 = Math.max(f27, f31 - optDouble5);
                                            f28 = max7;
                                            f29 = Math.max(f29, f31 + optDouble5);
                                            f26 = max6;
                                            f27 = max8;
                                        }
                                    }
                                    i20 = i13 + 1;
                                    fArr2 = fArr;
                                    rectF3 = rectF;
                                }
                                float[] fArr4 = fArr2;
                                RectF rectF4 = rectF3;
                                rectF2.set(rectF2.left - f26, rectF2.top - f27, rectF2.right + f28, rectF2.bottom + f29);
                                if (Build.VERSION.SDK_INT < 31 || !((Canvas) fVar6.c).isHardwareAccelerated()) {
                                    matrix3.getValues(fArr4);
                                    if (fArr4[1] == 0.0f && fArr4[3] == 0.0f) {
                                        Matrix matrix7 = yVar.g;
                                        matrix7.set(matrix3);
                                        matrix7.postScale(f7, f7);
                                        matrix7.mapRect(rectF4, rectF2);
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            if (ceil2 * ceil <= 16777216) {
                                                yVar.f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                yVar.d = floor;
                                                yVar.e = floor2;
                                                yVar.h = Math.abs(fArr4[0]) * f7;
                                                yVar.i = optJSONArray3;
                                                Canvas canvas4 = new Canvas(yVar.f);
                                                canvas4.translate(-floor, -floor2);
                                                canvas4.concat(matrix7);
                                                fVar6.c = canvas4;
                                                z11 = false;
                                                fVar6.b = 0;
                                                arrayList = arrayList3;
                                                matrix = matrix3;
                                                fVar = fVar6;
                                                a0Var = this;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    arrayList = arrayList3;
                                    matrix = matrix3;
                                    fVar = fVar6;
                                    a0Var = this;
                                } else {
                                    Canvas b10 = x.b(yVar, rectF2, optJSONArray3, f7);
                                    if (b10 != null) {
                                        fVar6.c = b10;
                                        fVar6.b = 0;
                                        z11 = false;
                                        arrayList = arrayList3;
                                        matrix = matrix3;
                                        fVar = fVar6;
                                        a0Var = this;
                                    }
                                    z11 = false;
                                    arrayList = arrayList3;
                                    matrix = matrix3;
                                    fVar = fVar6;
                                    a0Var = this;
                                }
                                break;
                            }
                        }
                        arrayList2 = arrayList4;
                        z11 = false;
                        arrayList = arrayList3;
                        matrix = matrix3;
                        fVar = fVar6;
                        a0Var = this;
                        break;
                    case 16:
                        if (!arrayList4.isEmpty()) {
                            a0Var2.i(fVar6, f7);
                        }
                        arrayList = arrayList3;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        fVar = fVar6;
                        break;
                    case 17:
                        if (z10 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                            x.a(a0Var2, fVar6, jSONArray, i11, optJSONObject, zVar, f7);
                            fVar = fVar6;
                            arrayList = arrayList3;
                            matrix = matrix3;
                            arrayList2 = arrayList4;
                            a0Var = a0Var2;
                            break;
                        }
                        break;
                    default:
                        arrayList = arrayList3;
                        matrix = matrix3;
                        fVar = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        break;
                }
                i14 = i11 + 1;
                a0Var2 = a0Var;
                fVar5 = fVar;
                arrayList4 = arrayList2;
                arrayList3 = arrayList;
                matrix3 = matrix;
            }
            a0Var = a0Var2;
            i14 = i11 + 1;
            a0Var2 = a0Var;
            fVar5 = fVar;
            arrayList4 = arrayList2;
            arrayList3 = arrayList;
            matrix3 = matrix;
        }
        a0 a0Var3 = a0Var2;
        cc.f fVar7 = fVar5;
        ArrayList arrayList6 = arrayList4;
        while (!arrayList6.isEmpty()) {
            a0Var3.i(fVar7, f7);
        }
        while (fVar7.b > 0) {
            fVar7.b();
        }
    }

    public final void g(Canvas canvas, JSONArray jSONArray, z zVar, float f7) {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            int i10 = 0;
            while (true) {
                if (i10 < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && optJSONObject.optInt("k") == 17) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        int saveLayer = z10 ? canvas.saveLayer(null, null) : -1;
        f(canvas, jSONArray, jSONArray.length(), zVar, f7, true);
        if (z10) {
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Shader h(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (!jSONObject.has(str) || optJSONArray == null || optJSONArray.length() < 4) {
            return null;
        }
        int[] n10 = n(optJSONArray);
        float[] o10 = o(optJSONArray);
        float[] fArr = this.l;
        d(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
        return jSONObject.optInt(str) == 1 ? new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], n10, o10, Shader.TileMode.CLAMP) : new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), n10, o10, Shader.TileMode.CLAMP);
    }

    public final void i(cc.f fVar, float f7) {
        Object obj;
        y yVar = (y) i0.a.v(1, (ArrayList) fVar.f);
        while (true) {
            int i10 = fVar.b;
            obj = yVar.c;
            if (i10 <= ((obj == null && yVar.f == null) ? yVar.b : 0)) {
                break;
            } else {
                fVar.b();
            }
        }
        if (obj != null) {
            x.d(yVar, f7);
            fVar.c = yVar.a;
        } else {
            Bitmap bitmap = yVar.f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, yVar.i.toString().getBytes(StandardCharsets.UTF_8), yVar.h);
                fVar.c = yVar.a;
                Matrix matrix = new Matrix();
                if (yVar.g.invert(matrix)) {
                    ((Canvas) fVar.c).save();
                    ((Canvas) fVar.c).concat(matrix);
                    ((Canvas) fVar.c).drawBitmap(yVar.f, yVar.d, yVar.e, this.c);
                    ((Canvas) fVar.c).restore();
                }
            }
        }
        fVar.b = yVar.b;
    }

    public final void l(JSONObject jSONObject, String str, Path path) {
        RectF rectF = this.h;
        k(jSONObject, str, rectF);
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.k;
            if (i10 >= 8) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            } else {
                fArr[i10] = (float) optJSONArray.optDouble(i10);
                i10++;
            }
        }
    }
}
