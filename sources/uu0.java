// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.d3((Runnable) obj, 80L);
                break;
            default:
                gt3Var.H(((Integer) obj).intValue());
                break;
        }
    }
}
