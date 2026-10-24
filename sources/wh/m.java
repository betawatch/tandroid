package wh;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ int c;

    public /* synthetic */ m(n nVar, int i10, int i11) {
        this.a = i11;
        this.b = nVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.post(new m(nVar, this.c, 1));
                break;
            default:
                int i10 = this.c;
                n nVar2 = this.b;
                if (i10 == nVar2.h) {
                    nVar2.f = false;
                    nVar2.d = true;
                    nVar2.b();
                    break;
                }
                break;
        }
    }
}
