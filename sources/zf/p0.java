package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import g7.e6;
import g7.g6;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.n60;
import org.telegram.ui.te1;
import yf.q2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements o80 {
    public boolean A;
    public boolean B;
    public mq C;
    public boolean D;
    public boolean E;
    public final y5 F;
    public final y5 G;
    public jp H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public final Paint a;
    public float b;
    public boolean c;
    public final o0 d;
    public final o0 e;
    public final int f;
    public boolean h;
    public float n;
    public final q2 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final pi0 y;

    public p0(Context context, b6 b6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, b6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.c.f()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        q2 q2Var = this.r;
        q2Var.setContentDescription(str);
        if (this.E) {
            return;
        }
        q2Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.o80
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.x = z10;
        o0 o0Var = this.e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
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
        ofFloat.addUpdateListener(new f2.f0(this, 12));
        this.s.addListener(new te1(this, 12));
        this.s.setDuration(250L);
        this.s.setInterpolator(gr.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        mq mqVar = this.C;
        o0 o0Var = this.e;
        if (mqVar != null) {
            lq lqVar = mqVar.a;
            if (lqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(lqVar.C - 0.5f) + lqVar.s;
            }
            y5 y5Var = this.F;
            y5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e10 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            y5 y5Var2 = this.G;
            y5Var2.d(e10, false);
            o0Var.setTranslationX(-y5Var.c);
            this.C.setTranslationX(y5Var2.c - y5Var.c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.n;
        Paint paint = this.a;
        int i9 = this.f;
        if (f10 != 1.0f || !this.x) {
            if (this.c) {
                float f11 = this.b + 0.016f;
                this.b = f11;
                if (f11 > 3.0f) {
                    this.c = false;
                }
            } else {
                float f12 = this.b - 0.016f;
                this.b = f12;
                if (f12 < 1.0f) {
                    this.c = true;
                }
            }
            if (this.D) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i9;
                canvas.drawRoundRect(rectF, f13, f13, a1.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i9;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.w;
            hVar.f = measuredWidth;
            hVar.a(i9, canvas, rectF, null);
        }
        float f15 = this.n;
        if (f15 != 0.0f && this.x) {
            paint.setAlpha((int) (f15 * 255.0f));
            if (this.n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f16 = i9;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            } else {
                float f17 = i9;
                canvas.drawRoundRect(rectF, f17, f17, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f10 = this.n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f10);
        o0Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f11 = 1.0f - this.n;
        q2 q2Var = this.r;
        q2Var.setAlpha(f11);
        q2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        q2Var.setVisibility(this.n == 1.0f ? 4 : 0);
        o0Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public pi0 getIconView() {
        return this.y;
    }

    public j6 getTextView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.r.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setIcon(int i9) {
        pi0 pi0Var = this.y;
        pi0Var.f(i9, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new pf.o1(this, 27);
        invalidate();
        pi0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.o80
    public void setLoading(boolean z10) {
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f10 = this.I;
            this.J = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new g4(this, 26));
            this.K.addListener(new n60(17, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(gr.h);
            this.K.start();
        }
    }

    public p0(int i9, Context context, b6 b6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new y5(this);
        this.G = new y5(this);
        this.I = 0.0f;
        this.f = i9;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout f10 = ll.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, gr.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        pi0 pi0Var = new pi0(context);
        this.y = pi0Var;
        pi0Var.setColorFilter(-1);
        pi0Var.setVisibility(8);
        q2 q2Var = new q2(this, context, 1);
        this.r = q2Var;
        q2Var.addView(f10, e6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        q2Var.setBackground(f6.i0(i9, i9, i9, i9, 0, k10, k10));
        f10.addView(o0Var, e6.q(-2, -2, 16));
        f10.addView(pi0Var, e6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(q2Var);
        setOutlineProvider(ff.r0.b);
        setClipToOutline(true);
        g6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(f6.v0(f6.Sh, b6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(f6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(f6.v0(f6.Oh, b6Var));
            e();
        }
    }
}
