package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.be;
import org.telegram.ui.kg1;
import org.telegram.ui.l61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class d extends FrameLayout implements h90 {
    public boolean B;
    public int C;
    public kg1 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public i90 H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public ValueAnimator N;
    public int O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public float S;
    public boolean T;
    public ValueAnimator U;
    public rp V;
    public int W;
    public org.telegram.ui.ActionBar.f6 a;
    public boolean a0;
    public int b;
    public int b0;
    public final Paint c;
    public boolean c0;
    public final org.telegram.ui.Components.j6 d;
    public int d0;
    public final org.telegram.ui.Components.j6 e;
    public final org.telegram.ui.Components.j6 f;
    public float h;
    public final org.telegram.ui.Components.z5 n;
    public final View r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f.d() + AndroidUtilities.dp(15.66f), this.n.d(this.h, false)) + this.d.d() + (this.Q ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    public float a(float f10, float f11) {
        return f10 * f11;
    }

    @Override // org.telegram.ui.Components.h90
    public final boolean b() {
        return this.K;
    }

    public final void c(int i10, boolean z4) {
        int i11;
        org.telegram.ui.Components.j6 j6Var = this.f;
        if (z4) {
            j6Var.b();
        }
        int i12 = 1;
        if (z4 && i10 != (i11 = this.O) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.N.addListener(new c(this, i12));
            this.N.setInterpolator(new OvershootInterpolator(2.0f));
            this.N.setDuration(200L);
            this.N.start();
        }
        this.O = i10;
        this.h = (i10 != 0 || this.P) ? 1.0f : 0.0f;
        j6Var.q(LocaleController.formatNumber(i10, ' '), z4, true);
        invalidate();
    }

    public final void d() {
        this.w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xa, this.a));
        j();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        setRoundRadius(24);
    }

    public final void f(CharSequence charSequence, boolean z4) {
        int i10 = 0;
        boolean z10 = charSequence != null;
        org.telegram.ui.Components.j6 j6Var = this.e;
        if (z4) {
            j6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.G || z10) {
            j6Var.q(charSequence, z4, true);
        } else {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.F.addListener(new c(this, i10));
            this.F.setDuration(200L);
            this.F.setInterpolator(nr.f);
            this.F.start();
        }
        if (this.G || !z10) {
            return;
        }
        this.G = true;
        ValueAnimator valueAnimator2 = this.F;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.F = null;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, 1.0f);
        this.F = ofFloat2;
        ofFloat2.addUpdateListener(new b(this, 4));
        this.F.setDuration(200L);
        this.F.setInterpolator(nr.f);
        this.F.start();
    }

    public final void g(CharSequence charSequence, boolean z4, boolean z10) {
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z4) {
            j6Var.b();
        }
        j6Var.q(charSequence, z4, z10);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof be);
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.T;
    }

    public final void j() {
        if (!this.x) {
            this.y = org.telegram.ui.ActionBar.j6.v0(this.w ? org.telegram.ui.ActionBar.j6.xa : org.telegram.ui.ActionBar.j6.Oh, this.a);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(this.s ? this.w ? org.telegram.ui.ActionBar.j6.ya : org.telegram.ui.ActionBar.j6.Sh : org.telegram.ui.ActionBar.j6.Oh, this.a);
        org.telegram.ui.Components.j6 j6Var = this.d;
        j6Var.r(v02);
        boolean z4 = this.s;
        View view = this.r;
        if (z4) {
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.a);
            int i10 = this.b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(v03, i10, i10));
        } else {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, j6Var.a.getColor());
            int i11 = this.b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
        }
        this.e.r(org.telegram.ui.ActionBar.j6.v0(this.s ? this.w ? org.telegram.ui.ActionBar.j6.ya : org.telegram.ui.ActionBar.j6.Sh : org.telegram.ui.ActionBar.j6.Oh, this.a));
        this.f.r(this.y);
        this.c.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, this.a));
    }

    public final void k() {
        this.Q = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.R = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.a0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z4;
        float f10;
        this.r.draw(canvas);
        if (this.I) {
            if (this.K) {
                if (this.H == null) {
                    i90 i90Var = new i90(this.a);
                    this.H = i90Var;
                    i90Var.setCallback(this);
                    i90 i90Var2 = this.H;
                    i90Var2.t = 2.0f;
                    i90Var2.C = true;
                    i90Var2.w.setStrokeWidth(0.0f);
                    this.H.e(org.telegram.ui.ActionBar.j6.l1(0.02f, -1), org.telegram.ui.ActionBar.j6.l1(0.375f, -1));
                }
                i90 i90Var3 = this.H;
                i90Var3.c = -1L;
                i90Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.j(this.b);
                this.H.draw(canvas);
            } else {
                i90 i90Var4 = this.H;
                if (i90Var4 != null) {
                    i90Var4.a();
                    this.H.draw(canvas);
                    if (this.H.b()) {
                        this.H.b = -1L;
                    }
                }
            }
        }
        float f11 = this.J;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (f11 > 0.0f) {
            if (this.V == null) {
                this.V = new rp(j6Var.a.getColor());
            }
            int dp = (int) ((1.0f - this.J) * AndroidUtilities.dp(24.0f));
            this.V.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.V.setAlpha((int) (this.J * 255.0f));
            this.V.draw(canvas);
            invalidate();
        }
        float f12 = this.J;
        if (f12 < 1.0f) {
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.J * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.J * 0.4f));
                z4 = true;
            } else {
                z4 = false;
            }
            float d = j6Var.d();
            float d10 = this.n.d(this.h, false);
            float dp2 = this.Q ? AndroidUtilities.dp(12.0f) : 0.0f;
            float dp3 = AndroidUtilities.dp(15.66f);
            org.telegram.ui.Components.j6 j6Var2 = this.f;
            float a2 = a(j6Var2.d() + dp3, d10) + d + dp2;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - j6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) kh.a2.b(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + j6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.E));
            j6Var.w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.S) * (1.0f - this.J) * this.W);
            j6Var.setBounds(rect);
            j6Var.draw(canvas);
            if (this.G) {
                org.telegram.ui.Components.j6 j6Var3 = this.e;
                a2 = j6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - j6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) kh.a2.b(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + j6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.E);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                j6Var3.w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.S) * (1.0f - this.J) * 200.0f * this.E);
                j6Var3.setBounds(rect);
                j6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (e2.c.x(getMeasuredWidth(), a2, 2.0f, d) + AndroidUtilities.dp(this.B ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), j6Var2.d() + dp2) + e2.c.x(getMeasuredWidth(), a2, 2.0f, d) + AndroidUtilities.dp((this.B ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.M != 1.0f) {
                canvas.save();
                float f13 = this.M;
                canvas.scale(f13, f13, rect.centerX(), rect.centerY());
            }
            if (this.B) {
                f10 = 0.5f;
                int lerp2 = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.S) * (1.0f - this.J) * this.W * d10 * d10);
                Paint paint = this.c;
                paint.setAlpha(lerp2);
                float dp4 = AndroidUtilities.dp(this.Q ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, dp4, dp4, paint);
            } else {
                f10 = 0.5f;
            }
            CharSequence charSequence = j6Var2.g;
            rect.offset(-AndroidUtilities.dp((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            float y10 = org.telegram.messenger.y3.y(1.0f, this.J, this.W, d10);
            if (this.B) {
                f10 = 1.0f;
            }
            j6Var2.w = (int) (y10 * f10);
            j6Var2.setBounds(rect);
            canvas.save();
            if (this.B && this.Q) {
                this.R.setAlpha((int) ((1.0f - this.J) * this.W * d10 * 1.0f));
                this.R.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.R.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.R.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.R.draw(canvas);
                canvas.translate(dp2 / 2.0f, 0.0f);
            }
            j6Var2.draw(canvas);
            canvas.restore();
            if (this.M != 1.0f) {
                canvas.restore();
            }
            if (z4) {
                canvas.restore();
            }
        }
        if (!this.v || this.d0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.d0 = wrapWidth;
        requestLayout();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.v) {
            if (!this.c0) {
                super.onMeasure(i10, i11);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.b0), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.d0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i10) {
        if (this.s) {
            this.x = true;
            int dp = AndroidUtilities.dp(this.b);
            this.y = i10;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, i10));
            return;
        }
        this.d.r(i10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i10);
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setCountFilled(boolean z4) {
        this.B = z4;
        float dp = AndroidUtilities.dp(z4 ? 12.0f : 14.0f);
        org.telegram.ui.Components.j6 j6Var = this.f;
        j6Var.t(dp);
        j6Var.r(this.B ? this.y : this.d.a.getColor());
    }

    public void setCounterColor(int i10) {
        this.f.r(i10);
        this.R.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.U = null;
            }
            float f10 = this.S;
            this.T = z4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.U.start();
        }
        super.setEnabled(z4);
    }

    public void setFilled(boolean z4) {
        if (this.s == z4) {
            return;
        }
        this.s = z4;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z4) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(this.b), this.y));
            j6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            j6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z4) {
        this.I = z4;
    }

    public void setGlobalAlpha(float f10) {
        this.W = (int) (f10 * 255.0f);
    }

    @Override // org.telegram.ui.Components.h90
    public void setLoading(boolean z4) {
        if (this.K != z4) {
            if (this.I) {
                this.K = z4;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            float f10 = this.J;
            this.K = z4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.L.addListener(new l61(6, this, z4));
            this.L.setDuration(320L);
            this.L.setInterpolator(nr.h);
            this.L.start();
        }
    }

    public void setMinWidth(int i10) {
        this.c0 = true;
        this.b0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.b = i10;
        if (this.s) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(i10), this.y));
        } else {
            setBackground(null);
        }
        j();
    }

    public void setShowZero(boolean z4) {
        this.P = z4;
    }

    public void setText(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.w = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.j6 j6Var = this.d;
        j6Var.r(i10);
        if (this.s) {
            return;
        }
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, j6Var.a.getColor());
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setUseWrapContent(boolean z4) {
        this.v = z4;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.H == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.b = 8;
        nr nrVar = nr.h;
        this.n = new org.telegram.ui.Components.z5(350L, nrVar);
        this.B = true;
        this.C = 0;
        this.E = 0.0f;
        this.J = 0.0f;
        this.M = 1.0f;
        this.S = 1.0f;
        this.T = true;
        this.W = 255;
        this.s = z4;
        this.a = f6Var;
        k7.d6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, k7.b6.c(-1.0f, -1));
        if (z4) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            this.y = v02;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.d = j6Var;
        j6Var.k(0.3f, 250L, nrVar);
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(14.0f));
        if (z4) {
            j6Var.u(AndroidUtilities.bold());
        }
        j6Var.b = 1;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(i(), true, false, false);
        this.e = j6Var2;
        j6Var2.k(0.3f, 250L, nrVar);
        j6Var2.setCallback(this);
        j6Var2.t(AndroidUtilities.dp(12.0f));
        j6Var2.b = 1;
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(false, false, true, false);
        this.f = j6Var3;
        j6Var3.k(0.3f, 250L, nrVar);
        j6Var3.setCallback(this);
        j6Var3.t(AndroidUtilities.dp(12.0f));
        j6Var3.u(AndroidUtilities.bold());
        j6Var3.q("", true, true);
        j6Var3.b = 1;
        setWillNotDraw(false);
        j();
    }
}
