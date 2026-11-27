// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tp1 extends n8 {
    public final /* synthetic */ i49 o;
    public final /* synthetic */ zu1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(zu1 zu1Var, hf1 hf1Var, i49 i49Var) {
        super(hf1Var, -2, -2);
        this.p = zu1Var;
        this.o = i49Var;
    }

    @Override // n8
    public final void d(boolean z) {
        super.d(z);
        i49 i49Var = this.o;
        if (i49Var != null) {
            i49Var.a(z);
        }
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.p;
        if (zu1Var.g9 == this) {
            v21 v21Var = v21.x;
            v21 v21Var2 = zu1Var.C1;
            if (v21Var == v21Var2 && v21Var2 != null) {
                v21Var2.b();
                zu1Var.C1 = null;
            }
            zu1Var.g9 = null;
            zu1Var.l9 = null;
            zu1Var.k9 = null;
            zu1Var.C0.R = true;
            if (zu1Var.h9) {
                zu1Var.y6(false, true, 0.0f);
            } else {
                zu1Var.h9 = true;
            }
            nr1 nr1Var = zu1Var.a0;
            if (nr1Var == null || nr1Var.getEditField() == null) {
                return;
            }
            zu1Var.a0.getEditField().setAllowDrawCursor(true);
        }
    }
}
