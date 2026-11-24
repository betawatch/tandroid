// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vwb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxb b;

    public /* synthetic */ vwb(kxb kxbVar, byte b) {
        this.a = b;
        this.b = kxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kxb kxbVar = this.b;
        switch (b) {
            case 0:
                if (kxbVar.i()) {
                    kxbVar.j();
                    break;
                }
                break;
            default:
                axb axbVar = kxbVar.K;
                axbVar.z1(true);
                ywb ywbVar = kxbVar.y;
                ywbVar.z1(true);
                kxbVar.N.a(true, true);
                gl.W3(ywbVar);
                gl.W3(axbVar);
                break;
        }
    }
}
