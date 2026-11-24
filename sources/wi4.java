// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wi4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yi4 b;

    public /* synthetic */ wi4(yi4 yi4Var, byte b) {
        this.a = b;
        this.b = yi4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yi4 yi4Var = this.b;
        switch (b) {
            case 0:
                View view = yi4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    xi4 xi4Var = yi4Var.s;
                    xi4Var.getClass();
                    System.currentTimeMillis();
                    xi4Var.c = false;
                    yi4Var.s.a();
                    break;
                }
                break;
            default:
                View view2 = yi4Var.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    xi4 xi4Var2 = yi4Var.s;
                    xi4Var2.b = false;
                    xi4Var2.a();
                    break;
                }
                break;
        }
    }
}
