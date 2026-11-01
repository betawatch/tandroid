package yh;

import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ b0(d0 d0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d0 d0Var = this.b;
                d0Var.q.dismiss();
                d0Var.q = null;
                d0Var.r = 0;
                if (tL_error == null) {
                    c0 c0Var = d0Var.h;
                    if (c0Var != null) {
                        c0Var.close();
                        break;
                    }
                } else {
                    d0Var.c.f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                d0 d0Var2 = this.b;
                d0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = d0Var2.j;
                    if (arrayList == null) {
                        d0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    d0Var2.k = str;
                    d0Var2.l = peerLinkRequests.total_count;
                    d0Var2.n = str == null;
                    d0Var2.a();
                    c0 c0Var2 = d0Var2.h;
                    if (c0Var2 != null) {
                        c0Var2.b();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0 d0Var3 = this.b;
                if (tL_error2 == null) {
                    d0Var3.getClass();
                    break;
                } else {
                    d0Var3.c.f0(tL_error2, false);
                    break;
                }
        }
    }
}
