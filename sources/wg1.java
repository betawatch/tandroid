// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wg1 extends kx9 {
    public final /* synthetic */ nh1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(nh1 nh1Var, vg1 vg1Var) {
        super(vg1Var);
        this.e = nh1Var;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R = null;
    }
}
