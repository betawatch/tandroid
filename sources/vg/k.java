package vg;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                if (lVar.d.K == lVar) {
                    lVar.d.a0 = false;
                    lVar.d.b0 = null;
                    lVar.d.i();
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (lVar2.d.K == lVar2 && !lVar2.b) {
                    lVar2.d.a0 = true;
                    Runnable runnable = lVar2.d.b0;
                    lVar2.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
