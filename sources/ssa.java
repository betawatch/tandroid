// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ ssa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.b2();
                break;
            case 1:
                wuaVar.onBackPressed();
                break;
            default:
                new xd5(wuaVar.getContext()).show();
                break;
        }
    }
}
