package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ t1(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                h2 h2Var = this.b.x;
                if (h2Var != null) {
                    if (!bool.booleanValue()) {
                        h2Var.L = System.currentTimeMillis();
                        h2Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        h2Var.L = System.currentTimeMillis();
                        h2Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(9, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
