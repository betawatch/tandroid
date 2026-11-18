package qi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
