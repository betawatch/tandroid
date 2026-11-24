// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ vf9(ch9 ch9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                ch9Var.Z2(ll0Var);
                break;
            case 1:
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof xk9) {
                    xk9 xk9Var = (xk9) C1;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                ch9Var.Z2(ll0Var);
                break;
            case 3:
                ch9Var.Y2(ll0Var, true);
                break;
            case 4:
                ch9Var.Y2(ll0Var, false);
                break;
            case 5:
                ch9Var.Y2(ll0Var, true);
                break;
            case 6:
                ch9Var.Z2(ll0Var);
                break;
            case 7:
                ch9Var.X2(ll0Var, false);
                break;
            case 8:
                ch9Var.X2(ll0Var, true);
                break;
            case 9:
                ch9Var.Z2(ll0Var);
                break;
            case 10:
                ch9Var.X2(ll0Var, true);
                break;
            case 11:
                ch9Var.Z2(ll0Var);
                break;
            case 12:
                ch9Var.Y2(ll0Var, false);
                break;
            case 13:
                ch9Var.X2(ll0Var, true);
                break;
            case 14:
                KeyEvent.Callback C12 = ch9Var.C1(ll0Var);
                if (C12 instanceof fkb) {
                    ch9Var.v3.a0(0, 0, (fkb) C12);
                    break;
                }
                break;
            case 15:
                KeyEvent.Callback C13 = ch9Var.C1(ll0Var);
                if (C13 instanceof fkb) {
                    ch9Var.v3.a0(0, C13 instanceof xk9 ? ((xk9) C13).getEditText().length() : 0, (fkb) C13);
                    break;
                }
                break;
            case 16:
                ch9Var.b3(ll0Var);
                break;
            case 17:
                View C14 = ch9Var.C1(ll0Var);
                if (C14 instanceof xk9) {
                    xk9 xk9Var2 = (xk9) C14;
                    xk9Var2.A();
                    xk9Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = ch9Var.C1(ll0Var);
                if (!(C15 instanceof xk9)) {
                    if (C15 instanceof kk9) {
                        kk9 kk9Var = (kk9) C15;
                        if (kk9Var.getGrid().getChildCount() > 0) {
                            View childAt = kk9Var.getGrid().getChildAt(0);
                            if (childAt instanceof nk9) {
                                ((nk9) childAt).a.O();
                                break;
                            }
                        }
                    }
                } else {
                    xk9 xk9Var3 = (xk9) C15;
                    xk9Var3.A();
                    xk9Var3.getEditText().setSelection(xk9Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                ch9Var.a3(ll0Var);
                break;
            case 20:
                View C16 = ch9Var.C1(ll0Var);
                if (C16 instanceof be9) {
                    ((be9) C16).d.O();
                    break;
                }
                break;
            case 21:
                ch9Var.a3(ll0Var);
                break;
            case 22:
                ch9Var.a3(ll0Var);
                break;
            case 23:
                View C17 = ch9Var.C1(ll0Var);
                if (C17 instanceof xk9) {
                    xk9 xk9Var4 = (xk9) C17;
                    xk9Var4.A();
                    xk9Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                ch9Var.Z2(ll0Var);
                break;
            case 25:
                ch9Var.d5(ll0Var, "");
                break;
            case 26:
                ch9Var.Z2(ll0Var);
                break;
            case 27:
                ch9Var.Z2(ll0Var);
                break;
            case 28:
                ch9Var.Z2(ll0Var);
                break;
            default:
                ch9Var.Z2(ll0Var);
                break;
        }
    }
}
