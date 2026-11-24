// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v91 implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ da1 b;

    public /* synthetic */ v91(da1 da1Var, byte b) {
        this.a = b;
        this.b = da1Var;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        da1 da1Var = this.b;
        switch (b) {
            case 0:
                da1Var.F = f / 500.0f;
                da1Var.fragmentView.invalidate();
                break;
            default:
                da1Var.c0 = da1Var.O ? f / 500.0f : 1.0f - (f / 500.0f);
                da1Var.fragmentView.invalidate();
                break;
        }
    }
}
