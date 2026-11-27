// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t11 extends vk4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ t11(byte b) {
        this.a = b;
    }

    @Override // vk4
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((z11) obj).inOutOffset;
            case 1:
                return ((hj6) obj).O;
            default:
                return ((hj6) obj).N;
        }
    }

    @Override // vk4
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                ((z11) obj).setInOutOffset(f);
                break;
            case 1:
                hj6 hj6Var = (hj6) obj;
                hj6Var.O = f;
                hj6Var.invalidate();
                break;
            default:
                hj6 hj6Var2 = (hj6) obj;
                hj6Var2.N = f;
                hj6Var2.invalidate();
                break;
        }
    }
}
