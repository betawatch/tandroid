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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y3 extends org.telegram.ui.Components.zu0 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.t3 {
    public final RectF A0;
    public final Path B0;
    public boolean C0;
    public final /* synthetic */ z3 D0;
    public final Paint s0;
    public final Paint t0;
    public final Paint u0;
    public final Paint v0;
    public final org.telegram.ui.Components.y5 w0;
    public boolean x0;
    public final Path y0;
    public final RectF z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(z3 z3Var, Context context) {
        super(context, null);
        this.D0 = z3Var;
        this.s0 = new Paint(1);
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new Paint(1);
        new Paint(1);
        this.w0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.er.h);
        this.y0 = new Path();
        this.z0 = new RectF();
        new RectF();
        this.A0 = new RectF();
        this.B0 = new Path();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        char c10;
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (this.x0) {
            return;
        }
        float min = Math.min(z3Var.w, 1.0f - z3Var.x);
        Paint paint = this.s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l10 = z3Var.l() - AndroidUtilities.dp(20.0f);
        boolean z11 = l10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f;
        if (z3Var.B != z11) {
            z3Var.B = z11;
            z3Var.i();
        }
        float e9 = this.w0.e(z11);
        if (z3Var.C != (e9 >= 0.999f)) {
            z3Var.C = e9 >= 0.999f;
            z3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l10, 0, Utilities.clamp01(e9));
        float max = Math.max(1.0f - z3Var.w, z3Var.x) * z3Var.k();
        canvas.save();
        canvas.translate(getWidth() * z3Var.E, max);
        float f11 = lerp;
        float width = getWidth();
        float dp = AndroidUtilities.dp(16.0f) + getHeight();
        RectF rectF = this.z0;
        rectF.set(0.0f, f11, width, dp);
        float f12 = 1.0f - e9;
        float dp2 = AndroidUtilities.dp(24.0f) * f12;
        if (e9 < 1.0f) {
            Paint paint2 = this.t0;
            paint2.setColor(0);
            c10 = 0;
            z10 = z11;
            f10 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(min * 0.26f, -16777216));
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
        int backgroundColor = m4Var.q0[1].getBackgroundColor();
        Paint paint3 = this.u0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(m4Var.q0[c10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = m4Var.q0[c10].getX();
        canvas.drawRect(rectF2, paint3);
        m4Var.d0.o0 = z10 && AndroidUtilities.dp(20.0f) + l10 <= AndroidUtilities.statusBarHeight + m4Var.E0;
        if (e9 > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l10 + 1, 0, e9);
            canvas.translate(0.0f, lerp2);
            m4Var.d0.a(canvas, org.telegram.messenger.y1.C(20.0f, l10, 1) - lerp2, e9, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!m4Var.q0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (e9 < 1.0f) {
            int d = i0.b.d(e9, org.telegram.ui.ActionBar.g6.l1(0.15f, AndroidUtilities.computePerceivedBrightness(z3Var.j()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.v0;
            paint4.setColor(d);
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
            float width2 = getWidth() / 2.0f;
            float dp3 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f11) - (AndroidUtilities.dp(8.0f) * e9);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e9) / 2.0f;
            rectF.set(width2 - lerp3, dp3 - AndroidUtilities.dp(2.0f), width2 + lerp3, dp3 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            z3 z3Var = this.D0;
            if (y10 < (z3Var.B ? 0 : z3Var.l())) {
                z3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        z3 z3Var = this.D0;
        float max = (Math.max(1.0f - z3Var.w, z3Var.x) * z3Var.k()) + (z3Var.B ? 0 : z3Var.l() - AndroidUtilities.dp(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.A0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.D0.n();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f10, f11);
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!m4Var.K0.y()) {
            if (!(m4Var.q0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f11 >= -1000.0f) {
                z3Var.e(false, null);
            } else {
                z3Var.dismiss(true);
            }
        }
        if (f10 != 0.0f || f11 != 0.0f) {
            org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
            AndroidUtilities.cancelRunOnUIThread(j9Var.g0);
            j9Var.z = false;
        }
        this.C0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        if (!z3Var.D) {
            z3Var.D = i11 != 0;
        }
        if ((m4Var.q0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !m4Var.K0.y()) {
            iArr[1] = Math.min((int) (z3Var.k() * z3Var.x), i11);
            z3Var.x = Utilities.clamp(z3Var.x - (i11 / z3Var.k()), 1.0f, 0.0f);
            z3Var.n();
            z3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
        AndroidUtilities.cancelRunOnUIThread(j9Var.g0);
        j9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.C0 = false;
        this.D0.getClass();
        return i10 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        z3 z3Var = this.D0;
        z3Var.D = false;
        if (!this.C0 && !z3Var.G.K0.y()) {
            if (z3Var.x > 0.25f) {
                z3Var.dismiss(true);
            } else {
                z3Var.e(false, null);
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
        z3 z3Var = this.D0;
        m4 m4Var = z3Var.G;
        float f12 = 1.0f - f10;
        float min = Math.min(z3Var.w, 1.0f - z3Var.x) * f12;
        Paint paint = this.s0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - z3Var.E) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f10);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
        Paint paint2 = this.u0;
        paint2.setColor(w02);
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (z3Var.B) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                m4Var.d0.draw(canvas);
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
            canvas.translate(0.0f, ((z3Var.B ? m4Var.d0.getMeasuredHeight() : 0) * f12) + (-z3Var.l()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
