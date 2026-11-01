package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
