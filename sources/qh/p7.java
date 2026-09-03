package qh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ p7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                c8 c8Var = w7Var.T;
                c8Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = c8Var.v;
                hashSet.clear();
                if (c8Var.H && c8Var.D) {
                    c8Var.D = false;
                }
                Utilities.Callback callback = c8Var.T;
                if (callback != null) {
                    callback.run(c8Var.c);
                }
                g8 g8Var = c8Var.U;
                if (g8Var != null) {
                    g8Var.run(new HashSet(hashSet));
                }
                w7Var.g(true);
                break;
            case 1:
                c8 c8Var2 = this.b.T;
                i10 = ((org.telegram.ui.ActionBar.h3) c8Var2).currentAccount;
                c8Var2.g1(new a8(5, i10, (ArrayList) obj), new oh.v3(c8Var2, 1), false);
                break;
            case 2:
                w7 w7Var2 = this.b;
                c8 c8Var3 = w7Var2.T;
                HashSet hashSet2 = c8Var3.v;
                hashSet2.add(Integer.valueOf(((oh.m6) obj).a));
                w7Var2.g(true);
                g8 g8Var2 = c8Var3.U;
                if (g8Var2 != null) {
                    g8Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                w7 w7Var3 = this.b;
                if (str != null) {
                    w7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                w7Var3.F = str;
                w7Var3.g(false);
                break;
        }
    }
}
