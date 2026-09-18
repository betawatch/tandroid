package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.hs0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ q(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = callback2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gr0(tL_error, this.b, this.c, 26));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hs0(tL_error, this.b, tLObject, this.c, 25));
                break;
        }
    }
}
