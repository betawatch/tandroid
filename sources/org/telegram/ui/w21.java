package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih.b b;

    public /* synthetic */ w21(ih.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.J3(((a21) this.b.Z1).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
