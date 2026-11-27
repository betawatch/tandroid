// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
