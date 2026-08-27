package zf;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import jh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b2 extends j {
    public tu0 m0;
    public o8 n0;
    public o8 o0;
    public ig.h0 p0;
    public ig.h0 q0;
    public ig.q0 r0;
    public y5 s0;
    public y5 t0;
    public boolean u0;
    public float v0;

    @Override // zf.j
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.r = new RectF();
        return a2Var;
    }

    @Override // zf.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tu0 tu0Var = this.m0;
        int padding = getPadding();
        float d = this.t0.d(1.0f, false);
        if (d == 1.0f) {
            this.o0 = null;
        }
        canvas.save();
        float f10 = this.v0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.o0;
        if (o8Var != null) {
            o8Var.e = (int) ((1.0f - d) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) tu0Var.a) - padding, ((int) tu0Var.b) - padding);
            this.o0.draw(canvas);
        }
        o8 o8Var2 = this.n0;
        o8Var2.e = (int) (d * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) tu0Var.a) - padding, ((int) tu0Var.b) - padding);
        this.n0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.n0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.n0.getBounds().centerX() - width), (int) (this.n0.getBounds().centerY() - width), (int) (this.n0.getBounds().centerX() + width), (int) (this.n0.getBounds().centerY() + width));
        float d10 = this.s0.d(1.0f, false);
        this.p0.c(rect);
        this.q0.c(rect);
        this.p0.d(this.n0.a == 1 ? -1 : -16777216);
        if (d10 == 1.0f) {
            this.p0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d10;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ig.h0 h0Var = this.q0;
            h0Var.h = f11;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ig.h0 h0Var2 = this.p0;
            h0Var2.h = d10;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ig.q0 getCurrentReaction() {
        return this.r0;
    }

    @Override // zf.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // zf.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.m0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // zf.j
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // zf.j
    public final void k() {
        tu0 tu0Var = this.m0;
        float f10 = tu0Var.a / 2.0f;
        float f11 = tu0Var.b / 2.0f;
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
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.m0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) tu0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.o0 = this.n0;
            o8 o8Var = new o8(this);
            this.n0 = o8Var;
            if (this.o0.a != 1) {
                o8Var.a();
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
        boolean z11 = !this.u0;
        this.u0 = z11;
        if (!z10) {
            this.n0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z1(0, this, zArr));
        ofFloat.addListener(new fk0(23, this, zArr));
        ofFloat.setInterpolator(er.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ig.q0 q0Var, boolean z10) {
        if (Objects.equals(this.r0, q0Var)) {
            return;
        }
        if (!z10) {
            this.r0 = q0Var;
            this.p0.e(q0Var);
            invalidate();
            return;
        }
        this.r0 = q0Var;
        this.q0.e(q0Var);
        ig.h0 h0Var = this.p0;
        this.p0 = this.q0;
        this.q0 = h0Var;
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
