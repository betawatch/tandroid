// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t7 extends hn {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ x7 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(x7 x7Var, byte b) {
        super(false, true, true);
        this.e0 = b;
        this.f0 = x7Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        x7 x7Var = this.f0;
        switch (b) {
            case 0:
                x7Var.invalidate();
                break;
            default:
                x7Var.invalidate();
                break;
        }
    }
}
