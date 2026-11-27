// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
