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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import w7.x5;
import w7.z5;
import yh.e5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m4 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final e5 Y;
    public final HashSet Z;
    public final d00 a0;
    public final FrameLayout b0;
    public final ci.d c0;
    public p80 d0;
    public c71 e0;
    public i0.b f0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m4(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10, ei.q4 q4Var) {
        super(r3, n2Var, new db(r4));
        Activity parentActivity = n2Var.getParentActivity();
        db dbVar = new db();
        dbVar.f = 2;
        dbVar.b = 3;
        dbVar.g = n2Var.getResourceProvider();
        this.Z = new HashSet();
        this.f0 = i0.b.e;
        Context context = getContext();
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(i6.d6));
        ah.c cVar2 = new ah.c(cVar);
        fh.c cVar3 = new fh.c();
        int i11 = i6.a7;
        cVar3.a(getThemedColor(i11));
        ah.c cVar4 = new ah.c(cVar3);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        L();
        this.X = i10;
        this.Y = new e5(this.currentAccount, j3, true);
        this.e.setActionBarMenuOnItemClick(new j4(this, this.e.o().a(1, R.drawable.ic_ab_other), j3));
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
        frameLayout2.addView(dVar, x5.d(-1.0f, -1));
        frameLayout2.setOnClickListener(new a(3, this, q4Var));
        ch.d c10 = cVar2.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourcesProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        z5.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, x5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        ah.d dVar2 = new ah.d(cVar4.c(frameLayout, null, false));
        dVar2.b(AndroidUtilities.dp(40.0f), true);
        dVar2.q = 220;
        frameLayout.setBackground(dVar2);
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        getContext();
        d00 d00Var = new d00(3, false);
        this.a0 = d00Var;
        d00Var.O = new k4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(d00Var);
        this.d.setOnItemClickListener(new ai.g(this, 20));
        this.d.j(new l4(this));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.e0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        T();
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
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
        qm0 qm0Var = this.d;
        if (qm0Var != null && qm0Var.G) {
            for (int i10 = 0; i10 < qm0Var.getChildCount(); i10++) {
                if (qm0Var.getChildAt(i10) instanceof j10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (c71Var = this.e0) == null) {
            return;
        }
        c71Var.N(true);
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

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, 0, false, new hi.a(this, 20), this.resourcesProvider);
        this.e0 = c71Var;
        c71Var.r = false;
        return c71Var;
    }
}
