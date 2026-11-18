package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.z8;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.gc;
import tg.z1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l extends x2 {
    public static l p1;
    public final j m1;
    public final w0 n1;
    public boolean o1;

    public l(Activity activity, a0 a0Var, w0 w0Var, i6 i6Var, boolean z10) {
        super(1, (Context) activity, i6Var, true);
        this.n1 = w0Var;
        this.w0 = false;
        this.v0 = false;
        this.U0 = false;
        v0(0);
        O();
        org.telegram.messenger.g0.p3(this, i0.a.h(n6.w0(n6.h5, this.J0)) > 0.699999988079071d);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, i6Var, a0Var);
        this.m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(a0Var, w0Var));
        jVar.setPosition(0);
        this.O = jVar;
        a0Var.p2 = new i(this, 0);
        a0Var.n2 = new sg.h0(this, w0Var, false, 9);
        w0Var.q2 = new k(this, a0Var, i6Var);
        w0Var.o2 = new i(this, 1);
        if (!z10) {
            mp.u1(this.a).R1().U();
        }
        gc.a(this.c, new bi.t(14));
    }

    public static void J0(h2 h2Var, i6 i6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (p1 != null) {
            return;
        }
        boolean z10 = i6Var instanceof fi.b;
        h2 z8Var = z10 ? new z8(h2Var) : h2Var;
        l lVar = new l(h2Var.getParentActivity(), new a0(z8Var, j3, prepaidGiveaway), new w0(z8Var, j3), z8Var.getResourceProvider(), z10);
        lVar.show();
        p1 = lVar;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        p1 = null;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void c0(Configuration configuration) {
        this.n1.c0(configuration);
        this.o1 = getContext().getResources().getConfiguration().orientation == 2;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
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
        i6 i6Var = w0Var.J0;
        r0 r0Var = new r0(w0Var, 0);
        r0 r0Var2 = new r0(w0Var, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131743598, "UnsavedChanges");
        u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : gd.M0(2131753594, "BoostingApplyChangesCountries") : gd.M0(2131753595, "BoostingApplyChangesChannels") : gd.M0(2131753593, "BoostingApplyChangesUsers");
        alertDialog$Builder.k(gd.M0(2131754214, "ApplyTheme"), new z1(r0Var, 12));
        alertDialog$Builder.h(gd.M0(2131751395, "Discard"), new z1(r0Var2, 9));
        alertDialog$Builder.p();
    }
}
