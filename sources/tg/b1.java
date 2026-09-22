package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ b1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b;
                ArrayList arrayList = m1Var.r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                j1 j1Var = m1Var.Y;
                if (j1Var.N) {
                    j1Var.setLoading(false);
                    if (m1Var.d.G) {
                        m1Var.d0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                m1.T(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                m1 m1Var2 = this.b;
                m1Var2.o0 = (String) obj;
                pg.c1 c1Var = m1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(c1Var);
                AndroidUtilities.runOnUIThread(c1Var, 350L);
                break;
        }
    }
}
