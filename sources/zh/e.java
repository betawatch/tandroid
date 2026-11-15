package zh;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            case 1:
                l.k(this.b.q, true, true);
                break;
            default:
                this.b.e();
                break;
        }
    }
}
