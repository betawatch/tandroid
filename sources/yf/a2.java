package yf;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ih.s8;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a2 extends j {
    public qu0 m0;
    public s8 n0;
    public s8 o0;
    public hg.i0 p0;
    public hg.i0 q0;
    public hg.r0 r0;
    public y5 s0;
    public y5 t0;
    public boolean u0;
    public float v0;

    @Override // yf.j
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.r = new RectF();
        return z1Var;
    }

    @Override // yf.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qu0 qu0Var = this.m0;
        int padding = getPadding();
        float d = this.t0.d(1.0f, false);
        if (d == 1.0f) {
            this.o0 = null;
        }
        canvas.save();
        float f10 = this.v0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        s8 s8Var = this.o0;
        if (s8Var != null) {
            s8Var.e = (int) ((1.0f - d) * 255.0f);
            s8Var.setBounds(padding, padding, ((int) qu0Var.a) - padding, ((int) qu0Var.b) - padding);
            this.o0.draw(canvas);
        }
        s8 s8Var2 = this.n0;
        s8Var2.e = (int) (d * 255.0f);
        s8Var2.setBounds(padding, padding, ((int) qu0Var.a) - padding, ((int) qu0Var.b) - padding);
        this.n0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.n0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.n0.getBounds().centerX() - width), (int) (this.n0.getBounds().centerY() - width), (int) (this.n0.getBounds().centerX() + width), (int) (this.n0.getBounds().centerY() + width));
        float d9 = this.s0.d(1.0f, false);
        this.p0.c(rect);
        this.q0.c(rect);
        this.p0.d(this.n0.a == 1 ? -1 : -16777216);
        if (d9 == 1.0f) {
            this.p0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d9;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            hg.i0 i0Var = this.q0;
            i0Var.h = f11;
            i0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d9, d9, rect.centerX(), rect.bottom);
            hg.i0 i0Var2 = this.p0;
            i0Var2.h = d9;
            i0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public hg.r0 getCurrentReaction() {
        return this.r0;
    }

    @Override // yf.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // yf.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.m0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new wj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // yf.j
    public final void k() {
        qu0 qu0Var = this.m0;
        float f10 = qu0Var.a / 2.0f;
        float f11 = qu0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p0.b(true);
        this.q0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p0.b(false);
        this.q0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.m0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) qu0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.o0 = this.n0;
            s8 s8Var = new s8(this);
            this.n0 = s8Var;
            if (this.o0.a != 1) {
                s8Var.a();
            }
            this.n0.b(this.u0, false);
            this.n0.c(getScaleX());
            this.t0.d(0.0f, true);
        } else {
            this.n0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        int i9 = 1;
        boolean z11 = !this.u0;
        this.u0 = z11;
        if (!z10) {
            this.n0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new zf.h1(i9, this, zArr));
        ofFloat.addListener(new su0(21, this, zArr));
        ofFloat.setInterpolator(gr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(hg.r0 r0Var, boolean z10) {
        if (Objects.equals(this.r0, r0Var)) {
            return;
        }
        if (!z10) {
            this.r0 = r0Var;
            this.p0.e(r0Var);
            invalidate();
            return;
        }
        this.r0 = r0Var;
        this.q0.e(r0Var);
        hg.i0 i0Var = this.p0;
        this.p0 = this.q0;
        this.q0 = i0Var;
        this.s0.d(0.0f, true);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.n0.c(f10);
            invalidate();
        }
    }
}
