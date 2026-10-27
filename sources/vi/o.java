package vi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ o(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                if (sVar.W != 0) {
                    sVar.V = true;
                    break;
                }
                break;
            default:
                this.b.c();
                break;
        }
    }
}
