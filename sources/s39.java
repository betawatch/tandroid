// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class s39 extends h44 {
    public boolean A0;
    public float B0;
    public qma s0;
    public z9b t0;
    public z9b u0;
    public p39 v0;
    public p39 w0;
    public w49 x0;
    public mm y0;
    public mm z0;

    @Override // h44, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qma qmaVar = this.s0;
        int padding = getPadding();
        float e = this.z0.e(false, 1.0f);
        if (e == 1.0f) {
            this.u0 = null;
        }
        canvas.save();
        float f = this.B0;
        canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        z9b z9bVar = this.u0;
        if (z9bVar != null) {
            z9bVar.e = (int) ((1.0f - e) * 255.0f);
            z9bVar.setBounds(padding, padding, ((int) qmaVar.a) - padding, ((int) qmaVar.b) - padding);
            this.u0.draw(canvas);
        }
        z9b z9bVar2 = this.t0;
        z9bVar2.e = (int) (e * 255.0f);
        z9bVar2.setBounds(padding, padding, ((int) qmaVar.a) - padding, ((int) qmaVar.b) - padding);
        this.t0.draw(canvas);
        Rect rect = hl.Q;
        float width = (this.t0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.t0.getBounds().centerX() - width), (int) (this.t0.getBounds().centerY() - width), (int) (this.t0.getBounds().centerX() + width), (int) (this.t0.getBounds().centerY() + width));
        float e2 = this.y0.e(false, 1.0f);
        this.v0.c(rect);
        this.w0.c(rect);
        this.v0.d(this.t0.a == 1 ? -1 : -16777216);
        if (e2 == 1.0f) {
            this.v0.a(canvas);
        } else {
            canvas.save();
            float f2 = 1.0f - e2;
            canvas.scale(f2, f2, rect.centerX(), rect.top);
            p39 p39Var = this.w0;
            p39Var.h = f2;
            p39Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e2, e2, rect.centerX(), rect.bottom);
            p39 p39Var2 = this.v0;
            p39Var2.h = e2;
            p39Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public w49 getCurrentReaction() {
        return this.x0;
    }

    @Override // h44
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // h44
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.s0.b - hl.L(84.0f)) / 2.0f);
    }

    @Override // h44
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new a69();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new a69((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    @Override // h44
    public final void k() {
        qma qmaVar = this.s0;
        float f = qmaVar.a / 2.0f;
        float f2 = qmaVar.b / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
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
    public final void onMeasure(int i, int i2) {
        qma qmaVar = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qmaVar.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) qmaVar.b, TLObject.FLAG_30));
    }

    public final void q(boolean z) {
        z9b z9bVar = this.t0;
        if (z) {
            this.u0 = z9bVar;
            z9b z9bVar2 = new z9b(this);
            this.t0 = z9bVar2;
            if (this.u0.a != 1) {
                z9bVar2.a();
            }
            this.t0.b(this.A0, false);
            this.t0.c(getScaleX());
            this.z0.e(true, 0.0f);
        } else {
            z9bVar.a();
        }
        invalidate();
    }

    public final void r(boolean z) {
        boolean z2 = !this.A0;
        this.A0 = z2;
        if (!z) {
            this.t0.b(z2, z);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new lk(this, zArr, (byte) 23));
        ofFloat.addListener(new wd8((Object) this, (Object) zArr, (byte) 5));
        ofFloat.setInterpolator(k43.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(w49 w49Var, boolean z) {
        if (Objects.equals(this.x0, w49Var)) {
            return;
        }
        if (!z) {
            this.x0 = w49Var;
            this.v0.e(w49Var);
            invalidate();
            return;
        }
        this.x0 = w49Var;
        this.w0.e(w49Var);
        p39 p39Var = this.v0;
        this.v0 = this.w0;
        this.w0 = p39Var;
        this.y0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            super.setScaleX(f);
            this.t0.c(f);
            invalidate();
        }
    }
}
