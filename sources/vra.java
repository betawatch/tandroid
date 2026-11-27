// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
