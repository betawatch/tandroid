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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x3 extends org.telegram.ui.Components.xu0 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public final RectF A0;
    public final Path B0;
    public boolean C0;
    public final /* synthetic */ y3 D0;
    public final Paint s0;
    public final Paint t0;
    public final Paint u0;
    public final Paint v0;
    public final org.telegram.ui.Components.y5 w0;
    public boolean x0;
    public final Path y0;
    public final RectF z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(y3 y3Var, Context context) {
        super(context, null);
        this.D0 = y3Var;
        this.s0 = new Paint(1);
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new Paint(1);
        new Paint(1);
        this.w0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.y0 = new Path();
        this.z0 = new RectF();
        new RectF();
        this.A0 = new RectF();
        this.B0 = new Path();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        char c10;
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (this.x0) {
            return;
        }
        float min = Math.min(y3Var.w, 1.0f - y3Var.x);
        Paint paint = this.s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.E) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = y3Var.l() - AndroidUtilities.dp(20.0f);
        boolean z11 = l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f;
        if (y3Var.B != z11) {
            y3Var.B = z11;
            y3Var.i();
        }
        float e10 = this.w0.e(z11);
        if (y3Var.C != (e10 >= 0.999f)) {
            y3Var.C = e10 >= 0.999f;
            y3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e10));
        float max = Math.max(1.0f - y3Var.w, y3Var.x) * y3Var.k();
        canvas.save();
        canvas.translate(getWidth() * y3Var.E, max);
        float f11 = lerp;
        float width = getWidth();
        float dp = AndroidUtilities.dp(16.0f) + getHeight();
        RectF rectF = this.z0;
        rectF.set(0.0f, f11, width, dp);
        float f12 = 1.0f - e10;
        float dp2 = AndroidUtilities.dp(24.0f) * f12;
        if (e10 < 1.0f) {
            Paint paint2 = this.t0;
            paint2.setColor(0);
            c10 = 0;
            z10 = z11;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.l1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
        } else {
            z10 = z11;
            f10 = 0.0f;
            c10 = 0;
        }
        if (dp2 <= f10) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.y0;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = l4Var.q0[1].getBackgroundColor();
        Paint paint3 = this.u0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(l4Var.q0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = l4Var.q0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        l4Var.d0.o0 = z10 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + l4Var.E0;
        if (e10 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e10);
            canvas.translate(0.0f, lerp2);
            l4Var.d0.a(canvas, org.telegram.messenger.l0.C(20.0f, l10, 1) - lerp2, e10, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!l4Var.q0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (e10 < 1.0f) {
            int d = i0.a.d(e10, org.telegram.ui.ActionBar.f6.l1(0.15f, AndroidUtilities.computePerceivedBrightness(y3Var.j()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.v0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width2 = getWidth() / 2.0f;
            float dp3 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e10);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e10) / 2.0f;
            rectF.set(width2 - lerp3, dp3 - AndroidUtilities.dp(2.0f), width2 + lerp3, dp3 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            y3 y3Var = this.D0;
            if (y10 < (y3Var.B ? 0 : y3Var.l())) {
                y3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        y3 y3Var = this.D0;
        float max = (Math.max(1.0f - y3Var.w, y3Var.x) * y3Var.k()) + (y3Var.B ? 0 : y3Var.l() - AndroidUtilities.dp(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.D0.n();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (!l4Var.K0.y()) {
            if (!(l4Var.q0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                y3Var.e(false, null);
            } else {
                y3Var.dismiss(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            AndroidUtilities.cancelRunOnUIThread(n9Var.g0);
            n9Var.z = false;
        }
        this.C0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        if (!y3Var.D) {
            y3Var.D = i10 != 0;
        }
        if ((l4Var.q0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !l4Var.K0.y()) {
            iArr[1] = Math.min((int) (y3Var.k() * y3Var.x), i10);
            y3Var.x = Utilities.clamp(y3Var.x - (i10 / y3Var.k()), 1.0f, 0.0f);
            y3Var.n();
            y3Var.h();
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
        AndroidUtilities.cancelRunOnUIThread(n9Var.g0);
        n9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        this.C0 = false;
        this.D0.getClass();
        return i9 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        y3 y3Var = this.D0;
        y3Var.D = false;
        if (!this.C0 && !y3Var.G.K0.y()) {
            if (y3Var.x > 0.25f) {
                y3Var.dismiss(true);
            } else {
                y3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.x0 != z10) {
            this.x0 = z10;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF2);
        y3 y3Var = this.D0;
        l4 l4Var = y3Var.G;
        float f12 = 1.0f - f10;
        float min = Math.min(y3Var.w, 1.0f - y3Var.x) * f12;
        Paint paint = this.s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - y3Var.E) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false);
        Paint paint2 = this.u0;
        paint2.setColor(w02);
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (y3Var.B) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                l4Var.d0.draw(canvas);
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
            canvas.translate(0.0f, ((y3Var.B ? l4Var.d0.getMeasuredHeight() : 0) * f12) + (-y3Var.l()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
