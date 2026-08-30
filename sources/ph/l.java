package ph;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ l(t9 t9Var, int i10) {
        this.a = i10;
        this.b = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                t9 t9Var = this.b;
                t9Var.H0 = false;
                t9Var.I0 = TLObject.FLAG_31;
                t9Var.invalidate();
                t9Var.P0.setVisibility(0);
                t9Var.Q0.setVisibility(0);
                break;
            default:
                da daVar = this.b.P1;
                s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.L = false;
                    s9Var.c();
                    s9 s9Var2 = daVar.U0;
                    s9Var2.m(0L);
                    oa oaVar = s9Var2.C;
                    if (oaVar != null) {
                        oaVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
