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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public u50 J;
    public long K;
    public boolean L;
    public org.telegram.messenger.cd M;
    public boolean N;
    public boolean O;
    public int P;
    public final m4 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public c5.l d;
    public org.telegram.ui.Components.ia e;
    public TextView f;
    public GradientDrawable h;
    public gi.j n;
    public FrameLayout r;
    public ai.l0 s;
    public org.telegram.ui.Components.oh0 w;
    public int x;
    public boolean y;

    public v50() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = org.telegram.messenger.j10.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new m4(this, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        String str;
        int i7;
        org.telegram.messenger.cd cdVar;
        int i10;
        org.telegram.messenger.cd cdVar2;
        v50 v50Var;
        org.telegram.messenger.cd cdVar3 = org.telegram.messenger.gd.E0().B;
        int i11 = this.c;
        String str2 = org.telegram.messenger.mp.u1(i11).R3;
        if ((str2 == null || (str2.equals("en") && org.telegram.messenger.gd.E0().z.getLanguage() != null && !org.telegram.messenger.gd.E0().z.getLanguage().equals("en"))) && (str2 = org.telegram.messenger.gd.E0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i7 = i11;
            cdVar = cdVar3;
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
            cdVar2 = null;
            org.telegram.messenger.cd cdVar4 = null;
            for (i10 = 0; i10 < org.telegram.messenger.gd.E0().J.size(); i10++) {
                org.telegram.messenger.cd cdVar5 = (org.telegram.messenger.cd) org.telegram.messenger.gd.E0().J.get(i10);
                if (cdVar5.c.equals("en")) {
                    cdVar2 = cdVar5;
                }
                if (cdVar5.c.replace("_", "-").equals(str2) || cdVar5.c.equals(str3) || cdVar5.c.equals(str)) {
                    cdVar4 = cdVar5;
                }
                if (cdVar2 != null && cdVar4 != null) {
                    org.telegram.messenger.cd cdVar6 = cdVar4;
                    if (cdVar2 != null || cdVar6 == null || cdVar2 == cdVar6) {
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (cdVar6 != cdVar) {
                        tL_langpack_getStrings.lang_code = cdVar6.c();
                        v50Var = this;
                        v50Var.M = cdVar6;
                    } else {
                        v50Var = this;
                        tL_langpack_getStrings.lang_code = cdVar2.c();
                        v50Var.M = cdVar2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i7).sendRequest(tL_langpack_getStrings, new e00(3, v50Var, str2), 8);
                    return;
                }
            }
            org.telegram.messenger.cd cdVar62 = cdVar4;
            if (cdVar2 != null) {
            }
        }
        cdVar = cdVar3;
        i7 = i11;
        str = null;
        cdVar2 = null;
        org.telegram.messenger.cd cdVar42 = null;
        while (i10 < org.telegram.messenger.gd.E0().J.size()) {
        }
        org.telegram.messenger.cd cdVar622 = cdVar42;
        if (cdVar2 != null) {
        }
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.m6.Gi)});
        this.F.setColorFilter(org.telegram.ui.ActionBar.m6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.m6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false));
        gi.j jVar = this.n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
        jVar.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, x02, x02));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        if (!z10) {
            Intro.a(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            return;
        }
        u50 u50Var = this.J;
        if (u50Var != null) {
            u50Var.postRunnable(new lz(this, 11));
        }
        for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
            View childAt = this.d.getChildAt(i11);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        Drawable g10 = i5.c.g(context, R.drawable.telegram_logo);
        this.F = g10;
        final int i7 = 0;
        g10.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131747554, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(rh0Var, c8.ma.e(28, 28, 17));
        ai.l0 l0Var = new ai.l0(this, context, frameLayout, 24);
        this.s = l0Var;
        scrollView.addView(l0Var, c8.ma.x(-1, -2, 51));
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.w = oh0Var;
        oh0Var.h = true;
        oh0Var.a0 = true;
        oh0Var.o();
        this.w.P(org.telegram.ui.ActionBar.m6.D0().q() ? this.w.e[0] - 1 : 0);
        this.w.N(org.telegram.ui.ActionBar.m6.D0().q() ? this.w.e[0] - 1 : 0, false, false);
        rh0Var.setContentDescription(org.telegram.messenger.gd.N0(org.telegram.ui.ActionBar.m6.D0().q() ? 2131754750 : 2131754749, null));
        rh0Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.q31(20, this, rh0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, c8.ma.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, c8.ma.e(org.telegram.messenger.ks.e3, org.telegram.messenger.ks.g2, 17));
        textureView.setSurfaceTextureListener(new t50(this, i7));
        c5.l lVar = new c5.l(context);
        this.d = lVar;
        lVar.setAdapter(new org.telegram.ui.Components.n20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, c8.ma.c(-1.0f, -1));
        this.d.b(new k2(this, i10));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        gi.j jVar = new gi.j(this, context);
        this.n = jVar;
        c8.ra.b(jVar, 0.02f, 1.2f);
        this.n.setText(org.telegram.messenger.gd.N0(2131744670, null));
        this.n.setGravity(17);
        this.n.setTypeface(org.telegram.messenger.g0.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.s.addView(this.n, c8.ma.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s50
            public final /* synthetic */ v50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        v50 v50Var = this.b;
                        if (!v50Var.E) {
                            v50Var.E = true;
                            v50Var.presentFragment(new de0(), true);
                            v50Var.N = true;
                            break;
                        }
                        break;
                    default:
                        v50 v50Var2 = this.b;
                        if (!v50Var2.E && v50Var2.M != null) {
                            v50Var2.E = true;
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, view.getContext(), null);
                            t1Var.j0 = false;
                            t1Var.r(1000L);
                            org.telegram.messenger.ks.e().b(new org.telegram.messenger.js(v50Var2, t1Var, 1), org.telegram.messenger.ks.A4);
                            org.telegram.messenger.gd.E0().d(v50Var2.M, true, false, v50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(context, this.d, 6);
        this.e = iaVar;
        this.s.addView(iaVar, c8.ma.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, c8.ma.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s50
            public final /* synthetic */ v50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        v50 v50Var = this.b;
                        if (!v50Var.E) {
                            v50Var.E = true;
                            v50Var.presentFragment(new de0(), true);
                            v50Var.N = true;
                            break;
                        }
                        break;
                    default:
                        v50 v50Var2 = this.b;
                        if (!v50Var2.E && v50Var2.M != null) {
                            v50Var2.E = true;
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, view.getContext(), null);
                            t1Var.j0 = false;
                            t1Var.r(1000L);
                            org.telegram.messenger.ks.e().b(new org.telegram.messenger.js(v50Var2, t1Var, 1), org.telegram.messenger.ks.A4);
                            org.telegram.messenger.gd.E0().d(v50Var2.M, true, false, v50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.s.addView(frameLayout, c8.ma.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.B4);
        int i11 = this.c;
        org.telegram.messenger.ks.f(i11).c(this, org.telegram.messenger.ks.J2);
        ConnectionsManager.getInstance(i11).updateDcSettings();
        org.telegram.messenger.gd.E0().W0(i11, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B4 || i7 == org.telegram.messenger.ks.J2) {
            Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(10, this), org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.q6, org.telegram.ui.ActionBar.m6.P9, org.telegram.ui.ActionBar.m6.Q9, org.telegram.ui.ActionBar.m6.Ji, org.telegram.ui.ActionBar.m6.G6);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.O) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp.g1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, org.telegram.messenger.gd.N0(2131747552, null), org.telegram.messenger.gd.N0(2131747550, null), org.telegram.messenger.gd.N0(2131747546, null), org.telegram.messenger.gd.N0(2131747548, null), org.telegram.messenger.gd.N0(2131747544, null)};
        this.H = new String[]{org.telegram.messenger.gd.N0(2131747555, null), org.telegram.messenger.gd.N0(2131747553, null), org.telegram.messenger.gd.N0(2131747551, null), org.telegram.messenger.gd.N0(2131747547, null), org.telegram.messenger.gd.N0(2131747549, null), org.telegram.messenger.gd.N0(2131747545, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        org.telegram.messenger.g0.r(this.Q);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.B4);
        org.telegram.messenger.ks.f(this.c).n(this, org.telegram.messenger.ks.J2);
        org.telegram.messenger.mp.g1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.O3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        if (this.y) {
            if (org.telegram.messenger.gd.a0) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        m4 m4Var = this.Q;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            int themedColor = getThemedColor(i7);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.Gi);
            GradientDrawable gradientDrawable = this.h;
            if (gradientDrawable != null) {
                if (themedColor == this.R) {
                    if (themedColor2 != this.S) {
                    }
                }
                this.R = themedColor;
                this.S = themedColor2;
                gradientDrawable.setColors(new int[]{themedColor, themedColor2});
            }
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.m6.A8));
            Drawable drawable = this.F;
            if (drawable != null && r12 != this.T) {
                this.T = r12;
                drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false));
            }
            gi.j jVar = this.n;
            if (jVar != null) {
                jVar.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false));
                org.telegram.ui.ActionBar.m6.H1(this.n.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            org.telegram.ui.Components.oh0 oh0Var = this.w;
            if (oh0Var != null && x02 != this.U) {
                this.U = x02;
                oh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.ia iaVar = this.e;
            if (iaVar != null) {
                iaVar.invalidate();
            }
            if (this.d != null) {
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    View childAt = this.d.getChildAt(i10);
                    TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                    }
                    TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                    }
                }
            }
            if (this.J == null || this.P == org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false)) {
                return;
            }
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.h3(m4Var, 100L);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
