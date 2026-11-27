// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
