// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class up2 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xp2 b;

    public /* synthetic */ up2(xp2 xp2Var, byte b) {
        this.a = b;
        this.b = xp2Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        xp2 xp2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                xp2Var.q.dismiss();
                xp2Var.q = null;
                xp2Var.r = 0;
                if (tL_error == null) {
                    wp2 wp2Var = xp2Var.h;
                    if (wp2Var != null) {
                        wp2Var.close();
                        break;
                    }
                } else {
                    xp2Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                xp2Var.m = false;
                if (peerLinkRequests != null) {
                    xp2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    xp2Var.k = str;
                    xp2Var.l = peerLinkRequests.total_count;
                    xp2Var.n = str == null;
                    xp2Var.a();
                    wp2 wp2Var2 = xp2Var.h;
                    if (wp2Var2 != null) {
                        wp2Var2.U();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    xp2Var.c.g0(tL_error2, false);
                    break;
                }
                break;
        }
    }
}
