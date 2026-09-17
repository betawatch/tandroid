package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er0;
import org.telegram.ui.es0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = callback2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new er0(tL_error, this.b, this.c, 27));
                break;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.b, tLObject, this.c, 25));
                break;
        }
    }
}
