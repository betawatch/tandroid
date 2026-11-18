package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fi.l8;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q1 extends j {
    public float A0;
    public vt0 r0;
    public l8 s0;
    public l8 t0;
    public ch.g0 u0;
    public ch.g0 v0;
    public ch.p0 w0;
    public c6 x0;
    public c6 y0;
    public boolean z0;

    @Override // tg.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.r = new RectF();
        return p1Var;
    }

    @Override // tg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vt0 vt0Var = this.r0;
        int padding = getPadding();
        float e10 = this.y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        l8 l8Var = this.t0;
        if (l8Var != null) {
            l8Var.e = (int) ((1.0f - e10) * 255.0f);
            l8Var.setBounds(padding, padding, ((int) vt0Var.a) - padding, ((int) vt0Var.b) - padding);
            this.t0.draw(canvas);
        }
        l8 l8Var2 = this.s0;
        l8Var2.e = (int) (e10 * 255.0f);
        l8Var2.setBounds(padding, padding, ((int) vt0Var.a) - padding, ((int) vt0Var.b) - padding);
        this.s0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.s0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.s0.getBounds().centerX() - width), (int) (this.s0.getBounds().centerY() - width), (int) (this.s0.getBounds().centerX() + width), (int) (this.s0.getBounds().centerY() + width));
        float e11 = this.x0.e(false, 1.0f);
        this.u0.c(rect);
        this.v0.c(rect);
        this.u0.d(this.s0.a == 1 ? -1 : -16777216);
        if (e11 == 1.0f) {
            this.u0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var = this.v0;
            g0Var.h = f11;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var2 = this.u0;
            g0Var2.h = e11;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.w0;
    }

    @Override // tg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // tg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.r0.b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override // tg.j
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // tg.j
    public final void k() {
        vt0 vt0Var = this.r0;
        float f10 = vt0Var.a / 2.0f;
        float f11 = vt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u0.b(true);
        this.v0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u0.b(false);
        this.v0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        vt0 vt0Var = this.r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) vt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) vt0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.t0 = this.s0;
            l8 l8Var = new l8(this);
            this.s0 = l8Var;
            if (this.t0.a != 1) {
                l8Var.a();
            }
            this.s0.b(this.z0, false);
            this.s0.c(getScaleX());
            this.y0.e(true, 0.0f);
        } else {
            this.s0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.z0;
        this.z0 = z11;
        if (!z10) {
            this.s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.w(28, this, zArr));
        ofFloat.addListener(new h60(20, this, zArr));
        ofFloat.setInterpolator(lr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.w0, p0Var)) {
            return;
        }
        if (!z10) {
            this.w0 = p0Var;
            this.u0.e(p0Var);
            invalidate();
            return;
        }
        this.w0 = p0Var;
        this.v0.e(p0Var);
        ch.g0 g0Var = this.u0;
        this.u0 = this.v0;
        this.v0 = g0Var;
        this.x0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.s0.c(f10);
            invalidate();
        }
    }
}
