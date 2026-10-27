package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import di.u4;
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.hc1;
import org.telegram.ui.s40;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class p0 extends FrameLayout implements da0 {
    public boolean E;
    public final bk0 F;
    public boolean G;
    public boolean H;
    public hr I;
    public boolean J;
    public boolean K;
    public final h6 L;
    public final h6 M;
    public gq N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint a;
    public final boolean b;
    public final u6 c;
    public float d;
    public boolean e;
    public final o0 f;
    public final o0 h;
    public final int n;
    public boolean r;
    public float s;
    public final p5 v;
    public ValueAnimator w;
    public final Path x;
    public final org.telegram.ui.Components.voip.h y;

    public p0(Context context, u6 u6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, u6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.G && z10) {
            z10 = true;
        }
        this.G = true;
        o0 o0Var = this.f;
        if (z10 && o0Var.c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        p5 p5Var = this.v;
        p5Var.setContentDescription(str);
        if (this.K) {
            return;
        }
        p5Var.setOnClickListener(onClickListener);
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.r = true;
        this.E = z10;
        o0 o0Var = this.h;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override // org.telegram.ui.Components.da0
    public final boolean c() {
        return this.P;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.w.cancel();
        }
        if (!z10) {
            this.s = this.r ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.r ? 1.0f : 0.0f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 12));
        this.w.addListener(new hc1(this, 18));
        this.w.setDuration(250L);
        this.w.setInterpolator(ds.f);
        this.w.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        hr hrVar = this.I;
        o0 o0Var = this.h;
        if (hrVar != null) {
            gr grVar = hrVar.a;
            if (grVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(grVar.C - 0.5f) + grVar.s;
            }
            h6 h6Var = this.L;
            h6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            h6 h6Var2 = this.M;
            h6Var2.d(e, false);
            o0Var.setTranslationX(-h6Var.c);
            this.I.setTranslationX(h6Var2.c - h6Var.c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.s;
        u6 u6Var = this.c;
        boolean z10 = this.b;
        int i10 = this.n;
        Paint paint = this.a;
        if (f7 != 1.0f || !this.E) {
            if (this.e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.J) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, b1.d().e());
            } else {
                if (z10) {
                    paint.setColor(y6.w0(y6.Oh, u6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.y;
            hVar.f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.E) {
            if (z10) {
                paint.setColor(y6.w0(y6.Oh, u6Var));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.x;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                canvas.restore();
            } else {
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f7 = this.s;
        o0 o0Var = this.h;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.s) * AndroidUtilities.dp(12.0f));
        float f10 = 1.0f - this.s;
        p5 p5Var = this.v;
        p5Var.setAlpha(f10);
        p5Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.s);
        p5Var.setVisibility(this.s == 1.0f ? 4 : 0);
        o0Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public bk0 getIconView() {
        return this.F;
    }

    public s6 getTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.v.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.v.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.H = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        bk0 bk0Var = this.F;
        bk0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.y;
        hVar.g = 2.0f;
        hVar.p = new org.telegram.ui.web.h1(this, 25);
        invalidate();
        bk0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.da0
    public void setLoading(boolean z10) {
        if (this.P != z10) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f7 = this.O;
            this.P = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new e4(this, 26));
            this.Q.addListener(new s40(17, this, z10));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(ds.h);
            this.Q.start();
        }
    }

    public p0(int i10, Context context, u6 u6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.x = new Path();
        this.J = true;
        this.L = new h6(this);
        this.M = new h6(this);
        this.O = 0.0f;
        this.n = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.y = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout d = wh.d(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f = o0Var;
        o0Var.b(0.35f, 350L, ds.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        bk0 bk0Var = new bk0(context);
        this.F = bk0Var;
        bk0Var.setColorFilter(-1);
        bk0Var.setVisibility(8);
        p5 p5Var = new p5(this, context, 5);
        this.v = p5Var;
        p5Var.addView(d, kb1.i(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        p5Var.setBackground(y6.j0(i10, i10, i10, i10, 0, o10, o10));
        d.addView(o0Var, kb1.u(-2, -2, 16));
        d.addView(bk0Var, kb1.t(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p5Var);
        setOutlineProvider(ag.z0.b);
        setClipToOutline(true);
        kb1.c(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.h = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            f7.Z(o0Var2, y6.Sh, u6Var);
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(-1, 120);
            o0Var2.setBackground(y6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(o0Var2);
            paint.setColor(y6.w0(y6.Oh, u6Var));
            this.b = true;
            this.c = u6Var;
            e();
        }
    }
}
