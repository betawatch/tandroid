package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ zk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fk fkVar = this.b.H.Y;
                if (fkVar != null) {
                    fkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = fkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        break;
                    }
                }
                break;
            default:
                fk fkVar2 = this.b.H.Y;
                if (fkVar2 != null) {
                    fkVar2.F0();
                    break;
                }
                break;
        }
    }
}
