package qh;

import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ r20 c;
    public final /* synthetic */ k2 d;

    public /* synthetic */ w(String str, r20 r20Var, k2 k2Var) {
        this.b = str;
        this.c = r20Var;
        this.d = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k2 k2Var = this.d;
        r20 r20Var = this.c;
        String str = this.b;
        switch (i10) {
            case 0:
                y.p(k2Var, 0, new w(str, r20Var, k2Var));
                break;
            default:
                if (str == null) {
                    cc.a0(k2Var).N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                    break;
                } else {
                    r20Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ w(k2 k2Var, String str, r20 r20Var) {
        this.d = k2Var;
        this.b = str;
        this.c = r20Var;
    }
}
