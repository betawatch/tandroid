package sg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ s(w wVar, int i7) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.a.g(hVar);
                    wVar.A = null;
                    break;
                }
                break;
            default:
                this.b.a(null, true, null);
                break;
        }
    }
}
