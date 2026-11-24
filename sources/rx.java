// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rx extends ela implements dz0 {
    public final Paint m0;
    public final Paint n0;
    public final Paint o0;
    public final Paint p0;
    public final ln q0;
    public boolean r0;
    public final Path s0;
    public final RectF t0;
    public final RectF u0;
    public final Path v0;
    public boolean w0;
    public final /* synthetic */ sx x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(sx sxVar, Context context) {
        super(context, null);
        this.x0 = sxVar;
        this.m0 = new Paint(1);
        this.n0 = new Paint(1);
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        new Paint(1);
        this.q0 = new ln(this, 0L, 420L, d53.h);
        this.s0 = new Path();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (this.r0) {
            return;
        }
        float min = Math.min(sxVar.x, 1.0f - sxVar.y);
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - sxVar.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x = sxVar.x() - gm.L(20.0f);
        boolean z2 = x < a.getCurrentActionBarHeight() + gm.m && min > 0.95f;
        if (sxVar.G != z2) {
            sxVar.G = z2;
            sxVar.u();
        }
        float d = this.q0.d(z2);
        if (sxVar.H != (d >= 0.999f)) {
            sxVar.H = d >= 0.999f;
            sxVar.r();
        }
        int U1 = gm.U1(Utilities.l(d), x, 0);
        float max = Math.max(1.0f - sxVar.x, sxVar.y) * sxVar.w();
        canvas.save();
        canvas.translate(getWidth() * sxVar.J, max);
        float f2 = U1;
        float width = getWidth();
        float L = gm.L(16.0f) + getHeight();
        RectF rectF = this.t0;
        rectF.set(0.0f, f2, width, L);
        float f3 = 1.0f - d;
        float L2 = gm.L(24.0f) * f3;
        if (d < 1.0f) {
            Paint paint2 = this.n0;
            paint2.setColor(0);
            i = 0;
            z = z2;
            f = 0.0f;
            paint2.setShadowLayer(gm.L(18.0f), 0.0f, -gm.L(3.0f), cmb.p1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L2, L2, paint2);
        } else {
            z = z2;
            i = 0;
            f = 0.0f;
        }
        if (L2 <= f) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.s0;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = oVar.v0[1].getBackgroundColor();
        Paint paint3 = this.o0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(oVar.v0[i].getBackgroundColor());
        RectF rectF2 = gm.P;
        rectF2.set(rectF);
        rectF2.left = oVar.v0[i].getX();
        canvas.drawRect(rectF2, paint3);
        oVar.i0.t0 = (!z || gm.L(20.0f) + x > gm.m + oVar.K0) ? i : true;
        if (d > 0.0f) {
            canvas.save();
            float U12 = gm.U1(d, gm.L(20.0f) + x + 1, i);
            canvas.translate(0.0f, U12);
            oVar.i0.a(canvas, hg9.v(20.0f, x, 1) - U12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!gm.m0 && (!oVar.v0[0].e() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (d < 1.0f) {
            int f4 = on2.f(d, cmb.p1(0.15f, gm.B(sxVar.v()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.p0;
            paint4.setColor(f4);
            paint4.setAlpha((int) (paint4.getAlpha() * f3));
            float width2 = getWidth() / 2.0f;
            float L3 = ((gm.L(20.0f) / 2.0f) + f2) - (gm.L(8.0f) * d);
            float U13 = gm.U1(d, gm.L(32.0f), gm.L(48.0f)) / 2.0f;
            rectF.set(width2 - U13, L3 - gm.L(2.0f), width2 + U13, L3 + gm.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            sx sxVar = this.x0;
            if (y < (sxVar.G ? 0 : sxVar.x())) {
                sxVar.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // dz0
    public RectF getRect() {
        sx sxVar = this.x0;
        float max = (Math.max(1.0f - sxVar.x, sxVar.y) * sxVar.w()) + (sxVar.G ? 0 : sxVar.x() - gm.L(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.u0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.x0.A();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (!oVar.Q0.w()) {
            if (!(oVar.v0[0].b() ? !r2.b.canScrollVertically(-1) : false) || f2 >= -1000.0f) {
                sxVar.m(false, null);
            } else {
                sxVar.a(true);
            }
        }
        if (f != 0.0f || f2 != 0.0f) {
            gkb gkbVar = oVar.Q0;
            gm.r(gkbVar.f0);
            gkbVar.z = false;
        }
        this.w0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (!sxVar.I) {
            sxVar.I = i2 != 0;
        }
        if ((oVar.v0[0].b() ? !r0.b.canScrollVertically(-1) : false) && !oVar.Q0.w()) {
            iArr[1] = Math.min((int) (sxVar.w() * sxVar.y), i2);
            sxVar.y = Utilities.i(sxVar.y - (i2 / sxVar.w()), 1.0f, 0.0f);
            sxVar.A();
            sxVar.r();
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        gkb gkbVar = oVar.Q0;
        gm.r(gkbVar.f0);
        gkbVar.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.w0 = false;
        return i == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        sx sxVar = this.x0;
        sxVar.I = false;
        if (!this.w0 && !sxVar.L.Q0.w()) {
            if (sxVar.y > 0.25f) {
                sxVar.a(true);
            } else {
                sxVar.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // dz0
    public void setDrawingFromOverlay(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            invalidate();
        }
    }

    @Override // dz0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        rectF2.set(getRect());
        gm.X1(rectF2, rectF, f, rectF2);
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        float min = Math.min(sxVar.x, 1.0f - sxVar.y);
        float f3 = 1.0f - f;
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - sxVar.J) * min * f3 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float U1 = gm.U1(f, gm.L(16.0f), gm.L(18.0f));
        int w0 = cmb.w0(null, cmb.c6, false);
        Paint paint2 = this.o0;
        paint2.setColor(w0);
        Path path = this.v0;
        path.rewind();
        path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (sxVar.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                oVar.i0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float R1 = gm.R1(1.0f, 0.99f, f);
            float f4 = R1 - 1.0f;
            if (Math.abs(f4) > 0.01f) {
                canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f4) > 0.01f) {
                float f5 = 1.0f / R1;
                canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((sxVar.G ? oVar.i0.getMeasuredHeight() : 0) * f3) + (-sxVar.x()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return U1;
    }
}
