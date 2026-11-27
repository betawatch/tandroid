// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf6 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg6 b;

    public /* synthetic */ wf6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                cg6Var.c(true);
                cg6Var.Q.J1(0, true, null, true);
                cg6Var.n();
                break;
            case 1:
                cg6Var.Q.s0.popup = false;
                cg6Var.h(null);
                break;
            case 2:
                qh6 qh6Var = cg6Var.Q;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                String M0 = ob6.M0(2131743851, "TermsOfService");
                id idVar2 = alertDialog$Builder.a;
                idVar2.S = M0;
                idVar2.U = ob6.M0(2131743632, "TosDecline");
                alertDialog$Builder.j(ob6.M0(2131745048, "SignUp"), new wf6(cg6Var, (byte) 3));
                alertDialog$Builder.g(ob6.M0(2131751569, "Decline"), new wf6(cg6Var, (byte) 4));
                qh6Var.showDialog(idVar2);
                break;
            case 3:
                cg6Var.Q.s0.popup = false;
                cg6Var.h(null);
                break;
            default:
                cg6Var.c(true);
                cg6Var.Q.J1(0, true, null, true);
                break;
        }
    }
}
