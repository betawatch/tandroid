package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.b9;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.gc;
import tg.o1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l extends w2 {
    public static l p1;
    public final j m1;
    public final w0 n1;
    public boolean o1;

    public l(Activity activity, a0 a0Var, w0 w0Var, h6 h6Var, boolean z10) {
        super(1, (Context) activity, h6Var, true);
        this.n1 = w0Var;
        this.w0 = false;
        this.v0 = false;
        this.U0 = false;
        v0(0);
        O();
        org.telegram.messenger.g0.p3(this, i0.a.h(m6.w0(m6.h5, this.J0)) > 0.699999988079071d);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, h6Var, a0Var);
        this.m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(a0Var, w0Var));
        jVar.setPosition(0);
        this.O = jVar;
        a0Var.p2 = new i(this, 0);
        a0Var.n2 = new sg.h0(this, w0Var, false, 9);
        w0Var.q2 = new k(this, a0Var, h6Var);
        w0Var.o2 = new i(this, 1);
        if (!z10) {
            np.u1(this.a).R1().U();
        }
        gc.a(this.c, new bi.t(14));
    }

    public static void J0(g2 g2Var, h6 h6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (p1 != null) {
            return;
        }
        boolean z10 = h6Var instanceof fi.b;
        g2 b9Var = z10 ? new b9(g2Var) : g2Var;
        l lVar = new l(g2Var.getParentActivity(), new a0(b9Var, j3, prepaidGiveaway), new w0(b9Var, j3), b9Var.getResourceProvider(), z10);
        lVar.show();
        p1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
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
        w0 w0Var = this.n1;
        HashSet hashSet = w0Var.a2;
        int size = hashSet.size();
        HashSet hashSet2 = w0Var.b2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(w0Var.b);
            }
            jVar.A(0);
            return;
        }
        int i7 = w0Var.n2;
        Context context = w0Var.getContext();
        h6 h6Var = w0Var.J0;
        r0 r0Var = new r0(w0Var, 0);
        r0 r0Var2 = new r0(w0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131743590, "UnsavedChanges");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.N0(2131753593, "BoostingApplyChangesCountries") : hd.N0(2131753594, "BoostingApplyChangesChannels") : hd.N0(2131753592, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(hd.N0(2131754213, "ApplyTheme"), new o1(r0Var, 13));
        alertDialog$Builder.h(hd.N0(2131751394, "Discard"), new o1(r0Var2, 10));
        alertDialog$Builder.p();
    }
}
