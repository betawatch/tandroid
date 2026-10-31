package qh;

import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ q20 c;
    public final /* synthetic */ k2 d;

    public /* synthetic */ w(String str, q20 q20Var, k2 k2Var) {
        this.b = str;
        this.c = q20Var;
        this.d = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k2 k2Var = this.d;
        q20 q20Var = this.c;
        String str = this.b;
        switch (i10) {
            case 0:
                y.p(k2Var, 0, new w(str, q20Var, k2Var));
                break;
            default:
                if (str == null) {
                    cc.a0(k2Var).N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                    break;
                } else {
                    q20Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ w(k2 k2Var, String str, q20 q20Var) {
        this.d = k2Var;
        this.b = str;
        this.c = q20Var;
    }
}
