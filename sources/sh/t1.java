package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import qh.l6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                        h2Var.M = System.currentTimeMillis();
                        h2Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        h2Var.M = System.currentTimeMillis();
                        h2Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new l6(12, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
