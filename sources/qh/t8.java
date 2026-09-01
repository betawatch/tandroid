package qh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ t8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                caVar.getClass();
                caVar.g(1.0f, true, new g8(caVar, 6));
                caVar.Y0.b(true, true);
                break;
            default:
                ca caVar2 = this.b;
                caVar2.f(false);
                caVar2.j2 = null;
                break;
        }
    }
}
