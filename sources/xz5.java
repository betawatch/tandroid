// default package

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz5 implements hk3, ee {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xz5(a52 a52Var, jv0 jv0Var, int i, oz8 oz8Var, TextView textView, qac qacVar) {
        this.b = a52Var;
        this.c = jv0Var;
        this.a = i;
        this.d = oz8Var;
        this.e = textView;
        this.f = qacVar;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final nk3 nk3Var2 = (nk3) this.f;
        String str3 = LaunchActivity.C1;
        final long j = ((bf7) arrayList.get(0)).a;
        final TLRPC.Chat L0 = oc7.r1(launchActivity.P).L0(Long.valueOf(-j));
        final int i3 = this.a;
        if (L0 == null || (!L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = jb6.M0(2131754460, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0("AddMembersAlertNamesText", null, 2131754396, m9c.r(user), L0 == null ? "" : L0.title));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131754460, null), new ee() { // from class: f06
                @Override // ee
                public final void r(he heVar2, int i4) {
                    String str4 = LaunchActivity.C1;
                    Bundle l = ts2.l("scrollToTopOnResume", true);
                    long j2 = -j;
                    l.putLong("chat_id", j2);
                    yv1 yv1Var = new yv1(l);
                    int i5 = i3;
                    nm7.f(i5).k(nm7.s, new Object[0]);
                    oc7.r1(i5).k(j2, user, str2, yv1Var, false, null, null);
                    ((ActionBarLayout) LaunchActivity.this.N()).U(yv1Var, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            oc7.r1(i3).G(L0, user, new cc7() { // from class: e06
                @Override // cc7
                public final void a(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    gm.c3(new u06(LaunchActivity.this, str, tL_chatAdminRights2, z3, str2, i3, L0, nk3Var2, user, j, str4));
                }
            });
        }
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        a52 a52Var = (a52) this.b;
        jv0 jv0Var = (jv0) this.c;
        oz8 oz8Var = (oz8) this.d;
        TextView textView = (TextView) this.e;
        qac qacVar = (qac) this.f;
        String obj = a52Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            gm.z3(a52Var);
            jv0Var.a(Boolean.FALSE);
            return;
        }
        pz8 f = pz8.f(this.a);
        int i2 = oz8Var == null ? -1 : oz8Var.a;
        oz8 d = f.d(obj);
        if (d == null || d.a == i2) {
            qacVar.a(obj);
            heVar.dismiss();
        } else {
            gm.z3(a52Var);
            textView.setText(jb6.M0(2131752615, null));
            jv0Var.a(Boolean.TRUE);
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public /* synthetic */ xz5(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, nk3 nk3Var) {
        this.b = launchActivity;
        this.a = i;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = nk3Var;
    }
}
