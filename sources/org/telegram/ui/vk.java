package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;

    public /* synthetic */ vk(wk wkVar, int i9) {
        this.a = i9;
        this.b = wkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak akVar = this.b.D.U;
                if (akVar != null) {
                    akVar.P0 = false;
                    org.telegram.ui.Components.uf ufVar = akVar.Q0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        break;
                    }
                }
                break;
            default:
                ak akVar2 = this.b.D.U;
                if (akVar2 != null) {
                    akVar2.G0();
                    break;
                }
                break;
        }
    }
}
