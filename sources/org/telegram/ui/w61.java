package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ w61(StickersActivity stickersActivity, int i10) {
        this.a = i10;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q0();
                break;
            default:
                StickersActivity stickersActivity = this.b;
                stickersActivity.n--;
                break;
        }
    }
}
