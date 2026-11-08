package xh;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public /* synthetic */ k(l lVar, int i7, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.post(new k(lVar, this.c, 1));
                break;
            default:
                int i7 = this.c;
                l lVar2 = this.b;
                if (i7 == lVar2.h) {
                    lVar2.f = false;
                    lVar2.d = true;
                    lVar2.b();
                    break;
                }
                break;
        }
    }
}
