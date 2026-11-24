// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu5 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ tt5(bu5 bu5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = bu5Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                runnable.run();
                break;
            case 1:
                runnable.run();
                if (bu5Var.J) {
                    bu5Var.u();
                    break;
                }
                break;
            case 2:
                runnable.run();
                if (bu5Var.J) {
                    bu5Var.u();
                    break;
                }
                break;
            case 3:
                if (runnable != null) {
                    int i = -bu5Var.K;
                    bu5Var.K = i;
                    gm.A3(i, view, null);
                    xx0.E.a();
                    runnable.run();
                    break;
                }
                break;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (bu5Var.J) {
                    bu5Var.u();
                    break;
                }
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (bu5Var.J) {
                    bu5Var.u();
                    break;
                }
                break;
        }
    }
}
