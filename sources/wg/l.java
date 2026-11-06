package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.g5;
import bi.w4;
import fi.r7;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l extends v2 {
    public static l l1;
    public final j i1;
    public final w0 j1;
    public boolean k1;

    public l(Activity activity, a0 a0Var, w0 w0Var, f6 f6Var, boolean z9) {
        super(1, (Context) activity, f6Var, true);
        this.j1 = w0Var;
        this.v0 = false;
        this.u0 = false;
        this.T0 = false;
        v0(0);
        N();
        org.telegram.messenger.g0.q3(this, i0.a.h(k6.w0(k6.h5, this.I0)) > 0.699999988079071d);
        this.k1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, f6Var, a0Var);
        this.i1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new g5(a0Var, w0Var));
        jVar.setPosition(0);
        this.N = jVar;
        a0Var.l2 = new i(this, 0);
        a0Var.j2 = new sg.i0(this, w0Var, false, 9);
        w0Var.m2 = new k(this, a0Var, f6Var);
        w0Var.k2 = new i(this, 1);
        if (!z9) {
            qp.s1(this.a).P1().U();
        }
        cc.a(this.c, new r7(13));
    }

    public static void I0(f2 f2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (l1 != null) {
            return;
        }
        boolean z9 = f6Var instanceof di.b;
        f2 w4Var = z9 ? new w4(f2Var) : f2Var;
        l lVar = new l(f2Var.getParentActivity(), new a0(w4Var, j3, prepaidGiveaway), new w0(w4Var, j3), w4Var.getResourceProvider(), z9);
        lVar.show();
        l1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        l1 = null;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void c0(Configuration configuration) {
        this.j1.c0(configuration);
        this.k1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        j jVar = this.i1;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        w0 w0Var = this.j1;
        HashSet hashSet = w0Var.W1;
        int size = hashSet.size();
        HashSet hashSet2 = w0Var.X1;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(w0Var.b);
            }
            jVar.E(0);
            return;
        }
        int i7 = w0Var.j2;
        Context context = w0Var.getContext();
        f6 f6Var = w0Var.I0;
        r0 r0Var = new r0(w0Var, 0);
        r0 r0Var2 = new r0(w0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = hd.M0(2131743836, "UnsavedChanges");
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131753596, "BoostingApplyChangesCountries") : hd.M0(2131753597, "BoostingApplyChangesChannels") : hd.M0(2131753595, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new u5.e(r0Var, 7));
        alertDialog$Builder.h(hd.M0(2131751407, "Discard"), new u5.e(r0Var2, 4));
        alertDialog$Builder.p();
    }
}
