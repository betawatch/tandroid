package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t3 extends org.telegram.ui.Components.uu0 implements org.telegram.ui.ActionBar.h2, org.telegram.ui.ActionBar.o3 {
    public final Paint f0;
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final org.telegram.ui.Components.t5 j0;
    public boolean k0;
    public final Path l0;
    public final RectF m0;
    public final RectF n0;
    public final Path o0;
    public boolean p0;
    public final /* synthetic */ u3 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(u3 u3Var, Context context) {
        super(context, null);
        this.q0 = u3Var;
        this.f0 = new Paint(1);
        this.g0 = new Paint(1);
        this.h0 = new Paint(1);
        this.i0 = new Paint(1);
        new Paint(1);
        this.j0 = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.l0 = new Path();
        this.m0 = new RectF();
        new RectF();
        this.n0 = new RectF();
        this.o0 = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        float f7;
        u3 u3Var = this.q0;
        h4 h4Var = u3Var.K;
        if (this.k0) {
            return;
        }
        float min = Math.min(u3Var.x, 1.0f - u3Var.y);
        Paint paint = this.f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = u3Var.x() - org.telegram.messenger.i0.L(20.0f);
        boolean z11 = x10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m && min > 0.95f;
        if (u3Var.F != z11) {
            u3Var.F = z11;
            u3Var.u();
        }
        float d = this.j0.d(z11);
        if (u3Var.G != (d >= 0.999f)) {
            u3Var.G = d >= 0.999f;
            u3Var.r();
        }
        int W1 = org.telegram.messenger.i0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - u3Var.x, u3Var.y) * u3Var.w();
        canvas.save();
        canvas.translate(getWidth() * u3Var.I, max);
        float f10 = W1;
        float width = getWidth();
        float L = org.telegram.messenger.i0.L(16.0f) + getHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, f10, width, L);
        float f11 = 1.0f - d;
        float L2 = org.telegram.messenger.i0.L(24.0f) * f11;
        if (d < 1.0f) {
            Paint paint2 = this.g0;
            paint2.setColor(0);
            i10 = 0;
            z10 = z11;
            f7 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.i0.L(18.0f), 0.0f, -org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L2, L2, paint2);
        } else {
            z10 = z11;
            i10 = 0;
            f7 = 0.0f;
        }
        if (L2 <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.l0;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = h4Var.u0[1].getBackgroundColor();
        Paint paint3 = this.h0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(h4Var.u0[i10].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(rectF);
        rectF2.left = h4Var.u0[i10].getX();
        canvas.drawRect(rectF2, paint3);
        h4Var.h0.s0 = (!z10 || org.telegram.messenger.i0.L(20.0f) + x10 > org.telegram.messenger.i0.m + h4Var.J0) ? i10 : true;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(20.0f) + x10 + 1, i10);
            canvas.translate(0.0f, W12);
            h4Var.h0.a(canvas, org.telegram.messenger.m5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.i0.m0 && (!h4Var.u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (d < 1.0f) {
            int f12 = i0.b.f(d, org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.messenger.i0.B(u3Var.v()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.i0;
            paint4.setColor(f12);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width2 = getWidth() / 2.0f;
            float L3 = ((org.telegram.messenger.i0.L(20.0f) / 2.0f) + f10) - (org.telegram.messenger.i0.L(8.0f) * d);
            float W13 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(48.0f)) / 2.0f;
            rectF.set(width2 - W13, L3 - org.telegram.messenger.i0.L(2.0f), width2 + W13, L3 + org.telegram.messenger.i0.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            u3 u3Var = this.q0;
            if (y3 < (u3Var.F ? 0 : u3Var.x())) {
                u3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.o3
    public RectF getRect() {
        u3 u3Var = this.q0;
        float max = (Math.max(1.0f - u3Var.x, u3Var.y) * u3Var.w()) + (u3Var.F ? 0 : u3Var.x() - org.telegram.messenger.i0.L(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.q0.A();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f7, f10);
        u3 u3Var = this.q0;
        h4 h4Var = u3Var.K;
        if (!h4Var.P0.x()) {
            if (!(h4Var.u0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f10 >= -1000.0f) {
                u3Var.m(false, null);
            } else {
                u3Var.a(true);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
            org.telegram.messenger.i0.r(k9Var.f0);
            k9Var.z = false;
        }
        this.p0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        u3 u3Var = this.q0;
        h4 h4Var = u3Var.K;
        if (!u3Var.H) {
            u3Var.H = i11 != 0;
        }
        if ((h4Var.u0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !h4Var.P0.x()) {
            iArr[1] = Math.min((int) (u3Var.w() * u3Var.y), i11);
            u3Var.y = Utilities.i(u3Var.y - (i11 / u3Var.w()), 1.0f, 0.0f);
            u3Var.A();
            u3Var.r();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
        org.telegram.messenger.i0.r(k9Var.f0);
        k9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.p0 = false;
        this.q0.getClass();
        return i10 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        u3 u3Var = this.q0;
        u3Var.H = false;
        if (!this.p0 && !u3Var.K.P0.x()) {
            if (u3Var.y > 0.25f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.o3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.k0 != z10) {
            this.k0 = z10;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.o3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        rectF2.set(getRect());
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF2);
        u3 u3Var = this.q0;
        h4 h4Var = u3Var.K;
        float f11 = 1.0f - f7;
        float min = Math.min(u3Var.x, 1.0f - u3Var.y) * f11;
        Paint paint = this.f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.I) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
        Paint paint2 = this.h0;
        paint2.setColor(x02);
        Path path = this.o0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (u3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                h4Var.h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.99f, f7);
            float f12 = T1 - 1.0f;
            if (Math.abs(f12) > 0.01f) {
                canvas.scale(T1, T1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f12) > 0.01f) {
                float f13 = 1.0f / T1;
                canvas.scale(f13, f13, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((u3Var.F ? h4Var.h0.getMeasuredHeight() : 0) * f11) + (-u3Var.x()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
