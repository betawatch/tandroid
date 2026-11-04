package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t3 extends org.telegram.ui.Components.qt0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.h3 {
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint j0;
    public final org.telegram.ui.Components.u5 k0;
    public boolean l0;
    public final Path m0;
    public final RectF n0;
    public final RectF o0;
    public final Path p0;
    public boolean q0;
    public final /* synthetic */ u3 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(u3 u3Var, Context context) {
        super(context, null);
        this.r0 = u3Var;
        this.g0 = new Paint(1);
        this.h0 = new Paint(1);
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        new Paint(1);
        this.k0 = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
        this.m0 = new Path();
        this.n0 = new RectF();
        new RectF();
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i3;
        float f10;
        u3 u3Var = this.r0;
        i4 i4Var = u3Var.L;
        if (this.l0) {
            return;
        }
        float min = Math.min(u3Var.x, 1.0f - u3Var.y);
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x10 = u3Var.x() - org.telegram.messenger.g0.L(20.0f);
        boolean z11 = x10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m && min > 0.95f;
        if (u3Var.G != z11) {
            u3Var.G = z11;
            u3Var.u();
        }
        float d = this.k0.d(z11);
        if (u3Var.H != (d >= 0.999f)) {
            u3Var.H = d >= 0.999f;
            u3Var.r();
        }
        int W1 = org.telegram.messenger.g0.W1(Utilities.l(d), x10, 0);
        float max = Math.max(1.0f - u3Var.x, u3Var.y) * u3Var.w();
        canvas.save();
        canvas.translate(getWidth() * u3Var.J, max);
        float f11 = W1;
        float width = getWidth();
        float L = org.telegram.messenger.g0.L(16.0f) + getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, f11, width, L);
        float f12 = 1.0f - d;
        float L2 = org.telegram.messenger.g0.L(24.0f) * f12;
        if (d < 1.0f) {
            Paint paint2 = this.h0;
            paint2.setColor(0);
            i3 = 0;
            z10 = z11;
            f10 = 0.0f;
            paint2.setShadowLayer(org.telegram.messenger.g0.L(18.0f), 0.0f, -org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.r1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L2, L2, paint2);
        } else {
            z10 = z11;
            i3 = 0;
            f10 = 0.0f;
        }
        if (L2 <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = i4Var.v0[1].getBackgroundColor();
        Paint paint3 = this.i0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(i4Var.v0[i3].getBackgroundColor());
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(rectF);
        rectF2.left = i4Var.v0[i3].getX();
        canvas.drawRect(rectF2, paint3);
        i4Var.i0.t0 = (!z10 || org.telegram.messenger.g0.L(20.0f) + x10 > org.telegram.messenger.g0.m + i4Var.K0) ? i3 : true;
        if (d > 0.0f) {
            canvas.save();
            float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f) + x10 + 1, i3);
            canvas.translate(0.0f, W12);
            i4Var.i0.a(canvas, org.telegram.messenger.k5.C(20.0f, x10, 1) - W12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!org.telegram.messenger.g0.m0 && (!i4Var.v0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (d < 1.0f) {
            int f13 = i0.a.f(d, org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.messenger.g0.B(u3Var.v()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.j0;
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
            float y9 = motionEvent.getY();
            u3 u3Var = this.r0;
            if (y9 < (u3Var.G ? 0 : u3Var.x())) {
                u3Var.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public RectF getRect() {
        u3 u3Var = this.r0;
        float max = (Math.max(1.0f - u3Var.x, u3Var.y) * u3Var.w()) + (u3Var.G ? 0 : u3Var.x() - org.telegram.messenger.g0.L(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.o0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.r0.A();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        u3 u3Var = this.r0;
        i4 i4Var = u3Var.L;
        if (!i4Var.Q0.x()) {
            if (!(i4Var.v0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                u3Var.m(false, null);
            } else {
                u3Var.a(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            org.telegram.messenger.g0.r(h9Var.f0);
            h9Var.z = false;
        }
        this.q0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        u3 u3Var = this.r0;
        i4 i4Var = u3Var.L;
        if (!u3Var.I) {
            u3Var.I = i10 != 0;
        }
        if ((i4Var.v0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !i4Var.Q0.x()) {
            iArr[1] = Math.min((int) (u3Var.w() * u3Var.y), i10);
            u3Var.y = Utilities.i(u3Var.y - (i10 / u3Var.w()), 1.0f, 0.0f);
            u3Var.A();
            u3Var.r();
        }
        if (i3 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
        org.telegram.messenger.g0.r(h9Var.f0);
        h9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        this.q0 = false;
        this.r0.getClass();
        return i3 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        u3 u3Var = this.r0;
        u3Var.I = false;
        if (!this.q0 && !u3Var.L.Q0.x()) {
            if (u3Var.y > 0.25f) {
                u3Var.a(true);
            } else {
                u3Var.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.l0 != z10) {
            this.l0 = z10;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        rectF2.set(getRect());
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF2);
        u3 u3Var = this.r0;
        i4 i4Var = u3Var.L;
        float f12 = 1.0f - f10;
        float min = Math.min(u3Var.x, 1.0f - u3Var.y) * f12;
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - u3Var.J) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
        Paint paint2 = this.i0;
        paint2.setColor(x02);
        Path path = this.p0;
        path.rewind();
        path.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (u3Var.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                i4Var.i0.draw(canvas);
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
            canvas.translate(0.0f, ((u3Var.G ? i4Var.i0.getMeasuredHeight() : 0) * f12) + (-u3Var.x()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return W1;
    }
}
