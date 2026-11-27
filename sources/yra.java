// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yra implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ yra(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.Y1();
                break;
            case 1:
                uqc.L0(wuaVar.a, wuaVar.J0, wuaVar.getContext());
                break;
            default:
                wuaVar.Y1();
                break;
        }
    }
}
