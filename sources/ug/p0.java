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
import c8.ha;
import c8.ka;
import di.m4;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z70;
import org.telegram.ui.r81;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements z70 {
    public final org.telegram.ui.Components.voip.n D;
    public boolean E;
    public final ch0 F;
    public boolean G;
    public boolean H;
    public cq I;
    public boolean J;
    public boolean K;
    public final w5 L;
    public final w5 M;
    public cp N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint a;
    public final boolean b;
    public final f6 c;
    public float d;
    public boolean e;
    public final o0 f;
    public final o0 h;
    public final int n;
    public boolean r;
    public float s;
    public final v41 w;
    public ValueAnimator x;
    public final Path y;

    public p0(Context context, f6 f6Var, boolean z9) {
        this(org.telegram.messenger.g0.L(8.0f), context, f6Var, z9);
    }

    @Override // org.telegram.ui.Components.z70
    public final boolean a() {
        return this.P;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z9) {
        if (!this.G && z9) {
            z9 = true;
        }
        this.G = true;
        o0 o0Var = this.f;
        if (z9 && o0Var.c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z9, true);
        v41 v41Var = this.w;
        v41Var.setContentDescription(str);
        if (this.K) {
            return;
        }
        v41Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        this.r = true;
        this.E = z9;
        o0 o0Var = this.h;
        o0Var.c(charSequence, z10, true);
        o0Var.setContentDescription(charSequence);
        d(z10);
    }

    public final void d(boolean z9) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.cancel();
        }
        if (!z9) {
            this.s = this.r ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.r ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new m4(this, 12));
        this.x.addListener(new r81(this, 18));
        this.x.setDuration(250L);
        this.x.setInterpolator(xq.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        cq cqVar = this.I;
        o0 o0Var = this.h;
        if (cqVar != null) {
            bq bqVar = cqVar.a;
            if (bqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(bqVar.C - 0.5f) + bqVar.s;
            }
            w5 w5Var = this.L;
            w5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            w5 w5Var2 = this.M;
            w5Var2.e(false, e10);
            o0Var.setTranslationX(-w5Var.c);
            this.I.setTranslationX(w5Var2.c - w5Var.c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.s;
        f6 f6Var = this.c;
        boolean z9 = this.b;
        int i7 = this.n;
        Paint paint = this.a;
        if (f10 != 1.0f || !this.E) {
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
            if (this.J) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i7;
                canvas.drawRoundRect(rectF, f13, f13, ia.e.d().e());
            } else {
                if (z9) {
                    paint.setColor(k6.w0(k6.Ci, f6Var));
                }
                paint.setAlpha(qs.e4);
                float f14 = i7;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        boolean z10 = r2.a;
        if (!this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.D;
            nVar.f = measuredWidth;
            nVar.a(i7, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.E) {
            if (z9) {
                paint.setColor(k6.w0(k6.Ci, f6Var));
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
        o0 o0Var = this.h;
        o0Var.setAlpha(f10);
        o0Var.setTranslationY((1.0f - this.s) * org.telegram.messenger.g0.L(12.0f));
        float f11 = 1.0f - this.s;
        v41 v41Var = this.w;
        v41Var.setAlpha(f11);
        v41Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.s);
        v41Var.setVisibility(this.s == 1.0f ? 4 : 0);
        o0Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public ch0 getIconView() {
        return this.F;
    }

    public j6 getTextView() {
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
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.w.setEnabled(z9);
    }

    public void setFlickerDisabled(boolean z9) {
        this.H = z9;
        invalidate();
    }

    public void setIcon(int i7) {
        ch0 ch0Var = this.F;
        ch0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.D;
        nVar.g = 2.0f;
        nVar.p = new sg.t0(this, 17);
        invalidate();
        ch0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.z70
    public void setLoading(boolean z9) {
        if (this.P != z9) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f10 = this.O;
            this.P = z9;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 2));
            this.Q.addListener(new z40(16, this, z9));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(xq.h);
            this.Q.start();
        }
    }

    public p0(int i7, Context context, f6 f6Var, boolean z9) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.J = true;
        this.L = new w5(this);
        this.M = new w5(this);
        this.O = 0.0f;
        this.n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.D = nVar;
        nVar.n = 1.2f;
        nVar.k = false;
        nVar.m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f = o0Var;
        o0Var.b(0.35f, 350L, xq.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        ch0 ch0Var = new ch0(context);
        this.F = ch0Var;
        ch0Var.setColorFilter(-1);
        ch0Var.setVisibility(8);
        v41 v41Var = new v41(10, context, this);
        this.w = v41Var;
        v41Var.addView(f10, ha.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        v41Var.setBackground(k6.k0(i7, i7, i7, i7, 0, o4, o4));
        f10.addView(o0Var, ha.r(-2, -2, 16));
        f10.addView(ch0Var, ha.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(v41Var);
        setOutlineProvider(bg.u0.b);
        setClipToOutline(true);
        ka.b(this, 0.02f, 1.2f);
        if (z9) {
            o0 o0Var2 = new o0(this, context, 1);
            this.h = o0Var2;
            o0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            o0Var2.setGravity(17);
            r6.Z(o0Var2, k6.Gi, f6Var);
            o0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o0Var2.setTypeface(org.telegram.messenger.g0.o());
            o0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            o0Var2.setBackground(k6.k0(L, L, L, L, 0, o10, o10));
            addView(o0Var2);
            paint.setColor(k6.w0(k6.Ci, f6Var));
            this.b = true;
            this.c = f6Var;
            e();
        }
    }
}
