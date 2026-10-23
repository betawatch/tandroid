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
import ci.v4;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.nk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.l40;
import org.telegram.ui.tf1;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout implements aa0 {
    public boolean E;
    public boolean F;
    public gr G;
    public boolean H;
    public boolean I;
    public final f6 J;
    public final f6 K;
    public dq L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint a;
    public float b;
    public boolean c;
    public final p0 d;
    public final p0 e;
    public final int f;
    public boolean h;
    public float n;
    public final rg.x1 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final yj0 y;

    public q0(Context context, d6 d6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, d6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        p0 p0Var = this.d;
        if (z10 && p0Var.c.h()) {
            p0Var.a();
        }
        p0Var.c(str, z10, true);
        rg.x1 x1Var = this.r;
        x1Var.setContentDescription(str);
        if (this.I) {
            return;
        }
        x1Var.setOnClickListener(onClickListener);
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.x = z10;
        p0 p0Var = this.e;
        p0Var.c(charSequence, z11, true);
        p0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override // org.telegram.ui.Components.aa0
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
        ofFloat.addUpdateListener(new v4(this, 12));
        this.s.addListener(new tf1(this, 15));
        this.s.setDuration(250L);
        this.s.setInterpolator(bs.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        gr grVar = this.G;
        p0 p0Var = this.e;
        if (grVar != null) {
            fr frVar = grVar.a;
            if (frVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(frVar.C - 0.5f) + frVar.s;
            }
            f6 f6Var = this.J;
            f6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (p0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            f6 f6Var2 = this.K;
            f6Var2.d(e, false);
            p0Var.setTranslationX(-f6Var.c);
            this.G.setTranslationX(f6Var2.c - f6Var.c);
        } else if (p0Var != null) {
            p0Var.setTranslationX(0.0f);
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
        p0 p0Var = this.e;
        p0Var.setAlpha(f7);
        p0Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f10 = 1.0f - this.n;
        rg.x1 x1Var = this.r;
        x1Var.setAlpha(f10);
        x1Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        x1Var.setVisibility(this.n == 1.0f ? 4 : 0);
        p0Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public yj0 getIconView() {
        return this.y;
    }

    public q6 getTextView() {
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
        yj0 yj0Var = this.y;
        yj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new org.telegram.ui.web.z1(this, 22);
        invalidate();
        yj0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.aa0
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
            ofFloat.addUpdateListener(new i6(this, 23));
            this.O.addListener(new l40(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(bs.h);
            this.O.start();
        }
    }

    public q0(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new f6(this);
        this.K = new f6(this);
        this.M = 0.0f;
        this.f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout e = nk.e(context, 0);
        p0 p0Var = new p0(this, context, 0);
        this.d = p0Var;
        p0Var.b(0.35f, 350L, bs.h);
        p0Var.setGravity(17);
        p0Var.setTextColor(-1);
        p0Var.setTextSize(AndroidUtilities.dp(14.0f));
        p0Var.setTypeface(AndroidUtilities.bold());
        yj0 yj0Var = new yj0(context);
        this.y = yj0Var;
        yj0Var.setColorFilter(-1);
        yj0Var.setVisibility(8);
        rg.x1 x1Var = new rg.x1(this, context, 3);
        this.r = x1Var;
        x1Var.addView(e, z5.e(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        x1Var.setBackground(h6.j0(i10, i10, i10, i10, 0, o10, o10));
        e.addView(p0Var, z5.q(-2, -2, 16));
        e.addView(yj0Var, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(x1Var);
        setOutlineProvider(zf.j0.b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            p0 p0Var2 = new p0(this, context, 1);
            this.e = p0Var2;
            p0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p0Var2.setGravity(17);
            p0Var2.setTextColor(h6.w0(h6.Sh, d6Var));
            p0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            p0Var2.setTypeface(AndroidUtilities.bold());
            p0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(-1, 120);
            p0Var2.setBackground(h6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(p0Var2);
            paint.setColor(h6.w0(h6.Oh, d6Var));
            e();
        }
    }
}
