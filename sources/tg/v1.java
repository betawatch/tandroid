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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v1 extends n {
    public boolean A0;
    public float B0;
    public xt0 s0;
    public l8 t0;
    public l8 u0;
    public ch.g0 v0;
    public ch.g0 w0;
    public ch.p0 x0;
    public c6 y0;
    public c6 z0;

    @Override // tg.n
    public final m a() {
        u1 u1Var = new u1(this, getContext(), 0);
        u1Var.r = new RectF();
        return u1Var;
    }

    @Override // tg.n, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xt0 xt0Var = this.s0;
        int padding = getPadding();
        float e10 = this.z0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.u0 = null;
        }
        canvas.save();
        float f10 = this.B0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        l8 l8Var = this.u0;
        if (l8Var != null) {
            l8Var.e = (int) ((1.0f - e10) * 255.0f);
            l8Var.setBounds(padding, padding, ((int) xt0Var.a) - padding, ((int) xt0Var.b) - padding);
            this.u0.draw(canvas);
        }
        l8 l8Var2 = this.t0;
        l8Var2.e = (int) (e10 * 255.0f);
        l8Var2.setBounds(padding, padding, ((int) xt0Var.a) - padding, ((int) xt0Var.b) - padding);
        this.t0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.t0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.t0.getBounds().centerX() - width), (int) (this.t0.getBounds().centerY() - width), (int) (this.t0.getBounds().centerX() + width), (int) (this.t0.getBounds().centerY() + width));
        float e11 = this.y0.e(false, 1.0f);
        this.v0.c(rect);
        this.w0.c(rect);
        this.v0.d(this.t0.a == 1 ? -1 : -16777216);
        if (e11 == 1.0f) {
            this.v0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var = this.w0;
            g0Var.h = f11;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var2 = this.v0;
            g0Var2.h = e11;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.x0;
    }

    @Override // tg.n
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // tg.n
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.s0.b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new aj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // tg.n
    public final void k() {
        xt0 xt0Var = this.s0;
        float f10 = xt0Var.a / 2.0f;
        float f11 = xt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.b(true);
        this.w0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.b(false);
        this.w0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        xt0 xt0Var = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) xt0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.u0 = this.t0;
            l8 l8Var = new l8(this);
            this.t0 = l8Var;
            if (this.u0.a != 1) {
                l8Var.a();
            }
            this.t0.b(this.A0, false);
            this.t0.c(getScaleX());
            this.z0.e(true, 0.0f);
        } else {
            this.t0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.A0;
        this.A0 = z11;
        if (!z10) {
            this.t0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.w(28, this, zArr));
        ofFloat.addListener(new f10(21, this, zArr));
        ofFloat.setInterpolator(kr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.x0, p0Var)) {
            return;
        }
        if (!z10) {
            this.x0 = p0Var;
            this.v0.e(p0Var);
            invalidate();
            return;
        }
        this.x0 = p0Var;
        this.w0.e(p0Var);
        ch.g0 g0Var = this.v0;
        this.v0 = this.w0;
        this.w0 = g0Var;
        this.y0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.t0.c(f10);
            invalidate();
        }
    }
}
