// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t28 extends mz9 {
    public final /* synthetic */ w28 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t28(w28 w28Var, s28 s28Var) {
        super(s28Var);
        this.e = w28Var;
    }

    @Override // mz9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
