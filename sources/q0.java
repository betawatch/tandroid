// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q0 extends kx9 {
    public final /* synthetic */ r0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, p0 p0Var) {
        super(p0Var);
        this.e = r0Var;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.d2 = null;
    }
}
