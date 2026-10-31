package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.d81;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h5 extends View {
    public final org.telegram.ui.Components.e6 D;
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.t5 J;
    public final org.telegram.ui.Components.t5 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f;
    public q20 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final org.telegram.ui.Components.e6 y;

    public h5(Context context, int i10) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.w = paint4;
        Paint paint5 = new Paint(1);
        this.x = paint5;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.y = e6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.K = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.Q = new TextPaint(1);
        this.a = i10;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.n(0.3f, 40L, grVar);
        e6Var.setCallback(this);
        e6Var.u(-1);
        Point point = org.telegram.messenger.i0.q;
        e6Var.M = point.x;
        if (i10 == 0) {
            e6Var.w(org.telegram.messenger.i0.L(15.0f));
            this.D = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            e6Var.w(org.telegram.messenger.i0.L(14.0f));
            e6Var.b = 5;
            org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
            this.D = e6Var2;
            e6Var2.M = point.x;
            e6Var2.w(org.telegram.messenger.i0.L(14.0f));
            e6Var2.x(org.telegram.messenger.i0.o());
            e6Var2.n(0.3f, 40L, grVar);
            e6Var2.setCallback(this);
            e6Var2.u(-1);
            if (i10 == 1) {
                e6Var2.t(cd.L0(2131750692, null), true, true);
            } else if (i10 == 2) {
                e6Var2.t(cd.L0(2131750693, null), true, true);
            } else if (i10 == 3) {
                e6Var2.t(cd.L0(2131742980, null), true, true);
            }
        }
        e6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f7) {
        this.e = true;
        float f10 = this.b;
        this.d = (f7 - f10) / (this.c - f10);
        e(f7);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(d81 d81Var) {
        this.h = d81Var;
    }

    public final void d(float f7) {
        float f10 = this.b;
        float f11 = (f7 - f10) / (this.c - f10);
        this.d = f11;
        this.f.e(true, f11);
        e(f7);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f7 = this.N;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        float e = this.e ? this.f.e(false, this.d) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, zs.e4, 31);
        int i10 = this.a;
        org.telegram.ui.Components.e6 e6Var = this.y;
        if (i10 == 0) {
            e6Var.setBounds(org.telegram.messenger.i0.L(42.0f), -org.telegram.messenger.i0.L(1.0f), this.O, this.P - org.telegram.messenger.i0.L(1.0f));
            e6Var.draw(canvas);
        } else {
            int L = org.telegram.messenger.i0.L(12.33f);
            int i11 = -org.telegram.messenger.i0.L(1.0f);
            int c10 = (this.O - ((int) e6Var.c())) - org.telegram.messenger.i0.L(6.0f);
            int L2 = this.P - org.telegram.messenger.i0.L(1.0f);
            org.telegram.ui.Components.e6 e6Var2 = this.D;
            e6Var2.setBounds(L, i11, c10, L2);
            e6Var2.draw(canvas);
            e6Var.setBounds(this.O - org.telegram.messenger.i0.L(111.0f), -org.telegram.messenger.i0.L(1.0f), this.O - org.telegram.messenger.i0.L(11.0f), this.P - org.telegram.messenger.i0.L(1.0f));
            e6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.F, this.r);
            canvas.drawPath(this.G, this.s);
            float f10 = this.c;
            float f11 = this.b;
            float f12 = f10 - f11;
            double d = f12 != 0.0f ? (f12 * this.d) + f11 : 0.0f;
            float d10 = this.J.d(d > 0.25d);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.i0.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            float d11 = this.K.d(d > 0.5d);
            canvas.save();
            canvas.translate((1.0f - d11) * (-org.telegram.messenger.i0.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d11 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * e, this.P, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f7 = this.c;
            float f10 = this.b;
            float z11 = f7 - f10 != 0.0f ? c3.i0.z(f7, f10, this.d, f10) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.M >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.i(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.e = false;
                z10 = true;
            } else {
                this.f.e(true, this.d);
                this.d = x10 / this.O;
                this.e = true;
            }
            float f11 = this.c;
            float f12 = this.b;
            float z12 = f11 - f12 != 0.0f ? c3.i0.z(f11, f12, this.d, f12) : 0.0f;
            if (z10) {
                if ((z12 <= f12 && z11 > z12) || (z12 >= f11 && z11 < z12)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(z11 * 5.0f) != Math.floor(5.0f * z12)) {
                    org.telegram.messenger.i0.b4(this);
                }
            }
            e(z12);
            q20 q20Var = this.h;
            if (q20Var != null) {
                q20Var.a(Float.valueOf(z12));
            }
        }
        this.L = x10;
        return true;
    }

    public final void e(float f7) {
        String str = Math.round(100.0f * f7) + "%";
        org.telegram.ui.Components.e6 e6Var = this.y;
        if (!TextUtils.equals(e6Var.i, str)) {
            e6Var.a();
            e6Var.n(0.3f, this.e ? 320L : 40L, gr.h);
            e6Var.t(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(z1.f(f7));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.N = org.telegram.messenger.i0.L(12.0f);
        float L = org.telegram.messenger.i0.L(16.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(L);
        this.y.w(org.telegram.messenger.i0.L(15.0f));
        int i12 = this.R;
        int i13 = this.a;
        if (i12 > 0) {
            this.O = i12;
            this.P = org.telegram.messenger.i0.L(48.0f);
        } else if (i13 == 0) {
            this.O = (int) Math.min(textPaint.measureText(cd.L0(2131744738, null)) + org.telegram.messenger.i0.L(88.0f), View.MeasureSpec.getSize(i10));
            this.P = org.telegram.messenger.i0.L(48.0f);
        } else {
            this.O = org.telegram.messenger.i0.L(190.0f);
            this.P = org.telegram.messenger.i0.L(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i13 == 0) {
            float L2 = org.telegram.messenger.i0.L(25.0f);
            float f7 = this.P / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(L2 - org.telegram.messenger.i0.N(8.66f), f7 - org.telegram.messenger.i0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.i0.N(3.0f), f7 - org.telegram.messenger.i0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(2.9f) + f7);
            path.lineTo(L2 - org.telegram.messenger.i0.N(8.66f), org.telegram.messenger.i0.N(2.9f) + f7);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(L2 - org.telegram.messenger.i0.N(7.5f), f7);
            path2.lineTo(L2, f7 - org.telegram.messenger.i0.N(7.33f));
            path2.lineTo(L2, org.telegram.messenger.i0.N(7.33f) + f7);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((L2 - org.telegram.messenger.i0.N(0.33f)) - org.telegram.messenger.i0.L(4.33f), f7 - org.telegram.messenger.i0.L(4.33f), (L2 - org.telegram.messenger.i0.N(0.33f)) + org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f) + f7);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((L2 - org.telegram.messenger.i0.N(0.33f)) - org.telegram.messenger.i0.L(8.0f), f7 - org.telegram.messenger.i0.L(8.0f), (L2 - org.telegram.messenger.i0.N(0.33f)) + org.telegram.messenger.i0.L(8.0f), f7 + org.telegram.messenger.i0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || drawable == this.D || super.verifyDrawable(drawable);
    }
}
