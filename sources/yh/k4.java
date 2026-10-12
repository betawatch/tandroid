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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zz;
import w7.a6;
import w7.c6;
import zh.f5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k4 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final f5 Y;
    public final HashSet Z;
    public final zz a0;
    public final FrameLayout b0;
    public final di.d c0;
    public m80 d0;
    public z61 e0;
    public i0.b f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4(org.telegram.ui.ActionBar.m2 m2Var, long j10, int i10, fi.r4 r4Var) {
        super(r3, m2Var, new cb(r4));
        Activity parentActivity = m2Var.getParentActivity();
        cb cbVar = new cb();
        cbVar.f = 2;
        cbVar.b = 3;
        cbVar.g = m2Var.getResourceProvider();
        this.Z = new HashSet();
        this.f0 = i0.b.e;
        Context context = getContext();
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(g6.d6));
        bh.b bVar = new bh.b(cVar);
        gh.c cVar2 = new gh.c();
        int i11 = g6.a7;
        cVar2.a(getThemedColor(i11));
        bh.b bVar2 = new bh.b(cVar2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        L();
        this.X = i10;
        this.Y = new f5(this.currentAccount, j10, true);
        this.e.setActionBarMenuOnItemClick(new h4(this, this.e.n().a(1, R.drawable.ic_ab_other), j10));
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
        frameLayout2.addView(dVar, a6.d(-1.0f, -1));
        frameLayout2.setOnClickListener(new a(3, this, r4Var));
        dh.d c10 = bVar.c(frameLayout2, null, false);
        c10.o(fh.b.j(this.resourcesProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        c6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, a6.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar3 = new bh.c(bVar2.c(frameLayout, null, false));
        cVar3.b(AndroidUtilities.dp(40.0f), true);
        cVar3.q = 220;
        frameLayout.setBackground(cVar3);
        this.containerView.addView(frameLayout, a6.e(-1, -2, 80));
        getContext();
        zz zzVar = new zz(3, false);
        this.a0 = zzVar;
        zzVar.O = new i4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(zzVar);
        this.d.setOnItemClickListener(new bi.d(this, 20));
        this.d.j(new j4(this));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.e0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        T();
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f0.a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f0.c + this.backgroundPaddingLeft, this.f0.d);
        i0.b bVar = this.f0;
        int i10 = bVar.a;
        int i11 = this.backgroundPaddingLeft;
        this.b0.setPadding(i10 + i11, 0, bVar.c + i11, bVar.d);
    }

    public final boolean U() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.G) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                if (mm0Var.getChildAt(i10) instanceof f10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z61 z61Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (z61Var = this.e0) == null) {
            return;
        }
        z61Var.N(true);
        if (U()) {
            this.Y.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        this.f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        T();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, false, new ii.a(this, 20), this.resourcesProvider);
        this.e0 = z61Var;
        z61Var.r = false;
        return z61Var;
    }
}
