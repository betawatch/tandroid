package vh;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ m(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.post(new m(nVar, 1));
                break;
            default:
                n nVar2 = this.b;
                nVar2.d = true;
                nVar2.b();
                break;
        }
    }
}
