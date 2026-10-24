package yh;

import ai.xa;
import ai.y9;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wz;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final y9 Y;
    public final HashSet Z;
    public final wz a0;
    public final FrameLayout b0;
    public final ei.d c0;
    public j80 d0;
    public final gh.c e0;
    public final gh.c f0;
    public b71 g0;
    public i0.b h0;
    public boolean i0;
    public int j0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10, gi.g4 g4Var) {
        super(r3, o2Var, new ab(r4));
        Activity parentActivity = o2Var.getParentActivity();
        ab abVar = new ab();
        abVar.f = 2;
        abVar.b = 3;
        abVar.g = o2Var.getResourceProvider();
        this.Z = new HashSet();
        this.h0 = i0.b.e;
        Context context = getContext();
        gh.c cVar = new gh.c();
        this.e0 = cVar;
        cVar.a(getThemedColor(k6.d6));
        bh.b bVar = new bh.b(cVar);
        gh.c cVar2 = new gh.c();
        this.f0 = cVar2;
        int i11 = k6.a7;
        cVar2.a(getThemedColor(i11));
        bh.b bVar2 = new bh.b(cVar2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        K();
        this.X = i10;
        this.Y = new y9(this.currentAccount, j10, true);
        this.e.setActionBarMenuOnItemClick(new h4(this, this.e.m().a(1, R.drawable.ic_ab_other), j10));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.c0 = dVar;
        dVar.i(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        int i12 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i12, 0, i12, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(dVar, z5.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new org.telegram.ui.web.c(15, this, g4Var));
        dh.d c10 = bVar.c(frameLayout2, null, false);
        c10.o(fh.c.j(this.resourcesProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        b6.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.c cVar3 = new bh.c(bVar2.c(frameLayout, null, false));
        cVar3.b(AndroidUtilities.dp(40.0f), true);
        cVar3.G = 220;
        frameLayout.setBackground(cVar3);
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        getContext();
        wz wzVar = new wz(3, false);
        this.a0 = wzVar;
        wzVar.O = new i4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(wzVar);
        this.d.setOnItemClickListener(new xa(this, 24));
        this.d.j(new j4(this));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.g0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        S();
    }

    public final void S() {
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.h0.a + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.h0.c + this.backgroundPaddingLeft, this.h0.d);
        i0.b bVar = this.h0;
        int i10 = bVar.a;
        int i11 = this.backgroundPaddingLeft;
        this.b0.setPadding(i10 + i11, 0, bVar.c + i11, bVar.d);
    }

    public final boolean T() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.G) {
            for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                if (mm0Var.getChildAt(i10) instanceof b10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (b71Var = this.g0) == null) {
            return;
        }
        b71Var.N(true);
        if (T()) {
            this.Y.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        this.h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.e0;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.d6));
            }
            gh.c cVar2 = this.f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(k6.a7));
            }
            int themedColor = getThemedColor(k6.a7);
            if (this.i0 && themedColor == this.j0) {
                return;
            }
            this.i0 = true;
            this.j0 = themedColor;
            setBackgroundColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, false, new t3(this, 1), this.resourcesProvider);
        this.g0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
