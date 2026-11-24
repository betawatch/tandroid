// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ch9 b;
    public final /* synthetic */ ll0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ xf9(ch9 ch9Var, ll0 ll0Var, int i, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = ll0Var;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        byte b = this.a;
        int i = this.d;
        ll0 ll0Var = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                C1 = ll0Var != null ? ch9Var.C1(ll0Var) : null;
                if (C1 instanceof xk9) {
                    xk9 xk9Var = (xk9) C1;
                    xk9Var.A();
                    xk9Var.getEditText().setSelection(Math.min(i, xk9Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                C1 = ll0Var != null ? ch9Var.C1(ll0Var) : null;
                if (C1 instanceof xk9) {
                    xk9 xk9Var2 = (xk9) C1;
                    xk9Var2.A();
                    xk9Var2.getEditText().setSelection(Math.min(i, xk9Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View C12 = ch9Var.C1(ll0Var);
                if (C12 instanceof xk9) {
                    xk9 xk9Var3 = (xk9) C12;
                    xk9Var3.A();
                    xk9Var3.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View C13 = ch9Var.C1(ll0Var);
                if (C13 instanceof xk9) {
                    xk9 xk9Var4 = (xk9) C13;
                    xk9Var4.A();
                    xk9Var4.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View C14 = ch9Var.C1(ll0Var);
                if (C14 instanceof xk9) {
                    xk9 xk9Var5 = (xk9) C14;
                    xk9Var5.A();
                    xk9Var5.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View C15 = ch9Var.C1(ll0Var);
                if (C15 instanceof xk9) {
                    xk9 xk9Var6 = (xk9) C15;
                    xk9Var6.A();
                    xk9Var6.getEditText().setSelection(Math.max(0, Math.min(i, xk9Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
