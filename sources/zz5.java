// default package

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zz5 implements oj3, fd {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zz5(f42 f42Var, ku0 ku0Var, int i, a19 a19Var, TextView textView, pcc pccVar) {
        this.b = f42Var;
        this.c = ku0Var;
        this.a = i;
        this.d = a19Var;
        this.e = textView;
        this.f = pccVar;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final uj3 uj3Var2 = (uj3) this.f;
        String str3 = LaunchActivity.C1;
        final long j = ((if7) arrayList.get(0)).a;
        final TLRPC.Chat M0 = uc7.s1(launchActivity.P).M0(Long.valueOf(-j));
        final int i3 = this.a;
        if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = ob6.M0(2131754456, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M02;
            idVar.U = hl.S2(ob6.a0("AddMembersAlertNamesText", null, 2131754392, lbc.r(user), M0 == null ? "" : M0.title));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131754456, null), new fd() { // from class: g06
                @Override // fd
                public final void w(id idVar2, int i4) {
                    String str4 = LaunchActivity.C1;
                    Bundle l = bs2.l("scrollToTopOnResume", true);
                    long j2 = -j;
                    l.putLong("chat_id", j2);
                    zu1 zu1Var = new zu1(l);
                    int i5 = i3;
                    jn7.f(i5).k(jn7.s, new Object[0]);
                    uc7.s1(i5).k(j2, user, str2, zu1Var, false, null, null);
                    ((ActionBarLayout) LaunchActivity.this.N()).U(zu1Var, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            uc7.s1(i3).I(M0, user, new ic7() { // from class: f06
                @Override // ic7
                public final void a(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    hl.c3(new v06(LaunchActivity.this, str, tL_chatAdminRights2, z3, str2, i3, M0, uj3Var2, user, j, str4));
                }
            });
        }
        return true;
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        f42 f42Var = (f42) this.b;
        ku0 ku0Var = (ku0) this.c;
        a19 a19Var = (a19) this.d;
        TextView textView = (TextView) this.e;
        pcc pccVar = (pcc) this.f;
        String obj = f42Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            hl.z3(f42Var);
            ku0Var.a(Boolean.FALSE);
            return;
        }
        b19 f = b19.f(this.a);
        int i2 = a19Var == null ? -1 : a19Var.a;
        a19 d = f.d(obj);
        if (d == null || d.a == i2) {
            pccVar.a(obj);
            idVar.dismiss();
        } else {
            hl.z3(f42Var);
            textView.setText(ob6.M0(2131752643, null));
            ku0Var.a(Boolean.TRUE);
        }
    }

    public /* synthetic */ zz5(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, uj3 uj3Var) {
        this.b = launchActivity;
        this.a = i;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = uj3Var;
    }
}
