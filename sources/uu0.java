// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gt3 b;

    public /* synthetic */ uu0(gt3 gt3Var, byte b) {
        this.a = b;
        this.b = gt3Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        gt3 gt3Var = this.b;
        switch (b) {
            case 0:
                gl.t1(gt3Var);
                gl.e3((Runnable) obj, 80L);
                break;
            default:
                gt3Var.H(((Integer) obj).intValue());
                break;
        }
    }
}
