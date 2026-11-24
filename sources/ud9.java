// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;
    public final /* synthetic */ lk0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ud9(ye9 ye9Var, lk0 lk0Var, int i, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        byte b = this.a;
        int i = this.d;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                C1 = lk0Var != null ? ye9Var.C1(lk0Var) : null;
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(Math.min(i, wi9Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                C1 = lk0Var != null ? ye9Var.C1(lk0Var) : null;
                if (C1 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) C1;
                    wi9Var2.A();
                    wi9Var2.getEditText().setSelection(Math.min(i, wi9Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C12 = ye9Var.C1(lk0Var);
                if (C12 instanceof wi9) {
                    wi9 wi9Var3 = (wi9) C12;
                    wi9Var3.A();
                    wi9Var3.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C13 = ye9Var.C1(lk0Var);
                if (C13 instanceof wi9) {
                    wi9 wi9Var4 = (wi9) C13;
                    wi9Var4.A();
                    wi9Var4.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C14 = ye9Var.C1(lk0Var);
                if (C14 instanceof wi9) {
                    wi9 wi9Var5 = (wi9) C14;
                    wi9Var5.A();
                    wi9Var5.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C15 = ye9Var.C1(lk0Var);
                if (C15 instanceof wi9) {
                    wi9 wi9Var6 = (wi9) C15;
                    wi9Var6.A();
                    wi9Var6.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
