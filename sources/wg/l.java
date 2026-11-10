package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.g5;
import bi.w4;
import fi.r7;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.bc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends w2 {
    public static l o1;
    public final j l1;
    public final w0 m1;
    public boolean n1;

    public l(Activity activity, z zVar, w0 w0Var, h6 h6Var, boolean z9) {
        super(1, (Context) activity, h6Var, true);
        this.m1 = w0Var;
        this.v0 = false;
        this.u0 = false;
        this.T0 = false;
        v0(0);
        N();
        org.telegram.messenger.g0.q3(this, i0.a.h(m6.w0(m6.h5, this.I0)) > 0.699999988079071d);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, h6Var, zVar);
        this.l1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new g5(zVar, w0Var));
        jVar.setPosition(0);
        this.N = jVar;
        zVar.o2 = new i(this, 0);
        zVar.m2 = new sg.i0(this, w0Var, false, 9);
        w0Var.p2 = new k(this, zVar, h6Var);
        w0Var.n2 = new i(this, 1);
        if (!z9) {
            qp.s1(this.a).P1().U();
        }
        bc.a(this.c, new r7(13));
    }

    public static void I0(f2 f2Var, h6 h6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (o1 != null) {
            return;
        }
        boolean z9 = h6Var instanceof di.b;
        f2 w4Var = z9 ? new w4(f2Var) : f2Var;
        l lVar = new l(f2Var.getParentActivity(), new z(w4Var, j3, prepaidGiveaway), new w0(w4Var, j3), w4Var.getResourceProvider(), z9);
        lVar.show();
        o1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        o1 = null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void c0(Configuration configuration) {
        this.m1.c0(configuration);
        this.n1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        j jVar = this.l1;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        w0 w0Var = this.m1;
        HashSet hashSet = w0Var.Z1;
        int size = hashSet.size();
        HashSet hashSet2 = w0Var.a2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(w0Var.b);
            }
            jVar.E(0);
            return;
        }
        int i7 = w0Var.m2;
        Context context = w0Var.getContext();
        h6 h6Var = w0Var.I0;
        r0 r0Var = new r0(w0Var, 0);
        r0 r0Var2 = new r0(w0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String M0 = id.M0(2131743835, "UnsavedChanges");
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : id.M0(2131753596, "BoostingApplyChangesCountries") : id.M0(2131753597, "BoostingApplyChangesChannels") : id.M0(2131753595, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(id.M0(2131754216, "ApplyTheme"), new u5.e(r0Var, 7));
        alertDialog$Builder.h(id.M0(2131751406, "Discard"), new u5.e(r0Var2, 4));
        alertDialog$Builder.p();
    }
}
