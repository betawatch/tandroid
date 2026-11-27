// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b6b b;

    public /* synthetic */ y5b(b6b b6bVar, byte b) {
        this.a = b;
        this.b = b6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b6b b6bVar = this.b;
        switch (b) {
            case 0:
                b6bVar.e();
                break;
            default:
                b6bVar.b();
                break;
        }
    }
}
