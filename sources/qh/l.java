package qh;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ l(q9 q9Var, int i10) {
        this.a = i10;
        this.b = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                q9 q9Var = this.b;
                q9Var.H0 = false;
                q9Var.I0 = TLObject.FLAG_31;
                q9Var.invalidate();
                q9Var.P0.setVisibility(0);
                q9Var.Q0.setVisibility(0);
                break;
            default:
                ba baVar = this.b.P1;
                p9 p9Var = baVar.U0;
                if (p9Var != null) {
                    p9Var.L = false;
                    p9Var.c();
                    p9 p9Var2 = baVar.U0;
                    p9Var2.m(0L);
                    la laVar = p9Var2.C;
                    if (laVar != null) {
                        laVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
