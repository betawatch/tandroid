package x8;

import y8.l0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
