// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q08 extends kx9 {
    public final /* synthetic */ t08 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q08(t08 t08Var, p08 p08Var) {
        super(p08Var);
        this.e = t08Var;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
