package qh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ l(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                r9 r9Var = this.b;
                r9Var.H0 = false;
                r9Var.I0 = TLObject.FLAG_31;
                r9Var.invalidate();
                r9Var.P0.setVisibility(0);
                r9Var.Q0.setVisibility(0);
                break;
            default:
                ca caVar = this.b.P1;
                q9 q9Var = caVar.U0;
                if (q9Var != null) {
                    q9Var.L = false;
                    q9Var.c();
                    q9 q9Var2 = caVar.U0;
                    q9Var2.m(0L);
                    ma maVar = q9Var2.C;
                    if (maVar != null) {
                        maVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
