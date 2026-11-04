package wi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ o(s sVar, int i3) {
        this.a = i3;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    break;
                }
                break;
            default:
                this.b.c();
                break;
        }
    }
}
