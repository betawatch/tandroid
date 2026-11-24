// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud6 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ae6 b;

    public /* synthetic */ ud6(ae6 ae6Var, byte b) {
        this.a = b;
        this.b = ae6Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        ae6 ae6Var = this.b;
        switch (b) {
            case 0:
                ae6Var.d(true);
                ae6Var.Q.I1(0, true, null, true);
                ae6Var.n();
                break;
            case 1:
                ae6Var.Q.s0.popup = false;
                ae6Var.h(null);
                break;
            case 2:
                mf6 mf6Var = ae6Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                String M0 = k96.M0(2131743957, "TermsOfService");
                hd hdVar2 = alertDialog$Builder.a;
                hdVar2.S = M0;
                hdVar2.U = k96.M0(2131743738, "TosDecline");
                alertDialog$Builder.j(k96.M0(2131745128, "SignUp"), new ud6(ae6Var, (byte) 3));
                alertDialog$Builder.g(k96.M0(2131751592, "Decline"), new ud6(ae6Var, (byte) 4));
                mf6Var.showDialog(hdVar2);
                break;
            case 3:
                ae6Var.Q.s0.popup = false;
                ae6Var.h(null);
                break;
            default:
                ae6Var.d(true);
                ae6Var.Q.I1(0, true, null, true);
                break;
        }
    }
}
