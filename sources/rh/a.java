package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.e6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(12, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                j jVar = this.b;
                jVar.V.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                break;
            default:
                j jVar2 = this.b;
                jVar2.V.duration_months = ((Integer) jVar2.X.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                break;
        }
    }
}
