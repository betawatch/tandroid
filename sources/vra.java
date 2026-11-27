// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vra implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ hw4 c;

    public /* synthetic */ vra(wua wuaVar, hw4 hw4Var, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = hw4Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        hw4 hw4Var = this.c;
        wua wuaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                wuaVar.f2.setLoading(bool.booleanValue());
                if (hw4Var != null) {
                    hw4Var.G0(bool.booleanValue());
                    break;
                }
                break;
            default:
                wuaVar.f2.setLoading(bool.booleanValue());
                if (hw4Var != null) {
                    hw4Var.G0(bool.booleanValue());
                    break;
                }
                break;
        }
    }
}
