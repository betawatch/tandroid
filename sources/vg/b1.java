package vg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ b1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                ArrayList arrayList = n1Var.r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                j1 j1Var = n1Var.Y;
                if (j1Var.Q) {
                    j1Var.setLoading(false);
                    if (n1Var.d.G) {
                        n1Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                n1.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                n1 n1Var2 = this.b;
                n1Var2.o0 = (String) obj;
                cy0 cy0Var = n1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(cy0Var);
                AndroidUtilities.runOnUIThread(cy0Var, 350L);
                break;
        }
    }
}
