package ti;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                iVar.q();
                if (iVar.b.h()) {
                    g0.i3(this, 500L);
                    break;
                }
                break;
            default:
                i iVar2 = this.b;
                if (!iVar2.b.u()) {
                    iVar2.u = false;
                    iVar2.o(false);
                    iVar2.w = false;
                    break;
                } else {
                    g0.i3(this, 1500L);
                    break;
                }
        }
    }
}
