package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q80 b;

    public /* synthetic */ l4(q80 q80Var, int i10) {
        this.a = i10;
        this.b = q80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.b, 3));
                break;
            case 1:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
