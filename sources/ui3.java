// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ui3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi3 b;

    public /* synthetic */ ui3(vi3 vi3Var, byte b) {
        this.a = b;
        this.b = vi3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        vi3 vi3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = vi3Var.u0;
                Context context = vi3Var.getContext();
                i = ((d) cj3Var).currentAccount;
                cj3Var.showDialog(new h26(3, i, null, context, cj3Var));
                break;
            default:
                cj3 cj3Var2 = vi3Var.u0;
                th3 th3Var = cj3Var2.N0;
                if (th3Var != null) {
                    th3Var.dismiss();
                    cj3Var2.N0 = null;
                    break;
                }
                break;
        }
    }
}
