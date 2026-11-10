package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.de;
import di.w8;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q1 extends j {
    public nt0 q0;
    public w8 r0;
    public w8 s0;
    public ch.f0 t0;
    public ch.f0 u0;
    public ch.o0 v0;
    public v5 w0;
    public v5 x0;
    public boolean y0;
    public float z0;

    @Override // tg.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.r = new RectF();
        return p1Var;
    }

    @Override // tg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nt0 nt0Var = this.q0;
        int padding = getPadding();
        float e10 = this.x0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f10 = this.z0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        w8 w8Var = this.s0;
        if (w8Var != null) {
            w8Var.e = (int) ((1.0f - e10) * 255.0f);
            w8Var.setBounds(padding, padding, ((int) nt0Var.a) - padding, ((int) nt0Var.b) - padding);
            this.s0.draw(canvas);
        }
        w8 w8Var2 = this.r0;
        w8Var2.e = (int) (e10 * 255.0f);
        w8Var2.setBounds(padding, padding, ((int) nt0Var.a) - padding, ((int) nt0Var.b) - padding);
        this.r0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.r0.getBounds().centerX() - width), (int) (this.r0.getBounds().centerY() - width), (int) (this.r0.getBounds().centerX() + width), (int) (this.r0.getBounds().centerY() + width));
        float e11 = this.w0.e(false, 1.0f);
        this.t0.c(rect);
        this.u0.c(rect);
        this.t0.d(this.r0.a == 1 ? -1 : -16777216);
        if (e11 == 1.0f) {
            this.t0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.f0 f0Var = this.u0;
            f0Var.h = f11;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.f0 f0Var2 = this.t0;
            f0Var2.h = e11;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.o0 getCurrentReaction() {
        return this.v0;
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
        return (int) ((this.q0.b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ki0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // tg.j
    public final void k() {
        nt0 nt0Var = this.q0;
        float f10 = nt0Var.a / 2.0f;
        float f11 = nt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.b(true);
        this.u0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.b(false);
        this.u0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) nt0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z9) {
        if (z9) {
            this.s0 = this.r0;
            w8 w8Var = new w8(this);
            this.r0 = w8Var;
            if (this.s0.a != 1) {
                w8Var.a();
            }
            this.r0.b(this.y0, false);
            this.r0.c(getScaleX());
            this.x0.e(true, 0.0f);
        } else {
            this.r0.a();
        }
        invalidate();
    }

    public final void r(boolean z9) {
        boolean z10 = !this.y0;
        this.y0 = z10;
        if (!z9) {
            this.r0.b(z10, z9);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new de(28, this, zArr));
        ofFloat.addListener(new v50(20, this, zArr));
        ofFloat.setInterpolator(wq.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.o0 o0Var, boolean z9) {
        if (Objects.equals(this.v0, o0Var)) {
            return;
        }
        if (!z9) {
            this.v0 = o0Var;
            this.t0.e(o0Var);
            invalidate();
            return;
        }
        this.v0 = o0Var;
        this.u0.e(o0Var);
        ch.f0 f0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = f0Var;
        this.w0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.r0.c(f10);
            invalidate();
        }
    }
}
