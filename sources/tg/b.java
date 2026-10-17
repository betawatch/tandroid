package tg;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
