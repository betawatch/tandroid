package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.s6;
import org.telegram.ui.fi1;
import org.telegram.ui.i50;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout implements ga0 {
    public boolean E;
    public boolean F;
    public jr G;
    public boolean H;
    public boolean I;
    public final g6 J;
    public final g6 K;
    public gq L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint a;
    public float b;
    public boolean c;
    public final o0 d;
    public final o0 e;
    public final int f;
    public boolean h;
    public float n;
    public final p0 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final bk0 y;

    public q0(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        p0 p0Var = this.r;
        p0Var.setContentDescription(str);
        if (this.I) {
            return;
        }
        p0Var.setOnClickListener(onClickListener);
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.x = z10;
        o0 o0Var = this.e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override // org.telegram.ui.Components.ga0
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        if (!z10) {
            this.n = this.h ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, this.h ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new w5(this, 12));
        this.s.addListener(new fi1(this, 13));
        this.s.setDuration(250L);
        this.s.setInterpolator(es.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        jr jrVar = this.G;
        o0 o0Var = this.e;
        if (jrVar != null) {
            ir irVar = jrVar.a;
            if (irVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(irVar.C - 0.5f) + irVar.s;
            }
            g6 g6Var = this.J;
            g6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            g6 g6Var2 = this.K;
            g6Var2.d(e, false);
            o0Var.setTranslationX(-g6Var.c);
            this.G.setTranslationX(g6Var2.c - g6Var.c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.n;
        Paint paint = this.a;
        int i10 = this.f;
        if (f7 != 1.0f || !this.x) {
            if (this.c) {
                float f10 = this.b + 0.016f;
                this.b = f10;
                if (f10 > 3.0f) {
                    this.c = false;
                }
            } else {
                float f11 = this.b - 0.016f;
                this.b = f11;
                if (f11 < 1.0f) {
                    this.c = true;
                }
            }
            if (this.H) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, b1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.w;
            hVar.f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.n;
        if (f14 != 0.0f && this.x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f7 = this.n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f10 = 1.0f - this.n;
        p0 p0Var = this.r;
        p0Var.setAlpha(f10);
        p0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        p0Var.setVisibility(this.n == 1.0f ? 4 : 0);
        o0Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public bk0 getIconView() {
        return this.y;
    }

    public s6 getTextView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.r.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        bk0 bk0Var = this.y;
        bk0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new ri.h0(this, 3);
        invalidate();
        bk0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.ga0
    public void setLoading(boolean z10) {
        if (this.N != z10) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O = null;
            }
            float f7 = this.M;
            this.N = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 16));
            this.O.addListener(new i50(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(es.h);
            this.O.start();
        }
    }

    public q0(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new g6(this);
        this.K = new g6(this);
        this.M = 0.0f;
        this.f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout e = sk.e(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, es.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        bk0 bk0Var = new bk0(context);
        this.y = bk0Var;
        bk0Var.setColorFilter(-1);
        bk0Var.setVisibility(8);
        p0 p0Var = new p0(this, context, 0);
        this.r = p0Var;
        p0Var.addView(e, z5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        p0Var.setBackground(org.telegram.ui.ActionBar.g6.j0(i10, i10, i10, i10, 0, k10, k10));
        e.addView(o0Var, z5.q(-2, -2, 16));
        e.addView(bk0Var, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p0Var);
        setOutlineProvider(zf.j0.b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
            e();
        }
    }
}
