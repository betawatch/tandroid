// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y29 extends mz9 {
    public final /* synthetic */ a39 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y29(a39 a39Var, x29 x29Var) {
        super(x29Var);
        this.e = a39Var;
    }

    @Override // mz9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
