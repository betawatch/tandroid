package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public t50 I;
    public long J;
    public boolean K;
    public org.telegram.messenger.fd L;
    public boolean M;
    public boolean N;
    public int O;
    public final m4 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object a;
    public final Object b;
    public final int c;
    public c5.k d;
    public org.telegram.ui.Components.ea e;
    public TextView f;
    public GradientDrawable h;
    public ei.k n;
    public FrameLayout r;
    public bi.x5 s;
    public org.telegram.ui.Components.zg0 w;
    public int x;
    public boolean y;

    public u50() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = org.telegram.messenger.p10.s0;
        this.x = 0;
        this.y = false;
        this.D = false;
        this.P = new m4(this, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        String str;
        int i7;
        org.telegram.messenger.fd fdVar;
        int i10;
        org.telegram.messenger.fd fdVar2;
        u50 u50Var;
        org.telegram.messenger.fd fdVar3 = org.telegram.messenger.id.E0().B;
        int i11 = this.c;
        String str2 = org.telegram.messenger.qp.s1(i11).O3;
        if ((str2 == null || (str2.equals("en") && org.telegram.messenger.id.E0().z.getLanguage() != null && !org.telegram.messenger.id.E0().z.getLanguage().equals("en"))) && (str2 = org.telegram.messenger.id.E0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i7 = i11;
            fdVar = fdVar3;
            switch (str3) {
                case "he":
                    str = "iw";
                    break;
                case "id":
                    str = "in";
                    break;
                case "in":
                    str = "id";
                    break;
                case "iw":
                    str = "he";
                    break;
                case "ji":
                    str = "yi";
                    break;
                case "jv":
                    str = "jw";
                    break;
                case "jw":
                    str = "jv";
                    break;
                case "nb":
                    str = "no";
                    break;
                case "no":
                    str = "nb";
                    break;
                case "yi":
                    str = "ji";
                    break;
                case "fil":
                    str = "tl";
                    break;
            }
            fdVar2 = null;
            org.telegram.messenger.fd fdVar4 = null;
            for (i10 = 0; i10 < org.telegram.messenger.id.E0().J.size(); i10++) {
                org.telegram.messenger.fd fdVar5 = (org.telegram.messenger.fd) org.telegram.messenger.id.E0().J.get(i10);
                if (fdVar5.c.equals("en")) {
                    fdVar2 = fdVar5;
                }
                if (fdVar5.c.replace("_", "-").equals(str2) || fdVar5.c.equals(str3) || fdVar5.c.equals(str)) {
                    fdVar4 = fdVar5;
                }
                if (fdVar2 != null && fdVar4 != null) {
                    org.telegram.messenger.fd fdVar6 = fdVar4;
                    if (fdVar2 != null || fdVar6 == null || fdVar2 == fdVar6) {
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (fdVar6 != fdVar) {
                        tL_langpack_getStrings.lang_code = fdVar6.c();
                        u50Var = this;
                        u50Var.L = fdVar6;
                    } else {
                        u50Var = this;
                        tL_langpack_getStrings.lang_code = fdVar2.c();
                        u50Var.L = fdVar2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i7).sendRequest(tL_langpack_getStrings, new h50(1, u50Var, str2), 8);
                    return;
                }
            }
            org.telegram.messenger.fd fdVar62 = fdVar4;
            if (fdVar2 != null) {
            }
        }
        fdVar = fdVar3;
        i7 = i11;
        str = null;
        fdVar2 = null;
        org.telegram.messenger.fd fdVar42 = null;
        while (i10 < org.telegram.messenger.id.E0().J.size()) {
        }
        org.telegram.messenger.fd fdVar622 = fdVar42;
        if (fdVar2 != null) {
        }
    }

    public final void a0(boolean z9) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.k6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        ei.k kVar = this.n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        kVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (!z9) {
            Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            return;
        }
        t50 t50Var = this.I;
        if (t50Var != null) {
            t50Var.postRunnable(new hz(this, 11));
        }
        for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
            View childAt = this.d.getChildAt(i11);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        Drawable h = jg.g.h(context, R.drawable.telegram_logo);
        this.E = h;
        final int i7 = 0;
        h.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131747749, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(ch0Var, c8.ha.e(28, 28, 17));
        bi.x5 x5Var = new bi.x5(this, context, frameLayout, 21);
        this.s = x5Var;
        scrollView.addView(x5Var, c8.ha.x(-1, -2, 51));
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.w = zg0Var;
        zg0Var.h = true;
        zg0Var.Z = true;
        zg0Var.o();
        this.w.P(org.telegram.ui.ActionBar.k6.D0().q() ? this.w.e[0] - 1 : 0);
        this.w.N(org.telegram.ui.ActionBar.k6.D0().q() ? this.w.e[0] - 1 : 0, false, false);
        ch0Var.setContentDescription(org.telegram.messenger.id.M0(org.telegram.ui.ActionBar.k6.D0().q() ? 2131754751 : 2131754750, null));
        ch0Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.t41(18, this, ch0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, c8.ha.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, c8.ha.e(org.telegram.messenger.qs.e3, org.telegram.messenger.qs.g2, 17));
        textureView.setSurfaceTextureListener(new s50(this, i7));
        c5.k kVar = new c5.k(context);
        this.d = kVar;
        kVar.setAdapter(new org.telegram.ui.Components.a20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.b(new k2(this, i10));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar2 = new ei.k(this, context);
        this.n = kVar2;
        c8.ka.b(kVar2, 0.02f, 1.2f);
        this.n.setText(org.telegram.messenger.id.M0(2131744914, null));
        this.n.setGravity(17);
        this.n.setTypeface(org.telegram.messenger.g0.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.s.addView(this.n, c8.ha.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r50
            public final /* synthetic */ u50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        u50 u50Var = this.b;
                        if (!u50Var.D) {
                            u50Var.D = true;
                            u50Var.presentFragment(new ce0(), true);
                            u50Var.M = true;
                            break;
                        }
                        break;
                    default:
                        u50 u50Var2 = this.b;
                        if (!u50Var2.D && u50Var2.L != null) {
                            u50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(u50Var2, u1Var, 1), org.telegram.messenger.qs.x4);
                            org.telegram.messenger.id.E0().d(u50Var2.L, true, false, u50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(context, this.d, 6);
        this.e = eaVar;
        this.s.addView(eaVar, c8.ha.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, c8.ha.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r50
            public final /* synthetic */ u50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u50 u50Var = this.b;
                        if (!u50Var.D) {
                            u50Var.D = true;
                            u50Var.presentFragment(new ce0(), true);
                            u50Var.M = true;
                            break;
                        }
                        break;
                    default:
                        u50 u50Var2 = this.b;
                        if (!u50Var2.D && u50Var2.L != null) {
                            u50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(u50Var2, u1Var, 1), org.telegram.messenger.qs.x4);
                            org.telegram.messenger.id.E0().d(u50Var2.L, true, false, u50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.s.addView(frameLayout, c8.ha.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.y4);
        int i11 = this.c;
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.J2);
        ConnectionsManager.getInstance(i11).updateDcSettings();
        org.telegram.messenger.id.E0().V0(i11, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y4 || i7 == org.telegram.messenger.qs.J2) {
            Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(10, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        if (!this.N) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, org.telegram.messenger.id.M0(2131747747, null), org.telegram.messenger.id.M0(2131747745, null), org.telegram.messenger.id.M0(2131747741, null), org.telegram.messenger.id.M0(2131747743, null), org.telegram.messenger.id.M0(2131747739, null)};
        this.G = new String[]{org.telegram.messenger.id.M0(2131747750, null), org.telegram.messenger.id.M0(2131747748, null), org.telegram.messenger.id.M0(2131747746, null), org.telegram.messenger.id.M0(2131747742, null), org.telegram.messenger.id.M0(2131747744, null), org.telegram.messenger.id.M0(2131747740, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        org.telegram.messenger.g0.r(this.P);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.y4);
        org.telegram.messenger.qs.f(this.c).n(this, org.telegram.messenger.qs.J2);
        org.telegram.messenger.qp.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.Q3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (this.y) {
            if (org.telegram.messenger.id.a0) {
                this.d.setCurrentItem(6);
                this.x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int themedColor = getThemedColor(i7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Di);
            GradientDrawable gradientDrawable = this.h;
            if (gradientDrawable != null) {
                if (themedColor == this.Q) {
                    if (themedColor2 != this.R) {
                    }
                }
                this.Q = themedColor;
                this.R = themedColor2;
                gradientDrawable.setColors(new int[]{themedColor, themedColor2});
            }
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            Drawable drawable = this.E;
            if (drawable != null && r12 != this.S) {
                this.S = r12;
                drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
            }
            ei.k kVar = this.n;
            if (kVar != null) {
                kVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
                org.telegram.ui.ActionBar.k6.H1(this.n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            org.telegram.ui.Components.zg0 zg0Var = this.w;
            if (zg0Var != null && x02 != this.T) {
                this.T = x02;
                zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.ea eaVar = this.e;
            if (eaVar != null) {
                eaVar.invalidate();
            }
            if (this.d != null) {
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    View childAt = this.d.getChildAt(i10);
                    TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    }
                    TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    }
                }
            }
            if (this.I == null || this.O == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) {
                return;
            }
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.i3(m4Var, 100L);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
