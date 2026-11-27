// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r0 extends d1a {
    public final /* synthetic */ s0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, q0 q0Var) {
        super(q0Var);
        this.e = s0Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.d2 = null;
    }
}
