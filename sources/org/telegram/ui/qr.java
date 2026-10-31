package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ qr(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ii iiVar = this.b.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ii iiVar2 = this.b.a;
                if (iiVar2 != null) {
                    iiVar2.f3.O(true);
                    break;
                }
                break;
        }
    }
}
