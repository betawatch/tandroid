package tg;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
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
