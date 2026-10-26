package zh;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.t9;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l4 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final int X;
    public final t9 Y;
    public final HashSet Z;
    public final vz a0;
    public final FrameLayout b0;
    public final fi.d c0;
    public k80 d0;
    public final hh.c e0;
    public final hh.c f0;
    public j71 g0;
    public i0.b h0;
    public boolean i0;
    public int j0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l4(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10, hi.p4 p4Var) {
        super(r3, r2Var, new ab(r4));
        Activity parentActivity = r2Var.getParentActivity();
        ab abVar = new ab();
        abVar.f = 2;
        abVar.b = 3;
        abVar.g = r2Var.getResourceProvider();
        this.Z = new HashSet();
        this.h0 = i0.b.e;
        Context context = getContext();
        hh.c cVar = new hh.c();
        this.e0 = cVar;
        cVar.a(getThemedColor(y6.d6));
        ch.b bVar = new ch.b(cVar);
        hh.c cVar2 = new hh.c();
        this.f0 = cVar2;
        int i11 = y6.a7;
        cVar2.a(getThemedColor(i11));
        ch.b bVar2 = new ch.b(cVar2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        setBackgroundColor(getThemedColor(i11));
        K();
        this.X = i10;
        this.Y = new t9(this.currentAccount, j10, true);
        this.e.setActionBarMenuOnItemClick(new i4(this, this.e.l().a(1, R.drawable.ic_ab_other), j10));
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
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
        frameLayout2.addView(dVar, gb1.g(-1.0f, -1));
        frameLayout2.setOnClickListener(new org.telegram.ui.web.c(15, this, p4Var));
        eh.d c10 = bVar.c(frameLayout2, null, false);
        c10.v(gh.c.j(this.resourcesProvider));
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        gb1.c(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, gb1.h(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ch.c cVar3 = new ch.c(bVar2.c(frameLayout, null, false));
        cVar3.b(AndroidUtilities.dp(40.0f), true);
        cVar3.G = 220;
        frameLayout.setBackground(cVar3);
        this.containerView.addView(frameLayout, gb1.i(-1, -2, 80));
        getContext();
        vz vzVar = new vz(3, false);
        this.a0 = vzVar;
        vzVar.O = new j4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setClipToPadding(false);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(vzVar);
        this.d.setOnItemClickListener(new ai.k(this, 25));
        this.d.j(new k4(this));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.g0.O(true);
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
                if (mm0Var.getChildAt(i10) instanceof c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (j71Var = this.g0) == null) {
            return;
        }
        j71Var.O(true);
        if (T()) {
            this.Y.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        this.h0 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        S();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.e0;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.d6));
            }
            hh.c cVar2 = this.f0;
            if (cVar2 != null) {
                cVar2.a(getThemedColor(y6.a7));
            }
            int themedColor = getThemedColor(y6.a7);
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
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, false, new q0(this, 4), this.resourcesProvider);
        this.g0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
