package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d {
    public static final PorterDuff.Mode[] r = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public final Paint a = new Paint(3);
    public final Paint b = new Paint();
    public final Paint c;
    public final Path d;
    public final Path e;
    public final Matrix f;
    public final Matrix g;
    public final float[] h;
    public final float[] i;
    public final RectF j;
    public final Rect k;
    public final int l;
    public Bitmap m;
    public Bitmap n;
    public Canvas o;
    public int p;
    public int q;

    public d(int i10) {
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new float[9];
        this.i = new float[8];
        this.j = new RectF();
        this.k = new Rect();
        this.q = -1;
        this.l = i10;
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
            PorterDuff.Mode[] modeArr = r;
            if (i10 < modeArr.length) {
                mode = modeArr[i10];
                paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            }
        }
        mode = null;
        paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public final void a(Paint paint, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("pk");
        JSONArray optJSONArray = jSONObject.optJSONArray("s");
        int length = optJSONArray == null ? 0 : optJSONArray.length() / 2;
        if (optInt == 0 || length == 0) {
            paint.setShader(null);
            paint.setColor((int) jSONObject.optLong("c"));
            return;
        }
        int[] n10 = a0.n(optJSONArray);
        float[] o10 = a0.o(optJSONArray);
        float[] fArr = this.i;
        a0.d(jSONObject.optJSONArray("pa"), fArr, 6, new float[0]);
        paint.setColor(-16777216);
        if (optInt == 1) {
            paint.setShader(new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], n10, o10, Shader.TileMode.CLAMP));
            return;
        }
        if (optInt != 2) {
            SweepGradient sweepGradient = new SweepGradient(fArr[1], fArr[2], n10, o10);
            Matrix matrix = new Matrix();
            matrix.setRotate((float) Math.toDegrees(fArr[0]), fArr[1], fArr[2]);
            sweepGradient.setLocalMatrix(matrix);
            paint.setShader(sweepGradient);
            return;
        }
        float f7 = fArr[2];
        float max = Math.max(fArr[5], 0.01f);
        if (f7 > 0.0f && f7 < max) {
            float[] fArr2 = new float[o10.length];
            for (int i10 = 0; i10 < o10.length; i10++) {
                float f10 = f7 / max;
                fArr2[i10] = c3.i0.z(1.0f, f10, o10[i10], f10);
            }
            o10 = fArr2;
        }
        paint.setShader(new RadialGradient(fArr[3], fArr[4], max, n10, o10, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, JSONObject jSONObject, c cVar) {
        Bitmap image;
        boolean z10;
        int i10;
        Bitmap bitmap;
        float[] fArr = this.i;
        a0.d(jSONObject.optJSONArray("m"), fArr, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        float f7 = fArr[0];
        float[] fArr2 = this.h;
        fArr2[0] = f7;
        fArr2[1] = fArr[2];
        fArr2[2] = fArr[4];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[5];
        fArr2[6] = 0.0f;
        fArr2[7] = 0.0f;
        fArr2[8] = 1.0f;
        Matrix matrix = this.f;
        matrix.setValues(fArr2);
        Paint paint = this.a;
        paint.reset();
        paint.setFlags(3);
        canvas.save();
        int optInt = jSONObject.optInt("k");
        if (optInt == 1 || optInt == 2) {
            Matrix matrix2 = this.g;
            if (matrix.invert(matrix2)) {
                Path path = this.d;
                a0.j(jSONObject, path);
                path.transform(matrix2);
                canvas.concat(matrix);
                a(paint, jSONObject);
                if (jSONObject.optInt("k") == 2) {
                    paint.setStyle(Paint.Style.STROKE);
                    a0.e(paint, jSONObject, (float) jSONObject.optDouble("lw", 1.0d), 10.0f);
                }
                canvas.drawPath(path, paint);
            }
        } else if (optInt == 4) {
            Paint font = cVar.font(jSONObject.optInt("f"));
            if (font != null) {
                a0.d(jSONObject.optJSONArray("tp"), fArr, 4, 0.0f, 0.0f, 1.0f, 0.0f);
                Paint paint2 = new Paint(font);
                canvas.concat(matrix);
                canvas.translate(fArr[0], fArr[1]);
                canvas.scale(fArr[2], 1.0f);
                paint2.setShader(null);
                a(paint2, jSONObject);
                if (jSONObject.optInt("st") != 0) {
                    paint2.setStyle(Paint.Style.STROKE);
                    a0.e(paint2, jSONObject, (float) jSONObject.optDouble("lw", 1.0d), 10.0f);
                }
                canvas.drawText(jSONObject.optString("t"), fArr[3], 0.0f, paint2);
            }
        } else if (optInt == 5) {
            if (jSONObject.has("cv")) {
                int optInt2 = jSONObject.optInt("cv");
                int i11 = this.l;
                image = optInt2 == i11 ? this.m : cVar.canvasBitmap(optInt2);
                if (optInt2 == i11) {
                    z10 = true;
                    if (image != null) {
                        if (z10) {
                            i10 = 0;
                            bitmap = image.copy(Bitmap.Config.ARGB_8888, false);
                        } else {
                            i10 = 0;
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            image = bitmap;
                        }
                        a0.d(jSONObject.optJSONArray("ir"), fArr, 8, new float[i10]);
                        canvas.concat(matrix);
                        paint.setFilterBitmap(jSONObject.optInt("ns") == 0);
                        float f10 = fArr[4];
                        float f11 = fArr[5];
                        float f12 = fArr[6] + f10;
                        float f13 = fArr[7] + f11;
                        RectF rectF = this.j;
                        rectF.set(f10, f11, f12, f13);
                        float f14 = fArr[2];
                        if (f14 < 0.0f) {
                            canvas.drawBitmap(image, (Rect) null, rectF, paint);
                        } else {
                            float f15 = fArr[0];
                            float f16 = fArr[1];
                            int i12 = (int) (f15 + f14);
                            int i13 = (int) (f16 + fArr[3]);
                            Rect rect = this.k;
                            rect.set((int) f15, (int) f16, i12, i13);
                            canvas.drawBitmap(image, rect, rectF, paint);
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                }
            } else {
                image = cVar.image(jSONObject.optInt("i"));
            }
            z10 = false;
            if (image != null) {
            }
        }
        canvas.restore();
    }

    public final void d(JSONObject jSONObject, c cVar) {
        int optInt = jSONObject.optInt("k");
        if (optInt == 0) {
            this.m.eraseColor(0);
            return;
        }
        if (optInt == 6) {
            int optInt2 = jSONObject.optInt("w");
            int optInt3 = jSONObject.optInt("h");
            try {
                byte[] decode = Base64.decode(jSONObject.optString("px"), 0);
                if (optInt2 <= 0 || optInt3 <= 0 || decode.length != optInt2 * optInt3 * 4) {
                    return;
                }
                int optDouble = (int) jSONObject.optDouble("x");
                int optDouble2 = (int) jSONObject.optDouble("y");
                int max = Math.max(0, optDouble);
                int max2 = Math.max(0, optDouble2);
                int min = Math.min(this.m.getWidth(), optDouble + optInt2);
                int min2 = Math.min(this.m.getHeight(), optInt3 + optDouble2);
                if (min <= max || min2 <= max2) {
                    return;
                }
                int i10 = min - max;
                int i11 = min2 - max2;
                int[] iArr = new int[i10 * i11];
                for (int i12 = max2; i12 < min2; i12++) {
                    int i13 = max;
                    while (i13 < min) {
                        int i14 = ((i13 - optDouble) + ((i12 - optDouble2) * optInt2)) * 4;
                        iArr[(i13 - max) + ((i12 - max2) * i10)] = Color.argb(decode[i14 + 3] & 255, decode[i14] & 255, decode[i14 + 1] & 255, decode[i14 + 2] & 255);
                        i13++;
                        optDouble2 = optDouble2;
                        optInt2 = optInt2;
                    }
                }
                this.m.setPixels(iArr, 0, i10, max, max2, i10, i11);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.o.save();
        JSONArray optJSONArray = jSONObject.optJSONArray("cl");
        if (optJSONArray != null) {
            for (int i15 = 0; i15 < optJSONArray.length(); i15++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
                if (optJSONObject != null) {
                    Canvas canvas = this.o;
                    Path path = this.e;
                    a0.j(optJSONObject, path);
                    canvas.clipPath(path);
                }
            }
        }
        if (optInt == 3) {
            Canvas canvas2 = this.o;
            Path path2 = this.d;
            a0.j(jSONObject, path2);
            canvas2.drawPath(path2, this.c);
            this.o.restore();
            return;
        }
        float max3 = Math.max(0.0f, Math.min(1.0f, (float) jSONObject.optDouble("a", 1.0d)));
        int optInt4 = jSONObject.optInt("cm");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sh");
        Paint paint = this.b;
        if (optJSONArray2 != null && jSONObject.has("shc")) {
            Bitmap createBitmap = Bitmap.createBitmap(this.m.getWidth(), this.m.getHeight(), Bitmap.Config.ARGB_8888);
            c(new Canvas(createBitmap), jSONObject, cVar);
            Paint paint2 = new Paint(1);
            float optDouble3 = ((float) optJSONArray2.optDouble(2)) / 2.0f;
            if (optDouble3 > 0.5f) {
                paint2.setMaskFilter(new BlurMaskFilter((optDouble3 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
            }
            Bitmap extractAlpha = createBitmap.extractAlpha(paint2, new int[2]);
            paint.reset();
            paint.setAlpha(Math.round(max3 * 255.0f));
            b(optInt4, paint);
            this.o.saveLayer(null, paint);
            Paint paint3 = new Paint(1);
            paint3.setColor((int) jSONObject.optLong("shc"));
            this.o.drawBitmap(extractAlpha, r9[0] + ((float) optJSONArray2.optDouble(0)), r9[1] + ((float) optJSONArray2.optDouble(1)), paint3);
            this.o.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.o.restore();
            extractAlpha.recycle();
            createBitmap.recycle();
        } else if (max3 < 1.0f || optInt4 != 0) {
            paint.reset();
            paint.setAlpha(Math.round(max3 * 255.0f));
            b(optInt4, paint);
            this.o.saveLayer(null, paint);
            c(this.o, jSONObject, cVar);
            this.o.restore();
        } else {
            c(this.o, jSONObject, cVar);
        }
        this.o.restore();
    }
}
