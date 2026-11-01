package rh;

import org.telegram.messenger.k20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k20 b;

    public /* synthetic */ m4(k20 k20Var, int i10) {
        this.a = i10;
        this.b = k20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, null);
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                org.telegram.messenger.f8.b("StarsController.buy onCanceled");
                org.telegram.messenger.i0.g3(new m4(this.b, 0));
                break;
        }
    }
}
