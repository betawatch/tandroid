package ug;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ei.v8;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q1 extends j {
    public float A0;
    public lt0 r0;
    public v8 s0;
    public v8 t0;
    public dh.e0 u0;
    public dh.e0 v0;
    public dh.n0 w0;
    public u5 x0;
    public u5 y0;
    public boolean z0;

    @Override // ug.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.r = new RectF();
        return p1Var;
    }

    @Override // ug.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lt0 lt0Var = this.r0;
        int padding = getPadding();
        float e10 = this.y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        v8 v8Var = this.t0;
        if (v8Var != null) {
            v8Var.e = (int) ((1.0f - e10) * 255.0f);
            v8Var.setBounds(padding, padding, ((int) lt0Var.a) - padding, ((int) lt0Var.b) - padding);
            this.t0.draw(canvas);
        }
        v8 v8Var2 = this.s0;
        v8Var2.e = (int) (e10 * 255.0f);
        v8Var2.setBounds(padding, padding, ((int) lt0Var.a) - padding, ((int) lt0Var.b) - padding);
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
            dh.e0 e0Var = this.v0;
            e0Var.h = f11;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            dh.e0 e0Var2 = this.u0;
            e0Var2.h = e11;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public dh.n0 getCurrentReaction() {
        return this.w0;
    }

    @Override // ug.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // ug.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.r0.b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ni0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // ug.j
    public final void k() {
        lt0 lt0Var = this.r0;
        float f10 = lt0Var.a / 2.0f;
        float f11 = lt0Var.b / 2.0f;
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
    public final void onMeasure(int i3, int i10) {
        lt0 lt0Var = this.r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) lt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) lt0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.t0 = this.s0;
            v8 v8Var = new v8(this);
            this.s0 = v8Var;
            if (this.t0.a != 1) {
                v8Var.a();
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
        int i3 = 1;
        boolean z11 = !this.z0;
        this.z0 = z11;
        if (!z10) {
            this.s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new vg.e1(i3, this, zArr));
        ofFloat.addListener(new ri0(20, this, zArr));
        ofFloat.setInterpolator(xq.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(dh.n0 n0Var, boolean z10) {
        if (Objects.equals(this.w0, n0Var)) {
            return;
        }
        if (!z10) {
            this.w0 = n0Var;
            this.u0.e(n0Var);
            invalidate();
            return;
        }
        this.w0 = n0Var;
        this.v0.e(n0Var);
        dh.e0 e0Var = this.u0;
        this.u0 = this.v0;
        this.v0 = e0Var;
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
