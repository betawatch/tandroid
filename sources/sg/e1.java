package sg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ e1(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                ArrayList arrayList = p1Var.r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                m1 m1Var = p1Var.Y;
                if (m1Var.N) {
                    m1Var.setLoading(false);
                    if (p1Var.d.G) {
                        p1Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                p1.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                p1 p1Var2 = this.b;
                p1Var2.o0 = (String) obj;
                a1 a1Var = p1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(a1Var);
                AndroidUtilities.runOnUIThread(a1Var, 350L);
                break;
        }
    }
}
