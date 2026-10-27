package y8;

import z8.m0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ m c;

    public /* synthetic */ r(m mVar, m0 m0Var, int i10) {
        this.a = i10;
        this.c = mVar;
        this.b = m0Var;
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
