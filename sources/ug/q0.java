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
import c8.ja;
import c8.na;
import fi.f4;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.u5;
import org.telegram.ui.g71;
import org.telegram.ui.z20;
import tg.y1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout implements c80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final fh0 G;
    public boolean H;
    public boolean I;
    public kq J;
    public boolean K;
    public boolean L;
    public final u5 M;
    public final u5 N;
    public lp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final e6 c;
    public float d;
    public boolean e;
    public final p0 f;
    public final p0 h;
    public final int n;
    public boolean r;
    public float s;
    public final m01 w;
    public ValueAnimator x;
    public final Path y;

    public q0(Context context, e6 e6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, e6Var, z10);
    }

    @Override // org.telegram.ui.Components.c80
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.H && z10) {
            z10 = true;
        }
        this.H = true;
        p0 p0Var = this.f;
        if (z10 && p0Var.c.h()) {
            p0Var.a();
        }
        p0Var.c(str, z10, true);
        m01 m01Var = this.w;
        m01Var.setContentDescription(str);
        if (this.L) {
            return;
        }
        m01Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.r = true;
        this.F = z10;
        p0 p0Var = this.h;
        p0Var.c(charSequence, z11, true);
        p0Var.setContentDescription(charSequence);
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
        ofFloat.addUpdateListener(new f4(this, 12));
        this.x.addListener(new g71(this, 19));
        this.x.setDuration(250L);
        this.x.setInterpolator(er.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        kq kqVar = this.J;
        p0 p0Var = this.h;
        if (kqVar != null) {
            jq jqVar = kqVar.a;
            if (jqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(jqVar.C - 0.5f) + jqVar.s;
            }
            u5 u5Var = this.M;
            u5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (p0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            u5 u5Var2 = this.N;
            u5Var2.e(false, e10);
            p0Var.setTranslationX(-u5Var.c);
            this.J.setTranslationX(u5Var2.c - u5Var.c);
        } else if (p0Var != null) {
            p0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.s;
        e6 e6Var = this.c;
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
                ia.f.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i7;
                canvas.drawRoundRect(rectF, f13, f13, ia.f.d().e());
            } else {
                if (z10) {
                    paint.setColor(j6.w0(j6.Fi, e6Var));
                }
                paint.setAlpha(ns.e4);
                float f14 = i7;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        boolean z11 = r2.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f = measuredWidth;
            nVar.a(i7, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(j6.w0(j6.Fi, e6Var));
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
        p0 p0Var = this.h;
        p0Var.setAlpha(f10);
        p0Var.setTranslationY((1.0f - this.s) * org.telegram.messenger.g0.L(12.0f));
        float f11 = 1.0f - this.s;
        m01 m01Var = this.w;
        m01Var.setAlpha(f11);
        m01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.s);
        m01Var.setVisibility(this.s == 1.0f ? 4 : 0);
        p0Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public fh0 getIconView() {
        return this.G;
    }

    public h6 getTextView() {
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
        fh0 fh0Var = this.G;
        fh0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.g = 2.0f;
        nVar.p = new q2.d(this, 22);
        invalidate();
        fh0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.c80
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
            ofFloat.addUpdateListener(new y1(this, 3));
            this.R.addListener(new z20(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(er.h);
            this.R.start();
        }
    }

    public q0(int i7, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new u5(this);
        this.N = new u5(this);
        this.P = 0.0f;
        this.n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        p0 p0Var = new p0(this, context, 0);
        this.f = p0Var;
        p0Var.b(0.35f, 350L, er.h);
        p0Var.setGravity(17);
        p0Var.setTextColor(-1);
        p0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        p0Var.setTypeface(org.telegram.messenger.g0.o());
        fh0 fh0Var = new fh0(context);
        this.G = fh0Var;
        fh0Var.setColorFilter(-1);
        fh0Var.setVisibility(8);
        m01 m01Var = new m01(11, context, this);
        this.w = m01Var;
        m01Var.addView(f10, ja.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        m01Var.setBackground(j6.k0(i7, i7, i7, i7, 0, o4, o4));
        f10.addView(p0Var, ja.r(-2, -2, 16));
        f10.addView(fh0Var, ja.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(m01Var);
        setOutlineProvider(bg.t0.b);
        setClipToOutline(true);
        na.b(this, 0.02f, 1.2f);
        if (z10) {
            p0 p0Var2 = new p0(this, context, 1);
            this.h = p0Var2;
            p0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            p0Var2.setGravity(17);
            q6.Y(p0Var2, j6.Ji, e6Var);
            p0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            p0Var2.setTypeface(org.telegram.messenger.g0.o());
            p0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            p0Var2.setBackground(j6.k0(L, L, L, L, 0, o10, o10));
            addView(p0Var2);
            paint.setColor(j6.w0(j6.Fi, e6Var));
            this.b = true;
            this.c = e6Var;
            e();
        }
    }
}
