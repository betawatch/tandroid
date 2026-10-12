package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.w5;
import bi.y4;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.g80;
import org.telegram.ui.qx0;
import org.telegram.ui.rx0;
import org.telegram.ui.w41;
import org.telegram.ui.x5;
import w7.a6;
import zh.r3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y0 extends e3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final rx0 J;
    public int K;
    public int L;
    public int M;
    public b8 N;
    public final m2 b;
    public final q0 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final v0 n;
    public final rg.m0 r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public y0(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
    }

    public final void A() {
        v0 v0Var;
        View m10;
        View m11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            v0Var = this.n;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i12);
            int i13 = x0Var.a;
            ViewGroup viewGroup = x0Var.f;
            if (i13 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (x0Var.a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
                i11 = 0;
            }
            i12++;
        }
        int i14 = this.L;
        if (i10 >= 0) {
            float f7 = 1.0f - this.I;
            i14 = Math.min(i14, (int) k3.y(1.0f, f7, i14, i10 * f7));
        }
        if (i11 >= 0) {
            float f10 = this.I;
            i14 = Math.min(i14, (int) k3.y(1.0f, f10, this.L, i11 * f10));
        }
        float f11 = 1.0f - this.f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f11);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        rg.m0 m0Var = this.r;
        m0Var.setTranslationX((z10 ? m0Var.getMeasuredWidth() : -m0Var.getMeasuredWidth()) * this.f);
        if (i14 != this.M) {
            this.M = i14;
            for (int i15 = 0; i15 < v0Var.getChildCount(); i15++) {
                if (!((x0) v0Var.getChildAt(i15)).h) {
                    v0Var.getChildAt(i15).setTranslationY(this.M);
                }
            }
            m0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.N, this.M < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public final ViewGroup B(Context context, int i10) {
        qx0 qx0Var = (qx0) this.d.get(i10);
        int i11 = qx0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new s0(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            j jVar = new j(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            jVar.b.setOnScrollListener(new s0(this, 0));
            return jVar;
        }
        if (i11 == 5) {
            return new t0(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new n0(context, this.resourcesProvider);
        }
        return new a2(context, this.x, this.currentAccount, qx0Var.a, this.resourcesProvider);
    }

    public final void D() {
        boolean z10 = this.F;
        q0 q0Var = this.c;
        if (z10) {
            q0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.E) {
            q0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            q0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            q0Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            q0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            q0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            q0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void E() {
        this.F = true;
        q0 q0Var = this.c;
        q0Var.h = false;
        q0Var.d(true);
        D();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.a == this.G) {
                if (x0Var.f instanceof b) {
                    return !((b) r1).b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            D();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            q0 q0Var = this.c;
            if (isPremium) {
                q0Var.b(LocaleController.getString(R.string.OK), false, true);
            } else {
                q0Var.h = false;
                q0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b8 b8Var = new b8(this, getContext(), 7);
        this.N = b8Var;
        b8Var.setBackgroundColor(getThemedColor(g6.h5));
        this.N.setTitleColor(getThemedColor(g6.G6));
        this.N.B(getThemedColor(g6.z8), false);
        b8 b8Var2 = this.N;
        int i10 = g6.y8;
        b8Var2.D(getThemedColor(i10), false);
        this.N.D(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new w41(this, 13));
        this.containerView.addView(this.N, a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((qx0) arrayList.get(i11)).a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((qx0) arrayList.get(this.G)).a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((qx0) arrayList.get(this.G)).a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.n;
        if (v0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((x0) v0Var.getChildAt(0)).f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new w5(n0Var, 13));
                ofFloat.addListener(new ql0(21, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(es.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public y0(m2 m2Var, int i10, boolean z10) {
        this(m2Var, m2Var.getContext(), m2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(m2 m2Var, Context context, int i10, int i11, boolean z10) {
        this(m2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y0(m2 m2Var, Context context, int i10, boolean z10, int i11, boolean z11, rx0 rx0Var) {
        this(m2Var, context, i10, z10, i11, z11, rx0Var, r0);
        c6 c6Var;
        if (m2Var == null) {
            c6Var = null;
        } else if (m2Var.getLastStoryViewer() != null && !m2Var.getLastStoryViewer().H0) {
            c6Var = m2Var.getLastStoryViewer().y;
        } else {
            c6Var = m2Var.getResourceProvider();
        }
    }

    public y0(m2 m2Var, Context context, int i10, boolean z10, int i11, boolean z11, rx0 rx0Var, c6 c6Var) {
        super(1, context, c6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.b = m2Var;
        this.J = rx0Var;
        fixNavigationBar(getThemedColor(g6.h5));
        this.y = i11;
        this.E = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p0 p0Var = new p0(this, getContext(), 1);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new qx0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((qx0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            qx0 qx0Var = (qx0) this.d.get(i12);
            this.d.clear();
            this.d.add(qx0Var);
            i12 = 0;
        }
        qx0 qx0Var2 = (qx0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(g6.ak, g6.bk, g6.ck, -1, null);
        a1Var.o = 1.1f;
        a1Var.p = 1.5f;
        a1Var.q = -0.2f;
        a1Var.m = true;
        rg.m0 m0Var = new rg.m0(this, getContext(), a1Var);
        this.r = m0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(g6.j0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, a6.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sg.r0
            public final /* synthetic */ y0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        p0Var.addView(m0Var, a6.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new g80(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        p0Var.addView(v0Var, a6.a(100.0f, 0.0f, 18.0f, 0.0f, 0.0f, -1, 0));
        p0Var.addView(frameLayout, a6.a(52.0f, 0.0f, 24.0f, 0.0f, 0.0f, 52, 53));
        ua uaVar = new ua(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, uaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p0Var);
        linearLayout.setOrientation(1);
        int i14 = g6.V8;
        int i15 = g6.P9;
        uaVar.n = i14;
        uaVar.r = i15;
        if (!z11) {
            linearLayout.addView(uaVar, a6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        q0 q0Var = new q0(getContext(), c6Var, true);
        this.c = q0Var;
        q0Var.r.setOnClickListener(new y4(this, m2Var, z11, qx0Var2, 5));
        final int i16 = 1;
        q0Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: sg.r0
            public final /* synthetic */ y0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(q0Var, a6.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout2.setBackgroundColor(getThemedColor(g6.h5));
        linearLayout.addView(frameLayout2, a6.q(-1, 68, 80));
        if (i11 == 40) {
            q0Var.b(r3.i2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            q0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        D();
        this.customViewGravity = 83;
        x5 x5Var = new x5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = x5Var;
        int i17 = this.backgroundPaddingLeft;
        x5Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
