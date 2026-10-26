package ug;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
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
