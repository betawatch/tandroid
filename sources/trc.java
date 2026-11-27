// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class trc implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yrc b;

    public /* synthetic */ trc(yrc yrcVar, byte b) {
        this.a = b;
        this.b = yrcVar;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        yrc yrcVar = this.b;
        switch (b) {
            case 0:
                yrcVar.c.setScaleX(f);
                yrcVar.c.setScaleY(f);
                break;
            default:
                yrcVar.Q = f2;
                break;
        }
    }
}
