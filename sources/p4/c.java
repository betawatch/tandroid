package p4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.p b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.a = i11;
        this.b = pVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w wVar = ((e) ((li.k) this.b.f).d).d;
                if (wVar != null) {
                    wVar.j(this.c);
                    break;
                }
                break;
            default:
                w wVar2 = ((e) ((li.k) this.b.f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
