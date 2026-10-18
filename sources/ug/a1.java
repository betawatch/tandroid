package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ a1(m1 m1Var, int i10) {
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
                i1 i1Var = m1Var.Y;
                if (i1Var.N) {
                    i1Var.setLoading(false);
                    if (m1Var.d.G) {
                        m1Var.e0();
                        break;
                    }
                }
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                m1.U(this.b, (TL_account.TL_birthday) obj);
                break;
            default:
                m1 m1Var2 = this.b;
                m1Var2.o0 = (String) obj;
                p8.b bVar = m1Var2.w0;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                break;
        }
    }
}
