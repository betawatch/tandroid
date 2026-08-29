package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(8, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                j jVar = this.b;
                jVar.U.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                break;
            default:
                j jVar2 = this.b;
                jVar2.U.duration_months = ((Integer) jVar2.W.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                break;
        }
    }
}
