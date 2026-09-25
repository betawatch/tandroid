package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ ta1(StickersActivity stickersActivity, int i10) {
        this.a = i10;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0();
                break;
            default:
                StickersActivity stickersActivity = this.b;
                stickersActivity.r--;
                break;
        }
    }
}
