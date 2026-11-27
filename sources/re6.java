// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class re6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg6 b;

    public /* synthetic */ re6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                cg6Var.N.m();
                break;
            case 1:
                cg6Var.O = null;
                cg6Var.P = null;
                cg6Var.o(true);
                cg6Var.e.m(null, null, cg6Var.f, null);
                di1 di1Var = cg6Var.n;
                b29 b29Var = cg6Var.K;
                di1Var.setAnimation(b29Var);
                b29Var.H(0);
                cg6Var.M = true;
                break;
            case 2:
                cg6Var.M = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = cg6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    hl.E3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
