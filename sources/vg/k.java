package vg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (lVar.d.J == lVar) {
                    lVar.d.W = false;
                    lVar.d.a0 = null;
                    lVar.d.i();
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (lVar2.d.J == lVar2 && !lVar2.b) {
                    lVar2.d.W = true;
                    Runnable runnable = lVar2.d.a0;
                    lVar2.d.a0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
