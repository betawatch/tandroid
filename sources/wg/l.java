package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.t6;
import di.f4;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.xb;
import tg.z1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l extends u2 {
    public static l p1;
    public final j m1;
    public final u0 n1;
    public boolean o1;

    public l(Activity activity, y yVar, u0 u0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        this.n1 = u0Var;
        this.w0 = false;
        this.v0 = false;
        this.U0 = false;
        v0(0);
        O();
        org.telegram.messenger.g0.q3(this, i0.a.h(j6.w0(j6.h5, this.J0)) > 0.699999988079071d);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), u0Var, e6Var, yVar);
        this.m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new f4(yVar, u0Var));
        jVar.setPosition(0);
        this.O = jVar;
        yVar.p2 = new i(this, 0);
        yVar.n2 = new sg.h0(this, u0Var, false, 9);
        u0Var.q2 = new k(this, yVar, e6Var);
        u0Var.o2 = new i(this, 1);
        if (!z10) {
            np.s1(this.a).P1().U();
        }
        xb.a(this.c, new bi.t(14));
    }

    public static void I0(e2 e2Var, e6 e6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (p1 != null) {
            return;
        }
        boolean z10 = e6Var instanceof fi.b;
        e2 t6Var = z10 ? new t6(e2Var) : e2Var;
        l lVar = new l(e2Var.getParentActivity(), new y(t6Var, j3, prepaidGiveaway), new u0(t6Var, j3), t6Var.getResourceProvider(), z10);
        lVar.show();
        p1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        p1 = null;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void c0(Configuration configuration) {
        this.n1.c0(configuration);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        j jVar = this.m1;
        if (jVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        u0 u0Var = this.n1;
        HashSet hashSet = u0Var.a2;
        int size = hashSet.size();
        HashSet hashSet2 = u0Var.b2;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            if (this.d) {
                org.telegram.messenger.g0.v1(u0Var.b);
            }
            jVar.C(0);
            return;
        }
        int i7 = u0Var.n2;
        Context context = u0Var.getContext();
        e6 e6Var = u0Var.J0;
        p0 p0Var = new p0(u0Var, 0);
        p0 p0Var2 = new p0(u0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = hd.M0(2131743835, "UnsavedChanges");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : hd.M0(2131753596, "BoostingApplyChangesCountries") : hd.M0(2131753597, "BoostingApplyChangesChannels") : hd.M0(2131753595, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new z1(p0Var, 11));
        alertDialog$Builder.h(hd.M0(2131751406, "Discard"), new z1(p0Var2, 8));
        alertDialog$Builder.p();
    }
}
