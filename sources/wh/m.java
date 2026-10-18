package wh;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
