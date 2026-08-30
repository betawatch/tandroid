package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ u1(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                i2 i2Var = this.b.x;
                if (i2Var != null) {
                    if (!bool.booleanValue()) {
                        i2Var.M = System.currentTimeMillis();
                        i2Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        i2Var.M = System.currentTimeMillis();
                        i2Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new f6(11, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
