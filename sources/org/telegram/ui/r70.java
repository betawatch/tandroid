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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public p70 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public int O;
    public final y5 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object a;
    public final Object b;
    public final int c;
    public a5.m d;
    public org.telegram.ui.Components.sa e;
    public TextView f;
    public GradientDrawable h;
    public ei.n n;
    public FrameLayout r;
    public bh.p s;
    public org.telegram.ui.Components.yj0 v;
    public int w;
    public boolean x;
    public boolean y;

    public r70() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = UserConfig.selectedAccount;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.P = new y5(this, 7);
    }

    public final void V() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.c;
        String str = MessagesController.getInstance(i10).suggestedLangCode;
        if ((str == null || (str.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str = "en";
        }
        String str2 = str.contains("-") ? str.split("-")[0] : str;
        String localeAlias = LocaleController.getLocaleAlias(str2);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i11 = 0; i11 < LocaleController.getInstance().languages.size(); i11++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i11);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(str) || localeInfo3.shortName.equals(str2) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.L = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.L = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new l10(3, this, str), 8);
    }

    public final void W(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.y6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.y6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.y6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
        ei.n nVar = this.n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        if (!z10) {
            Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            return;
        }
        p70 p70Var = this.I;
        if (p70Var != null) {
            p70Var.postRunnable(new r00(this, 10));
        }
        for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
            View childAt = this.d.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i13 = org.telegram.ui.ActionBar.y6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.E = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(bk0Var, org.telegram.ui.Components.kb1.i(28, 28, 17));
        bh.p pVar = new bh.p(this, context, frameLayout, 18);
        this.s = pVar;
        scrollView.addView(pVar, org.telegram.ui.Components.kb1.B(-1, -2, 51));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = yj0Var;
        yj0Var.h = true;
        yj0Var.Z = true;
        yj0Var.o();
        this.v.P(org.telegram.ui.ActionBar.y6.C0().q() ? this.v.e[0] - 1 : 0);
        this.v.N(org.telegram.ui.ActionBar.y6.C0().q() ? this.v.e[0] - 1 : 0, false, false);
        bk0Var.setContentDescription(LocaleController.getString(org.telegram.ui.ActionBar.y6.C0().q() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        bk0Var.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.l51(22, this, bk0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, org.telegram.ui.Components.kb1.i(200, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17));
        int i10 = 0;
        textureView.setSurfaceTextureListener(new n70(this, i10));
        a5.m mVar = new a5.m(context);
        this.d = mVar;
        mVar.setAdapter(new q70(this, i10));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.d.b(new l2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.n nVar = new ei.n(this, context);
        this.n = nVar;
        org.telegram.ui.Components.kb1.c(nVar, 0.02f, 1.2f);
        this.n.setText(LocaleController.getString(R.string.StartMessaging));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.s.addView(this.n, org.telegram.ui.Components.kb1.h(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i11 = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m70
            public final /* synthetic */ r70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        r70 r70Var = this.b;
                        if (!r70Var.y) {
                            r70Var.y = true;
                            r70Var.presentFragment(new ig0(), true);
                            r70Var.M = true;
                            break;
                        }
                        break;
                    default:
                        r70 r70Var2 = this.b;
                        if (!r70Var2.y && r70Var2.L != null) {
                            r70Var2.y = true;
                            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(view.getContext(), 3, null);
                            e2Var.i0 = false;
                            e2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new o70(r70Var2, e2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(r70Var2.L, true, false, r70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.sa saVar = new org.telegram.ui.Components.sa(context, this.d, 6);
        this.e = saVar;
        this.s.addView(saVar, org.telegram.ui.Components.kb1.h(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, org.telegram.ui.Components.kb1.h(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i12 = 1;
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.m70
            public final /* synthetic */ r70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        r70 r70Var = this.b;
                        if (!r70Var.y) {
                            r70Var.y = true;
                            r70Var.presentFragment(new ig0(), true);
                            r70Var.M = true;
                            break;
                        }
                        break;
                    default:
                        r70 r70Var2 = this.b;
                        if (!r70Var2.y && r70Var2.L != null) {
                            r70Var2.y = true;
                            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(view.getContext(), 3, null);
                            e2Var.i0 = false;
                            e2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new o70(r70Var2, e2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(r70Var2.L, true, false, r70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f7 = 4;
        this.s.addView(frameLayout, org.telegram.ui.Components.kb1.h(64, 64.0f, 53, 0.0f, f7, f7, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.c;
        NotificationCenter.getInstance(i13).addWeakObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        V();
        this.x = true;
        W(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack || i10 == NotificationCenter.configLoaded) {
            V();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.kb1.C(new j6(10, this), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.q6, org.telegram.ui.ActionBar.y6.P9, org.telegram.ui.ActionBar.y6.Q9, org.telegram.ui.ActionBar.y6.Sh, org.telegram.ui.ActionBar.y6.G6);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.N) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.G = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (this.x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.w = 0;
            }
            this.x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        y5 y5Var = this.P;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int themedColor = getThemedColor(i10);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Ph);
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
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.y6.A8));
            Drawable drawable = this.E;
            if (drawable != null && o12 != this.S) {
                this.S = o12;
                drawable.setColorFilter(o12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false));
            }
            ei.n nVar = this.n;
            if (nVar != null) {
                nVar.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
                org.telegram.ui.ActionBar.y6.E1(this.n.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            org.telegram.ui.Components.yj0 yj0Var = this.v;
            if (yj0Var != null && x02 != this.T) {
                this.T = x02;
                yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.sa saVar = this.e;
            if (saVar != null) {
                saVar.invalidate();
            }
            if (this.d != null) {
                for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                    View childAt = this.d.getChildAt(i11);
                    TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                    }
                    TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                    }
                }
            }
            if (this.I == null || this.O == org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            AndroidUtilities.runOnUIThread(y5Var, 100L);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
