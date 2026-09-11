package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ c1(n1 n1Var, int i10) {
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
                k1 k1Var = n1Var.Y;
                if (k1Var.N) {
                    k1Var.setLoading(false);
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
                rg.b0 b0Var = n1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                AndroidUtilities.runOnUIThread(b0Var, 350L);
                break;
        }
    }
}
