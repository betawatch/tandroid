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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b2 extends j {
    public uv0 q0;
    public ob r0;
    public ob s0;
    public zg.f0 t0;
    public zg.f0 u0;
    public zg.o0 v0;
    public d6 w0;
    public d6 x0;
    public boolean y0;
    public float z0;

    @Override // qg.j
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.r = new RectF();
        return a2Var;
    }

    @Override // qg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        uv0 uv0Var = this.q0;
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
            obVar.setBounds(padding, padding, ((int) uv0Var.a) - padding, ((int) uv0Var.b) - padding);
            this.s0.draw(canvas);
        }
        ob obVar2 = this.r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) uv0Var.a) - padding, ((int) uv0Var.b) - padding);
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
            zg.f0 f0Var = this.u0;
            f0Var.h = f10;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.f0 f0Var2 = this.t0;
            f0Var2.h = d10;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.o0 getCurrentReaction() {
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

    @Override // qg.j
    public final void k() {
        uv0 uv0Var = this.q0;
        float f7 = uv0Var.a / 2.0f;
        float f10 = uv0Var.b / 2.0f;
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
        uv0 uv0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) uv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) uv0Var.b, TLObject.FLAG_30));
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
        ofFloat.addListener(new zk0(18, this, zArr));
        ofFloat.setInterpolator(qr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.o0 o0Var, boolean z10) {
        if (Objects.equals(this.v0, o0Var)) {
            return;
        }
        if (!z10) {
            this.v0 = o0Var;
            this.t0.e(o0Var);
            invalidate();
            return;
        }
        this.v0 = o0Var;
        this.u0.e(o0Var);
        zg.f0 f0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = f0Var;
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
