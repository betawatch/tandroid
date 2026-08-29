package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk b;

    public /* synthetic */ yk(zk zkVar, int i10) {
        this.a = i10;
        this.b = zkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dk dkVar = this.b.D.U;
                if (dkVar != null) {
                    dkVar.P0 = false;
                    org.telegram.ui.Components.xf xfVar = dkVar.Q0;
                    if (xfVar != null) {
                        xfVar.u(false);
                        break;
                    }
                }
                break;
            default:
                dk dkVar2 = this.b.D.U;
                if (dkVar2 != null) {
                    dkVar2.H0();
                    break;
                }
                break;
        }
    }
}
