// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class te8 {
    public static Paint B;
    public static final RectF C = new RectF();
    public int A;
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Path j;
    public final Matrix k;
    public final RectF l;
    public final RectF m;
    public final Rect n;
    public final ArrayList o;
    public final ArrayList p;
    public final RectF q;
    public final RectF r;
    public final RectF s;
    public se8 t;
    public boolean u;
    public float v;
    public float w;
    public qe8 x;
    public BitmapShader y;
    public int z;

    public te8() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.c = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.d = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.e = textPaint5;
        this.f = new Paint(3);
        Paint paint = new Paint();
        this.g = paint;
        this.h = new Paint(1);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        this.j = new Path();
        this.k = new Matrix();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Rect();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        textPaint.setTextSize(hl.L(10.5f));
        textPaint.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(15.0f));
        textPaint3.setTextSize(hl.L(22.0f));
        textPaint4.setTextSize(hl.L(16.0f));
        textPaint4.setTypeface(hl.o());
        textPaint5.setTextSize(hl.L(12.0f));
        textPaint5.setColor(-16777216);
        paint.setFilterBitmap(false);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        RectF rectF = C;
        rectF.set(f, f2, f3 + f, f4 + f2);
        canvas.drawRoundRect(rectF, f5, f5, B);
    }

    public final void a(Bitmap bitmap, float f, float f2, float f3, float f4) {
        re8 re8Var = new re8();
        re8Var.a = bitmap;
        re8Var.b.set(f, f2, f3 + f, f4 + f2);
        this.p.add(re8Var);
    }

    public final se8 b(float f, float f2, int i, Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence) || i <= 0) {
            return null;
        }
        CharSequence ellipsize = TextUtils.ellipsize(charSequence.toString().replace('\n', ' '), textPaint, i, TextUtils.TruncateAt.END);
        int min = z ? Math.min(i, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length()))) : i;
        se8 se8Var = new se8();
        se8Var.a = new StaticLayout(ellipsize, textPaint, Math.max(1, min), alignment, 1.0f, 0.0f, false);
        se8Var.b = f;
        se8Var.c = f2;
        this.o.add(se8Var);
        return se8Var;
    }

    public final float d(pe8[] pe8VarArr, float f, int i, int i2, float f2, float f3) {
        TextPaint textPaint;
        float f4;
        TextPaint textPaint2;
        te8 te8Var = this;
        int min = Math.min(pe8VarArr.length, 4);
        if (min == 0) {
            return f;
        }
        int L = hl.L(10.0f);
        float[] fArr = new float[min];
        int i3 = 0;
        float f5 = 0.0f;
        while (true) {
            textPaint = te8Var.b;
            f4 = f5;
            textPaint2 = te8Var.a;
            if (i3 >= min) {
                break;
            }
            pe8 pe8Var = pe8VarArr[i3];
            String str = (String) pe8Var.b;
            float measureText = str != null ? textPaint2.measureText(str) : 0.0f;
            float ceil = (float) Math.ceil(Math.max(measureText, ((String) pe8Var.c) != null ? textPaint.measureText(r7) : 0.0f));
            fArr[i3] = ceil;
            f5 = ceil + f4;
            i3++;
        }
        int i4 = min - 1;
        float f6 = i2 - (L * i4);
        float f7 = L;
        byte b = 1;
        if (f4 > f6) {
            float f8 = f6 / f4;
            for (int i5 = 0; i5 < min; i5++) {
                fArr[i5] = (float) Math.floor(fArr[i5] * f8);
            }
        } else if (min > 1) {
            f7 += (f6 - f4) / i4;
        }
        float f9 = f7;
        float f10 = i;
        int i6 = 0;
        while (i6 < min) {
            pe8 pe8Var2 = pe8VarArr[i6];
            int i7 = (int) fArr[i6];
            if (min == b) {
                i7 = i2;
            }
            byte b2 = pe8Var2.a;
            Layout.Alignment alignment = b2 == b ? Layout.Alignment.ALIGN_NORMAL : b2 == 3 ? Layout.Alignment.ALIGN_OPPOSITE : b2 == 2 ? Layout.Alignment.ALIGN_CENTER : (min <= b || i6 != i4) ? (min <= 2 || i6 <= 0) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE;
            te8Var.b(f10, f, i7, alignment, textPaint2, (String) pe8Var2.b, false);
            b(f10, f + f2, i7, alignment, textPaint, (String) pe8Var2.c, false);
            f10 += fArr[i6] + f9;
            i6++;
            te8Var = this;
            textPaint2 = textPaint2;
            b = 1;
        }
        return f + f2 + f3 + hl.L(12.0f);
    }

    public final int e(qe8 qe8Var, int i) {
        BitmapShader bitmapShader;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float max;
        float f9;
        float f10;
        float f11;
        int i2;
        int i3;
        te8 te8Var;
        float f12;
        float f13;
        float f14;
        float L;
        float f15;
        float L2;
        float min;
        float f16;
        float f17;
        float f18;
        boolean z;
        int i4;
        float f19;
        float f20;
        int i5;
        if (this.x == qe8Var && this.z == i) {
            return this.A;
        }
        this.x = qe8Var;
        this.z = i;
        if (qe8Var.n != null) {
            Bitmap bitmap = qe8Var.n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            bitmapShader = null;
        }
        this.y = bitmapShader;
        ArrayList arrayList = this.o;
        arrayList.clear();
        this.p.clear();
        this.t = null;
        this.u = false;
        RectF rectF = this.s;
        rectF.setEmpty();
        RectF rectF2 = this.q;
        rectF2.setEmpty();
        int L3 = hl.L(12.0f);
        int i6 = this.z;
        int i7 = i6 - (L3 << 1);
        float f21 = L3;
        float f22 = i6 - L3;
        TextPaint textPaint = this.a;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f23 = fontMetrics.descent - fontMetrics.ascent;
        TextPaint textPaint2 = this.b;
        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        float f24 = fontMetrics2.descent - fontMetrics2.ascent;
        pe8[] pe8VarArr = this.x.f;
        float L4 = hl.L(28.0f);
        if (this.x.k != null) {
            f = 12.0f;
            float width = r7.getWidth() / this.x.k.getHeight();
            f4 = L4 * width;
            f2 = 0.0f;
            float f25 = i7 * 0.5f;
            if (f4 > f25) {
                f4 = f25;
                f3 = f25 / width;
            } else {
                f3 = L4;
            }
        } else {
            f = 12.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        String str = this.x.e;
        TextPaint textPaint3 = this.d;
        if (str != null) {
            if (f4 > f2) {
                f5 = f22;
                i5 = hl.L(8.0f);
            } else {
                f5 = f22;
                i5 = 0;
            }
            f6 = textPaint3.measureText(this.x.e) + i5;
        } else {
            f5 = f22;
            f6 = f2;
        }
        float f26 = f6 + f4;
        TextPaint textPaint4 = textPaint3;
        int min2 = Math.min(2, pe8VarArr.length);
        if (min2 == 0) {
            f7 = f21;
            f8 = L4;
            max = f2;
        } else {
            float f27 = i7;
            f7 = f21;
            f8 = L4;
            max = Math.max(f27 / 4.0f, ((f27 - Math.min(f26, f27 * 0.5f)) - (hl.L(f) * min2)) / min2);
        }
        int length = pe8VarArr.length - 1;
        float f28 = f2;
        while (length >= 0 && length >= pe8VarArr.length - 2) {
            pe8 pe8Var = pe8VarArr[length];
            int i8 = (int) max;
            float f29 = max;
            String str2 = (String) pe8Var.b;
            float measureText = str2 != null ? textPaint.measureText(str2) : f2;
            int i9 = length;
            TextPaint textPaint5 = textPaint2;
            float min3 = Math.min(i8, (float) Math.ceil(Math.max(measureText, ((String) pe8Var.c) != null ? textPaint2.measureText(r1) : f2)));
            float f30 = f5 - min3;
            String str3 = (String) pe8Var.b;
            int i10 = (int) min3;
            pe8[] pe8VarArr2 = pe8VarArr;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
            float f31 = f7;
            b(f30, f31, i10, alignment, textPaint, str3, false);
            b(f30, f31 + f23, i10, alignment, textPaint5, (String) pe8Var.c, false);
            f28 = Math.max(f28, f23 + f24);
            f5 = f30 - hl.L(f);
            length = i9 - 1;
            textPaint2 = textPaint5;
            f4 = f4;
            pe8VarArr = pe8VarArr2;
            L3 = L3;
            max = f29;
            textPaint4 = textPaint4;
            f3 = f3;
            f7 = f31;
            textPaint = textPaint;
        }
        TextPaint textPaint6 = textPaint;
        float f32 = f3;
        TextPaint textPaint7 = textPaint4;
        float f33 = f7;
        float f34 = f28;
        float f35 = f4;
        int i11 = L3;
        float f36 = f8;
        if (this.x.k != null) {
            float f37 = f35 / f32;
            float max2 = Math.max(hl.L(40.0f), f5 - f33);
            if (f35 > max2) {
                f20 = max2 / f37;
                f19 = max2;
            } else {
                f19 = f35;
                f20 = f32;
            }
            a(this.x.k, f33, ((Math.max(f34, f36) - f20) / 2.0f) + f33, f19, f20);
            f9 = f33;
            f10 = Math.max(f34, f20);
            f11 = f19 + hl.L(8.0f) + f9;
        } else {
            f9 = f33;
            f10 = f34;
            f11 = f9;
        }
        if (this.x.e != null) {
            Paint.FontMetrics fontMetrics3 = textPaint7.getFontMetrics();
            float f38 = fontMetrics3.descent - fontMetrics3.ascent;
            float max3 = Math.max(f10, f38);
            b(f11, bp1.z(max3, f38, 2.0f, f9), (int) (f5 - f11), Layout.Alignment.ALIGN_NORMAL, textPaint7, this.x.e, true);
            f10 = max3;
        }
        float L5 = f10 + hl.L(f) + f9;
        qe8 qe8Var2 = this.x;
        pe8[] pe8VarArr3 = qe8Var2.g;
        boolean z2 = qe8Var2.l != null && ((i4 = qe8Var2.a) == 2 || i4 == 3 || i4 == 4);
        boolean z3 = !z2 && qe8Var2.a == 1 && pe8VarArr3.length >= 2;
        float L6 = z3 ? (i7 - hl.L(48.0f)) / 2.0f : i7;
        if (!z2 && !z3 && this.x.m != null) {
            L6 -= hl.L(74.0f);
        }
        int i12 = z3 ? 2 : 1;
        float L7 = hl.L(22.0f);
        float L8 = hl.L(15.0f);
        float f39 = L6;
        TextPaint textPaint8 = this.c;
        textPaint8.setTextSize(L7);
        int i13 = 0;
        boolean z4 = z3;
        while (i13 < Math.min(i12, pe8VarArr3.length)) {
            String str4 = (String) pe8VarArr3[i13].c;
            if (str4 != null) {
                if (textPaint8.measureText(str4) > f39) {
                    z = z2;
                    L7 = Math.min(L7, Math.max(L8, (float) Math.floor((L7 * f39) / r1)));
                    i13++;
                    z2 = z;
                }
            }
            z = z2;
            i13++;
            z2 = z;
        }
        boolean z5 = z2;
        textPaint8.setTextSize(L7);
        Paint.FontMetrics fontMetrics4 = textPaint6.getFontMetrics();
        float f40 = fontMetrics4.descent - fontMetrics4.ascent;
        Paint.FontMetrics fontMetrics5 = textPaint8.getFontMetrics();
        float f41 = fontMetrics5.descent - fontMetrics5.ascent;
        if (z5) {
            float min4 = Math.min(this.z * (this.x.l.getHeight() / this.x.l.getWidth()), hl.L(150.0f));
            rectF.set(f2, L5, this.z, L5 + min4);
            float max4 = Math.max(hl.L(8.0f), ((min4 - f40) - f41) - hl.L(10.0f)) + L5;
            if (pe8VarArr3.length > 0) {
                pe8 pe8Var2 = pe8VarArr3[0];
                String str5 = (String) pe8Var2.b;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                f18 = f9;
                i3 = 3;
                b(f18, max4, i7, alignment2, textPaint6, str5, false);
                b(f18, max4 + f40, i7, alignment2, textPaint8, (String) pe8Var2.c, false);
                i2 = i7;
            } else {
                f18 = f9;
                i2 = i7;
                i3 = 3;
            }
            te8Var = this;
            f13 = min4 + hl.L(10.0f) + L5;
            f12 = f18;
        } else {
            float f42 = f9;
            i2 = i7;
            i3 = 3;
            if (z4) {
                int D = ik8.D(48.0f, i2, 2);
                pe8 pe8Var3 = pe8VarArr3[0];
                pe8 pe8Var4 = pe8VarArr3[1];
                String str6 = (String) pe8Var3.b;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                b(f42, L5, D, alignment3, textPaint6, str6, false);
                String str7 = (String) pe8Var3.c;
                float f43 = L5 + f40;
                te8Var = this;
                te8Var.b(f42, f43, D, alignment3, textPaint8, str7, false);
                f12 = f42;
                String str8 = (String) pe8Var4.b;
                float f44 = (te8Var.z - i11) - D;
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_OPPOSITE;
                te8Var.b(f44, L5, D, alignment4, textPaint6, str8, false);
                te8Var.b((te8Var.z - i11) - D, f43, D, alignment4, textPaint8, (String) pe8Var4.c, false);
                te8Var.u = true;
                te8Var.v = te8Var.z / 2.0f;
                te8Var.w = (f41 / 2.0f) + f43;
                L = f40 + f41 + hl.L(f) + L5;
            } else {
                te8Var = this;
                f12 = f42;
                if (pe8VarArr3.length > 0) {
                    float f45 = i2;
                    float f46 = f40 + f41;
                    if (te8Var.x.m != null) {
                        float width2 = r1.getWidth() / te8Var.x.m.getHeight();
                        float min5 = Math.min(hl.L(64.0f), hl.L(64.0f) * width2);
                        float f47 = min5 / width2;
                        te8Var.a(te8Var.x.m, (te8Var.z - i11) - min5, L5, min5, f47);
                        f14 = L5;
                        f45 -= min5 + hl.L(10.0f);
                        f46 = Math.max(f46, f47);
                    } else {
                        f14 = L5;
                    }
                    pe8 pe8Var5 = pe8VarArr3[0];
                    String str9 = (String) pe8Var5.b;
                    int i14 = (int) f45;
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    b(f12, f14, i14, alignment5, textPaint6, str9, false);
                    float f48 = f14;
                    String str10 = (String) pe8Var5.c;
                    te8Var = this;
                    te8Var.b(f12, f48 + f40, i14, alignment5, textPaint8, str10, false);
                    f12 = f12;
                    L = f46 + hl.L(f) + f48;
                } else {
                    f13 = L5;
                }
            }
            f13 = L;
        }
        int i15 = i2;
        float d = te8Var.d(te8Var.x.i, te8Var.d(te8Var.x.h, f13, i11, i15, f23, f24), i11, i15, f23, f24);
        if (te8Var.x.o != null) {
            float height = r2.getHeight() / te8Var.x.o.getWidth();
            float min6 = Math.min(Math.min(i2, hl.L(286.0f)) * height, hl.L(24.0f));
            float f49 = min6 / height;
            te8Var.a(te8Var.x.o, (te8Var.z - f49) / 2.0f, d, f49, min6);
            f15 = min6 + hl.L(10.0f) + d;
        } else {
            f15 = d;
        }
        if (te8Var.x.q != null) {
            int L9 = hl.L(8.0f);
            int width3 = te8Var.x.q.getWidth();
            int height2 = te8Var.x.q.getHeight();
            int i16 = te8Var.x.p;
            if (i16 == 1 || i16 == i3) {
                min = Math.min(hl.L(150.0f), i2 * 0.6f);
                f16 = min;
            } else if (i16 == 2) {
                min = Math.min(i2 - (L9 << 1), hl.L(260.0f));
                f16 = Math.min(hl.L(90.0f), (height2 * min) / width3);
            } else {
                min = Math.min(i2 - (L9 << 1), hl.L(260.0f));
                f16 = hl.L(56.0f);
            }
            float f50 = width3;
            float max5 = Math.max(1.0f, (float) Math.floor(min / f50));
            qe8 qe8Var3 = te8Var.x;
            int i17 = qe8Var3.p;
            if (i17 == 4 || i17 == 2) {
                float f51 = f50 * max5;
                if (f51 <= i2 - (L9 << 1)) {
                    min = f51;
                }
            } else {
                f16 = f50 * max5;
                min = f16;
            }
            float f52 = L9 << 1;
            float f53 = min + f52;
            float f54 = f16 + f52;
            boolean isEmpty = TextUtils.isEmpty(qe8Var3.r);
            TextPaint textPaint9 = te8Var.e;
            if (isEmpty) {
                f17 = 0.0f;
            } else {
                Paint.FontMetrics fontMetrics6 = textPaint9.getFontMetrics();
                f17 = hl.L(2.0f) + (fontMetrics6.descent - fontMetrics6.ascent);
                f53 = Math.max(f53, Math.min(i2, textPaint9.measureText(te8Var.x.r) + f52));
            }
            float f55 = f54 + f17;
            float f56 = (te8Var.z - f53) / 2.0f;
            rectF2.set(f56, f15, f56 + f53, f15 + f55);
            float f57 = te8Var.z;
            float f58 = L9;
            float f59 = f15 + f58;
            RectF rectF3 = te8Var.r;
            rectF3.set((f57 - min) / 2.0f, f59, (f57 + min) / 2.0f, f16 + f59);
            if (f17 > 0.0f) {
                se8 b = te8Var.b(f58 + f56, rectF3.bottom + hl.L(2.0f), (int) (f53 - f52), Layout.Alignment.ALIGN_CENTER, textPaint9, te8Var.x.r, false);
                te8Var.t = b;
                arrayList.remove(b);
            }
            L2 = f55 + f12 + f15;
        } else {
            L2 = f15 + (i11 - hl.L(f));
        }
        int ceil = (int) Math.ceil(L2);
        te8Var.A = ceil;
        return ceil;
    }
}
