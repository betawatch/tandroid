package yh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public /* synthetic */ k(l lVar, int i3, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.post(new k(lVar, this.c, 1));
                break;
            default:
                int i3 = this.c;
                l lVar2 = this.b;
                if (i3 == lVar2.h) {
                    lVar2.f = false;
                    lVar2.d = true;
                    lVar2.b();
                    break;
                }
                break;
        }
    }
}
