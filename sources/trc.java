// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
