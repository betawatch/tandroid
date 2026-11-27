// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class spa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tpa b;
    public final /* synthetic */ int c;

    public /* synthetic */ spa(tpa tpaVar, int i, byte b) {
        this.a = b;
        this.b = tpaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        tpa tpaVar = this.b;
        switch (b) {
            case 0:
                tpaVar.post(new spa(tpaVar, i, b2));
                break;
            default:
                if (i == tpaVar.h) {
                    tpaVar.f = false;
                    tpaVar.d = true;
                    tpaVar.b();
                    break;
                }
                break;
        }
    }
}
