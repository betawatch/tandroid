// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ti0 implements cr7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ ti0(bj0 bj0Var, byte b) {
        this.a = b;
        this.b = bj0Var;
    }

    @Override // cr7
    public final void S0(Object obj) {
        byte b = this.a;
        String str = null;
        bj0 bj0Var = this.b;
        switch (b) {
            case 0:
                gj0 gj0Var = (gj0) obj;
                if (gj0Var != null) {
                    bj0Var.W(gj0Var);
                    mj0 mj0Var = bj0Var.m0;
                    qj7 qj7Var = mj0Var.p;
                    if (qj7Var == null) {
                        qj7Var = new qj7();
                        mj0Var.p = qj7Var;
                    }
                    mj0.f(qj7Var, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (bj0Var.R()) {
                        bj0Var.T();
                    } else {
                        mj0 mj0Var2 = bj0Var.m0;
                        String str2 = mj0Var2.i;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            ij0 ij0Var = mj0Var2.d;
                            if (ij0Var != null && (str = ij0Var.c) == null) {
                                str = "";
                            }
                        }
                        if (str == null) {
                            str = bj0Var.q(R.string.default_error_msg);
                        }
                        bj0Var.U(13, str);
                        bj0Var.O(2);
                    }
                    bj0Var.m0.e(false);
                    break;
                }
                break;
        }
    }
}
