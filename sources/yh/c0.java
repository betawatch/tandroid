package yh;

import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e0 e0Var = this.b;
                e0Var.q.dismiss();
                e0Var.q = null;
                e0Var.r = 0;
                if (tL_error == null) {
                    d0 d0Var = e0Var.h;
                    if (d0Var != null) {
                        d0Var.close();
                        break;
                    }
                } else {
                    e0Var.c.f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                e0 e0Var2 = this.b;
                e0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = e0Var2.j;
                    if (arrayList == null) {
                        e0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    e0Var2.k = str;
                    e0Var2.l = peerLinkRequests.total_count;
                    e0Var2.n = str == null;
                    e0Var2.a();
                    d0 d0Var2 = e0Var2.h;
                    if (d0Var2 != null) {
                        d0Var2.b();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e0 e0Var3 = this.b;
                if (tL_error2 == null) {
                    e0Var3.getClass();
                    break;
                } else {
                    e0Var3.c.f0(tL_error2, false);
                    break;
                }
        }
    }
}
