package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.m0 b;

    public /* synthetic */ l4(ai.m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new l4(this.b, 3));
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
