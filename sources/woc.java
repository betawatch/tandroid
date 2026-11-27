// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class woc extends vx4 {
    public final /* synthetic */ dl1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woc(dl1 dl1Var, dl1 dl1Var2) {
        super(dl1Var, 1.0f);
        this.E = dl1Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
