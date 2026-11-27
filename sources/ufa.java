// default package

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ufa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ eja b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ufa(eja ejaVar, vnb vnbVar, int i, r47 r47Var) {
        this.b = ejaVar;
        this.c = vnbVar;
        this.e = i;
        this.d = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id[] idVarArr = {new id(3, this.c, this.b.getContext())};
                int i = this.e;
                int v0 = r7a.B(i).v0(this.d, null, new xh0(idVarArr, (byte) 10));
                if (v0 != 0) {
                    hl.d3(new xfa(idVarArr, i, v0, (byte) 0), 500L);
                    break;
                }
                break;
            default:
                eja ejaVar = this.b;
                Context context = ejaVar.getContext();
                vnb vnbVar = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                id idVar = alertDialog$Builder.a;
                idVar.Q0 = false;
                r47 r47Var = this.d;
                if (r47Var.b4()) {
                    idVar.S = ob6.M0(2131744481, null);
                    idVar.U = ob6.M0(2131744482, null);
                } else {
                    idVar.S = ob6.M0(2131744486, null);
                    idVar.U = ob6.M0(2131744487, null);
                }
                alertDialog$Builder.j(ob6.M0(2131744498, null), new an(ejaVar, vnbVar, r47Var, this.e, (byte) 10));
                ik8.y(null, 2131752570, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ ufa(eja ejaVar, vnb vnbVar, r47 r47Var, int i) {
        this.b = ejaVar;
        this.c = vnbVar;
        this.d = r47Var;
        this.e = i;
    }
}
