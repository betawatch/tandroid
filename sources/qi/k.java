package qi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ k(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a aVar = this.b.w;
                if (aVar != null) {
                    aVar.close();
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
