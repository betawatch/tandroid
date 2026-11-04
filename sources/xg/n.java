package xg;

import ai.c7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.o4;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ac;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends t2 {
    public static n m1;
    public final l j1;
    public final w0 k1;
    public boolean l1;

    public n(Activity activity, a0 a0Var, w0 w0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        this.k1 = w0Var;
        this.w0 = false;
        this.v0 = false;
        this.U0 = false;
        v0(0);
        N();
        org.telegram.messenger.g0.q3(this, i0.a.h(k6.w0(k6.h5, this.J0)) > 0.699999988079071d);
        this.l1 = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), w0Var, e6Var, a0Var);
        this.j1 = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new o4(a0Var, w0Var));
        lVar.setPosition(0);
        this.O = lVar;
        a0Var.m2 = new k(this, 0);
        a0Var.k2 = new ua.b(this, w0Var, false, 4);
        w0Var.n2 = new m(this, a0Var, e6Var);
        w0Var.l2 = new k(this, 1);
        if (!z10) {
            hp.s1(this.a).P1().U();
        }
        ac.a(this.c, new ai.y(14));
    }

    public static void I0(d2 d2Var, e6 e6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (m1 != null) {
            return;
        }
        boolean z10 = e6Var instanceof ei.b;
        d2 c7Var = z10 ? new c7(d2Var) : d2Var;
        n nVar = new n(d2Var.getParentActivity(), new a0(c7Var, j10, prepaidGiveaway), new w0(c7Var, j10), c7Var.getResourceProvider(), z10);
        nVar.show();
        m1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        m1 = null;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void c0(Configuration configuration) {
        this.k1.c0(configuration);
        this.l1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        l lVar = this.j1;
        if (lVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        w0 w0Var = this.k1;
        HashSet hashSet = w0Var.X1;
        int size = hashSet.size();
        HashSet hashSet2 = w0Var.Y1;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(w0Var.b);
            }
            lVar.D(0);
            return;
        }
        int i3 = w0Var.k2;
        Context context = w0Var.getContext();
        e6 e6Var = w0Var.J0;
        r0 r0Var = new r0(w0Var, 0);
        r0 r0Var2 = new r0(w0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = bd.M0(2131743845, "UnsavedChanges");
        s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : bd.M0(2131753596, "BoostingApplyChangesCountries") : bd.M0(2131753597, "BoostingApplyChangesChannels") : bd.M0(2131753595, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(bd.M0(2131754216, "ApplyTheme"), new c(r0Var, 2));
        alertDialog$Builder.h(bd.M0(2131751407, "Discard"), new e3(r0Var2, 29));
        alertDialog$Builder.p();
    }
}
