package ri;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ k c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ c(q qVar, k kVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = kVar;
        this.d = j10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b.f;
                k kVar = this.c;
                mVar.onOutputCompleted(kVar.a, kVar.b, this.d, this.e);
                break;
            case 1:
                m mVar2 = this.b.f;
                k kVar2 = this.c;
                mVar2.onBytesAvailable(kVar2.a, kVar2.b, this.d, this.e);
                break;
            default:
                m mVar3 = this.b.f;
                k kVar3 = this.c;
                mVar3.onOutputCompleted(kVar3.a, kVar3.b, this.d, this.e);
                break;
        }
    }
}
