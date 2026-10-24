package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.m4;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                if (h1Var.Q) {
                    h1Var.setLoading(false);
                    if (l1Var.d.G) {
                        l1Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                l1.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                l1 l1Var2 = this.b;
                l1Var2.o0 = (String) obj;
                m4 m4Var = l1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(m4Var);
                AndroidUtilities.runOnUIThread(m4Var, 350L);
                break;
        }
    }
}
