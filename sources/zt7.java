// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zt7 extends View {
    public final lm E;
    public c79 F;
    public float G;
    public float H;
    public mcb I;
    public Runnable J;
    public boolean K;
    public yt7 L;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final gi3 d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final lm x;
    public final lm y;

    public zt7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new lm(this);
        this.y = new lm(this);
        this.E = new lm(this);
        this.I = new mcb(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new gi3(context, new xt7(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(gl.L(4.0f), 0.0f, gl.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(gl.L(3.0f), 0.0f, gl.L(1.0f), 637534208);
    }

    public final void a(float f, float f2, float f3, Canvas canvas, boolean z) {
        if (z) {
            RectF rectF = gl.P;
            rectF.set((f - f3) - gl.L(6.0f), (f2 - f3) - gl.L(6.0f), f + f3 + gl.L(6.0f), f2 + f3 + gl.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f, f2, f3, this.b);
        if (z) {
            canvas.restore();
        }
    }

    public final void b(float f, float f2) {
        this.G = f;
        this.H = f2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        yt7 yt7Var = this.L;
        float e = this.x.e(false, yt7Var != null ? yt7Var.get() : this.I.c);
        float e2 = this.y.e(false, this.G);
        float e3 = this.E.e(false, this.H);
        boolean z = this.h;
        float f = this.n;
        if (z) {
            if (f != 1.0f) {
                this.n = ls6.z(min, 200.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.n = oo1.x(min, 200.0f, f, 0.0f);
            invalidate();
        }
        boolean z2 = this.f;
        float f2 = this.r;
        if (z2) {
            if (f2 != 1.0f) {
                this.r = ls6.z(min, 200.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.r = oo1.x(min, 200.0f, f2, 0.0f);
            invalidate();
        }
        RectF rectF = this.e;
        float height = rectF.height();
        int L = gl.L(16.0f);
        int L2 = gl.L(3.0f);
        int L3 = gl.L(3.0f);
        Path path = this.c;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        RectF rectF2 = gl.P;
        int i = -L3;
        int i2 = -L;
        rectF2.set(gl.U1(this.r, i, i2), 0.0f, gl.U1(this.r, L3, L), gl.U1(this.r, L3, L) << 1);
        path.arcTo(rectF2, -90.0f, 90.0f);
        path.lineTo(gl.U1(this.r, L3, L2), height);
        rectF2.set(gl.U1(this.r, i, -L2), height - (L2 << 1), gl.U1(this.r, L3, L2), height);
        path.arcTo(rectF2, 0.0f, 180.0f);
        float f3 = L;
        path.lineTo(gl.U1(this.r, i, i2), f3);
        rectF2.set(gl.U1(this.r, i, i2), 0.0f, gl.U1(this.r, L3, L), L << 1);
        path.arcTo(rectF2, -180.0f, 90.0f);
        path.close();
        if (this.n != 0.0f) {
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
        }
        canvas.save();
        float L4 = gl.L(32.0f);
        s33 s33Var = s33.f;
        canvas.translate(s33Var.getInterpolation(this.r) * L4, rectF.top);
        canvas.drawPath(path, this.a);
        canvas.restore();
        float f4 = (e - e2) / (e3 - e2);
        float f5 = L2 * 1.5f;
        a(s33Var.getInterpolation(this.r) * gl.L(32.0f), moe.a(tb4.A(1.0f, f4, rectF.height(), rectF.top), rectF.top + f3, rectF.bottom - Math.min(f5, f3)), gl.R1(gl.L(12.0f), gl.R1(Math.min(f5, f3), f3, f4), this.r), canvas, false);
        if (this.K && this.r != 0.0f && this.w && this.F != null) {
            c79 c79Var = this.F;
            float f6 = c79Var.c.g.a;
            a(getWidth() / 2.0f, getHeight() / 2.0f, c79Var.getCurrentBrush().g() * b00.w(f6, 0.043945312f, e, 0.00390625f * f6) * this.F.getCurrentBrush().f(), canvas, true);
        }
        if (this.n != 0.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, gl.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.a).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f) {
        this.I.c = f;
        invalidate();
    }

    public void setColorSwatch(mcb mcbVar) {
        this.I = mcbVar;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.K = z;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(c79 c79Var) {
        this.F = c79Var;
    }

    public void setShowPreview(boolean z) {
        this.w = z;
        invalidate();
    }

    public void setValueOverride(yt7 yt7Var) {
        this.L = yt7Var;
        invalidate();
    }

    public void setViewHidden(boolean z) {
        this.h = z;
        invalidate();
    }
}
