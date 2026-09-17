package x8;

import y8.l0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ m c;

    public /* synthetic */ q(m mVar, l0 l0Var, int i10) {
        this.a = i10;
        this.c = mVar;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.c.onPeerConnected(this.b);
                break;
            default:
                this.c.c.onPeerDisconnected(this.b);
                break;
        }
    }
}
