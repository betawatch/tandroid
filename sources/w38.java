// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w38 extends d1a {
    public final /* synthetic */ a48 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w38(a48 a48Var, v38 v38Var) {
        super(v38Var);
        this.e = a48Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
