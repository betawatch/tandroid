// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s21 extends vk4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ s21(byte b) {
        this.a = b;
    }

    @Override // vk4
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((y21) obj).inOutOffset;
            case 1:
                return ((ej6) obj).O;
            default:
                return ((ej6) obj).N;
        }
    }

    @Override // vk4
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                ((y21) obj).setInOutOffset(f);
                break;
            case 1:
                ej6 ej6Var = (ej6) obj;
                ej6Var.O = f;
                ej6Var.invalidate();
                break;
            default:
                ej6 ej6Var2 = (ej6) obj;
                ej6Var2.N = f;
                ej6Var2.invalidate();
                break;
        }
    }
}
