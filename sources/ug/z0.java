package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ z0(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                ArrayList arrayList = l1Var.r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                h1 h1Var = l1Var.Y;
                if (h1Var.N) {
                    h1Var.setLoading(false);
                    if (l1Var.d.G) {
                        l1Var.e0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                l1.U(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                l1 l1Var2 = this.b;
                l1Var2.o0 = (String) obj;
                p4.s0 s0Var = l1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(s0Var);
                AndroidUtilities.runOnUIThread(s0Var, 350L);
                break;
        }
    }
}
