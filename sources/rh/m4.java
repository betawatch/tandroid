package rh;

import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ m4(j20 j20Var, int i10) {
        this.a = i10;
        this.b = j20Var;
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
