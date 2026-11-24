// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
