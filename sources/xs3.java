// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xs3 extends gn {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ gt3 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs3(gt3 gt3Var, byte b) {
        super(false, false, false);
        this.e0 = b;
        this.f0 = gt3Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        gt3 gt3Var = this.f0;
        switch (b) {
            case 0:
                gt3Var.invalidate();
                break;
            default:
                gt3Var.invalidate();
                break;
        }
    }
}
