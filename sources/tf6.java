// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf6 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zf6 b;

    public /* synthetic */ tf6(zf6 zf6Var, byte b) {
        this.a = b;
        this.b = zf6Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        zf6 zf6Var = this.b;
        switch (b) {
            case 0:
                zf6Var.d(true);
                zf6Var.Q.J1(0, true, null, true);
                zf6Var.n();
                break;
            case 1:
                zf6Var.Q.s0.popup = false;
                zf6Var.h(null);
                break;
            case 2:
                mh6 mh6Var = zf6Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                String M0 = jb6.M0(2131743883, "TermsOfService");
                he heVar2 = alertDialog$Builder.a;
                heVar2.S = M0;
                heVar2.U = jb6.M0(2131743664, "TosDecline");
                alertDialog$Builder.j(jb6.M0(2131745054, "SignUp"), new tf6(zf6Var, (byte) 3));
                alertDialog$Builder.g(jb6.M0(2131751541, "Decline"), new tf6(zf6Var, (byte) 4));
                mh6Var.showDialog(heVar2);
                break;
            case 3:
                zf6Var.Q.s0.popup = false;
                zf6Var.h(null);
                break;
            default:
                zf6Var.d(true);
                zf6Var.Q.J1(0, true, null, true);
                break;
        }
    }
}
