package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import g7.e6;
import gh.k5;
import ih.t3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.su0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.h70;
import org.telegram.ui.hw0;
import org.telegram.ui.xe1;
import yf.q2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x0 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public final hw0 F;
    public int G;
    public int H;
    public int I;
    public r7 J;
    public final o2 b;
    public final p0 c;
    public final ArrayList d;
    public float e;
    public float f;
    public boolean h;
    public final u0 n;
    public final vg.c r;
    public int s;
    public final FrameLayout v;
    public boolean w;
    public final SvgHelper.SvgDrawable x;
    public final int y;

    public x0(Context context, int i9, b6 b6Var) {
        this(null, context, UserConfig.selectedAccount, false, i9, true, null, b6Var);
    }

    public final void A() {
        boolean z10 = this.B;
        p0 p0Var = this.c;
        if (z10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.A) {
            p0Var.d.setText(PremiumPreviewFragment.n0(this.currentAccount, this.F));
            return;
        }
        int i9 = this.y;
        if (i9 == 4) {
            p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            p0Var.setIcon(R.raw.unlock_icon);
        } else if (i9 != 10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            p0Var.setIcon(R.raw.unlock_icon);
        }
    }

    public final void C() {
        this.B = true;
        p0 p0Var = this.c;
        p0Var.h = false;
        p0Var.d(true);
        A();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        int i9 = 0;
        while (true) {
            u0 u0Var = this.n;
            if (i9 >= u0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i9);
            if (w0Var.a == this.C) {
                if (w0Var.f instanceof b) {
                    return !((b) r1).b.canScrollVertically(-1);
                }
            }
            i9++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.billingProductDetailsUpdated || i9 == NotificationCenter.premiumPromoUpdated) {
            A();
            return;
        }
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            p0 p0Var = this.c;
            if (isPremium) {
                p0Var.c(LocaleController.getString(R.string.OK), false, true);
            } else {
                p0Var.h = false;
                p0Var.d(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
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
        r7 r7Var = new r7(this, getContext(), 7);
        this.J = r7Var;
        r7Var.setBackgroundColor(getThemedColor(f6.h5));
        this.J.setTitleColor(getThemedColor(f6.G6));
        this.J.A(getThemedColor(f6.z8), false);
        r7 r7Var2 = this.J;
        int i9 = f6.y8;
        r7Var2.C(getThemedColor(i9), false);
        this.J.C(getThemedColor(i9), true);
        this.J.setCastShadows(true);
        this.J.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.J.setBackButtonImage(R.drawable.ic_ab_back);
        this.J.setActionBarMenuOnItemClick(new xe1(this, 13));
        this.containerView.addView(this.J, e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.J, false, 1.0f, false);
        int i10 = this.C;
        ArrayList arrayList = this.d;
        if (((gw0) arrayList.get(i10)).a == 14) {
            this.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).a == 28) {
            this.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.J.requestLayout();
        } else if (((gw0) arrayList.get(this.C)).a == 40) {
            this.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.J.requestLayout();
        } else {
            this.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.J.requestLayout();
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
                ofFloat.addUpdateListener(new f2.f0(n0Var, 13));
                ofFloat.addListener(new su0(22, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(gr.h);
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

    public final void y() {
        u0 u0Var;
        View m10;
        View m11;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            u0Var = this.n;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i11);
            int i12 = w0Var.a;
            ViewGroup viewGroup = w0Var.f;
            if (i12 == this.C && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).c.m(0)) == null || (i9 = m11.getTop()) < 0)) {
                i9 = 0;
            }
            if (w0Var.a == this.D && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).c.m(0)) == null || (i10 = m10.getTop()) < 0)) {
                i10 = 0;
            }
            i11++;
        }
        int i13 = this.H;
        if (i9 >= 0) {
            float f10 = 1.0f - this.E;
            i13 = Math.min(i13, (int) e2.c.z(1.0f, f10, i13, i9 * f10));
        }
        if (i10 >= 0) {
            float f11 = this.E;
            i13 = Math.min(i13, (int) e2.c.z(1.0f, f11, this.H, i10 * f11));
        }
        float f12 = 1.0f - this.f;
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(f12);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z10 = this.h;
        vg.c cVar = this.r;
        cVar.setTranslationX((z10 ? cVar.getMeasuredWidth() : -cVar.getMeasuredWidth()) * this.f);
        if (i13 != this.I) {
            this.I = i13;
            for (int i14 = 0; i14 < u0Var.getChildCount(); i14++) {
                if (!((w0) u0Var.getChildAt(i14)).h) {
                    u0Var.getChildAt(i14).setTranslationY(this.I);
                }
            }
            cVar.setTranslationY(this.I);
            frameLayout.setTranslationY(this.I);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.J, this.I < AndroidUtilities.dp(this.y == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    public final ViewGroup z(Context context, int i9) {
        gw0 gw0Var = (gw0) this.d.get(i9);
        int i10 = gw0Var.a;
        if (i10 == 0) {
            c cVar = new c(context, this.resourcesProvider);
            cVar.b.setOnScrollListener(new r0(this, 1));
            return cVar;
        }
        if (i10 == 14 || i10 == 28) {
            j jVar = new j(context, i10 == 28 ? 1 : 0, this.resourcesProvider);
            jVar.b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
        if (i10 == 5) {
            return new s0(context, this.currentAccount);
        }
        if (i10 == 10) {
            return new n0(context, this.resourcesProvider);
        }
        return new z1(context, this.x, this.currentAccount, gw0Var.a, this.resourcesProvider);
    }

    public x0(o2 o2Var, int i9, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i9, z10, null);
    }

    public x0(o2 o2Var, Context context, int i9, int i10, boolean z10) {
        this(o2Var, context, i9, false, i10, z10, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x0(o2 o2Var, Context context, int i9, boolean z10, int i10, boolean z11, hw0 hw0Var) {
        this(o2Var, context, i9, z10, i10, z11, hw0Var, r0);
        b6 b6Var;
        if (o2Var == null) {
            b6Var = null;
        } else if (o2Var.getLastStoryViewer() != null && !o2Var.getLastStoryViewer().D0) {
            b6Var = o2Var.getLastStoryViewer().y;
        } else {
            b6Var = o2Var.getResourceProvider();
        }
    }

    public x0(o2 o2Var, Context context, int i9, boolean z10, int i10, boolean z11, hw0 hw0Var, b6 b6Var) {
        super(context, b6Var, false, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.G = 255;
        this.b = o2Var;
        this.F = hw0Var;
        fixNavigationBar(getThemedColor(f6.h5));
        this.y = i10;
        this.A = z11;
        this.x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        q2 q2Var = new q2(this, getContext(), 2);
        if (!z10 && i10 != 35) {
            PremiumPreviewFragment.m0(i9, arrayList);
        } else {
            PremiumPreviewFragment.l0(i9, arrayList, false);
            PremiumPreviewFragment.l0(i9, arrayList, true);
        }
        if (i10 == 40) {
            arrayList.clear();
            arrayList.add(new gw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.d.size()) {
                i11 = 0;
                break;
            } else if (((gw0) this.d.get(i11)).a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            gw0 gw0Var = (gw0) this.d.get(i11);
            this.d.clear();
            this.d.add(gw0Var);
            i11 = 0;
        }
        gw0 gw0Var2 = (gw0) this.d.get(i11);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        z0 z0Var = new z0(f6.ak, f6.bk, f6.ck, -1, null);
        z0Var.o = 1.1f;
        z0Var.p = 1.5f;
        z0Var.q = -0.2f;
        z0Var.m = true;
        vg.c cVar = new vg.c(this, getContext(), z0Var);
        this.r = cVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(f6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, e6.e(24, 24, 17));
        final int i12 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zf.q0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        q2Var.addView(cVar, e6.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.n = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new h70(this, 2));
        this.C = i11;
        u0Var.setCurrentItem(i11);
        q2Var.addView(u0Var, e6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        q2Var.addView(frameLayout, e6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ka kaVar = new ka(getContext(), u0Var, this.d.size());
        u0Var.b(new v0(this, kaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(q2Var);
        linearLayout.setOrientation(1);
        int i13 = f6.V8;
        int i14 = f6.P9;
        kaVar.n = i13;
        kaVar.r = i14;
        if (!z11) {
            linearLayout.addView(kaVar, e6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), b6Var, true);
        this.c = p0Var;
        p0Var.r.setOnClickListener(new t3(this, o2Var, z11, gw0Var2, 5));
        final int i15 = 1;
        p0Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: zf.q0
            public final /* synthetic */ x0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
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
        frameLayout2.addView(p0Var, e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(f6.h5));
        linearLayout.addView(frameLayout2, e6.q(-1, 68, 80));
        if (i10 == 40) {
            p0Var.c(k5.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i9).isPremium()) {
            p0Var.c(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i9).preloadPremiumPreviewStickers();
        A();
        this.customViewGravity = 83;
        bh.g gVar = new bh.g(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = gVar;
        int i16 = this.backgroundPaddingLeft;
        gVar.setPadding(i16, this.backgroundPaddingTop - 1, i16, 0);
    }
}
