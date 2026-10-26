package ug;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ l(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.a0 = null;
                    mVar.d.i();
                    break;
                }
                break;
            default:
                m mVar2 = this.b;
                if (mVar2.d.J == mVar2 && !mVar2.b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.a0;
                    mVar2.d.a0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
