// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;
    public final /* synthetic */ lk0 c;

    public /* synthetic */ sd9(ye9 ye9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                ye9Var.Z2(lk0Var);
                break;
            case 1:
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                ye9Var.Z2(lk0Var);
                break;
            case 3:
                ye9Var.Y2(lk0Var, true);
                break;
            case 4:
                ye9Var.Y2(lk0Var, false);
                break;
            case 5:
                ye9Var.Y2(lk0Var, true);
                break;
            case 6:
                ye9Var.Z2(lk0Var);
                break;
            case 7:
                ye9Var.X2(lk0Var, false);
                break;
            case 8:
                ye9Var.X2(lk0Var, true);
                break;
            case 9:
                ye9Var.Z2(lk0Var);
                break;
            case 10:
                ye9Var.X2(lk0Var, true);
                break;
            case 11:
                ye9Var.Z2(lk0Var);
                break;
            case 12:
                ye9Var.Y2(lk0Var, false);
                break;
            case 13:
                ye9Var.X2(lk0Var, true);
                break;
            case 14:
                KeyEvent.Callback C12 = ye9Var.C1(lk0Var);
                if (C12 instanceof eib) {
                    ye9Var.v3.a0(0, 0, (eib) C12);
                    break;
                }
                break;
            case 15:
                KeyEvent.Callback C13 = ye9Var.C1(lk0Var);
                if (C13 instanceof eib) {
                    ye9Var.v3.a0(0, C13 instanceof wi9 ? ((wi9) C13).getEditText().length() : 0, (eib) C13);
                    break;
                }
                break;
            case 16:
                ye9Var.b3(lk0Var);
                break;
            case 17:
                View C14 = ye9Var.C1(lk0Var);
                if (C14 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) C14;
                    wi9Var2.A();
                    wi9Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = ye9Var.C1(lk0Var);
                if (!(C15 instanceof wi9)) {
                    if (C15 instanceof ii9) {
                        ii9 ii9Var = (ii9) C15;
                        if (ii9Var.getGrid().getChildCount() > 0) {
                            View childAt = ii9Var.getGrid().getChildAt(0);
                            if (childAt instanceof li9) {
                                ((li9) childAt).a.O();
                                break;
                            }
                        }
                    }
                } else {
                    wi9 wi9Var3 = (wi9) C15;
                    wi9Var3.A();
                    wi9Var3.getEditText().setSelection(wi9Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                ye9Var.a3(lk0Var);
                break;
            case 20:
                View C16 = ye9Var.C1(lk0Var);
                if (C16 instanceof ac9) {
                    ((ac9) C16).d.O();
                    break;
                }
                break;
            case 21:
                ye9Var.a3(lk0Var);
                break;
            case 22:
                ye9Var.a3(lk0Var);
                break;
            case 23:
                View C17 = ye9Var.C1(lk0Var);
                if (C17 instanceof wi9) {
                    wi9 wi9Var4 = (wi9) C17;
                    wi9Var4.A();
                    wi9Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                ye9Var.Z2(lk0Var);
                break;
            case 25:
                ye9Var.d5(lk0Var, "");
                break;
            case 26:
                ye9Var.Z2(lk0Var);
                break;
            case 27:
                ye9Var.Z2(lk0Var);
                break;
            case 28:
                ye9Var.Z2(lk0Var);
                break;
            default:
                ye9Var.Z2(lk0Var);
                break;
        }
    }
}
