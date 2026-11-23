package vg;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
