package wi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ q(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    break;
                }
                break;
            default:
                this.b.c();
                break;
        }
    }
}
