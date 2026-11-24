// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs5 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ur5(cs5 cs5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = cs5Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                runnable.run();
                break;
            case 1:
                runnable.run();
                if (cs5Var.J) {
                    cs5Var.u();
                    break;
                }
                break;
            case 2:
                runnable.run();
                if (cs5Var.J) {
                    cs5Var.u();
                    break;
                }
                break;
            case 3:
                if (runnable != null) {
                    int i = -cs5Var.K;
                    cs5Var.K = i;
                    gl.A3(i, view, null);
                    pw0.E.a();
                    runnable.run();
                    break;
                }
                break;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (cs5Var.J) {
                    cs5Var.u();
                    break;
                }
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (cs5Var.J) {
                    cs5Var.u();
                    break;
                }
                break;
        }
    }
}
