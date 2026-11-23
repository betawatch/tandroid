package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.e9;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l extends w2 {
    public static l p1;
    public final j m1;
    public final v0 n1;
    public boolean o1;

    public l(Activity activity, z zVar, v0 v0Var, i6 i6Var, boolean z10) {
        super(1, (Context) activity, i6Var, true);
        this.n1 = v0Var;
        this.w0 = false;
        this.v0 = false;
        this.U0 = false;
        v0(0);
        O();
        org.telegram.messenger.g0.p3(this, i0.a.h(n6.w0(n6.h5, this.J0)) > 0.699999988079071d);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), v0Var, i6Var, zVar);
        this.m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(zVar, v0Var));
        jVar.setPosition(0);
        this.O = jVar;
        zVar.p2 = new i(this, 0);
        zVar.n2 = new s2.e(this, v0Var, false, 10);
        v0Var.q2 = new k(this, zVar, i6Var);
        v0Var.o2 = new i(this, 1);
        if (!z10) {
            mp.u1(this.a).R1().U();
        }
        fc.a(this.c, new bi.t(14));
    }

    public static void J0(g2 g2Var, i6 i6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (p1 != null) {
            return;
        }
        boolean z10 = i6Var instanceof fi.b;
        g2 e9Var = z10 ? new e9(g2Var) : g2Var;
        l lVar = new l(g2Var.getParentActivity(), new z(e9Var, j3, prepaidGiveaway), new v0(e9Var, j3), e9Var.getResourceProvider(), z10);
        lVar.show();
        p1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        p1 = null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void c0(Configuration configuration) {
        this.n1.c0(configuration);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        j jVar = this.m1;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        v0 v0Var = this.n1;
        HashSet hashSet = v0Var.a2;
        int size = hashSet.size();
        HashSet hashSet2 = v0Var.b2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(v0Var.b);
            }
            jVar.C(0);
            return;
        }
        int i7 = v0Var.n2;
        Context context = v0Var.getContext();
        i6 i6Var = v0Var.J0;
        q0 q0Var = new q0(v0Var, 0);
        q0 q0Var2 = new q0(v0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = gd.N0(2131743588, "UnsavedChanges");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.N0(2131753593, "BoostingApplyChangesCountries") : gd.N0(2131753594, "BoostingApplyChangesChannels") : gd.N0(2131753592, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(gd.N0(2131754213, "ApplyTheme"), new tg.s(q0Var, 15));
        alertDialog$Builder.h(gd.N0(2131751394, "Discard"), new tg.s(q0Var2, 12));
        alertDialog$Builder.p();
    }
}
