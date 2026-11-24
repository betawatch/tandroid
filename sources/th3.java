// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
