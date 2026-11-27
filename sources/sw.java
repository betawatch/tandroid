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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sw extends wma implements ey0 {
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint j0;
    public final mm k0;
    public boolean l0;
    public final Path m0;
    public final RectF n0;
    public final RectF o0;
    public final Path p0;
    public boolean q0;
    public final /* synthetic */ tw r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(tw twVar, Context context) {
        super(context, null);
        this.r0 = twVar;
        this.g0 = new Paint(1);
        this.h0 = new Paint(1);
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        new Paint(1);
        this.k0 = new mm(this, 0L, 420L, k43.h);
        this.m0 = new Path();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (this.l0) {
            return;
        }
        float min = Math.min(twVar.x, 1.0f - twVar.y);
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - twVar.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x = twVar.x() - hl.L(20.0f);
        boolean z2 = x < a.getCurrentActionBarHeight() + hl.m && min > 0.95f;
        if (twVar.G != z2) {
            twVar.G = z2;
            twVar.t();
        }
        float d = this.k0.d(z2);
        if (twVar.H != (d >= 0.999f)) {
            twVar.H = d >= 0.999f;
            twVar.r();
        }
        int U1 = hl.U1(Utilities.l(d), x, 0);
        float max = Math.max(1.0f - twVar.x, twVar.y) * twVar.w();
        canvas.save();
        canvas.translate(getWidth() * twVar.J, max);
        float f2 = U1;
        float width = getWidth();
        float L = hl.L(16.0f) + getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, f2, width, L);
        float f3 = 1.0f - d;
        float L2 = hl.L(24.0f) * f3;
        if (d < 1.0f) {
            Paint paint2 = this.h0;
            paint2.setColor(0);
            i = 0;
            z = z2;
            f = 0.0f;
            paint2.setShadowLayer(hl.L(18.0f), 0.0f, -hl.L(3.0f), aob.p1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L2, L2, paint2);
        } else {
            z = z2;
            i = 0;
            f = 0.0f;
        }
        if (L2 <= f) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = oVar.v0[1].getBackgroundColor();
        Paint paint3 = this.i0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(oVar.v0[i].getBackgroundColor());
        RectF rectF2 = hl.P;
        rectF2.set(rectF);
        rectF2.left = oVar.v0[i].getX();
        canvas.drawRect(rectF2, paint3);
        oVar.i0.t0 = (!z || hl.L(20.0f) + x > hl.m + oVar.K0) ? i : true;
        if (d > 0.0f) {
            canvas.save();
            float U12 = hl.U1(d, hl.L(20.0f) + x + 1, i);
            canvas.translate(0.0f, U12);
            oVar.i0.a(canvas, uh9.w(20.0f, x, 1) - U12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!hl.m0 && (!oVar.v0[0].e() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (d < 1.0f) {
            int f4 = vm2.f(d, aob.p1(0.15f, hl.B(twVar.v()) < 0.721f ? -1 : -16777216), -16777216);
            Paint paint4 = this.j0;
            paint4.setColor(f4);
            paint4.setAlpha((int) (paint4.getAlpha() * f3));
            float width2 = getWidth() / 2.0f;
            float L3 = ((hl.L(20.0f) / 2.0f) + f2) - (hl.L(8.0f) * d);
            float U13 = hl.U1(d, hl.L(32.0f), hl.L(48.0f)) / 2.0f;
            rectF.set(width2 - U13, L3 - hl.L(2.0f), width2 + U13, L3 + hl.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            tw twVar = this.r0;
            if (y < (twVar.G ? 0 : twVar.x())) {
                twVar.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // ey0
    public RectF getRect() {
        tw twVar = this.r0;
        float max = (Math.max(1.0f - twVar.x, twVar.y) * twVar.w()) + (twVar.G ? 0 : twVar.x() - hl.L(20.0f));
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.o0;
        rectF.set(0.0f, max, width, height);
        return rectF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.r0.A();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (!oVar.Q0.w()) {
            if (!(oVar.v0[0].b() ? !r2.b.canScrollVertically(-1) : false) || f2 >= -1000.0f) {
                twVar.m(false, null);
            } else {
                twVar.a(true);
            }
        }
        if (f != 0.0f || f2 != 0.0f) {
            amb ambVar = oVar.Q0;
            hl.r(ambVar.f0);
            ambVar.z = false;
        }
        this.q0 = true;
        return onNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (!twVar.I) {
            twVar.I = i2 != 0;
        }
        if ((oVar.v0[0].b() ? !r0.b.canScrollVertically(-1) : false) && !oVar.Q0.w()) {
            iArr[1] = Math.min((int) (twVar.w() * twVar.y), i2);
            twVar.y = Utilities.i(twVar.y - (i2 / twVar.w()), 1.0f, 0.0f);
            twVar.A();
            twVar.r();
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        amb ambVar = oVar.Q0;
        hl.r(ambVar.f0);
        ambVar.z = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.q0 = false;
        return i == 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        tw twVar = this.r0;
        twVar.I = false;
        if (!this.q0 && !twVar.L.Q0.w()) {
            if (twVar.y > 0.25f) {
                twVar.a(true);
            } else {
                twVar.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override // ey0
    public void setDrawingFromOverlay(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            invalidate();
        }
    }

    @Override // ey0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        rectF2.set(getRect());
        hl.X1(rectF2, rectF, f, rectF2);
        tw twVar = this.r0;
        o oVar = twVar.L;
        float min = Math.min(twVar.x, 1.0f - twVar.y);
        float f3 = 1.0f - f;
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - twVar.J) * min * f3 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float U1 = hl.U1(f, hl.L(16.0f), hl.L(18.0f));
        int w0 = aob.w0(null, aob.d6, false);
        Paint paint2 = this.i0;
        paint2.setColor(w0);
        Path path = this.p0;
        path.rewind();
        path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (twVar.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                oVar.i0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float R1 = hl.R1(1.0f, 0.99f, f);
            float f4 = R1 - 1.0f;
            if (Math.abs(f4) > 0.01f) {
                canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f4) > 0.01f) {
                float f5 = 1.0f / R1;
                canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
            }
            canvas.translate(0.0f, ((twVar.G ? oVar.i0.getMeasuredHeight() : 0) * f3) + (-twVar.x()) + rectF2.top);
            childAt.draw(canvas);
            canvas.restore();
        }
        return U1;
    }
}
