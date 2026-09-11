package yh;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;
import zh.j5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final j5 Y;
    public final HashSet Z;
    public final nz a0;
    public final FrameLayout b0;
    public final di.d c0;
    public n70 d0;
    public v51 e0;
    public i0.c f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10, fi.s4 s4Var) {
        super(r3, n2Var, new ab(r4));
        Activity parentActivity = n2Var.getParentActivity();
        ab abVar = new ab();
        abVar.f = 2;
        abVar.b = 3;
        abVar.g = n2Var.getResourceProvider();
        this.Z = new HashSet();
        this.f0 = i0.c.e;
        Context context = getContext();
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(j6.d6));
        gh.c cVar2 = new gh.c();
        int i11 = j6.a7;
        cVar2.a(getThemedColor(i11));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        K();
        this.X = i10;
        this.Y = new j5(this.currentAccount, j3, true);
        this.e.setActionBarMenuOnItemClick(new h4(this, this.e.n().a(1, R.drawable.ic_ab_other), j3));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.c0 = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.e();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        int i12 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i12, 0, i12, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(dVar, x5.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new wy0(27, this, s4Var));
        dh.d k10 = cVar.k();
        k10.n(null);
        k10.n(fh.b.j(this.resourcesProvider));
        k10.p(AndroidUtilities.dp(28.0f));
        k10.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(k10);
        z5.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, x5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d k11 = cVar2.k();
        k11.n(null);
        bh.c cVar3 = new bh.c(k11);
        cVar3.b(AndroidUtilities.dp(40.0f), true);
        cVar3.q = 220;
        frameLayout.setBackground(cVar3);
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        getContext();
        nz nzVar = new nz(3, false);
        this.a0 = nzVar;
        nzVar.O = new i4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(nzVar);
        this.d.setOnItemClickListener(new bi.d(this, 20));
        this.d.j(new j4(this));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.e0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        S();
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f0.a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f0.c + this.backgroundPaddingLeft, this.f0.d);
        i0.c cVar = this.f0;
        int i10 = cVar.a;
        int i11 = this.backgroundPaddingLeft;
        this.b0.setPadding(i10 + i11, 0, cVar.c + i11, cVar.d);
    }

    public final boolean T() {
        ll0 ll0Var = this.d;
        if (ll0Var != null && ll0Var.G) {
            for (int i10 = 0; i10 < ll0Var.getChildCount(); i10++) {
                if (ll0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (v51Var = this.e0) == null) {
            return;
        }
        v51Var.N(true);
        if (T()) {
            this.Y.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        this.f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, false, new ii.a(this, 20), this.resourcesProvider);
        this.e0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
