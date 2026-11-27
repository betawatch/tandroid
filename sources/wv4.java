// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wv4 implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv4 b;

    public /* synthetic */ wv4(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.b(f / 1000.0f);
                break;
            default:
                zv4Var.b(Math.max(0.0f, f / 1000.0f));
                break;
        }
    }
}
