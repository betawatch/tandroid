// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class w09 extends kx9 {
    public final /* synthetic */ y09 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w09(y09 y09Var, v09 v09Var) {
        super(v09Var);
        this.e = y09Var;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
