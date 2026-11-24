// default package

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class t16 implements ed, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h26 b;

    public /* synthetic */ t16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        h26 h26Var = this.b;
        h26Var.n1.getOnItemClickListener().d(i, view);
        if (h26Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        h26 h26Var = this.b;
        switch (b) {
            case 0:
                h26Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                h26Var.dismiss();
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                h26Var.Z0();
                break;
        }
    }
}
