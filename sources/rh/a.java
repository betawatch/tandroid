package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f6(10, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                k kVar = this.b;
                kVar.V.commission_permille = ((Integer) obj).intValue();
                kVar.I0();
                break;
            default:
                k kVar2 = this.b;
                kVar2.V.duration_months = ((Integer) kVar2.X.get(((Integer) obj).intValue())).intValue();
                kVar2.I0();
                break;
        }
    }
}
