package qh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7 b;

    public /* synthetic */ q7(x7 x7Var, int i10) {
        this.a = i10;
        this.b = x7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                x7 x7Var = this.b;
                d8 d8Var = x7Var.T;
                d8Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = d8Var.v;
                hashSet.clear();
                if (d8Var.H && d8Var.D) {
                    d8Var.D = false;
                }
                Utilities.Callback callback = d8Var.T;
                if (callback != null) {
                    callback.run(d8Var.c);
                }
                h8 h8Var = d8Var.U;
                if (h8Var != null) {
                    h8Var.run(new HashSet(hashSet));
                }
                x7Var.g(true);
                break;
            case 1:
                d8 d8Var2 = this.b.T;
                i10 = ((org.telegram.ui.ActionBar.h3) d8Var2).currentAccount;
                d8Var2.g1(new b8(5, i10, (ArrayList) obj), new oh.v3(d8Var2, 1), false);
                break;
            case 2:
                x7 x7Var2 = this.b;
                d8 d8Var3 = x7Var2.T;
                HashSet hashSet2 = d8Var3.v;
                hashSet2.add(Integer.valueOf(((oh.m6) obj).a));
                x7Var2.g(true);
                h8 h8Var2 = d8Var3.U;
                if (h8Var2 != null) {
                    h8Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                x7 x7Var3 = this.b;
                if (str != null) {
                    x7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                x7Var3.F = str;
                x7Var3.g(false);
                break;
        }
    }
}
