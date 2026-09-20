package xh;

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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.za;
import org.telegram.ui.vy0;
import w7.b6;
import w7.y5;
import yh.l5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class m4 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final l5 Y;
    public final HashSet Z;
    public final nz a0;
    public final FrameLayout b0;
    public final ci.d c0;
    public v70 d0;
    public k61 e0;
    public i0.b f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m4(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10, ei.r4 r4Var) {
        super(r3, n2Var, new za(r4));
        Activity parentActivity = n2Var.getParentActivity();
        za zaVar = new za();
        zaVar.f = 2;
        zaVar.b = 3;
        zaVar.g = n2Var.getResourceProvider();
        this.Z = new HashSet();
        this.f0 = i0.b.e;
        Context context = getContext();
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(j6.d6));
        ah.c cVar2 = new ah.c(cVar);
        fh.c cVar3 = new fh.c();
        int i11 = j6.a7;
        cVar3.a(getThemedColor(i11));
        ah.c cVar4 = new ah.c(cVar3);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        K();
        this.X = i10;
        this.Y = new l5(this.currentAccount, j3, true);
        this.e.setActionBarMenuOnItemClick(new j4(this, this.e.n().a(1, R.drawable.ic_ab_other), j3));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
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
        frameLayout2.addView(dVar, y5.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new vy0(27, this, r4Var));
        ch.d c10 = cVar2.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourcesProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        b6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, y5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.e eVar = new ah.e(cVar4.c(frameLayout, null, false));
        eVar.b(AndroidUtilities.dp(40.0f), true);
        eVar.q = 220;
        frameLayout.setBackground(eVar);
        this.containerView.addView(frameLayout, y5.e(-1, -2, 80));
        getContext();
        nz nzVar = new nz(3, false);
        this.a0 = nzVar;
        nzVar.O = new k4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(nzVar);
        this.d.setOnItemClickListener(new ai.g(this, 20));
        this.d.j(new l4(this));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.e0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        S();
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f0.a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f0.c + this.backgroundPaddingLeft, this.f0.d);
        i0.b bVar = this.f0;
        int i10 = bVar.a;
        int i11 = this.backgroundPaddingLeft;
        this.b0.setPadding(i10 + i11, 0, bVar.c + i11, bVar.d);
    }

    public final boolean T() {
        vl0 vl0Var = this.d;
        if (vl0Var != null && vl0Var.G) {
            for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                if (vl0Var.getChildAt(i10) instanceof t00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (k61Var = this.e0) == null) {
            return;
        }
        k61Var.N(true);
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

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(vl0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.e0 = k61Var;
        k61Var.r = false;
        return k61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
