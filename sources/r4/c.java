package r4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.q b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.q qVar, int i3, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w wVar = ((e) ((p7.d) this.b.f).c).d;
                if (wVar != null) {
                    wVar.j(this.c);
                    break;
                }
                break;
            default:
                w wVar2 = ((e) ((p7.d) this.b.f).c).d;
                if (wVar2 != null) {
                    wVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
