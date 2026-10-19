package ri;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ j c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ c(p pVar, j jVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = jVar;
        this.d = j10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b.f;
                j jVar = this.c;
                lVar.onOutputCompleted(jVar.a, jVar.b, this.d, this.e);
                break;
            case 1:
                l lVar2 = this.b.f;
                j jVar2 = this.c;
                lVar2.onBytesAvailable(jVar2.a, jVar2.b, this.d, this.e);
                break;
            default:
                l lVar3 = this.b.f;
                j jVar3 = this.c;
                lVar3.onOutputCompleted(jVar3.a, jVar3.b, this.d, this.e);
                break;
        }
    }
}
