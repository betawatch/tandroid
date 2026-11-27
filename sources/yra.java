// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
