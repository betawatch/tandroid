package wg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(e eVar, int i3, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                eVar.postOnAnimation(new b(eVar, this.c, 1));
                break;
            default:
                e eVar2 = this.b;
                int i3 = this.c;
                if (eVar2.e && !eVar2.r && i3 == eVar2.F) {
                    eVar2.y = true;
                    eVar2.requestRender();
                    break;
                }
                break;
        }
    }
}
