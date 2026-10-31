package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.be;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements s80, org.telegram.ui.ActionBar.k6 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public th.o0 J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public t80 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.p6 a;
    public Drawable a0;
    public int b;
    public float b0;
    public final Paint c;
    public boolean c0;
    public final org.telegram.ui.Components.e6 d;
    public ValueAnimator d0;
    public final org.telegram.ui.Components.e6 e;
    public kp e0;
    public final org.telegram.ui.Components.e6 f;
    public int f0;
    public boolean g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public final org.telegram.ui.Components.t5 n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public d(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + org.telegram.messenger.i0.L(15.66f), this.n.e(false, this.h)) + this.d.c() + (this.W ? org.telegram.messenger.i0.L(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i10) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.G != i10) {
            this.G = i10;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i10));
            } else {
                int i11 = this.b;
                view.setBackground(org.telegram.ui.ActionBar.t6.a0(i10, i11, i11));
            }
        }
    }

    @Override // org.telegram.ui.Components.s80
    public final boolean a() {
        return this.Q;
    }

    public float b(float f7, float f10) {
        return f7 * f10;
    }

    public final void c(int i10, boolean z10) {
        int i11;
        org.telegram.ui.Components.e6 e6Var = this.f;
        if (z10) {
            e6Var.a();
        }
        int i12 = 1;
        if (z10 && i10 != (i11 = this.U) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, i12));
            z20.j(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i10;
        this.h = (i10 != 0 || this.V) ? 1.0f : 0.0f;
        e6Var.t(cd.E(i10, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(this.b), this.D);
        if (this.y) {
            setBackground(d02);
            return;
        }
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(this.x ? org.telegram.ui.ActionBar.t6.lb : org.telegram.ui.ActionBar.t6.Ci);
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.D = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.lb, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        int i10 = 0;
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.e6 e6Var = this.e;
        if (z10) {
            e6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.M || z11) {
            e6Var.t(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.L.addListener(new c(this, i10));
            this.L.setDuration(200L);
            this.L.setInterpolator(gr.f);
            this.L.start();
        }
        if (this.M || !z11) {
            return;
        }
        this.M = true;
        ValueAnimator valueAnimator2 = this.L;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.L = null;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
        this.L = ofFloat2;
        ofFloat2.addUpdateListener(new b(this, 4));
        this.L.setDuration(200L);
        this.L.setInterpolator(gr.f);
        this.L.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (z10) {
            e6Var.a();
        }
        e6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.c0;
    }

    public boolean j() {
        return !(this instanceof be);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.D, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.g0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f7;
        this.r.draw(canvas);
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    t80 t80Var = new t80(this.a);
                    this.N = t80Var;
                    t80Var.setCallback(this);
                    t80 t80Var2 = this.N;
                    t80Var2.t = 2.0f;
                    t80Var2.D = true;
                    t80Var2.x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.t6.r1(0.02f, -1), org.telegram.ui.ActionBar.t6.r1(0.375f, -1));
                }
                t80 t80Var3 = this.N;
                t80Var3.c = -1L;
                t80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.b);
                this.N.draw(canvas);
            } else {
                t80 t80Var4 = this.N;
                if (t80Var4 != null) {
                    t80Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.b = -1L;
                    }
                }
            }
        }
        float f10 = this.P;
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (f10 > 0.0f) {
            if (this.e0 == null) {
                this.e0 = new kp(e6Var.a.getColor());
            }
            int L = (int) ((1.0f - this.P) * org.telegram.messenger.i0.L(24.0f));
            this.e0.setBounds(0, L, getWidth(), getHeight() + L);
            this.e0.setAlpha((int) (this.P * 255.0f));
            this.e0.draw(canvas);
            invalidate();
        }
        float f11 = this.P;
        if (f11 < 1.0f) {
            if (f11 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * org.telegram.messenger.i0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = e6Var.c();
            float e = this.n.e(false, this.h);
            float L2 = this.W ? org.telegram.messenger.i0.L(12.0f) : 0.0f;
            float L3 = org.telegram.messenger.i0.L(15.66f);
            org.telegram.ui.Components.e6 e6Var2 = this.f;
            float b10 = b(e6Var2.c() + L3, e) + c10 + L2;
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - e6Var.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)), (int) org.telegram.messenger.m5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + e6Var.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.i0.L(7.0f)) * this.K));
            e6Var.B = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0);
            e6Var.setBounds(rect);
            e6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.e6 e6Var3 = this.e;
                b10 = e6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - e6Var3.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)), (int) org.telegram.messenger.m5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + e6Var3.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.i0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.i0.T1(0.1f, 1.0f, this.K);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                e6Var3.B = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * 200.0f * this.K);
                e6Var3.setBounds(rect);
                e6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (c3.i0.B(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.i0.L(this.H ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.i0.L(9.0f), e6Var2.c() + L2) + c3.i0.B(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.i0.L((this.H ? 5 : 2) + 8)), (int) ((org.telegram.messenger.i0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f12 = this.S;
                canvas.scale(f12, f12, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                f7 = 0.5f;
                int T12 = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0 * e * e);
                Paint paint = this.c;
                paint.setAlpha(T12);
                float L4 = org.telegram.messenger.i0.L(this.W ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, L4, L4, paint);
            } else {
                f7 = 0.5f;
            }
            CharSequence charSequence = e6Var2.i;
            rect.offset(-org.telegram.messenger.i0.L((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -org.telegram.messenger.i0.L(0.4f));
            float A = org.telegram.messenger.m5.A(1.0f, this.P, this.f0, e);
            if (this.H) {
                f7 = 1.0f;
            }
            e6Var2.B = (int) (A * f7);
            e6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.a0.setAlpha((int) ((1.0f - this.P) * this.f0 * e * 1.0f));
                this.a0.setBounds(org.telegram.messenger.i0.L(1.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top, this.a0.getIntrinsicWidth() + org.telegram.messenger.i0.L(1.0f) + rect.left, this.a0.getIntrinsicHeight() + org.telegram.messenger.i0.L(2.0f) + rect.top);
                this.a0.draw(canvas);
                canvas.translate(L2 / 2.0f, 0.0f);
            }
            e6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.w || this.j0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.j0 = wrapWidth;
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
        if (!this.w) {
            if (!this.i0) {
                super.onMeasure(i10, i11);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.h0), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.j0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i10) {
        if (this.s) {
            this.y = true;
            int L = org.telegram.messenger.i0.L(this.b);
            this.D = i10;
            setBackground(org.telegram.ui.ActionBar.t6.d0(L, i10));
            return;
        }
        this.E = true;
        this.d.u(i10);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, i10);
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.t6.a0(r12, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        this.H = z10;
        float L = org.telegram.messenger.i0.L(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.e6 e6Var = this.f;
        e6Var.w(L);
        e6Var.u(this.H ? this.D : this.d.a.getColor());
    }

    public void setCounterColor(int i10) {
        this.f.u(i10);
        this.a0.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.c0 != z10) {
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d0 = null;
            }
            float f7 = this.b0;
            this.c0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.d0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (z10) {
            d();
            e6Var.x(org.telegram.messenger.i0.o());
        } else {
            setBackground(null);
            e6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.O = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f0 = (int) (f7 * 255.0f);
    }

    @Override // org.telegram.ui.Components.s80
    public void setLoading(boolean z10) {
        if (this.Q != z10) {
            if (this.O) {
                this.Q = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f7 = this.P;
            this.Q = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new sg.y(7, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(gr.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i10) {
        this.i0 = true;
        this.h0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.b = i10;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.V = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.B = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.e6 e6Var = this.d;
        e6Var.u(i10);
        if (this.s) {
            return;
        }
        setRippleColor(org.telegram.ui.ActionBar.t6.r1(0.1f, e6Var.a.getColor()));
    }

    public void setTextColorKey(int i10) {
        this.F = i10;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.w = z10;
    }

    public void updateColors() {
        if (!this.y) {
            this.D = org.telegram.ui.ActionBar.t6.w0(this.x ? org.telegram.ui.ActionBar.t6.lb : org.telegram.ui.ActionBar.t6.Ci, this.a);
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (!z10) {
            int i10 = this.F;
            if (i10 < 0) {
                i10 = this.s ? this.x ? org.telegram.ui.ActionBar.t6.mb : org.telegram.ui.ActionBar.t6.Gi : org.telegram.ui.ActionBar.t6.Ci;
            }
            e6Var.u(org.telegram.ui.ActionBar.t6.w0(i10, this.a));
        }
        if (this.s) {
            setRippleColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.t6.r1(0.1f, e6Var.a.getColor()));
        }
        if (!this.E) {
            this.e.u(org.telegram.ui.ActionBar.t6.w0(this.s ? this.x ? org.telegram.ui.ActionBar.t6.mb : org.telegram.ui.ActionBar.t6.Gi : org.telegram.ui.ActionBar.t6.Ci, this.a));
        }
        this.f.u(this.D);
        this.c.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.b = 8;
        gr grVar = gr.h;
        this.n = new org.telegram.ui.Components.t5(350L, grVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.b0 = 1.0f;
        this.c0 = true;
        this.f0 = zs.e4;
        this.s = z10;
        this.a = p6Var;
        w7.e6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, w7.b6.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.i0.L(8.0f);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            this.D = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, w02);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, p6Var));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, false, false, true);
        this.d = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        if (z10) {
            e6Var.x(org.telegram.messenger.i0.o());
        }
        e6Var.b = 1;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(j(), true, false);
        this.e = e6Var2;
        e6Var2.n(0.3f, 250L, grVar);
        e6Var2.setCallback(this);
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.b = 1;
        org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(false, false, true);
        this.f = e6Var3;
        e6Var3.n(0.3f, 250L, grVar);
        e6Var3.setCallback(this);
        e6Var3.w(org.telegram.messenger.i0.L(12.0f));
        e6Var3.x(org.telegram.messenger.i0.o());
        e6Var3.t("", true, true);
        e6Var3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
