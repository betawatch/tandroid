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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u3 extends org.telegram.ui.Components.vw0 implements org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.z3 {
    public final Paint l0;
    public final Paint m0;
    public final Paint n0;
    public final Paint o0;
    public final org.telegram.ui.Components.h6 p0;
    public boolean q0;
    public final Path r0;
    public final RectF s0;
    public final RectF t0;
    public final Path u0;
    public boolean v0;
    public final /* synthetic */ v3 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(v3 v3Var, Context context) {
        super(context, null);
        this.w0 = v3Var;
        this.l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.n0 = new Paint(1);
        this.o0 = new Paint(1);
        new Paint(1);
        this.p0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
        this.r0 = new Path();
        this.s0 = new RectF();
        new RectF();
        this.t0 = new RectF();
        this.u0 = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        float f7;
        v3 v3Var = this.w0;
        j4 j4Var = v3Var.K;
        if (this.q0) {
            return;
        }
        float min = Math.min(v3Var.w, 1.0f - v3Var.x);
        Paint paint = this.l0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - v3Var.I) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int l4 = v3Var.l() - AndroidUtilities.dp(20.0f);
        boolean z11 = l4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && min > 0.95f;
        if (v3Var.F != z11) {
            v3Var.F = z11;
            v3Var.i();
        }
        float e = this.p0.e(z11);
        if (v3Var.G != (e >= 0.999f)) {
            v3Var.G = e >= 0.999f;
            v3Var.h();
        }
        int lerp = AndroidUtilities.lerp(l4, 0, Utilities.clamp01(e));
        float max = Math.max(1.0f - v3Var.w, v3Var.x) * v3Var.k();
        canvas.save();
        canvas.translate(getWidth() * v3Var.I, max);
        float f10 = lerp;
        float width = getWidth();
        float dp = AndroidUtilities.dp(16.0f) + getHeight();
        RectF rectF = this.s0;
        rectF.set(0.0f, f10, width, dp);
        float f11 = 1.0f - e;
        float dp2 = AndroidUtilities.dp(24.0f) * f11;
        if (e < 1.0f) {
            Paint paint2 = this.m0;
            paint2.setColor(0);
            i10 = 0;
            z10 = z11;
            f7 = 0.0f;
            paint2.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.o1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
        } else {
            z10 = z11;
            i10 = 0;
            f7 = 0.0f;
        }
        if (dp2 <= f7) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.r0;
            path.rewind();
            path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = j4Var.u0[1].getBackgroundColor();
        Paint paint3 = this.n0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(j4Var.u0[i10].getBackgroundColor());
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        rectF2.left = j4Var.u0[i10].getX();
        canvas.drawRect(rectF2, paint3);
        j4Var.h0.s0 = (!z10 || AndroidUtilities.dp(20.0f) + l4 > AndroidUtilities.statusBarHeight + j4Var.J0) ? i10 : true;
        if (e > 0.0f) {
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + l4 + 1, i10, e);
            canvas.translate(0.0f, lerp2);
            j4Var.h0.a(canvas, org.telegram.messenger.t.D(20.0f, l4, 1) - lerp2, e, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!AndroidUtilities.makingGlobalBlurBitmap && (!j4Var.u0[0].f() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (e < 1.0f) {
            int f12 = i0.a.f(e, org.telegram.ui.ActionBar.y6.o1(0.15f, AndroidUtilities.computePerceivedBrightness(v3Var.j()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.o0;
            paint4.setColor(f12);
            paint4.setAlpha((int) (paint4.getAlpha() * f11));
            float width2 = getWidth() / 2.0f;
            float dp3 = ((AndroidUtilities.dp(20.0f) / 2.0f) + f10) - (AndroidUtilities.dp(8.0f) * e);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), e) / 2.0f;
            rectF.set(width2 - lerp3, dp3 - AndroidUtilities.dp(2.0f), width2 + lerp3, dp3 + AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            v3 v3Var = this.w0;
            if (y3 < (v3Var.F ? 0 : v3Var.l())) {
                v3Var.dismiss(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.z3
    public RectF getRect() {
        v3 v3Var = this.w0;
        float max = (Math.max(1.0f - v3Var.w, v3Var.x) * v3Var.k()) + (v3Var.F ? 0 : v3Var.l() - AndroidUtilities.dp(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.t0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.w0.n();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f7, f10);
        v3 v3Var = this.w0;
        j4 j4Var = v3Var.K;
        if (!j4Var.P0.x()) {
            if (!(j4Var.u0[0].c() ? !r2.b.canScrollVertically(-1) : false) || f10 >= -1000.0f) {
                v3Var.e(false, null);
            } else {
                v3Var.dismiss(true);
            }
        }
        if (f7 != 0.0f || f10 != 0.0f) {
            org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
            AndroidUtilities.cancelRunOnUIThread(s9Var.f0);
            s9Var.z = false;
        }
        this.v0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        v3 v3Var = this.w0;
        j4 j4Var = v3Var.K;
        if (!v3Var.H) {
            v3Var.H = i11 != 0;
        }
        if ((j4Var.u0[0].c() ? !r1.b.canScrollVertically(-1) : false) && !j4Var.P0.x()) {
            iArr[1] = Math.min((int) (v3Var.k() * v3Var.x), i11);
            v3Var.x = Utilities.clamp(v3Var.x - (i11 / v3Var.k()), 1.0f, 0.0f);
            v3Var.n();
            v3Var.h();
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
        AndroidUtilities.cancelRunOnUIThread(s9Var.f0);
        s9Var.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        this.v0 = false;
        this.w0.getClass();
        return i10 == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        v3 v3Var = this.w0;
        v3Var.H = false;
        if (!this.v0 && !v3Var.K.P0.x()) {
            if (v3Var.x > 0.25f) {
                v3Var.dismiss(true);
            } else {
                v3Var.e(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // org.telegram.ui.ActionBar.z3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.q0 != z10) {
            this.q0 = z10;
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z3
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        rectF2.set(getRect());
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF2);
        v3 v3Var = this.w0;
        j4 j4Var = v3Var.K;
        float f11 = 1.0f - f7;
        float min = Math.min(v3Var.w, 1.0f - v3Var.x) * f11;
        Paint paint = this.l0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - v3Var.I) * min * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f7);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
        Paint paint2 = this.n0;
        paint2.setColor(x02);
        Path path = this.u0;
        path.rewind();
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (v3Var.F) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                j4Var.h0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float lerp2 = AndroidUtilities.lerp(1.0f, 0.99f, f7);
            float f12 = lerp2 - 1.0f;
            if (Math.abs(f12) > 0.01f) {
                canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f12) > 0.01f) {
                float f13 = 1.0f / lerp2;
                canvas.scale(f13, f13, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((v3Var.F ? j4Var.h0.getMeasuredHeight() : 0) * f11) + (-v3Var.l()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return lerp;
    }
}
