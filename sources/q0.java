// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q0 extends mz9 {
    public final /* synthetic */ r0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, p0 p0Var) {
        super(p0Var);
        this.e = r0Var;
    }

    @Override // mz9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.d2 = null;
    }
}
