package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ z91(StickersActivity stickersActivity, int i10) {
        this.a = i10;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n0();
                break;
            default:
                StickersActivity stickersActivity = this.b;
                stickersActivity.n--;
                break;
        }
    }
}
