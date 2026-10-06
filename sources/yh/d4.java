package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;

    public /* synthetic */ d4(int i10, Utilities.Callback2 callback2) {
        this.a = i10;
        this.b = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new d4(1, this.b));
                break;
            case 1:
                this.b.run(Boolean.FALSE, null);
                break;
            case 2:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            default:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
        }
    }
}
