package vh;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ n(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.post(new n(oVar, 1));
                break;
            default:
                o oVar2 = this.b;
                oVar2.d = true;
                oVar2.b();
                break;
        }
    }
}
