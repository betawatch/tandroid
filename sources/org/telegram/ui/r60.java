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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public q60 I;
    public long J;
    public boolean K;
    public org.telegram.messenger.ad L;
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
    public z4.g d;
    public org.telegram.ui.Components.y9 e;
    public TextView f;
    public GradientDrawable h;
    public bi.j6 n;
    public FrameLayout r;
    public fg.i s;
    public org.telegram.ui.Components.ci0 w;
    public int x;
    public boolean y;

    public r60() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = org.telegram.messenger.e20.s0;
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
        int i10;
        org.telegram.messenger.ad adVar;
        int i11;
        org.telegram.messenger.ad adVar2;
        r60 r60Var;
        org.telegram.messenger.ad adVar3 = org.telegram.messenger.dd.D0().B;
        int i12 = this.c;
        String str2 = org.telegram.messenger.wp.r1(i12).Q3;
        if ((str2 == null || (str2.equals("en") && org.telegram.messenger.dd.D0().z.getLanguage() != null && !org.telegram.messenger.dd.D0().z.getLanguage().equals("en"))) && (str2 = org.telegram.messenger.dd.D0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i10 = i12;
            adVar = adVar3;
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
            adVar2 = null;
            org.telegram.messenger.ad adVar4 = null;
            for (i11 = 0; i11 < org.telegram.messenger.dd.D0().J.size(); i11++) {
                org.telegram.messenger.ad adVar5 = (org.telegram.messenger.ad) org.telegram.messenger.dd.D0().J.get(i11);
                if (adVar5.c.equals("en")) {
                    adVar2 = adVar5;
                }
                if (adVar5.c.replace("_", "-").equals(str2) || adVar5.c.equals(str3) || adVar5.c.equals(str)) {
                    adVar4 = adVar5;
                }
                if (adVar2 != null && adVar4 != null) {
                    org.telegram.messenger.ad adVar6 = adVar4;
                    if (adVar2 != null || adVar6 == null || adVar2 == adVar6) {
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (adVar6 != adVar) {
                        tL_langpack_getStrings.lang_code = adVar6.c();
                        r60Var = this;
                        r60Var.L = adVar6;
                    } else {
                        r60Var = this;
                        tL_langpack_getStrings.lang_code = adVar2.c();
                        r60Var.L = adVar2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new org.telegram.ui.Components.t20(15, r60Var, str2), 8);
                    return;
                }
            }
            org.telegram.messenger.ad adVar62 = adVar4;
            if (adVar2 != null) {
            }
        }
        adVar = adVar3;
        i10 = i12;
        str = null;
        adVar2 = null;
        org.telegram.messenger.ad adVar42 = null;
        while (i11 < org.telegram.messenger.dd.D0().J.size()) {
        }
        org.telegram.messenger.ad adVar622 = adVar42;
        if (adVar2 != null) {
        }
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.t6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.t6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.t6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        bi.j6 j6Var = this.n;
        int L = org.telegram.messenger.i0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        j6Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        if (!z10) {
            Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            return;
        }
        q60 q60Var = this.I;
        if (q60Var != null) {
            q60Var.postRunnable(new yy(this, 11));
        }
        for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
            View childAt = this.d.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        Drawable f7 = i0.a.f(context, R.drawable.telegram_logo);
        this.E = f7;
        final int i10 = 0;
        f7.setBounds(0, org.telegram.messenger.i0.L(8.666f), org.telegram.messenger.i0.L(115.0f), org.telegram.messenger.i0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131747764, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final int i11 = 1;
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(fi0Var, w7.b6.e(28, 28, 17));
        fg.i iVar = new fg.i(this, context, frameLayout, 20);
        this.s = iVar;
        scrollView.addView(iVar, w7.b6.x(-1, -2, 51));
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(R.raw.sun, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.w = ci0Var;
        ci0Var.h = true;
        ci0Var.Z = true;
        ci0Var.o();
        this.w.P(org.telegram.ui.ActionBar.t6.D0().q() ? this.w.e[0] - 1 : 0);
        this.w.N(org.telegram.ui.ActionBar.t6.D0().q() ? this.w.e[0] - 1 : 0, false, false);
        fi0Var.setContentDescription(org.telegram.messenger.dd.L0(org.telegram.ui.ActionBar.t6.D0().q() ? 2131754751 : 2131754750, null));
        fi0Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new vu(11, this, fi0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, w7.b6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, w7.b6.e(org.telegram.messenger.at.e3, org.telegram.messenger.at.g2, 17));
        textureView.setSurfaceTextureListener(new p60(this, i10));
        z4.g gVar = new z4.g(context);
        this.d = gVar;
        gVar.setAdapter(new kg.e1(this, 3));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, w7.b6.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.j6 j6Var = new bi.j6(this, context);
        this.n = j6Var;
        w7.e6.b(j6Var, 0.02f, 1.2f);
        this.n.setText(org.telegram.messenger.dd.L0(2131744929, null));
        this.n.setGravity(17);
        this.n.setTypeface(org.telegram.messenger.i0.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.s.addView(this.n, w7.b6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.o60
            public final /* synthetic */ r60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        r60 r60Var = this.b;
                        if (!r60Var.D) {
                            r60Var.D = true;
                            r60Var.presentFragment(new gf0(), true);
                            r60Var.M = true;
                            break;
                        }
                        break;
                    default:
                        r60 r60Var2 = this.b;
                        if (!r60Var2.D && r60Var2.L != null) {
                            r60Var2.D = true;
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, view.getContext(), null);
                            x1Var.i0 = false;
                            x1Var.r(1000L);
                            org.telegram.messenger.at.e().b(new org.telegram.messenger.zs(r60Var2, x1Var, 1), org.telegram.messenger.at.x4);
                            org.telegram.messenger.dd.D0().d(r60Var2.L, true, false, r60Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context, this.d, 6);
        this.e = y9Var;
        this.s.addView(y9Var, w7.b6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, w7.b6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.o60
            public final /* synthetic */ r60 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        r60 r60Var = this.b;
                        if (!r60Var.D) {
                            r60Var.D = true;
                            r60Var.presentFragment(new gf0(), true);
                            r60Var.M = true;
                            break;
                        }
                        break;
                    default:
                        r60 r60Var2 = this.b;
                        if (!r60Var2.D && r60Var2.L != null) {
                            r60Var2.D = true;
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, view.getContext(), null);
                            x1Var.i0 = false;
                            x1Var.r(1000L);
                            org.telegram.messenger.at.e().b(new org.telegram.messenger.zs(r60Var2, x1Var, 1), org.telegram.messenger.at.x4);
                            org.telegram.messenger.dd.D0().d(r60Var2.L, true, false, r60Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.s.addView(frameLayout, w7.b6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.y4);
        int i12 = this.c;
        org.telegram.messenger.at.f(i12).c(this, org.telegram.messenger.at.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.dd.D0().S0(i12, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.y4 || i10 == org.telegram.messenger.at.J2) {
            Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(10, this), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.q6, org.telegram.ui.ActionBar.t6.P9, org.telegram.ui.ActionBar.t6.Q9, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.G6);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.N) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.wp.d1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, org.telegram.messenger.dd.L0(2131747762, null), org.telegram.messenger.dd.L0(2131747760, null), org.telegram.messenger.dd.L0(2131747756, null), org.telegram.messenger.dd.L0(2131747758, null), org.telegram.messenger.dd.L0(2131747754, null)};
        this.G = new String[]{org.telegram.messenger.dd.L0(2131747765, null), org.telegram.messenger.dd.L0(2131747763, null), org.telegram.messenger.dd.L0(2131747761, null), org.telegram.messenger.dd.L0(2131747757, null), org.telegram.messenger.dd.L0(2131747759, null), org.telegram.messenger.dd.L0(2131747755, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        org.telegram.messenger.i0.r(this.P);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.y4);
        org.telegram.messenger.at.f(this.c).n(this, org.telegram.messenger.at.J2);
        org.telegram.messenger.wp.d1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.i0.P3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (this.y) {
            if (org.telegram.messenger.dd.X) {
                this.d.setCurrentItem(6);
                this.x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        org.telegram.messenger.i0.g2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int themedColor = getThemedColor(i10);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Di);
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
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.t6.A8));
            Drawable drawable = this.E;
            if (drawable != null && r12 != this.S) {
                this.S = r12;
                drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
            }
            bi.j6 j6Var = this.n;
            if (j6Var != null) {
                j6Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
                org.telegram.ui.ActionBar.t6.H1(this.n.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            org.telegram.ui.Components.ci0 ci0Var = this.w;
            if (ci0Var != null && x02 != this.T) {
                this.T = x02;
                ci0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.y9 y9Var = this.e;
            if (y9Var != null) {
                y9Var.invalidate();
            }
            if (this.d != null) {
                for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                    View childAt = this.d.getChildAt(i11);
                    TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    }
                    TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    }
                }
            }
            if (this.I == null || this.O == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)) {
                return;
            }
            org.telegram.messenger.i0.r(m4Var);
            org.telegram.messenger.i0.h3(m4Var, 100L);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
