package sg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import di.e9;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b2 extends j {
    public rw0 q0;
    public e9 r0;
    public e9 s0;
    public bh.n0 t0;
    public bh.n0 u0;
    public bh.x0 v0;
    public h6 w0;
    public h6 x0;
    public boolean y0;
    public float z0;

    @Override // sg.j
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.r = new RectF();
        return a2Var;
    }

    @Override // sg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rw0 rw0Var = this.q0;
        int padding = getPadding();
        float d = this.x0.d(1.0f, false);
        if (d == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f7 = this.z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        e9 e9Var = this.s0;
        if (e9Var != null) {
            e9Var.e = (int) ((1.0f - d) * 255.0f);
            e9Var.setBounds(padding, padding, ((int) rw0Var.a) - padding, ((int) rw0Var.b) - padding);
            this.s0.draw(canvas);
        }
        e9 e9Var2 = this.r0;
        e9Var2.e = (int) (d * 255.0f);
        e9Var2.setBounds(padding, padding, ((int) rw0Var.a) - padding, ((int) rw0Var.b) - padding);
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
            bh.n0 n0Var = this.u0;
            n0Var.h = f10;
            n0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            bh.n0 n0Var2 = this.t0;
            n0Var2.h = d10;
            n0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public bh.x0 getCurrentReaction() {
        return this.v0;
    }

    @Override // sg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // sg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.q0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // sg.j
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new il0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new il0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override // sg.j
    public final void k() {
        rw0 rw0Var = this.q0;
        float f7 = rw0Var.a / 2.0f;
        float f10 = rw0Var.b / 2.0f;
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
        rw0 rw0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) rw0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) rw0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.s0 = this.r0;
            e9 e9Var = new e9(this);
            this.r0 = e9Var;
            if (this.s0.a != 1) {
                e9Var.a();
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
        int i10 = 1;
        boolean z11 = !this.y0;
        this.y0 = z11;
        if (!z10) {
            this.r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new tg.i1(i10, this, zArr));
        ofFloat.addListener(new ml0(19, this, zArr));
        ofFloat.setInterpolator(ds.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(bh.x0 x0Var, boolean z10) {
        if (Objects.equals(this.v0, x0Var)) {
            return;
        }
        if (!z10) {
            this.v0 = x0Var;
            this.t0.e(x0Var);
            invalidate();
            return;
        }
        this.v0 = x0Var;
        this.u0.e(x0Var);
        bh.n0 n0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = n0Var;
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
