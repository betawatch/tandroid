package sg;

import ai.k7;
import ai.n5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ci.v4;
import ci.z3;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a31;
import org.telegram.ui.k70;
import org.telegram.ui.qw0;
import org.telegram.ui.rw0;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x0 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final rw0 J;
    public int K;
    public int L;
    public int M;
    public z7 N;
    public final n2 b;
    public final p0 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final u0 n;
    public final rg.k0 r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public x0(Context context, int i10, d6 d6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, d6Var);
    }

    public final void A() {
        u0 u0Var;
        View m10;
        View m11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            u0Var = this.n;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i12);
            int i13 = w0Var.a;
            ViewGroup viewGroup = w0Var.f;
            if (i13 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).c.m(0)) == null || (i10 = m11.getTop()) < 0)) {
                i10 = 0;
            }
            if (w0Var.a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i11 = m10.getTop()) < 0)) {
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
        rg.k0 k0Var = this.r;
        k0Var.setTranslationX((z10 ? k0Var.getMeasuredWidth() : -k0Var.getMeasuredWidth()) * this.f);
        if (i14 != this.M) {
            this.M = i14;
            for (int i15 = 0; i15 < u0Var.getChildCount(); i15++) {
                if (!((w0) u0Var.getChildAt(i15)).h) {
                    u0Var.getChildAt(i15).setTranslationY(this.M);
                }
            }
            k0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.N, this.M < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public final ViewGroup B(Context context, int i10) {
        qw0 qw0Var = (qw0) this.d.get(i10);
        int i11 = qw0Var.a;
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
        return new z1(context, this.x, this.currentAccount, qw0Var.a, this.resourcesProvider);
    }

    public final void C() {
        boolean z10 = this.F;
        p0 p0Var = this.c;
        if (z10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.E) {
            p0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
            return;
        }
        int i10 = this.y;
        if (i10 == 4) {
            p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            p0Var.setIcon(R.raw.unlock_icon);
        } else if (i10 != 10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            p0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void D() {
        this.F = true;
        p0 p0Var = this.c;
        p0Var.h = false;
        p0Var.d(true);
        C();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.n;
            if (i10 >= u0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i10);
            if (w0Var.a == this.G) {
                if (w0Var.f instanceof b) {
                    return !((b) r1).b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            C();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            p0 p0Var = this.c;
            if (isPremium) {
                p0Var.b(LocaleController.getString(R.string.OK), false, true);
            } else {
                p0Var.h = false;
                p0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        z7 z7Var = new z7(this, getContext(), 7);
        this.N = z7Var;
        z7Var.setBackgroundColor(getThemedColor(h6.h5));
        this.N.setTitleColor(getThemedColor(h6.G6));
        this.N.B(getThemedColor(h6.z8), false);
        z7 z7Var2 = this.N;
        int i10 = h6.y8;
        z7Var2.C(getThemedColor(i10), false);
        this.N.C(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new a31(this, 14));
        this.containerView.addView(this.N, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((qw0) arrayList.get(i11)).a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((qw0) arrayList.get(this.G)).a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((qw0) arrayList.get(this.G)).a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        u0 u0Var = this.n;
        if (u0Var.getChildCount() > 0) {
            ViewGroup viewGroup = ((w0) u0Var.getChildAt(0)).f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(r0.getMeasuredWidth());
                this.w = true;
                ofFloat.addUpdateListener(new v4(n0Var, 13));
                ofFloat.addListener(new ml0(21, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public x0(n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public x0(n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x0(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, rw0 rw0Var) {
        this(n2Var, context, i10, z10, i11, z11, rw0Var, r0);
        d6 d6Var;
        if (n2Var == null) {
            d6Var = null;
        } else if (n2Var.getLastStoryViewer() != null && !n2Var.getLastStoryViewer().H0) {
            d6Var = n2Var.getLastStoryViewer().y;
        } else {
            d6Var = n2Var.getResourceProvider();
        }
    }

    public x0(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, rw0 rw0Var, d6 d6Var) {
        super(1, context, d6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.b = n2Var;
        this.J = rw0Var;
        fixNavigationBar(getThemedColor(h6.h5));
        this.y = i11;
        this.E = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        rg.n2 n2Var2 = new rg.n2(this, getContext(), 3);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new qw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((qw0) this.d.get(i12)).a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            qw0 qw0Var = (qw0) this.d.get(i12);
            this.d.clear();
            this.d.add(qw0Var);
            i12 = 0;
        }
        qw0 qw0Var2 = (qw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        z0 z0Var = new z0(h6.ak, h6.bk, h6.ck, -1, null);
        z0Var.o = 1.1f;
        z0Var.p = 1.5f;
        z0Var.q = -0.2f;
        z0Var.m = true;
        rg.k0 k0Var = new rg.k0(this, getContext(), z0Var);
        this.r = k0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(h6.j0(dp, dp, dp, dp, o10, o11, o11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        final int i13 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sg.q0
            public final /* synthetic */ x0 b;

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
        n2Var2.addView(k0Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.n = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new k70(this, 2));
        this.G = i12;
        u0Var.setCurrentItem(i12);
        n2Var2.addView(u0Var, z5.a(100.0f, 0.0f, 18.0f, 0.0f, 0.0f, -1, 0));
        n2Var2.addView(frameLayout, z5.a(52.0f, 0.0f, 24.0f, 0.0f, 0.0f, 52, 53));
        sa saVar = new sa(getContext(), u0Var, this.d.size());
        u0Var.b(new v0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(n2Var2);
        linearLayout.setOrientation(1);
        int i14 = h6.V8;
        int i15 = h6.P9;
        saVar.n = i14;
        saVar.r = i15;
        if (!z11) {
            linearLayout.addView(saVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), d6Var, true);
        this.c = p0Var;
        p0Var.r.setOnClickListener(new z3(this, n2Var, z11, qw0Var2, 5));
        final int i16 = 1;
        p0Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: sg.q0
            public final /* synthetic */ x0 b;

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
        frameLayout2.addView(p0Var, z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout2.setBackgroundColor(getThemedColor(h6.h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(k7.B2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        C();
        this.customViewGravity = 83;
        n5 n5Var = new n5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = n5Var;
        int i17 = this.backgroundPaddingLeft;
        n5Var.setPadding(i17, this.backgroundPaddingTop - 1, i17, 0);
    }
}
