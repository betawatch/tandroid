// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
