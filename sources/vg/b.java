package vg;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(e eVar, int i7, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = i7;
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
                int i7 = this.c;
                if (eVar2.e && !eVar2.r && i7 == eVar2.E) {
                    eVar2.y = true;
                    eVar2.requestRender();
                    break;
                }
                break;
        }
    }
}
