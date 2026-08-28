package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ t91(StickersActivity stickersActivity, int i9) {
        this.a = i9;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l0();
                break;
            default:
                StickersActivity stickersActivity = this.b;
                stickersActivity.r--;
                break;
        }
    }
}
