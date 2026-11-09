package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s3 extends org.telegram.ui.Components.tt0 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.i3 {
    public final Paint f0;
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final org.telegram.ui.Components.w5 j0;
    public boolean k0;
    public final Path l0;
    public final RectF m0;
    public final RectF n0;
    public final Path o0;
    public boolean p0;
    public final /* synthetic */ t3 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(t3 t3Var, Context context) {
        super(context, null);
        this.q0 = t3Var;
        this.f0 = new Paint(1);
        this.g0 = new Paint(1);
        this.h0 = new Paint(1);
        this.i0 = new Paint(1);
        new Paint(1);
        this.j0 = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
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
    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        int i7;
        float f10;
        t3 t3Var = this.q0;
        g4 g4Var = t3Var.K;
        if (this.k0) {
            return;
        }
        float min = Math.min(t3Var.x, 1.0f - t3Var.y);
        Paint paint = this.f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - t3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = t3Var.x() - org.telegram.messenger.g0.L(20.0f);
        boolean z10 = x10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m && min > 0.95f;
        if (t3Var.F != z10) {
            t3Var.F = z10;
            t3Var.u();
        }
        float d = this.j0.d(z10);
        if (t3Var.G != (d >= 0.999f)) {
            t3Var.G = d >= 0.999f;
            t3Var.r();
        }
        int W1 = org.telegram.messenger.g0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - t3Var.x, t3Var.y) * t3Var.w();
        canvas.save();
        canvas.translate(getWidth() * t3Var.I, max);
        float f11 = W1;
        float width = getWidth();
        float L = org.telegram.messenger.g0.L(16.0f) + getHeight();
        RectF rectF = this.m0;
        rectF.set(0.0f, f11, width, L);
        float f12 = 1.0f - d;
        float L2 = org.telegram.messenger.g0.L(24.0f) * f12;
        if (d < 1.0f) {
            Paint paint2 = this.g0;
            paint2.setColor(0);
            i7 = 0;
            z9 = z10;
            f10 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.g0.L(18.0f), 0.0f, -org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.l6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L2, L2, paint2);
        } else {
            z9 = z10;
            i7 = 0;
            f10 = 0.0f;
        }
        if (L2 <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.l0;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = g4Var.u0[1].getBackgroundColor();
        Paint paint3 = this.h0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(g4Var.u0[i7].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF);
        rectF2.left = g4Var.u0[i7].getX();
        canvas.drawRect(rectF2, paint3);
        g4Var.h0.s0 = (!z9 || org.telegram.messenger.g0.L(20.0f) + x10 > org.telegram.messenger.g0.m + g4Var.J0) ? i7 : true;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f) + x10 + 1, i7);
            canvas.translate(0.0f, W12);
            g4Var.h0.a(canvas, org.telegram.messenger.k5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.g0.m0 && (!g4Var.u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (d < 1.0f) {
            int f13 = i0.a.f(d, org.telegram.ui.ActionBar.l6.r1(0.15f, org.telegram.messenger.g0.B(t3Var.v()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.i0;
            paint4.setColor(f13);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width2 = getWidth() / 2.0f;
            float L3 = ((org.telegram.messenger.g0.L(20.0f) / 2.0f) + f11) - (org.telegram.messenger.g0.L(8.0f) * d);
            float W13 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(48.0f)) / 2.0f;
            rectF.set(width2 - W13, L3 - org.telegram.messenger.g0.L(2.0f), width2 + W13, L3 + org.telegram.messenger.g0.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            t3 t3Var = this.q0;
            if (y10 < (t3Var.F ? 0 : t3Var.x())) {
                t3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.i3
    public RectF getRect() {
        t3 t3Var = this.q0;
        float max = (Math.max(1.0f - t3Var.x, t3Var.y) * t3Var.w()) + (t3Var.F ? 0 : t3Var.x() - org.telegram.messenger.g0.L(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.q0.A();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        t3 t3Var = this.q0;
        g4 g4Var = t3Var.K;
        if (!g4Var.P0.x()) {
            if (!(g4Var.u0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                t3Var.m(false, null);
            } else {
                t3Var.a(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
            org.telegram.messenger.g0.r(i9Var.f0);
            i9Var.z = false;
        }
        this.p0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        t3 t3Var = this.q0;
        g4 g4Var = t3Var.K;
        if (!t3Var.H) {
            t3Var.H = i10 != 0;
        }
        if ((g4Var.u0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !g4Var.P0.x()) {
            iArr[1] = Math.min((int) (t3Var.w() * t3Var.y), i10);
            t3Var.y = Utilities.i(t3Var.y - (i10 / t3Var.w()), 1.0f, 0.0f);
            t3Var.A();
            t3Var.r();
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
        org.telegram.messenger.g0.r(i9Var.f0);
        i9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        this.p0 = false;
        this.q0.getClass();
        return i7 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        t3 t3Var = this.q0;
        t3Var.H = false;
        if (!this.p0 && !t3Var.K.P0.x()) {
            if (t3Var.y > 0.25f) {
                t3Var.a(true);
            } else {
                t3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.i3
    public void setDrawingFromOverlay(boolean z9) {
        if (this.k0 != z9) {
            this.k0 = z9;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.i3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        rectF2.set(getRect());
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF2);
        t3 t3Var = this.q0;
        g4 g4Var = t3Var.K;
        float f12 = 1.0f - f10;
        float min = Math.min(t3Var.x, 1.0f - t3Var.y) * f12;
        Paint paint = this.f0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - t3Var.I) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false);
        Paint paint2 = this.h0;
        paint2.setColor(x02);
        Path path = this.o0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (t3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                g4Var.h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.99f, f10);
            float f13 = T1 - 1.0f;
            if (Math.abs(f13) > 0.01f) {
                canvas.scale(T1, T1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f13) > 0.01f) {
                float f14 = 1.0f / T1;
                canvas.scale(f14, f14, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((t3Var.F ? g4Var.h0.getMeasuredHeight() : 0) * f12) + (-t3Var.x()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
