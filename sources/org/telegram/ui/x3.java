package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x3 extends org.telegram.ui.Components.qv0 implements org.telegram.ui.ActionBar.m2, org.telegram.ui.ActionBar.v3 {
    public final RectF A0;
    public final RectF B0;
    public final Path C0;
    public boolean D0;
    public final /* synthetic */ y3 E0;
    public final Paint t0;
    public final Paint u0;
    public final Paint v0;
    public final Paint w0;
    public final org.telegram.ui.Components.z5 x0;
    public boolean y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(y3 y3Var, Context context) {
        super(context, null);
        this.E0 = y3Var;
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new Paint(1);
        this.w0 = new Paint(1);
        new Paint(1);
        this.x0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.pr.h);
        this.z0 = new Path();
        this.A0 = new RectF();
        new RectF();
        this.B0 = new RectF();
        this.C0 = new Path();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        char c3;
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (this.y0) {
            return;
        }
        float min = Math.min(y3Var.w, 1.0f - y3Var.x);
        Paint paint = this.t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.F) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        boolean z10 = l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f;
        if (y3Var.C != z10) {
            y3Var.C = z10;
            y3Var.i();
        }
        float e6 = this.x0.e(z10);
        if (y3Var.D != (e6 >= 0.999f)) {
            y3Var.D = e6 >= 0.999f;
            y3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e6));
        float max = Math.max(1.0f - y3Var.w, y3Var.x) * y3Var.k();
        canvas.save();
        canvas.translate(getWidth() * y3Var.F, max);
        float f11 = lerp;
        float width = getWidth();
        float dp = AndroidUtilities.dp(16.0f) + getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, f11, width, dp);
        float f12 = 1.0f - e6;
        float dp2 = AndroidUtilities.dp(24.0f) * f12;
        if (e6 < 1.0f) {
            Paint paint2 = this.u0;
            paint2.setColor(0);
            c3 = 0;
            z4 = z10;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
        } else {
            z4 = z10;
            f10 = 0.0f;
            c3 = 0;
        }
        if (dp2 <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.z0;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = l4Var.r0[1].getBackgroundColor();
        Paint paint3 = this.v0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(l4Var.r0[c3].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = l4Var.r0[c3].getX();
        canvas.drawRect(rectF2, paint3);
        l4Var.e0.p0 = z4 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + l4Var.F0;
        if (e6 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e6);
            canvas.translate(0.0f, lerp2);
            l4Var.e0.a(canvas, org.telegram.messenger.y3.C(20.0f, l10, 1) - lerp2, e6, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!l4Var.r0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (e6 < 1.0f) {
            int d = i0.a.d(e6, org.telegram.ui.ActionBar.k6.l1(0.15f, AndroidUtilities.computePerceivedBrightness(y3Var.j()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.w0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width2 = getWidth() / 2.0f;
            float dp3 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e6);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e6) / 2.0f;
            rectF.set(width2 - lerp3, dp3 - AndroidUtilities.dp(2.0f), width2 + lerp3, dp3 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            y3 y3Var = this.E0;
            if (y10 < (y3Var.C ? 0 : y3Var.l())) {
                y3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public RectF getRect() {
        y3 y3Var = this.E0;
        float max = (Math.max(1.0f - y3Var.w, y3Var.x) * y3Var.k()) + (y3Var.C ? 0 : y3Var.l() - AndroidUtilities.dp(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.B0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.E0.n();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (!l4Var.L0.y()) {
            if (!(l4Var.r0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                y3Var.e(false, null);
            } else {
                y3Var.dismiss(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
            AndroidUtilities.cancelRunOnUIThread(m9Var.g0);
            m9Var.z = false;
        }
        this.D0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        if (!y3Var.E) {
            y3Var.E = i11 != 0;
        }
        if ((l4Var.r0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !l4Var.L0.y()) {
            iArr[1] = Math.min((int) (y3Var.k() * y3Var.x), i11);
            y3Var.x = Utilities.clamp(y3Var.x - (i11 / y3Var.k()), 1.0f, 0.0f);
            y3Var.n();
            y3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
        AndroidUtilities.cancelRunOnUIThread(m9Var.g0);
        m9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.D0 = false;
        this.E0.getClass();
        return i10 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        y3 y3Var = this.E0;
        y3Var.E = false;
        if (!this.D0 && !y3Var.H.L0.y()) {
            if (y3Var.x > 0.25f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.v3
    public void setDrawingFromOverlay(boolean z4) {
        if (this.y0 != z4) {
            this.y0 = z4;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.v3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        y3 y3Var = this.E0;
        l4 l4Var = y3Var.H;
        float f12 = 1.0f - f10;
        float min = Math.min(y3Var.w, 1.0f - y3Var.x) * f12;
        Paint paint = this.t0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.F) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false);
        Paint paint2 = this.v0;
        paint2.setColor(w02);
        Path path = this.C0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (y3Var.C) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                l4Var.e0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f10);
            float f13 = lerp2 - 1.0f;
            if (Math.abs(f13) > 0.01f) {
                canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f13) > 0.01f) {
                float f14 = 1.0f / lerp2;
                canvas.scale(f14, f14, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((y3Var.C ? l4Var.e0.getMeasuredHeight() : 0) * f12) + (-y3Var.l()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
