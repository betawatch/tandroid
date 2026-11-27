// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
