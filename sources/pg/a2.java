package pg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import zh.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a2 extends j {
    public tv0 q0;
    public a7 r0;
    public a7 s0;
    public yg.g0 t0;
    public yg.g0 u0;
    public yg.p0 v0;
    public d6 w0;
    public d6 x0;
    public boolean y0;
    public float z0;

    @Override // pg.j
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.r = new RectF();
        return z1Var;
    }

    @Override // pg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tv0 tv0Var = this.q0;
        int padding = getPadding();
        float d = this.x0.d(1.0f, false);
        if (d == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f7 = this.z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        a7 a7Var = this.s0;
        if (a7Var != null) {
            a7Var.e = (int) ((1.0f - d) * 255.0f);
            a7Var.setBounds(padding, padding, ((int) tv0Var.a) - padding, ((int) tv0Var.b) - padding);
            this.s0.draw(canvas);
        }
        a7 a7Var2 = this.r0;
        a7Var2.e = (int) (d * 255.0f);
        a7Var2.setBounds(padding, padding, ((int) tv0Var.a) - padding, ((int) tv0Var.b) - padding);
        this.r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.r0.getBounds().centerX() - width), (int) (this.r0.getBounds().centerY() - width), (int) (this.r0.getBounds().centerX() + width), (int) (this.r0.getBounds().centerY() + width));
        float d10 = this.w0.d(1.0f, false);
        this.t0.c(rect);
        this.u0.c(rect);
        this.t0.d(this.r0.a == 1 ? -1 : -16777216);
        if (d10 == 1.0f) {
            this.t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            yg.g0 g0Var = this.u0;
            g0Var.h = f10;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            yg.g0 g0Var2 = this.t0;
            g0Var2.h = d10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public yg.p0 getCurrentReaction() {
        return this.v0;
    }

    @Override // pg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // pg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.q0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // pg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new rk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override // pg.j
    public final void k() {
        tv0 tv0Var = this.q0;
        float f7 = tv0Var.a / 2.0f;
        float f10 = tv0Var.b / 2.0f;
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
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
    public final void onMeasure(int i10, int i11) {
        tv0 tv0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) tv0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.s0 = this.r0;
            a7 a7Var = new a7(this);
            this.r0 = a7Var;
            if (this.s0.a != 1) {
                a7Var.a();
            }
            this.r0.b(this.y0, false);
            this.r0.c(getScaleX());
            this.x0.d(0.0f, true);
        } else {
            this.r0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.y0;
        this.y0 = z11;
        if (!z10) {
            this.r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg.t1(24, this, zArr));
        ofFloat.addListener(new vv0(16, (Object) this, (Object) zArr));
        ofFloat.setInterpolator(wr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(yg.p0 p0Var, boolean z10) {
        if (Objects.equals(this.v0, p0Var)) {
            return;
        }
        if (!z10) {
            this.v0 = p0Var;
            this.t0.e(p0Var);
            invalidate();
            return;
        }
        this.v0 = p0Var;
        this.u0.e(p0Var);
        yg.g0 g0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = g0Var;
        this.w0.d(0.0f, true);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.r0.c(f7);
            invalidate();
        }
    }
}
