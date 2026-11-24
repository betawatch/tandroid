// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pja implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rja b;

    public /* synthetic */ pja(rja rjaVar, byte b) {
        this.a = b;
        this.b = rjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rja rjaVar = this.b;
        switch (b) {
            case 0:
                rjaVar.W0 = false;
                if (!rjaVar.Z0 && rjaVar.X0) {
                    rjaVar.x(true);
                    break;
                }
                break;
            case 1:
                rjaVar.W0 = false;
                break;
            case 2:
                rjaVar.Z0 = false;
                if (!rjaVar.W0 && rjaVar.X0) {
                    rjaVar.x(true);
                    break;
                }
                break;
            default:
                rjaVar.Z0 = false;
                break;
        }
    }
}
