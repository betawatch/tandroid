package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ ug0(ah0 ah0Var, int i7) {
        this.a = i7;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b.i1);
                break;
            default:
                org.telegram.messenger.g0.K3(this.b.j1.getEditText());
                break;
        }
    }
}
