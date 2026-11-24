// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zha b;

    public /* synthetic */ uw0(zha zhaVar, byte b) {
        this.a = b;
        this.b = zhaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zha zhaVar = this.b;
        switch (b) {
            case 0:
                zhaVar.a(true);
                break;
            case 1:
                zhaVar.a(true);
                break;
            case 2:
                if (!zhaVar.I && zhaVar.U) {
                    zhaVar.c();
                    break;
                }
                break;
            default:
                zhaVar.a(true);
                break;
        }
    }
}
