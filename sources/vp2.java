// default package

import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vp2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vp2(jm7 jm7Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        boolean z = this.b;
        long j = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                xp2 xp2Var = (xp2) obj;
                xp2Var.i = null;
                xp2Var.g.l(j);
                for (int size = xp2Var.j.size() - 1; size >= 0; size--) {
                    if (pg3.n(((TL_communities.CommunityPeerRequest) xp2Var.j.get(size)).peer) == j) {
                        xp2Var.j.remove(size);
                    }
                }
                xp2Var.a();
                wp2 wp2Var = xp2Var.h;
                if (wp2Var != null) {
                    wp2Var.U();
                }
                oc7 r1 = oc7.r1(xp2Var.d);
                long j2 = xp2Var.e;
                up2 up2Var = new up2(xp2Var, b2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = r1.g1(j2);
                tL_communities_togglePeerLinkRequestApproval.peer = r1.i1(j);
                tL_communities_togglePeerLinkRequestApproval.reject = !z;
                r1.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new kc(b3), new fv4((Object) r1, j2, (Object) up2Var, (byte) 3));
                break;
            case 1:
                HashSet hashSet = ((lo7) obj).y;
                if (z) {
                    hashSet.add(Long.valueOf(j));
                    break;
                } else {
                    hashSet.remove(Long.valueOf(j));
                    break;
                }
            case 2:
                eya eyaVar = (eya) obj;
                eyaVar.z1 = j;
                eyaVar.y1 = j;
                if (z) {
                    i96 i96Var = eyaVar.A1;
                    i96Var.c = j;
                    eyaVar.B1.set(i96Var);
                }
                eyaVar.H0();
                eyaVar.D1.a(true, true);
                dya dyaVar = eyaVar.x1;
                if (dyaVar != null) {
                    dyaVar.setMyPrivacy(eyaVar.y1);
                    break;
                }
                break;
            case 3:
                v7b v7bVar = (v7b) obj;
                a8b a8bVar = v7bVar.a0;
                if (z) {
                    int i = a8b.X1;
                    oc7.r1(a8bVar.a).Y2(Long.valueOf(j), new rz3(v7bVar, j, b2), nm7.d3);
                    break;
                } else {
                    int i2 = a8b.X1;
                    oc7.r1(a8bVar.a).a3(0, j, true);
                    break;
                }
            default:
                qwb qwbVar = (qwb) obj;
                qwbVar.getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
                qwbVar.a.l(j);
                qwbVar.b.l(j);
                qwbVar.d.delete(j);
                qwbVar.s.l(j);
                TLRPC.Chat L0 = qwbVar.getMessagesController().L0(Long.valueOf(j));
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    qwbVar.n(0, j, z);
                }
                qwbVar.y(j, true);
                break;
        }
    }

    public /* synthetic */ vp2(Object obj, long j, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = z;
    }
}
