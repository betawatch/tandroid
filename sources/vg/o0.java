package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import b8.pf;
import ei.n4;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
import org.telegram.ui.u40;
import ug.f2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class o0 extends FrameLayout implements v70 {
    public final org.telegram.ui.Components.voip.g E;
    public boolean F;
    public final fh0 G;
    public boolean H;
    public boolean I;
    public dq J;
    public boolean K;
    public boolean L;
    public final u5 M;
    public final u5 N;
    public cp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final e6 c;
    public float d;
    public boolean e;
    public final n0 f;
    public final n0 h;
    public final int n;
    public boolean r;
    public float s;
    public final kw0 w;
    public ValueAnimator x;
    public final Path y;

    public o0(Context context, e6 e6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, e6Var, z10);
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.H && z10) {
            z10 = true;
        }
        this.H = true;
        n0 n0Var = this.f;
        if (z10 && n0Var.c.h()) {
            n0Var.a();
        }
        n0Var.c(str, z10, true);
        kw0 kw0Var = this.w;
        kw0Var.setContentDescription(str);
        if (this.L) {
            return;
        }
        kw0Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.r = true;
        this.F = z10;
        n0 n0Var = this.h;
        n0Var.c(charSequence, z11, true);
        n0Var.setContentDescription(charSequence);
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
        ofFloat.addUpdateListener(new n4(this, 13));
        this.x.addListener(new i81(this, 18));
        this.x.setDuration(250L);
        this.x.setInterpolator(xq.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        dq dqVar = this.J;
        n0 n0Var = this.h;
        if (dqVar != null) {
            cq cqVar = dqVar.a;
            if (cqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(cqVar.C - 0.5f) + cqVar.s;
            }
            u5 u5Var = this.M;
            u5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (n0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            u5 u5Var2 = this.N;
            u5Var2.e(false, e10);
            n0Var.setTranslationX(-u5Var.c);
            this.J.setTranslationX(u5Var2.c - u5Var.c);
        } else if (n0Var != null) {
            n0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.s;
        e6 e6Var = this.c;
        boolean z10 = this.b;
        int i3 = this.n;
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
                ha.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i3;
                canvas.drawRoundRect(rectF, f13, f13, ha.e.d().e());
            } else {
                if (z10) {
                    paint.setColor(k6.w0(k6.Ci, e6Var));
                }
                paint.setAlpha(hs.e4);
                float f14 = i3;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        boolean z11 = r2.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.g gVar = this.E;
            gVar.f = measuredWidth;
            gVar.a(i3, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(k6.w0(k6.Ci, e6Var));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i3;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i3;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f10 = this.s;
        n0 n0Var = this.h;
        n0Var.setAlpha(f10);
        n0Var.setTranslationY((1.0f - this.s) * org.telegram.messenger.g0.L(12.0f));
        float f11 = 1.0f - this.s;
        kw0 kw0Var = this.w;
        kw0Var.setAlpha(f11);
        kw0Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.s);
        kw0Var.setVisibility(this.s == 1.0f ? 4 : 0);
        n0Var.setVisibility(this.s == 0.0f ? 4 : 0);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
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

    public void setIcon(int i3) {
        fh0 fh0Var = this.G;
        fh0Var.f(i3, 24, 24, null);
        org.telegram.ui.Components.voip.g gVar = this.E;
        gVar.g = 2.0f;
        gVar.p = new r4.u(this, 19);
        invalidate();
        fh0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.v70
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
            ofFloat.addUpdateListener(new f2(this, 2));
            this.R.addListener(new u40(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(xq.h);
            this.R.start();
        }
    }

    public o0(int i3, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new u5(this);
        this.N = new u5(this);
        this.P = 0.0f;
        this.n = i3;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.E = gVar;
        gVar.n = 1.2f;
        gVar.k = false;
        gVar.m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        n0 n0Var = new n0(this, context, 0);
        this.f = n0Var;
        n0Var.b(0.35f, 350L, xq.h);
        n0Var.setGravity(17);
        n0Var.setTextColor(-1);
        n0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n0Var.setTypeface(org.telegram.messenger.g0.o());
        fh0 fh0Var = new fh0(context);
        this.G = fh0Var;
        fh0Var.setColorFilter(-1);
        fh0Var.setVisibility(8);
        kw0 kw0Var = new kw0(11, context, this);
        this.w = kw0Var;
        kw0Var.addView(f10, mf.e(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        kw0Var.setBackground(k6.k0(i3, i3, i3, i3, 0, o10, o10));
        f10.addView(n0Var, mf.r(-2, -2, 16));
        f10.addView(fh0Var, mf.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(kw0Var);
        setOutlineProvider(cg.t0.b);
        setClipToOutline(true);
        pf.b(this, 0.02f, 1.2f);
        if (z10) {
            n0 n0Var2 = new n0(this, context, 1);
            this.h = n0Var2;
            n0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            n0Var2.setGravity(17);
            r6.Z(n0Var2, k6.Gi, e6Var);
            n0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            n0Var2.setTypeface(org.telegram.messenger.g0.o());
            n0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o11 = i0.a.o(-1, 120);
            n0Var2.setBackground(k6.k0(L, L, L, L, 0, o11, o11));
            addView(n0Var2);
            paint.setColor(k6.w0(k6.Ci, e6Var));
            this.b = true;
            this.c = e6Var;
            e();
        }
    }
}
