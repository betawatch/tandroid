package qg;

import ai.ob;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d2 extends j {
    public jv0 q0;
    public ob r0;
    public ob s0;
    public zg.g0 t0;
    public zg.g0 u0;
    public zg.p0 v0;
    public e6 w0;
    public e6 x0;
    public boolean y0;
    public float z0;

    @Override // qg.j
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 0);
        c2Var.r = new RectF();
        return c2Var;
    }

    @Override // qg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        jv0 jv0Var = this.q0;
        int padding = getPadding();
        float d = this.x0.d(1.0f, false);
        if (d == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f7 = this.z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.s0;
        if (obVar != null) {
            obVar.e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) jv0Var.a) - padding, ((int) jv0Var.b) - padding);
            this.s0.draw(canvas);
        }
        ob obVar2 = this.r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) jv0Var.a) - padding, ((int) jv0Var.b) - padding);
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
            zg.g0 g0Var = this.u0;
            g0Var.h = f10;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.g0 g0Var2 = this.t0;
            g0Var2.h = d10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.p0 getCurrentReaction() {
        return this.v0;
    }

    @Override // qg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // qg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.q0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // qg.j
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ik0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ik0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override // qg.j
    public final void k() {
        jv0 jv0Var = this.q0;
        float f7 = jv0Var.a / 2.0f;
        float f10 = jv0Var.b / 2.0f;
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
        jv0 jv0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) jv0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.s0 = this.r0;
            ob obVar = new ob(this);
            this.r0 = obVar;
            if (this.s0.a != 1) {
                obVar.a();
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
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new qk0(18, this, zArr));
        ofFloat.setInterpolator(rr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.p0 p0Var, boolean z10) {
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
        zg.g0 g0Var = this.t0;
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
