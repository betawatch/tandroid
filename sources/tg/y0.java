package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.h7;
import bi.j5;
import di.u4;
import di.y3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.o70;
import org.telegram.ui.p11;
import org.telegram.ui.ww0;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y0 extends k3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final xw0 J;
    public int K;
    public int L;
    public int M;
    public b8 N;
    public final r2 b;
    public final p0 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final v0 n;
    public final t0 r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public y0(Context context, int i10, u6 u6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, u6Var);
    }

    public final void B() {
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
            i14 = Math.min(i14, (int) c3.h0.z(1.0f, f7, i14, i10 * f7));
        }
        if (i11 >= 0) {
            float f10 = this.I;
            i14 = Math.min(i14, (int) c3.h0.z(1.0f, f10, this.L, i11 * f10));
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
        t0 t0Var = this.r;
        t0Var.setTranslationX((z10 ? t0Var.getMeasuredWidth() : -t0Var.getMeasuredWidth()) * this.f);
        if (i14 != this.M) {
            this.M = i14;
            for (int i15 = 0; i15 < v0Var.getChildCount(); i15++) {
                if (!((x0) v0Var.getChildAt(i15)).h) {
                    v0Var.getChildAt(i15).setTranslationY(this.M);
                }
            }
            t0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.N, this.M < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public final ViewGroup C(Context context, int i10) {
        ww0 ww0Var = (ww0) this.d.get(i10);
        int i11 = ww0Var.a;
        if (i11 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new r0(this, 1));
            return cVar;
        }
        if (i11 == 14 || i11 == 28) {
            j jVar = new j(context, i11 == 28 ? 1 : 0, this.resourcesProvider);
            jVar.b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
        if (i11 == 5) {
            return new s0(context, this.currentAccount);
        }
        if (i11 == 10) {
            return new n0(context, this.resourcesProvider);
        }
        return new a2(context, this.x, this.currentAccount, ww0Var.a, this.resourcesProvider);
    }

    public final void D() {
        boolean z10 = this.F;
        p0 p0Var = this.c;
        if (z10) {
            p0Var.f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.E) {
            p0Var.f.setText(PremiumPreviewFragment.p0(this.currentAccount, this.J));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            p0Var.f.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            p0Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            p0Var.f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            p0Var.f.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            p0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void F() {
        this.F = true;
        p0 p0Var = this.c;
        p0Var.r = false;
        p0Var.d(true);
        D();
    }

    @Override // org.telegram.ui.ActionBar.k3
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
            p0 p0Var = this.c;
            if (isPremium) {
                p0Var.b(LocaleController.getString(R.string.OK), false, true);
            } else {
                p0Var.r = false;
                p0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        b8 b8Var = new b8(this, getContext(), 7);
        this.N = b8Var;
        f7.i(y6.h5, b8Var, this.resourcesProvider);
        f7.m(this.N, 5, y6.G6, this.resourcesProvider);
        f7.m(this.N, 3, y6.z8, this.resourcesProvider);
        b8 b8Var2 = this.N;
        int i10 = y6.y8;
        f7.m(b8Var2, 1, i10, this.resourcesProvider);
        f7.b(this.N, i10, this.resourcesProvider, true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new p11(this, 17));
        this.containerView.addView(this.N, gb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((ww0) arrayList.get(i11)).a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((ww0) arrayList.get(this.G)).a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((ww0) arrayList.get(this.G)).a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.n;
        if (v0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((x0) v0Var.getChildAt(0)).f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new u4(n0Var, 13));
                ofFloat.addListener(new ll0(20, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public y0(r2 r2Var, int i10, boolean z10) {
        this(r2Var, r2Var.getContext(), r2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(r2 r2Var, Context context, int i10, int i11, boolean z10) {
        this(r2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y0(r2 r2Var, Context context, int i10, boolean z10, int i11, boolean z11, xw0 xw0Var) {
        this(r2Var, context, i10, z10, i11, z11, xw0Var, r0);
        u6 u6Var;
        if (r2Var == null) {
            u6Var = null;
        } else if (r2Var.getLastStoryViewer() != null && !r2Var.getLastStoryViewer().H0) {
            u6Var = r2Var.getLastStoryViewer().y;
        } else {
            u6Var = r2Var.getResourceProvider();
        }
    }

    public y0(r2 r2Var, Context context, int i10, boolean z10, int i11, boolean z11, xw0 xw0Var, u6 u6Var) {
        super(1, context, u6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.b = r2Var;
        this.J = xw0Var;
        fixNavigationBarKey(y6.h5);
        this.y = i11;
        this.E = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p5 p5Var = new p5(this, getContext(), 6);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.o0(i10, arrayList);
        } else {
            PremiumPreviewFragment.n0(i10, arrayList, false);
            PremiumPreviewFragment.n0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new ww0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((ww0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            ww0 ww0Var = (ww0) this.d.get(i12);
            this.d.clear();
            this.d.add(ww0Var);
            i12 = 0;
        }
        ww0 ww0Var2 = (ww0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(y6.ak, y6.bk, y6.ck, -1, null);
        a1Var.o = 1.1f;
        a1Var.p = 1.5f;
        a1Var.q = -0.2f;
        a1Var.m = true;
        t0 t0Var = new t0(this, getContext(), a1Var);
        this.r = t0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(y6.j0(dp, dp, dp, dp, o10, o11, o11));
        frameLayout.addView(imageView, gb1.i(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: tg.q0
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
        p5Var.addView(t0Var, gb1.x(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new o70(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        p5Var.addView(v0Var, gb1.h(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        p5Var.addView(frameLayout, gb1.h(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        sa saVar = new sa(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p5Var);
        linearLayout.setOrientation(1);
        int i14 = y6.V8;
        int i15 = y6.P9;
        saVar.n = i14;
        saVar.r = i15;
        if (!z11) {
            linearLayout.addView(saVar, gb1.x(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), u6Var, true);
        this.c = p0Var;
        p0Var.v.setOnClickListener(new y3(this, r2Var, z11, ww0Var2, 5));
        final int i16 = 1;
        p0Var.h.setOnClickListener(new View.OnClickListener(this) { // from class: tg.q0
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
        frameLayout2.addView(p0Var, gb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        f7.i(y6.h5, frameLayout2, u6Var);
        linearLayout.addView(frameLayout2, gb1.u(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(h7.H2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        D();
        this.customViewGravity = 83;
        j5 j5Var = new j5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = j5Var;
        int i17 = this.backgroundPaddingLeft;
        j5Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
