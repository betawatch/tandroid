// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ hw4 c;

    public /* synthetic */ wra(wua wuaVar, hw4 hw4Var, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = hw4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hw4 hw4Var = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (hw4Var != null) {
                    hw4Var.dismiss();
                    wuaVar.O0 = true;
                }
                wuaVar.dismiss();
                break;
            default:
                if (hw4Var != null) {
                    hw4Var.dismiss();
                    wuaVar.O0 = true;
                }
                wuaVar.dismiss();
                break;
        }
    }
}
