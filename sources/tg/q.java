package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.es0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                AndroidUtilities.runOnUIThread(new fr0(tL_error, this.b, this.c, 26));
                break;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.b, tLObject, this.c, 25));
                break;
        }
    }
}
