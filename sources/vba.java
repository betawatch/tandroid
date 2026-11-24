// default package

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vba implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ nfa b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ int e;

    public /* synthetic */ vba(nfa nfaVar, wjb wjbVar, int i, k27 k27Var) {
        this.b = nfaVar;
        this.c = wjbVar;
        this.e = i;
        this.d = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd[] hdVarArr = {new hd(3, this.c, this.b.getContext())};
                int i = this.e;
                int v0 = z3a.B(i).v0(this.d, null, new wh0(hdVarArr, (byte) 9));
                if (v0 != 0) {
                    gl.d3(new fca(hdVarArr, i, v0, (byte) 0), 500L);
                    break;
                }
                break;
            default:
                nfa nfaVar = this.b;
                Context context = nfaVar.getContext();
                wjb wjbVar = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                hd hdVar = alertDialog$Builder.a;
                hdVar.Q0 = false;
                k27 k27Var = this.d;
                if (k27Var.b4()) {
                    hdVar.S = k96.M0(2131744587, null);
                    hdVar.U = k96.M0(2131744588, null);
                } else {
                    hdVar.S = k96.M0(2131744592, null);
                    hdVar.U = k96.M0(2131744593, null);
                }
                alertDialog$Builder.j(k96.M0(2131744604, null), new zm(nfaVar, wjbVar, k27Var, this.e, (byte) 10));
                ug8.y(null, 2131752577, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ vba(nfa nfaVar, wjb wjbVar, k27 k27Var, int i) {
        this.b = nfaVar;
        this.c = wjbVar;
        this.d = k27Var;
        this.e = i;
    }
}
