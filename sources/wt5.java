// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu5 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ wt5(fu5 fu5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = fu5Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                runnable.run();
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            case 1:
                fu5Var.u();
                runnable.run();
                break;
            case 2:
                if (runnable != null) {
                    int i = -fu5Var.K;
                    fu5Var.K = i;
                    hl.A3(i, view, null);
                    yw0.E.a();
                    runnable.run();
                    break;
                }
                break;
            case 3:
                runnable.run();
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (fu5Var.J) {
                    fu5Var.u();
                    break;
                }
                break;
        }
    }
}
