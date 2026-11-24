// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv5 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q88 b;

    public /* synthetic */ vv5(q88 q88Var, byte b) {
        this.a = b;
        this.b = q88Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        q88 q88Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                q88Var.m0(num);
                break;
            default:
                q88Var.l0(num);
                break;
        }
    }
}
