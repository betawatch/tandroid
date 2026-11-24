// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
