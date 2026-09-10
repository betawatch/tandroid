package wh;

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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.za;
import org.telegram.ui.w71;
import w7.a6;
import w7.c6;
import xh.n5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l4 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final n5 Y;
    public final HashSet Z;
    public final uz a0;
    public final FrameLayout b0;
    public final bi.d c0;
    public w70 d0;
    public j61 e0;
    public i0.c f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l4(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10, di.v4 v4Var) {
        super(r3, p2Var, new za(r4));
        Activity parentActivity = p2Var.getParentActivity();
        za zaVar = new za();
        zaVar.f = 2;
        zaVar.b = 3;
        zaVar.g = p2Var.getResourceProvider();
        this.Z = new HashSet();
        this.f0 = i0.c.e;
        Context context = getContext();
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(j6.d6));
        eh.c cVar2 = new eh.c();
        int i11 = j6.a7;
        cVar2.a(getThemedColor(i11));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        K();
        this.X = i10;
        this.Y = new n5(this.currentAccount, j3, true);
        this.e.setActionBarMenuOnItemClick(new i4(this, this.e.n().a(1, R.drawable.ic_ab_other), j3));
        bi.d dVar = new bi.d(getContext(), this.resourcesProvider, true);
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
        frameLayout2.addView(dVar, a6.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new w71(23, this, v4Var));
        bh.d k10 = cVar.k();
        k10.n(null);
        k10.n(dh.c.j(this.resourcesProvider));
        k10.p(AndroidUtilities.dp(28.0f));
        k10.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(k10);
        c6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, a6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.d k11 = cVar2.k();
        k11.n(null);
        zg.b bVar = new zg.b(k11);
        bVar.b(AndroidUtilities.dp(40.0f), true);
        bVar.q = 220;
        frameLayout.setBackground(bVar);
        this.containerView.addView(frameLayout, a6.e(-1, -2, 80));
        getContext();
        uz uzVar = new uz(3, false);
        this.a0 = uzVar;
        uzVar.O = new j4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(uzVar);
        this.d.setOnItemClickListener(new ai.g(this, 19));
        this.d.j(new k4(this));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(wr.h);
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
        vl0 vl0Var = this.d;
        if (vl0Var != null && vl0Var.G) {
            for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                if (vl0Var.getChildAt(i10) instanceof a10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (j61Var = this.e0) == null) {
            return;
        }
        j61Var.N(true);
        if (T()) {
            this.Y.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        this.f0 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        S();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, false, new gi.a(this, 20), this.resourcesProvider);
        this.e0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
