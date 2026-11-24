// default package

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qi3 extends zk3 {
    public final /* synthetic */ mk3 c0;
    public final /* synthetic */ nk3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi3(nk3 nk3Var, nk3 nk3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, mk3 mk3Var) {
        super(nk3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = nk3Var;
        this.c0 = mk3Var;
    }

    @Override // zk3
    public final void K() {
        this.d0.presentFragment(new ct());
    }

    @Override // zk3
    public final void L() {
        nk3 nk3Var = this.d0;
        he heVar = new he(3, null, nk3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = nk3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = kt6.j(0, "step");
            Boolean bool = nk3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            fj1 fj1Var = new fj1(j);
            fj1Var.v0 = new p((Object) nk3Var, (Object) fj1Var, (Object) heVar, (byte) 8);
            nk3Var.presentFragment(fj1Var);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = nk3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{nk3Var.getUserConfig().e()} : new long[]{nk3Var.getUserConfig().e(), nk3Var.I});
            Boolean bool3 = nk3Var.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            uc5 uc5Var = new uc5(bundle);
            uc5Var.Z = new ij3(nk3Var, heVar);
            nk3Var.presentFragment(uc5Var);
        }
    }

    @Override // zk3
    public final void M(TLRPC.User user) {
        int i;
        i = ((d) this.d0).currentAccount;
        oc7.r1(i).B3(null, user, null, 0, null, false, false);
    }

    @Override // zk3
    public final boolean O() {
        return this.d0.T0 == 0;
    }

    @Override // zk3, y59
    public final void f() {
        b();
        int i = mk3.M;
        try {
            super.f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        nk3 nk3Var = this.d0;
        if (nk3Var.T0 == 15) {
            nk3Var.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // zk3, dg3
    public final void o(hg3 hg3Var) {
        int i;
        if (hg3Var.getMessage() != null) {
            nk3 nk3Var = this.d0;
            qwb qwbVar = nk3Var.getMessagesController().g4;
            long j = -hg3Var.getDialogId();
            i = ((d) nk3Var).currentAccount;
            TLRPC.TL_forumTopic f = qwbVar.f(j, k47.b2(i, hg3Var.getMessage().k, true, false));
            if (f != null) {
                if (nk3Var.n2) {
                    nk3Var.k3(hg3Var.getDialogId(), f.id, false, null);
                } else {
                    no4.n(nk3Var, -hg3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override // zk3, dg3
    public final void v(hg3 hg3Var) {
        mk3 mk3Var = this.c0;
        mk3Var.a.getClass();
        this.d0.D4(hg3Var, RecyclerView.R(hg3Var), 0.0f, mk3Var.d);
    }
}
