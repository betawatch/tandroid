package tg;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(f fVar, int i10, int i11) {
        this.a = i11;
        this.b = fVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                fVar.postOnAnimation(new b(fVar, this.c, 1));
                break;
            default:
                f fVar2 = this.b;
                int i10 = this.c;
                if (fVar2.e && !fVar2.r && i10 == fVar2.E) {
                    fVar2.x = true;
                    fVar2.requestRender();
                    break;
                }
                break;
        }
    }
}
