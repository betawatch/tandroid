package tg;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
