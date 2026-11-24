// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class th3 extends kx9 {
    public final /* synthetic */ cj3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th3(cj3 cj3Var, sh3 sh3Var) {
        super(sh3Var);
        this.e = cj3Var;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.N0 = null;
    }
}
