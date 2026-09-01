package qh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p8(ca caVar, boolean z4, int i10) {
        this.a = i10;
        this.b = caVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                ca caVar = this.b;
                if (!this.c) {
                    caVar.G0.b(false, false);
                    break;
                } else {
                    caVar.getClass();
                    break;
                }
            default:
                ca caVar2 = this.b;
                caVar2.O = null;
                caVar2.e = false;
                caVar2.q(this.c);
                break;
        }
    }
}
