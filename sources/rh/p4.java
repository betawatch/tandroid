package rh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih.s b;

    public /* synthetic */ p4(ih.s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                org.telegram.messenger.i0.g3(new p4(this.b, 3));
                break;
            default:
                this.b.a(Boolean.FALSE, null);
                break;
        }
    }
}
