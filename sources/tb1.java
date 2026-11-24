// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tb1 extends View {
    public Layout.Alignment E;
    public int F;
    public float G;
    public float H;
    public float I;
    public int J;
    public float K;
    public float L;
    public float M;
    public final StaticLayout[] N;
    public final String[] O;
    public final float[] P;
    public long Q;
    public sb1 R;
    public String S;
    public String T;
    public p8c U;
    public p8c V;
    public final sb1[] a;
    public final Paint b;
    public final TextPaint c;
    public sb1 d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public tb1(Context context) {
        super(context);
        this.a = new sb1[]{new sb1(this, -1), new sb1(this, 1)};
        this.b = new Paint(1);
        this.c = new TextPaint(1);
        this.s = 1.0f;
        this.E = Layout.Alignment.ALIGN_CENTER;
        this.F = -1;
        this.N = new StaticLayout[2];
        this.O = new String[2];
        this.P = new float[4];
    }

    public static float c(float f, float f2, float f3) {
        return Utilities.i((f - f2) / (f3 - f2), 1.0f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r9[r8 + 1] == r7.getTextSize()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, int i, String str, sb1 sb1Var, float f, float f2, float f3, float f4, float f5) {
        if (TextUtils.isEmpty(str) || f5 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        int p1 = bkb.p1(f5, this.F);
        TextPaint textPaint = this.c;
        textPaint.setColor(p1);
        float f6 = this.G;
        if (f6 > 0.0f) {
            textPaint.setShadowLayer(f6, this.H, this.I, bkb.p1(f5 * f5, this.J));
        } else {
            textPaint.clearShadowLayer();
        }
        int max = Math.max(1, (int) Math.ceil(f4));
        StaticLayout[] staticLayoutArr = this.N;
        StaticLayout staticLayout = staticLayoutArr[i];
        float[] fArr = this.P;
        String[] strArr = this.O;
        if (staticLayout != null && str.equals(strArr[i])) {
            int i2 = i << 1;
            if (fArr[i2] == max) {
            }
        }
        strArr[i] = str;
        int i3 = i << 1;
        fArr[i3] = max;
        fArr[i3 + 1] = textPaint.getTextSize();
        staticLayoutArr[i] = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, max).setAlignment(this.E).setBreakStrategy(0).setHyphenationFrequency(0).setIncludePad(true).setMaxLines(3).build();
        StaticLayout staticLayout2 = staticLayoutArr[i];
        float N = gl.N(14.0f) / Math.max(1.0f, textPaint.getTextSize());
        float f7 = (-staticLayout2.getWidth()) / 2.0f;
        float f8 = (-staticLayout2.getHeight()) / 2.0f;
        float R1 = gl.R1(this.s, N, f);
        canvas.save();
        canvas.translate(gl.R1(this.e, sb1Var.f.isEmpty() ? this.e : sb1Var.f.centerX(), f), gl.R1(this.f, sb1Var.a(), f));
        canvas.rotate(gl.R1(this.r, 0.0f, f));
        canvas.scale(R1, R1);
        canvas.translate(gl.R1(f2, f7, f), gl.R1(f3, f8, f));
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (sb1 sb1Var : this.a) {
            sb1Var.i = null;
            lm lmVar = sb1Var.e;
            tgb tgbVar = sb1Var.h;
            lmVar.e(true, tgbVar == null ? 0.0f : tgbVar.j() + gl.L(31.0f) + gl.L(31.0f));
        }
        p8c p8cVar = this.V;
        if (p8cVar != null) {
            p8cVar.a(Float.valueOf(1.0f));
        }
        invalidate();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, TextPaint textPaint, int i, float f7, float f8, float f9, Layout.Alignment alignment) {
        boolean z = (this.e == f && this.f == f2 && this.h == f3 && this.n == f4) ? false : true;
        this.e = f;
        this.f = f2;
        this.h = f3;
        this.n = f4;
        this.r = f5;
        this.s = f6;
        this.w = f7;
        this.x = f8;
        this.y = f9;
        if (alignment != null && alignment != this.E) {
            this.E = alignment;
            StaticLayout[] staticLayoutArr = this.N;
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.F = i;
        TextPaint textPaint2 = this.c;
        textPaint2.set(textPaint);
        textPaint2.setTextAlign(Paint.Align.LEFT);
        if (Build.VERSION.SDK_INT >= 29) {
            this.G = textPaint.getShadowLayerRadius();
            this.H = textPaint.getShadowLayerDx();
            this.I = textPaint.getShadowLayerDy();
            this.J = textPaint.getShadowLayerColor();
        } else {
            this.G = 0.0f;
        }
        if (z || this.R != null) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        if (this.R != null) {
            return;
        }
        sb1[] sb1VarArr = this.a;
        sb1VarArr[0].b(charSequence == null ? null : charSequence.toString());
        sb1VarArr[1].b(charSequence2 != null ? charSequence2.toString() : null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float e;
        float f3;
        float f4;
        boolean z2;
        sb1[] sb1VarArr;
        sb1 sb1Var;
        float f5;
        float c;
        Canvas canvas2 = canvas;
        boolean z3 = true;
        boolean z4 = this.R != null;
        float f6 = 1.0f;
        if (z4) {
            float elapsedRealtime = (SystemClock.elapsedRealtime() - this.Q) / 320.0f;
            if (elapsedRealtime >= 1.0f) {
                b();
                f = 1.0f;
                z = false;
            } else {
                float interpolation = s33.h.getInterpolation(elapsedRealtime);
                p8c p8cVar = this.V;
                if (p8cVar != null) {
                    p8cVar.a(Float.valueOf(interpolation));
                }
                invalidate();
                z = z4;
                f = interpolation;
            }
        } else {
            z = z4;
            f = 1.0f;
        }
        sb1[] sb1VarArr2 = this.a;
        int length = sb1VarArr2.length;
        int i = 0;
        while (i < length) {
            sb1 sb1Var2 = sb1VarArr2[i];
            lm lmVar = sb1Var2.d;
            lm lmVar2 = sb1Var2.e;
            Drawable drawable = sb1Var2.b;
            RectF rectF = sb1Var2.f;
            float f7 = f6;
            float d = lmVar.d(sb1Var2.h != null ? z3 : false);
            tgb tgbVar = sb1Var2.h;
            float j = tgbVar == null ? 0.0f : tgbVar.j() + gl.L(31.0f) + gl.L(31.0f);
            if (z) {
                float f8 = sb1Var2.k ? sb1Var2.j : j;
                if (sb1Var2.h == null) {
                    j = sb1Var2.j;
                }
                e = gl.R1(f8, j, f);
                lmVar2.e(z3, e);
                if (sb1Var2 == this.R) {
                    f2 = 0.0f;
                    c = f7 - c(f, 0.0f, 0.25f);
                    f4 = c(f, 0.5f, f7);
                } else {
                    f2 = 0.0f;
                    c = f7 - c(f, 0.0f, 0.4f);
                    f4 = c(f, 0.75f, f7);
                }
                f3 = c;
            } else {
                f2 = 0.0f;
                e = lmVar2.e(d <= 0.0f ? z3 : false, j);
                f3 = 0.0f;
                f4 = 1.0f;
            }
            if (d <= f2 || e <= f2) {
                z2 = z;
                sb1VarArr = sb1VarArr2;
                rectF.setEmpty();
            } else {
                float a = sb1Var2.a();
                float L = gl.L(30.0f);
                float f9 = e / 2.0f;
                float f10 = f3;
                float i2 = Utilities.i(this.e, (getWidth() - gl.L(8.0f)) - f9, gl.L(8.0f) + f9);
                float f11 = L / 2.0f;
                z2 = z;
                float f12 = i2 + f9;
                sb1VarArr = sb1VarArr2;
                rectF.set(i2 - f9, a - f11, f12, a + f11);
                float R1 = gl.R1(0.8f, 1.0f, d) * sb1Var2.c.a(0.04f);
                canvas2.save();
                canvas2.scale(R1, R1, i2, a);
                int p1 = bkb.p1(d, -1946157056);
                Paint paint = this.b;
                paint.setColor(p1);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int L2 = gl.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i3 = 0;
                while (i3 < 2) {
                    int L3 = (int) (i3 == 0 ? rectF.left + gl.L(10.0f) : (rectF.right - gl.L(10.0f)) - L2);
                    int i4 = (int) (a - (L2 / 2.0f));
                    int i5 = L2;
                    drawable.setBounds(L3, i4, L3 + L2, i4 + i5);
                    drawable.draw(canvas2);
                    i3++;
                    L2 = i5;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + gl.L(24.0f), rectF.top, rectF.right - gl.L(24.0f), rectF.bottom);
                tgb tgbVar2 = sb1Var2.i;
                if (tgbVar2 == null) {
                    sb1Var = sb1Var2;
                    f5 = 0.0f;
                } else if (f10 > 0.0f) {
                    sb1Var = sb1Var2;
                    f5 = 0.0f;
                    tgbVar2.c(i2 - (tgbVar2.j() / 2.0f), a, d * 0.85f * f10, -1, canvas);
                } else {
                    sb1Var = sb1Var2;
                    f5 = 0.0f;
                }
                tgb tgbVar3 = sb1Var.h;
                if (tgbVar3 != null && f4 > f5) {
                    tgbVar3.c(i2 - (tgbVar3.j() / 2.0f), a, d * 0.85f * f4, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            }
            i++;
            canvas2 = canvas;
            z = z2;
            sb1VarArr2 = sb1VarArr;
            z3 = true;
            f6 = 1.0f;
        }
        sb1[] sb1VarArr3 = sb1VarArr2;
        if (z) {
            sb1 sb1Var3 = this.R;
            sb1 sb1Var4 = sb1VarArr3[sb1Var3 == sb1VarArr3[0] ? (char) 1 : (char) 0];
            a(canvas, 0, this.S, sb1Var3, 1.0f - f, this.w, this.x, this.y, c(f, 0.0f, 0.25f));
            a(canvas, 1, this.T, sb1Var4, f, this.K, this.L, this.M, 1.0f - c(f, 0.75f, 1.0f));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            for (sb1 sb1Var : this.a) {
                String str = sb1Var.g;
                sb1Var.g = null;
                sb1Var.h = null;
                sb1Var.b(str);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8c p8cVar;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (sb1 sb1Var : this.a) {
                if (sb1Var.h != null && sb1Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = sb1Var;
                    sb1Var.c.c(true);
                    return true;
                }
            }
        } else if (this.d != null) {
            if (motionEvent.getAction() == 2) {
                if (!this.d.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d.c.c(false);
                    this.d = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                sb1 sb1Var2 = this.d;
                this.d = null;
                sb1Var2.c.c(false);
                if (motionEvent.getAction() == 1 && (p8cVar = this.U) != null) {
                    p8cVar.a(Integer.valueOf(sb1Var2.a));
                }
            }
            return true;
        }
        return false;
    }

    public void setOnClick(p8c p8cVar) {
        this.U = p8cVar;
    }

    public void setOnSwitchProgress(p8c p8cVar) {
        this.V = p8cVar;
    }
}
