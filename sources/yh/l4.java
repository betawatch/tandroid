package yh;

import ai.va;
import ai.x9;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final x9 Y;
    public final HashSet Z;
    public final wz a0;
    public final FrameLayout b0;
    public final ei.d c0;
    public i80 d0;
    public s61 e0;
    public i0.c f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l4(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10, gi.g4 g4Var) {
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
        cVar.a(getThemedColor(h6.d6));
        bh.b bVar = new bh.b(cVar);
        gh.c cVar2 = new gh.c();
        int i11 = h6.a7;
        cVar2.a(getThemedColor(i11));
        bh.b bVar2 = new bh.b(cVar2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        L();
        this.X = i10;
        this.Y = new x9(this.currentAccount, j10, true);
        this.e.setActionBarMenuOnItemClick(new i4(this, this.e.n().a(1, R.drawable.ic_ab_other), j10));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
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
        frameLayout2.addView(dVar, z5.d(-1.0f, -1));
        frameLayout2.setOnClickListener(new qg.n(14, this, g4Var));
        dh.d c10 = bVar.c(frameLayout2, null, false);
        c10.o(fh.c.j(this.resourcesProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        b6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, z5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar3 = new bh.c(bVar2.c(frameLayout, null, false));
        cVar3.b(AndroidUtilities.dp(40.0f), true);
        cVar3.q = 220;
        frameLayout.setBackground(cVar3);
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        getContext();
        wz wzVar = new wz(3, false);
        this.a0 = wzVar;
        wzVar.O = new j4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(wzVar);
        this.d.setOnItemClickListener(new va(this, 24));
        this.d.j(new k4(this));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.e0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        T();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }

    public final void T() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.f0.a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.f0.c + this.backgroundPaddingLeft, this.f0.d);
        i0.c cVar = this.f0;
        int i10 = cVar.a;
        int i11 = this.backgroundPaddingLeft;
        this.b0.setPadding(i10 + i11, 0, cVar.c + i11, cVar.d);
    }

    public final boolean U() {
        im0 im0Var = this.d;
        if (im0Var != null && im0Var.G) {
            for (int i10 = 0; i10 < im0Var.getChildCount(); i10++) {
                if (im0Var.getChildAt(i10) instanceof b10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (s61Var = this.e0) == null) {
            return;
        }
        s61Var.N(true);
        if (U()) {
            this.Y.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        this.f0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        T();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(im0Var, getContext(), this.currentAccount, 0, false, new u3(this, 1), this.resourcesProvider);
        this.e0 = s61Var;
        s61Var.r = false;
        return s61Var;
    }
}
