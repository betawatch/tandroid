// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y5b b;

    public /* synthetic */ p28(y5b y5bVar, byte b) {
        this.a = b;
        this.b = y5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y5b y5bVar = this.b;
        switch (b) {
            case 0:
                y5bVar.dismiss();
                break;
            case 1:
                y5bVar.dismiss();
                break;
            default:
                y5bVar.onBackPressed();
                break;
        }
    }
}
