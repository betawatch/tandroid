// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ub1 extends qb1 {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final pb1 W0;
    public fu5 X0;
    public final hc Y0;
    public final ImageView Z0;
    public kg5 a1;
    public int b1;
    public final int[] c1;
    public final kg5 d1;
    public final Runnable e1;
    public final RectF f1;
    public final Drawable g1;
    public final hn h1;
    public final v41 i1;
    public jl0 j1;
    public final mm k1;
    public final mm l1;
    public final mm m1;
    public boolean n1;
    public boolean o1;
    public final rb1 p1;
    public boolean q1;
    public pcc r1;
    public boolean s1;

    public ub1(Context context, z zVar, wma wmaVar, FrameLayout frameLayout, vnb vnbVar, tl0 tl0Var, Runnable runnable) {
        super(context, zVar, wmaVar, frameLayout, vnbVar, tl0Var);
        float f;
        float f2;
        this.b1 = 0;
        byte b = 3;
        this.c1 = new int[]{ConnectionsManager.DEFAULT_DATACENTER_ID, 3, 10, 30, 0};
        this.f1 = new RectF();
        hn hnVar = new hn(false, false, false);
        this.h1 = hnVar;
        this.i1 = new v41(this);
        k43 k43Var = k43.h;
        this.k1 = new mm(this, 0L, 350L, k43Var);
        this.l1 = new mm(this, 0L, 350L, k43Var);
        this.m1 = new mm(this, 0L, 350L, k43Var);
        this.p1 = new rb1(this, (byte) 0);
        this.e1 = runnable;
        hnVar.w(hl.L(14.0f));
        hnVar.N = hl.q.x;
        hnVar.u(-1);
        boolean z = this instanceof qb8;
        if (z) {
            hnVar.t(ob6.M0(2131748079, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            hnVar.t(ob6.M0(2131748078, null), true, true);
            this.g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        C(false);
        int i = (z ? 48 : 80) | 3;
        float f3 = z ? 6.0f : 0.0f;
        if (z) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = 6.0f;
            f2 = 0.0f;
        }
        float f4 = f2;
        addView(imageView, tre.d(44, 44.0f, i, 14.0f, f3, 0.0f, f));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        pb1 pb1Var = new pb1(5);
        this.W0 = pb1Var;
        imageView2.setImageDrawable(pb1Var);
        imageView2.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, tre.d(44, 44.0f, (z ? 48 : 80) | 5, 0.0f, z ? 6.0f : f4, 10.0f, z ? f4 : 6.0f));
        kg5 kg5Var = new kg5(context, z ? 1 : 3);
        this.d1 = kg5Var;
        kg5Var.q(12.0f);
        kg5Var.setPadding(hl.L(12.0f), hl.L(z ? 8.0f : f4), hl.L(12.0f), hl.L(z ? f4 : 8.0f));
        kg5Var.n(1.0f, -21.0f);
        kg5Var.p(true);
        addView(kg5Var, tre.e(-1, 80, (z ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        hc hcVar = new hc(context);
        this.Y0 = hcVar;
        imageView3.setImageDrawable(hcVar);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(aob.f0(1090519039, 1, hl.L(16.0f)));
        addView(imageView3, tre.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView3);
        this.f.getEditText().addTextChangedListener(new c7(this, b));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new r81(this, (byte) 4));
        imageView2.setOnClickListener(new sb1((Object) this, (Object) zVar, (byte) 0));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z) {
        this.S0 = z;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i = 0;
        imageView.setVisibility(z ? 0 : 8);
        imageView.setAlpha(z ? 1.0f : 0.0f);
        imageView.setTranslationX(z ? 0.0f : hl.L(-8.0f));
        kb1 kb1Var = this.f;
        kb1Var.getEditText().setTranslationX(hl.U1(this.o0, getEditTextLeft() + hl.L(-26.0f), hl.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i = 33;
        }
        marginLayoutParams.rightMargin = hl.L(32 + i);
        kb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z, boolean z2) {
        if (this.n1 == z && z2) {
            return;
        }
        this.n1 = z;
        if (!z2) {
            this.l1.f(z, true);
        }
        invalidate();
    }

    public final void E(boolean z, boolean z2) {
        this.U0 = z;
        ImageView imageView = this.V0;
        imageView.animate().cancel();
        int i = 0;
        if (z2) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : hl.L(8.0f)).withEndAction(new tb1(this, z, (byte) 0)).start();
        } else {
            imageView.setVisibility(z ? 0 : 8);
            imageView.setAlpha(z ? 1.0f : 0.0f);
            imageView.setTranslationX(z ? 0.0f : hl.L(8.0f));
        }
        kb1 kb1Var = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kb1Var.getLayoutParams();
        if (this.S0 && this.U0) {
            i = 33;
        }
        marginLayoutParams.rightMargin = hl.L(32 + i);
        kb1Var.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z) {
        if (this.s1 != z) {
            if (z) {
                uc7.s1(this.V).Q1().b();
            }
            this.s1 = z;
            ImageView imageView = this.Z0;
            imageView.setVisibility(0);
            imageView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).setInterpolator(k43.h).setDuration(420L).withEndAction(new tb1(this, z, (byte) 1)).start();
            if (!z) {
                kg5 kg5Var = this.a1;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    this.a1 = null;
                    return;
                }
                return;
            }
            hc hcVar = this.Y0;
            Objects.requireNonNull(hcVar);
            imageView.postDelayed(new gc(hcVar, (byte) 1), 220L);
            kg5 kg5Var2 = this.a1;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
                this.a1 = null;
            }
            if (uc7.e1().getInt("aihintshown", 0) < 3) {
                kg5 kg5Var3 = new kg5(getContext(), 3);
                this.a1 = kg5Var3;
                kg5Var3.p(true);
                this.a1.t(ob6.M0(2131754989, null));
                this.a1.o(1.0f, ((-imageView.getWidth()) / 2.0f) + hl.L(4.0f));
                addView(this.a1, tre.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                kg5 kg5Var4 = this.a1;
                kg5Var4.r0 = new z21(this, kg5Var3, (byte) 14);
                kg5Var4.d = 4000L;
                kg5Var4.v();
                uc7.e1().edit().putInt("aihintshown", uc7.e1().getInt("aihintshown", 0) + 1).apply();
            }
        }
    }

    public abstract boolean G();

    public final void H(vnb vnbVar) {
        this.a = vnbVar;
        this.h.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.U5, false), PorterDuff.Mode.SRC_IN));
        int L = hl.L(16.0f);
        int i = aob.qg;
        ShapeDrawable K = aob.K(L, aob.v0(i, vnbVar));
        zm2 zm2Var = this.n;
        zm2Var.a = K;
        zm2Var.invalidateSelf();
        this.W0.g(-1, aob.v0(i, vnbVar), -1);
    }

    @Override // qb1
    public final int a() {
        return 0;
    }

    @Override // qb1
    public final void c(boolean z) {
        int i = (z || !this.U0) ? 8 : 0;
        ImageView imageView = this.V0;
        imageView.setVisibility(i);
        int i2 = (z || !this.S0) ? 8 : 0;
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i2);
        if (z) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override // qb1
    public final void d(boolean z) {
        if (!z) {
            this.V0.setVisibility(this.U0 ? 0 : 8);
            this.T0.setVisibility(this.S0 ? 0 : 8);
        }
        kg5 kg5Var = this.d1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
    }

    @Override // qb1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-hl.L((1.0f - this.o0) * 4.0f));
            if (this instanceof qb8) {
                f2 = rectF.bottom - hl.L(44.0f);
                i = 1;
            } else {
                f2 = rectF.top;
                i = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f.getEditText().getLineCount())) + 4.0f) * hl.L(3.0f) * i) + f2);
        }
        float f3 = this.l1.f(this.n1, !G());
        float d = this.m1.d(this.o1);
        if (f3 > 0.0f) {
            float a = this.i1.a(0.03f);
            int L = hl.L((1.0f - this.o0) * 4.0f);
            boolean z = this instanceof qb8;
            hn hnVar = this.h1;
            RectF rectF2 = this.f1;
            if (z) {
                f = 1.0f;
                rectF2.set(hl.L(7.0f) + L, rectF.bottom + hl.L(10.0f), uh9.v(hnVar.c(), hl.L(11.0f), d, hl.L(44.0f) + L), rectF.bottom + hl.L(42.0f));
            } else {
                f = 1.0f;
                rectF2.set(hl.L(7.0f) + L, rectF.top - hl.L(42.0f), uh9.v(hnVar.c(), hl.L(11.0f), d, hl.L(44.0f) + L), rectF.top - hl.L(10.0f));
            }
            if (f3 < f) {
                canvas.saveLayerAlpha(rectF2, (int) (f3 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            ll0 ll0Var = this.h0;
            if (ll0Var != null) {
                if (this.j1 == null) {
                    jl0 c = ll0Var.c(this, null, false);
                    c.p(dtd.i(this.a));
                    c.q(hl.L(5.0f));
                    c.r(hl.L(16.0f));
                    this.j1 = c;
                }
                Rect rect = hl.Q;
                rectF2.round(rect);
                rect.inset(-hl.L(5.0f), -hl.L(5.0f));
                this.j1.setBounds(rect);
                this.j1.draw(canvas);
            }
            int L2 = (int) (rectF2.left + hl.L(9.0f));
            int centerY = (int) (rectF2.centerY() - hl.L(10.0f));
            int L3 = (int) (rectF2.left + hl.L(29.0f));
            int centerY2 = (int) (rectF2.centerY() + hl.L(10.0f));
            Drawable drawable = this.g1;
            drawable.setBounds(L2, centerY, L3, centerY2);
            drawable.draw(canvas);
            hnVar.o(rectF2.left + hl.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            hnVar.C = (int) (d * 255.0f);
            hnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // qb1, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f1;
        mm mmVar = this.l1;
        v41 v41Var = this.i1;
        if (action == 0) {
            v41Var.c(mmVar.c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (v41Var.i && (mmVar.c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                v41Var.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && v41Var.i) {
            if (motionEvent.getAction() == 1) {
                A();
                this.h1.t(ob6.M0(this instanceof qb8 ? 2131748079 : 2131748078, null), true, true);
            }
            v41Var.c(false);
            return true;
        }
        return v41Var.i || super.dispatchTouchEvent(motionEvent);
    }

    @Override // qb1
    public final boolean f(View view) {
        return view != this.d1;
    }

    @Override // qb1
    public int getCaptionDefaultLimit() {
        return uc7.s1(this.V).l4.o1.f();
    }

    @Override // qb1
    public int getCaptionLimit() {
        return yac.h(this.V).p() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override // qb1
    public int getCaptionPremiumLimit() {
        return uc7.s1(this.V).l4.p1.f();
    }

    @Override // qb1
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override // qb1
    public int getEditTextLeft() {
        if (this.S0) {
            return hl.L(31.0f);
        }
        return 0;
    }

    @Override // qb1
    public int getEditTextStyle() {
        return 3;
    }

    @Override // qb1
    public final void r(int i) {
        this.d1.setTranslationY(((-Math.min(hl.L(34.0f), i)) - hl.L(10.0f)) * (this instanceof qb8 ? -1.0f : 1.0f));
    }

    @Override // qb1
    public final void s(int i, int i2) {
        CharSequence text = getText();
        F((i2 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.s1) {
            if ((i < 3) != (i2 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z) {
        this.q1 = z;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(pcc pccVar) {
        this.r1 = pccVar;
    }

    @Override // qb1
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i) {
        this.b1 = i;
        this.W0.f(i == Integer.MAX_VALUE ? 1 : Math.max(1, i), this.b1 > 0, true);
        kg5 kg5Var = this.d1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
    }

    @Override // qb1
    public final void t() {
        Runnable runnable = this.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // qb1
    public void u(float f) {
        float f2 = 1.0f - f;
        this.V0.setAlpha(f2);
        this.T0.setAlpha(f2);
    }

    @Override // qb1
    public void x(int i) {
        boolean z = this.m0;
        super.x(i);
        if (z || !this.M.c()) {
            return;
        }
        B();
    }

    public final void z() {
        boolean z;
        rb1 rb1Var = this.p1;
        hl.r(rb1Var);
        if (uc7.s1(this.V).Y3.getInt("movecaptionhint", 0) >= 24) {
            boolean z2 = f11.a;
            z = false;
        } else {
            z = true;
        }
        this.o1 = z;
        if (z) {
            SharedPreferences sharedPreferences = uc7.s1(this.V).Y3;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            hl.d3(rb1Var, 5000L);
        }
    }
}
