package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.e6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                        h2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        h2Var.M = System.currentTimeMillis();
                        h2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new e6(13, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
