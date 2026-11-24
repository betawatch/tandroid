// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u65 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v65 b;

    public /* synthetic */ u65(v65 v65Var, byte b) {
        this.a = b;
        this.b = v65Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v65 v65Var = this.b;
        switch (b) {
            case 0:
                sb sbVar = v65Var.b;
                if (sbVar != null) {
                    sbVar.setVisibility(0);
                }
                gl.d3(new u65(v65Var, (byte) 2), 16L);
                break;
            case 1:
                sb sbVar2 = v65Var.b;
                if (sbVar2 != null) {
                    sbVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                v65Var.b();
                break;
        }
    }
}
