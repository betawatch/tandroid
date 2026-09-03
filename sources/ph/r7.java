package ph;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ r7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                y7 y7Var = this.b;
                e8 e8Var = y7Var.T;
                e8Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = e8Var.v;
                hashSet.clear();
                if (e8Var.H && e8Var.D) {
                    e8Var.D = false;
                }
                Utilities.Callback callback = e8Var.T;
                if (callback != null) {
                    callback.run(e8Var.c);
                }
                h8 h8Var = e8Var.U;
                if (h8Var != null) {
                    h8Var.run(new HashSet(hashSet));
                }
                y7Var.g(true);
                break;
            case 1:
                e8 e8Var2 = this.b.T;
                i10 = ((org.telegram.ui.ActionBar.g3) e8Var2).currentAccount;
                e8Var2.g1(new c8(5, i10, (ArrayList) obj), new nh.t3(e8Var2, 1), false);
                break;
            case 2:
                y7 y7Var2 = this.b;
                e8 e8Var3 = y7Var2.T;
                HashSet hashSet2 = e8Var3.v;
                hashSet2.add(Integer.valueOf(((nh.m6) obj).a));
                y7Var2.g(true);
                h8 h8Var2 = e8Var3.U;
                if (h8Var2 != null) {
                    h8Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                y7 y7Var3 = this.b;
                if (str != null) {
                    y7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y7Var3.F = str;
                y7Var3.g(false);
                break;
        }
    }
}
