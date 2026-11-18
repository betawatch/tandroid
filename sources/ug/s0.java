package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c8.ma;
import c8.ra;
import fi.d4;
import org.telegram.messenger.f3;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.w01;
import org.telegram.ui.c30;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class s0 extends FrameLayout implements n80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final ph0 G;
    public boolean H;
    public boolean I;
    public rq J;
    public boolean K;
    public boolean L;
    public final c6 M;
    public final c6 N;
    public sp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final i6 c;
    public float d;
    public boolean e;
    public final r0 f;
    public final r0 h;
    public final int n;
    public boolean r;
    public float s;
    public final w01 w;
    public ValueAnimator x;
    public final Path y;

    public s0(Context context, i6 i6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, i6Var, z10);
    }

    @Override // org.telegram.ui.Components.n80
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.H && z10) {
            z10 = true;
        }
        this.H = true;
        r0 r0Var = this.f;
        if (z10 && r0Var.c.h()) {
            r0Var.a();
        }
        r0Var.c(str, z10, true);
        w01 w01Var = this.w;
        w01Var.setContentDescription(str);
        if (this.L) {
            return;
        }
        w01Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.r = true;
        this.F = z10;
        r0 r0Var = this.h;
        r0Var.c(charSequence, z11, true);
        r0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.cancel();
        }
        if (!z10) {
            this.s = this.r ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.r ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 12));
        this.x.addListener(new k71(this, 19));
        this.x.setDuration(250L);
        this.x.setInterpolator(lr.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        rq rqVar = this.J;
        r0 r0Var = this.h;
        if (rqVar != null) {
            qq qqVar = rqVar.a;
            if (qqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(qqVar.C - 0.5f) + qqVar.s;
            }
            c6 c6Var = this.M;
            c6Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (r0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            c6 c6Var2 = this.N;
            c6Var2.e(false, e10);
            r0Var.setTranslationX(-c6Var.c);
            this.J.setTranslationX(c6Var2.c - c6Var.c);
        } else if (r0Var != null) {
            r0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.s;
        i6 i6Var = this.c;
        boolean z10 = this.b;
        int i7 = this.n;
        Paint paint = this.a;
        if (f10 != 1.0f || !this.F) {
            if (this.e) {
                float f11 = this.d + 0.016f;
                this.d = f11;
                if (f11 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f12 = this.d - 0.016f;
                this.d = f12;
                if (f12 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.K) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i7;
                canvas.drawRoundRect(rectF, f13, f13, ia.e.d().e());
            } else {
                if (z10) {
                    paint.setColor(n6.w0(n6.Fi, i6Var));
                }
                paint.setAlpha(ks.e4);
                float f14 = i7;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        boolean z11 = s2.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f = measuredWidth;
            nVar.a(i7, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(n6.w0(n6.Fi, i6Var));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i7;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i7;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f10 = this.s;
        r0 r0Var = this.h;
        r0Var.setAlpha(f10);
        r0Var.setTranslationY((1.0f - this.s) * org.telegram.messenger.g0.L(12.0f));
        float f11 = 1.0f - this.s;
        w01 w01Var = this.w;
        w01Var.setAlpha(f11);
        w01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.s);
        w01Var.setVisibility(this.s == 1.0f ? 4 : 0);
        r0Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public ph0 getIconView() {
        return this.G;
    }

    public org.telegram.ui.Components.n6 getTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.w.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i7) {
        ph0 ph0Var = this.G;
        ph0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.g = 2.0f;
        nVar.p = new org.telegram.ui.web.z0(this, 25);
        invalidate();
        ph0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.n80
    public void setLoading(boolean z10) {
        if (this.Q != z10) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f10 = this.P;
            this.Q = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new tg.x1(this, 3));
            this.R.addListener(new c30(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(lr.h);
            this.R.start();
        }
    }

    public s0(int i7, Context context, i6 i6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new c6(this);
        this.N = new c6(this);
        this.P = 0.0f;
        this.n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
        LinearLayout g10 = f3.g(context, 0);
        r0 r0Var = new r0(this, context, 0);
        this.f = r0Var;
        r0Var.b(0.35f, 350L, lr.h);
        r0Var.setGravity(17);
        r0Var.setTextColor(-1);
        r0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r0Var.setTypeface(org.telegram.messenger.g0.o());
        ph0 ph0Var = new ph0(context);
        this.G = ph0Var;
        ph0Var.setColorFilter(-1);
        ph0Var.setVisibility(8);
        w01 w01Var = new w01(10, context, this);
        this.w = w01Var;
        w01Var.addView(g10, ma.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        w01Var.setBackground(n6.k0(i7, i7, i7, i7, 0, o4, o4));
        g10.addView(r0Var, ma.r(-2, -2, 16));
        g10.addView(ph0Var, ma.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(w01Var);
        setOutlineProvider(bg.u0.b);
        setClipToOutline(true);
        ra.b(this, 0.02f, 1.2f);
        if (z10) {
            r0 r0Var2 = new r0(this, context, 1);
            this.h = r0Var2;
            r0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            r0Var2.setGravity(17);
            u6.Y(r0Var2, n6.Ji, i6Var);
            r0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            r0Var2.setTypeface(org.telegram.messenger.g0.o());
            r0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            r0Var2.setBackground(n6.k0(L, L, L, L, 0, o10, o10));
            addView(r0Var2);
            paint.setColor(n6.w0(n6.Fi, i6Var));
            this.b = true;
            this.c = i6Var;
            e();
        }
    }
}
