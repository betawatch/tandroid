package ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ i c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ c(o oVar, i iVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b.g;
                i iVar = this.c;
                kVar.onOutputCompleted(iVar.a, iVar.b, this.d, this.e);
                break;
            case 1:
                k kVar2 = this.b.g;
                i iVar2 = this.c;
                kVar2.onBytesAvailable(iVar2.a, iVar2.b, this.d, this.e);
                break;
            default:
                k kVar3 = this.b.g;
                i iVar3 = this.c;
                kVar3.onOutputCompleted(iVar3.a, iVar3.b, this.d, this.e);
                break;
        }
    }
}
