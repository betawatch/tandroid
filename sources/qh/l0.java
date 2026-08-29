package qh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ l0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o0 o0Var = this.b;
                o0Var.q.dismiss();
                o0Var.q = null;
                o0Var.r = 0;
                if (tL_error == null) {
                    n0 n0Var = o0Var.h;
                    if (n0Var != null) {
                        n0Var.close();
                        break;
                    }
                } else {
                    o0Var.c.d0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                o0 o0Var2 = this.b;
                o0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = o0Var2.j;
                    if (arrayList == null) {
                        o0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    o0Var2.k = str;
                    o0Var2.l = peerLinkRequests.total_count;
                    o0Var2.n = str == null;
                    o0Var2.a();
                    n0 n0Var2 = o0Var2.h;
                    if (n0Var2 != null) {
                        n0Var2.k();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                o0 o0Var3 = this.b;
                if (tL_error2 == null) {
                    o0Var3.getClass();
                    break;
                } else {
                    o0Var3.c.d0(tL_error2, false);
                    break;
                }
        }
    }
}
