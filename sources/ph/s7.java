package ph;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ s7(z7 z7Var, int i10) {
        this.a = i10;
        this.b = z7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                z7 z7Var = this.b;
                f8 f8Var = z7Var.T;
                f8Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = f8Var.v;
                hashSet.clear();
                if (f8Var.H && f8Var.D) {
                    f8Var.D = false;
                }
                Utilities.Callback callback = f8Var.T;
                if (callback != null) {
                    callback.run(f8Var.c);
                }
                i8 i8Var = f8Var.U;
                if (i8Var != null) {
                    i8Var.run(new HashSet(hashSet));
                }
                z7Var.g(true);
                break;
            case 1:
                f8 f8Var2 = this.b.T;
                i10 = ((org.telegram.ui.ActionBar.g3) f8Var2).currentAccount;
                f8Var2.g1(new d8(5, i10, (ArrayList) obj), new nh.t3(f8Var2, 1), false);
                break;
            case 2:
                z7 z7Var2 = this.b;
                f8 f8Var3 = z7Var2.T;
                HashSet hashSet2 = f8Var3.v;
                hashSet2.add(Integer.valueOf(((nh.m6) obj).a));
                z7Var2.g(true);
                i8 i8Var2 = f8Var3.U;
                if (i8Var2 != null) {
                    i8Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                z7 z7Var3 = this.b;
                if (str != null) {
                    z7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                z7Var3.F = str;
                z7Var3.g(false);
                break;
        }
    }
}
