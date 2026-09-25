package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.jr0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = callback2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cn0(tL_error, this.b, this.c, 29));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jr0(tL_error, this.b, tLObject, this.c, 26));
                break;
        }
    }
}
