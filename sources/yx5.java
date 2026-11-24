// default package

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yx5 implements wi3, ed {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yx5(p32 p32Var, au0 au0Var, int i, nx8 nx8Var, TextView textView, p8c p8cVar) {
        this.b = p32Var;
        this.c = au0Var;
        this.a = i;
        this.d = nx8Var;
        this.e = textView;
        this.f = p8cVar;
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final cj3 cj3Var2 = (cj3) this.f;
        String str3 = LaunchActivity.C1;
        final long j = ((zc7) arrayList.get(0)).a;
        final TLRPC.Chat K0 = na7.q1(launchActivity.P).K0(Long.valueOf(-j));
        final int i3 = this.a;
        if (K0 == null || (!K0.creator && ((tL_chatAdminRights = K0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = k96.M0(2131754460, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.a0("AddMembersAlertNamesText", null, 2131754396, l7c.r(user), K0 == null ? "" : K0.title));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.j(k96.M0(2131754460, null), new ed() { // from class: gy5
                @Override // ed
                public final void u(hd hdVar2, int i4) {
                    String str4 = LaunchActivity.C1;
                    Bundle l = ir2.l("scrollToTopOnResume", true);
                    long j2 = -j;
                    l.putLong("chat_id", j2);
                    mu1 mu1Var = new mu1(l);
                    int i5 = i3;
                    kk7.f(i5).k(kk7.s, new Object[0]);
                    na7.q1(i5).k(j2, user, str2, mu1Var, null);
                    ((ActionBarLayout) LaunchActivity.this.N()).U(mu1Var, true, false);
                }
            });
            alertDialog$Builder.o();
        } else {
            na7.q1(i3).G(K0, user, new ba7() { // from class: fy5
                @Override // ba7
                public final void a(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    gl.c3(new uy5(LaunchActivity.this, str, tL_chatAdminRights2, z3, str2, i3, K0, cj3Var2, user, j, str4));
                }
            });
        }
        return true;
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        p32 p32Var = (p32) this.b;
        au0 au0Var = (au0) this.c;
        nx8 nx8Var = (nx8) this.d;
        TextView textView = (TextView) this.e;
        p8c p8cVar = (p8c) this.f;
        String obj = p32Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            gl.z3(p32Var);
            au0Var.a(Boolean.FALSE);
            return;
        }
        ox8 f = ox8.f(this.a);
        int i2 = nx8Var == null ? -1 : nx8Var.a;
        nx8 d = f.d(obj);
        if (d == null || d.a == i2) {
            p8cVar.a(obj);
            hdVar.dismiss();
        } else {
            gl.z3(p32Var);
            textView.setText(k96.M0(2131752650, null));
            au0Var.a(Boolean.TRUE);
        }
    }

    public /* synthetic */ yx5(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, cj3 cj3Var) {
        this.b = launchActivity;
        this.a = i;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = cj3Var;
    }
}
