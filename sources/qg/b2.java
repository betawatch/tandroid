package qg;

import ai.pb;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b2 extends j {
    public mw0 q0;
    public pb r0;
    public pb s0;
    public zg.e0 t0;
    public zg.e0 u0;
    public zg.n0 v0;
    public g6 w0;
    public g6 x0;
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
        mw0 mw0Var = this.q0;
        int padding = getPadding();
        float d = this.x0.d(1.0f, false);
        if (d == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f7 = this.z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        pb pbVar = this.s0;
        if (pbVar != null) {
            pbVar.e = (int) ((1.0f - d) * 255.0f);
            pbVar.setBounds(padding, padding, ((int) mw0Var.a) - padding, ((int) mw0Var.b) - padding);
            this.s0.draw(canvas);
        }
        pb pbVar2 = this.r0;
        pbVar2.e = (int) (d * 255.0f);
        pbVar2.setBounds(padding, padding, ((int) mw0Var.a) - padding, ((int) mw0Var.b) - padding);
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
            zg.e0 e0Var = this.u0;
            e0Var.h = f10;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.e0 e0Var2 = this.t0;
            e0Var2.h = d10;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.n0 getCurrentReaction() {
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
    public ml0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ml0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ml0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override // qg.j
    public final void k() {
        mw0 mw0Var = this.q0;
        float f7 = mw0Var.a / 2.0f;
        float f10 = mw0Var.b / 2.0f;
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
        mw0 mw0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) mw0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) mw0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.s0 = this.r0;
            pb pbVar = new pb(this);
            this.r0 = pbVar;
            if (this.s0.a != 1) {
                pbVar.a();
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
        ofFloat.addListener(new ul0(18, this, zArr));
        ofFloat.setInterpolator(hs.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.n0 n0Var, boolean z10) {
        if (Objects.equals(this.v0, n0Var)) {
            return;
        }
        if (!z10) {
            this.v0 = n0Var;
            this.t0.e(n0Var);
            invalidate();
            return;
        }
        this.v0 = n0Var;
        this.u0.e(n0Var);
        zg.e0 e0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = e0Var;
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
